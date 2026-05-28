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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentAddOpportunityEnrollment
 */

public class AgentAddOpportunityEnrollment  implements Serializable {
  
  private String opportunityId = null;

  public AgentAddOpportunityEnrollment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentAddOpportunityEnrollment(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the opportunity in which to enroll the agent
   **/
  public AgentAddOpportunityEnrollment opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the opportunity in which to enroll the agent")
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
    AgentAddOpportunityEnrollment agentAddOpportunityEnrollment = (AgentAddOpportunityEnrollment) o;

    return Objects.equals(this.opportunityId, agentAddOpportunityEnrollment.opportunityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opportunityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAddOpportunityEnrollment {\n");
    
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

