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

import com.mypurecloud.sdk.v2.model.BulkAddSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkRemoveSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkSourceIntentsResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntent;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentRequest;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentPatch;
import com.mypurecloud.sdk.v2.model.CustomerIntentResponse;
import com.mypurecloud.sdk.v2.model.CustomerSourceIntentListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntentsCategory;
import com.mypurecloud.sdk.v2.model.IntentsCategoryListing;
import com.mypurecloud.sdk.v2.model.IntentsCategoryPatch;

public class PatchIntentsCategoryRequest {

	private String categoryId;
	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public PatchIntentsCategoryRequest withCategoryId(String categoryId) {
	    this.setCategoryId(categoryId);
	    return this;
	} 

	private IntentsCategoryPatch body;
	public IntentsCategoryPatch getBody() {
		return this.body;
	}

	public void setBody(IntentsCategoryPatch body) {
		this.body = body;
	}

	public PatchIntentsCategoryRequest withBody(IntentsCategoryPatch body) {
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

    public PatchIntentsCategoryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<IntentsCategoryPatch> withHttpInfo() {
        
        // verify the required parameter 'categoryId' is set
        if (this.categoryId == null) {
            throw new IllegalStateException("Missing the required parameter 'categoryId' when building request for PatchIntentsCategoryRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchIntentsCategoryRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/intents/categories/{categoryId}")
                .withPathParameter("categoryId", categoryId)
        
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


	public static Builder builder(String categoryId, IntentsCategoryPatch body) {
	    return new Builder()
	            .withRequiredParams(categoryId, body);
	}


	public static class Builder {
		private final PatchIntentsCategoryRequest request;

		private Builder() {
			request = new PatchIntentsCategoryRequest();
		}


		public Builder withCategoryId(String categoryId) {
			request.setCategoryId(categoryId);
			return this;
		}

		public Builder withBody(IntentsCategoryPatch body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String categoryId, IntentsCategoryPatch body) {
			request.setCategoryId(categoryId);
			request.setBody(body);

			return this;
		}


		public PatchIntentsCategoryRequest build() {
            
            // verify the required parameter 'categoryId' is set
            if (request.categoryId == null) {
                throw new IllegalStateException("Missing the required parameter 'categoryId' when building request for PatchIntentsCategoryRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchIntentsCategoryRequest.");
            }
            
			return request;
		}
	}
}
