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
import com.mypurecloud.sdk.v2.model.AssessmentForm;
import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LearningAssessmentScoringRequest
 */

public class LearningAssessmentScoringRequest  implements Serializable {
  
  private AssessmentForm assessmentForm = null;
  private AssessmentScoringSet answers = null;

  
  /**
   * The assessment form to score against
   **/
  public LearningAssessmentScoringRequest assessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The assessment form to score against")
  @JsonProperty("assessmentForm")
  public AssessmentForm getAssessmentForm() {
    return assessmentForm;
  }
  public void setAssessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
  }

  
  /**
   * The answers to score
   **/
  public LearningAssessmentScoringRequest answers(AssessmentScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The answers to score")
  @JsonProperty("answers")
  public AssessmentScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(AssessmentScoringSet answers) {
    this.answers = answers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssessmentScoringRequest learningAssessmentScoringRequest = (LearningAssessmentScoringRequest) o;
    return Objects.equals(this.assessmentForm, learningAssessmentScoringRequest.assessmentForm) &&
        Objects.equals(this.answers, learningAssessmentScoringRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentForm, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssessmentScoringRequest {\n");
    
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

