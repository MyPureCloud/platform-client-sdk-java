package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Agent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScoredAgent
 */

public class ScoredAgent  implements Serializable {
  
  private Agent agent = null;
  private Integer score = null;

  
  /**
   * The agent
   **/
  public ScoredAgent agent(Agent agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent")
  @JsonProperty("agent")
  public Agent getAgent() {
    return agent;
  }
  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  
  /**
   * Agent's score for the current conversation, from 0 - 100, higher being better
   **/
  public ScoredAgent score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent's score for the current conversation, from 0 - 100, higher being better")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoredAgent scoredAgent = (ScoredAgent) o;
    return Objects.equals(this.agent, scoredAgent.agent) &&
        Objects.equals(this.score, scoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoredAgent {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

