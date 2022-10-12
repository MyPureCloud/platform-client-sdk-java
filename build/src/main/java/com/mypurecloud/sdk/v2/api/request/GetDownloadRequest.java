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
import com.mypurecloud.sdk.v2.model.UrlResponse;

public class GetDownloadRequest {

	private String downloadId;
	public String getDownloadId() {
		return this.downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}

	public GetDownloadRequest withDownloadId(String downloadId) {
	    this.setDownloadId(downloadId);
	    return this;
	} 

	private String contentDisposition;
	public String getContentDisposition() {
		return this.contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public GetDownloadRequest withContentDisposition(String contentDisposition) {
	    this.setContentDisposition(contentDisposition);
	    return this;
	} 

	private Boolean issueRedirect;
	public Boolean getIssueRedirect() {
		return this.issueRedirect;
	}

	public void setIssueRedirect(Boolean issueRedirect) {
		this.issueRedirect = issueRedirect;
	}

	public GetDownloadRequest withIssueRedirect(Boolean issueRedirect) {
	    this.setIssueRedirect(issueRedirect);
	    return this;
	} 

	private Boolean redirectToAuth;
	public Boolean getRedirectToAuth() {
		return this.redirectToAuth;
	}

	public void setRedirectToAuth(Boolean redirectToAuth) {
		this.redirectToAuth = redirectToAuth;
	}

	public GetDownloadRequest withRedirectToAuth(Boolean redirectToAuth) {
	    this.setRedirectToAuth(redirectToAuth);
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

    public GetDownloadRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'downloadId' is set
        if (this.downloadId == null) {
            throw new IllegalStateException("Missing the required parameter 'downloadId' when building request for GetDownloadRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/downloads/{downloadId}")
                .withPathParameter("downloadId", downloadId)
        

                .withQueryParameters("contentDisposition", "", contentDisposition)
        

                .withQueryParameters("issueRedirect", "", issueRedirect)
        

                .withQueryParameters("redirectToAuth", "", redirectToAuth)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String downloadId) {
	    return new Builder()
	            .withRequiredParams(downloadId);
	}


	public static class Builder {
		private final GetDownloadRequest request;

		private Builder() {
			request = new GetDownloadRequest();
		}


		public Builder withDownloadId(String downloadId) {
			request.setDownloadId(downloadId);
			return this;
		}

		public Builder withContentDisposition(String contentDisposition) {
			request.setContentDisposition(contentDisposition);
			return this;
		}

		public Builder withIssueRedirect(Boolean issueRedirect) {
			request.setIssueRedirect(issueRedirect);
			return this;
		}

		public Builder withRedirectToAuth(Boolean redirectToAuth) {
			request.setRedirectToAuth(redirectToAuth);
			return this;
		}



		public Builder withRequiredParams(String downloadId) {
			request.setDownloadId(downloadId);

			return this;
		}


		public GetDownloadRequest build() {
            
            // verify the required parameter 'downloadId' is set
            if (request.downloadId == null) {
                throw new IllegalStateException("Missing the required parameter 'downloadId' when building request for GetDownloadRequest.");
            }
            
			return request;
		}
	}
}
