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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContestMetricScoreRanked
 */

public class ContestMetricScoreRanked  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private Double score = null;
  private Double totalPoints = null;
  private Double percentOfGoal = null;
  private Integer rank = null;

  public ContestMetricScoreRanked() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The gamification metric for the data
   **/
  public ContestMetricScoreRanked metric(AddressableEntityRef metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The gamification metric for the data")
  @JsonProperty("metric")
  public AddressableEntityRef getMetric() {
    return metric;
  }
  public void setMetric(AddressableEntityRef metric) {
    this.metric = metric;
  }


  /**
   * The Contest Metric score
   **/
  public ContestMetricScoreRanked score(Double score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Metric score")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }


  /**
   * The Contest Metric totalPoints
   **/
  public ContestMetricScoreRanked totalPoints(Double totalPoints) {
    this.totalPoints = totalPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Metric totalPoints")
  @JsonProperty("totalPoints")
  public Double getTotalPoints() {
    return totalPoints;
  }
  public void setTotalPoints(Double totalPoints) {
    this.totalPoints = totalPoints;
  }


  /**
   * The Contest Metric percentOfGoal
   **/
  public ContestMetricScoreRanked percentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Metric percentOfGoal")
  @JsonProperty("percentOfGoal")
  public Double getPercentOfGoal() {
    return percentOfGoal;
  }
  public void setPercentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
  }


  /**
   * The Contest Score rank, a lower rank is better (1 is the best)
   **/
  public ContestMetricScoreRanked rank(Integer rank) {
    this.rank = rank;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Score rank, a lower rank is better (1 is the best)")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestMetricScoreRanked contestMetricScoreRanked = (ContestMetricScoreRanked) o;

    return Objects.equals(this.metric, contestMetricScoreRanked.metric) &&
            Objects.equals(this.score, contestMetricScoreRanked.score) &&
            Objects.equals(this.totalPoints, contestMetricScoreRanked.totalPoints) &&
            Objects.equals(this.percentOfGoal, contestMetricScoreRanked.percentOfGoal) &&
            Objects.equals(this.rank, contestMetricScoreRanked.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, score, totalPoints, percentOfGoal, rank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestMetricScoreRanked {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    percentOfGoal: ").append(toIndentedString(percentOfGoal)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

