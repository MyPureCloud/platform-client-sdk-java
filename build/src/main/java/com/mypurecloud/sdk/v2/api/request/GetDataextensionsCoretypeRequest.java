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
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;

public class GetDataextensionsCoretypeRequest {
    
	private String coretypeName;
	public String getCoretypeName() {
		return this.coretypeName;
	}

	public void setCoretypeName(String coretypeName) {
		this.coretypeName = coretypeName;
	}

	public GetDataextensionsCoretypeRequest withCoretypeName(String coretypeName) {
	    this.setCoretypeName(coretypeName);
	    return this;
	} 

	public enum coretypeNameValues { 
		TEXT("text"), 
		LONGTEXT("longtext"), 
		URL("url"), 
		IDENTIFIER("identifier"), 
		ENUM("enum"), 
		DATE("date"), 
		DATETIME("datetime"), 
		INTEGER("integer"), 
		NUMBER("number"), 
		CHECKBOX("checkbox"), 
		TAG("tag");

		private String value;

		coretypeNameValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static coretypeNameValues fromString(String key) {
			if (key == null) return null;

			for (coretypeNameValues value : coretypeNameValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return coretypeNameValues.values()[0];
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

    public GetDataextensionsCoretypeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'coretypeName' is set
        if (this.coretypeName == null) {
            throw new IllegalStateException("Missing the required parameter 'coretypeName' when building request for GetDataextensionsCoretypeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/dataextensions/coretypes/{coretypeName}")
                .withPathParameter("coretypeName", coretypeName)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String coretypeName) {
	    return new Builder()
	            .withRequiredParams(coretypeName);
	}
	

	public static class Builder {
		private final GetDataextensionsCoretypeRequest request;

		private Builder() {
			request = new GetDataextensionsCoretypeRequest();
		}

		
		public Builder withCoretypeName(String coretypeName) {
			request.setCoretypeName(coretypeName);
			return this;
		}

		public Builder withCoretypeName(coretypeNameValues coretypeName) {
		    request.setCoretypeName(coretypeName.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String coretypeName) {
			request.setCoretypeName(coretypeName);
			
			return this;
		}
		

		public GetDataextensionsCoretypeRequest build() {
            
            // verify the required parameter 'coretypeName' is set
            if (request.coretypeName == null) {
                throw new IllegalStateException("Missing the required parameter 'coretypeName' when building request for GetDataextensionsCoretypeRequest.");
            }
            
			return request;
		}
	}
}
