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
import com.mypurecloud.sdk.v2.model.DomainEntityListingQueryResult;
import com.mypurecloud.sdk.v2.model.QueryFacetInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueryResults
 */

public class QueryResults  implements Serializable {
  
  private DomainEntityListingQueryResult results = null;
  private QueryFacetInfo facetInfo = null;

  
  /**
   **/
  public QueryResults results(DomainEntityListingQueryResult results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public DomainEntityListingQueryResult getResults() {
    return results;
  }
  public void setResults(DomainEntityListingQueryResult results) {
    this.results = results;
  }

  
  /**
   **/
  public QueryResults facetInfo(QueryFacetInfo facetInfo) {
    this.facetInfo = facetInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facetInfo")
  public QueryFacetInfo getFacetInfo() {
    return facetInfo;
  }
  public void setFacetInfo(QueryFacetInfo facetInfo) {
    this.facetInfo = facetInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResults queryResults = (QueryResults) o;
    return Objects.equals(this.results, queryResults.results) &&
        Objects.equals(this.facetInfo, queryResults.facetInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, facetInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResults {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    facetInfo: ").append(toIndentedString(facetInfo)).append("\n");
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

