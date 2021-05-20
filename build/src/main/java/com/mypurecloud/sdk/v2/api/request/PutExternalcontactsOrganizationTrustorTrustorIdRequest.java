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

import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.BulkFetchContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkIdsRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkContactsRequest;
import com.mypurecloud.sdk.v2.model.BulkDeleteResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesRequest;
import com.mypurecloud.sdk.v2.model.BulkFetchOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;

public class PutExternalcontactsOrganizationTrustorTrustorIdRequest {
    
	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public PutExternalcontactsOrganizationTrustorTrustorIdRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	} 
	
	private String trustorId;
	public String getTrustorId() {
		return this.trustorId;
	}

	public void setTrustorId(String trustorId) {
		this.trustorId = trustorId;
	}

	public PutExternalcontactsOrganizationTrustorTrustorIdRequest withTrustorId(String trustorId) {
	    this.setTrustorId(trustorId);
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

    public PutExternalcontactsOrganizationTrustorTrustorIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for PutExternalcontactsOrganizationTrustorTrustorIdRequest.");
        }
        
        // verify the required parameter 'trustorId' is set
        if (this.trustorId == null) {
            throw new IllegalStateException("Missing the required parameter 'trustorId' when building request for PutExternalcontactsOrganizationTrustorTrustorIdRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/organizations/{externalOrganizationId}/trustor/{trustorId}")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        
                .withPathParameter("trustorId", trustorId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String externalOrganizationId, String trustorId) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId, trustorId);
	}
	

	public static class Builder {
		private final PutExternalcontactsOrganizationTrustorTrustorIdRequest request;

		private Builder() {
			request = new PutExternalcontactsOrganizationTrustorTrustorIdRequest();
		}

		
		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}
		
		public Builder withTrustorId(String trustorId) {
			request.setTrustorId(trustorId);
			return this;
		}
		

		
		public Builder withRequiredParams(String externalOrganizationId, String trustorId) {
			request.setExternalOrganizationId(externalOrganizationId);
						request.setTrustorId(trustorId);
			
			return this;
		}
		

		public PutExternalcontactsOrganizationTrustorTrustorIdRequest build() {
            
            // verify the required parameter 'externalOrganizationId' is set
            if (request.externalOrganizationId == null) {
                throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for PutExternalcontactsOrganizationTrustorTrustorIdRequest.");
            }
            
            // verify the required parameter 'trustorId' is set
            if (request.trustorId == null) {
                throw new IllegalStateException("Missing the required parameter 'trustorId' when building request for PutExternalcontactsOrganizationTrustorTrustorIdRequest.");
            }
            
			return request;
		}
	}
}
