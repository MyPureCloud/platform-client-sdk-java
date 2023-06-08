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

public class PutPresenceSourceRequest {

	private String sourceId;
	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public PutPresenceSourceRequest withSourceId(String sourceId) {
	    this.setSourceId(sourceId);
	    return this;
	} 

	private Source body;
	public Source getBody() {
		return this.body;
	}

	public void setBody(Source body) {
		this.body = body;
	}

	public PutPresenceSourceRequest withBody(Source body) {
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

    public PutPresenceSourceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Source> withHttpInfo() {
        
        // verify the required parameter 'sourceId' is set
        if (this.sourceId == null) {
            throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for PutPresenceSourceRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceSourceRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/presence/sources/{sourceId}")
                .withPathParameter("sourceId", sourceId)
        
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


	public static Builder builder(String sourceId, Source body) {
	    return new Builder()
	            .withRequiredParams(sourceId, body);
	}


	public static class Builder {
		private final PutPresenceSourceRequest request;

		private Builder() {
			request = new PutPresenceSourceRequest();
		}


		public Builder withSourceId(String sourceId) {
			request.setSourceId(sourceId);
			return this;
		}

		public Builder withBody(Source body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String sourceId, Source body) {
			request.setSourceId(sourceId);
			request.setBody(body);

			return this;
		}


		public PutPresenceSourceRequest build() {
            
            // verify the required parameter 'sourceId' is set
            if (request.sourceId == null) {
                throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for PutPresenceSourceRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutPresenceSourceRequest.");
            }
            
			return request;
		}
	}
}
