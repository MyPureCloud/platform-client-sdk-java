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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AssessmentQuestionScore
 */

public class AssessmentQuestionScore  implements Serializable {
  
  private Boolean failedKillQuestion = null;
  private String comments = null;
  private String questionId = null;
  private String answerId = null;
  private Integer score = null;
  private Boolean markedNA = null;
  private String freeTextAnswer = null;

  
  @ApiModelProperty(example = "null", value = "True if this was a failed Kill question")
  @JsonProperty("failedKillQuestion")
  public Boolean getFailedKillQuestion() {
    return failedKillQuestion;
  }

  
  /**
   * Comments provided for the answer
   **/
  public AssessmentQuestionScore comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments provided for the answer")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  
  /**
   * The ID of the question
   **/
  public AssessmentQuestionScore questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the question")
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  
  /**
   * The ID of the selected answer
   **/
  public AssessmentQuestionScore answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the selected answer")
  @JsonProperty("answerId")
  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  
  @ApiModelProperty(example = "null", value = "The score received for this question")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  
  /**
   * True if this question was marked as NA
   **/
  public AssessmentQuestionScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this question was marked as NA")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  
  /**
   * Answer for free text answer type
   **/
  public AssessmentQuestionScore freeTextAnswer(String freeTextAnswer) {
    this.freeTextAnswer = freeTextAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answer for free text answer type")
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
    AssessmentQuestionScore assessmentQuestionScore = (AssessmentQuestionScore) o;
    return Objects.equals(this.failedKillQuestion, assessmentQuestionScore.failedKillQuestion) &&
        Objects.equals(this.comments, assessmentQuestionScore.comments) &&
        Objects.equals(this.questionId, assessmentQuestionScore.questionId) &&
        Objects.equals(this.answerId, assessmentQuestionScore.answerId) &&
        Objects.equals(this.score, assessmentQuestionScore.score) &&
        Objects.equals(this.markedNA, assessmentQuestionScore.markedNA) &&
        Objects.equals(this.freeTextAnswer, assessmentQuestionScore.freeTextAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedKillQuestion, comments, questionId, answerId, score, markedNA, freeTextAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentQuestionScore {\n");
    
    sb.append("    failedKillQuestion: ").append(toIndentedString(failedKillQuestion)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
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

