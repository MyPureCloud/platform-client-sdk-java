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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AiAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EvaluationQuestionScore
 */

public class EvaluationQuestionScore  implements Serializable {
  
  private String questionId = null;
  private String answerId = null;
  private Integer score = null;
  private Boolean markedNA = null;
  private Boolean systemMarkedNA = null;
  private String assistedAnswerId = null;
  private Boolean failedKillQuestion = null;
  private String comments = null;
  private AiAnswer aiAnswer = null;

  
  /**
   **/
  public EvaluationQuestionScore questionId(String questionId) {
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
  public EvaluationQuestionScore answerId(String answerId) {
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
  public EvaluationQuestionScore score(Integer score) {
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
  public EvaluationQuestionScore markedNA(Boolean markedNA) {
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
  public EvaluationQuestionScore systemMarkedNA(Boolean systemMarkedNA) {
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
  public EvaluationQuestionScore assistedAnswerId(String assistedAnswerId) {
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
   * Applicable only on fatal questions. Indicates that the answer selected was not the highest score available for the question
   **/
  public EvaluationQuestionScore failedKillQuestion(Boolean failedKillQuestion) {
    this.failedKillQuestion = failedKillQuestion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Applicable only on fatal questions. Indicates that the answer selected was not the highest score available for the question")
  @JsonProperty("failedKillQuestion")
  public Boolean getFailedKillQuestion() {
    return failedKillQuestion;
  }
  public void setFailedKillQuestion(Boolean failedKillQuestion) {
    this.failedKillQuestion = failedKillQuestion;
  }


  /**
   * Comments from the evaluator specific to this question
   **/
  public EvaluationQuestionScore comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments from the evaluator specific to this question")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }


  @ApiModelProperty(example = "null", value = "Suggested AI answer")
  @JsonProperty("aiAnswer")
  public AiAnswer getAiAnswer() {
    return aiAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationQuestionScore evaluationQuestionScore = (EvaluationQuestionScore) o;

    return Objects.equals(this.questionId, evaluationQuestionScore.questionId) &&
            Objects.equals(this.answerId, evaluationQuestionScore.answerId) &&
            Objects.equals(this.score, evaluationQuestionScore.score) &&
            Objects.equals(this.markedNA, evaluationQuestionScore.markedNA) &&
            Objects.equals(this.systemMarkedNA, evaluationQuestionScore.systemMarkedNA) &&
            Objects.equals(this.assistedAnswerId, evaluationQuestionScore.assistedAnswerId) &&
            Objects.equals(this.failedKillQuestion, evaluationQuestionScore.failedKillQuestion) &&
            Objects.equals(this.comments, evaluationQuestionScore.comments) &&
            Objects.equals(this.aiAnswer, evaluationQuestionScore.aiAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answerId, score, markedNA, systemMarkedNA, assistedAnswerId, failedKillQuestion, comments, aiAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQuestionScore {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    systemMarkedNA: ").append(toIndentedString(systemMarkedNA)).append("\n");
    sb.append("    assistedAnswerId: ").append(toIndentedString(assistedAnswerId)).append("\n");
    sb.append("    failedKillQuestion: ").append(toIndentedString(failedKillQuestion)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    aiAnswer: ").append(toIndentedString(aiAnswer)).append("\n");
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

