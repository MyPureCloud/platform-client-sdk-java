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
import com.mypurecloud.sdk.v2.model.RequiredDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryOpportunitiesRequest
 */

public class QueryOpportunitiesRequest  implements Serializable {
  
  private RequiredDateRange range = null;

  public QueryOpportunitiesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryOpportunitiesRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The date range for the query
   **/
  public QueryOpportunitiesRequest range(RequiredDateRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date range for the query")
  @JsonProperty("range")
  public RequiredDateRange getRange() {
    return range;
  }
  public void setRange(RequiredDateRange range) {
    this.range = range;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOpportunitiesRequest queryOpportunitiesRequest = (QueryOpportunitiesRequest) o;

    return Objects.equals(this.range, queryOpportunitiesRequest.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunitiesRequest {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

