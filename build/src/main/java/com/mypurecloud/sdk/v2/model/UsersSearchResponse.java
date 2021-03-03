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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UsersSearchResponse
 */

public class UsersSearchResponse  implements Serializable {
  
  private Long total = null;
  private Integer pageCount = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private String previousPage = null;
  private String currentPage = null;
  private String nextPage = null;
  private List<String> types = new ArrayList<String>();
  private List<User> results = new ArrayList<User>();

  
  /**
   * The total number of results found
   **/
  public UsersSearchResponse total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of results found")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   * The total number of pages
   **/
  public UsersSearchResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of pages")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * The current page size
   **/
  public UsersSearchResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current page size")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The current page number
   **/
  public UsersSearchResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current page number")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Q64 value for the previous page of results
   **/
  public UsersSearchResponse previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Q64 value for the previous page of results")
  @JsonProperty("previousPage")
  public String getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  
  /**
   * Q64 value for the current page of results
   **/
  public UsersSearchResponse currentPage(String currentPage) {
    this.currentPage = currentPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Q64 value for the current page of results")
  @JsonProperty("currentPage")
  public String getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }

  
  /**
   * Q64 value for the next page of results
   **/
  public UsersSearchResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Q64 value for the next page of results")
  @JsonProperty("nextPage")
  public String getNextPage() {
    return nextPage;
  }
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  
  /**
   * Resource types the search was performed against
   **/
  public UsersSearchResponse types(List<String> types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Resource types the search was performed against")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  
  /**
   * Search results
   **/
  public UsersSearchResponse results(List<User> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search results")
  @JsonProperty("results")
  public List<User> getResults() {
    return results;
  }
  public void setResults(List<User> results) {
    this.results = results;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersSearchResponse usersSearchResponse = (UsersSearchResponse) o;
    return Objects.equals(this.total, usersSearchResponse.total) &&
        Objects.equals(this.pageCount, usersSearchResponse.pageCount) &&
        Objects.equals(this.pageSize, usersSearchResponse.pageSize) &&
        Objects.equals(this.pageNumber, usersSearchResponse.pageNumber) &&
        Objects.equals(this.previousPage, usersSearchResponse.previousPage) &&
        Objects.equals(this.currentPage, usersSearchResponse.currentPage) &&
        Objects.equals(this.nextPage, usersSearchResponse.nextPage) &&
        Objects.equals(this.types, usersSearchResponse.types) &&
        Objects.equals(this.results, usersSearchResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, pageCount, pageSize, pageNumber, previousPage, currentPage, nextPage, types, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSearchResponse {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

