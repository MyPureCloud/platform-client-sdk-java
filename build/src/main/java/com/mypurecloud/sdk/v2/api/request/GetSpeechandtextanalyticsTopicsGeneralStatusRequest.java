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
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngines;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
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
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.TranscriptUrls;
import com.mypurecloud.sdk.v2.model.TranscriptionEnginesRequest;
import com.mypurecloud.sdk.v2.model.TranslateSupportedLanguageList;
import com.mypurecloud.sdk.v2.model.UnifiedGeneralTopicEntityListing;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;

public class GetSpeechandtextanalyticsTopicsGeneralStatusRequest {

	private String dialect;
	public String getDialect() {
		return this.dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public GetSpeechandtextanalyticsTopicsGeneralStatusRequest withDialect(String dialect) {
	    this.setDialect(dialect);
	    return this;
	} 

	public enum dialectValues { 
		AR_001("ar-001"),
		AR_AE("ar-AE"),
		AR_BH("ar-BH"),
		AR_EG("ar-EG"),
		AR_IL("ar-IL"),
		AR_SA("ar-SA"),
		AR_TN("ar-TN"),
		DA_DK("da-DK"),
		DE_CH("de-CH"),
		DE_DE("de-DE"),
		EN_AU("en-AU"),
		EN_GB("en-GB"),
		EN_HK("en-HK"),
		EN_IE("en-IE"),
		EN_IN("en-IN"),
		EN_NZ("en-NZ"),
		EN_SG("en-SG"),
		EN_US("en-US"),
		EN_ZA("en-ZA"),
		ES_ES("es-ES"),
		ES_US("es-US"),
		FI_FI("fi-FI"),
		FR_CA("fr-CA"),
		FR_FR("fr-FR"),
		HE_IL("he-IL"),
		HI_IN("hi-IN"),
		IT_IT("it-IT"),
		JA_JP("ja-JP"),
		KO_KR("ko-KR"),
		NB_NO("nb-NO"),
		NL_NL("nl-NL"),
		PL_PL("pl-PL"),
		PT_BR("pt-BR"),
		PT_PT("pt-PT"),
		SV_SE("sv-SE"),
		ZH_CN("zh-CN"),
		ZH_HK("zh-HK"),
		ZH_TW("zh-TW");

		private String value;

		dialectValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static dialectValues fromString(String key) {
			if (key == null) return null;

			for (dialectValues value : dialectValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return dialectValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetSpeechandtextanalyticsTopicsGeneralStatusRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/speechandtextanalytics/topics/general/status")

                .withQueryParameters("dialect", "", dialect)
        
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
		private final GetSpeechandtextanalyticsTopicsGeneralStatusRequest request;

		private Builder() {
			request = new GetSpeechandtextanalyticsTopicsGeneralStatusRequest();
		}


		public Builder withDialect(String dialect) {
			request.setDialect(dialect);
			return this;
		}



		
		public Builder withDialect(dialectValues dialect) {
		    request.setDialect(dialect.toString());

		    return this;
		}




		public GetSpeechandtextanalyticsTopicsGeneralStatusRequest build() {
            
			return request;
		}
	}
}
