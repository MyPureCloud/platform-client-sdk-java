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

public class PatchUserRoutinglanguageRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PatchUserRoutinglanguageRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String languageId;
	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public PatchUserRoutinglanguageRequest withLanguageId(String languageId) {
	    this.setLanguageId(languageId);
	    return this;
	} 

	private UserRoutingLanguage body;
	public UserRoutingLanguage getBody() {
		return this.body;
	}

	public void setBody(UserRoutingLanguage body) {
		this.body = body;
	}

	public PatchUserRoutinglanguageRequest withBody(UserRoutingLanguage body) {
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

    public PatchUserRoutinglanguageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UserRoutingLanguage> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PatchUserRoutinglanguageRequest.");
        }
        
        // verify the required parameter 'languageId' is set
        if (this.languageId == null) {
            throw new IllegalStateException("Missing the required parameter 'languageId' when building request for PatchUserRoutinglanguageRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUserRoutinglanguageRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/users/{userId}/routinglanguages/{languageId}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("languageId", languageId)
        
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


	public static Builder builder(String userId, String languageId, UserRoutingLanguage body) {
	    return new Builder()
	            .withRequiredParams(userId, languageId, body);
	}


	public static class Builder {
		private final PatchUserRoutinglanguageRequest request;

		private Builder() {
			request = new PatchUserRoutinglanguageRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withLanguageId(String languageId) {
			request.setLanguageId(languageId);
			return this;
		}

		public Builder withBody(UserRoutingLanguage body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String userId, String languageId, UserRoutingLanguage body) {
			request.setUserId(userId);
			request.setLanguageId(languageId);
			request.setBody(body);

			return this;
		}


		public PatchUserRoutinglanguageRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PatchUserRoutinglanguageRequest.");
            }
            
            // verify the required parameter 'languageId' is set
            if (request.languageId == null) {
                throw new IllegalStateException("Missing the required parameter 'languageId' when building request for PatchUserRoutinglanguageRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUserRoutinglanguageRequest.");
            }
            
			return request;
		}
	}
}
