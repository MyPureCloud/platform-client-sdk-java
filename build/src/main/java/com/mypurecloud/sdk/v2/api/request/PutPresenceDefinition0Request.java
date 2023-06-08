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
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;

public class PutPresenceDefinition0Request {

	private String definitionId;
	public String getDefinitionId() {
		return this.definitionId;
	}

	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
	}

	public PutPresenceDefinition0Request withDefinitionId(String definitionId) {
	    this.setDefinitionId(definitionId);
	    return this;
	} 

	private OrganizationPresenceDefinition body;
	public OrganizationPresenceDefinition getBody() {
		return this.body;
	}

	public void setBody(OrganizationPresenceDefinition body) {
		this.body = body;
	}

	public PutPresenceDefinition0Request withBody(OrganizationPresenceDefinition body) {
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

    public PutPresenceDefinition0Request withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OrganizationPresenceDefinition> withHttpInfo() {
        
        // verify the required parameter 'definitionId' is set
        if (this.definitionId == null) {
            throw new IllegalStateException("Missing the required parameter 'definitionId' when building request for PutPresenceDefinition0Request.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceDefinition0Request.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/presence/definitions/{definitionId}")
                .withPathParameter("definitionId", definitionId)
        
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


	public static Builder builder(String definitionId, OrganizationPresenceDefinition body) {
	    return new Builder()
	            .withRequiredParams(definitionId, body);
	}


	public static class Builder {
		private final PutPresenceDefinition0Request request;

		private Builder() {
			request = new PutPresenceDefinition0Request();
		}


		public Builder withDefinitionId(String definitionId) {
			request.setDefinitionId(definitionId);
			return this;
		}

		public Builder withBody(OrganizationPresenceDefinition body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String definitionId, OrganizationPresenceDefinition body) {
			request.setDefinitionId(definitionId);
			request.setBody(body);

			return this;
		}


		public PutPresenceDefinition0Request build() {
            
            // verify the required parameter 'definitionId' is set
            if (request.definitionId == null) {
                throw new IllegalStateException("Missing the required parameter 'definitionId' when building request for PutPresenceDefinition0Request.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceDefinition0Request.");
            }
            
			return request;
		}
	}
}
