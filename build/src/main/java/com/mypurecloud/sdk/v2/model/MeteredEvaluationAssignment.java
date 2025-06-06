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
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.TimeInterval;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MeteredEvaluationAssignment
 */

public class MeteredEvaluationAssignment  implements Serializable {
  
  private String evaluationContextId = null;
  private List<User> evaluators = null;
  private Integer maxNumberEvaluations = null;
  private EvaluationForm evaluationForm = null;
  private Boolean assignToActiveUser = null;
  private TimeInterval timeInterval = null;

  public MeteredEvaluationAssignment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      evaluators = new ArrayList<User>();
    }
  }

  
  /**
   **/
  public MeteredEvaluationAssignment evaluationContextId(String evaluationContextId) {
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
  public MeteredEvaluationAssignment evaluators(List<User> evaluators) {
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
  public MeteredEvaluationAssignment maxNumberEvaluations(Integer maxNumberEvaluations) {
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
  public MeteredEvaluationAssignment evaluationForm(EvaluationForm evaluationForm) {
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
  public MeteredEvaluationAssignment assignToActiveUser(Boolean assignToActiveUser) {
    this.assignToActiveUser = assignToActiveUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignToActiveUser")
  public Boolean getAssignToActiveUser() {
    return assignToActiveUser;
  }
  public void setAssignToActiveUser(Boolean assignToActiveUser) {
    this.assignToActiveUser = assignToActiveUser;
  }


  /**
   **/
  public MeteredEvaluationAssignment timeInterval(TimeInterval timeInterval) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteredEvaluationAssignment meteredEvaluationAssignment = (MeteredEvaluationAssignment) o;

    return Objects.equals(this.evaluationContextId, meteredEvaluationAssignment.evaluationContextId) &&
            Objects.equals(this.evaluators, meteredEvaluationAssignment.evaluators) &&
            Objects.equals(this.maxNumberEvaluations, meteredEvaluationAssignment.maxNumberEvaluations) &&
            Objects.equals(this.evaluationForm, meteredEvaluationAssignment.evaluationForm) &&
            Objects.equals(this.assignToActiveUser, meteredEvaluationAssignment.assignToActiveUser) &&
            Objects.equals(this.timeInterval, meteredEvaluationAssignment.timeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationContextId, evaluators, maxNumberEvaluations, evaluationForm, assignToActiveUser, timeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteredEvaluationAssignment {\n");
    
    sb.append("    evaluationContextId: ").append(toIndentedString(evaluationContextId)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    maxNumberEvaluations: ").append(toIndentedString(maxNumberEvaluations)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    assignToActiveUser: ").append(toIndentedString(assignToActiveUser)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
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

