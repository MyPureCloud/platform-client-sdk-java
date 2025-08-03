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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentChunkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentChunkResponse;
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

public class GetKnowledgeKnowledgebaseDocumentFeedbackRequest {

	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 

	private String documentId;
	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withDocumentId(String documentId) {
	    this.setDocumentId(documentId);
	    return this;
	} 

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Boolean onlyCommented;
	public Boolean getOnlyCommented() {
		return this.onlyCommented;
	}

	public void setOnlyCommented(Boolean onlyCommented) {
		this.onlyCommented = onlyCommented;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withOnlyCommented(Boolean onlyCommented) {
	    this.setOnlyCommented(onlyCommented);
	    return this;
	} 

	private String documentVersionId;
	public String getDocumentVersionId() {
		return this.documentVersionId;
	}

	public void setDocumentVersionId(String documentVersionId) {
		this.documentVersionId = documentVersionId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withDocumentVersionId(String documentVersionId) {
	    this.setDocumentVersionId(documentVersionId);
	    return this;
	} 

	private String documentVariationId;
	public String getDocumentVariationId() {
		return this.documentVariationId;
	}

	public void setDocumentVariationId(String documentVariationId) {
		this.documentVariationId = documentVariationId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withDocumentVariationId(String documentVariationId) {
	    this.setDocumentVariationId(documentVariationId);
	    return this;
	} 

	private String appType;
	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withAppType(String appType) {
	    this.setAppType(appType);
	    return this;
	} 

	public enum appTypeValues { 
		ASSISTANT("Assistant"),
		BOTFLOW("BotFlow"),
		MESSENGERKNOWLEDGEAPP("MessengerKnowledgeApp"),
		SMARTADVISOR("SmartAdvisor"),
		SUPPORTCENTER("SupportCenter");

		private String value;

		appTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static appTypeValues fromString(String key) {
			if (key == null) return null;

			for (appTypeValues value : appTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return appTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String queryType;
	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withQueryType(String queryType) {
	    this.setQueryType(queryType);
	    return this;
	} 

	public enum queryTypeValues { 
		UNKNOWN("Unknown"),
		ARTICLE("Article"),
		AUTOSEARCH("AutoSearch"),
		CATEGORY("Category"),
		MANUALSEARCH("ManualSearch"),
		RECOMMENDATION("Recommendation"),
		SUGGESTION("Suggestion"),
		EXPANDEDARTICLE("ExpandedArticle");

		private String value;

		queryTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static queryTypeValues fromString(String key) {
			if (key == null) return null;

			for (queryTypeValues value : queryTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return queryTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 

	private String state;
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withState(String state) {
	    this.setState(state);
	    return this;
	} 

	public enum stateValues { 
		ALL("All"),
		DRAFT("Draft"),
		FINAL("Final");

		private String value;

		stateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static stateValues fromString(String key) {
			if (key == null) return null;

			for (stateValues value : stateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return stateValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetKnowledgeKnowledgebaseDocumentFeedbackRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseDocumentFeedbackRequest.");
        }
        
        // verify the required parameter 'documentId' is set
        if (this.documentId == null) {
            throw new IllegalStateException("Missing the required parameter 'documentId' when building request for GetKnowledgeKnowledgebaseDocumentFeedbackRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/documents/{documentId}/feedback")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("documentId", documentId)
        

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("onlyCommented", "", onlyCommented)
        

                .withQueryParameters("documentVersionId", "", documentVersionId)
        

                .withQueryParameters("documentVariationId", "", documentVariationId)
        

                .withQueryParameters("appType", "", appType)
        

                .withQueryParameters("queryType", "", queryType)
        

                .withQueryParameters("userId", "", userId)
        

                .withQueryParameters("queueId", "", queueId)
        

                .withQueryParameters("state", "", state)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String knowledgeBaseId, String documentId) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, documentId);
	}


	public static class Builder {
		private final GetKnowledgeKnowledgebaseDocumentFeedbackRequest request;

		private Builder() {
			request = new GetKnowledgeKnowledgebaseDocumentFeedbackRequest();
		}


		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}

		public Builder withDocumentId(String documentId) {
			request.setDocumentId(documentId);
			return this;
		}

		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withOnlyCommented(Boolean onlyCommented) {
			request.setOnlyCommented(onlyCommented);
			return this;
		}

		public Builder withDocumentVersionId(String documentVersionId) {
			request.setDocumentVersionId(documentVersionId);
			return this;
		}

		public Builder withDocumentVariationId(String documentVariationId) {
			request.setDocumentVariationId(documentVariationId);
			return this;
		}

		public Builder withAppType(String appType) {
			request.setAppType(appType);
			return this;
		}



		
		public Builder withAppType(appTypeValues appType) {
		    request.setAppType(appType.toString());

		    return this;
		}

		public Builder withQueryType(String queryType) {
			request.setQueryType(queryType);
			return this;
		}



		
		public Builder withQueryType(queryTypeValues queryType) {
		    request.setQueryType(queryType.toString());

		    return this;
		}

		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}

		public Builder withState(String state) {
			request.setState(state);
			return this;
		}



		
		public Builder withState(stateValues state) {
		    request.setState(state.toString());

		    return this;
		}



		public Builder withRequiredParams(String knowledgeBaseId, String documentId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			request.setDocumentId(documentId);

			return this;
		}


		public GetKnowledgeKnowledgebaseDocumentFeedbackRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseDocumentFeedbackRequest.");
            }
            
            // verify the required parameter 'documentId' is set
            if (request.documentId == null) {
                throw new IllegalStateException("Missing the required parameter 'documentId' when building request for GetKnowledgeKnowledgebaseDocumentFeedbackRequest.");
            }
            
			return request;
		}
	}
}
