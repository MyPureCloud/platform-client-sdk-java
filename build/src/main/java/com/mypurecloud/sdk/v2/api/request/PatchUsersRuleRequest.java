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
import com.mypurecloud.sdk.v2.model.UsersRulesCreateRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesDependent;
import com.mypurecloud.sdk.v2.model.UsersRulesDependentList;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryResponse;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesRule;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleList;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleSettings;
import com.mypurecloud.sdk.v2.model.UsersRulesUpdateRuleRequest;

public class PatchUsersRuleRequest {

	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public PatchUsersRuleRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
	    return this;
	} 

	private UsersRulesUpdateRuleRequest body;
	public UsersRulesUpdateRuleRequest getBody() {
		return this.body;
	}

	public void setBody(UsersRulesUpdateRuleRequest body) {
		this.body = body;
	}

	public PatchUsersRuleRequest withBody(UsersRulesUpdateRuleRequest body) {
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

    public PatchUsersRuleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UsersRulesUpdateRuleRequest> withHttpInfo() {
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PatchUsersRuleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUsersRuleRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/users/rules/{ruleId}")
                .withPathParameter("ruleId", ruleId)
        
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


	public static Builder builder(String ruleId, UsersRulesUpdateRuleRequest body) {
	    return new Builder()
	            .withRequiredParams(ruleId, body);
	}


	public static class Builder {
		private final PatchUsersRuleRequest request;

		private Builder() {
			request = new PatchUsersRuleRequest();
		}


		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}

		public Builder withBody(UsersRulesUpdateRuleRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String ruleId, UsersRulesUpdateRuleRequest body) {
			request.setRuleId(ruleId);
			request.setBody(body);

			return this;
		}


		public PatchUsersRuleRequest build() {
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PatchUsersRuleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUsersRuleRequest.");
            }
            
			return request;
		}
	}
}
