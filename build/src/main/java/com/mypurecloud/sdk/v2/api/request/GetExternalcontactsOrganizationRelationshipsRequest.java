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
import com.mypurecloud.sdk.v2.model.CoretypeListing;
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

public class GetExternalcontactsOrganizationRelationshipsRequest {

	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public GetExternalcontactsOrganizationRelationshipsRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetExternalcontactsOrganizationRelationshipsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetExternalcontactsOrganizationRelationshipsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetExternalcontactsOrganizationRelationshipsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		EXTERNALDATASOURCES("externalDataSources"),
		DIVISION("division");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetExternalcontactsOrganizationRelationshipsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
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

    public GetExternalcontactsOrganizationRelationshipsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for GetExternalcontactsOrganizationRelationshipsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/externalcontacts/organizations/{externalOrganizationId}/relationships")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String externalOrganizationId) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId);
	}


	public static class Builder {
		private final GetExternalcontactsOrganizationRelationshipsRequest request;

		private Builder() {
			request = new GetExternalcontactsOrganizationRelationshipsRequest();
		}


		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		public Builder withRequiredParams(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);

			return this;
		}


		public GetExternalcontactsOrganizationRelationshipsRequest build() {
            
            // verify the required parameter 'externalOrganizationId' is set
            if (request.externalOrganizationId == null) {
                throw new IllegalStateException("Missing the required parameter 'externalOrganizationId' when building request for GetExternalcontactsOrganizationRelationshipsRequest.");
            }
            
			return request;
		}
	}
}
