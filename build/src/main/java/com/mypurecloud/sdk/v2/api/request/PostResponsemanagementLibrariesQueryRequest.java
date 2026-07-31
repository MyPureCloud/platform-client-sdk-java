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

import com.mypurecloud.sdk.v2.model.CreateResponseAssetRequest;
import com.mypurecloud.sdk.v2.model.CreateResponseAssetResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.LibraryBatchRequest;
import com.mypurecloud.sdk.v2.model.LibraryDivisionView;
import com.mypurecloud.sdk.v2.model.LibraryDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.QueryCriteriaQuery;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseAsset;
import com.mypurecloud.sdk.v2.model.ResponseAssetBulkRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseAssetRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchResults;
import com.mypurecloud.sdk.v2.model.ResponseAssetStatus;
import com.mypurecloud.sdk.v2.model.ResponseDivisionView;
import com.mypurecloud.sdk.v2.model.ResponseDivisionViewQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;

public class PostResponsemanagementLibrariesQueryRequest {

	private QueryCriteriaQuery body;
	public QueryCriteriaQuery getBody() {
		return this.body;
	}

	public void setBody(QueryCriteriaQuery body) {
		this.body = body;
	}

	public PostResponsemanagementLibrariesQueryRequest withBody(QueryCriteriaQuery body) {
	    this.setBody(body);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public PostResponsemanagementLibrariesQueryRequest withPageNumber(Integer pageNumber) {
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

	public PostResponsemanagementLibrariesQueryRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public PostResponsemanagementLibrariesQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<QueryCriteriaQuery> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostResponsemanagementLibrariesQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/responsemanagement/libraries/query")

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        
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


	public static Builder builder(QueryCriteriaQuery body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostResponsemanagementLibrariesQueryRequest request;

		private Builder() {
			request = new PostResponsemanagementLibrariesQueryRequest();
		}


		public Builder withBody(QueryCriteriaQuery body) {
			request.setBody(body);
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



		public Builder withRequiredParams(QueryCriteriaQuery body) {
			request.setBody(body);

			return this;
		}


		public PostResponsemanagementLibrariesQueryRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostResponsemanagementLibrariesQueryRequest.");
            }
            
			return request;
		}
	}
}
