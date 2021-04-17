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
import com.mypurecloud.sdk.v2.model.SurveyQuestionScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyQuestionGroupScore
 */

public class SurveyQuestionGroupScore  implements Serializable {
  
  private String questionGroupId = null;
  private Float totalScore = null;
  private Float maxTotalScore = null;
  private Boolean markedNA = null;
  private List<SurveyQuestionScore> questionScores = new ArrayList<SurveyQuestionScore>();

  
  /**
   **/
  public SurveyQuestionGroupScore questionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionGroupId")
  public String getQuestionGroupId() {
    return questionGroupId;
  }
  public void setQuestionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
  }

  
  /**
   * Score of all questions in the group
   **/
  public SurveyQuestionGroupScore totalScore(Float totalScore) {
    this.totalScore = totalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of all questions in the group")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Float totalScore) {
    this.totalScore = totalScore;
  }

  
  /**
   * Maximum possible score of all questions in the group
   **/
  public SurveyQuestionGroupScore maxTotalScore(Float maxTotalScore) {
    this.maxTotalScore = maxTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible score of all questions in the group")
  @JsonProperty("maxTotalScore")
  public Float getMaxTotalScore() {
    return maxTotalScore;
  }
  public void setMaxTotalScore(Float maxTotalScore) {
    this.maxTotalScore = maxTotalScore;
  }

  
  /**
   **/
  public SurveyQuestionGroupScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  
  /**
   **/
  public SurveyQuestionGroupScore questionScores(List<SurveyQuestionScore> questionScores) {
    this.questionScores = questionScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionScores")
  public List<SurveyQuestionScore> getQuestionScores() {
    return questionScores;
  }
  public void setQuestionScores(List<SurveyQuestionScore> questionScores) {
    this.questionScores = questionScores;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionGroupScore surveyQuestionGroupScore = (SurveyQuestionGroupScore) o;
    return Objects.equals(this.questionGroupId, surveyQuestionGroupScore.questionGroupId) &&
        Objects.equals(this.totalScore, surveyQuestionGroupScore.totalScore) &&
        Objects.equals(this.maxTotalScore, surveyQuestionGroupScore.maxTotalScore) &&
        Objects.equals(this.markedNA, surveyQuestionGroupScore.markedNA) &&
        Objects.equals(this.questionScores, surveyQuestionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, markedNA, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionGroupScore {\n");
    
    sb.append("    questionGroupId: ").append(toIndentedString(questionGroupId)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    maxTotalScore: ").append(toIndentedString(maxTotalScore)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    questionScores: ").append(toIndentedString(questionScores)).append("\n");
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

