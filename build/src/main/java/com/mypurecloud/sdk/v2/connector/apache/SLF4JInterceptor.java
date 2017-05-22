package com.mypurecloud.sdk.v2.connector.apache;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mypurecloud.sdk.v2.DetailLevel;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>A filter that logs both requests and responses to SLF4J.
 * 
 * <h1>Available detail levels</h2>
 * <ul>
 * <li>NONE - don't log anything
 * <li>MINIMAL - only log the verb, url, and response code
 * <li>HEADERS - as above, but also log all the headers for both the request and response
 * <li>FULL - as above, but also log the full body for both the request and response
 */
public class SLF4JInterceptor implements HttpRequestInterceptor, HttpResponseInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(SLF4JInterceptor.class);
    
    // Attribute for tracking requests and responses
    private static final String SLF4J_REQUEST_DATA = "slf4j-request-data";
    
    private volatile DetailLevel detailLevel;
    
    public SLF4JInterceptor() {
        this(DetailLevel.MINIMAL);
    }
    
    public SLF4JInterceptor(DetailLevel detailLevel) {
        this.detailLevel = detailLevel;
    }
    
    /**
     * @return the current detail level of the filter
     */
    public DetailLevel getDetailLevel() {
        return detailLevel;
    }
    
    /**
     * Sets the detail level
     * @param detailLevel - the new detail level to use
     */
    public void setDetailLevel(DetailLevel detailLevel) {
        this.detailLevel = detailLevel;
    }
    
    
    private static class RequestData {
        public final RequestLine requestLine;
        public final long startTime;
        
        private RequestData(RequestLine requestLine, long startTime) {
            this.requestLine = requestLine;
            this.startTime = startTime;
        }
    }

    @Override
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
        if (LOGGER.isDebugEnabled()) {
            
            RequestData requestData = new RequestData(request.getRequestLine(), System.currentTimeMillis());
            context.setAttribute(SLF4J_REQUEST_DATA, requestData);
            
            logRequest(request);
        }
    }

    @Override
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {
        if (LOGGER.isDebugEnabled()) {
            
            RequestLine requestLine;
            long tookMs;
            
            Object reqDataAttr = context.getAttribute(SLF4J_REQUEST_DATA);
            if (reqDataAttr == null || !(reqDataAttr instanceof RequestData)) {
                LOGGER.error("Could not determine the request associated with this response");
                requestLine = new BasicRequestLine("<UNKNOWN METHOD>", "<UNKNOWN URL>", null);
                tookMs = -1;
            } else {
                RequestData requestData = (RequestData) reqDataAttr;
                requestLine = requestData.requestLine;
                tookMs = System.currentTimeMillis() - requestData.startTime;
            }
            
            logResponse(response, requestLine, tookMs);
        }
    }
    
    /**
     * Builds the log message for requests
     * 
     * <pre>
     * >>>> GET http://api.example.com/endpoint >>>>
     * ---- HEADERS ----
     * Header-1: Value1
     * Header-2: Value2
     * ---- BODY (24-bytes) ----
     * Body body body body body
     * >>>> END >>>>
     * </pre>
     * 
     * @param request - the request to build a message for
     */
    private void logRequest(HttpRequest request) throws IOException {
        if (detailLevel.compareTo(DetailLevel.MINIMAL) >= 0) {
            final StringBuilder messageBuilder = new StringBuilder();
            
            // Log the verb and url
            String uriString = String.format(">>>> %s %s >>>>", request.getRequestLine().getMethod(), request.getRequestLine().getUri());
            messageBuilder.append(uriString).append(System.lineSeparator());
            
            // Add the headers
            if (detailLevel.compareTo(DetailLevel.HEADERS) >= 0) {
                messageBuilder.append("---- HEADERS ----").append(System.lineSeparator());
                messageBuilder.append(formatHeaders(request.getAllHeaders()));
            
                // Add the request body if it exists
                if (detailLevel.compareTo(DetailLevel.FULL) >= 0) {
                    // This is ugly, but it's the only way to access the body
                    if (request instanceof HttpEntityEnclosingRequest &&
                            ((HttpEntityEnclosingRequest) request).getEntity() != null) {
                        byte[] data = extractRequestBody((HttpEntityEnclosingRequest) request);
                        
                        messageBuilder.append(String.format("---- BODY (%d bytes) ----", data.length)).append(System.lineSeparator());
                        messageBuilder.append(new String(data)).append(System.lineSeparator());
                    } else {
                        messageBuilder.append("---- NO BODY ----").append(System.lineSeparator());
                    }
                }
                
                messageBuilder.append(">>>> END >>>>").append(System.lineSeparator());
            }
            
            LOGGER.debug(messageBuilder.toString());
        }
    }
    
    /**
     * Builds the log message for responses
     * 
     * <pre>
     * <<<< GET http://api.example.com/endpoint <<<<
     * 404 Not Found  (219 ms)
     * ---- HEADERS ----
     * Header-3: Value3
     * Header-4: Value4
     * ---- NO BODY ----
     * <<<< END <<<<
     * </pre>
     * 
     * @param response - the response to build a message for
     * @param requestLine - the request line of the initial request for the response
     * @param tookMs - how long the request took, in milliseconds
     */
    private void logResponse(HttpResponse response, RequestLine requestLine, long tookMs) throws IOException {
        if (detailLevel.compareTo(DetailLevel.MINIMAL) >= 0) {
            StringBuilder messageBuilder = new StringBuilder();
            
            // Log the verb and url, along with the status code
            String uriString = String.format("<<<< %s %s <<<<", requestLine.getMethod(), requestLine.getUri());
            messageBuilder.append(uriString).append(System.lineSeparator());
            messageBuilder.append(String.format("     %d %s  (%d ms)",
                    response.getStatusLine().getStatusCode(),
                    response.getStatusLine().getReasonPhrase(),
                    tookMs))
                .append(System.lineSeparator());
            
            
            // Append the headers
            if (detailLevel.compareTo(DetailLevel.HEADERS) >= 0) {
                messageBuilder.append("---- HEADERS ----").append(System.lineSeparator());
                messageBuilder.append(formatHeaders(response.getAllHeaders()));
                
                // Add the response body if it exists
                if (detailLevel.compareTo(DetailLevel.FULL) >= 0) {
                    // Write the log message
                    if (response.getEntity() != null) {
                        byte[] responseBody = extractResponseBody(response);
                        
                        messageBuilder.append(String.format("---- BODY (%d bytes) ----", responseBody.length)).append(System.lineSeparator());
                        messageBuilder.append(new String(responseBody)).append(System.lineSeparator());
                    } else {
                        messageBuilder.append("---- NO BODY ----").append(System.lineSeparator());
                    }
                }
                
                messageBuilder.append("<<<< END <<<<").append(System.lineSeparator());
            }
            
            LOGGER.debug(messageBuilder.toString());
        }
    }
    
    
    /**
     * Extracts the body of a request, resetting the stream if necessary so
     * that the request behaves as if it were unchanged
     * 
     * @return the body of the response
     */
    private static final byte[] extractRequestBody(HttpEntityEnclosingRequest request) throws IOException {
        byte[] data = toByteArray(request.getEntity().getContent());
        
        // Reset the response input stream if necessary
        if (!request.getEntity().isRepeatable()) {
            request.setEntity(new ByteArrayEntity(data, ContentType.get(request.getEntity())));
        }
            
        return data;
    }
    
    /**
     * Extracts the body of a response, resetting the stream if necessary so
     * that the response behaves as if it were unchanged
     * 
     * @return the body of the response
     */
    private static final byte[] extractResponseBody(HttpResponse response) throws IOException {
        byte[] data = toByteArray(response.getEntity().getContent());
        
        // Reset the response input stream if necessary
        if (!response.getEntity().isRepeatable()) {
            response.setEntity(new ByteArrayEntity(data, ContentType.get(response.getEntity())));
        }
            
        return data;
    }
    
    /**
     * Reads an input stream into a byte array, then closes the stream
     * 
     * @return an array containing all of the data from the stream
     */
    private static final byte[] toByteArray(InputStream response) throws IOException {
        final int BUFFER_SIZE = 2048; // How many bytes to copy at once
        
        // Clone the stream by reading it into a byte array
        byte[] buffer = new byte[BUFFER_SIZE];
        ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
        
        try (InputStream stream = response) {
            int read;
            while ((read = stream.read(buffer)) != -1) {
                byteArrayStream.write(buffer, 0, read);
            }
            byteArrayStream.flush();
        }
            
        return byteArrayStream.toByteArray();
    }
    
    
    private static class HeaderComparator implements Comparator<Header> {
        @Override
        public int compare(Header a, Header b) {
            return a.getName().compareTo(b.getName());
        }
    }
    
    
    /**
     * Formats an array of headers into a human-readable format
     * @param headers - the headers
     * @return a string containing all of the headers
     */
    private static String formatHeaders(Header[] headers) {
        
        List<Header> sortedHeaders = Arrays.asList(headers);
        Collections.sort(sortedHeaders, new HeaderComparator());
        
        StringBuilder sb = new StringBuilder();
        
        for (Header header : sortedHeaders) {
            String headerString = String.format("%s: %s", header.getName(), header.getValue());
            sb.append(headerString).append(System.lineSeparator());
        }
        
        return sb.toString();
    }
}
