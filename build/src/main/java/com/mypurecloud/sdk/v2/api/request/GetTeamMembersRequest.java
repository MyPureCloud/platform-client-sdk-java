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

public class GetTeamMembersRequest {

	private String teamId;
	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public GetTeamMembersRequest withTeamId(String teamId) {
	    this.setTeamId(teamId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetTeamMembersRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetTeamMembersRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetTeamMembersRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetTeamMembersRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ENTITIES("entities");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetTeamMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'teamId' is set
        if (this.teamId == null) {
            throw new IllegalStateException("Missing the required parameter 'teamId' when building request for GetTeamMembersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/teams/{teamId}/members")
                .withPathParameter("teamId", teamId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("expand", "", expand)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String teamId) {
	    return new Builder()
	            .withRequiredParams(teamId);
	}


	public static class Builder {
		private final GetTeamMembersRequest request;

		private Builder() {
			request = new GetTeamMembersRequest();
		}


		public Builder withTeamId(String teamId) {
			request.setTeamId(teamId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}



		
		public Builder withExpand(expandValues expand) {
		    request.setExpand(expand.toString());

		    return this;
		}



		public Builder withRequiredParams(String teamId) {
			request.setTeamId(teamId);

			return this;
		}


		public GetTeamMembersRequest build() {
            
            // verify the required parameter 'teamId' is set
            if (request.teamId == null) {
                throw new IllegalStateException("Missing the required parameter 'teamId' when building request for GetTeamMembersRequest.");
            }
            
			return request;
		}
	}
}
