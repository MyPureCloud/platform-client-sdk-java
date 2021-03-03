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
import com.mypurecloud.sdk.v2.model.SurveyQuestionGroupScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyScoringSet
 */

public class SurveyScoringSet  implements Serializable {
  
  private Float totalScore = null;
  private Integer npsScore = null;
  private List<SurveyQuestionGroupScore> questionGroupScores = new ArrayList<SurveyQuestionGroupScore>();

  
  /**
   **/
  public SurveyScoringSet totalScore(Float totalScore) {
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
  public SurveyScoringSet npsScore(Integer npsScore) {
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
  public SurveyScoringSet questionGroupScores(List<SurveyQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionGroupScores")
  public List<SurveyQuestionGroupScore> getQuestionGroupScores() {
    return questionGroupScores;
  }
  public void setQuestionGroupScores(List<SurveyQuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyScoringSet surveyScoringSet = (SurveyScoringSet) o;
    return Objects.equals(this.totalScore, surveyScoringSet.totalScore) &&
        Objects.equals(this.npsScore, surveyScoringSet.npsScore) &&
        Objects.equals(this.questionGroupScores, surveyScoringSet.questionGroupScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, npsScore, questionGroupScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    npsScore: ").append(toIndentedString(npsScore)).append("\n");
    sb.append("    questionGroupScores: ").append(toIndentedString(questionGroupScores)).append("\n");
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

