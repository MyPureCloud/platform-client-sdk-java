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
import com.mypurecloud.sdk.v2.model.UserDevice;
import com.mypurecloud.sdk.v2.model.DirectoryUserDevicesListing;

public class PutMobiledeviceRequest {
    
	private String deviceId;
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public PutMobiledeviceRequest withDeviceId(String deviceId) {
	    this.setDeviceId(deviceId);
	    return this;
	} 
	
	private UserDevice body;
	public UserDevice getBody() {
		return this.body;
	}

	public void setBody(UserDevice body) {
		this.body = body;
	}

	public PutMobiledeviceRequest withBody(UserDevice body) {
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

    public PutMobiledeviceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UserDevice> withHttpInfo() {
        
        // verify the required parameter 'deviceId' is set
        if (this.deviceId == null) {
            throw new IllegalStateException("Missing the required parameter 'deviceId' when building request for PutMobiledeviceRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/mobiledevices/{deviceId}")
                .withPathParameter("deviceId", deviceId)
        
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

	
	public static Builder builder(String deviceId) {
	    return new Builder()
	            .withRequiredParams(deviceId);
	}
	

	public static class Builder {
		private final PutMobiledeviceRequest request;

		private Builder() {
			request = new PutMobiledeviceRequest();
		}

		
		public Builder withDeviceId(String deviceId) {
			request.setDeviceId(deviceId);
			return this;
		}
		
		public Builder withBody(UserDevice body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String deviceId) {
			request.setDeviceId(deviceId);
			
			return this;
		}
		

		public PutMobiledeviceRequest build() {
            
            // verify the required parameter 'deviceId' is set
            if (request.deviceId == null) {
                throw new IllegalStateException("Missing the required parameter 'deviceId' when building request for PutMobiledeviceRequest.");
            }
            
			return request;
		}
	}
}
