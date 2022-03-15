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
 * FlowMetricsTopicConversationScoredAgent
 */

public class FlowMetricsTopicConversationScoredAgent  implements Serializable {
  
  private Integer agentScore = null;
  private String scoredAgentId = null;

  
  /**
   * Assigned agent score for this conversation (0 - 100, higher being better)
   **/
  public FlowMetricsTopicConversationScoredAgent agentScore(Integer agentScore) {
    this.agentScore = agentScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned agent score for this conversation (0 - 100, higher being better)")
  @JsonProperty("agentScore")
  public Integer getAgentScore() {
    return agentScore;
  }
  public void setAgentScore(Integer agentScore) {
    this.agentScore = agentScore;
  }

  
  /**
   * Unique identifier for the agent that was scored for this conversation
   **/
  public FlowMetricsTopicConversationScoredAgent scoredAgentId(String scoredAgentId) {
    this.scoredAgentId = scoredAgentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the agent that was scored for this conversation")
  @JsonProperty("scoredAgentId")
  public String getScoredAgentId() {
    return scoredAgentId;
  }
  public void setScoredAgentId(String scoredAgentId) {
    this.scoredAgentId = scoredAgentId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowMetricsTopicConversationScoredAgent flowMetricsTopicConversationScoredAgent = (FlowMetricsTopicConversationScoredAgent) o;
    return Objects.equals(this.agentScore, flowMetricsTopicConversationScoredAgent.agentScore) &&
        Objects.equals(this.scoredAgentId, flowMetricsTopicConversationScoredAgent.scoredAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentScore, scoredAgentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowMetricsTopicConversationScoredAgent {\n");
    
    sb.append("    agentScore: ").append(toIndentedString(agentScore)).append("\n");
    sb.append("    scoredAgentId: ").append(toIndentedString(scoredAgentId)).append("\n");
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

