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
import com.mypurecloud.sdk.v2.model.AgentBusinessUnitOpportunities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentQueryOpportunities
 */

public class AgentQueryOpportunities  implements Serializable {
  
  private Date nextStartDate = null;
  private List<AgentBusinessUnitOpportunities> businessUnits = null;

  public AgentQueryOpportunities() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      businessUnits = new ArrayList<AgentBusinessUnitOpportunities>();
    }
  }

  public AgentQueryOpportunities(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      businessUnits = new ArrayList<AgentBusinessUnitOpportunities>();
    }
  }

  
  /**
   * The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results
   **/
  public AgentQueryOpportunities nextStartDate(Date nextStartDate) {
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
   * The opportunities for the agent grouped by business unit
   **/
  public AgentQueryOpportunities businessUnits(List<AgentBusinessUnitOpportunities> businessUnits) {
    this.businessUnits = businessUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The opportunities for the agent grouped by business unit")
  @JsonProperty("businessUnits")
  public List<AgentBusinessUnitOpportunities> getBusinessUnits() {
    return businessUnits;
  }
  public void setBusinessUnits(List<AgentBusinessUnitOpportunities> businessUnits) {
    this.businessUnits = businessUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryOpportunities agentQueryOpportunities = (AgentQueryOpportunities) o;

    return Objects.equals(this.nextStartDate, agentQueryOpportunities.nextStartDate) &&
            Objects.equals(this.businessUnits, agentQueryOpportunities.businessUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextStartDate, businessUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentQueryOpportunities {\n");
    
    sb.append("    nextStartDate: ").append(toIndentedString(nextStartDate)).append("\n");
    sb.append("    businessUnits: ").append(toIndentedString(businessUnits)).append("\n");
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

