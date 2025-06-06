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
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngines;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
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
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.TranscriptUrls;
import com.mypurecloud.sdk.v2.model.TranscriptionEnginesRequest;
import com.mypurecloud.sdk.v2.model.TranslateSupportedLanguageList;
import com.mypurecloud.sdk.v2.model.UnifiedGeneralTopicEntityListing;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;

public class GetSpeechandtextanalyticsTranslationsLanguageConversationRequest {

	private String languageId;
	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest withLanguageId(String languageId) {
	    this.setLanguageId(languageId);
	    return this;
	} 

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 

	private String communicationId;
	public String getCommunicationId() {
		return this.communicationId;
	}

	public void setCommunicationId(String communicationId) {
		this.communicationId = communicationId;
	}

	public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest withCommunicationId(String communicationId) {
	    this.setCommunicationId(communicationId);
	    return this;
	} 

	private String recordingId;
	public String getRecordingId() {
		return this.recordingId;
	}

	public void setRecordingId(String recordingId) {
		this.recordingId = recordingId;
	}

	public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest withRecordingId(String recordingId) {
	    this.setRecordingId(recordingId);
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

    public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'languageId' is set
        if (this.languageId == null) {
            throw new IllegalStateException("Missing the required parameter 'languageId' when building request for GetSpeechandtextanalyticsTranslationsLanguageConversationRequest.");
        }
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetSpeechandtextanalyticsTranslationsLanguageConversationRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/speechandtextanalytics/translations/languages/{languageId}/conversations/{conversationId}")
                .withPathParameter("languageId", languageId)
        
                .withPathParameter("conversationId", conversationId)
        

                .withQueryParameters("communicationId", "", communicationId)
        

                .withQueryParameters("recordingId", "", recordingId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String languageId, String conversationId) {
	    return new Builder()
	            .withRequiredParams(languageId, conversationId);
	}


	public static class Builder {
		private final GetSpeechandtextanalyticsTranslationsLanguageConversationRequest request;

		private Builder() {
			request = new GetSpeechandtextanalyticsTranslationsLanguageConversationRequest();
		}


		public Builder withLanguageId(String languageId) {
			request.setLanguageId(languageId);
			return this;
		}

		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}

		public Builder withCommunicationId(String communicationId) {
			request.setCommunicationId(communicationId);
			return this;
		}

		public Builder withRecordingId(String recordingId) {
			request.setRecordingId(recordingId);
			return this;
		}



		public Builder withRequiredParams(String languageId, String conversationId) {
			request.setLanguageId(languageId);
			request.setConversationId(conversationId);

			return this;
		}


		public GetSpeechandtextanalyticsTranslationsLanguageConversationRequest build() {
            
            // verify the required parameter 'languageId' is set
            if (request.languageId == null) {
                throw new IllegalStateException("Missing the required parameter 'languageId' when building request for GetSpeechandtextanalyticsTranslationsLanguageConversationRequest.");
            }
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetSpeechandtextanalyticsTranslationsLanguageConversationRequest.");
            }
            
			return request;
		}
	}
}
