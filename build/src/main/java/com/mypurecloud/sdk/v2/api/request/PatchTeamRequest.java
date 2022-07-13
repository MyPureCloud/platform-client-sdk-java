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
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;

public class PatchTeamRequest {

	private String teamId;
	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public PatchTeamRequest withTeamId(String teamId) {
	    this.setTeamId(teamId);
	    return this;
	} 

	private Team body;
	public Team getBody() {
		return this.body;
	}

	public void setBody(Team body) {
		this.body = body;
	}

	public PatchTeamRequest withBody(Team body) {
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

    public PatchTeamRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Team> withHttpInfo() {
        
        // verify the required parameter 'teamId' is set
        if (this.teamId == null) {
            throw new IllegalStateException("Missing the required parameter 'teamId' when building request for PatchTeamRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchTeamRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/teams/{teamId}")
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


	public static Builder builder(String teamId, Team body) {
	    return new Builder()
	            .withRequiredParams(teamId, body);
	}


	public static class Builder {
		private final PatchTeamRequest request;

		private Builder() {
			request = new PatchTeamRequest();
		}


		public Builder withTeamId(String teamId) {
			request.setTeamId(teamId);
			return this;
		}

		public Builder withBody(Team body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String teamId, Team body) {
			request.setTeamId(teamId);
			request.setBody(body);

			return this;
		}


		public PatchTeamRequest build() {
            
            // verify the required parameter 'teamId' is set
            if (request.teamId == null) {
                throw new IllegalStateException("Missing the required parameter 'teamId' when building request for PatchTeamRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchTeamRequest.");
            }
            
			return request;
		}
	}
}
