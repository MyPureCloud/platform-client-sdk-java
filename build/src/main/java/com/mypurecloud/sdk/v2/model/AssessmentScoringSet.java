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
import com.mypurecloud.sdk.v2.model.AssessmentQuestionGroupScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AssessmentScoringSet
 */

public class AssessmentScoringSet  implements Serializable {
  
  private Float totalScore = null;
  private Float totalCriticalScore = null;
  private Float totalNonCriticalScore = null;
  private List<AssessmentQuestionGroupScore> questionGroupScores = new ArrayList<AssessmentQuestionGroupScore>();

  private static class FailureReasonsEnumDeserializer extends StdDeserializer<FailureReasonsEnum> {
    public FailureReasonsEnumDeserializer() {
      super(FailureReasonsEnumDeserializer.class);
    }

    @Override
    public FailureReasonsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureReasonsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets failureReasons
   */
 @JsonDeserialize(using = FailureReasonsEnumDeserializer.class)
  public enum FailureReasonsEnum {
    SCORE("Score"),
    CRITICALSCORE("CriticalScore"),
    KILLQUESTION("KillQuestion");

    private String value;

    FailureReasonsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureReasonsEnum fromString(String key) {
      if (key == null) return null;

      for (FailureReasonsEnum value : FailureReasonsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureReasonsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FailureReasonsEnum> failureReasons = new ArrayList<FailureReasonsEnum>();
  private String comments = null;
  private String agentComments = null;
  private Boolean isPassed = null;

  
  @ApiModelProperty(example = "null", value = "The total score of the answers")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The total score for the critical questions")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }

  
  @ApiModelProperty(example = "null", value = "The total score for the non-critical questions")
  @JsonProperty("totalNonCriticalScore")
  public Float getTotalNonCriticalScore() {
    return totalNonCriticalScore;
  }

  
  /**
   * The individual scores for each question group
   **/
  public AssessmentScoringSet questionGroupScores(List<AssessmentQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The individual scores for each question group")
  @JsonProperty("questionGroupScores")
  public List<AssessmentQuestionGroupScore> getQuestionGroupScores() {
    return questionGroupScores;
  }
  public void setQuestionGroupScores(List<AssessmentQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
  }

  
  @ApiModelProperty(example = "null", value = "If the assessment was not passed, the reasons for failure.")
  @JsonProperty("failureReasons")
  public List<FailureReasonsEnum> getFailureReasons() {
    return failureReasons;
  }

  
  /**
   * Comments provided for these answers.
   **/
  public AssessmentScoringSet comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments provided for these answers.")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  
  /**
   * Comments provided by agent.
   **/
  public AssessmentScoringSet agentComments(String agentComments) {
    this.agentComments = agentComments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments provided by agent.")
  @JsonProperty("agentComments")
  public String getAgentComments() {
    return agentComments;
  }
  public void setAgentComments(String agentComments) {
    this.agentComments = agentComments;
  }

  
  @ApiModelProperty(example = "null", value = "True if the assessment was passed")
  @JsonProperty("isPassed")
  public Boolean getIsPassed() {
    return isPassed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentScoringSet assessmentScoringSet = (AssessmentScoringSet) o;
    return Objects.equals(this.totalScore, assessmentScoringSet.totalScore) &&
        Objects.equals(this.totalCriticalScore, assessmentScoringSet.totalCriticalScore) &&
        Objects.equals(this.totalNonCriticalScore, assessmentScoringSet.totalNonCriticalScore) &&
        Objects.equals(this.questionGroupScores, assessmentScoringSet.questionGroupScores) &&
        Objects.equals(this.failureReasons, assessmentScoringSet.failureReasons) &&
        Objects.equals(this.comments, assessmentScoringSet.comments) &&
        Objects.equals(this.agentComments, assessmentScoringSet.agentComments) &&
        Objects.equals(this.isPassed, assessmentScoringSet.isPassed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, totalCriticalScore, totalNonCriticalScore, questionGroupScores, failureReasons, comments, agentComments, isPassed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    totalNonCriticalScore: ").append(toIndentedString(totalNonCriticalScore)).append("\n");
    sb.append("    questionGroupScores: ").append(toIndentedString(questionGroupScores)).append("\n");
    sb.append("    failureReasons: ").append(toIndentedString(failureReasons)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    agentComments: ").append(toIndentedString(agentComments)).append("\n");
    sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
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

