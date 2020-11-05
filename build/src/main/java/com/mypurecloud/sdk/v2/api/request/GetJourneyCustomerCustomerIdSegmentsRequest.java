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
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentsUpdate;

public class GetJourneyCustomerCustomerIdSegmentsRequest {
    
	private String customerIdType;
	public String getCustomerIdType() {
		return this.customerIdType;
	}

	public void setCustomerIdType(String customerIdType) {
		this.customerIdType = customerIdType;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withCustomerIdType(String customerIdType) {
	    this.setCustomerIdType(customerIdType);
	    return this;
	} 
	
	private String customerId;
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withCustomerId(String customerId) {
	    this.setCustomerId(customerId);
	    return this;
	} 
	
	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 
	
	private String segmentScope;
	public String getSegmentScope() {
		return this.segmentScope;
	}

	public void setSegmentScope(String segmentScope) {
		this.segmentScope = segmentScope;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withSegmentScope(String segmentScope) {
	    this.setSegmentScope(segmentScope);
	    return this;
	} 

	public enum segmentScopeValues { 
		SESSION("Session"), 
		CUSTOMER("Customer");

		private String value;

		segmentScopeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static segmentScopeValues fromString(String key) {
			if (key == null) return null;

			for (segmentScopeValues value : segmentScopeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return segmentScopeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String assignmentState;
	public String getAssignmentState() {
		return this.assignmentState;
	}

	public void setAssignmentState(String assignmentState) {
		this.assignmentState = assignmentState;
	}

	public GetJourneyCustomerCustomerIdSegmentsRequest withAssignmentState(String assignmentState) {
	    this.setAssignmentState(assignmentState);
	    return this;
	} 

	public enum assignmentStateValues { 
		ASSIGNED("Assigned"), 
		UNASSIGNED("Unassigned");

		private String value;

		assignmentStateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static assignmentStateValues fromString(String key) {
			if (key == null) return null;

			for (assignmentStateValues value : assignmentStateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return assignmentStateValues.values()[0];
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

    public GetJourneyCustomerCustomerIdSegmentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'customerIdType' is set
        if (this.customerIdType == null) {
            throw new IllegalStateException("Missing the required parameter 'customerIdType' when building request for GetJourneyCustomerCustomerIdSegmentsRequest.");
        }
        
        // verify the required parameter 'customerId' is set
        if (this.customerId == null) {
            throw new IllegalStateException("Missing the required parameter 'customerId' when building request for GetJourneyCustomerCustomerIdSegmentsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/customers/{customerIdType}/{customerId}/segments")
                .withPathParameter("customerIdType", customerIdType)
        
                .withPathParameter("customerId", customerId)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("segmentScope", "", segmentScope)
        
                .withQueryParameters("assignmentState", "", assignmentState)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String customerIdType, String customerId) {
	    return new Builder()
	            .withRequiredParams(customerIdType, customerId);
	}
	

	public static class Builder {
		private final GetJourneyCustomerCustomerIdSegmentsRequest request;

		private Builder() {
			request = new GetJourneyCustomerCustomerIdSegmentsRequest();
		}

		
		public Builder withCustomerIdType(String customerIdType) {
			request.setCustomerIdType(customerIdType);
			return this;
		}
		
		public Builder withCustomerId(String customerId) {
			request.setCustomerId(customerId);
			return this;
		}
		
		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}
		
		public Builder withSegmentScope(String segmentScope) {
			request.setSegmentScope(segmentScope);
			return this;
		}

		public Builder withSegmentScope(segmentScopeValues segmentScope) {
		    request.setSegmentScope(segmentScope.toString());
		    return this;
		}
		
		public Builder withAssignmentState(String assignmentState) {
			request.setAssignmentState(assignmentState);
			return this;
		}

		public Builder withAssignmentState(assignmentStateValues assignmentState) {
		    request.setAssignmentState(assignmentState.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String customerIdType, String customerId) {
			request.setCustomerIdType(customerIdType);
						request.setCustomerId(customerId);
			
			return this;
		}
		

		public GetJourneyCustomerCustomerIdSegmentsRequest build() {
            
            // verify the required parameter 'customerIdType' is set
            if (request.customerIdType == null) {
                throw new IllegalStateException("Missing the required parameter 'customerIdType' when building request for GetJourneyCustomerCustomerIdSegmentsRequest.");
            }
            
            // verify the required parameter 'customerId' is set
            if (request.customerId == null) {
                throw new IllegalStateException("Missing the required parameter 'customerId' when building request for GetJourneyCustomerCustomerIdSegmentsRequest.");
            }
            
			return request;
		}
	}
}
