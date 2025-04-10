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
import com.mypurecloud.sdk.v2.model.MutableUserPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinition;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinitionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.PresenceSettings;
import com.mypurecloud.sdk.v2.model.Source;
import com.mypurecloud.sdk.v2.model.SourceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UcUserPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;

public class GetPresenceDefinitions0Request {

	private String deactivated;
	public String getDeactivated() {
		return this.deactivated;
	}

	public void setDeactivated(String deactivated) {
		this.deactivated = deactivated;
	}

	public GetPresenceDefinitions0Request withDeactivated(String deactivated) {
	    this.setDeactivated(deactivated);
	    return this;
	} 

	private List<String> divisionId;
	public List<String> getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(List<String> divisionId) {
		this.divisionId = divisionId;
	}

	public GetPresenceDefinitions0Request withDivisionId(List<String> divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 

	private String localeCode;
	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public GetPresenceDefinitions0Request withLocaleCode(String localeCode) {
	    this.setLocaleCode(localeCode);
	    return this;
	} 

	public enum localeCodeValues { 
		ALL("ALL"),
		HE("he"),
		FR("fr"),
		EN_US("en_US"),
		DA("da"),
		DE("de"),
		IT("it"),
		CS("cs"),
		ES("es"),
		FI("fi"),
		AR("ar"),
		JA("ja"),
		KO("ko"),
		NL("nl"),
		NO("no"),
		PL("pl"),
		PT_BR("pt_BR"),
		PT_PT("pt_PT"),
		RU("ru"),
		SV("sv"),
		TH("th"),
		TR("tr"),
		UK("uk"),
		ZH_CN("zh_CN"),
		ZH_TW("zh_TW");

		private String value;

		localeCodeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static localeCodeValues fromString(String key) {
			if (key == null) return null;

			for (localeCodeValues value : localeCodeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return localeCodeValues.values()[0];
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

    public GetPresenceDefinitions0Request withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/presence/definitions")

                .withQueryParameters("deactivated", "", deactivated)
        

                .withQueryParameters("divisionId", "multi", divisionId)
        

                .withQueryParameters("localeCode", "", localeCode)
        
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
		private final GetPresenceDefinitions0Request request;

		private Builder() {
			request = new GetPresenceDefinitions0Request();
		}


		public Builder withDeactivated(String deactivated) {
			request.setDeactivated(deactivated);
			return this;
		}

		public Builder withDivisionId(List<String> divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}

		public Builder withLocaleCode(String localeCode) {
			request.setLocaleCode(localeCode);
			return this;
		}



		
		public Builder withLocaleCode(localeCodeValues localeCode) {
		    request.setLocaleCode(localeCode.toString());

		    return this;
		}




		public GetPresenceDefinitions0Request build() {
            
			return request;
		}
	}
}
