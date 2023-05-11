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

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;

public class GetInfrastructureascodeAcceleratorsRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetInfrastructureascodeAcceleratorsRequest withPageSize(Integer pageSize) {
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

	public GetInfrastructureascodeAcceleratorsRequest withPageNumber(Integer pageNumber) {
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

	public GetInfrastructureascodeAcceleratorsRequest withSortBy(String sortBy) {
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

	public GetInfrastructureascodeAcceleratorsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASC("asc"),
		DESC("desc");

		private String value;

		sortOrderValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortOrderValues fromString(String key) {
			if (key == null) return null;

			for (sortOrderValues value : sortOrderValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortOrderValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetInfrastructureascodeAcceleratorsRequest withName(String name) {
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

	public GetInfrastructureascodeAcceleratorsRequest withDescription(String description) {
	    this.setDescription(description);
	    return this;
	} 

	private String origin;
	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public GetInfrastructureascodeAcceleratorsRequest withOrigin(String origin) {
	    this.setOrigin(origin);
	    return this;
	} 

	public enum originValues { 
		COMMUNITY("community"),
		PARTNER("partner"),
		GENESYS("genesys");

		private String value;

		originValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static originValues fromString(String key) {
			if (key == null) return null;

			for (originValues value : originValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return originValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetInfrastructureascodeAcceleratorsRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		MODULE("module"),
		ACCELERATOR("accelerator"),
		BLUEPRINT("blueprint");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String classification;
	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public GetInfrastructureascodeAcceleratorsRequest withClassification(String classification) {
	    this.setClassification(classification);
	    return this;
	} 

	private String tags;
	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public GetInfrastructureascodeAcceleratorsRequest withTags(String tags) {
	    this.setTags(tags);
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

    public GetInfrastructureascodeAcceleratorsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/infrastructureascode/accelerators")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("description", "", description)
        

                .withQueryParameters("origin", "", origin)
        

                .withQueryParameters("type", "", type)
        

                .withQueryParameters("classification", "", classification)
        

                .withQueryParameters("tags", "", tags)
        
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
		private final GetInfrastructureascodeAcceleratorsRequest request;

		private Builder() {
			request = new GetInfrastructureascodeAcceleratorsRequest();
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

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		
		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());

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

		public Builder withOrigin(String origin) {
			request.setOrigin(origin);
			return this;
		}



		
		public Builder withOrigin(originValues origin) {
		    request.setOrigin(origin.toString());

		    return this;
		}

		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		
		public Builder withType(typeValues type) {
		    request.setType(type.toString());

		    return this;
		}

		public Builder withClassification(String classification) {
			request.setClassification(classification);
			return this;
		}

		public Builder withTags(String tags) {
			request.setTags(tags);
			return this;
		}




		public GetInfrastructureascodeAcceleratorsRequest build() {
            
			return request;
		}
	}
}
