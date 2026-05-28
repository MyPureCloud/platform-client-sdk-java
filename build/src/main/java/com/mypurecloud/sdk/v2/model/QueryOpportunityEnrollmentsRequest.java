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
 * QueryOpportunityEnrollmentsRequest
 */

public class QueryOpportunityEnrollmentsRequest  implements Serializable {
  
  private RequiredDateRange range = null;
  private String opportunityId = null;

  public QueryOpportunityEnrollmentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryOpportunityEnrollmentsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The date range for the query. Exactly one of opportunityId or range must be set
   **/
  public QueryOpportunityEnrollmentsRequest range(RequiredDateRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date range for the query. Exactly one of opportunityId or range must be set")
  @JsonProperty("range")
  public RequiredDateRange getRange() {
    return range;
  }
  public void setRange(RequiredDateRange range) {
    this.range = range;
  }


  /**
   * The ID of the specific opportunity by which to filter. Exactly one of opportunityId or range must be set
   **/
  public QueryOpportunityEnrollmentsRequest opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the specific opportunity by which to filter. Exactly one of opportunityId or range must be set")
  @JsonProperty("opportunityId")
  public String getOpportunityId() {
    return opportunityId;
  }
  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOpportunityEnrollmentsRequest queryOpportunityEnrollmentsRequest = (QueryOpportunityEnrollmentsRequest) o;

    return Objects.equals(this.range, queryOpportunityEnrollmentsRequest.range) &&
            Objects.equals(this.opportunityId, queryOpportunityEnrollmentsRequest.opportunityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, opportunityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunityEnrollmentsRequest {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
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

