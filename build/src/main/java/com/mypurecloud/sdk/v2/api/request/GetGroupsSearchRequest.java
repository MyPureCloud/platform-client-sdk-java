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

import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.ConversationParticipantSearchRequest;
import com.mypurecloud.sdk.v2.model.DocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.DocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.DocumentationV2SearchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonCursorSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SiteSearchRequest;
import com.mypurecloud.sdk.v2.model.SitesSearchResponse;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;

public class GetGroupsSearchRequest {

	private String q64;
	public String getQ64() {
		return this.q64;
	}

	public void setQ64(String q64) {
		this.q64 = q64;
	}

	public GetGroupsSearchRequest withQ64(String q64) {
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

	public GetGroupsSearchRequest withExpand(List<String> expand) {
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

    public GetGroupsSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'q64' is set
        if (this.q64 == null) {
            throw new IllegalStateException("Missing the required parameter 'q64' when building request for GetGroupsSearchRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/groups/search")

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
		private final GetGroupsSearchRequest request;

		private Builder() {
			request = new GetGroupsSearchRequest();
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


		public GetGroupsSearchRequest build() {
            
            // verify the required parameter 'q64' is set
            if (request.q64 == null) {
                throw new IllegalStateException("Missing the required parameter 'q64' when building request for GetGroupsSearchRequest.");
            }
            
			return request;
		}
	}
}
