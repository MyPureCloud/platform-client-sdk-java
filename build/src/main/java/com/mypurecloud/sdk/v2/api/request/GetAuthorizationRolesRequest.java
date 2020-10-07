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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;

public class GetAuthorizationRolesRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetAuthorizationRolesRequest withPageSize(Integer pageSize) {
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

	public GetAuthorizationRolesRequest withPageNumber(Integer pageNumber) {
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

	public GetAuthorizationRolesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetAuthorizationRolesRequest withExpand(List<String> expand) {
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

	public GetAuthorizationRolesRequest withNextPage(String nextPage) {
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

	public GetAuthorizationRolesRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetAuthorizationRolesRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private List<String> permission;
	public List<String> getPermission() {
		return this.permission;
	}

	public void setPermission(List<String> permission) {
		this.permission = permission;
	}

	public GetAuthorizationRolesRequest withPermission(List<String> permission) {
	    this.setPermission(permission);
	    return this;
	} 
	
	private List<String> defaultRoleId;
	public List<String> getDefaultRoleId() {
		return this.defaultRoleId;
	}

	public void setDefaultRoleId(List<String> defaultRoleId) {
		this.defaultRoleId = defaultRoleId;
	}

	public GetAuthorizationRolesRequest withDefaultRoleId(List<String> defaultRoleId) {
	    this.setDefaultRoleId(defaultRoleId);
	    return this;
	} 
	
	private Boolean userCount;
	public Boolean getUserCount() {
		return this.userCount;
	}

	public void setUserCount(Boolean userCount) {
		this.userCount = userCount;
	}

	public GetAuthorizationRolesRequest withUserCount(Boolean userCount) {
	    this.setUserCount(userCount);
	    return this;
	} 
	
	private List<String> id;
	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public GetAuthorizationRolesRequest withId(List<String> id) {
	    this.setId(id);
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

    public GetAuthorizationRolesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/authorization/roles")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("permission", "multi", permission)
        
                .withQueryParameters("defaultRoleId", "multi", defaultRoleId)
        
                .withQueryParameters("userCount", "", userCount)
        
                .withQueryParameters("id", "multi", id)
        
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
		private final GetAuthorizationRolesRequest request;

		private Builder() {
			request = new GetAuthorizationRolesRequest();
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
		
		public Builder withExpand(List<String> expand) {
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
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withPermission(List<String> permission) {
			request.setPermission(permission);
			return this;
		}
		
		public Builder withDefaultRoleId(List<String> defaultRoleId) {
			request.setDefaultRoleId(defaultRoleId);
			return this;
		}
		
		public Builder withUserCount(Boolean userCount) {
			request.setUserCount(userCount);
			return this;
		}
		
		public Builder withId(List<String> id) {
			request.setId(id);
			return this;
		}
		

		

		public GetAuthorizationRolesRequest build() {
            
			return request;
		}
	}
}
