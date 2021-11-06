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
import com.mypurecloud.sdk.v2.model.KnowledgeContextResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeContextRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeContextValueResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeContextValueRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;

public class PatchKnowledgeKnowledgebaseContextRequest {
    
	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public PatchKnowledgeKnowledgebaseContextRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 
	
	private String contextId;
	public String getContextId() {
		return this.contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public PatchKnowledgeKnowledgebaseContextRequest withContextId(String contextId) {
	    this.setContextId(contextId);
	    return this;
	} 
	
	private KnowledgeContextRequest body;
	public KnowledgeContextRequest getBody() {
		return this.body;
	}

	public void setBody(KnowledgeContextRequest body) {
		this.body = body;
	}

	public PatchKnowledgeKnowledgebaseContextRequest withBody(KnowledgeContextRequest body) {
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

    public PatchKnowledgeKnowledgebaseContextRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<KnowledgeContextRequest> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseContextRequest.");
        }
        
        // verify the required parameter 'contextId' is set
        if (this.contextId == null) {
            throw new IllegalStateException("Missing the required parameter 'contextId' when building request for PatchKnowledgeKnowledgebaseContextRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/contexts/{contextId}")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("contextId", contextId)
        
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

	
	public static Builder builder(String knowledgeBaseId, String contextId) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, contextId);
	}
	

	public static class Builder {
		private final PatchKnowledgeKnowledgebaseContextRequest request;

		private Builder() {
			request = new PatchKnowledgeKnowledgebaseContextRequest();
		}

		
		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}
		
		public Builder withContextId(String contextId) {
			request.setContextId(contextId);
			return this;
		}
		
		public Builder withBody(KnowledgeContextRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String knowledgeBaseId, String contextId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
						request.setContextId(contextId);
			
			return this;
		}
		

		public PatchKnowledgeKnowledgebaseContextRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseContextRequest.");
            }
            
            // verify the required parameter 'contextId' is set
            if (request.contextId == null) {
                throw new IllegalStateException("Missing the required parameter 'contextId' when building request for PatchKnowledgeKnowledgebaseContextRequest.");
            }
            
			return request;
		}
	}
}
