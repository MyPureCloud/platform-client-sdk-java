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
import com.mypurecloud.sdk.v2.model.AssessmentQuestionScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AssessmentQuestionGroupScore
 */

public class AssessmentQuestionGroupScore  implements Serializable {
  
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
  private List<AssessmentQuestionScore> questionScores = new ArrayList<AssessmentQuestionScore>();

  
  /**
   * The ID of the question group
   **/
  public AssessmentQuestionGroupScore questionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the question group")
  @JsonProperty("questionGroupId")
  public String getQuestionGroupId() {
    return questionGroupId;
  }
  public void setQuestionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
  }

  
  @ApiModelProperty(example = "null", value = "The total score for the questions")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum total score for the questions")
  @JsonProperty("maxTotalScore")
  public Float getMaxTotalScore() {
    return maxTotalScore;
  }

  
  /**
   * True if this question group is marked NA
   **/
  public AssessmentQuestionGroupScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this question group is marked NA")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  
  @ApiModelProperty(example = "null", value = "The total score for the critical questions")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum total score for the critical questions")
  @JsonProperty("maxTotalCriticalScore")
  public Float getMaxTotalCriticalScore() {
    return maxTotalCriticalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The total score for the non-critical questions")
  @JsonProperty("totalNonCriticalScore")
  public Float getTotalNonCriticalScore() {
    return totalNonCriticalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum total score for the non-critical questions")
  @JsonProperty("maxTotalNonCriticalScore")
  public Float getMaxTotalNonCriticalScore() {
    return maxTotalNonCriticalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The unweighted total score for this question group")
  @JsonProperty("totalScoreUnweighted")
  public Float getTotalScoreUnweighted() {
    return totalScoreUnweighted;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum unweighted total score for this question group")
  @JsonProperty("maxTotalScoreUnweighted")
  public Float getMaxTotalScoreUnweighted() {
    return maxTotalScoreUnweighted;
  }

  
  @ApiModelProperty(example = "null", value = "The unweighted total score for the critical questions")
  @JsonProperty("totalCriticalScoreUnweighted")
  public Float getTotalCriticalScoreUnweighted() {
    return totalCriticalScoreUnweighted;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum unweighted total score for the critical questions")
  @JsonProperty("maxTotalCriticalScoreUnweighted")
  public Float getMaxTotalCriticalScoreUnweighted() {
    return maxTotalCriticalScoreUnweighted;
  }

  
  @ApiModelProperty(example = "null", value = "The total unweighted score for the non-critical questions")
  @JsonProperty("totalNonCriticalScoreUnweighted")
  public Float getTotalNonCriticalScoreUnweighted() {
    return totalNonCriticalScoreUnweighted;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum unweighted total score for the non-critical questions")
  @JsonProperty("maxTotalNonCriticalScoreUnweighted")
  public Float getMaxTotalNonCriticalScoreUnweighted() {
    return maxTotalNonCriticalScoreUnweighted;
  }

  
  /**
   * The individual question scores
   **/
  public AssessmentQuestionGroupScore questionScores(List<AssessmentQuestionScore> questionScores) {
    this.questionScores = questionScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The individual question scores")
  @JsonProperty("questionScores")
  public List<AssessmentQuestionScore> getQuestionScores() {
    return questionScores;
  }
  public void setQuestionScores(List<AssessmentQuestionScore> questionScores) {
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
    AssessmentQuestionGroupScore assessmentQuestionGroupScore = (AssessmentQuestionGroupScore) o;
    return Objects.equals(this.questionGroupId, assessmentQuestionGroupScore.questionGroupId) &&
        Objects.equals(this.totalScore, assessmentQuestionGroupScore.totalScore) &&
        Objects.equals(this.maxTotalScore, assessmentQuestionGroupScore.maxTotalScore) &&
        Objects.equals(this.markedNA, assessmentQuestionGroupScore.markedNA) &&
        Objects.equals(this.totalCriticalScore, assessmentQuestionGroupScore.totalCriticalScore) &&
        Objects.equals(this.maxTotalCriticalScore, assessmentQuestionGroupScore.maxTotalCriticalScore) &&
        Objects.equals(this.totalNonCriticalScore, assessmentQuestionGroupScore.totalNonCriticalScore) &&
        Objects.equals(this.maxTotalNonCriticalScore, assessmentQuestionGroupScore.maxTotalNonCriticalScore) &&
        Objects.equals(this.totalScoreUnweighted, assessmentQuestionGroupScore.totalScoreUnweighted) &&
        Objects.equals(this.maxTotalScoreUnweighted, assessmentQuestionGroupScore.maxTotalScoreUnweighted) &&
        Objects.equals(this.totalCriticalScoreUnweighted, assessmentQuestionGroupScore.totalCriticalScoreUnweighted) &&
        Objects.equals(this.maxTotalCriticalScoreUnweighted, assessmentQuestionGroupScore.maxTotalCriticalScoreUnweighted) &&
        Objects.equals(this.totalNonCriticalScoreUnweighted, assessmentQuestionGroupScore.totalNonCriticalScoreUnweighted) &&
        Objects.equals(this.maxTotalNonCriticalScoreUnweighted, assessmentQuestionGroupScore.maxTotalNonCriticalScoreUnweighted) &&
        Objects.equals(this.questionScores, assessmentQuestionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, markedNA, totalCriticalScore, maxTotalCriticalScore, totalNonCriticalScore, maxTotalNonCriticalScore, totalScoreUnweighted, maxTotalScoreUnweighted, totalCriticalScoreUnweighted, maxTotalCriticalScoreUnweighted, totalNonCriticalScoreUnweighted, maxTotalNonCriticalScoreUnweighted, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentQuestionGroupScore {\n");
    
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

