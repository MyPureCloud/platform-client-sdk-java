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

import com.mypurecloud.sdk.v2.model.CategoriesEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryRequest;
import com.mypurecloud.sdk.v2.model.CommunicationTranslationList;
import com.mypurecloud.sdk.v2.model.ConversationCategoriesEntityListing;
import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.CreateReprocessJobRequest;
import com.mypurecloud.sdk.v2.model.DeleteProgramResponse;
import com.mypurecloud.sdk.v2.model.DictionaryFeedback;
import com.mypurecloud.sdk.v2.model.DictionaryFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GeneralProgramJob;
import com.mypurecloud.sdk.v2.model.GeneralProgramJobRequest;
import com.mypurecloud.sdk.v2.model.GeneralTopicsEntityListing;
import com.mypurecloud.sdk.v2.model.InsightsSettingsRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ProgramInsightsSettings;
import com.mypurecloud.sdk.v2.model.ProgramInsightsSettingsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramJob;
import com.mypurecloud.sdk.v2.model.ProgramJobRequest;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngines;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.ReprocessInteractionsByJobIdResponse;
import com.mypurecloud.sdk.v2.model.ReprocessJobEntityListingResponse;
import com.mypurecloud.sdk.v2.model.ReprocessJobResponse;
import com.mypurecloud.sdk.v2.model.SentimentData;
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import com.mypurecloud.sdk.v2.model.SentimentFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsConversationSummaryListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.StaCategory;
import com.mypurecloud.sdk.v2.model.SupportedDialectsEntityListing;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJob;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJobRequest;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJobs;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.TopicJob;
import com.mypurecloud.sdk.v2.model.TopicJobRequest;
import com.mypurecloud.sdk.v2.model.TopicRequest;
import com.mypurecloud.sdk.v2.model.TopicsDefinitionsProgramMappings;
import com.mypurecloud.sdk.v2.model.TopicsDefinitionsProgramsMappingsEntityListing;
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.TranscriptUrls;
import com.mypurecloud.sdk.v2.model.TranscriptionEnginesRequest;
import com.mypurecloud.sdk.v2.model.TranslateSupportedLanguageList;
import com.mypurecloud.sdk.v2.model.UnifiedGeneralTopicEntityListing;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;

public class PutSpeechandtextanalyticsProgramTranscriptionenginesRequest {

	private String programId;
	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public PutSpeechandtextanalyticsProgramTranscriptionenginesRequest withProgramId(String programId) {
	    this.setProgramId(programId);
	    return this;
	} 

	private TranscriptionEnginesRequest body;
	public TranscriptionEnginesRequest getBody() {
		return this.body;
	}

	public void setBody(TranscriptionEnginesRequest body) {
		this.body = body;
	}

	public PutSpeechandtextanalyticsProgramTranscriptionenginesRequest withBody(TranscriptionEnginesRequest body) {
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

    public PutSpeechandtextanalyticsProgramTranscriptionenginesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TranscriptionEnginesRequest> withHttpInfo() {
        
        // verify the required parameter 'programId' is set
        if (this.programId == null) {
            throw new IllegalStateException("Missing the required parameter 'programId' when building request for PutSpeechandtextanalyticsProgramTranscriptionenginesRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutSpeechandtextanalyticsProgramTranscriptionenginesRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/speechandtextanalytics/programs/{programId}/transcriptionengines")
                .withPathParameter("programId", programId)
        
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


	public static Builder builder(String programId, TranscriptionEnginesRequest body) {
	    return new Builder()
	            .withRequiredParams(programId, body);
	}


	public static class Builder {
		private final PutSpeechandtextanalyticsProgramTranscriptionenginesRequest request;

		private Builder() {
			request = new PutSpeechandtextanalyticsProgramTranscriptionenginesRequest();
		}


		public Builder withProgramId(String programId) {
			request.setProgramId(programId);
			return this;
		}

		public Builder withBody(TranscriptionEnginesRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String programId, TranscriptionEnginesRequest body) {
			request.setProgramId(programId);
			request.setBody(body);

			return this;
		}


		public PutSpeechandtextanalyticsProgramTranscriptionenginesRequest build() {
            
            // verify the required parameter 'programId' is set
            if (request.programId == null) {
                throw new IllegalStateException("Missing the required parameter 'programId' when building request for PutSpeechandtextanalyticsProgramTranscriptionenginesRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutSpeechandtextanalyticsProgramTranscriptionenginesRequest.");
            }
            
			return request;
		}
	}
}
