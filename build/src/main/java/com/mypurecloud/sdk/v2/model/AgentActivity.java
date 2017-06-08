package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AgentEvaluatorActivity;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentActivity
 */

public class AgentActivity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User agent = null;
  private Integer numEvaluations = null;
  private Integer averageEvaluationScore = null;
  private List<AgentEvaluatorActivity> agentEvaluatorActivityList = new ArrayList<AgentEvaluatorActivity>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AgentActivity name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public AgentActivity agent(User agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public User getAgent() {
    return agent;
  }
  public void setAgent(User agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public AgentActivity numEvaluations(Integer numEvaluations) {
    this.numEvaluations = numEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numEvaluations")
  public Integer getNumEvaluations() {
    return numEvaluations;
  }
  public void setNumEvaluations(Integer numEvaluations) {
    this.numEvaluations = numEvaluations;
  }

  
  /**
   **/
  public AgentActivity averageEvaluationScore(Integer averageEvaluationScore) {
    this.averageEvaluationScore = averageEvaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageEvaluationScore")
  public Integer getAverageEvaluationScore() {
    return averageEvaluationScore;
  }
  public void setAverageEvaluationScore(Integer averageEvaluationScore) {
    this.averageEvaluationScore = averageEvaluationScore;
  }

  
  /**
   **/
  public AgentActivity agentEvaluatorActivityList(List<AgentEvaluatorActivity> agentEvaluatorActivityList) {
    this.agentEvaluatorActivityList = agentEvaluatorActivityList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentEvaluatorActivityList")
  public List<AgentEvaluatorActivity> getAgentEvaluatorActivityList() {
    return agentEvaluatorActivityList;
  }
  public void setAgentEvaluatorActivityList(List<AgentEvaluatorActivity> agentEvaluatorActivityList) {
    this.agentEvaluatorActivityList = agentEvaluatorActivityList;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentActivity agentActivity = (AgentActivity) o;
    return Objects.equals(this.id, agentActivity.id) &&
        Objects.equals(this.name, agentActivity.name) &&
        Objects.equals(this.agent, agentActivity.agent) &&
        Objects.equals(this.numEvaluations, agentActivity.numEvaluations) &&
        Objects.equals(this.averageEvaluationScore, agentActivity.averageEvaluationScore) &&
        Objects.equals(this.agentEvaluatorActivityList, agentActivity.agentEvaluatorActivityList) &&
        Objects.equals(this.selfUri, agentActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, numEvaluations, averageEvaluationScore, agentEvaluatorActivityList, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    numEvaluations: ").append(toIndentedString(numEvaluations)).append("\n");
    sb.append("    averageEvaluationScore: ").append(toIndentedString(averageEvaluationScore)).append("\n");
    sb.append("    agentEvaluatorActivityList: ").append(toIndentedString(agentEvaluatorActivityList)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

