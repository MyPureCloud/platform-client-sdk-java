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
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JsonSearchResponse
 */

public class JsonSearchResponse  implements Serializable {
  
  private Long total = null;
  private Integer pageCount = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<String> types = new ArrayList<String>();
  private ArrayNode results = null;
  private ArrayNode aggregations = null;

  
  /**
   * The total number of results found
   **/
  public JsonSearchResponse total(Long total) {
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
  public JsonSearchResponse pageCount(Integer pageCount) {
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
  public JsonSearchResponse pageSize(Integer pageSize) {
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
  public JsonSearchResponse pageNumber(Integer pageNumber) {
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
   * Resource types the search was performed against
   **/
  public JsonSearchResponse types(List<String> types) {
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
  public JsonSearchResponse results(ArrayNode results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search results")
  @JsonProperty("results")
  public ArrayNode getResults() {
    return results;
  }
  public void setResults(ArrayNode results) {
    this.results = results;
  }

  
  /**
   **/
  public JsonSearchResponse aggregations(ArrayNode aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("aggregations")
  public ArrayNode getAggregations() {
    return aggregations;
  }
  public void setAggregations(ArrayNode aggregations) {
    this.aggregations = aggregations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSearchResponse jsonSearchResponse = (JsonSearchResponse) o;
    return Objects.equals(this.total, jsonSearchResponse.total) &&
        Objects.equals(this.pageCount, jsonSearchResponse.pageCount) &&
        Objects.equals(this.pageSize, jsonSearchResponse.pageSize) &&
        Objects.equals(this.pageNumber, jsonSearchResponse.pageNumber) &&
        Objects.equals(this.types, jsonSearchResponse.types) &&
        Objects.equals(this.results, jsonSearchResponse.results) &&
        Objects.equals(this.aggregations, jsonSearchResponse.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, pageCount, pageSize, pageNumber, types, results, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSearchResponse {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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

