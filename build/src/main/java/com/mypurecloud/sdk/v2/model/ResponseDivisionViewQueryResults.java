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
import com.mypurecloud.sdk.v2.model.DomainEntityListingResponseDivisionView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Used to return response division view query results.
 */
@ApiModel(description = "Used to return response division view query results.")

public class ResponseDivisionViewQueryResults  implements Serializable {
  
  private DomainEntityListingResponseDivisionView results = null;

  public ResponseDivisionViewQueryResults() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ResponseDivisionViewQueryResults(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Contains the query results
   **/
  public ResponseDivisionViewQueryResults results(DomainEntityListingResponseDivisionView results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the query results")
  @JsonProperty("results")
  public DomainEntityListingResponseDivisionView getResults() {
    return results;
  }
  public void setResults(DomainEntityListingResponseDivisionView results) {
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
    ResponseDivisionViewQueryResults responseDivisionViewQueryResults = (ResponseDivisionViewQueryResults) o;

    return Objects.equals(this.results, responseDivisionViewQueryResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDivisionViewQueryResults {\n");
    
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

