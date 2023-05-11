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

import com.mypurecloud.sdk.v2.model.EmergencyLocation;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ErrorInfo;

public class GetCarrierservicesIntegrationsEmergencylocationsMeRequest {

	private String phoneNumber;
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public GetCarrierservicesIntegrationsEmergencylocationsMeRequest withPhoneNumber(String phoneNumber) {
	    this.setPhoneNumber(phoneNumber);
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

    public GetCarrierservicesIntegrationsEmergencylocationsMeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'phoneNumber' is set
        if (this.phoneNumber == null) {
            throw new IllegalStateException("Missing the required parameter 'phoneNumber' when building request for GetCarrierservicesIntegrationsEmergencylocationsMeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/carrierservices/integrations/emergencylocations/me")

                .withQueryParameters("phoneNumber", "", phoneNumber)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String phoneNumber) {
	    return new Builder()
	            .withRequiredParams(phoneNumber);
	}


	public static class Builder {
		private final GetCarrierservicesIntegrationsEmergencylocationsMeRequest request;

		private Builder() {
			request = new GetCarrierservicesIntegrationsEmergencylocationsMeRequest();
		}


		public Builder withPhoneNumber(String phoneNumber) {
			request.setPhoneNumber(phoneNumber);
			return this;
		}



		public Builder withRequiredParams(String phoneNumber) {
			request.setPhoneNumber(phoneNumber);

			return this;
		}


		public GetCarrierservicesIntegrationsEmergencylocationsMeRequest build() {
            
            // verify the required parameter 'phoneNumber' is set
            if (request.phoneNumber == null) {
                throw new IllegalStateException("Missing the required parameter 'phoneNumber' when building request for GetCarrierservicesIntegrationsEmergencylocationsMeRequest.");
            }
            
			return request;
		}
	}
}
