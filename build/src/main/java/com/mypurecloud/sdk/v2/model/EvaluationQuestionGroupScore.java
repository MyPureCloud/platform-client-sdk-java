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
import com.mypurecloud.sdk.v2.model.EvaluationQuestionScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationQuestionGroupScore
 */

public class EvaluationQuestionGroupScore  implements Serializable {
  
  private String questionGroupId = null;
  private Float totalScore = null;
  private Float maxTotalScore = null;
  private Boolean markedNA = null;
  private Float totalCriticalScore = null;
  private Float maxTotalCriticalScore = null;
  private Float totalNonCriticalScore = null;
  private Float maxTotalNonCriticalScore = null;
  private Float totalScoreUnweighted = null;
  private Float maxTotalScoreUnweighted = null;
  private Float totalCriticalScoreUnweighted = null;
  private Float maxTotalCriticalScoreUnweighted = null;
  private Float totalNonCriticalScoreUnweighted = null;
  private Float maxTotalNonCriticalScoreUnweighted = null;
  private List<EvaluationQuestionScore> questionScores = new ArrayList<EvaluationQuestionScore>();

  
  /**
   **/
  public EvaluationQuestionGroupScore questionGroupId(String questionGroupId) {
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
  public EvaluationQuestionGroupScore totalScore(Float totalScore) {
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
  public EvaluationQuestionGroupScore maxTotalScore(Float maxTotalScore) {
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
  public EvaluationQuestionGroupScore markedNA(Boolean markedNA) {
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
   * Score of only the critical questions in the group
   **/
  public EvaluationQuestionGroupScore totalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of only the critical questions in the group")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }

  
  /**
   * Maximum possible score of only the critical questions in the group
   **/
  public EvaluationQuestionGroupScore maxTotalCriticalScore(Float maxTotalCriticalScore) {
    this.maxTotalCriticalScore = maxTotalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible score of only the critical questions in the group")
  @JsonProperty("maxTotalCriticalScore")
  public Float getMaxTotalCriticalScore() {
    return maxTotalCriticalScore;
  }
  public void setMaxTotalCriticalScore(Float maxTotalCriticalScore) {
    this.maxTotalCriticalScore = maxTotalCriticalScore;
  }

  
  /**
   * Score of only the non critical questions in the group
   **/
  public EvaluationQuestionGroupScore totalNonCriticalScore(Float totalNonCriticalScore) {
    this.totalNonCriticalScore = totalNonCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of only the non critical questions in the group")
  @JsonProperty("totalNonCriticalScore")
  public Float getTotalNonCriticalScore() {
    return totalNonCriticalScore;
  }
  public void setTotalNonCriticalScore(Float totalNonCriticalScore) {
    this.totalNonCriticalScore = totalNonCriticalScore;
  }

  
  /**
   * Maximum possible score of only the non critical questions in the group
   **/
  public EvaluationQuestionGroupScore maxTotalNonCriticalScore(Float maxTotalNonCriticalScore) {
    this.maxTotalNonCriticalScore = maxTotalNonCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible score of only the non critical questions in the group")
  @JsonProperty("maxTotalNonCriticalScore")
  public Float getMaxTotalNonCriticalScore() {
    return maxTotalNonCriticalScore;
  }
  public void setMaxTotalNonCriticalScore(Float maxTotalNonCriticalScore) {
    this.maxTotalNonCriticalScore = maxTotalNonCriticalScore;
  }

  
  /**
   * Unweighted score of all questions in the group
   **/
  public EvaluationQuestionGroupScore totalScoreUnweighted(Float totalScoreUnweighted) {
    this.totalScoreUnweighted = totalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unweighted score of all questions in the group")
  @JsonProperty("totalScoreUnweighted")
  public Float getTotalScoreUnweighted() {
    return totalScoreUnweighted;
  }
  public void setTotalScoreUnweighted(Float totalScoreUnweighted) {
    this.totalScoreUnweighted = totalScoreUnweighted;
  }

  
  /**
   * Maximum possible unweighted score of all questions in the group
   **/
  public EvaluationQuestionGroupScore maxTotalScoreUnweighted(Float maxTotalScoreUnweighted) {
    this.maxTotalScoreUnweighted = maxTotalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible unweighted score of all questions in the group")
  @JsonProperty("maxTotalScoreUnweighted")
  public Float getMaxTotalScoreUnweighted() {
    return maxTotalScoreUnweighted;
  }
  public void setMaxTotalScoreUnweighted(Float maxTotalScoreUnweighted) {
    this.maxTotalScoreUnweighted = maxTotalScoreUnweighted;
  }

  
  /**
   * Unweighted score of only the critical questions in the group
   **/
  public EvaluationQuestionGroupScore totalCriticalScoreUnweighted(Float totalCriticalScoreUnweighted) {
    this.totalCriticalScoreUnweighted = totalCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unweighted score of only the critical questions in the group")
  @JsonProperty("totalCriticalScoreUnweighted")
  public Float getTotalCriticalScoreUnweighted() {
    return totalCriticalScoreUnweighted;
  }
  public void setTotalCriticalScoreUnweighted(Float totalCriticalScoreUnweighted) {
    this.totalCriticalScoreUnweighted = totalCriticalScoreUnweighted;
  }

  
  /**
   * Maximum possible unweighted score of only the critical questions in the group
   **/
  public EvaluationQuestionGroupScore maxTotalCriticalScoreUnweighted(Float maxTotalCriticalScoreUnweighted) {
    this.maxTotalCriticalScoreUnweighted = maxTotalCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible unweighted score of only the critical questions in the group")
  @JsonProperty("maxTotalCriticalScoreUnweighted")
  public Float getMaxTotalCriticalScoreUnweighted() {
    return maxTotalCriticalScoreUnweighted;
  }
  public void setMaxTotalCriticalScoreUnweighted(Float maxTotalCriticalScoreUnweighted) {
    this.maxTotalCriticalScoreUnweighted = maxTotalCriticalScoreUnweighted;
  }

  
  /**
   * Unweighted score of only the non critical questions in the group
   **/
  public EvaluationQuestionGroupScore totalNonCriticalScoreUnweighted(Float totalNonCriticalScoreUnweighted) {
    this.totalNonCriticalScoreUnweighted = totalNonCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unweighted score of only the non critical questions in the group")
  @JsonProperty("totalNonCriticalScoreUnweighted")
  public Float getTotalNonCriticalScoreUnweighted() {
    return totalNonCriticalScoreUnweighted;
  }
  public void setTotalNonCriticalScoreUnweighted(Float totalNonCriticalScoreUnweighted) {
    this.totalNonCriticalScoreUnweighted = totalNonCriticalScoreUnweighted;
  }

  
  /**
   * Maximum possible unweighted score of only the non critical questions in the group
   **/
  public EvaluationQuestionGroupScore maxTotalNonCriticalScoreUnweighted(Float maxTotalNonCriticalScoreUnweighted) {
    this.maxTotalNonCriticalScoreUnweighted = maxTotalNonCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum possible unweighted score of only the non critical questions in the group")
  @JsonProperty("maxTotalNonCriticalScoreUnweighted")
  public Float getMaxTotalNonCriticalScoreUnweighted() {
    return maxTotalNonCriticalScoreUnweighted;
  }
  public void setMaxTotalNonCriticalScoreUnweighted(Float maxTotalNonCriticalScoreUnweighted) {
    this.maxTotalNonCriticalScoreUnweighted = maxTotalNonCriticalScoreUnweighted;
  }

  
  /**
   **/
  public EvaluationQuestionGroupScore questionScores(List<EvaluationQuestionScore> questionScores) {
    this.questionScores = questionScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionScores")
  public List<EvaluationQuestionScore> getQuestionScores() {
    return questionScores;
  }
  public void setQuestionScores(List<EvaluationQuestionScore> questionScores) {
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
    EvaluationQuestionGroupScore evaluationQuestionGroupScore = (EvaluationQuestionGroupScore) o;
    return Objects.equals(this.questionGroupId, evaluationQuestionGroupScore.questionGroupId) &&
        Objects.equals(this.totalScore, evaluationQuestionGroupScore.totalScore) &&
        Objects.equals(this.maxTotalScore, evaluationQuestionGroupScore.maxTotalScore) &&
        Objects.equals(this.markedNA, evaluationQuestionGroupScore.markedNA) &&
        Objects.equals(this.totalCriticalScore, evaluationQuestionGroupScore.totalCriticalScore) &&
        Objects.equals(this.maxTotalCriticalScore, evaluationQuestionGroupScore.maxTotalCriticalScore) &&
        Objects.equals(this.totalNonCriticalScore, evaluationQuestionGroupScore.totalNonCriticalScore) &&
        Objects.equals(this.maxTotalNonCriticalScore, evaluationQuestionGroupScore.maxTotalNonCriticalScore) &&
        Objects.equals(this.totalScoreUnweighted, evaluationQuestionGroupScore.totalScoreUnweighted) &&
        Objects.equals(this.maxTotalScoreUnweighted, evaluationQuestionGroupScore.maxTotalScoreUnweighted) &&
        Objects.equals(this.totalCriticalScoreUnweighted, evaluationQuestionGroupScore.totalCriticalScoreUnweighted) &&
        Objects.equals(this.maxTotalCriticalScoreUnweighted, evaluationQuestionGroupScore.maxTotalCriticalScoreUnweighted) &&
        Objects.equals(this.totalNonCriticalScoreUnweighted, evaluationQuestionGroupScore.totalNonCriticalScoreUnweighted) &&
        Objects.equals(this.maxTotalNonCriticalScoreUnweighted, evaluationQuestionGroupScore.maxTotalNonCriticalScoreUnweighted) &&
        Objects.equals(this.questionScores, evaluationQuestionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, markedNA, totalCriticalScore, maxTotalCriticalScore, totalNonCriticalScore, maxTotalNonCriticalScore, totalScoreUnweighted, maxTotalScoreUnweighted, totalCriticalScoreUnweighted, maxTotalCriticalScoreUnweighted, totalNonCriticalScoreUnweighted, maxTotalNonCriticalScoreUnweighted, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQuestionGroupScore {\n");
    
    sb.append("    questionGroupId: ").append(toIndentedString(questionGroupId)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    maxTotalScore: ").append(toIndentedString(maxTotalScore)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    maxTotalCriticalScore: ").append(toIndentedString(maxTotalCriticalScore)).append("\n");
    sb.append("    totalNonCriticalScore: ").append(toIndentedString(totalNonCriticalScore)).append("\n");
    sb.append("    maxTotalNonCriticalScore: ").append(toIndentedString(maxTotalNonCriticalScore)).append("\n");
    sb.append("    totalScoreUnweighted: ").append(toIndentedString(totalScoreUnweighted)).append("\n");
    sb.append("    maxTotalScoreUnweighted: ").append(toIndentedString(maxTotalScoreUnweighted)).append("\n");
    sb.append("    totalCriticalScoreUnweighted: ").append(toIndentedString(totalCriticalScoreUnweighted)).append("\n");
    sb.append("    maxTotalCriticalScoreUnweighted: ").append(toIndentedString(maxTotalCriticalScoreUnweighted)).append("\n");
    sb.append("    totalNonCriticalScoreUnweighted: ").append(toIndentedString(totalNonCriticalScoreUnweighted)).append("\n");
    sb.append("    maxTotalNonCriticalScoreUnweighted: ").append(toIndentedString(maxTotalNonCriticalScoreUnweighted)).append("\n");
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

