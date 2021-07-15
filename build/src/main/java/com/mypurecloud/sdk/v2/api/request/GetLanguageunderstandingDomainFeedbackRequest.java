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
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.Draft;
import com.mypurecloud.sdk.v2.model.DraftListing;
import com.mypurecloud.sdk.v2.model.MinerIntent;
import com.mypurecloud.sdk.v2.model.MinedIntentsListing;
import com.mypurecloud.sdk.v2.model.MinerListing;
import com.mypurecloud.sdk.v2.model.DraftRequest;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;
import com.mypurecloud.sdk.v2.model.MinerExecuteRequest;

public class GetLanguageunderstandingDomainFeedbackRequest {
    
	private String domainId;
	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withDomainId(String domainId) {
	    this.setDomainId(domainId);
	    return this;
	} 
	
	private String intentName;
	public String getIntentName() {
		return this.intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withIntentName(String intentName) {
	    this.setIntentName(intentName);
	    return this;
	} 
	
	private String assessment;
	public String getAssessment() {
		return this.assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withAssessment(String assessment) {
	    this.setAssessment(assessment);
	    return this;
	} 

	public enum assessmentValues { 
		INCORRECT("Incorrect"), 
		CORRECT("Correct"), 
		UNKNOWN("Unknown"), 
		DISABLED("Disabled");

		private String value;

		assessmentValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static assessmentValues fromString(String key) {
			if (key == null) return null;

			for (assessmentValues value : assessmentValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return assessmentValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private LocalDate dateStart;
	public LocalDate getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withDateStart(LocalDate dateStart) {
	    this.setDateStart(dateStart);
	    return this;
	} 
	
	private LocalDate dateEnd;
	public LocalDate getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withDateEnd(LocalDate dateEnd) {
	    this.setDateEnd(dateEnd);
	    return this;
	} 
	
	private Boolean includeDeleted;
	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withIncludeDeleted(Boolean includeDeleted) {
	    this.setIncludeDeleted(includeDeleted);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Boolean enableCursorPagination;
	public Boolean getEnableCursorPagination() {
		return this.enableCursorPagination;
	}

	public void setEnableCursorPagination(Boolean enableCursorPagination) {
		this.enableCursorPagination = enableCursorPagination;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withEnableCursorPagination(Boolean enableCursorPagination) {
	    this.setEnableCursorPagination(enableCursorPagination);
	    return this;
	} 
	
	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 
	
	private List<String> fields;
	public List<String> getFields() {
		return this.fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public GetLanguageunderstandingDomainFeedbackRequest withFields(List<String> fields) {
	    this.setFields(fields);
	    return this;
	} 

	public enum fieldsValues { 
		VERSION("version"), 
		DATECREATED("dateCreated"), 
		TEXT("text"), 
		INTENTS("intents");

		private String value;

		fieldsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static fieldsValues fromString(String key) {
			if (key == null) return null;

			for (fieldsValues value : fieldsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return fieldsValues.values()[0];
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

    public GetLanguageunderstandingDomainFeedbackRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'domainId' is set
        if (this.domainId == null) {
            throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainFeedbackRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/domains/{domainId}/feedback")
                .withPathParameter("domainId", domainId)
        
                .withQueryParameters("intentName", "", intentName)
        
                .withQueryParameters("assessment", "", assessment)
        
                .withQueryParameters("dateStart", "", dateStart)
        
                .withQueryParameters("dateEnd", "", dateEnd)
        
                .withQueryParameters("includeDeleted", "", includeDeleted)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("enableCursorPagination", "", enableCursorPagination)
        
                .withQueryParameters("after", "", after)
        
                .withQueryParameters("fields", "multi", fields)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String domainId) {
	    return new Builder()
	            .withRequiredParams(domainId);
	}
	

	public static class Builder {
		private final GetLanguageunderstandingDomainFeedbackRequest request;

		private Builder() {
			request = new GetLanguageunderstandingDomainFeedbackRequest();
		}

		
		public Builder withDomainId(String domainId) {
			request.setDomainId(domainId);
			return this;
		}
		
		public Builder withIntentName(String intentName) {
			request.setIntentName(intentName);
			return this;
		}
		
		public Builder withAssessment(String assessment) {
			request.setAssessment(assessment);
			return this;
		}

		public Builder withAssessment(assessmentValues assessment) {
		    request.setAssessment(assessment.toString());
		    return this;
		}
		
		public Builder withDateStart(LocalDate dateStart) {
			request.setDateStart(dateStart);
			return this;
		}
		
		public Builder withDateEnd(LocalDate dateEnd) {
			request.setDateEnd(dateEnd);
			return this;
		}
		
		public Builder withIncludeDeleted(Boolean includeDeleted) {
			request.setIncludeDeleted(includeDeleted);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withEnableCursorPagination(Boolean enableCursorPagination) {
			request.setEnableCursorPagination(enableCursorPagination);
			return this;
		}
		
		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}
		
		public Builder withFields(List<String> fields) {
			request.setFields(fields);
			return this;
		}

		public Builder withFieldsEnumValues(List<fieldsValues> fields) {
		    List<String> stringList = new ArrayList<>();
	      for (fieldsValues e : fields) {
	        stringList.add(e.toString());
	      }
	      request.setFields(stringList);
		    return this;
		}
		

		
		public Builder withRequiredParams(String domainId) {
			request.setDomainId(domainId);
			
			return this;
		}
		

		public GetLanguageunderstandingDomainFeedbackRequest build() {
            
            // verify the required parameter 'domainId' is set
            if (request.domainId == null) {
                throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainFeedbackRequest.");
            }
            
			return request;
		}
	}
}
