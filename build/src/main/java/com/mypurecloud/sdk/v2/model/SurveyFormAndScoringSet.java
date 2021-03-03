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
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SurveyFormAndScoringSet
 */

public class SurveyFormAndScoringSet  implements Serializable {
  
  private SurveyForm surveyForm = null;
  private SurveyScoringSet answers = null;

  
  /**
   **/
  public SurveyFormAndScoringSet surveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("surveyForm")
  public SurveyForm getSurveyForm() {
    return surveyForm;
  }
  public void setSurveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
  }

  
  /**
   **/
  public SurveyFormAndScoringSet answers(SurveyScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answers")
  public SurveyScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(SurveyScoringSet answers) {
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
    SurveyFormAndScoringSet surveyFormAndScoringSet = (SurveyFormAndScoringSet) o;
    return Objects.equals(this.surveyForm, surveyFormAndScoringSet.surveyForm) &&
        Objects.equals(this.answers, surveyFormAndScoringSet.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyForm, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyFormAndScoringSet {\n");
    
    sb.append("    surveyForm: ").append(toIndentedString(surveyForm)).append("\n");
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

