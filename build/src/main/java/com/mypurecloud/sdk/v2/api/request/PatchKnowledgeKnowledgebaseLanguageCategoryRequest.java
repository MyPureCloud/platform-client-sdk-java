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

public class PatchKnowledgeKnowledgebaseLanguageCategoryRequest {
    
	private String categoryId;
	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public PatchKnowledgeKnowledgebaseLanguageCategoryRequest withCategoryId(String categoryId) {
	    this.setCategoryId(categoryId);
	    return this;
	} 
	
	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public PatchKnowledgeKnowledgebaseLanguageCategoryRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

	public PatchKnowledgeKnowledgebaseLanguageCategoryRequest withLanguageCode(String languageCode) {
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
	
	private KnowledgeCategoryRequest body;
	public KnowledgeCategoryRequest getBody() {
		return this.body;
	}

	public void setBody(KnowledgeCategoryRequest body) {
		this.body = body;
	}

	public PatchKnowledgeKnowledgebaseLanguageCategoryRequest withBody(KnowledgeCategoryRequest body) {
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

    public PatchKnowledgeKnowledgebaseLanguageCategoryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<KnowledgeCategoryRequest> withHttpInfo() {
        
        // verify the required parameter 'categoryId' is set
        if (this.categoryId == null) {
            throw new IllegalStateException("Missing the required parameter 'categoryId' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
        }
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
        }
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}")
                .withPathParameter("categoryId", categoryId)
        
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("languageCode", languageCode)
        
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

	
	public static Builder builder(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
	    return new Builder()
	            .withRequiredParams(categoryId, knowledgeBaseId, languageCode, body);
	}
	

	public static class Builder {
		private final PatchKnowledgeKnowledgebaseLanguageCategoryRequest request;

		private Builder() {
			request = new PatchKnowledgeKnowledgebaseLanguageCategoryRequest();
		}

		
		public Builder withCategoryId(String categoryId) {
			request.setCategoryId(categoryId);
			return this;
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
		
		public Builder withBody(KnowledgeCategoryRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
			request.setCategoryId(categoryId);
						request.setKnowledgeBaseId(knowledgeBaseId);
						request.setLanguageCode(languageCode);
						request.setBody(body);
			
			return this;
		}
		

		public PatchKnowledgeKnowledgebaseLanguageCategoryRequest build() {
            
            // verify the required parameter 'categoryId' is set
            if (request.categoryId == null) {
                throw new IllegalStateException("Missing the required parameter 'categoryId' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
            }
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
            }
            
            // verify the required parameter 'languageCode' is set
            if (request.languageCode == null) {
                throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchKnowledgeKnowledgebaseLanguageCategoryRequest.");
            }
            
			return request;
		}
	}
}
