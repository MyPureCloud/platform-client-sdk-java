package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;

public class GetFlowsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetFlowsRequest withType(String type) {
	    this.setType(type);
	    return this;
	}

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetFlowsRequest withPageNumber(Integer pageNumber) {
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

	public GetFlowsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	}

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetFlowsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	}

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetFlowsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	}

	private List<String> id;
	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public GetFlowsRequest withId(List<String> id) {
	    this.setId(id);
	    return this;
	}

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetFlowsRequest withName(String name) {
	    this.setName(name);
	    return this;
	}

	private String description;
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GetFlowsRequest withDescription(String description) {
	    this.setDescription(description);
	    return this;
	}

	private String nameOrDescription;
	public String getNameOrDescription() {
		return this.nameOrDescription;
	}

	public void setNameOrDescription(String nameOrDescription) {
		this.nameOrDescription = nameOrDescription;
	}

	public GetFlowsRequest withNameOrDescription(String nameOrDescription) {
	    this.setNameOrDescription(nameOrDescription);
	    return this;
	}

	private String publishVersionId;
	public String getPublishVersionId() {
		return this.publishVersionId;
	}

	public void setPublishVersionId(String publishVersionId) {
		this.publishVersionId = publishVersionId;
	}

	public GetFlowsRequest withPublishVersionId(String publishVersionId) {
	    this.setPublishVersionId(publishVersionId);
	    return this;
	}

	private String editableBy;
	public String getEditableBy() {
		return this.editableBy;
	}

	public void setEditableBy(String editableBy) {
		this.editableBy = editableBy;
	}

	public GetFlowsRequest withEditableBy(String editableBy) {
	    this.setEditableBy(editableBy);
	    return this;
	}

	private String lockedBy;
	public String getLockedBy() {
		return this.lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public GetFlowsRequest withLockedBy(String lockedBy) {
	    this.setLockedBy(lockedBy);
	    return this;
	}

	private String secure;
	public String getSecure() {
		return this.secure;
	}

	public void setSecure(String secure) {
		this.secure = secure;
	}

	public GetFlowsRequest withSecure(String secure) {
	    this.setSecure(secure);
	    return this;
	}

	private Boolean deleted;
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public GetFlowsRequest withDeleted(Boolean deleted) {
	    this.setDeleted(deleted);
	    return this;
	}

	private Boolean includeSchemas;
	public Boolean getIncludeSchemas() {
		return this.includeSchemas;
	}

	public void setIncludeSchemas(Boolean includeSchemas) {
		this.includeSchemas = includeSchemas;
	}

	public GetFlowsRequest withIncludeSchemas(Boolean includeSchemas) {
	    this.setIncludeSchemas(includeSchemas);
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

    public GetFlowsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'type' is set
        if (this.type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when building request for GetFlowsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/flows")
                .withQueryParameters("type", "", type)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("id", "multi", id)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("description", "", description)
        
                .withQueryParameters("nameOrDescription", "", nameOrDescription)
        
                .withQueryParameters("publishVersionId", "", publishVersionId)
        
                .withQueryParameters("editableBy", "", editableBy)
        
                .withQueryParameters("lockedBy", "", lockedBy)
        
                .withQueryParameters("secure", "", secure)
        
                .withQueryParameters("deleted", "", deleted)
        
                .withQueryParameters("includeSchemas", "", includeSchemas)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String type) {
	    return new Builder()
	            .withRequiredParams(type);
	}

	public static class Builder {
		private final GetFlowsRequest request;

		private Builder() {
			request = new GetFlowsRequest();
		}

		public Builder withType(String type) {
			request.setType(type);
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
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}
		public Builder withId(List<String> id) {
			request.setId(id);
			return this;
		}
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		public Builder withDescription(String description) {
			request.setDescription(description);
			return this;
		}
		public Builder withNameOrDescription(String nameOrDescription) {
			request.setNameOrDescription(nameOrDescription);
			return this;
		}
		public Builder withPublishVersionId(String publishVersionId) {
			request.setPublishVersionId(publishVersionId);
			return this;
		}
		public Builder withEditableBy(String editableBy) {
			request.setEditableBy(editableBy);
			return this;
		}
		public Builder withLockedBy(String lockedBy) {
			request.setLockedBy(lockedBy);
			return this;
		}
		public Builder withSecure(String secure) {
			request.setSecure(secure);
			return this;
		}
		public Builder withDeleted(Boolean deleted) {
			request.setDeleted(deleted);
			return this;
		}
		public Builder withIncludeSchemas(Boolean includeSchemas) {
			request.setIncludeSchemas(includeSchemas);
			return this;
		}

		public Builder withRequiredParams(String type) {
			request.setType(type);
			return this;
		}


		public GetFlowsRequest build() {
			return request;
		}
	}
}
