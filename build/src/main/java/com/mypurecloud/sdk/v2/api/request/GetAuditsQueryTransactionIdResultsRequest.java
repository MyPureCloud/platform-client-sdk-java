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

import com.mypurecloud.sdk.v2.model.AuditQueryServiceMapping;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryResultsResponse;

public class GetAuditsQueryTransactionIdResultsRequest {
    
	private String transactionId;
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public GetAuditsQueryTransactionIdResultsRequest withTransactionId(String transactionId) {
	    this.setTransactionId(transactionId);
	    return this;
	} 
	
	private String cursor;
	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public GetAuditsQueryTransactionIdResultsRequest withCursor(String cursor) {
	    this.setCursor(cursor);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetAuditsQueryTransactionIdResultsRequest withPageSize(Integer pageSize) {
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

	public GetAuditsQueryTransactionIdResultsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		USER("user");

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

    public GetAuditsQueryTransactionIdResultsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'transactionId' is set
        if (this.transactionId == null) {
            throw new IllegalStateException("Missing the required parameter 'transactionId' when building request for GetAuditsQueryTransactionIdResultsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/audits/query/{transactionId}/results")
                .withPathParameter("transactionId", transactionId)
        
                .withQueryParameters("cursor", "", cursor)
        
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

	
	public static Builder builder(String transactionId) {
	    return new Builder()
	            .withRequiredParams(transactionId);
	}
	

	public static class Builder {
		private final GetAuditsQueryTransactionIdResultsRequest request;

		private Builder() {
			request = new GetAuditsQueryTransactionIdResultsRequest();
		}

		
		public Builder withTransactionId(String transactionId) {
			request.setTransactionId(transactionId);
			return this;
		}
		
		public Builder withCursor(String cursor) {
			request.setCursor(cursor);
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
		

		
		public Builder withRequiredParams(String transactionId) {
			request.setTransactionId(transactionId);
			
			return this;
		}
		

		public GetAuditsQueryTransactionIdResultsRequest build() {
            
            // verify the required parameter 'transactionId' is set
            if (request.transactionId == null) {
                throw new IllegalStateException("Missing the required parameter 'transactionId' when building request for GetAuditsQueryTransactionIdResultsRequest.");
            }
            
			return request;
		}
	}
}
