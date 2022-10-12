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

import com.mypurecloud.sdk.v2.model.BulkContactsRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkDeleteResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.BulkIdsRequest;
import com.mypurecloud.sdk.v2.model.BulkNotesRequest;
import com.mypurecloud.sdk.v2.model.BulkNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ContactIdentifier;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;
import com.mypurecloud.sdk.v2.model.IdentifierClaimRequest;
import com.mypurecloud.sdk.v2.model.MergeRequest;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;

public class PostExternalcontactsContactPromotionRequest {

	private String contactId;
	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public PostExternalcontactsContactPromotionRequest withContactId(String contactId) {
	    this.setContactId(contactId);
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

    public PostExternalcontactsContactPromotionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'contactId' is set
        if (this.contactId == null) {
            throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PostExternalcontactsContactPromotionRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/externalcontacts/contacts/{contactId}/promotion")
                .withPathParameter("contactId", contactId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String contactId) {
	    return new Builder()
	            .withRequiredParams(contactId);
	}


	public static class Builder {
		private final PostExternalcontactsContactPromotionRequest request;

		private Builder() {
			request = new PostExternalcontactsContactPromotionRequest();
		}


		public Builder withContactId(String contactId) {
			request.setContactId(contactId);
			return this;
		}



		public Builder withRequiredParams(String contactId) {
			request.setContactId(contactId);

			return this;
		}


		public PostExternalcontactsContactPromotionRequest build() {
            
            // verify the required parameter 'contactId' is set
            if (request.contactId == null) {
                throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PostExternalcontactsContactPromotionRequest.");
            }
            
			return request;
		}
	}
}
