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
 * ContestScore
 */

public class ContestScore  implements Serializable {
  
  private Double score = null;
  private Double totalPoints = null;
  private Double percentOfGoal = null;

  public ContestScore() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Contest score
   **/
  public ContestScore score(Double score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest score")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }


  /**
   * The Contest totalPoints
   **/
  public ContestScore totalPoints(Double totalPoints) {
    this.totalPoints = totalPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest totalPoints")
  @JsonProperty("totalPoints")
  public Double getTotalPoints() {
    return totalPoints;
  }
  public void setTotalPoints(Double totalPoints) {
    this.totalPoints = totalPoints;
  }


  /**
   * The Contest percentOfGoal
   **/
  public ContestScore percentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest percentOfGoal")
  @JsonProperty("percentOfGoal")
  public Double getPercentOfGoal() {
    return percentOfGoal;
  }
  public void setPercentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScore contestScore = (ContestScore) o;

    return Objects.equals(this.score, contestScore.score) &&
            Objects.equals(this.totalPoints, contestScore.totalPoints) &&
            Objects.equals(this.percentOfGoal, contestScore.percentOfGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, totalPoints, percentOfGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScore {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    percentOfGoal: ").append(toIndentedString(percentOfGoal)).append("\n");
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

