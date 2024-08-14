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

import com.mypurecloud.sdk.v2.model.BotSearchResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PostTextRequest;
import com.mypurecloud.sdk.v2.model.PostTextResponse;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchRequest;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchResponse;
import com.mypurecloud.sdk.v2.model.TextBotFlowTurnRequest;
import com.mypurecloud.sdk.v2.model.TextBotFlowTurnResponse;

public class GetTextbotsBotsSearchRequest {

	private List<String> botType;
	public List<String> getBotType() {
		return this.botType;
	}

	public void setBotType(List<String> botType) {
		this.botType = botType;
	}

	public GetTextbotsBotsSearchRequest withBotType(List<String> botType) {
	    this.setBotType(botType);
	    return this;
	} 

	public enum botTypeValues { 
		GENESYSBOTCONNECTOR("GenesysBotConnector"),
		GENESYSDIALOGENGINE("GenesysDialogEngine"),
		AMAZONLEX("AmazonLex"),
		GOOGLEDIALOGFLOWES("GoogleDialogFlowES"),
		GOOGLEDIALOGFLOWCX("GoogleDialogFlowCX"),
		NUANCEDLG("NuanceDlg"),
		GENESYSBOTFLOW("GenesysBotFlow"),
		GENESYSDIGITALBOTFLOW("GenesysDigitalBotFlow"),
		GENESYSVOICESURVEYFLOW("GenesysVoiceSurveyFlow");

		private String value;

		botTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static botTypeValues fromString(String key) {
			if (key == null) return null;

			for (botTypeValues value : botTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return botTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String botName;
	public String getBotName() {
		return this.botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}

	public GetTextbotsBotsSearchRequest withBotName(String botName) {
	    this.setBotName(botName);
	    return this;
	} 

	private List<String> botId;
	public List<String> getBotId() {
		return this.botId;
	}

	public void setBotId(List<String> botId) {
		this.botId = botId;
	}

	public GetTextbotsBotsSearchRequest withBotId(List<String> botId) {
	    this.setBotId(botId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetTextbotsBotsSearchRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetTextbotsBotsSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/textbots/bots/search")

                .withQueryParameters("botType", "multi", botType)
        

                .withQueryParameters("botName", "", botName)
        

                .withQueryParameters("botId", "multi", botId)
        

                .withQueryParameters("pageSize", "", pageSize)
        
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
		private final GetTextbotsBotsSearchRequest request;

		private Builder() {
			request = new GetTextbotsBotsSearchRequest();
		}


		public Builder withBotType(List<String> botType) {
			request.setBotType(botType);
			return this;
		}



		public Builder withBotTypeEnumValues(List<botTypeValues> botType) {
		    List<String> stringList = new ArrayList<>();
	      for (botTypeValues e : botType) {
	        stringList.add(e.toString());
	      }
	      request.setBotType(stringList);
		    return this;
		}

		public Builder withBotName(String botName) {
			request.setBotName(botName);
			return this;
		}

		public Builder withBotId(List<String> botId) {
			request.setBotId(botId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}




		public GetTextbotsBotsSearchRequest build() {
            
			return request;
		}
	}
}
