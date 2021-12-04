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

public class GetSpeechandtextanalyticsTopicsGeneralRequest {
    
	private String dialect;
	public String getDialect() {
		return this.dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public GetSpeechandtextanalyticsTopicsGeneralRequest withDialect(String dialect) {
	    this.setDialect(dialect);
	    return this;
	} 

	public enum dialectValues { 
		EN_US("en-US"), 
		ES_US("es-US"), 
		EN_AU("en-AU"), 
		EN_GB("en-GB"), 
		EN_ZA("en-ZA"), 
		ES_ES("es-ES"), 
		EN_IN("en-IN"), 
		FR_FR("fr-FR"), 
		FR_CA("fr-CA"), 
		IT_IT("it-IT"), 
		DE_DE("de-DE"), 
		PT_BR("pt-BR");

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

    public GetSpeechandtextanalyticsTopicsGeneralRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/speechandtextanalytics/topics/general")
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
		private final GetSpeechandtextanalyticsTopicsGeneralRequest request;

		private Builder() {
			request = new GetSpeechandtextanalyticsTopicsGeneralRequest();
		}

		
		public Builder withDialect(String dialect) {
			request.setDialect(dialect);
			return this;
		}

		public Builder withDialect(dialectValues dialect) {
		    request.setDialect(dialect.toString());
		    return this;
		}
		

		

		public GetSpeechandtextanalyticsTopicsGeneralRequest build() {
            
			return request;
		}
	}
}
