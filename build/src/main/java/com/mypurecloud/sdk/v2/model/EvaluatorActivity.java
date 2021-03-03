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
 * EvaluatorActivity
 */

public class EvaluatorActivity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User evaluator = null;
  private Integer numEvaluationsAssigned = null;
  private Integer numEvaluationsStarted = null;
  private Integer numEvaluationsCompleted = null;
  private Integer numCalibrationsAssigned = null;
  private Integer numCalibrationsStarted = null;
  private Integer numCalibrationsCompleted = null;
  private Integer numEvaluationsWithoutViewPermission = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public EvaluatorActivity name(String name) {
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
  public EvaluatorActivity evaluator(User evaluator) {
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
  public EvaluatorActivity numEvaluationsAssigned(Integer numEvaluationsAssigned) {
    this.numEvaluationsAssigned = numEvaluationsAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numEvaluationsAssigned")
  public Integer getNumEvaluationsAssigned() {
    return numEvaluationsAssigned;
  }
  public void setNumEvaluationsAssigned(Integer numEvaluationsAssigned) {
    this.numEvaluationsAssigned = numEvaluationsAssigned;
  }

  
  /**
   **/
  public EvaluatorActivity numEvaluationsStarted(Integer numEvaluationsStarted) {
    this.numEvaluationsStarted = numEvaluationsStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numEvaluationsStarted")
  public Integer getNumEvaluationsStarted() {
    return numEvaluationsStarted;
  }
  public void setNumEvaluationsStarted(Integer numEvaluationsStarted) {
    this.numEvaluationsStarted = numEvaluationsStarted;
  }

  
  /**
   **/
  public EvaluatorActivity numEvaluationsCompleted(Integer numEvaluationsCompleted) {
    this.numEvaluationsCompleted = numEvaluationsCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numEvaluationsCompleted")
  public Integer getNumEvaluationsCompleted() {
    return numEvaluationsCompleted;
  }
  public void setNumEvaluationsCompleted(Integer numEvaluationsCompleted) {
    this.numEvaluationsCompleted = numEvaluationsCompleted;
  }

  
  /**
   **/
  public EvaluatorActivity numCalibrationsAssigned(Integer numCalibrationsAssigned) {
    this.numCalibrationsAssigned = numCalibrationsAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCalibrationsAssigned")
  public Integer getNumCalibrationsAssigned() {
    return numCalibrationsAssigned;
  }
  public void setNumCalibrationsAssigned(Integer numCalibrationsAssigned) {
    this.numCalibrationsAssigned = numCalibrationsAssigned;
  }

  
  /**
   **/
  public EvaluatorActivity numCalibrationsStarted(Integer numCalibrationsStarted) {
    this.numCalibrationsStarted = numCalibrationsStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCalibrationsStarted")
  public Integer getNumCalibrationsStarted() {
    return numCalibrationsStarted;
  }
  public void setNumCalibrationsStarted(Integer numCalibrationsStarted) {
    this.numCalibrationsStarted = numCalibrationsStarted;
  }

  
  /**
   **/
  public EvaluatorActivity numCalibrationsCompleted(Integer numCalibrationsCompleted) {
    this.numCalibrationsCompleted = numCalibrationsCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCalibrationsCompleted")
  public Integer getNumCalibrationsCompleted() {
    return numCalibrationsCompleted;
  }
  public void setNumCalibrationsCompleted(Integer numCalibrationsCompleted) {
    this.numCalibrationsCompleted = numCalibrationsCompleted;
  }

  
  /**
   **/
  public EvaluatorActivity numEvaluationsWithoutViewPermission(Integer numEvaluationsWithoutViewPermission) {
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
    EvaluatorActivity evaluatorActivity = (EvaluatorActivity) o;
    return Objects.equals(this.id, evaluatorActivity.id) &&
        Objects.equals(this.name, evaluatorActivity.name) &&
        Objects.equals(this.evaluator, evaluatorActivity.evaluator) &&
        Objects.equals(this.numEvaluationsAssigned, evaluatorActivity.numEvaluationsAssigned) &&
        Objects.equals(this.numEvaluationsStarted, evaluatorActivity.numEvaluationsStarted) &&
        Objects.equals(this.numEvaluationsCompleted, evaluatorActivity.numEvaluationsCompleted) &&
        Objects.equals(this.numCalibrationsAssigned, evaluatorActivity.numCalibrationsAssigned) &&
        Objects.equals(this.numCalibrationsStarted, evaluatorActivity.numCalibrationsStarted) &&
        Objects.equals(this.numCalibrationsCompleted, evaluatorActivity.numCalibrationsCompleted) &&
        Objects.equals(this.numEvaluationsWithoutViewPermission, evaluatorActivity.numEvaluationsWithoutViewPermission) &&
        Objects.equals(this.selfUri, evaluatorActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, evaluator, numEvaluationsAssigned, numEvaluationsStarted, numEvaluationsCompleted, numCalibrationsAssigned, numCalibrationsStarted, numCalibrationsCompleted, numEvaluationsWithoutViewPermission, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatorActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    numEvaluationsAssigned: ").append(toIndentedString(numEvaluationsAssigned)).append("\n");
    sb.append("    numEvaluationsStarted: ").append(toIndentedString(numEvaluationsStarted)).append("\n");
    sb.append("    numEvaluationsCompleted: ").append(toIndentedString(numEvaluationsCompleted)).append("\n");
    sb.append("    numCalibrationsAssigned: ").append(toIndentedString(numCalibrationsAssigned)).append("\n");
    sb.append("    numCalibrationsStarted: ").append(toIndentedString(numCalibrationsStarted)).append("\n");
    sb.append("    numCalibrationsCompleted: ").append(toIndentedString(numCalibrationsCompleted)).append("\n");
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

