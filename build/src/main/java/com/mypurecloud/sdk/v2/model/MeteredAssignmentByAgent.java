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
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.TimeInterval;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MeteredAssignmentByAgent
 */

public class MeteredAssignmentByAgent  implements Serializable {
  
  private String evaluationContextId = null;
  private List<User> evaluators = new ArrayList<User>();
  private Integer maxNumberEvaluations = null;
  private EvaluationForm evaluationForm = null;
  private TimeInterval timeInterval = null;
  private String timeZone = null;

  
  /**
   **/
  public MeteredAssignmentByAgent evaluationContextId(String evaluationContextId) {
    this.evaluationContextId = evaluationContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationContextId")
  public String getEvaluationContextId() {
    return evaluationContextId;
  }
  public void setEvaluationContextId(String evaluationContextId) {
    this.evaluationContextId = evaluationContextId;
  }

  
  /**
   **/
  public MeteredAssignmentByAgent evaluators(List<User> evaluators) {
    this.evaluators = evaluators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluators")
  public List<User> getEvaluators() {
    return evaluators;
  }
  public void setEvaluators(List<User> evaluators) {
    this.evaluators = evaluators;
  }

  
  /**
   **/
  public MeteredAssignmentByAgent maxNumberEvaluations(Integer maxNumberEvaluations) {
    this.maxNumberEvaluations = maxNumberEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxNumberEvaluations")
  public Integer getMaxNumberEvaluations() {
    return maxNumberEvaluations;
  }
  public void setMaxNumberEvaluations(Integer maxNumberEvaluations) {
    this.maxNumberEvaluations = maxNumberEvaluations;
  }

  
  /**
   **/
  public MeteredAssignmentByAgent evaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationForm")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  
  /**
   **/
  public MeteredAssignmentByAgent timeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeInterval")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }
  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  
  /**
   **/
  public MeteredAssignmentByAgent timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteredAssignmentByAgent meteredAssignmentByAgent = (MeteredAssignmentByAgent) o;
    return Objects.equals(this.evaluationContextId, meteredAssignmentByAgent.evaluationContextId) &&
        Objects.equals(this.evaluators, meteredAssignmentByAgent.evaluators) &&
        Objects.equals(this.maxNumberEvaluations, meteredAssignmentByAgent.maxNumberEvaluations) &&
        Objects.equals(this.evaluationForm, meteredAssignmentByAgent.evaluationForm) &&
        Objects.equals(this.timeInterval, meteredAssignmentByAgent.timeInterval) &&
        Objects.equals(this.timeZone, meteredAssignmentByAgent.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationContextId, evaluators, maxNumberEvaluations, evaluationForm, timeInterval, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteredAssignmentByAgent {\n");
    
    sb.append("    evaluationContextId: ").append(toIndentedString(evaluationContextId)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    maxNumberEvaluations: ").append(toIndentedString(maxNumberEvaluations)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

