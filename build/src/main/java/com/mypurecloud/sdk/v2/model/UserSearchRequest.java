package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.SearchSort;
import com.mypurecloud.sdk.v2.model.UserSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserSearchRequest
 */

public class UserSearchRequest  implements Serializable {
  

  /**
   * The sort order for results
   */
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC"),
    SCORE("SCORE");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;
  private String sortBy = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<SearchSort> sort = new ArrayList<SearchSort>();
  private List<String> expand = new ArrayList<String>();
  private List<UserSearchCriteria> query = new ArrayList<UserSearchCriteria>();

  
  /**
   * The sort order for results
   **/
  public UserSearchRequest sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order for results")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  /**
   * The field in the resource that you want to sort the results by
   **/
  public UserSearchRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the resource that you want to sort the results by")
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  
  /**
   * The number of results per page
   **/
  public UserSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results per page")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The page of resources you want to retrieve
   **/
  public UserSearchRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page of resources you want to retrieve")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Multi-value sort order, list of multiple sort values
   **/
  public UserSearchRequest sort(List<SearchSort> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Multi-value sort order, list of multiple sort values")
  @JsonProperty("sort")
  public List<SearchSort> getSort() {
    return sort;
  }
  public void setSort(List<SearchSort> sort) {
    this.sort = sort;
  }

  
  /**
   * Provides more details about a specified resource
   **/
  public UserSearchRequest expand(List<String> expand) {
    this.expand = expand;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides more details about a specified resource")
  @JsonProperty("expand")
  public List<String> getExpand() {
    return expand;
  }
  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  
  /**
   **/
  public UserSearchRequest query(List<UserSearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("query")
  public List<UserSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<UserSearchCriteria> query) {
    this.query = query;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchRequest userSearchRequest = (UserSearchRequest) o;
    return Objects.equals(this.sortOrder, userSearchRequest.sortOrder) &&
        Objects.equals(this.sortBy, userSearchRequest.sortBy) &&
        Objects.equals(this.pageSize, userSearchRequest.pageSize) &&
        Objects.equals(this.pageNumber, userSearchRequest.pageNumber) &&
        Objects.equals(this.sort, userSearchRequest.sort) &&
        Objects.equals(this.expand, userSearchRequest.expand) &&
        Objects.equals(this.query, userSearchRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, sort, expand, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

