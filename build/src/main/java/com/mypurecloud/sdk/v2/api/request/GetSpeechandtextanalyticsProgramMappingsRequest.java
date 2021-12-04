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
import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralProgramJob;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramJob;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.SentimentFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralTopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TopicJob;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.GeneralProgramJobRequest;
import com.mypurecloud.sdk.v2.model.ProgramJobRequest;
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import com.mypurecloud.sdk.v2.model.TopicRequest;
import com.mypurecloud.sdk.v2.model.TopicJobRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;

public class GetSpeechandtextanalyticsProgramMappingsRequest {
    
	private String programId;
	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public GetSpeechandtextanalyticsProgramMappingsRequest withProgramId(String programId) {
	    this.setProgramId(programId);
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

    public GetSpeechandtextanalyticsProgramMappingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'programId' is set
        if (this.programId == null) {
            throw new IllegalStateException("Missing the required parameter 'programId' when building request for GetSpeechandtextanalyticsProgramMappingsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/speechandtextanalytics/programs/{programId}/mappings")
                .withPathParameter("programId", programId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String programId) {
	    return new Builder()
	            .withRequiredParams(programId);
	}
	

	public static class Builder {
		private final GetSpeechandtextanalyticsProgramMappingsRequest request;

		private Builder() {
			request = new GetSpeechandtextanalyticsProgramMappingsRequest();
		}

		
		public Builder withProgramId(String programId) {
			request.setProgramId(programId);
			return this;
		}
		

		
		public Builder withRequiredParams(String programId) {
			request.setProgramId(programId);
			
			return this;
		}
		

		public GetSpeechandtextanalyticsProgramMappingsRequest build() {
            
            // verify the required parameter 'programId' is set
            if (request.programId == null) {
                throw new IllegalStateException("Missing the required parameter 'programId' when building request for GetSpeechandtextanalyticsProgramMappingsRequest.");
            }
            
			return request;
		}
	}
}
