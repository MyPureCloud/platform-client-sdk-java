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

import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CategoryCreateRequest;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.CategoryResponse;
import com.mypurecloud.sdk.v2.model.CategoryResponseListing;
import com.mypurecloud.sdk.v2.model.CategoryUpdateRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobResponse;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.DocumentVariationRequest;
import com.mypurecloud.sdk.v2.model.DocumentVariationResponse;
import com.mypurecloud.sdk.v2.model.DocumentVariationResponseListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.GuestCategoryResponseListing;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseCreateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkVersionAddRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentContentUpload;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentCreateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentReq;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariationListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentsAnswerFilter;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSession;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeIntegrationOptionsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestImport;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestPatch;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.LabelCreateRequest;
import com.mypurecloud.sdk.v2.model.LabelListing;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.LabelUpdateRequest;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OperationCreatorUserResponse;
import com.mypurecloud.sdk.v2.model.OperationListing;
import com.mypurecloud.sdk.v2.model.SalesforceSourceRequest;
import com.mypurecloud.sdk.v2.model.SalesforceSourceResponse;
import com.mypurecloud.sdk.v2.model.SearchUpdateRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceResponse;
import com.mypurecloud.sdk.v2.model.SourceBaseResponse;
import com.mypurecloud.sdk.v2.model.SourceSyncResponse;
import com.mypurecloud.sdk.v2.model.SyncStatusRequest;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import com.mypurecloud.sdk.v2.model.UnansweredGroups;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupPatchRequestBody;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupUpdateResponse;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class GetKnowledgeKnowledgebaseSourcesRequest {

	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public GetKnowledgeKnowledgebaseSourcesRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetKnowledgeKnowledgebaseSourcesRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		SALESFORCE("Salesforce"),
		SERVICENOW("ServiceNow");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetKnowledgeKnowledgebaseSourcesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		LASTSYNC("lastsync");

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

	private List<String> ids;
	public List<String> getIds() {
		return this.ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public GetKnowledgeKnowledgebaseSourcesRequest withIds(List<String> ids) {
	    this.setIds(ids);
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

    public GetKnowledgeKnowledgebaseSourcesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseSourcesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/sources")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        

                .withQueryParameters("type", "", type)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("ids", "multi", ids)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String knowledgeBaseId) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId);
	}


	public static class Builder {
		private final GetKnowledgeKnowledgebaseSourcesRequest request;

		private Builder() {
			request = new GetKnowledgeKnowledgebaseSourcesRequest();
		}


		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}

		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		
		public Builder withType(typeValues type) {
		    request.setType(type.toString());

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

		public Builder withIds(List<String> ids) {
			request.setIds(ids);
			return this;
		}



		public Builder withRequiredParams(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);

			return this;
		}


		public GetKnowledgeKnowledgebaseSourcesRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseSourcesRequest.");
            }
            
			return request;
		}
	}
}
