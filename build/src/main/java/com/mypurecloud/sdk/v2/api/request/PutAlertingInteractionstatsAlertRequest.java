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
import com.mypurecloud.sdk.v2.model.ActiveAlertCount;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;

public class PutAlertingInteractionstatsAlertRequest {
    
	private String alertId;
	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public PutAlertingInteractionstatsAlertRequest withAlertId(String alertId) {
	    this.setAlertId(alertId);
	    return this;
	} 
	
	private UnreadStatus body;
	public UnreadStatus getBody() {
		return this.body;
	}

	public void setBody(UnreadStatus body) {
		this.body = body;
	}

	public PutAlertingInteractionstatsAlertRequest withBody(UnreadStatus body) {
	    this.setBody(body);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public PutAlertingInteractionstatsAlertRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		NOTIFICATIONUSERS("notificationUsers");

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

    public PutAlertingInteractionstatsAlertRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UnreadStatus> withHttpInfo() {
        
        // verify the required parameter 'alertId' is set
        if (this.alertId == null) {
            throw new IllegalStateException("Missing the required parameter 'alertId' when building request for PutAlertingInteractionstatsAlertRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingInteractionstatsAlertRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/alerting/interactionstats/alerts/{alertId}")
                .withPathParameter("alertId", alertId)
        
                .withQueryParameters("expand", "multi", expand)
        
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

	
	public static Builder builder(String alertId, UnreadStatus body) {
	    return new Builder()
	            .withRequiredParams(alertId, body);
	}
	

	public static class Builder {
		private final PutAlertingInteractionstatsAlertRequest request;

		private Builder() {
			request = new PutAlertingInteractionstatsAlertRequest();
		}

		
		public Builder withAlertId(String alertId) {
			request.setAlertId(alertId);
			return this;
		}
		
		public Builder withBody(UnreadStatus body) {
			request.setBody(body);
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
		

		
		public Builder withRequiredParams(String alertId, UnreadStatus body) {
			request.setAlertId(alertId);
						request.setBody(body);
			
			return this;
		}
		

		public PutAlertingInteractionstatsAlertRequest build() {
            
            // verify the required parameter 'alertId' is set
            if (request.alertId == null) {
                throw new IllegalStateException("Missing the required parameter 'alertId' when building request for PutAlertingInteractionstatsAlertRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingInteractionstatsAlertRequest.");
            }
            
			return request;
		}
	}
}
