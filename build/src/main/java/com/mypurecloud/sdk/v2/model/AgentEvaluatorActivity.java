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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentEvaluatorActivity
 */

public class AgentEvaluatorActivity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User agent = null;
  private User evaluator = null;
  private Integer numEvaluations = null;
  private Integer averageEvaluationScore = null;
  private Integer numEvaluationsWithoutViewPermission = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AgentEvaluatorActivity name(String name) {
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
  public AgentEvaluatorActivity agent(User agent) {
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
  public AgentEvaluatorActivity evaluator(User evaluator) {
    this.evaluator = evaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluator")
  public User getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(User evaluator) {
    this.evaluator = evaluator;
  }

  
  /**
   **/
  public AgentEvaluatorActivity numEvaluations(Integer numEvaluations) {
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
  public AgentEvaluatorActivity averageEvaluationScore(Integer averageEvaluationScore) {
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
  public AgentEvaluatorActivity numEvaluationsWithoutViewPermission(Integer numEvaluationsWithoutViewPermission) {
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
    AgentEvaluatorActivity agentEvaluatorActivity = (AgentEvaluatorActivity) o;
    return Objects.equals(this.id, agentEvaluatorActivity.id) &&
        Objects.equals(this.name, agentEvaluatorActivity.name) &&
        Objects.equals(this.agent, agentEvaluatorActivity.agent) &&
        Objects.equals(this.evaluator, agentEvaluatorActivity.evaluator) &&
        Objects.equals(this.numEvaluations, agentEvaluatorActivity.numEvaluations) &&
        Objects.equals(this.averageEvaluationScore, agentEvaluatorActivity.averageEvaluationScore) &&
        Objects.equals(this.numEvaluationsWithoutViewPermission, agentEvaluatorActivity.numEvaluationsWithoutViewPermission) &&
        Objects.equals(this.selfUri, agentEvaluatorActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, evaluator, numEvaluations, averageEvaluationScore, numEvaluationsWithoutViewPermission, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentEvaluatorActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    numEvaluations: ").append(toIndentedString(numEvaluations)).append("\n");
    sb.append("    averageEvaluationScore: ").append(toIndentedString(averageEvaluationScore)).append("\n");
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

