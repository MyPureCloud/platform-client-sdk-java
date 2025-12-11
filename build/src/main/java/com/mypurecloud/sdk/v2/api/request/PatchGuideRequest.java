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

import com.mypurecloud.sdk.v2.model.CreateGuide;
import com.mypurecloud.sdk.v2.model.CreateGuideVersion;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GenerateGuideContentRequest;
import com.mypurecloud.sdk.v2.model.Guide;
import com.mypurecloud.sdk.v2.model.GuideContentGenerationJob;
import com.mypurecloud.sdk.v2.model.GuideEntityListing;
import com.mypurecloud.sdk.v2.model.GuideJob;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnRequest;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnResponse;
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.SummarySetting;
import com.mypurecloud.sdk.v2.model.SummarySettingEntityListing;
import com.mypurecloud.sdk.v2.model.SummarySettingWithTranscript;
import com.mypurecloud.sdk.v2.model.UpdateGuide;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;

public class PatchGuideRequest {

	private String guideId;
	public String getGuideId() {
		return this.guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public PatchGuideRequest withGuideId(String guideId) {
	    this.setGuideId(guideId);
	    return this;
	} 

	private UpdateGuide body;
	public UpdateGuide getBody() {
		return this.body;
	}

	public void setBody(UpdateGuide body) {
		this.body = body;
	}

	public PatchGuideRequest withBody(UpdateGuide body) {
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

    public PatchGuideRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UpdateGuide> withHttpInfo() {
        
        // verify the required parameter 'guideId' is set
        if (this.guideId == null) {
            throw new IllegalStateException("Missing the required parameter 'guideId' when building request for PatchGuideRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchGuideRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/guides/{guideId}")
                .withPathParameter("guideId", guideId)
        
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


	public static Builder builder(String guideId, UpdateGuide body) {
	    return new Builder()
	            .withRequiredParams(guideId, body);
	}


	public static class Builder {
		private final PatchGuideRequest request;

		private Builder() {
			request = new PatchGuideRequest();
		}


		public Builder withGuideId(String guideId) {
			request.setGuideId(guideId);
			return this;
		}

		public Builder withBody(UpdateGuide body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String guideId, UpdateGuide body) {
			request.setGuideId(guideId);
			request.setBody(body);

			return this;
		}


		public PatchGuideRequest build() {
            
            // verify the required parameter 'guideId' is set
            if (request.guideId == null) {
                throw new IllegalStateException("Missing the required parameter 'guideId' when building request for PatchGuideRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchGuideRequest.");
            }
            
			return request;
		}
	}
}
