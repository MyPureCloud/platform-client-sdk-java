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

public class GetOrganizationsLimitsChangerequestsRequest {
    
	private Long after;
	public Long getAfter() {
		return this.after;
	}

	public void setAfter(Long after) {
		this.after = after;
	}

	public GetOrganizationsLimitsChangerequestsRequest withAfter(Long after) {
	    this.setAfter(after);
	    return this;
	} 
	
	private Long before;
	public Long getBefore() {
		return this.before;
	}

	public void setBefore(Long before) {
		this.before = before;
	}

	public GetOrganizationsLimitsChangerequestsRequest withBefore(Long before) {
	    this.setBefore(before);
	    return this;
	} 
	
	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetOrganizationsLimitsChangerequestsRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		OPEN("Open"), 
		APPROVED("Approved"), 
		IMPLEMENTINGCHANGE("ImplementingChange"), 
		CHANGEIMPLEMENTED("ChangeImplemented"), 
		REJECTED("Rejected"), 
		ROLLBACK("Rollback"), 
		IMPLEMENTINGROLLBACK("ImplementingRollback"), 
		ROLLBACKIMPLEMENTED("RollbackImplemented");

		private String value;

		statusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statusValues fromString(String key) {
			if (key == null) return null;

			for (statusValues value : statusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statusValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetOrganizationsLimitsChangerequestsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetOrganizationsLimitsChangerequestsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		STATUSHISTORY("statusHistory");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
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

    public GetOrganizationsLimitsChangerequestsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/organizations/limits/changerequests")
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("before", "", before)
        
                .withQueryParameters("status", "", status)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("expand", "multi", expand)
        
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
		private final GetOrganizationsLimitsChangerequestsRequest request;

		private Builder() {
			request = new GetOrganizationsLimitsChangerequestsRequest();
		}

		
		public Builder withAfter(Long after) {
			request.setAfter(after);
			return this;
		}
		
		public Builder withBefore(Long before) {
			request.setBefore(before);
			return this;
		}
		
		public Builder withStatus(String status) {
			request.setStatus(status);
			return this;
		}

		public Builder withStatus(statusValues status) {
		    request.setStatus(status.toString());
		    return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}
		

		

		public GetOrganizationsLimitsChangerequestsRequest build() {
            
			return request;
		}
	}
}
