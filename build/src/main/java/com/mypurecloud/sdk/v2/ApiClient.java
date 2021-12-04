package com.mypurecloud.sdk.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URLEncoder;
import java.net.Proxy;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import com.mypurecloud.sdk.v2.extensions.AuthResponse;
import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.xml.bind.DatatypeConverter;

import com.google.common.util.concurrent.SettableFuture;

import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;

import com.mypurecloud.sdk.v2.auth.ApiKeyAuth;
import com.mypurecloud.sdk.v2.auth.Authentication;
import com.mypurecloud.sdk.v2.auth.OAuth;
import com.mypurecloud.sdk.v2.connector.*;
import com.mypurecloud.sdk.v2.extensions.AuthResponse;
import com.mypurecloud.sdk.v2.Logger;
import com.mypurecloud.sdk.v2.LocalDateSerializer;


public class ApiClient implements AutoCloseable {
    private static final String DEFAULT_BASE_PATH = "https://api.mypurecloud.com";
    private static final String DEFAULT_USER_AGENT = "PureCloud SDK/java";
    private static final String USER_AGENT_HEADER = "User-Agent";

    private static Map<String, Authentication> buildAuthentications() {
        Map<String, Authentication> authentications = new HashMap<>();
        authentications.put("PureCloud OAuth", new OAuth());
        authentications.put("Guest Chat JWT", new ApiKeyAuth("header", "Authorization"));

        return Collections.unmodifiableMap(authentications);
    }

    private final Map<String, String> defaultHeaderMap;
    private String basePath;
    private final Boolean shouldThrowErrors;
    private Boolean shouldRefreshAccessToken;
    private int refreshTokenWaitTime;

    private final DateFormat dateFormat;
    private final ObjectMapper objectMapper;

    private final ConnectorProperties properties;

    private final Map<String, Authentication> authentications;
    private final ApiClientConnector connector;

    private RetryConfiguration retryConfiguration;
    private LoggingConfiguration loggingConfiguration;
    private static RetryConfiguration DEFAULT_RETRY_CONFIG = new RetryConfiguration();
    // These fields are only applicable to the Code Authorization OAuth flow:
    private String clientId;
    private String clientSecret;
    private String refreshToken;
    private AtomicBoolean refreshInProgress = new AtomicBoolean(false);
    private Logger logger;
    private String configFilePath;
    private Boolean autoReloadConfig;

    public ApiClient() {
        this(Builder.standard());
    }

    private ApiClient(Builder builder) {
        String basePath = builder.basePath;
        if (basePath == null) {
            basePath = DEFAULT_BASE_PATH;
        }
        this.basePath = basePath;

        RetryConfiguration retryConfig = builder.retryConfiguration;
        if (retryConfig == null) {
            retryConfig = DEFAULT_RETRY_CONFIG;
        }
        this.retryConfiguration = retryConfig;

        this.defaultHeaderMap = new HashMap<>(builder.defaultHeaderMap);
        this.properties = builder.properties.copy();
        this.shouldThrowErrors = builder.shouldThrowErrors == null ? true : builder.shouldThrowErrors;
        this.shouldRefreshAccessToken = builder.shouldRefreshAccessToken == null ? true : builder.shouldRefreshAccessToken;
        this.refreshTokenWaitTime = builder.refreshTokenWaitTime == 0 ? 10 : builder.refreshTokenWaitTime;

        DateFormat dateFormat = builder.dateFormat;
        if (dateFormat == null) {
            dateFormat = buildDateFormat();
        }
        this.dateFormat = dateFormat;

        ObjectMapper objectMapper = builder.objectMapper;
        if (objectMapper == null) {
            objectMapper = buildObjectMapper(dateFormat);
        }
        this.objectMapper = objectMapper;

        this.authentications = buildAuthentications(builder);

        this.connector = buildHttpConnector(builder);

        Logger logger = builder.logger;

        if (logger == null) {
            logger = new Logger();
        }
        this.logger = logger;

        this.loggingConfiguration = builder.loggingConfiguration;
        if (this.loggingConfiguration != null) {
            applyLoggingConfiguration(this.loggingConfiguration);
        }
        
        String configFilePath = builder.configFilePath;
        if (configFilePath == null || configFilePath.isEmpty()) {
            String homePath = System.getProperty("user.home");
            configFilePath = Paths.get(homePath, ".genesyscloudjava", "config").toString();
        }
        this.configFilePath = configFilePath;

        this.autoReloadConfig = builder.autoReloadConfig;
    }

    @Override
    public void close() throws Exception {
        connector.close();
    }

