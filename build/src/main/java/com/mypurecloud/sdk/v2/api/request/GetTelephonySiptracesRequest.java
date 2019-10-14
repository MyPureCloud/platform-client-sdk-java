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

import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;

public class GetTelephonySiptracesRequest {
    
	private Date dateStart;
	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public GetTelephonySiptracesRequest withDateStart(Date dateStart) {
	    this.setDateStart(dateStart);
	    return this;
	} 
	
	private Date dateEnd;
	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public GetTelephonySiptracesRequest withDateEnd(Date dateEnd) {
	    this.setDateEnd(dateEnd);
	    return this;
	} 
	
	private String callId;
	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public GetTelephonySiptracesRequest withCallId(String callId) {
	    this.setCallId(callId);
	    return this;
	} 
	
	private String toUser;
	public String getToUser() {
		return this.toUser;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public GetTelephonySiptracesRequest withToUser(String toUser) {
	    this.setToUser(toUser);
	    return this;
	} 
	
	private String fromUser;
	public String getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public GetTelephonySiptracesRequest withFromUser(String fromUser) {
	    this.setFromUser(fromUser);
	    return this;
	} 
	
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetTelephonySiptracesRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
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

    public GetTelephonySiptracesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'dateStart' is set
        if (this.dateStart == null) {
            throw new IllegalStateException("Missing the required parameter 'dateStart' when building request for GetTelephonySiptracesRequest.");
        }
        
        // verify the required parameter 'dateEnd' is set
        if (this.dateEnd == null) {
            throw new IllegalStateException("Missing the required parameter 'dateEnd' when building request for GetTelephonySiptracesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/siptraces")
                .withQueryParameters("callId", "", callId)
        
                .withQueryParameters("toUser", "", toUser)
        
                .withQueryParameters("fromUser", "", fromUser)
        
                .withQueryParameters("conversationId", "", conversationId)
        
                .withQueryParameters("dateStart", "", dateStart)
        
                .withQueryParameters("dateEnd", "", dateEnd)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(Date dateStart, Date dateEnd) {
	    return new Builder()
	            .withRequiredParams(dateStart, dateEnd);
	}
	

	public static class Builder {
		private final GetTelephonySiptracesRequest request;

		private Builder() {
			request = new GetTelephonySiptracesRequest();
		}

		
		public Builder withDateStart(Date dateStart) {
			request.setDateStart(dateStart);
			return this;
		}
		
		public Builder withDateEnd(Date dateEnd) {
			request.setDateEnd(dateEnd);
			return this;
		}
		
		public Builder withCallId(String callId) {
			request.setCallId(callId);
			return this;
		}
		
		public Builder withToUser(String toUser) {
			request.setToUser(toUser);
			return this;
		}
		
		public Builder withFromUser(String fromUser) {
			request.setFromUser(fromUser);
			return this;
		}
		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		

		
		public Builder withRequiredParams(Date dateStart, Date dateEnd) {
			request.setDateStart(dateStart);
						request.setDateEnd(dateEnd);
			
			return this;
		}
		

		public GetTelephonySiptracesRequest build() {
            
            // verify the required parameter 'dateStart' is set
            if (request.dateStart == null) {
                throw new IllegalStateException("Missing the required parameter 'dateStart' when building request for GetTelephonySiptracesRequest.");
            }
            
            // verify the required parameter 'dateEnd' is set
            if (request.dateEnd == null) {
                throw new IllegalStateException("Missing the required parameter 'dateEnd' when building request for GetTelephonySiptracesRequest.");
            }
            
			return request;
		}
	}
}
