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

import com.mypurecloud.sdk.v2.model.DirectoryUserDevicesListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserDevice;

public class DeleteMobiledeviceRequest {

	private String deviceId;
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public DeleteMobiledeviceRequest withDeviceId(String deviceId) {
	    this.setDeviceId(deviceId);
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

    public DeleteMobiledeviceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'deviceId' is set
        if (this.deviceId == null) {
            throw new IllegalStateException("Missing the required parameter 'deviceId' when building request for DeleteMobiledeviceRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/mobiledevices/{deviceId}")
                .withPathParameter("deviceId", deviceId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String deviceId) {
	    return new Builder()
	            .withRequiredParams(deviceId);
	}


	public static class Builder {
		private final DeleteMobiledeviceRequest request;

		private Builder() {
			request = new DeleteMobiledeviceRequest();
		}


		public Builder withDeviceId(String deviceId) {
			request.setDeviceId(deviceId);
			return this;
		}



		public Builder withRequiredParams(String deviceId) {
			request.setDeviceId(deviceId);

			return this;
		}


		public DeleteMobiledeviceRequest build() {
            
            // verify the required parameter 'deviceId' is set
            if (request.deviceId == null) {
                throw new IllegalStateException("Missing the required parameter 'deviceId' when building request for DeleteMobiledeviceRequest.");
            }
            
			return request;
		}
	}
}
