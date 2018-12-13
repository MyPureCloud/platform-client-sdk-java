package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FaxDocument;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;

public class GetFaxDocumentContentRequest {
    
	private String documentId;
	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public GetFaxDocumentContentRequest withDocumentId(String documentId) {
	    this.setDocumentId(documentId);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetFaxDocumentContentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'documentId' is set
        if (this.documentId == null) {
            throw new IllegalStateException("Missing the required parameter 'documentId' when building request for GetFaxDocumentContentRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/fax/documents/{documentId}/content")
                .withPathParameter("documentId", documentId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String documentId) {
	    return new Builder()
	            .withRequiredParams(documentId);
	}
	

	public static class Builder {
		private final GetFaxDocumentContentRequest request;

		private Builder() {
			request = new GetFaxDocumentContentRequest();
		}

		
		public Builder withDocumentId(String documentId) {
			request.setDocumentId(documentId);
			return this;
		}
		

		
		public Builder withRequiredParams(String documentId) {
			request.setDocumentId(documentId);
			
			return this;
		}
		

		public GetFaxDocumentContentRequest build() {
            
            // verify the required parameter 'documentId' is set
            if (request.documentId == null) {
                throw new IllegalStateException("Missing the required parameter 'documentId' when building request for GetFaxDocumentContentRequest.");
            }
            
			return request;
		}
	}
}
