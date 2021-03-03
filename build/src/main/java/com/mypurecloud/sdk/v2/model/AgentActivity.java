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
  private Integer numCriticalEvaluations = null;
  private Float averageCriticalScore = null;
  private Float highestEvaluationScore = null;
  private Float lowestEvaluationScore = null;
  private Float highestCriticalScore = null;
  private Float lowestCriticalScore = null;
  private List<AgentEvaluatorActivity> agentEvaluatorActivityList = new ArrayList<AgentEvaluatorActivity>();
  private Integer numEvaluationsWithoutViewPermission = null;
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
  public AgentActivity numCriticalEvaluations(Integer numCriticalEvaluations) {
    this.numCriticalEvaluations = numCriticalEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCriticalEvaluations")
  public Integer getNumCriticalEvaluations() {
    return numCriticalEvaluations;
  }
  public void setNumCriticalEvaluations(Integer numCriticalEvaluations) {
    this.numCriticalEvaluations = numCriticalEvaluations;
  }

  
  /**
   **/
  public AgentActivity averageCriticalScore(Float averageCriticalScore) {
    this.averageCriticalScore = averageCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageCriticalScore")
  public Float getAverageCriticalScore() {
    return averageCriticalScore;
  }
  public void setAverageCriticalScore(Float averageCriticalScore) {
    this.averageCriticalScore = averageCriticalScore;
  }

  
  /**
   **/
  public AgentActivity highestEvaluationScore(Float highestEvaluationScore) {
    this.highestEvaluationScore = highestEvaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("highestEvaluationScore")
  public Float getHighestEvaluationScore() {
    return highestEvaluationScore;
  }
  public void setHighestEvaluationScore(Float highestEvaluationScore) {
    this.highestEvaluationScore = highestEvaluationScore;
  }

  
  /**
   **/
  public AgentActivity lowestEvaluationScore(Float lowestEvaluationScore) {
    this.lowestEvaluationScore = lowestEvaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowestEvaluationScore")
  public Float getLowestEvaluationScore() {
    return lowestEvaluationScore;
  }
  public void setLowestEvaluationScore(Float lowestEvaluationScore) {
    this.lowestEvaluationScore = lowestEvaluationScore;
  }

  
  /**
   **/
  public AgentActivity highestCriticalScore(Float highestCriticalScore) {
    this.highestCriticalScore = highestCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("highestCriticalScore")
  public Float getHighestCriticalScore() {
    return highestCriticalScore;
  }
  public void setHighestCriticalScore(Float highestCriticalScore) {
    this.highestCriticalScore = highestCriticalScore;
  }

  
  /**
   **/
  public AgentActivity lowestCriticalScore(Float lowestCriticalScore) {
    this.lowestCriticalScore = lowestCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowestCriticalScore")
  public Float getLowestCriticalScore() {
    return lowestCriticalScore;
  }
  public void setLowestCriticalScore(Float lowestCriticalScore) {
    this.lowestCriticalScore = lowestCriticalScore;
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

  
  /**
   **/
  public AgentActivity numEvaluationsWithoutViewPermission(Integer numEvaluationsWithoutViewPermission) {
    this.numEvaluationsWithoutViewPermission = numEvaluationsWithoutViewPermission;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numEvaluationsWithoutViewPermission")
  public Integer getNumEvaluationsWithoutViewPermission() {
    return numEvaluationsWithoutViewPermission;
  }
  public void setNumEvaluationsWithoutViewPermission(Integer numEvaluationsWithoutViewPermission) {
    this.numEvaluationsWithoutViewPermission = numEvaluationsWithoutViewPermission;
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
        Objects.equals(this.numCriticalEvaluations, agentActivity.numCriticalEvaluations) &&
        Objects.equals(this.averageCriticalScore, agentActivity.averageCriticalScore) &&
        Objects.equals(this.highestEvaluationScore, agentActivity.highestEvaluationScore) &&
        Objects.equals(this.lowestEvaluationScore, agentActivity.lowestEvaluationScore) &&
        Objects.equals(this.highestCriticalScore, agentActivity.highestCriticalScore) &&
        Objects.equals(this.lowestCriticalScore, agentActivity.lowestCriticalScore) &&
        Objects.equals(this.agentEvaluatorActivityList, agentActivity.agentEvaluatorActivityList) &&
        Objects.equals(this.numEvaluationsWithoutViewPermission, agentActivity.numEvaluationsWithoutViewPermission) &&
        Objects.equals(this.selfUri, agentActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, numEvaluations, averageEvaluationScore, numCriticalEvaluations, averageCriticalScore, highestEvaluationScore, lowestEvaluationScore, highestCriticalScore, lowestCriticalScore, agentEvaluatorActivityList, numEvaluationsWithoutViewPermission, selfUri);
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
    sb.append("    numCriticalEvaluations: ").append(toIndentedString(numCriticalEvaluations)).append("\n");
    sb.append("    averageCriticalScore: ").append(toIndentedString(averageCriticalScore)).append("\n");
    sb.append("    highestEvaluationScore: ").append(toIndentedString(highestEvaluationScore)).append("\n");
    sb.append("    lowestEvaluationScore: ").append(toIndentedString(lowestEvaluationScore)).append("\n");
    sb.append("    highestCriticalScore: ").append(toIndentedString(highestCriticalScore)).append("\n");
    sb.append("    lowestCriticalScore: ").append(toIndentedString(lowestCriticalScore)).append("\n");
    sb.append("    agentEvaluatorActivityList: ").append(toIndentedString(agentEvaluatorActivityList)).append("\n");
    sb.append("    numEvaluationsWithoutViewPermission: ").append(toIndentedString(numEvaluationsWithoutViewPermission)).append("\n");
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

