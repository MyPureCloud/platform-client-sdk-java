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
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.TeamEntityListing;
import com.mypurecloud.sdk.v2.model.TeamMemberAddListingResponse;
import com.mypurecloud.sdk.v2.model.TeamMemberEntityListing;
import com.mypurecloud.sdk.v2.model.TeamMembers;
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;

public class DeleteTeamMembersRequest {

	private String teamId;
	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public DeleteTeamMembersRequest withTeamId(String teamId) {
	    this.setTeamId(teamId);
	    return this;
	} 

	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DeleteTeamMembersRequest withId(String id) {
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

    public DeleteTeamMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'teamId' is set
        if (this.teamId == null) {
            throw new IllegalStateException("Missing the required parameter 'teamId' when building request for DeleteTeamMembersRequest.");
        }
        
        // verify the required parameter 'id' is set
        if (this.id == null) {
            throw new IllegalStateException("Missing the required parameter 'id' when building request for DeleteTeamMembersRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/teams/{teamId}/members")
                .withPathParameter("teamId", teamId)
        

                .withQueryParameters("id", "", id)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String teamId, String id) {
	    return new Builder()
	            .withRequiredParams(teamId, id);
	}


	public static class Builder {
		private final DeleteTeamMembersRequest request;

		private Builder() {
			request = new DeleteTeamMembersRequest();
		}


		public Builder withTeamId(String teamId) {
			request.setTeamId(teamId);
			return this;
		}

		public Builder withId(String id) {
			request.setId(id);
			return this;
		}



		public Builder withRequiredParams(String teamId, String id) {
			request.setTeamId(teamId);
			request.setId(id);

			return this;
		}


		public DeleteTeamMembersRequest build() {
            
            // verify the required parameter 'teamId' is set
            if (request.teamId == null) {
                throw new IllegalStateException("Missing the required parameter 'teamId' when building request for DeleteTeamMembersRequest.");
            }
            
            // verify the required parameter 'id' is set
            if (request.id == null) {
                throw new IllegalStateException("Missing the required parameter 'id' when building request for DeleteTeamMembersRequest.");
            }
            
			return request;
		}
	}
}
