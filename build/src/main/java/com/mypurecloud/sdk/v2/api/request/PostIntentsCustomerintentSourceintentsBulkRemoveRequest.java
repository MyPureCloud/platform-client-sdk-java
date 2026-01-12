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

public class PostIntentsCustomerintentSourceintentsBulkRemoveRequest {

	private String customerIntentId;
	public String getCustomerIntentId() {
		return this.customerIntentId;
	}

	public void setCustomerIntentId(String customerIntentId) {
		this.customerIntentId = customerIntentId;
	}

	public PostIntentsCustomerintentSourceintentsBulkRemoveRequest withCustomerIntentId(String customerIntentId) {
	    this.setCustomerIntentId(customerIntentId);
	    return this;
	} 

	private BulkRemoveSourceIntentsRequest body;
	public BulkRemoveSourceIntentsRequest getBody() {
		return this.body;
	}

	public void setBody(BulkRemoveSourceIntentsRequest body) {
		this.body = body;
	}

	public PostIntentsCustomerintentSourceintentsBulkRemoveRequest withBody(BulkRemoveSourceIntentsRequest body) {
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

    public PostIntentsCustomerintentSourceintentsBulkRemoveRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<BulkRemoveSourceIntentsRequest> withHttpInfo() {
        
        // verify the required parameter 'customerIntentId' is set
        if (this.customerIntentId == null) {
            throw new IllegalStateException("Missing the required parameter 'customerIntentId' when building request for PostIntentsCustomerintentSourceintentsBulkRemoveRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostIntentsCustomerintentSourceintentsBulkRemoveRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/intents/customerintents/{customerIntentId}/sourceintents/bulk/remove")
                .withPathParameter("customerIntentId", customerIntentId)
        
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


	public static Builder builder(String customerIntentId, BulkRemoveSourceIntentsRequest body) {
	    return new Builder()
	            .withRequiredParams(customerIntentId, body);
	}


	public static class Builder {
		private final PostIntentsCustomerintentSourceintentsBulkRemoveRequest request;

		private Builder() {
			request = new PostIntentsCustomerintentSourceintentsBulkRemoveRequest();
		}


		public Builder withCustomerIntentId(String customerIntentId) {
			request.setCustomerIntentId(customerIntentId);
			return this;
		}

		public Builder withBody(BulkRemoveSourceIntentsRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String customerIntentId, BulkRemoveSourceIntentsRequest body) {
			request.setCustomerIntentId(customerIntentId);
			request.setBody(body);

			return this;
		}


		public PostIntentsCustomerintentSourceintentsBulkRemoveRequest build() {
            
            // verify the required parameter 'customerIntentId' is set
            if (request.customerIntentId == null) {
                throw new IllegalStateException("Missing the required parameter 'customerIntentId' when building request for PostIntentsCustomerintentSourceintentsBulkRemoveRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostIntentsCustomerintentSourceintentsBulkRemoveRequest.");
            }
            
			return request;
		}
	}
}
