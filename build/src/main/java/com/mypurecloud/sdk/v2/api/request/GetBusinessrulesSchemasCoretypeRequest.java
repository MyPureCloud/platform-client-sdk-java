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

import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchema;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchemaListing;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaCreateRequest;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaUpdateRequest;
import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;

public class GetBusinessrulesSchemasCoretypeRequest {

	private String coreTypeName;
	public String getCoreTypeName() {
		return this.coreTypeName;
	}

	public void setCoreTypeName(String coreTypeName) {
		this.coreTypeName = coreTypeName;
	}

	public GetBusinessrulesSchemasCoretypeRequest withCoreTypeName(String coreTypeName) {
	    this.setCoreTypeName(coreTypeName);
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

    public GetBusinessrulesSchemasCoretypeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'coreTypeName' is set
        if (this.coreTypeName == null) {
            throw new IllegalStateException("Missing the required parameter 'coreTypeName' when building request for GetBusinessrulesSchemasCoretypeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/businessrules/schemas/coretypes/{coreTypeName}")
                .withPathParameter("coreTypeName", coreTypeName)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String coreTypeName) {
	    return new Builder()
	            .withRequiredParams(coreTypeName);
	}


	public static class Builder {
		private final GetBusinessrulesSchemasCoretypeRequest request;

		private Builder() {
			request = new GetBusinessrulesSchemasCoretypeRequest();
		}


		public Builder withCoreTypeName(String coreTypeName) {
			request.setCoreTypeName(coreTypeName);
			return this;
		}



		public Builder withRequiredParams(String coreTypeName) {
			request.setCoreTypeName(coreTypeName);

			return this;
		}


		public GetBusinessrulesSchemasCoretypeRequest build() {
            
            // verify the required parameter 'coreTypeName' is set
            if (request.coreTypeName == null) {
                throw new IllegalStateException("Missing the required parameter 'coreTypeName' when building request for GetBusinessrulesSchemasCoretypeRequest.");
            }
            
			return request;
		}
	}
}
