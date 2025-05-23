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
  private Boolean systemMarkedNA = null;
  private List<SurveyQuestionScore> questionScores = null;

  public SurveyQuestionGroupScore() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      questionScores = new ArrayList<SurveyQuestionScore>();
    }
  }

  
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
   * True when the evaluation is submitted with a question group that does not have any answers. Only allowed when naEnabled is true or if set by the system
   **/
  public SurveyQuestionGroupScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True when the evaluation is submitted with a question group that does not have any answers. Only allowed when naEnabled is true or if set by the system")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }


  /**
   * If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false.
   **/
  public SurveyQuestionGroupScore systemMarkedNA(Boolean systemMarkedNA) {
    this.systemMarkedNA = systemMarkedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If markedNA is true, systemMarkedNA indicates whether it was marked by a user or by the system due to visibility conditions. Always false if markedNA is false.")
  @JsonProperty("systemMarkedNA")
  public Boolean getSystemMarkedNA() {
    return systemMarkedNA;
  }
  public void setSystemMarkedNA(Boolean systemMarkedNA) {
    this.systemMarkedNA = systemMarkedNA;
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
            Objects.equals(this.systemMarkedNA, surveyQuestionGroupScore.systemMarkedNA) &&
            Objects.equals(this.questionScores, surveyQuestionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, markedNA, systemMarkedNA, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionGroupScore {\n");
    
    sb.append("    questionGroupId: ").append(toIndentedString(questionGroupId)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    maxTotalScore: ").append(toIndentedString(maxTotalScore)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    systemMarkedNA: ").append(toIndentedString(systemMarkedNA)).append("\n");
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

