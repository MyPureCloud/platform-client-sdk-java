package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.EvaluationQuestionGroupScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationScoringSet
 */

public class EvaluationScoringSet  implements Serializable {
  
  private Float totalScore = null;
  private Float totalCriticalScore = null;
  private List<EvaluationQuestionGroupScore> questionGroupScores = new ArrayList<EvaluationQuestionGroupScore>();
  private Boolean anyFailedKillQuestions = null;
  private String comments = null;
  private String agentComments = null;

  
  /**
   **/
  public EvaluationScoringSet totalScore(Float totalScore) {
    this.totalScore = totalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Float totalScore) {
    this.totalScore = totalScore;
  }

  
  /**
   **/
  public EvaluationScoringSet totalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }

  
  /**
   **/
  public EvaluationScoringSet questionGroupScores(List<EvaluationQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionGroupScores")
  public List<EvaluationQuestionGroupScore> getQuestionGroupScores() {
    return questionGroupScores;
  }
  public void setQuestionGroupScores(List<EvaluationQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
  }

  
  /**
   **/
  public EvaluationScoringSet anyFailedKillQuestions(Boolean anyFailedKillQuestions) {
    this.anyFailedKillQuestions = anyFailedKillQuestions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("anyFailedKillQuestions")
  public Boolean getAnyFailedKillQuestions() {
    return anyFailedKillQuestions;
  }
  public void setAnyFailedKillQuestions(Boolean anyFailedKillQuestions) {
    this.anyFailedKillQuestions = anyFailedKillQuestions;
  }

  
  /**
   **/
  public EvaluationScoringSet comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  
  /**
   **/
  public EvaluationScoringSet agentComments(String agentComments) {
    this.agentComments = agentComments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentComments")
  public String getAgentComments() {
    return agentComments;
  }
  public void setAgentComments(String agentComments) {
    this.agentComments = agentComments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationScoringSet evaluationScoringSet = (EvaluationScoringSet) o;
    return Objects.equals(this.totalScore, evaluationScoringSet.totalScore) &&
        Objects.equals(this.totalCriticalScore, evaluationScoringSet.totalCriticalScore) &&
        Objects.equals(this.questionGroupScores, evaluationScoringSet.questionGroupScores) &&
        Objects.equals(this.anyFailedKillQuestions, evaluationScoringSet.anyFailedKillQuestions) &&
        Objects.equals(this.comments, evaluationScoringSet.comments) &&
        Objects.equals(this.agentComments, evaluationScoringSet.agentComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, totalCriticalScore, questionGroupScores, anyFailedKillQuestions, comments, agentComments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    questionGroupScores: ").append(toIndentedString(questionGroupScores)).append("\n");
    sb.append("    anyFailedKillQuestions: ").append(toIndentedString(anyFailedKillQuestions)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    agentComments: ").append(toIndentedString(agentComments)).append("\n");
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

