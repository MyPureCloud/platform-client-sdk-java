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

import com.mypurecloud.sdk.v2.model.CelebrationStateParam;
import com.mypurecloud.sdk.v2.model.CreateRecognition;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetCelebrationListing;
import com.mypurecloud.sdk.v2.model.Recognition;
import com.mypurecloud.sdk.v2.model.RecognitionBase;
import com.mypurecloud.sdk.v2.model.Recognitions;

public class GetEmployeeengagementRecognitionsRequest {

	private String direction;
	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public GetEmployeeengagementRecognitionsRequest withDirection(String direction) {
	    this.setDirection(direction);
	    return this;
	} 

	public enum directionValues { 
		SENT("sent"),
		RECEIVED("received");

		private String value;

		directionValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static directionValues fromString(String key) {
			if (key == null) return null;

			for (directionValues value : directionValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return directionValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String recipient;
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public GetEmployeeengagementRecognitionsRequest withRecipient(String recipient) {
	    this.setRecipient(recipient);
	    return this;
	} 

	private Date dateStart;
	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public GetEmployeeengagementRecognitionsRequest withDateStart(Date dateStart) {
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

	public GetEmployeeengagementRecognitionsRequest withDateEnd(Date dateEnd) {
	    this.setDateEnd(dateEnd);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetEmployeeengagementRecognitionsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetEmployeeengagementRecognitionsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
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

    public GetEmployeeengagementRecognitionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/employeeengagement/recognitions")

                .withQueryParameters("direction", "", direction)
        

                .withQueryParameters("recipient", "", recipient)
        

                .withQueryParameters("dateStart", "", dateStart)
        

                .withQueryParameters("dateEnd", "", dateEnd)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        
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
		private final GetEmployeeengagementRecognitionsRequest request;

		private Builder() {
			request = new GetEmployeeengagementRecognitionsRequest();
		}


		public Builder withDirection(String direction) {
			request.setDirection(direction);
			return this;
		}



		
		public Builder withDirection(directionValues direction) {
		    request.setDirection(direction.toString());

		    return this;
		}

		public Builder withRecipient(String recipient) {
			request.setRecipient(recipient);
			return this;
		}

		public Builder withDateStart(Date dateStart) {
			request.setDateStart(dateStart);
			return this;
		}

		public Builder withDateEnd(Date dateEnd) {
			request.setDateEnd(dateEnd);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}




		public GetEmployeeengagementRecognitionsRequest build() {
            
			return request;
		}
	}
}
