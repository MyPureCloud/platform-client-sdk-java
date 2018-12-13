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
import com.mypurecloud.sdk.v2.model.Station;
import com.mypurecloud.sdk.v2.model.StationEntityListing;
import com.mypurecloud.sdk.v2.model.StationSettings;

public class GetStationsRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetStationsRequest withPageSize(Integer pageSize) {
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

	public GetStationsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetStationsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetStationsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private String userSelectable;
	public String getUserSelectable() {
		return this.userSelectable;
	}

	public void setUserSelectable(String userSelectable) {
		this.userSelectable = userSelectable;
	}

	public GetStationsRequest withUserSelectable(String userSelectable) {
	    this.setUserSelectable(userSelectable);
	    return this;
	} 
	
	private String webRtcUserId;
	public String getWebRtcUserId() {
		return this.webRtcUserId;
	}

	public void setWebRtcUserId(String webRtcUserId) {
		this.webRtcUserId = webRtcUserId;
	}

	public GetStationsRequest withWebRtcUserId(String webRtcUserId) {
	    this.setWebRtcUserId(webRtcUserId);
	    return this;
	} 
	
	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetStationsRequest withId(String id) {
	    this.setId(id);
	    return this;
	} 
	
	private String lineAppearanceId;
	public String getLineAppearanceId() {
		return this.lineAppearanceId;
	}

	public void setLineAppearanceId(String lineAppearanceId) {
		this.lineAppearanceId = lineAppearanceId;
	}

	public GetStationsRequest withLineAppearanceId(String lineAppearanceId) {
	    this.setLineAppearanceId(lineAppearanceId);
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

    public GetStationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/stations")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("userSelectable", "", userSelectable)
        
                .withQueryParameters("webRtcUserId", "", webRtcUserId)
        
                .withQueryParameters("id", "", id)
        
                .withQueryParameters("lineAppearanceId", "", lineAppearanceId)
        
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
		private final GetStationsRequest request;

		private Builder() {
			request = new GetStationsRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withUserSelectable(String userSelectable) {
			request.setUserSelectable(userSelectable);
			return this;
		}
		
		public Builder withWebRtcUserId(String webRtcUserId) {
			request.setWebRtcUserId(webRtcUserId);
			return this;
		}
		
		public Builder withId(String id) {
			request.setId(id);
			return this;
		}
		
		public Builder withLineAppearanceId(String lineAppearanceId) {
			request.setLineAppearanceId(lineAppearanceId);
			return this;
		}
		

		

		public GetStationsRequest build() {
            
			return request;
		}
	}
}
