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
import com.mypurecloud.sdk.v2.model.LicenseBatchAssignmentRequest;
import com.mypurecloud.sdk.v2.model.LicenseDefinition;
import com.mypurecloud.sdk.v2.model.LicenseOrgToggle;
import com.mypurecloud.sdk.v2.model.LicenseUpdateStatus;
import com.mypurecloud.sdk.v2.model.LicenseUser;
import com.mypurecloud.sdk.v2.model.UserLicensesEntityListing;

public class GetLicenseDefinitionRequest {

	private String licenseId;
	public String getLicenseId() {
		return this.licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public GetLicenseDefinitionRequest withLicenseId(String licenseId) {
	    this.setLicenseId(licenseId);
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

    public GetLicenseDefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'licenseId' is set
        if (this.licenseId == null) {
            throw new IllegalStateException("Missing the required parameter 'licenseId' when building request for GetLicenseDefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/license/definitions/{licenseId}")
                .withPathParameter("licenseId", licenseId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String licenseId) {
	    return new Builder()
	            .withRequiredParams(licenseId);
	}


	public static class Builder {
		private final GetLicenseDefinitionRequest request;

		private Builder() {
			request = new GetLicenseDefinitionRequest();
		}


		public Builder withLicenseId(String licenseId) {
			request.setLicenseId(licenseId);
			return this;
		}



		public Builder withRequiredParams(String licenseId) {
			request.setLicenseId(licenseId);

			return this;
		}


		public GetLicenseDefinitionRequest build() {
            
            // verify the required parameter 'licenseId' is set
            if (request.licenseId == null) {
                throw new IllegalStateException("Missing the required parameter 'licenseId' when building request for GetLicenseDefinitionRequest.");
            }
            
			return request;
		}
	}
}
