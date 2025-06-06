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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SurveyQuestionScore
 */

public class SurveyQuestionScore  implements Serializable {
  
  private String questionId = null;
  private String answerId = null;
  private Integer score = null;
  private Boolean markedNA = null;
  private Boolean systemMarkedNA = null;
  private String assistedAnswerId = null;
  private Integer npsScore = null;
  private String npsTextAnswer = null;
  private String freeTextAnswer = null;

  public SurveyQuestionScore() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public SurveyQuestionScore questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }


  /**
   **/
  public SurveyQuestionScore answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answerId")
  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }


  /**
   * Unweighted score of the question
   **/
  public SurveyQuestionScore score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unweighted score of the question")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }


  /**
   * True when the evaluation is submitted with a question that does not have an answer. Only allowed when naEnabled is true or if set by the system
   **/
  public SurveyQuestionScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True when the evaluation is submitted with a question that does not have an answer. Only allowed when naEnabled is true or if set by the system")
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
  public SurveyQuestionScore systemMarkedNA(Boolean systemMarkedNA) {
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
   * AnswerId found with evaluation assistance conditions
   **/
  public SurveyQuestionScore assistedAnswerId(String assistedAnswerId) {
    this.assistedAnswerId = assistedAnswerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AnswerId found with evaluation assistance conditions")
  @JsonProperty("assistedAnswerId")
  public String getAssistedAnswerId() {
    return assistedAnswerId;
  }
  public void setAssistedAnswerId(String assistedAnswerId) {
    this.assistedAnswerId = assistedAnswerId;
  }


  /**
   **/
  public SurveyQuestionScore npsScore(Integer npsScore) {
    this.npsScore = npsScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("npsScore")
  public Integer getNpsScore() {
    return npsScore;
  }
  public void setNpsScore(Integer npsScore) {
    this.npsScore = npsScore;
  }


  /**
   **/
  public SurveyQuestionScore npsTextAnswer(String npsTextAnswer) {
    this.npsTextAnswer = npsTextAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("npsTextAnswer")
  public String getNpsTextAnswer() {
    return npsTextAnswer;
  }
  public void setNpsTextAnswer(String npsTextAnswer) {
    this.npsTextAnswer = npsTextAnswer;
  }


  /**
   **/
  public SurveyQuestionScore freeTextAnswer(String freeTextAnswer) {
    this.freeTextAnswer = freeTextAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freeTextAnswer")
  public String getFreeTextAnswer() {
    return freeTextAnswer;
  }
  public void setFreeTextAnswer(String freeTextAnswer) {
    this.freeTextAnswer = freeTextAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionScore surveyQuestionScore = (SurveyQuestionScore) o;

    return Objects.equals(this.questionId, surveyQuestionScore.questionId) &&
            Objects.equals(this.answerId, surveyQuestionScore.answerId) &&
            Objects.equals(this.score, surveyQuestionScore.score) &&
            Objects.equals(this.markedNA, surveyQuestionScore.markedNA) &&
            Objects.equals(this.systemMarkedNA, surveyQuestionScore.systemMarkedNA) &&
            Objects.equals(this.assistedAnswerId, surveyQuestionScore.assistedAnswerId) &&
            Objects.equals(this.npsScore, surveyQuestionScore.npsScore) &&
            Objects.equals(this.npsTextAnswer, surveyQuestionScore.npsTextAnswer) &&
            Objects.equals(this.freeTextAnswer, surveyQuestionScore.freeTextAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answerId, score, markedNA, systemMarkedNA, assistedAnswerId, npsScore, npsTextAnswer, freeTextAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionScore {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    systemMarkedNA: ").append(toIndentedString(systemMarkedNA)).append("\n");
    sb.append("    assistedAnswerId: ").append(toIndentedString(assistedAnswerId)).append("\n");
    sb.append("    npsScore: ").append(toIndentedString(npsScore)).append("\n");
    sb.append("    npsTextAnswer: ").append(toIndentedString(npsTextAnswer)).append("\n");
    sb.append("    freeTextAnswer: ").append(toIndentedString(freeTextAnswer)).append("\n");
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

