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

import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;

public class GetBusinessrulesDecisiontablesSearchRequest {

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String schemaId;
	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withSchemaId(String schemaId) {
	    this.setSchemaId(schemaId);
	    return this;
	} 

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private Boolean withPublishedVersion;
	public Boolean getWithPublishedVersion() {
		return this.withPublishedVersion;
	}

	public void setWithPublishedVersion(Boolean withPublishedVersion) {
		this.withPublishedVersion = withPublishedVersion;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withWithPublishedVersion(Boolean withPublishedVersion) {
	    this.setWithPublishedVersion(withPublishedVersion);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		EXECUTIONINPUTSCHEMA("ExecutionInputSchema"),
		EXECUTIONOUTPUTSCHEMA("ExecutionOutputSchema");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private List<String> ids;
	public List<String> getIds() {
		return this.ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public GetBusinessrulesDecisiontablesSearchRequest withIds(List<String> ids) {
	    this.setIds(ids);
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

    public GetBusinessrulesDecisiontablesSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/businessrules/decisiontables/search")

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("schemaId", "", schemaId)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("withPublishedVersion", "", withPublishedVersion)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("ids", "multi", ids)
        
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
		private final GetBusinessrulesDecisiontablesSearchRequest request;

		private Builder() {
			request = new GetBusinessrulesDecisiontablesSearchRequest();
		}


		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withSchemaId(String schemaId) {
			request.setSchemaId(schemaId);
			return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withWithPublishedVersion(Boolean withPublishedVersion) {
			request.setWithPublishedVersion(withPublishedVersion);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}

		public Builder withIds(List<String> ids) {
			request.setIds(ids);
			return this;
		}




		public GetBusinessrulesDecisiontablesSearchRequest build() {
            
			return request;
		}
	}
}
