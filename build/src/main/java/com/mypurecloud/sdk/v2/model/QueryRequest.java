package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AttributeFilterItem;
import com.mypurecloud.sdk.v2.model.ContentFilterItem;
import com.mypurecloud.sdk.v2.model.SortItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryRequest
 */

public class QueryRequest  implements Serializable {
  
  private String queryPhrase = null;
  private Integer pageNumber = null;
  private Integer pageSize = null;
  private List<String> facetNameRequests = null;
  private List<SortItem> sort = null;
  private List<ContentFilterItem> filters = null;
  private List<AttributeFilterItem> attributeFilters = null;
  private Boolean includeShares = null;

  public QueryRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      facetNameRequests = new ArrayList<String>();
      sort = new ArrayList<SortItem>();
      filters = new ArrayList<ContentFilterItem>();
      attributeFilters = new ArrayList<AttributeFilterItem>();
    }
  }

  
  /**
   **/
  public QueryRequest queryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queryPhrase")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
  }


  /**
   **/
  public QueryRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   **/
  public QueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   **/
  public QueryRequest facetNameRequests(List<String> facetNameRequests) {
    this.facetNameRequests = facetNameRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facetNameRequests")
  public List<String> getFacetNameRequests() {
    return facetNameRequests;
  }
  public void setFacetNameRequests(List<String> facetNameRequests) {
    this.facetNameRequests = facetNameRequests;
  }


  /**
   **/
  public QueryRequest sort(List<SortItem> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sort")
  public List<SortItem> getSort() {
    return sort;
  }
  public void setSort(List<SortItem> sort) {
    this.sort = sort;
  }


  /**
   **/
  public QueryRequest filters(List<ContentFilterItem> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filters")
  public List<ContentFilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<ContentFilterItem> filters) {
    this.filters = filters;
  }


  /**
   **/
  public QueryRequest attributeFilters(List<AttributeFilterItem> attributeFilters) {
    this.attributeFilters = attributeFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributeFilters")
  public List<AttributeFilterItem> getAttributeFilters() {
    return attributeFilters;
  }
  public void setAttributeFilters(List<AttributeFilterItem> attributeFilters) {
    this.attributeFilters = attributeFilters;
  }


  /**
   **/
  public QueryRequest includeShares(Boolean includeShares) {
    this.includeShares = includeShares;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("includeShares")
  public Boolean getIncludeShares() {
    return includeShares;
  }
  public void setIncludeShares(Boolean includeShares) {
    this.includeShares = includeShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;

    return Objects.equals(this.queryPhrase, queryRequest.queryPhrase) &&
            Objects.equals(this.pageNumber, queryRequest.pageNumber) &&
            Objects.equals(this.pageSize, queryRequest.pageSize) &&
            Objects.equals(this.facetNameRequests, queryRequest.facetNameRequests) &&
            Objects.equals(this.sort, queryRequest.sort) &&
            Objects.equals(this.filters, queryRequest.filters) &&
            Objects.equals(this.attributeFilters, queryRequest.attributeFilters) &&
            Objects.equals(this.includeShares, queryRequest.includeShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageNumber, pageSize, facetNameRequests, sort, filters, attributeFilters, includeShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    facetNameRequests: ").append(toIndentedString(facetNameRequests)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    attributeFilters: ").append(toIndentedString(attributeFilters)).append("\n");
    sb.append("    includeShares: ").append(toIndentedString(includeShares)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

