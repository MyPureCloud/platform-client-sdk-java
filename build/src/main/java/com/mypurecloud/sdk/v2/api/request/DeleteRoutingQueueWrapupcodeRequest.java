package com.mypurecloud.sdk.v2.api.request;

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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;

public class DeleteRoutingQueueWrapupcodeRequest {
	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public DeleteRoutingQueueWrapupcodeRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	}

	private String codeId;
	public String getCodeId() {
		return this.codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public DeleteRoutingQueueWrapupcodeRequest withCodeId(String codeId) {
	    this.setCodeId(codeId);
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

    public DeleteRoutingQueueWrapupcodeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new IllegalStateException("Missing the required parameter 'queueId' when building request for DeleteRoutingQueueWrapupcodeRequest.");
        }
        
        // verify the required parameter 'codeId' is set
        if (this.codeId == null) {
            throw new IllegalStateException("Missing the required parameter 'codeId' when building request for DeleteRoutingQueueWrapupcodeRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}")
                .withPathParameter("queueId", queueId)
        
                .withPathParameter("codeId", codeId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String queueId, String codeId) {
	    return new Builder()
	            .withRequiredParams(queueId, codeId);
	}

	public static class Builder {
		private final DeleteRoutingQueueWrapupcodeRequest request;

		private Builder() {
			request = new DeleteRoutingQueueWrapupcodeRequest();
		}

		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		public Builder withCodeId(String codeId) {
			request.setCodeId(codeId);
			return this;
		}

		public Builder withRequiredParams(String queueId, String codeId) {
			request.setQueueId(queueId);
			request.setCodeId(codeId);
			return this;
		}


		public DeleteRoutingQueueWrapupcodeRequest build() {
            
            // verify the required parameter 'queueId' is set
            if (request.queueId == null) {
                throw new IllegalStateException("Missing the required parameter 'queueId' when building request for DeleteRoutingQueueWrapupcodeRequest.");
            }
            
            // verify the required parameter 'codeId' is set
            if (request.codeId == null) {
                throw new IllegalStateException("Missing the required parameter 'codeId' when building request for DeleteRoutingQueueWrapupcodeRequest.");
            }
            
			return request;
		}
	}
}
