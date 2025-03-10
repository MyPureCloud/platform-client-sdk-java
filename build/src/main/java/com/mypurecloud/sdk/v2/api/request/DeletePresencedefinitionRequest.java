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
import com.mypurecloud.sdk.v2.model.MutableUserPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinition;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinitionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.PresenceSettings;
import com.mypurecloud.sdk.v2.model.Source;
import com.mypurecloud.sdk.v2.model.SourceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UcUserPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;

public class DeletePresencedefinitionRequest {

	private String presenceId;
	public String getPresenceId() {
		return this.presenceId;
	}

	public void setPresenceId(String presenceId) {
		this.presenceId = presenceId;
	}

	public DeletePresencedefinitionRequest withPresenceId(String presenceId) {
	    this.setPresenceId(presenceId);
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

    public DeletePresencedefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'presenceId' is set
        if (this.presenceId == null) {
            throw new IllegalStateException("Missing the required parameter 'presenceId' when building request for DeletePresencedefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/presencedefinitions/{presenceId}")
                .withPathParameter("presenceId", presenceId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String presenceId) {
	    return new Builder()
	            .withRequiredParams(presenceId);
	}


	public static class Builder {
		private final DeletePresencedefinitionRequest request;

		private Builder() {
			request = new DeletePresencedefinitionRequest();
		}


		public Builder withPresenceId(String presenceId) {
			request.setPresenceId(presenceId);
			return this;
		}



		public Builder withRequiredParams(String presenceId) {
			request.setPresenceId(presenceId);

			return this;
		}


		public DeletePresencedefinitionRequest build() {
            
            // verify the required parameter 'presenceId' is set
            if (request.presenceId == null) {
                throw new IllegalStateException("Missing the required parameter 'presenceId' when building request for DeletePresencedefinitionRequest.");
            }
            
			return request;
		}
	}
}
