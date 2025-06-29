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
 * V2QueueObservationScoredAgent
 */

public class V2QueueObservationScoredAgent  implements Serializable {
  
  private String scoredAgentId = null;
  private Long agentScore = null;

  public V2QueueObservationScoredAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier of an agent that was scored for this conversation
   **/
  public V2QueueObservationScoredAgent scoredAgentId(String scoredAgentId) {
    this.scoredAgentId = scoredAgentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of an agent that was scored for this conversation")
  @JsonProperty("scoredAgentId")
  public String getScoredAgentId() {
    return scoredAgentId;
  }
  public void setScoredAgentId(String scoredAgentId) {
    this.scoredAgentId = scoredAgentId;
  }


  /**
   * Assigned agent score for this conversation (0 - 100, higher being better)
   **/
  public V2QueueObservationScoredAgent agentScore(Long agentScore) {
    this.agentScore = agentScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned agent score for this conversation (0 - 100, higher being better)")
  @JsonProperty("agentScore")
  public Long getAgentScore() {
    return agentScore;
  }
  public void setAgentScore(Long agentScore) {
    this.agentScore = agentScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2QueueObservationScoredAgent v2QueueObservationScoredAgent = (V2QueueObservationScoredAgent) o;

    return Objects.equals(this.scoredAgentId, v2QueueObservationScoredAgent.scoredAgentId) &&
            Objects.equals(this.agentScore, v2QueueObservationScoredAgent.agentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoredAgentId, agentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationScoredAgent {\n");
    
    sb.append("    scoredAgentId: ").append(toIndentedString(scoredAgentId)).append("\n");
    sb.append("    agentScore: ").append(toIndentedString(agentScore)).append("\n");
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

