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
  private Float totalNonCriticalScore = null;
  private List<EvaluationQuestionGroupScore> questionGroupScores = new ArrayList<EvaluationQuestionGroupScore>();
  private Boolean anyFailedKillQuestions = null;
  private String comments = null;
  private String agentComments = null;

  
  /**
   * Score of all questions
   **/
  public EvaluationScoringSet totalScore(Float totalScore) {
    this.totalScore = totalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of all questions")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Float totalScore) {
    this.totalScore = totalScore;
  }

  
  /**
   * Score of only the critical questions
   **/
  public EvaluationScoringSet totalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of only the critical questions")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }

  
  /**
   * Score of only the non-critical questions
   **/
  public EvaluationScoringSet totalNonCriticalScore(Float totalNonCriticalScore) {
    this.totalNonCriticalScore = totalNonCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of only the non-critical questions")
  @JsonProperty("totalNonCriticalScore")
  public Float getTotalNonCriticalScore() {
    return totalNonCriticalScore;
  }
  public void setTotalNonCriticalScore(Float totalNonCriticalScore) {
    this.totalNonCriticalScore = totalNonCriticalScore;
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
   * Indicates that at least one fatal question was answered without having the highest score available for the question
   **/
  public EvaluationScoringSet anyFailedKillQuestions(Boolean anyFailedKillQuestions) {
    this.anyFailedKillQuestions = anyFailedKillQuestions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that at least one fatal question was answered without having the highest score available for the question")
  @JsonProperty("anyFailedKillQuestions")
  public Boolean getAnyFailedKillQuestions() {
    return anyFailedKillQuestions;
  }
  public void setAnyFailedKillQuestions(Boolean anyFailedKillQuestions) {
    this.anyFailedKillQuestions = anyFailedKillQuestions;
  }

  
  /**
   * Overall comments from the evaluator
   **/
  public EvaluationScoringSet comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overall comments from the evaluator")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  
  /**
   * Comments from the agent while reviewing evaluation results
   **/
  public EvaluationScoringSet agentComments(String agentComments) {
    this.agentComments = agentComments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments from the agent while reviewing evaluation results")
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
        Objects.equals(this.totalNonCriticalScore, evaluationScoringSet.totalNonCriticalScore) &&
        Objects.equals(this.questionGroupScores, evaluationScoringSet.questionGroupScores) &&
        Objects.equals(this.anyFailedKillQuestions, evaluationScoringSet.anyFailedKillQuestions) &&
        Objects.equals(this.comments, evaluationScoringSet.comments) &&
        Objects.equals(this.agentComments, evaluationScoringSet.agentComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, totalCriticalScore, totalNonCriticalScore, questionGroupScores, anyFailedKillQuestions, comments, agentComments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    totalNonCriticalScore: ").append(toIndentedString(totalNonCriticalScore)).append("\n");
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

