package com.mypurecloud.sdk.v2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.*;

public class ApiRequestBuilder<T> {
    private static ThreadLocal<DateFormat> DATE_FORMAT;
    private static final String[] EMPTY = new String[0];
    private static DateFormat initialDateFormat;

    public static void setDateFormat(final DateFormat dateFormat) {
        // Set initial date format object
        if (dateFormat != null) {
            initializeDateFormat(dateFormat);
        }

        DATE_FORMAT = new ThreadLocal<DateFormat>(){
            @Override protected DateFormat initialValue() {
                return initialDateFormat;
            }
        };
    }

    private static void initializeDateFormat(final DateFormat dateFormat) {
        initialDateFormat = dateFormat;
    }

    public static DateFormat getDateFormat() {
        // Lazy load ApiDateFormat
        synchronized (EMPTY) {
            // Initialize the source date format object
            if (initialDateFormat == null) {
                DateFormat dateFormat = new ApiDateFormat();
                dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                initializeDateFormat(dateFormat);
            }

            // Ensure date format object has a value
            if (DATE_FORMAT == null) {
                setDateFormat(null);
            }
        }

        // Return an instance for the calling thread
        return DATE_FORMAT.get();
    }

    /**
     * Format the given Date object into string.
     */
    public static String formatDate(Date date) {
        return getDateFormat().format(date);
    }

    /**
     * Format the given parameter object into string.
     */
    private static String parameterToString(Object param) {
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
    private static  List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
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
    private static boolean isJsonMime(String mime) {
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
    private static String selectHeaderAccept(String[] accepts) {
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
    private static String selectHeaderContentType(String[] contentTypes) {
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
    private static String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    public static ApiRequestBuilder<Void> create(String method, String path) {
        return new ApiRequestBuilder<>(method, path);
    }

    private final String method;
    private final String path;
    private final Map<String, String> pathParams;
    private final Map<String, Object> formParams;
    private final List<Pair> queryParams;
    private final Map<String, String> headerParams;
    private final Map<String, String> customHeaders;
    private String[] contentTypes = EMPTY;
    private String[] accepts = EMPTY;
    private T body;
    private String[] authNames = EMPTY;

    private ApiRequestBuilder(String method, String path) {
        this.method = method;
        this.path = path;
        pathParams = new HashMap<>();
        formParams = new HashMap<>();
        queryParams = new ArrayList<>();
        headerParams = new HashMap<>();
        customHeaders = new HashMap<>();
    }

    private ApiRequestBuilder(ApiRequestBuilder<?> parent, T body) {
        this.method = parent.method;
        this.path = parent.path;
        this.pathParams = parent.pathParams;
        this.formParams = parent.formParams;
        this.queryParams = parent.queryParams;
        this.headerParams = parent.headerParams;
        this.customHeaders = parent.customHeaders;
        this.contentTypes = parent.contentTypes;
        this.accepts = parent.accepts;
        this.body = body;
        this.authNames = parent.authNames;
    }

    public ApiRequestBuilder<T> withPathParameter(String name, Object value) {
        if (value != null) {
            pathParams.put(name, escapeString(value.toString()));
        }
        else {
            pathParams.remove(name);
        }
        return this;
    }

    public ApiRequestBuilder<T> withFormParameter(String name, Object value) {
        formParams.put(name, value);
        return this;
    }

    public ApiRequestBuilder<T> withQueryParameters(String name, String collectionFormat, Object value) {
        queryParams.addAll(parameterToPairs(collectionFormat, name, value));
        return this;
    }

    public ApiRequestBuilder<T> withHeaderParameter(String name, Object value) {
        if (value != null) {
            headerParams.put(name, parameterToString(value));
        }
        else {
            headerParams.remove(name);
        }
        return this;
    }

    public ApiRequestBuilder<T> withCustomHeader(String name, String value) {
        if (value != null) {
            customHeaders.put(name, value);
        }
        else {
            customHeaders.remove(name);
        }
        return this;
    }

    public ApiRequestBuilder<T> withCustomHeaders(Map<String, String> headers) {
        if (headers != null) {
            customHeaders.putAll(headers);
        }
        return this;
    }

    public ApiRequestBuilder<T> withContentTypes(String... contentTypes) {
        this.contentTypes = (contentTypes != null) ? contentTypes : EMPTY;
        return this;
    }

    public ApiRequestBuilder<T> withAccepts(String... accepts) {
        this.accepts = (accepts != null) ? accepts : EMPTY;
        return this;
    }

    public ApiRequestBuilder<T> withAuthNames(String... authNames) {
        this.authNames = (authNames != null) ? authNames : EMPTY;
        return this;
    }

    public <BODY> ApiRequestBuilder<BODY> withBody(BODY body) {
        return new ApiRequestBuilder<>(this, body);
    }

    public ApiRequest<T> build() {
        final Map<String, String> pathParams = Collections.unmodifiableMap(this.pathParams);
        final Map<String, Object> formParams = Collections.unmodifiableMap(this.formParams);
        final List<Pair> queryParams = Collections.unmodifiableList(this.queryParams);
        final Map<String, String> headerParams = Collections.unmodifiableMap(this.headerParams);
        final Map<String, String> customHeaders = Collections.unmodifiableMap(this.customHeaders);
        final String contentType = selectHeaderContentType(this.contentTypes);
        final String accepts = selectHeaderAccept(this.accepts);
        final T body = this.body;
        final String[] authNames = this.authNames;
        return new ApiRequest<T>() {
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
                return pathParams;
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
                return customHeaders;
            }

            @Override
            public String getContentType() {
                return contentType;
            }

            @Override
            public String getAccepts() {
                return accepts;
            }

            @Override
            public T getBody() {
                return body;
            }

            @Override
            public String[] getAuthNames() {
                return authNames;
            }

            @Override
            public String toString() {
                return "ApiRequest { " + method + " " + path + " }";
            }
        };
    }
}
