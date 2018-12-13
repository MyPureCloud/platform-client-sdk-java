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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.GreetingListing;

public class PutGroupGreetingsDefaultsRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PutGroupGreetingsDefaultsRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private DefaultGreetingList body;
	public DefaultGreetingList getBody() {
		return this.body;
	}

	public void setBody(DefaultGreetingList body) {
		this.body = body;
	}

	public PutGroupGreetingsDefaultsRequest withBody(DefaultGreetingList body) {
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

    public PutGroupGreetingsDefaultsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DefaultGreetingList> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PutGroupGreetingsDefaultsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutGroupGreetingsDefaultsRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/groups/{groupId}/greetings/defaults")
                .withPathParameter("groupId", groupId)
        
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

	
	public static Builder builder(String groupId, DefaultGreetingList body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}
	

	public static class Builder {
		private final PutGroupGreetingsDefaultsRequest request;

		private Builder() {
			request = new PutGroupGreetingsDefaultsRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withBody(DefaultGreetingList body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId, DefaultGreetingList body) {
			request.setGroupId(groupId);
						request.setBody(body);
			
			return this;
		}
		

		public PutGroupGreetingsDefaultsRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PutGroupGreetingsDefaultsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutGroupGreetingsDefaultsRequest.");
            }
            
			return request;
		}
	}
}
