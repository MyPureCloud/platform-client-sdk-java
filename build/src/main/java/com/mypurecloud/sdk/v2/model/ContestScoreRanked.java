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
 * ContestScoreRanked
 */

public class ContestScoreRanked  implements Serializable {
  
  private Double score = null;
  private Double totalPoints = null;
  private Double percentOfGoal = null;
  private Integer rank = null;
  private Integer tier = null;

  public ContestScoreRanked() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Contest score
   **/
  public ContestScoreRanked score(Double score) {
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
  public ContestScoreRanked totalPoints(Double totalPoints) {
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
  public ContestScoreRanked percentOfGoal(Double percentOfGoal) {
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


  /**
   * The Contest Score rank
   **/
  public ContestScoreRanked rank(Integer rank) {
    this.rank = rank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Score rank")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  /**
   * The Contest Score tier
   **/
  public ContestScoreRanked tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Score tier")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestScoreRanked contestScoreRanked = (ContestScoreRanked) o;

    return Objects.equals(this.score, contestScoreRanked.score) &&
            Objects.equals(this.totalPoints, contestScoreRanked.totalPoints) &&
            Objects.equals(this.percentOfGoal, contestScoreRanked.percentOfGoal) &&
            Objects.equals(this.rank, contestScoreRanked.rank) &&
            Objects.equals(this.tier, contestScoreRanked.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, totalPoints, percentOfGoal, rank, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestScoreRanked {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    percentOfGoal: ").append(toIndentedString(percentOfGoal)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

