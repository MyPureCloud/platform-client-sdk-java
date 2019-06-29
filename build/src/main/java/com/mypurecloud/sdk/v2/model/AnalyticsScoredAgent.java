package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsScoredAgent
 */

public class AnalyticsScoredAgent  implements Serializable {
  
  private String scoredAgentId = null;
  private Integer agentScore = null;

  
  /**
   * Unique identifier of an agent that was scored for this conversation
   **/
  public AnalyticsScoredAgent scoredAgentId(String scoredAgentId) {
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
  public AnalyticsScoredAgent agentScore(Integer agentScore) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsScoredAgent analyticsScoredAgent = (AnalyticsScoredAgent) o;
    return Objects.equals(this.scoredAgentId, analyticsScoredAgent.scoredAgentId) &&
        Objects.equals(this.agentScore, analyticsScoredAgent.agentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoredAgentId, agentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsScoredAgent {\n");
    
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

