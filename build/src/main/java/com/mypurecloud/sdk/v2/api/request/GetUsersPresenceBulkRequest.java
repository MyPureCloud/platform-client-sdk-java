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

public class GetUsersPresenceBulkRequest {

	private String sourceId;
	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public GetUsersPresenceBulkRequest withSourceId(String sourceId) {
	    this.setSourceId(sourceId);
	    return this;
	} 

	private List<String> id;
	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public GetUsersPresenceBulkRequest withId(List<String> id) {
	    this.setId(id);
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

    public GetUsersPresenceBulkRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'sourceId' is set
        if (this.sourceId == null) {
            throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for GetUsersPresenceBulkRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/presences/{sourceId}/bulk")
                .withPathParameter("sourceId", sourceId)
        

                .withQueryParameters("id", "multi", id)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String sourceId) {
	    return new Builder()
	            .withRequiredParams(sourceId);
	}


	public static class Builder {
		private final GetUsersPresenceBulkRequest request;

		private Builder() {
			request = new GetUsersPresenceBulkRequest();
		}


		public Builder withSourceId(String sourceId) {
			request.setSourceId(sourceId);
			return this;
		}

		public Builder withId(List<String> id) {
			request.setId(id);
			return this;
		}



		public Builder withRequiredParams(String sourceId) {
			request.setSourceId(sourceId);

			return this;
		}


		public GetUsersPresenceBulkRequest build() {
            
            // verify the required parameter 'sourceId' is set
            if (request.sourceId == null) {
                throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for GetUsersPresenceBulkRequest.");
            }
            
			return request;
		}
	}
}
