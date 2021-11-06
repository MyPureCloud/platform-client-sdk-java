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

public class PatchKnowledgeKnowledgebaseContextValueRequest {
    
	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public PatchKnowledgeKnowledgebaseContextValueRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

	public PatchKnowledgeKnowledgebaseContextValueRequest withContextId(String contextId) {
	    this.setContextId(contextId);
	    return this;
	} 
	
	private String contextValueId;
	public String getContextValueId() {
		return this.contextValueId;
	}

	public void setContextValueId(String contextValueId) {
		this.contextValueId = contextValueId;
	}

	public PatchKnowledgeKnowledgebaseContextValueRequest withContextValueId(String contextValueId) {
	    this.setContextValueId(contextValueId);
	    return this;
	} 
	
	private KnowledgeContextValueRequest body;
	public KnowledgeContextValueRequest getBody() {
		return this.body;
	}

	public void setBody(KnowledgeContextValueRequest body) {
		this.body = body;
	}

	public PatchKnowledgeKnowledgebaseContextValueRequest withBody(KnowledgeContextValueRequest body) {
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

    public PatchKnowledgeKnowledgebaseContextValueRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<KnowledgeContextValueRequest> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
        }
        
        // verify the required parameter 'contextId' is set
        if (this.contextId == null) {
            throw new IllegalStateException("Missing the required parameter 'contextId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
        }
        
        // verify the required parameter 'contextValueId' is set
        if (this.contextValueId == null) {
            throw new IllegalStateException("Missing the required parameter 'contextValueId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/contexts/{contextId}/values/{contextValueId}")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("contextId", contextId)
        
                .withPathParameter("contextValueId", contextValueId)
        
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

	
	public static Builder builder(String knowledgeBaseId, String contextId, String contextValueId) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, contextId, contextValueId);
	}
	

	public static class Builder {
		private final PatchKnowledgeKnowledgebaseContextValueRequest request;

		private Builder() {
			request = new PatchKnowledgeKnowledgebaseContextValueRequest();
		}

		
		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}
		
		public Builder withContextId(String contextId) {
			request.setContextId(contextId);
			return this;
		}
		
		public Builder withContextValueId(String contextValueId) {
			request.setContextValueId(contextValueId);
			return this;
		}
		
		public Builder withBody(KnowledgeContextValueRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String knowledgeBaseId, String contextId, String contextValueId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
						request.setContextId(contextId);
						request.setContextValueId(contextValueId);
			
			return this;
		}
		

		public PatchKnowledgeKnowledgebaseContextValueRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
            }
            
            // verify the required parameter 'contextId' is set
            if (request.contextId == null) {
                throw new IllegalStateException("Missing the required parameter 'contextId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
            }
            
            // verify the required parameter 'contextValueId' is set
            if (request.contextValueId == null) {
                throw new IllegalStateException("Missing the required parameter 'contextValueId' when building request for PatchKnowledgeKnowledgebaseContextValueRequest.");
            }
            
			return request;
		}
	}
}
