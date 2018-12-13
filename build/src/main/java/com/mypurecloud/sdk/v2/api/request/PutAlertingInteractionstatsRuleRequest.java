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

public class PutAlertingInteractionstatsRuleRequest {
    
	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public PutAlertingInteractionstatsRuleRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
	    return this;
	} 
	
	private InteractionStatsRule body;
	public InteractionStatsRule getBody() {
		return this.body;
	}

	public void setBody(InteractionStatsRule body) {
		this.body = body;
	}

	public PutAlertingInteractionstatsRuleRequest withBody(InteractionStatsRule body) {
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

	public PutAlertingInteractionstatsRuleRequest withExpand(List<String> expand) {
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

    public PutAlertingInteractionstatsRuleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<InteractionStatsRule> withHttpInfo() {
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PutAlertingInteractionstatsRuleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingInteractionstatsRuleRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/alerting/interactionstats/rules/{ruleId}")
                .withPathParameter("ruleId", ruleId)
        
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

	
	public static Builder builder(String ruleId, InteractionStatsRule body) {
	    return new Builder()
	            .withRequiredParams(ruleId, body);
	}
	

	public static class Builder {
		private final PutAlertingInteractionstatsRuleRequest request;

		private Builder() {
			request = new PutAlertingInteractionstatsRuleRequest();
		}

		
		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}
		
		public Builder withBody(InteractionStatsRule body) {
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
		

		
		public Builder withRequiredParams(String ruleId, InteractionStatsRule body) {
			request.setRuleId(ruleId);
						request.setBody(body);
			
			return this;
		}
		

		public PutAlertingInteractionstatsRuleRequest build() {
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PutAlertingInteractionstatsRuleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingInteractionstatsRuleRequest.");
            }
            
			return request;
		}
	}
}
