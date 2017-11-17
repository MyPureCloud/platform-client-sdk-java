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
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;

public class GetRoutingEmailDomainRouteRequest {
    
	private String domainName;
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public GetRoutingEmailDomainRouteRequest withDomainName(String domainName) {
	    this.setDomainName(domainName);
	    return this;
	} 
	
	private String routeId;
	public String getRouteId() {
		return this.routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public GetRoutingEmailDomainRouteRequest withRouteId(String routeId) {
	    this.setRouteId(routeId);
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

    public GetRoutingEmailDomainRouteRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'domainName' is set
        if (this.domainName == null) {
            throw new IllegalStateException("Missing the required parameter 'domainName' when building request for GetRoutingEmailDomainRouteRequest.");
        }
        
        // verify the required parameter 'routeId' is set
        if (this.routeId == null) {
            throw new IllegalStateException("Missing the required parameter 'routeId' when building request for GetRoutingEmailDomainRouteRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/email/domains/{domainName}/routes/{routeId}")
                .withPathParameter("domainName", domainName)
        
                .withPathParameter("routeId", routeId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String domainName, String routeId) {
	    return new Builder()
	            .withRequiredParams(domainName, routeId);
	}
	

	public static class Builder {
		private final GetRoutingEmailDomainRouteRequest request;

		private Builder() {
			request = new GetRoutingEmailDomainRouteRequest();
		}

		
		public Builder withDomainName(String domainName) {
			request.setDomainName(domainName);
			return this;
		}
		
		public Builder withRouteId(String routeId) {
			request.setRouteId(routeId);
			return this;
		}
		

		
		public Builder withRequiredParams(String domainName, String routeId) {
			request.setDomainName(domainName);
						request.setRouteId(routeId);
			
			return this;
		}
		

		public GetRoutingEmailDomainRouteRequest build() {
            
            // verify the required parameter 'domainName' is set
            if (request.domainName == null) {
                throw new IllegalStateException("Missing the required parameter 'domainName' when building request for GetRoutingEmailDomainRouteRequest.");
            }
            
            // verify the required parameter 'routeId' is set
            if (request.routeId == null) {
                throw new IllegalStateException("Missing the required parameter 'routeId' when building request for GetRoutingEmailDomainRouteRequest.");
            }
            
			return request;
		}
	}
}
