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
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;

public class GetKnowledgeKnowledgebasesRequest {
    
	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetKnowledgeKnowledgebasesRequest withBefore(String before) {
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

	public GetKnowledgeKnowledgebasesRequest withAfter(String after) {
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

	public GetKnowledgeKnowledgebasesRequest withLimit(String limit) {
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

	public GetKnowledgeKnowledgebasesRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetKnowledgeKnowledgebasesRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private String coreLanguage;
	public String getCoreLanguage() {
		return this.coreLanguage;
	}

	public void setCoreLanguage(String coreLanguage) {
		this.coreLanguage = coreLanguage;
	}

	public GetKnowledgeKnowledgebasesRequest withCoreLanguage(String coreLanguage) {
	    this.setCoreLanguage(coreLanguage);
	    return this;
	} 

	public enum coreLanguageValues { 
		EN_US("en-US"), 
		DE_DE("de-DE");

		private String value;

		coreLanguageValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static coreLanguageValues fromString(String key) {
			if (key == null) return null;

			for (coreLanguageValues value : coreLanguageValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return coreLanguageValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean published;
	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public GetKnowledgeKnowledgebasesRequest withPublished(Boolean published) {
	    this.setPublished(published);
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

    public GetKnowledgeKnowledgebasesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/knowledge/knowledgebases")
                .withQueryParameters("before", "", before)
        
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("limit", "", limit)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("coreLanguage", "", coreLanguage)
        
                .withQueryParameters("published", "", published)
        
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
		private final GetKnowledgeKnowledgebasesRequest request;

		private Builder() {
			request = new GetKnowledgeKnowledgebasesRequest();
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
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withCoreLanguage(String coreLanguage) {
			request.setCoreLanguage(coreLanguage);
			return this;
		}

		public Builder withCoreLanguage(coreLanguageValues coreLanguage) {
		    request.setCoreLanguage(coreLanguage.toString());
		    return this;
		}
		
		public Builder withPublished(Boolean published) {
			request.setPublished(published);
			return this;
		}
		

		

		public GetKnowledgeKnowledgebasesRequest build() {
            
			return request;
		}
	}
}
