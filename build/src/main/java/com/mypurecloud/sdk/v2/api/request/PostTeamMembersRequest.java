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
import com.mypurecloud.sdk.v2.model.TeamActivityQuery;
import com.mypurecloud.sdk.v2.model.TeamActivityResponse;
import com.mypurecloud.sdk.v2.model.TeamEntityListing;
import com.mypurecloud.sdk.v2.model.TeamMemberAddListingResponse;
import com.mypurecloud.sdk.v2.model.TeamMemberEntityListing;
import com.mypurecloud.sdk.v2.model.TeamMembers;
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;

public class PostTeamMembersRequest {

	private String teamId;
	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public PostTeamMembersRequest withTeamId(String teamId) {
	    this.setTeamId(teamId);
	    return this;
	} 

	private TeamMembers body;
	public TeamMembers getBody() {
		return this.body;
	}

	public void setBody(TeamMembers body) {
		this.body = body;
	}

	public PostTeamMembersRequest withBody(TeamMembers body) {
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

    public PostTeamMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TeamMembers> withHttpInfo() {
        
        // verify the required parameter 'teamId' is set
        if (this.teamId == null) {
            throw new IllegalStateException("Missing the required parameter 'teamId' when building request for PostTeamMembersRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostTeamMembersRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/teams/{teamId}/members")
                .withPathParameter("teamId", teamId)
        
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


	public static Builder builder(String teamId, TeamMembers body) {
	    return new Builder()
	            .withRequiredParams(teamId, body);
	}


	public static class Builder {
		private final PostTeamMembersRequest request;

		private Builder() {
			request = new PostTeamMembersRequest();
		}


		public Builder withTeamId(String teamId) {
			request.setTeamId(teamId);
			return this;
		}

		public Builder withBody(TeamMembers body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String teamId, TeamMembers body) {
			request.setTeamId(teamId);
			request.setBody(body);

			return this;
		}


		public PostTeamMembersRequest build() {
            
            // verify the required parameter 'teamId' is set
            if (request.teamId == null) {
                throw new IllegalStateException("Missing the required parameter 'teamId' when building request for PostTeamMembersRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostTeamMembersRequest.");
            }
            
			return request;
		}
	}
}
