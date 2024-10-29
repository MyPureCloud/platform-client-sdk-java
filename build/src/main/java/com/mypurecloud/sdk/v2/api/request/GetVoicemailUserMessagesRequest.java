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

import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;

public class GetVoicemailUserMessagesRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetVoicemailUserMessagesRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetVoicemailUserMessagesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetVoicemailUserMessagesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
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

    public GetVoicemailUserMessagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetVoicemailUserMessagesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/voicemail/users/{userId}/messages")
                .withPathParameter("userId", userId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String userId) {
	    return new Builder()
	            .withRequiredParams(userId);
	}


	public static class Builder {
		private final GetVoicemailUserMessagesRequest request;

		private Builder() {
			request = new GetVoicemailUserMessagesRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}



		public Builder withRequiredParams(String userId) {
			request.setUserId(userId);

			return this;
		}


		public GetVoicemailUserMessagesRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetVoicemailUserMessagesRequest.");
            }
            
			return request;
		}
	}
}
