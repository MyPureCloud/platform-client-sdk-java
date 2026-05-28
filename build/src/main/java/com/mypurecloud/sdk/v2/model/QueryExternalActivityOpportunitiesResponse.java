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
import com.mypurecloud.sdk.v2.model.QueryExternalActivityOpportunityResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryExternalActivityOpportunitiesResponse
 */

public class QueryExternalActivityOpportunitiesResponse  implements Serializable {
  
  private List<QueryExternalActivityOpportunityResult> externalActivities = null;

  public QueryExternalActivityOpportunitiesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      externalActivities = new ArrayList<QueryExternalActivityOpportunityResult>();
    }
  }

  public QueryExternalActivityOpportunitiesResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      externalActivities = new ArrayList<QueryExternalActivityOpportunityResult>();
    }
  }

  
  /**
   * The external activities and associated opportunity details
   **/
  public QueryExternalActivityOpportunitiesResponse externalActivities(List<QueryExternalActivityOpportunityResult> externalActivities) {
    this.externalActivities = externalActivities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external activities and associated opportunity details")
  @JsonProperty("externalActivities")
  public List<QueryExternalActivityOpportunityResult> getExternalActivities() {
    return externalActivities;
  }
  public void setExternalActivities(List<QueryExternalActivityOpportunityResult> externalActivities) {
    this.externalActivities = externalActivities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryExternalActivityOpportunitiesResponse queryExternalActivityOpportunitiesResponse = (QueryExternalActivityOpportunitiesResponse) o;

    return Objects.equals(this.externalActivities, queryExternalActivityOpportunitiesResponse.externalActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalActivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryExternalActivityOpportunitiesResponse {\n");
    
    sb.append("    externalActivities: ").append(toIndentedString(externalActivities)).append("\n");
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

