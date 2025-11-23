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

public class GetUsersRuleDependentTypeIdRequest {

	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public GetUsersRuleDependentTypeIdRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
	    return this;
	} 

	private String ruleType;
	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public GetUsersRuleDependentTypeIdRequest withRuleType(String ruleType) {
	    this.setRuleType(ruleType);
	    return this;
	} 

	public enum ruleTypeValues { 
		LEARNING("learning");

		private String value;

		ruleTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static ruleTypeValues fromString(String key) {
			if (key == null) return null;

			for (ruleTypeValues value : ruleTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return ruleTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String typeId;
	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public GetUsersRuleDependentTypeIdRequest withTypeId(String typeId) {
	    this.setTypeId(typeId);
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

    public GetUsersRuleDependentTypeIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for GetUsersRuleDependentTypeIdRequest.");
        }
        
        // verify the required parameter 'ruleType' is set
        if (this.ruleType == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleType' when building request for GetUsersRuleDependentTypeIdRequest.");
        }
        
        // verify the required parameter 'typeId' is set
        if (this.typeId == null) {
            throw new IllegalStateException("Missing the required parameter 'typeId' when building request for GetUsersRuleDependentTypeIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/rules/{ruleId}/dependents/{ruleType}/{typeId}")
                .withPathParameter("ruleId", ruleId)
        
                .withPathParameter("ruleType", ruleType)
        
                .withPathParameter("typeId", typeId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String ruleId, String ruleType, String typeId) {
	    return new Builder()
	            .withRequiredParams(ruleId, ruleType, typeId);
	}


	public static class Builder {
		private final GetUsersRuleDependentTypeIdRequest request;

		private Builder() {
			request = new GetUsersRuleDependentTypeIdRequest();
		}


		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}

		public Builder withRuleType(String ruleType) {
			request.setRuleType(ruleType);
			return this;
		}



		
		public Builder withRuleType(ruleTypeValues ruleType) {
		    request.setRuleType(ruleType.toString());

		    return this;
		}

		public Builder withTypeId(String typeId) {
			request.setTypeId(typeId);
			return this;
		}



		public Builder withRequiredParams(String ruleId, String ruleType, String typeId) {
			request.setRuleId(ruleId);
			request.setRuleType(ruleType);
			request.setTypeId(typeId);

			return this;
		}


		public GetUsersRuleDependentTypeIdRequest build() {
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for GetUsersRuleDependentTypeIdRequest.");
            }
            
            // verify the required parameter 'ruleType' is set
            if (request.ruleType == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleType' when building request for GetUsersRuleDependentTypeIdRequest.");
            }
            
            // verify the required parameter 'typeId' is set
            if (request.typeId == null) {
                throw new IllegalStateException("Missing the required parameter 'typeId' when building request for GetUsersRuleDependentTypeIdRequest.");
            }
            
			return request;
		}
	}
}
