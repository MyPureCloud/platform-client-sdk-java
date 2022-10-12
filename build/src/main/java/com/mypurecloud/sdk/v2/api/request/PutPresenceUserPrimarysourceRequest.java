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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.Source;
import com.mypurecloud.sdk.v2.model.SourceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;

public class PutPresenceUserPrimarysourceRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PutPresenceUserPrimarysourceRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private UserPrimarySource body;
	public UserPrimarySource getBody() {
		return this.body;
	}

	public void setBody(UserPrimarySource body) {
		this.body = body;
	}

	public PutPresenceUserPrimarysourceRequest withBody(UserPrimarySource body) {
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

    public PutPresenceUserPrimarysourceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UserPrimarySource> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutPresenceUserPrimarysourceRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceUserPrimarysourceRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/presence/users/{userId}/primarysource")
                .withPathParameter("userId", userId)
        
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


	public static Builder builder(String userId, UserPrimarySource body) {
	    return new Builder()
	            .withRequiredParams(userId, body);
	}


	public static class Builder {
		private final PutPresenceUserPrimarysourceRequest request;

		private Builder() {
			request = new PutPresenceUserPrimarysourceRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withBody(UserPrimarySource body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String userId, UserPrimarySource body) {
			request.setUserId(userId);
			request.setBody(body);

			return this;
		}


		public PutPresenceUserPrimarysourceRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutPresenceUserPrimarysourceRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceUserPrimarysourceRequest.");
            }
            
			return request;
		}
	}
}
