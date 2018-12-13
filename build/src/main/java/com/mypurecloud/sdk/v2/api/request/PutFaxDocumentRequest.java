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

public class PutFaxDocumentRequest {
    
	private String documentId;
	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public PutFaxDocumentRequest withDocumentId(String documentId) {
	    this.setDocumentId(documentId);
	    return this;
	} 
	
	private FaxDocument body;
	public FaxDocument getBody() {
		return this.body;
	}

	public void setBody(FaxDocument body) {
		this.body = body;
	}

	public PutFaxDocumentRequest withBody(FaxDocument body) {
	    this.setBody(body);
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

    public PutFaxDocumentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FaxDocument> withHttpInfo() {
        
        // verify the required parameter 'documentId' is set
        if (this.documentId == null) {
            throw new IllegalStateException("Missing the required parameter 'documentId' when building request for PutFaxDocumentRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutFaxDocumentRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/fax/documents/{documentId}")
                .withPathParameter("documentId", documentId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String documentId, FaxDocument body) {
	    return new Builder()
	            .withRequiredParams(documentId, body);
	}
	

	public static class Builder {
		private final PutFaxDocumentRequest request;

		private Builder() {
			request = new PutFaxDocumentRequest();
		}

		
		public Builder withDocumentId(String documentId) {
			request.setDocumentId(documentId);
			return this;
		}
		
		public Builder withBody(FaxDocument body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String documentId, FaxDocument body) {
			request.setDocumentId(documentId);
						request.setBody(body);
			
			return this;
		}
		

		public PutFaxDocumentRequest build() {
            
            // verify the required parameter 'documentId' is set
            if (request.documentId == null) {
                throw new IllegalStateException("Missing the required parameter 'documentId' when building request for PutFaxDocumentRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutFaxDocumentRequest.");
            }
            
			return request;
		}
	}
}
