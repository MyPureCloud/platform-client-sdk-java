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

public class GetExternalcontactsOrganizationsRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetExternalcontactsOrganizationsRequest withPageSize(Integer pageSize) {
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

	public GetExternalcontactsOrganizationsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String q;
	public String getQ() {
		return this.q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public GetExternalcontactsOrganizationsRequest withQ(String q) {
	    this.setQ(q);
	    return this;
	} 

	private List<String> trustorId;
	public List<String> getTrustorId() {
		return this.trustorId;
	}

	public void setTrustorId(List<String> trustorId) {
		this.trustorId = trustorId;
	}

	public GetExternalcontactsOrganizationsRequest withTrustorId(List<String> trustorId) {
	    this.setTrustorId(trustorId);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetExternalcontactsOrganizationsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetExternalcontactsOrganizationsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		EXTERNALDATASOURCES("externalDataSources"),
		DIVISION("division"),
		IDENTIFIERS("identifiers"),
		EXTERNALSOURCES("externalSources");

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

	private Boolean includeTrustors;
	public Boolean getIncludeTrustors() {
		return this.includeTrustors;
	}

	public void setIncludeTrustors(Boolean includeTrustors) {
		this.includeTrustors = includeTrustors;
	}

	public GetExternalcontactsOrganizationsRequest withIncludeTrustors(Boolean includeTrustors) {
	    this.setIncludeTrustors(includeTrustors);
	    return this;
	} 

	private List<String> divisionIds;
	public List<String> getDivisionIds() {
		return this.divisionIds;
	}

	public void setDivisionIds(List<String> divisionIds) {
		this.divisionIds = divisionIds;
	}

	public GetExternalcontactsOrganizationsRequest withDivisionIds(List<String> divisionIds) {
	    this.setDivisionIds(divisionIds);
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

    public GetExternalcontactsOrganizationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/externalcontacts/organizations")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("q", "", q)
        

                .withQueryParameters("trustorId", "multi", trustorId)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("includeTrustors", "", includeTrustors)
        

                .withQueryParameters("divisionIds", "multi", divisionIds)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}



	public static class Builder {
		private final GetExternalcontactsOrganizationsRequest request;

		private Builder() {
			request = new GetExternalcontactsOrganizationsRequest();
		}


		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withQ(String q) {
			request.setQ(q);
			return this;
		}

		public Builder withTrustorId(List<String> trustorId) {
			request.setTrustorId(trustorId);
			return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
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

		public Builder withIncludeTrustors(Boolean includeTrustors) {
			request.setIncludeTrustors(includeTrustors);
			return this;
		}

		public Builder withDivisionIds(List<String> divisionIds) {
			request.setDivisionIds(divisionIds);
			return this;
		}




		public GetExternalcontactsOrganizationsRequest build() {
            
			return request;
		}
	}
}
