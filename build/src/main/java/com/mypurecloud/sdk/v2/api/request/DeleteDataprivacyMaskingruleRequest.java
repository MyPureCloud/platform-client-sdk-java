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
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.MaskingRule;
import com.mypurecloud.sdk.v2.model.MaskingRuleListing;
import com.mypurecloud.sdk.v2.model.MaskingRuleValidateRequest;
import com.mypurecloud.sdk.v2.model.MaskingRuleValidateResponse;

public class DeleteDataprivacyMaskingruleRequest {

	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public DeleteDataprivacyMaskingruleRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
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

    public DeleteDataprivacyMaskingruleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for DeleteDataprivacyMaskingruleRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/dataprivacy/maskingrules/{ruleId}")
                .withPathParameter("ruleId", ruleId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String ruleId) {
	    return new Builder()
	            .withRequiredParams(ruleId);
	}


	public static class Builder {
		private final DeleteDataprivacyMaskingruleRequest request;

		private Builder() {
			request = new DeleteDataprivacyMaskingruleRequest();
		}


		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}



		public Builder withRequiredParams(String ruleId) {
			request.setRuleId(ruleId);

			return this;
		}


		public DeleteDataprivacyMaskingruleRequest build() {
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for DeleteDataprivacyMaskingruleRequest.");
            }
            
			return request;
		}
	}
}
