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

import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.AgentDirectRoutingBackupSettings;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilizationResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.ChangeMyPasswordRequest;
import com.mypurecloud.sdk.v2.model.ChangePasswordRequest;
import com.mypurecloud.sdk.v2.model.ChatItemCursorListing;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivity;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateParam;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityListing;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.PatchUser;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateUser;
import com.mypurecloud.sdk.v2.model.UpdateVerifierRequest;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserActivityQuery;
import com.mypurecloud.sdk.v2.model.UserActivityResponse;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserCursorEntityListing;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.UserExternalIdentifier;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserProfile;
import com.mypurecloud.sdk.v2.model.UserProfileEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillGroupEntityListing;
import com.mypurecloud.sdk.v2.model.UserState;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UtilizationRequest;
import com.mypurecloud.sdk.v2.model.Verifier;
import com.mypurecloud.sdk.v2.model.VerifierEntityListing;

public class GetUsersQueryRequest {

	private String cursor;
	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public GetUsersQueryRequest withCursor(String cursor) {
	    this.setCursor(cursor);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetUsersQueryRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetUsersQueryRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASC("ASC"),
		DESC("DESC");

		private String value;

		sortOrderValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortOrderValues fromString(String key) {
			if (key == null) return null;

			for (sortOrderValues value : sortOrderValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortOrderValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetUsersQueryRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ROUTINGSTATUS("routingStatus"),
		PRESENCE("presence"),
		INTEGRATIONPRESENCE("integrationPresence"),
		CONVERSATIONSUMMARY("conversationSummary"),
		OUTOFOFFICE("outOfOffice"),
		GEOLOCATION("geolocation"),
		STATION("station"),
		AUTHORIZATION("authorization"),
		LASTTOKENISSUED("lasttokenissued"),
		AUTHORIZATION_UNUSEDROLES("authorization.unusedRoles"),
		TEAM("team"),
		WORKPLANBIDRANKS("workPlanBidRanks"),
		EXTERNALCONTACTSSETTINGS("externalContactsSettings"),
		GROUPS("groups"),
		PROFILESKILLS("profileSkills"),
		CERTIFICATIONS("certifications"),
		LOCATIONS("locations"),
		SKILLS("skills"),
		LANGUAGES("languages"),
		LANGUAGEPREFERENCE("languagePreference"),
		EMPLOYERINFO("employerInfo"),
		BIOGRAPHY("biography"),
		DATELASTLOGIN("dateLastLogin"),
		DATEWELCOMESENT("dateWelcomeSent");

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

	private String integrationPresenceSource;
	public String getIntegrationPresenceSource() {
		return this.integrationPresenceSource;
	}

	public void setIntegrationPresenceSource(String integrationPresenceSource) {
		this.integrationPresenceSource = integrationPresenceSource;
	}

	public GetUsersQueryRequest withIntegrationPresenceSource(String integrationPresenceSource) {
	    this.setIntegrationPresenceSource(integrationPresenceSource);
	    return this;
	} 

	public enum integrationPresenceSourceValues { 
		MICROSOFTTEAMS("MicrosoftTeams"),
		ZOOMPHONE("ZoomPhone"),
		EIGHTBYEIGHT("EightByEight");

		private String value;

		integrationPresenceSourceValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static integrationPresenceSourceValues fromString(String key) {
			if (key == null) return null;

			for (integrationPresenceSourceValues value : integrationPresenceSourceValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return integrationPresenceSourceValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String state;
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GetUsersQueryRequest withState(String state) {
	    this.setState(state);
	    return this;
	} 

	public enum stateValues { 
		ACTIVE("active"),
		INACTIVE("inactive"),
		DELETED("deleted"),
		ANY("any");

		private String value;

		stateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static stateValues fromString(String key) {
			if (key == null) return null;

			for (stateValues value : stateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return stateValues.values()[0];
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

    public GetUsersQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/query")

                .withQueryParameters("cursor", "", cursor)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("integrationPresenceSource", "", integrationPresenceSource)
        

                .withQueryParameters("state", "", state)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}



	public static class Builder {
		private final GetUsersQueryRequest request;

		private Builder() {
			request = new GetUsersQueryRequest();
		}


		public Builder withCursor(String cursor) {
			request.setCursor(cursor);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		
		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());

		    return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}

		public Builder withIntegrationPresenceSource(String integrationPresenceSource) {
			request.setIntegrationPresenceSource(integrationPresenceSource);
			return this;
		}



		
		public Builder withIntegrationPresenceSource(integrationPresenceSourceValues integrationPresenceSource) {
		    request.setIntegrationPresenceSource(integrationPresenceSource.toString());

		    return this;
		}

		public Builder withState(String state) {
			request.setState(state);
			return this;
		}



		
		public Builder withState(stateValues state) {
		    request.setState(state.toString());

		    return this;
		}




		public GetUsersQueryRequest build() {
            
			return request;
		}
	}
}
