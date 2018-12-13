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
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;

public class GetVoicemailSearchRequest {
    
	private String q64;
	public String getQ64() {
		return this.q64;
	}

	public void setQ64(String q64) {
		this.q64 = q64;
	}

	public GetVoicemailSearchRequest withQ64(String q64) {
	    this.setQ64(q64);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetVoicemailSearchRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
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

    public GetVoicemailSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'q64' is set
        if (this.q64 == null) {
            throw new IllegalStateException("Missing the required parameter 'q64' when building request for GetVoicemailSearchRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/voicemail/search")
                .withQueryParameters("q64", "", q64)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String q64) {
	    return new Builder()
	            .withRequiredParams(q64);
	}
	

	public static class Builder {
		private final GetVoicemailSearchRequest request;

		private Builder() {
			request = new GetVoicemailSearchRequest();
		}

		
		public Builder withQ64(String q64) {
			request.setQ64(q64);
			return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		

		
		public Builder withRequiredParams(String q64) {
			request.setQ64(q64);
			
			return this;
		}
		

		public GetVoicemailSearchRequest build() {
            
            // verify the required parameter 'q64' is set
            if (request.q64 == null) {
                throw new IllegalStateException("Missing the required parameter 'q64' when building request for GetVoicemailSearchRequest.");
            }
            
			return request;
		}
	}
}
