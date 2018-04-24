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
import com.mypurecloud.sdk.v2.model.AppFoundryListingCategory;
import com.mypurecloud.sdk.v2.model.PagedListingEntity;

public class GetAppfoundryPlatformNameCategoryRequest {
    
	private String platformName;
	public String getPlatformName() {
		return this.platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public GetAppfoundryPlatformNameCategoryRequest withPlatformName(String platformName) {
	    this.setPlatformName(platformName);
	    return this;
	} 
	
	private String categoryName;
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public GetAppfoundryPlatformNameCategoryRequest withCategoryName(String categoryName) {
	    this.setCategoryName(categoryName);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetAppfoundryPlatformNameCategoryRequest withPageSize(Integer pageSize) {
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

	public GetAppfoundryPlatformNameCategoryRequest withPageNumber(Integer pageNumber) {
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

	public GetAppfoundryPlatformNameCategoryRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private List<Object> expand;
	public List<Object> getExpand() {
		return this.expand;
	}

	public void setExpand(List<Object> expand) {
		this.expand = expand;
	}

	public GetAppfoundryPlatformNameCategoryRequest withExpand(List<Object> expand) {
	    this.setExpand(expand);
	    return this;
	} 
	
	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetAppfoundryPlatformNameCategoryRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 
	
	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetAppfoundryPlatformNameCategoryRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
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

    public GetAppfoundryPlatformNameCategoryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'platformName' is set
        if (this.platformName == null) {
            throw new IllegalStateException("Missing the required parameter 'platformName' when building request for GetAppfoundryPlatformNameCategoryRequest.");
        }
        
        // verify the required parameter 'categoryName' is set
        if (this.categoryName == null) {
            throw new IllegalStateException("Missing the required parameter 'categoryName' when building request for GetAppfoundryPlatformNameCategoryRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/appfoundry/{platformName}/categories/{categoryName}")
                .withPathParameter("platformName", platformName)
        
                .withPathParameter("categoryName", categoryName)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String platformName, String categoryName) {
	    return new Builder()
	            .withRequiredParams(platformName, categoryName);
	}
	

	public static class Builder {
		private final GetAppfoundryPlatformNameCategoryRequest request;

		private Builder() {
			request = new GetAppfoundryPlatformNameCategoryRequest();
		}

		
		public Builder withPlatformName(String platformName) {
			request.setPlatformName(platformName);
			return this;
		}
		
		public Builder withCategoryName(String categoryName) {
			request.setCategoryName(categoryName);
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
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withExpand(List<Object> expand) {
			request.setExpand(expand);
			return this;
		}
		
		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}
		
		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
			return this;
		}
		

		
		public Builder withRequiredParams(String platformName, String categoryName) {
			request.setPlatformName(platformName);
						request.setCategoryName(categoryName);
			
			return this;
		}
		

		public GetAppfoundryPlatformNameCategoryRequest build() {
            
            // verify the required parameter 'platformName' is set
            if (request.platformName == null) {
                throw new IllegalStateException("Missing the required parameter 'platformName' when building request for GetAppfoundryPlatformNameCategoryRequest.");
            }
            
            // verify the required parameter 'categoryName' is set
            if (request.categoryName == null) {
                throw new IllegalStateException("Missing the required parameter 'categoryName' when building request for GetAppfoundryPlatformNameCategoryRequest.");
            }
            
			return request;
		}
	}
}
