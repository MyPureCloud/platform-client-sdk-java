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
import com.mypurecloud.sdk.v2.model.ResponseFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Used to query for responses
 */
@ApiModel(description = "Used to query for responses")

public class ResponseQueryRequest  implements Serializable {
  
  private String queryPhrase = null;
  private Integer pageSize = null;
  private List<ResponseFilter> filters = new ArrayList<ResponseFilter>();

  
  /**
   * Query phrase to search response text and name. If not set will match all.
   **/
  public ResponseQueryRequest queryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query phrase to search response text and name. If not set will match all.")
  @JsonProperty("queryPhrase")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
  }

  
  /**
   * The maximum number of hits to return. Default: 25, Maximum: 500.
   **/
  public ResponseQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of hits to return. Default: 25, Maximum: 500.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * Filter the query results.
   **/
  public ResponseQueryRequest filters(List<ResponseFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter the query results.")
  @JsonProperty("filters")
  public List<ResponseFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<ResponseFilter> filters) {
    this.filters = filters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseQueryRequest responseQueryRequest = (ResponseQueryRequest) o;
    return Objects.equals(this.queryPhrase, responseQueryRequest.queryPhrase) &&
        Objects.equals(this.pageSize, responseQueryRequest.pageSize) &&
        Objects.equals(this.filters, responseQueryRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageSize, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseQueryRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

