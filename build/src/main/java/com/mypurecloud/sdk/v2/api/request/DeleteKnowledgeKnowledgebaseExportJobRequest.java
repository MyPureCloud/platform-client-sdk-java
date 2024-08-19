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
import com.mypurecloud.sdk.v2.model.DocumentVariation;
import com.mypurecloud.sdk.v2.model.DocumentVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.GuestCategoryResponseListing;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponseListing;
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
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
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
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestImport;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestPatch;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.LabelCreateRequest;
import com.mypurecloud.sdk.v2.model.LabelListing;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.LabelUpdateRequest;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OperationCreatorUserResponse;
import com.mypurecloud.sdk.v2.model.OperationListing;
import com.mypurecloud.sdk.v2.model.SearchUpdateRequest;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import com.mypurecloud.sdk.v2.model.UnansweredGroups;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupPatchRequestBody;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupUpdateResponse;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class DeleteKnowledgeKnowledgebaseExportJobRequest {

	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public DeleteKnowledgeKnowledgebaseExportJobRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 

	private String exportJobId;
	public String getExportJobId() {
		return this.exportJobId;
	}

	public void setExportJobId(String exportJobId) {
		this.exportJobId = exportJobId;
	}

	public DeleteKnowledgeKnowledgebaseExportJobRequest withExportJobId(String exportJobId) {
	    this.setExportJobId(exportJobId);
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

    public DeleteKnowledgeKnowledgebaseExportJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for DeleteKnowledgeKnowledgebaseExportJobRequest.");
        }
        
        // verify the required parameter 'exportJobId' is set
        if (this.exportJobId == null) {
            throw new IllegalStateException("Missing the required parameter 'exportJobId' when building request for DeleteKnowledgeKnowledgebaseExportJobRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/export/jobs/{exportJobId}")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("exportJobId", exportJobId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String knowledgeBaseId, String exportJobId) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, exportJobId);
	}


	public static class Builder {
		private final DeleteKnowledgeKnowledgebaseExportJobRequest request;

		private Builder() {
			request = new DeleteKnowledgeKnowledgebaseExportJobRequest();
		}


		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}

		public Builder withExportJobId(String exportJobId) {
			request.setExportJobId(exportJobId);
			return this;
		}



		public Builder withRequiredParams(String knowledgeBaseId, String exportJobId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			request.setExportJobId(exportJobId);

			return this;
		}


		public DeleteKnowledgeKnowledgebaseExportJobRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for DeleteKnowledgeKnowledgebaseExportJobRequest.");
            }
            
            // verify the required parameter 'exportJobId' is set
            if (request.exportJobId == null) {
                throw new IllegalStateException("Missing the required parameter 'exportJobId' when building request for DeleteKnowledgeKnowledgebaseExportJobRequest.");
            }
            
			return request;
		}
	}
}
