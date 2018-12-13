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
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;

public class GetMessagingStickerRequest {
    
	private String messengerType;
	public String getMessengerType() {
		return this.messengerType;
	}

	public void setMessengerType(String messengerType) {
		this.messengerType = messengerType;
	}

	public GetMessagingStickerRequest withMessengerType(String messengerType) {
	    this.setMessengerType(messengerType);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetMessagingStickerRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetMessagingStickerRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
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

    public GetMessagingStickerRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'messengerType' is set
        if (this.messengerType == null) {
            throw new IllegalStateException("Missing the required parameter 'messengerType' when building request for GetMessagingStickerRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/messaging/stickers/{messengerType}")
                .withPathParameter("messengerType", messengerType)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String messengerType) {
	    return new Builder()
	            .withRequiredParams(messengerType);
	}
	

	public static class Builder {
		private final GetMessagingStickerRequest request;

		private Builder() {
			request = new GetMessagingStickerRequest();
		}

		
		public Builder withMessengerType(String messengerType) {
			request.setMessengerType(messengerType);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		

		
		public Builder withRequiredParams(String messengerType) {
			request.setMessengerType(messengerType);
			
			return this;
		}
		

		public GetMessagingStickerRequest build() {
            
            // verify the required parameter 'messengerType' is set
            if (request.messengerType == null) {
                throw new IllegalStateException("Missing the required parameter 'messengerType' when building request for GetMessagingStickerRequest.");
            }
            
			return request;
		}
	}
}
