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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PushDeviceInsertRequest;
import com.mypurecloud.sdk.v2.model.PushDeviceUpdateRequest;
import com.mypurecloud.sdk.v2.model.WebMessagingMessageEntityList;

public class PatchWebmessagingDeploymentPushdeviceRequest {

	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public PatchWebmessagingDeploymentPushdeviceRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 

	private String tokenId;
	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public PatchWebmessagingDeploymentPushdeviceRequest withTokenId(String tokenId) {
	    this.setTokenId(tokenId);
	    return this;
	} 

	private PushDeviceUpdateRequest body;
	public PushDeviceUpdateRequest getBody() {
		return this.body;
	}

	public void setBody(PushDeviceUpdateRequest body) {
		this.body = body;
	}

	public PatchWebmessagingDeploymentPushdeviceRequest withBody(PushDeviceUpdateRequest body) {
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

    public PatchWebmessagingDeploymentPushdeviceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PushDeviceUpdateRequest> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
        }
        
        // verify the required parameter 'tokenId' is set
        if (this.tokenId == null) {
            throw new IllegalStateException("Missing the required parameter 'tokenId' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/webmessaging/deployments/{deploymentId}/pushdevices/{tokenId}")
                .withPathParameter("deploymentId", deploymentId)
        
                .withPathParameter("tokenId", tokenId)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String deploymentId, String tokenId, PushDeviceUpdateRequest body) {
	    return new Builder()
	            .withRequiredParams(deploymentId, tokenId, body);
	}


	public static class Builder {
		private final PatchWebmessagingDeploymentPushdeviceRequest request;

		private Builder() {
			request = new PatchWebmessagingDeploymentPushdeviceRequest();
		}


		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}

		public Builder withTokenId(String tokenId) {
			request.setTokenId(tokenId);
			return this;
		}

		public Builder withBody(PushDeviceUpdateRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String deploymentId, String tokenId, PushDeviceUpdateRequest body) {
			request.setDeploymentId(deploymentId);
			request.setTokenId(tokenId);
			request.setBody(body);

			return this;
		}


		public PatchWebmessagingDeploymentPushdeviceRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
            }
            
            // verify the required parameter 'tokenId' is set
            if (request.tokenId == null) {
                throw new IllegalStateException("Missing the required parameter 'tokenId' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchWebmessagingDeploymentPushdeviceRequest.");
            }
            
			return request;
		}
	}
}
