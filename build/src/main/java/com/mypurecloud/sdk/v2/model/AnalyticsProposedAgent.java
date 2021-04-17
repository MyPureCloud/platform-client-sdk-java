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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsProposedAgent
 */

public class AnalyticsProposedAgent  implements Serializable {
  
  private Integer agentRank = null;
  private String proposedAgentId = null;

  
  /**
   * Proposed agent rank for this conversation from predictive routing (lower is better)
   **/
  public AnalyticsProposedAgent agentRank(Integer agentRank) {
    this.agentRank = agentRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposed agent rank for this conversation from predictive routing (lower is better)")
  @JsonProperty("agentRank")
  public Integer getAgentRank() {
    return agentRank;
  }
  public void setAgentRank(Integer agentRank) {
    this.agentRank = agentRank;
  }

  
  /**
   * Unique identifier for the agent that was proposed by predictive routing
   **/
  public AnalyticsProposedAgent proposedAgentId(String proposedAgentId) {
    this.proposedAgentId = proposedAgentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the agent that was proposed by predictive routing")
  @JsonProperty("proposedAgentId")
  public String getProposedAgentId() {
    return proposedAgentId;
  }
  public void setProposedAgentId(String proposedAgentId) {
    this.proposedAgentId = proposedAgentId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsProposedAgent analyticsProposedAgent = (AnalyticsProposedAgent) o;
    return Objects.equals(this.agentRank, analyticsProposedAgent.agentRank) &&
        Objects.equals(this.proposedAgentId, analyticsProposedAgent.proposedAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentRank, proposedAgentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsProposedAgent {\n");
    
    sb.append("    agentRank: ").append(toIndentedString(agentRank)).append("\n");
    sb.append("    proposedAgentId: ").append(toIndentedString(proposedAgentId)).append("\n");
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

