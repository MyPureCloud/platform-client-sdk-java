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

import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;

public class GetKnowledgeKnowledgebaseLanguageTrainingsRequest {
    
	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 
	
	private String languageCode;
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withLanguageCode(String languageCode) {
	    this.setLanguageCode(languageCode);
	    return this;
	} 

	public enum languageCodeValues { 
		EN_US("en-US"), 
		EN_UK("en-UK"), 
		EN_AU("en-AU"), 
		DE_DE("de-DE");

		private String value;

		languageCodeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static languageCodeValues fromString(String key) {
			if (key == null) return null;

			for (languageCodeValues value : languageCodeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return languageCodeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withBefore(String before) {
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

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 
	
	private String limit;
	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withLimit(String limit) {
	    this.setLimit(limit);
	    return this;
	} 
	
	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String knowledgeDocumentsState;
	public String getKnowledgeDocumentsState() {
		return this.knowledgeDocumentsState;
	}

	public void setKnowledgeDocumentsState(String knowledgeDocumentsState) {
		this.knowledgeDocumentsState = knowledgeDocumentsState;
	}

	public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withKnowledgeDocumentsState(String knowledgeDocumentsState) {
	    this.setKnowledgeDocumentsState(knowledgeDocumentsState);
	    return this;
	} 

	public enum knowledgeDocumentsStateValues { 
		DRAFT("Draft"), 
		ACTIVE("Active"), 
		DISCARDED("Discarded"), 
		ARCHIVED("Archived");

		private String value;

		knowledgeDocumentsStateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static knowledgeDocumentsStateValues fromString(String key) {
			if (key == null) return null;

			for (knowledgeDocumentsStateValues value : knowledgeDocumentsStateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return knowledgeDocumentsStateValues.values()[0];
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

    public GetKnowledgeKnowledgebaseLanguageTrainingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseLanguageTrainingsRequest.");
        }
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for GetKnowledgeKnowledgebaseLanguageTrainingsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("languageCode", languageCode)
        
                .withQueryParameters("before", "", before)
        
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("limit", "", limit)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("knowledgeDocumentsState", "", knowledgeDocumentsState)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String knowledgeBaseId, String languageCode) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, languageCode);
	}
	

	public static class Builder {
		private final GetKnowledgeKnowledgebaseLanguageTrainingsRequest request;

		private Builder() {
			request = new GetKnowledgeKnowledgebaseLanguageTrainingsRequest();
		}

		
		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}
		
		public Builder withLanguageCode(String languageCode) {
			request.setLanguageCode(languageCode);
			return this;
		}

		public Builder withLanguageCode(languageCodeValues languageCode) {
		    request.setLanguageCode(languageCode.toString());
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
		
		public Builder withLimit(String limit) {
			request.setLimit(limit);
			return this;
		}
		
		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withKnowledgeDocumentsState(String knowledgeDocumentsState) {
			request.setKnowledgeDocumentsState(knowledgeDocumentsState);
			return this;
		}

		public Builder withKnowledgeDocumentsState(knowledgeDocumentsStateValues knowledgeDocumentsState) {
		    request.setKnowledgeDocumentsState(knowledgeDocumentsState.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String knowledgeBaseId, String languageCode) {
			request.setKnowledgeBaseId(knowledgeBaseId);
						request.setLanguageCode(languageCode);
			
			return this;
		}
		

		public GetKnowledgeKnowledgebaseLanguageTrainingsRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for GetKnowledgeKnowledgebaseLanguageTrainingsRequest.");
            }
            
            // verify the required parameter 'languageCode' is set
            if (request.languageCode == null) {
                throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for GetKnowledgeKnowledgebaseLanguageTrainingsRequest.");
            }
            
			return request;
		}
	}
}
