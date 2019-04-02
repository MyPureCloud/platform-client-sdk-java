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
import com.mypurecloud.sdk.v2.model.EventListing;

public class GetJourneySessionEventsRequest {
    
	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetJourneySessionEventsRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 
	
	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetJourneySessionEventsRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 
	
	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetJourneySessionEventsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 
	
	private String limit;
	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public GetJourneySessionEventsRequest withLimit(String limit) {
	    this.setLimit(limit);
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

    public GetJourneySessionEventsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionEventsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/sessions/{sessionId}/events")
                .withPathParameter("sessionId", sessionId)
        
                .withQueryParameters("before", "", before)
        
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("limit", "", limit)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String sessionId) {
	    return new Builder()
	            .withRequiredParams(sessionId);
	}
	

	public static class Builder {
		private final GetJourneySessionEventsRequest request;

		private Builder() {
			request = new GetJourneySessionEventsRequest();
		}

		
		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}
		
		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}
		
		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}
		
		public Builder withLimit(String limit) {
			request.setLimit(limit);
			return this;
		}
		

		
		public Builder withRequiredParams(String sessionId) {
			request.setSessionId(sessionId);
			
			return this;
		}
		

		public GetJourneySessionEventsRequest build() {
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionEventsRequest.");
            }
            
			return request;
		}
	}
}
