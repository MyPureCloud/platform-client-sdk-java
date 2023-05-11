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

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;

public class GetInfrastructureascodeAcceleratorRequest {

	private String acceleratorId;
	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public GetInfrastructureascodeAcceleratorRequest withAcceleratorId(String acceleratorId) {
	    this.setAcceleratorId(acceleratorId);
	    return this;
	} 

	private String preferredLanguage;
	public String getPreferredLanguage() {
		return this.preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public GetInfrastructureascodeAcceleratorRequest withPreferredLanguage(String preferredLanguage) {
	    this.setPreferredLanguage(preferredLanguage);
	    return this;
	} 

	public enum preferredLanguageValues { 
		AR("ar"),
		CS("cs"),
		DA("da"),
		DE("de"),
		EN_US("en-US"),
		ES("es"),
		FI("fi"),
		FR("fr"),
		IT("it"),
		IW("iw"),
		KO("ko"),
		JA("ja"),
		NL("nl"),
		NO("no"),
		PL("pl"),
		PT_BR("pt-BR"),
		PT_PT("pt-PT"),
		SV("sv"),
		TH("th"),
		TR("tr"),
		ZH_CN("zh-CN"),
		ZH_TW("zh-TW");

		private String value;

		preferredLanguageValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static preferredLanguageValues fromString(String key) {
			if (key == null) return null;

			for (preferredLanguageValues value : preferredLanguageValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return preferredLanguageValues.values()[0];
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

    public GetInfrastructureascodeAcceleratorRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'acceleratorId' is set
        if (this.acceleratorId == null) {
            throw new IllegalStateException("Missing the required parameter 'acceleratorId' when building request for GetInfrastructureascodeAcceleratorRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/infrastructureascode/accelerators/{acceleratorId}")
                .withPathParameter("acceleratorId", acceleratorId)
        

                .withQueryParameters("preferredLanguage", "", preferredLanguage)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String acceleratorId) {
	    return new Builder()
	            .withRequiredParams(acceleratorId);
	}


	public static class Builder {
		private final GetInfrastructureascodeAcceleratorRequest request;

		private Builder() {
			request = new GetInfrastructureascodeAcceleratorRequest();
		}


		public Builder withAcceleratorId(String acceleratorId) {
			request.setAcceleratorId(acceleratorId);
			return this;
		}

		public Builder withPreferredLanguage(String preferredLanguage) {
			request.setPreferredLanguage(preferredLanguage);
			return this;
		}



		
		public Builder withPreferredLanguage(preferredLanguageValues preferredLanguage) {
		    request.setPreferredLanguage(preferredLanguage.toString());

		    return this;
		}



		public Builder withRequiredParams(String acceleratorId) {
			request.setAcceleratorId(acceleratorId);

			return this;
		}


		public GetInfrastructureascodeAcceleratorRequest build() {
            
            // verify the required parameter 'acceleratorId' is set
            if (request.acceleratorId == null) {
                throw new IllegalStateException("Missing the required parameter 'acceleratorId' when building request for GetInfrastructureascodeAcceleratorRequest.");
            }
            
			return request;
		}
	}
}
