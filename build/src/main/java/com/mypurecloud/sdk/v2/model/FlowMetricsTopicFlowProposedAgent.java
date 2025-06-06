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
 * FlowMetricsTopicFlowProposedAgent
 */

public class FlowMetricsTopicFlowProposedAgent  implements Serializable {
  
  private Long agentRank = null;
  private String proposedAgentId = null;

  public FlowMetricsTopicFlowProposedAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Proposed agent rank for this conversation from predictive routing (lower is better)
   **/
  public FlowMetricsTopicFlowProposedAgent agentRank(Long agentRank) {
    this.agentRank = agentRank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposed agent rank for this conversation from predictive routing (lower is better)")
  @JsonProperty("agentRank")
  public Long getAgentRank() {
    return agentRank;
  }
  public void setAgentRank(Long agentRank) {
    this.agentRank = agentRank;
  }


  /**
   * Unique identifier for the agent that was proposed by predictive routing
   **/
  public FlowMetricsTopicFlowProposedAgent proposedAgentId(String proposedAgentId) {
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
    FlowMetricsTopicFlowProposedAgent flowMetricsTopicFlowProposedAgent = (FlowMetricsTopicFlowProposedAgent) o;

    return Objects.equals(this.agentRank, flowMetricsTopicFlowProposedAgent.agentRank) &&
            Objects.equals(this.proposedAgentId, flowMetricsTopicFlowProposedAgent.proposedAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentRank, proposedAgentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowMetricsTopicFlowProposedAgent {\n");
    
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

