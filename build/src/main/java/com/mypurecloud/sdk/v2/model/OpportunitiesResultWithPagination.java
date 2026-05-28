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
import com.mypurecloud.sdk.v2.model.OpportunityResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OpportunitiesResultWithPagination
 */

public class OpportunitiesResultWithPagination  implements Serializable {
  
  private Date nextStartDate = null;
  private List<OpportunityResult> opportunities = null;

  public OpportunitiesResultWithPagination() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      opportunities = new ArrayList<OpportunityResult>();
    }
  }

  public OpportunitiesResultWithPagination(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      opportunities = new ArrayList<OpportunityResult>();
    }
  }

  
  /**
   * The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results
   **/
  public OpportunitiesResultWithPagination nextStartDate(Date nextStartDate) {
    this.nextStartDate = nextStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results")
  @JsonProperty("nextStartDate")
  public Date getNextStartDate() {
    return nextStartDate;
  }
  public void setNextStartDate(Date nextStartDate) {
    this.nextStartDate = nextStartDate;
  }


  /**
   * The list of opportunities
   **/
  public OpportunitiesResultWithPagination opportunities(List<OpportunityResult> opportunities) {
    this.opportunities = opportunities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of opportunities")
  @JsonProperty("opportunities")
  public List<OpportunityResult> getOpportunities() {
    return opportunities;
  }
  public void setOpportunities(List<OpportunityResult> opportunities) {
    this.opportunities = opportunities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpportunitiesResultWithPagination opportunitiesResultWithPagination = (OpportunitiesResultWithPagination) o;

    return Objects.equals(this.nextStartDate, opportunitiesResultWithPagination.nextStartDate) &&
            Objects.equals(this.opportunities, opportunitiesResultWithPagination.opportunities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextStartDate, opportunities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunitiesResultWithPagination {\n");
    
    sb.append("    nextStartDate: ").append(toIndentedString(nextStartDate)).append("\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
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

