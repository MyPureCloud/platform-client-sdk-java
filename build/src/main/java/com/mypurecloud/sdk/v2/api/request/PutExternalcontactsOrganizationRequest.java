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

import com.mypurecloud.sdk.v2.model.BulkContactsEnrichRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsEnrichResponse;
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
import com.mypurecloud.sdk.v2.model.BulkOrganizationsEnrichRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsEnrichResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ContactEnrichRequest;
import com.mypurecloud.sdk.v2.model.ContactIdentifier;
import com.mypurecloud.sdk.v2.model.ContactIdentifierListing;
import com.mypurecloud.sdk.v2.model.ContactImportJobEntityListing;
import com.mypurecloud.sdk.v2.model.ContactImportJobRequest;
import com.mypurecloud.sdk.v2.model.ContactImportJobResponse;
import com.mypurecloud.sdk.v2.model.ContactImportJobStatusUpdateRequest;
import com.mypurecloud.sdk.v2.model.ContactImportJobStatusUpdateResponse;
import com.mypurecloud.sdk.v2.model.ContactImportSettings;
import com.mypurecloud.sdk.v2.model.ContactImportSettingsEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ContactsExport;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CsvJobRequest;
import com.mypurecloud.sdk.v2.model.CsvJobResponse;
import com.mypurecloud.sdk.v2.model.CsvSettings;
import com.mypurecloud.sdk.v2.model.CsvUploadDetailsResponse;
import com.mypurecloud.sdk.v2.model.CsvUploadPreviewResponse;
import com.mypurecloud.sdk.v2.model.CsvUploadRequest;
import com.mypurecloud.sdk.v2.model.CsvUploadResponse;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorExternalSourceListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.ExportListing;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationEnrichRequest;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifier;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifierClaimRequest;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifierListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;
import com.mypurecloud.sdk.v2.model.ExternalSource;
import com.mypurecloud.sdk.v2.model.IdentifierClaimRequest;
import com.mypurecloud.sdk.v2.model.Listing;
import com.mypurecloud.sdk.v2.model.MergeContactsRequest;
import com.mypurecloud.sdk.v2.model.MergeRequest;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;
import com.mypurecloud.sdk.v2.model.SessionListing;

public class PutExternalcontactsOrganizationRequest {

	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public PutExternalcontactsOrganizationRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	} 

	private ExternalOrganization body;
	public ExternalOrganization getBody() {
		return this.body;
	}

	public void setBody(ExternalOrganization body) {
		this.body = body;
	}

	public PutExternalcontactsOrganizationRequest withBody(ExternalOrganization body) {
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

    public PutExternalcontactsOrganizationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ExternalOrganization> withHttpInfo() {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for PutExternalcontactsOrganizationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsOrganizationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/organizations/{externalOrganizationId}")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        
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


	public static Builder builder(String externalOrganizationId, ExternalOrganization body) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId, body);
	}


	public static class Builder {
		private final PutExternalcontactsOrganizationRequest request;

		private Builder() {
			request = new PutExternalcontactsOrganizationRequest();
		}


		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}

		public Builder withBody(ExternalOrganization body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String externalOrganizationId, ExternalOrganization body) {
			request.setExternalOrganizationId(externalOrganizationId);
			request.setBody(body);

			return this;
		}


		public PutExternalcontactsOrganizationRequest build() {
            
            // verify the required parameter 'externalOrganizationId' is set
            if (request.externalOrganizationId == null) {
                throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for PutExternalcontactsOrganizationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsOrganizationRequest.");
            }
            
			return request;
		}
	}
}
