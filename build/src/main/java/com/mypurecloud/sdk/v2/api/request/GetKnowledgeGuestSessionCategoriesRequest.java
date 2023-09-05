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
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.DocumentVariation;
import com.mypurecloud.sdk.v2.model.DocumentVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearchRequest;
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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocument;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSession;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.LabelCreateRequest;
import com.mypurecloud.sdk.v2.model.LabelListing;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.LabelUpdateRequest;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.SearchUpdateRequest;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import com.mypurecloud.sdk.v2.model.UnansweredGroups;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupPatchRequestBody;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupUpdateResponse;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class GetKnowledgeGuestSessionCategoriesRequest {

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withBefore(String before) {
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

	public GetKnowledgeGuestSessionCategoriesRequest withAfter(String after) {
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

	public GetKnowledgeGuestSessionCategoriesRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String parentId;
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withParentId(String parentId) {
	    this.setParentId(parentId);
	    return this;
	} 

	private Boolean isRoot;
	public Boolean getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withIsRoot(Boolean isRoot) {
	    this.setIsRoot(isRoot);
	    return this;
	} 

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		NAME("Name"),
		HIERARCHY("Hierarchy");

		private String value;

		sortByValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortByValues fromString(String key) {
			if (key == null) return null;

			for (sortByValues value : sortByValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortByValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	private Boolean includeDocumentCount;
	public Boolean getIncludeDocumentCount() {
		return this.includeDocumentCount;
	}

	public void setIncludeDocumentCount(Boolean includeDocumentCount) {
		this.includeDocumentCount = includeDocumentCount;
	}

	public GetKnowledgeGuestSessionCategoriesRequest withIncludeDocumentCount(Boolean includeDocumentCount) {
	    this.setIncludeDocumentCount(includeDocumentCount);
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

    public GetKnowledgeGuestSessionCategoriesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetKnowledgeGuestSessionCategoriesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/knowledge/guest/sessions/{sessionId}/categories")
                .withPathParameter("sessionId", sessionId)
        

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("parentId", "", parentId)
        

                .withQueryParameters("isRoot", "", isRoot)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("expand", "", expand)
        

                .withQueryParameters("includeDocumentCount", "", includeDocumentCount)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String sessionId) {
	    return new Builder()
	            .withRequiredParams(sessionId);
	}


	public static class Builder {
		private final GetKnowledgeGuestSessionCategoriesRequest request;

		private Builder() {
			request = new GetKnowledgeGuestSessionCategoriesRequest();
		}


		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
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

		public Builder withParentId(String parentId) {
			request.setParentId(parentId);
			return this;
		}

		public Builder withIsRoot(Boolean isRoot) {
			request.setIsRoot(isRoot);
			return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}



		
		public Builder withSortBy(sortByValues sortBy) {
		    request.setSortBy(sortBy.toString());

		    return this;
		}

		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withIncludeDocumentCount(Boolean includeDocumentCount) {
			request.setIncludeDocumentCount(includeDocumentCount);
			return this;
		}



		public Builder withRequiredParams(String sessionId) {
			request.setSessionId(sessionId);

			return this;
		}


		public GetKnowledgeGuestSessionCategoriesRequest build() {
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetKnowledgeGuestSessionCategoriesRequest.");
            }
            
			return request;
		}
	}
}
