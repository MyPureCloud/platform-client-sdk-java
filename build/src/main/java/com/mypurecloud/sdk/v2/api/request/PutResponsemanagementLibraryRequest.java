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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;

public class PutResponsemanagementLibraryRequest {
    
	private String libraryId;
	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public PutResponsemanagementLibraryRequest withLibraryId(String libraryId) {
	    this.setLibraryId(libraryId);
	    return this;
	} 
	
	private Library body;
	public Library getBody() {
		return this.body;
	}

	public void setBody(Library body) {
		this.body = body;
	}

	public PutResponsemanagementLibraryRequest withBody(Library body) {
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

    public PutResponsemanagementLibraryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Library> withHttpInfo() {
        
        // verify the required parameter 'libraryId' is set
        if (this.libraryId == null) {
            throw new IllegalStateException("Missing the required parameter 'libraryId' when building request for PutResponsemanagementLibraryRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutResponsemanagementLibraryRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/responsemanagement/libraries/{libraryId}")
                .withPathParameter("libraryId", libraryId)
        
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

	
	public static Builder builder(String libraryId, Library body) {
	    return new Builder()
	            .withRequiredParams(libraryId, body);
	}
	

	public static class Builder {
		private final PutResponsemanagementLibraryRequest request;

		private Builder() {
			request = new PutResponsemanagementLibraryRequest();
		}

		
		public Builder withLibraryId(String libraryId) {
			request.setLibraryId(libraryId);
			return this;
		}
		
		public Builder withBody(Library body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String libraryId, Library body) {
			request.setLibraryId(libraryId);
						request.setBody(body);
			
			return this;
		}
		

		public PutResponsemanagementLibraryRequest build() {
            
            // verify the required parameter 'libraryId' is set
            if (request.libraryId == null) {
                throw new IllegalStateException("Missing the required parameter 'libraryId' when building request for PutResponsemanagementLibraryRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutResponsemanagementLibraryRequest.");
            }
            
			return request;
		}
	}
}
