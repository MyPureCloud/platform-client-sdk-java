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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.EmbeddedIntegration;
import com.mypurecloud.sdk.v2.model.IpAddressAuthentication;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestDetails;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestsEntityListing;
import com.mypurecloud.sdk.v2.model.UrlResponse;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.PagedNamespaceListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;
import com.mypurecloud.sdk.v2.model.FeatureState;

public class PatchOrganizationsFeatureRequest {
    
	private String featureName;
	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public PatchOrganizationsFeatureRequest withFeatureName(String featureName) {
	    this.setFeatureName(featureName);
	    return this;
	} 

	public enum featureNameValues { 
		REALTIMECIC("realtimeCIC"), 
		PURECLOUD("purecloud"), 
		HIPAA("hipaa"), 
		UCENABLED("ucEnabled"), 
		PCI("pci"), 
		PURECLOUDVOICE("purecloudVoice"), 
		XMPPFEDERATION("xmppFederation"), 
		CHAT("chat"), 
		INFORMALPHOTOS("informalPhotos"), 
		DIRECTORY("directory"), 
		CONTACTCENTER("contactCenter"), 
		UNIFIEDCOMMUNICATIONS("unifiedCommunications"), 
		CUSTSERV("custserv");

		private String value;

		featureNameValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static featureNameValues fromString(String key) {
			if (key == null) return null;

			for (featureNameValues value : featureNameValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return featureNameValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private FeatureState enabled;
	public FeatureState getEnabled() {
		return this.enabled;
	}

	public void setEnabled(FeatureState enabled) {
		this.enabled = enabled;
	}

	public PatchOrganizationsFeatureRequest withEnabled(FeatureState enabled) {
	    this.setEnabled(enabled);
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

    public PatchOrganizationsFeatureRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FeatureState> withHttpInfo() {
        
        // verify the required parameter 'featureName' is set
        if (this.featureName == null) {
            throw new IllegalStateException("Missing the required parameter 'featureName' when building request for PatchOrganizationsFeatureRequest.");
        }
        
        // verify the required parameter 'enabled' is set
        if (this.enabled == null) {
            throw new IllegalStateException("Missing the required parameter 'enabled' when building request for PatchOrganizationsFeatureRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/organizations/features/{featureName}")
                .withPathParameter("featureName", featureName)
        
                .withBody(enabled)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String featureName, FeatureState enabled) {
	    return new Builder()
	            .withRequiredParams(featureName, enabled);
	}
	

	public static class Builder {
		private final PatchOrganizationsFeatureRequest request;

		private Builder() {
			request = new PatchOrganizationsFeatureRequest();
		}

		
		public Builder withFeatureName(String featureName) {
			request.setFeatureName(featureName);
			return this;
		}

		public Builder withFeatureName(featureNameValues featureName) {
		    request.setFeatureName(featureName.toString());
		    return this;
		}
		
		public Builder withEnabled(FeatureState enabled) {
			request.setEnabled(enabled);
			return this;
		}
		

		
		public Builder withRequiredParams(String featureName, FeatureState enabled) {
			request.setFeatureName(featureName);
						request.setEnabled(enabled);
			
			return this;
		}
		

		public PatchOrganizationsFeatureRequest build() {
            
            // verify the required parameter 'featureName' is set
            if (request.featureName == null) {
                throw new IllegalStateException("Missing the required parameter 'featureName' when building request for PatchOrganizationsFeatureRequest.");
            }
            
            // verify the required parameter 'enabled' is set
            if (request.enabled == null) {
                throw new IllegalStateException("Missing the required parameter 'enabled' when building request for PatchOrganizationsFeatureRequest.");
            }
            
			return request;
		}
	}
}
