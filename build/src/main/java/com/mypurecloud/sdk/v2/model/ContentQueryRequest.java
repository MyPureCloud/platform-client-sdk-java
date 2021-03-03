package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ContentAttributeFilterItem;
import com.mypurecloud.sdk.v2.model.ContentFacetFilterItem;
import com.mypurecloud.sdk.v2.model.ContentSortItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContentQueryRequest
 */

public class ContentQueryRequest  implements Serializable {
  
  private String queryPhrase = null;
  private Integer pageNumber = null;
  private Integer pageSize = null;
  private List<String> facetNameRequests = new ArrayList<String>();
  private List<ContentSortItem> sort = new ArrayList<ContentSortItem>();
  private List<ContentFacetFilterItem> filters = new ArrayList<ContentFacetFilterItem>();
  private List<ContentAttributeFilterItem> attributeFilters = new ArrayList<ContentAttributeFilterItem>();
  private Boolean includeShares = null;

  
  /**
   **/
  public ContentQueryRequest queryPhrase(String queryPhrase) {
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
  public ContentQueryRequest pageNumber(Integer pageNumber) {
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
  public ContentQueryRequest pageSize(Integer pageSize) {
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
  public ContentQueryRequest facetNameRequests(List<String> facetNameRequests) {
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
  public ContentQueryRequest sort(List<ContentSortItem> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sort")
  public List<ContentSortItem> getSort() {
    return sort;
  }
  public void setSort(List<ContentSortItem> sort) {
    this.sort = sort;
  }

  
  /**
   **/
  public ContentQueryRequest filters(List<ContentFacetFilterItem> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filters")
  public List<ContentFacetFilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<ContentFacetFilterItem> filters) {
    this.filters = filters;
  }

  
  /**
   **/
  public ContentQueryRequest attributeFilters(List<ContentAttributeFilterItem> attributeFilters) {
    this.attributeFilters = attributeFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributeFilters")
  public List<ContentAttributeFilterItem> getAttributeFilters() {
    return attributeFilters;
  }
  public void setAttributeFilters(List<ContentAttributeFilterItem> attributeFilters) {
    this.attributeFilters = attributeFilters;
  }

  
  /**
   **/
  public ContentQueryRequest includeShares(Boolean includeShares) {
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
    ContentQueryRequest contentQueryRequest = (ContentQueryRequest) o;
    return Objects.equals(this.queryPhrase, contentQueryRequest.queryPhrase) &&
        Objects.equals(this.pageNumber, contentQueryRequest.pageNumber) &&
        Objects.equals(this.pageSize, contentQueryRequest.pageSize) &&
        Objects.equals(this.facetNameRequests, contentQueryRequest.facetNameRequests) &&
        Objects.equals(this.sort, contentQueryRequest.sort) &&
        Objects.equals(this.filters, contentQueryRequest.filters) &&
        Objects.equals(this.attributeFilters, contentQueryRequest.attributeFilters) &&
        Objects.equals(this.includeShares, contentQueryRequest.includeShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageNumber, pageSize, facetNameRequests, sort, filters, attributeFilters, includeShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentQueryRequest {\n");
    
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

