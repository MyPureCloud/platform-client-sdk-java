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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CalibrationAssignment
 */

public class CalibrationAssignment  implements Serializable {
  
  private User calibrator = null;
  private List<User> evaluators = new ArrayList<User>();
  private EvaluationForm evaluationForm = null;
  private User expertEvaluator = null;

  
  /**
   **/
  public CalibrationAssignment calibrator(User calibrator) {
    this.calibrator = calibrator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calibrator")
  public User getCalibrator() {
    return calibrator;
  }
  public void setCalibrator(User calibrator) {
    this.calibrator = calibrator;
  }

  
  /**
   **/
  public CalibrationAssignment evaluators(List<User> evaluators) {
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
  public CalibrationAssignment evaluationForm(EvaluationForm evaluationForm) {
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
  public CalibrationAssignment expertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expertEvaluator")
  public User getExpertEvaluator() {
    return expertEvaluator;
  }
  public void setExpertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalibrationAssignment calibrationAssignment = (CalibrationAssignment) o;
    return Objects.equals(this.calibrator, calibrationAssignment.calibrator) &&
        Objects.equals(this.evaluators, calibrationAssignment.evaluators) &&
        Objects.equals(this.evaluationForm, calibrationAssignment.evaluationForm) &&
        Objects.equals(this.expertEvaluator, calibrationAssignment.expertEvaluator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calibrator, evaluators, evaluationForm, expertEvaluator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalibrationAssignment {\n");
    
    sb.append("    calibrator: ").append(toIndentedString(calibrator)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    expertEvaluator: ").append(toIndentedString(expertEvaluator)).append("\n");
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

