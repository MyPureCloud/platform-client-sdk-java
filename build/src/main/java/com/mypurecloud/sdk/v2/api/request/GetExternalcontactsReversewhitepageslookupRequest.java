package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class GetExternalcontactsReversewhitepageslookupRequest {
	private String lookupVal;
	public String getLookupVal() {
		return this.lookupVal;
	}

	public void setLookupVal(String lookupVal) {
		this.lookupVal = lookupVal;
	}

	public GetExternalcontactsReversewhitepageslookupRequest withLookupVal(String lookupVal) {
	    this.setLookupVal(lookupVal);
	    return this;
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetExternalcontactsReversewhitepageslookupRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
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

    public GetExternalcontactsReversewhitepageslookupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'lookupVal' is set
        if (this.lookupVal == null) {
            throw new IllegalStateException("Missing the required parameter 'lookupVal' when building request for GetExternalcontactsReversewhitepageslookupRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/externalcontacts/reversewhitepageslookup")
                .withQueryParameters("lookupVal", "", lookupVal)
        
                .withQueryParameters("expand", "multi", expand)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String lookupVal) {
	    return new Builder()
	            .withRequiredParams(lookupVal);
	}

	public static class Builder {
		private final GetExternalcontactsReversewhitepageslookupRequest request;

		private Builder() {
			request = new GetExternalcontactsReversewhitepageslookupRequest();
		}

		public Builder withLookupVal(String lookupVal) {
			request.setLookupVal(lookupVal);
			return this;
		}
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withRequiredParams(String lookupVal) {
			request.setLookupVal(lookupVal);
			return this;
		}


		public GetExternalcontactsReversewhitepageslookupRequest build() {
            
            // verify the required parameter 'lookupVal' is set
            if (request.lookupVal == null) {
                throw new IllegalStateException("Missing the required parameter 'lookupVal' when building request for GetExternalcontactsReversewhitepageslookupRequest.");
            }
            
			return request;
		}
	}
}
