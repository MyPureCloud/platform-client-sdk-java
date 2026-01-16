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

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleResponseEntityListing;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EscalationRuleRequest;
import com.mypurecloud.sdk.v2.model.EscalationRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ManualEscalationRequest;
import com.mypurecloud.sdk.v2.model.ManualEscalationResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaReactionsRequest;
import com.mypurecloud.sdk.v2.model.OpenSocialNormalizedMessageEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialReactionsNormalizedEventEntityListing;
import com.mypurecloud.sdk.v2.model.SocialEscalationResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicWithDataIngestionRuleMetadataResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicWithDataIngestionRuleMetadataResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;

public class GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest {

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String instagramIngestionRuleId;
	public String getInstagramIngestionRuleId() {
		return this.instagramIngestionRuleId;
	}

	public void setInstagramIngestionRuleId(String instagramIngestionRuleId) {
		this.instagramIngestionRuleId = instagramIngestionRuleId;
	}

	public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest withInstagramIngestionRuleId(String instagramIngestionRuleId) {
	    this.setInstagramIngestionRuleId(instagramIngestionRuleId);
	    return this;
	} 

	private String dataIngestionRuleVersion;
	public String getDataIngestionRuleVersion() {
		return this.dataIngestionRuleVersion;
	}

	public void setDataIngestionRuleVersion(String dataIngestionRuleVersion) {
		this.dataIngestionRuleVersion = dataIngestionRuleVersion;
	}

	public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest withDataIngestionRuleVersion(String dataIngestionRuleVersion) {
	    this.setDataIngestionRuleVersion(dataIngestionRuleVersion);
	    return this;
	} 

	private Boolean includeDeleted;
	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
	}

	public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest withIncludeDeleted(Boolean includeDeleted) {
	    this.setIncludeDeleted(includeDeleted);
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

    public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
        }
        
        // verify the required parameter 'instagramIngestionRuleId' is set
        if (this.instagramIngestionRuleId == null) {
            throw new IllegalStateException("Missing the required parameter 'instagramIngestionRuleId' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
        }
        
        // verify the required parameter 'dataIngestionRuleVersion' is set
        if (this.dataIngestionRuleVersion == null) {
            throw new IllegalStateException("Missing the required parameter 'dataIngestionRuleVersion' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/socialmedia/topics/{topicId}/dataingestionrules/instagram/{instagramIngestionRuleId}/versions/{dataIngestionRuleVersion}")
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("instagramIngestionRuleId", instagramIngestionRuleId)
        
                .withPathParameter("dataIngestionRuleVersion", dataIngestionRuleVersion)
        

                .withQueryParameters("includeDeleted", "", includeDeleted)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String topicId, String instagramIngestionRuleId, String dataIngestionRuleVersion) {
	    return new Builder()
	            .withRequiredParams(topicId, instagramIngestionRuleId, dataIngestionRuleVersion);
	}


	public static class Builder {
		private final GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest request;

		private Builder() {
			request = new GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest();
		}


		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withInstagramIngestionRuleId(String instagramIngestionRuleId) {
			request.setInstagramIngestionRuleId(instagramIngestionRuleId);
			return this;
		}

		public Builder withDataIngestionRuleVersion(String dataIngestionRuleVersion) {
			request.setDataIngestionRuleVersion(dataIngestionRuleVersion);
			return this;
		}

		public Builder withIncludeDeleted(Boolean includeDeleted) {
			request.setIncludeDeleted(includeDeleted);
			return this;
		}



		public Builder withRequiredParams(String topicId, String instagramIngestionRuleId, String dataIngestionRuleVersion) {
			request.setTopicId(topicId);
			request.setInstagramIngestionRuleId(instagramIngestionRuleId);
			request.setDataIngestionRuleVersion(dataIngestionRuleVersion);

			return this;
		}


		public GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest build() {
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
            }
            
            // verify the required parameter 'instagramIngestionRuleId' is set
            if (request.instagramIngestionRuleId == null) {
                throw new IllegalStateException("Missing the required parameter 'instagramIngestionRuleId' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
            }
            
            // verify the required parameter 'dataIngestionRuleVersion' is set
            if (request.dataIngestionRuleVersion == null) {
                throw new IllegalStateException("Missing the required parameter 'dataIngestionRuleVersion' when building request for GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.");
            }
            
			return request;
		}
	}
}