    public static ObjectMapper buildObjectMapper(DateFormat dateFormat) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.registerModule(new JodaModule());
        objectMapper.setDateFormat(dateFormat);
        SimpleModule localDateModule = new SimpleModule();
        localDateModule.addSerializer(LocalDate.class, new LocalDateSerializer());
        localDateModule.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        objectMapper.registerModule(localDateModule);
        return objectMapper;
    }

    private DateFormat buildDateFormat() {
        return new ApiDateFormat();
    }

    private Map<String, Authentication> buildAuthentications(Builder builder) {
        Map<String, Authentication> authentications = buildAuthentications();
        String accessToken = builder.accessToken;
        for (Authentication authentication : authentications.values()) {
            if (authentication instanceof OAuth && accessToken != null) {
                ((OAuth)authentication).setAccessToken(accessToken);
            }
        }
        return authentications;
    }

    private ApiClientConnector buildHttpConnector(Builder builder) {
        return ApiClientConnectorLoader.load(properties);
    }

    public boolean getShouldThrowErrors() {
        return shouldThrowErrors;
    }

    public int getRefreshTokenWaitTime() {
        return refreshTokenWaitTime;
    }

    public void setRefreshTokenWaitTime(int refreshTokenWaitTime) {
        this.refreshTokenWaitTime = refreshTokenWaitTime;
    }

    public boolean getShouldRefreshAccessToken() {
        return shouldRefreshAccessToken;
    }

    public void setShouldRefreshAccessToken(boolean shouldRefreshAccessToken) {
        this.shouldRefreshAccessToken = shouldRefreshAccessToken;
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public String getConfigFilePath() {
        return configFilePath;
    }

    public LoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    public Logger getLogger() {
        return logger;
    }

    public boolean getAutoReloadConfig() {
        return autoReloadConfig;
    }

    public void setAutoReloadConfig(boolean autoReloadConfig) {
        this.autoReloadConfig = autoReloadConfig;
    }

    public RetryConfiguration getRetryConfiguration() {
        return retryConfiguration;
    }

    public void setRetryConfiguration(RetryConfiguration retryConfig) {
        this.retryConfiguration = retryConfig;
    }

    /**
     * Helper method to set access token for the first OAuth2 authentication.
     */
    public void setAccessToken(String accessToken) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof OAuth) {
                ((OAuth) auth).setAccessToken(accessToken);
                return;
            }
        }
        throw new RuntimeException("No OAuth2 authentication configured!");
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * Helper method to apply logging settings to logger 
     */
    private void applyLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        // Logging
        String logLevel = loggingConfiguration.getLogLevel();
        if (logLevel != null && !logLevel.isEmpty()) {
            logger.setLevel(logger.logLevelFromString(logLevel));
        }

        String logFormat = loggingConfiguration.getLogFormat();
        if (logFormat != null && !logFormat.isEmpty()) {
            logger.setFormat(logger.logFormatFromString(logFormat));
        }

        boolean logToConsole = loggingConfiguration.getLogToConsole();
        logger.setLogToConsole(logToConsole);

        String logFilePath = loggingConfiguration.getLogFilePath();
        if (logFilePath != null && !logFilePath.isEmpty()) {
            logger.setLogFilePath(logFilePath);
        }

        boolean logRequestBody = loggingConfiguration.getLogRequestBody();
        logger.setLogRequestBody(logRequestBody);

        boolean logResponseBody = loggingConfiguration.getLogResponseBody();
        logger.setLogResponseBody(logResponseBody);
    }

    /**
     * Authorizes the SDK by completing a client credentials OAuth grant
     * @param clientId The OAuth client's Client ID
     * @param clientSecret The OAuth client's Client Secret
     */
    public ApiResponse<AuthResponse> authorizeClientCredentials(String clientId, String clientSecret) throws IOException, ApiException {
        String encodedAuth = DatatypeConverter.printBase64Binary((clientId + ":" + clientSecret).getBytes("UTF-8"));
        ApiRequest<Void> request = ApiRequestBuilder.create("POST", "/oauth/token")
                .withCustomHeader("Authorization", "Basic " + encodedAuth)
                .withCustomHeader("Content-Type", "application/x-www-form-urlencoded")
                .withFormParameter("grant_type", "client_credentials")
                .build();
        
        ApiResponse<AuthResponse> response = this.getAPIResponse(request, new TypeReference<AuthResponse>() {}, true);
        
        setAccessToken(response.getBody().getAccess_token());
        // The token can only be refreshed if it's a code authorization grant
        shouldRefreshAccessToken = false;

        return response;
    }
 public ApiResponse<AuthResponse>  authorizeSaml2Bearer( String clientId, String clientSecret, String orgName, String assertion) throws IOException, ApiException {
        String encodedAuth = DatatypeConverter.printBase64Binary((clientId + ":" + clientSecret).getBytes("UTF-8"));
        ApiRequest<Void> request = ApiRequestBuilder.create("POST", "/oauth/token")
                .withCustomHeader("Authorization", "Basic " + encodedAuth)
                .withCustomHeader("Content-Type", "application/x-www-form-urlencoded")
                .withFormParameter("grant_type", "urn:ietf:params:oauth:grant-type:saml2-bearer")
                .withFormParameter("orgName", orgName)
                .withFormParameter("assertion", assertion)
                .build();
        
        ApiResponse<AuthResponse> response = this.getAPIResponse(request, new TypeReference<AuthResponse>() {}, true);
        
        setAccessToken(response.getBody().getAccess_token());
        // The token can only be refreshed if it's a code authorization grant
        shouldRefreshAccessToken = false;

        return response;
}

    public ApiResponse<AuthResponse> authorizeCodeAuthorization(String clientId, String clientSecret, String authCode, String redirectUri) throws IOException, ApiException {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        String encodedAuth = DatatypeConverter.printBase64Binary((clientId + ":" + clientSecret).getBytes("UTF-8"));
        ApiRequest<Void> request = ApiRequestBuilder.create("POST", "/oauth/token")
                .withCustomHeader("Authorization", "Basic " + encodedAuth)
                .withCustomHeader("Content-Type", "application/x-www-form-urlencoded")
                .withFormParameter("grant_type", "authorization_code")
                .withFormParameter("code", authCode)
                .withFormParameter("redirect_uri", redirectUri)
                .build();
        
        ApiResponse<AuthResponse> response = this.getAPIResponse(request, new TypeReference<AuthResponse>() {}, true);
        
        setAccessToken(response.getBody().getAccess_token());
        this.refreshToken = response.getBody().getRefresh_token();

        return response;
    }

    public ApiResponse<AuthResponse> refreshCodeAuthorization(String clientId, String clientSecret, String refreshToken) throws IOException, ApiException {
        String encodedAuth = DatatypeConverter.printBase64Binary((clientId + ":" + clientSecret).getBytes("UTF-8"));
        ApiRequest<Void> request = ApiRequestBuilder.create("POST", "/oauth/token")
                .withCustomHeader("Authorization", "Basic " + encodedAuth)
                .withCustomHeader("Content-Type", "application/x-www-form-urlencoded")
                .withFormParameter("grant_type", "refresh_token")
                .withFormParameter("refresh_token", refreshToken)
                .build();

        ApiResponse<AuthResponse> response = this.getAPIResponse(request, new TypeReference<AuthResponse>() {}, true);
        setAccessToken(response.getBody().getAccess_token());
        this.refreshToken = response.getBody().getRefresh_token();

        return response;
    }

    private ApiResponse<AuthResponse> refreshCodeAuthorization() throws IOException, ApiException {
        return this.refreshCodeAuthorization(this.clientId, this.clientSecret, this.refreshToken);
    }

    /**
     * Connect timeout (in milliseconds).
     */
    public int getConnectTimeout() {
        return properties.getProperty(ApiClientConnectorProperty.CONNECTION_TIMEOUT, Integer.class, 0);
    }

    /**
     * Parse the given string into Date object.
     */
    public Date parseDate(String str) {
        try {
            synchronized (dateFormat) {
                return dateFormat.parse(str);
            }
        } catch (java.text.ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Format the given Date object into string.
     */
    public String formatDate(Date date) {
        synchronized (dateFormat) {
            return dateFormat.format(date);
        }
    }

    /**
     * Format the given parameter object into string.
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date) {
            return formatDate((Date) param);
        } else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for(Object o : (Collection<?>)param) {
                if(b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /*
      Format to {@code Pair} objects.
    */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null) return params;

        Collection<?> valueCollection = null;
        if (value instanceof Collection<?>) {
            valueCollection = (Collection<?>) value;
        } else {
            params.add(new Pair(name, parameterToString(value)));
            return params;
        }

        if (valueCollection.isEmpty()){
            return params;
        }

        // get the collection format
        collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default: csv

        // create the params based on the collection format
        if (collectionFormat.equals("multi")) {
            for (Object item : valueCollection) {
                params.add(new Pair(name, parameterToString(item)));
            }

            return params;
        }

        String delimiter = ",";

        if (collectionFormat.equals("csv")) {
            delimiter = ",";
        } else if (collectionFormat.equals("ssv")) {
            delimiter = " ";
        } else if (collectionFormat.equals("tsv")) {
            delimiter = "\t";
        } else if (collectionFormat.equals("pipes")) {
            delimiter = "|";
        }

        StringBuilder sb = new StringBuilder() ;
        for (Object item : valueCollection) {
            sb.append(delimiter);
            sb.append(parameterToString(item));
        }

        params.add(new Pair(name, sb.substring(1)));

        return params;
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     */
    public boolean isJsonMime(String mime) {
        return mime != null && mime.matches("(?i)application\\/json(;.*)?");
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *   if JSON exists in the given array, use it;
     *   otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     *   null will be returned (not to set the Accept header explicitly).
     */
    public String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return StringUtil.join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     *   if JSON exists in the given array, use it;
     *   otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     *   JSON will be used.
     */
    public String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0) {
            return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    /**
     * Escape the given string to be used as URL query value.
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

/**
     * Serialize the given Java object into string according the given
     * Content-Type (only JSON is supported for now).
     */
    public String serialize(Object obj) throws IOException {
        return objectMapper.writeValueAsString(obj);
    }

    /**
     * Deserialize the string into the provided type
     * 
     * @param obj the string to deserialize
     * @param type the target type for deserialization
     */
    public <T> T deserialize(String obj, Class<T> type) throws IOException {
        return objectMapper.readValue(obj, type);
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @return The full URL
     */
    private String buildUrl(String path, Map<String, String> pathParams, List<Pair> queryParams, boolean isAuthRequest) {
        path = path.replaceAll("\\{format\\}", "json");
        if (pathParams != null && !pathParams.isEmpty()) {
            for (Map.Entry<String, String> entry : pathParams.entrySet()) {
                path = path.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue());
            }
        }

        final StringBuilder url = new StringBuilder();
        if (isAuthRequest) {
            String[] parts = basePath.split("\\.", 2);
            url.append("https://login.").append(parts[1]).append(path);
        } else {
            url.append(basePath).append(path);
        }

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Pair param : queryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getName())).append("=").append(escapeString(value));
                }
            }
        }

        return url.toString();
    }

    private ApiClientConnectorRequest prepareConnectorRequest(final ApiRequest<?> request, boolean isAuthRequest) throws IOException {
        final String path = request.getPath();
        final List<Pair> queryParams = new ArrayList<>(request.getQueryParams());

        // Add headers
        final Map<String, String> headers = new HashMap<>();
        String accept = request.getAccepts();
        if (accept != null && !accept.isEmpty()) {
            headers.put("Accept", accept);
        }
        String contentType = request.getContentType();
        if (contentType != null && !contentType.isEmpty()) {
            headers.put("Content-Type", contentType);
        }
        Map<String, String> headerParams = request.getHeaderParams();
        if (headerParams != null && !headerParams.isEmpty()) {
            for (Map.Entry<String, String> headerParam : headerParams.entrySet()) {
                headers.put(headerParam.getKey(), headerParam.getValue());
            }
        }
        Map<String, String> customHeaders = request.getCustomHeaders();
        if (customHeaders != null && !customHeaders.isEmpty()) {
            for (Map.Entry<String, String> customHeader : customHeaders.entrySet()) {
                headers.put(customHeader.getKey(), customHeader.getValue());
            }
        }
        for (Map.Entry<String, String> defaultHeader : defaultHeaderMap.entrySet()) {
            if (!headers.containsKey(defaultHeader.getKey()))
                headers.put(defaultHeader.getKey(), defaultHeader.getValue());
        }

        updateParamsForAuth(request.getAuthNames(), queryParams, headers);
        final String url = buildUrl(path, request.getPathParams(), queryParams, isAuthRequest);

        final Object body = request.getBody();
        final Map<String, Object> formParams = request.getFormParams();
        final String serializedBody;
        if (body != null && !formParams.isEmpty()) {
            throw new IllegalStateException("Request cannot have both form and body parameters.");
        }
        else if (body != null) {
            serializedBody = serialize(body);
        }
        else if (formParams != null) {
            serializedBody = getXWWWFormUrlencodedParams(formParams);
        }
        else {
            serializedBody = null;
        }

        return new ApiClientConnectorRequest() {
            @Override
            public String getMethod() {
                return request.getMethod();
            }

            @Override
            public String getUrl() {
                return url;
            }

            @Override
            public Map<String, String> getHeaders() {
                return headers;
            }

            @Override
            public boolean hasBody() {
                return (serializedBody != null);
            }

            @Override
            public String readBody() throws IOException {
                return serializedBody;
            }

            @Override
            public InputStream getBody() throws IOException {
                return (serializedBody != null) ? new ByteArrayInputStream(serializedBody.getBytes("UTF8")) : null;
            }
        };
    }

    private <T> ApiResponse<T> interpretConnectorResponse(ApiClientConnectorResponse response, TypeReference<T> returnType) throws ApiException, IOException {
        int statusCode = response.getStatusCode();
        String reasonPhrase = response.getStatusReasonPhrase();
        Map<String, String> headers = response.getHeaders();

        if (statusCode >= 200 && statusCode < 300) {
            String body = null;
            T entity = null;
            if (statusCode != 204 && returnType != null && returnType.getType() != Void.class && response.hasBody()) {
                body = response.readBody();
                if (body != null && body.length() > 0 && returnType.getType() == String.class) {
                    entity = (T)body;
                } else if (body != null && body.length() > 0) {
                    entity = objectMapper.readValue(body, returnType);
                }
            }
            return new ApiResponseWrapper<>(statusCode, reasonPhrase, headers, body, entity);
        }
        else {
            String message = "error";
            String body = response.readBody();
            throw new ApiException(statusCode, message, headers, body);
        }
    }

    private void handleExpiredAccessToken() throws IOException, ApiException {
        // Attempt to refresh the access_token if a refresh isn't in progress and lock any other threads out of the method
        if (refreshInProgress.compareAndSet(false, true)) {
            try {
                ApiResponse<AuthResponse> refreshResponse = this.refreshCodeAuthorization();
                if (refreshResponse.getStatusCode() != 200) {
                    String message = "error";
                    throw new ApiException(refreshResponse.getStatusCode(), message, refreshResponse.getHeaders(), refreshResponse.getRawBody());
                }
            } finally {
                refreshInProgress.set(false);
            }
        } else {
            long startTime = timeSinceEpoch();
            int sleepDuration = 200;
            // Sleep for 200ms at a time for a maximum of refreshTokenWaitTime for other thread to complete refresh
            while (timeSinceEpoch() - startTime < refreshTokenWaitTime) {
                try {
                    Thread.sleep(sleepDuration);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                if (!refreshInProgress.get())
                    return;
            }
            // Abort with error if we have waited refreshTokenWaitTime and refresh still isn't complete
            throw new ApiException(new Exception("Token refresh took longer than " + refreshTokenWaitTime + " seconds"));
        }
    }

    private long timeSinceEpoch() {
        return System.currentTimeMillis() / 1000l;
    }

    private <T> ApiResponse<T> getAPIResponse(ApiRequest<?> request, TypeReference<T> returnType, boolean isAuthRequest) throws IOException, ApiException {
        ApiClientConnectorRequest connectorRequest = prepareConnectorRequest(request, isAuthRequest);
        ApiClientConnectorResponse connectorResponse = null;
        Map<String,String> requestHeaderCopy = new HashMap<>(connectorRequest.getHeaders());
        try {
            Retry retry = new Retry(retryConfiguration);
            do {
                connectorResponse = connector.invoke(connectorRequest);
                // copy unmodifiable maps to make modifiable
                Map<String,String> responseHeaderCopy = new HashMap<>(connectorResponse.getHeaders());
                logger.debug(connectorRequest.getMethod(), connectorRequest.getUrl(), connectorRequest.readBody(), connectorResponse.getStatusCode(), requestHeaderCopy);
                logger.trace(connectorRequest.getMethod(), connectorRequest.getUrl(), connectorRequest.readBody(), connectorResponse.getStatusCode(), requestHeaderCopy, responseHeaderCopy);
            } while (retry.shouldRetry(connectorResponse));
            try {
                return interpretConnectorResponse(connectorResponse, returnType);
            } catch (ApiException e) {
                if (e.getStatusCode() == 401 && shouldRefreshAccessToken) {
                    handleExpiredAccessToken();
                    return getAPIResponse(request, returnType, isAuthRequest);
                } else if (e.getStatusCode() < 200 || e.getStatusCode() >= 300) {
                    Map<String,String> responseHeaderCopy = new HashMap<>(e.getHeaders());
                    logger.error(connectorRequest.getMethod(), connectorRequest.getUrl(), connectorRequest.readBody(), e.getRawBody(), e.getStatusCode(), requestHeaderCopy, responseHeaderCopy);
                    throw e;
                } else {
                    throw e;
                }
            }
        } finally {
            if (connectorResponse != null) {
                try {
                    connectorResponse.close();
                } catch (Throwable exception) {
                    throw new RuntimeException(exception);
                }
            }
        }
    }

    private <T> Future<ApiResponse<T>> getAPIResponseAsync(ApiRequest<?> request, final TypeReference<T> returnType, final AsyncApiCallback<ApiResponse<T>> callback) {
        final SettableFuture<ApiResponse<T>> future = SettableFuture.create();
        try {
            ApiClientConnectorRequest connectorRequest = prepareConnectorRequest(request, false);
            Retry retry = new Retry(retryConfiguration);
            getAPIResponseAsyncWithRetry(connectorRequest, returnType, callback, retry, future);
        } catch (Throwable exception) {
            notifyFailure(future, callback, exception);
        }
        return future;
    }

    private <T> void getAPIResponseAsyncWithRetry(final ApiClientConnectorRequest connectorRequest,
                                                  final TypeReference<T> returnType,
                                                  final AsyncApiCallback<ApiResponse<T>> callback,
                                                  final Retry retry,
                                                  final SettableFuture<ApiResponse<T>> future) {
        try {
            connector.invokeAsync(connectorRequest, new AsyncApiCallback<ApiClientConnectorResponse>() {
                @Override
                public void onCompleted(ApiClientConnectorResponse connectorResponse) {
                    try {
                        ApiResponse<T> response = null;
                        if (!retry.shouldRetry(connectorResponse)) {
                            try {
                                response = interpretConnectorResponse(connectorResponse, returnType);
                            } catch (ApiException e) {
                                if (e.getStatusCode() == 401 && shouldRefreshAccessToken) {
                                    handleExpiredAccessToken();
                                    getAPIResponseAsyncWithRetry(connectorRequest, returnType, callback, new Retry(retryConfiguration), future);
                                } else {
                                    throw e;
                                }
                            } finally {
                                connectorResponse.close();
                            }
                            notifySuccess(future, callback, response);
                            return;
                        }
                        getAPIResponseAsyncWithRetry(connectorRequest, returnType, callback, retry, future);

                    } catch (Throwable exception) {
                        notifyFailure(future, callback, exception);
                    }
                }

                @Override
                public void onFailed(Throwable exception) {
                    notifyFailure(future, callback, exception);
                }
            });
        } catch (Throwable exception) {
            notifyFailure(future, callback, exception);
        }
    }

    private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
        if (callback != null) {
            try {
                callback.onCompleted(result);
                future.set(result);
            }
            catch (Throwable exception) {
                future.setException(exception);
            }
        }
        else {
            future.set(result);
        }
    }

    private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
        if (callback != null) {
            try {
                callback.onFailed(exception);
                future.setException(exception);
            }
            catch (Throwable callbackException) {
                future.setException(callbackException);
            }
        }
        else {
            future.setException(exception);
        }
    }

    public <T> ApiResponse<T> invoke(ApiRequest<?> request, TypeReference<T> returnType) throws ApiException, IOException {
        return getAPIResponse(request, returnType, false);
    }

    public <T> Future<ApiResponse<T>> invokeAsync(ApiRequest<?> request, TypeReference<T> returnType, AsyncApiCallback<ApiResponse<T>> callback) {
        return getAPIResponseAsync(request, returnType, callback);
    }

    /**
     * Update query and header parameters based on authentication settings.
     *
     * @param authNames The authentications to apply
     */
    private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
        for (String authName : authNames) {
            Authentication auth = authentications.get(authName);
            if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
            auth.applyToParams(queryParams, headerParams);
        }
    }

    /**
     * Encode the given form parameters as request body.
     */
    private String getXWWWFormUrlencodedParams(Map<String, Object> formParams) {
        StringBuilder formParamBuilder = new StringBuilder();

        for (Entry<String, Object> param : formParams.entrySet()) {
            String valueStr = parameterToString(param.getValue());
            try {
                formParamBuilder.append(URLEncoder.encode(param.getKey(), "utf8"))
                        .append("=")
                        .append(URLEncoder.encode(valueStr, "utf8"));
                formParamBuilder.append("&");
            } catch (UnsupportedEncodingException e) {
                // move on to next
            }
        }

        String encodedFormParams = formParamBuilder.toString();
        if (encodedFormParams.endsWith("&")) {
            encodedFormParams = encodedFormParams.substring(0, encodedFormParams.length() - 1);
        }

        return encodedFormParams;
    }

    public static class Builder {
        public static Builder standard() {
            return new Builder(new ConnectorProperties());
        }

        public static Builder from(ApiClient client) {
            if (client == null) {
                throw new NullPointerException();
            }
            Builder builder = new Builder(client.properties);
            builder.defaultHeaderMap.putAll(client.defaultHeaderMap);
            for (Authentication authentication : client.authentications.values()) {
                if (authentication instanceof OAuth) {
                    builder.accessToken = ((OAuth)authentication).getAccessToken();
                }
            }
            builder.dateFormat = client.dateFormat;
            builder.objectMapper = client.objectMapper;
            builder.basePath = client.basePath;
            builder.retryConfiguration = client.retryConfiguration;
            builder.loggingConfiguration = client.loggingConfiguration;
            builder.shouldThrowErrors = client.shouldThrowErrors;
            builder.shouldRefreshAccessToken = client.shouldRefreshAccessToken;
            builder.refreshTokenWaitTime = client.refreshTokenWaitTime;
            builder.logger = client.logger;
            builder.configFilePath = client.configFilePath;
            builder.autoReloadConfig = client.autoReloadConfig;
            return builder;
        }

        public static ApiClient defaultClient() {
            return standard().build();
        }

        private final Map<String, String> defaultHeaderMap = new HashMap<>();
        private final ConnectorProperties properties;
        private String accessToken;
        private ObjectMapper objectMapper;
        private DateFormat dateFormat;
        private String basePath;
        private RetryConfiguration retryConfiguration;
        private LoggingConfiguration loggingConfiguration;
        private Boolean shouldThrowErrors = true;
        private Boolean shouldRefreshAccessToken = true;
        private int refreshTokenWaitTime = 10;
        private Logger logger = null;
        private String configFilePath = null;
        private Boolean autoReloadConfig = true;

        private Builder(ConnectorProperties properties) {
            this.properties = (properties != null) ? properties.copy() : new ConnectorProperties();
            withUserAgent(DEFAULT_USER_AGENT);
            withDefaultHeader("purecloud-sdk", "141.0.0");
        }

        public Builder withDefaultHeader(String header, String value) {
            defaultHeaderMap.put(header, value);
            return this;
        }

        public Builder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            shouldRefreshAccessToken = false; 
            return this;
        }

        public Builder withUserAgent(String userAgent) {
            return withDefaultHeader(USER_AGENT_HEADER, userAgent);
        }

        public Builder withObjectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public Builder withDateFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder withBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
         public Builder withBasePath(PureCloudRegionHosts region){
            this.basePath = region.getApiHost();
            return this;
        }

        public Builder withRetryConfiguration(RetryConfiguration retryConfiguration) {
        this.retryConfiguration = retryConfiguration;
        return this;
        }

        public Builder withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder withHttpRequestInterceptor(HttpRequestInterceptor interceptor) {
            properties.setProperty(ApiClientConnectorProperty.HTTP_REQUEST_INTERCEPTOR, interceptor);
            return this;
        }

        public Builder withHttpResponseInterceptor(HttpResponseInterceptor interceptor) {
            properties.setProperty(ApiClientConnectorProperty.HTTP_RESPONSE_INTERCEPTOR, interceptor);
            return this;
        }

        public Builder withConnectionTimeout(int connectionTimeout) {
            properties.setProperty(ApiClientConnectorProperty.CONNECTION_TIMEOUT, connectionTimeout);
            return this;
        }

        public Builder withShouldThrowErrors(boolean shouldThrowErrors) {
            this.shouldThrowErrors = shouldThrowErrors;
            return this;
        }

        public Builder withShouldRefreshAccessToken(boolean shouldRefreshAccessToken) {
            this.shouldRefreshAccessToken = shouldRefreshAccessToken;
            return this;
        }

        public Builder withRefreshTokenWaitTime(int refreshTokenWaitTime) {
            this.refreshTokenWaitTime = refreshTokenWaitTime;
            return this;
        }

        public Builder withDetailLevel(DetailLevel detailLevel) {
            properties.setProperty(ApiClientConnectorProperty.DETAIL_LEVEL, detailLevel);
            return this;
        }

        public Builder withProxy(Proxy proxy) {
            properties.setProperty(ApiClientConnectorProperty.PROXY, proxy);
            return this;
        }

        public Builder withAuthenticatedProxy(Proxy proxy, String user, String pass) {
            withProxy(proxy);
            properties.setProperty(ApiClientConnectorProperty.PROXY_USER, user);
            properties.setProperty(ApiClientConnectorProperty.PROXY_PASS, pass);
            return this;
        }

        public Builder withProperty(String name, Object value) {
            properties.setProperty(name, value);
            return this;
        }

        public Builder withConfigFilePath(String configFilePath) {
            this.configFilePath = configFilePath;
            return this;
        }

        public Builder withAutoReloadConfig(boolean autoReloadConfig) {
            this.autoReloadConfig = autoReloadConfig;
            return this;
        }

        public ApiClient build() {
            return new ApiClient(this);
        }
    }

    private static class ConnectorProperties implements ApiClientConnectorProperties {
        private final Map<String, Object> properties;

        public ConnectorProperties() {
            this.properties = new HashMap<>();
        }

        public ConnectorProperties(Map<String, Object> properties) {
            this.properties = new HashMap<>();
            if (properties != null) {
                this.properties.putAll(properties);
            }
        }

        @Override
        public <T> T getProperty(String key, Class<T> propertyClass, T defaultValue) {
            Object value = properties.get(key);
            if (propertyClass.isInstance(value)) {
                return propertyClass.cast(value);
            }
            return defaultValue;
        }

        public void setProperty(String key, Object value) {
            if (key != null) {
                if (value != null) {
                    properties.put(key, value);
                }
                else {
                    properties.remove(key);
                }
            }
        }

        public ConnectorProperties copy() {
            return new ConnectorProperties(properties);
        }
    }

    private static class ApiRequestWrapper<T> implements ApiRequest<T> {
        private final String path;
        private final String method;
        private final List<Pair> queryParams;
        private final T body;
        private final Map<String, String> headerParams;
        private final Map<String, Object> formParams;
        private final String accept;
        private final String contentType;
        private final String[] authNames;

        public ApiRequestWrapper(String path, String method, List<Pair> queryParams, T body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames) {
            this.path = path;
            this.method = method;
            this.queryParams = queryParams;
            this.body = body;
            this.headerParams = headerParams;
            this.formParams = formParams;
            this.accept = accept;
            this.contentType = contentType;
            this.authNames = authNames;
        }

        @Override
        public String getPath() {
            return path;
        }

        @Override
        public String getMethod() {
            return method;
        }

        @Override
        public Map<String, String> getPathParams() {
            return Collections.emptyMap();
        }

        @Override
        public List<Pair> getQueryParams() {
            return queryParams;
        }

        @Override
        public Map<String, Object> getFormParams() {
            return formParams;
        }

        @Override
        public Map<String, String> getHeaderParams() {
            return headerParams;
        }

        @Override
        public Map<String, String> getCustomHeaders() {
            return Collections.emptyMap();
        }

        @Override
        public String getContentType() {
            return contentType;
        }

        @Override
        public String getAccepts() {
            return accept;
        }

        @Override
        public T getBody() {
            return body;
        }

        @Override
        public String[] getAuthNames() {
            return authNames;
        }
    }

    private static class ApiResponseWrapper<T> implements ApiResponse<T> {
        private final int statusCode;
        private final String reasonPhrase;
        private final Map<String, String> headers;
        private final String body;
        private final T entity;

        public ApiResponseWrapper(int statusCode, String reasonPhrase, Map<String, String> headers, String body, T entity) {
            this.statusCode = statusCode;
            this.reasonPhrase = reasonPhrase;
            Map<String, String> caseInsensitiveMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
            caseInsensitiveMap.putAll(headers);
            this.headers = Collections.unmodifiableMap(caseInsensitiveMap);
            this.body = body;
            this.entity = entity;
        }

        @Override
        public Exception getException() {
            return null;
        }

        @Override
        public int getStatusCode() {
            return statusCode;
        }

        @Override
        public String getStatusReasonPhrase() {
            return reasonPhrase;
        }

        @Override
        public boolean hasRawBody() {
            return (body != null && !body.isEmpty());
        }

        @Override
        public String getRawBody() {
            return body;
        }

        @Override
        public T getBody() {
            return entity;
        }

        @Override
        public Map<String, String> getHeaders() {
            return headers;
        }

        @Override
        public String getHeader(String key) {
            return headers.get(key);
        }

        @Override
        public String getCorrelationId() {
            return headers.get("ININ-Correlation-ID");
        }

        @Override
        public void close() throws Exception { }
    }

    public static class RetryConfiguration {
        private long backoffIntervalMs = 300000L;
        private long retryAfterDefaultMs = 3000L;
        private int maxRetryTimeSec = 0;
        private int maxRetriesBeforeBackoff = 5;
        private int retryMax = 5;

        public void setBackoffIntervalMs(long backoffIntervalMs) {
            if (backoffIntervalMs < 0) {
                throw new IllegalArgumentException("backoffIntervalMs should be a positive integer");
            }
            this.backoffIntervalMs = backoffIntervalMs;
        }

        public void setRetryAfterDefaultMs(long retryAfterDefaultMs) {
            if (retryAfterDefaultMs < 0) {
                throw new IllegalArgumentException("retryAfterDefaultMs should be a positive integer");
            }
            this.retryAfterDefaultMs = retryAfterDefaultMs;
        }

        public void setMaxRetryTimeSec(int maxRetryTimeSec) {
            if (maxRetryTimeSec < 0) {
                throw new IllegalArgumentException("maxRetryTimeSec should be a positive integer");
            }
            this.maxRetryTimeSec = maxRetryTimeSec;
        }

        public void setMaxRetriesBeforeBackoff(int maxRetriesBeforeBackoff) {
            if (maxRetriesBeforeBackoff < 0) {
                throw new IllegalArgumentException("maxRetriesBeforeBackoff can not be a negative integer");
            }
            this.maxRetriesBeforeBackoff = maxRetriesBeforeBackoff;
        }

        public void setRetryMax(int retryMax) {
            if (retryMax < 0) {
                throw new IllegalArgumentException("retryMax should be a positive integer");
            }
            this.retryMax = retryMax;
        }
    }

    public static class LoggingConfiguration {
        private String logLevel = "none";
        private String logFilePath = null;
        private String logFormat = "text";
        private Boolean logToConsole = true;
        private Boolean logRequestBody = false;
        private Boolean logResponseBody = false;

        public void setLogLevel(String logLevel) {
            List<String> validArguments = Arrays.asList("trace", "debug", "error", "none");
            String match = validArguments.stream()
                .filter(validArgument -> logLevel.trim().equalsIgnoreCase(validArgument))
                .findFirst()
                .orElse(null);
            if (match == null)
                throw new IllegalArgumentException("logLevel should be one of \"trace\", \"debug\", \"error\", or \"none\"");
            this.logLevel = logLevel.trim();
        }

        public void setLogFormat(String logFormat) {
            List<String> validArguments = Arrays.asList("json", "text");
            String match = validArguments.stream()
                .filter(validArgument -> logFormat.trim().equalsIgnoreCase(validArgument))
                .findFirst()
                .orElse(null);
            if (match == null)
                throw new IllegalArgumentException("logFormat should be one of \"json\" or \"text\"");
            this.logFormat = logFormat.trim();
        }

        public void setLogFilePath(String logFilePath) {
            this.logFilePath = logFilePath;
        }

        public void setLogToConsole(boolean logToConsole) {
            this.logToConsole = logToConsole;
        }

        public void setLogRequestBody(boolean logRequestBody) {
            this.logRequestBody = logRequestBody;
        }

        public void setLogResponseBody(boolean logResponseBody) {
            this.logResponseBody = logResponseBody;
        }

        public String getLogLevel() {
            return logLevel;
        }

        public String getLogFormat() {
            return logFormat;
        }

        public boolean getLogToConsole() {
            return logToConsole;
        }

        public boolean getLogRequestBody() {
            return logRequestBody;
        }

        public boolean getLogResponseBody() {
            return logResponseBody;
        }

        public String getLogFilePath() {
            return logFilePath;
        }
    }


    public static class Retry {
        private long backoffIntervalMs;
        private long retryAfterDefaultMs;
        private int maxRetryTimeSec;
        private int maxRetriesBeforeBackoff;
        private int retryCountBeforeBackOff = 0;
        private int retryMax = 5;
        private int retryCount;
        private long retryAfterMs;
        private Stopwatch stopwatch = null;

        private final List<Integer> statusCodes = Arrays.asList(429, 502, 503, 504);

        public Retry(RetryConfiguration retryConfiguration) {
            this.backoffIntervalMs = retryConfiguration.backoffIntervalMs;
            this.retryAfterDefaultMs = retryConfiguration.retryAfterDefaultMs;
            this.maxRetryTimeSec = retryConfiguration.maxRetryTimeSec;
            this.maxRetriesBeforeBackoff = retryConfiguration.maxRetriesBeforeBackoff;
            this.retryMax = retryConfiguration.retryMax;
            stopwatch = Stopwatch.createStarted();
        }

        public boolean shouldRetry(ApiClientConnectorResponse connectorResponse) {
            if (stopwatch.elapsed(TimeUnit.MILLISECONDS) < maxRetryTimeSec * 1000L && statusCodes.contains(connectorResponse.getStatusCode()) && retryCount <= retryMax) {

                if (connectorResponse.getHeaders().containsKey("Retry-After")) {
                    retryAfterMs = Integer.parseInt(connectorResponse.getHeaders().getOrDefault("Retry-After", "3")) * 1000L;
                } else {
                    retryAfterMs = retryAfterDefaultMs;
                }
                //If status code is 429 then wait until retry-after time and retry. OR If status code is retryable then for the first 5 times: wait until retry-after time and retry.
                if (connectorResponse.getStatusCode() == 429 || retryCountBeforeBackOff++ < maxRetriesBeforeBackoff) {
                    retryCount++;
                    return waitBeforeRetry(retryAfterMs);
                }

                //If status code is 50x then wait for every 3 Sec and retry until 5 minutes then after wait for every 9 Sec and retry until next 5 minutes afterwards wait for every 27 Sec and retry.
                return waitBeforeRetry(getWaitTimeExp(Math.min(3, Math.floor(stopwatch.elapsed(TimeUnit.MILLISECONDS) / backoffIntervalMs) + 1)));

            }
            stopwatch.stop();
            return false;
        }

        private boolean waitBeforeRetry(long retryAfterMs){
            try {
                Thread.sleep(retryAfterMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return true;
        }

        private long getWaitTimeExp(double bucketCount) {
            return (long) Math.pow(3, bucketCount) * 1000L;
        }
    }
}
