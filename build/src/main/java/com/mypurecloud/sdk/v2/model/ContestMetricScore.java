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
 * ContestMetricScore
 */

public class ContestMetricScore  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private Double score = null;
  private Double totalPoints = null;
  private Double percentOfGoal = null;

  public ContestMetricScore() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The gamification metric for the data
   **/
  public ContestMetricScore metric(AddressableEntityRef metric) {
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
  public ContestMetricScore score(Double score) {
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
  public ContestMetricScore totalPoints(Double totalPoints) {
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
  public ContestMetricScore percentOfGoal(Double percentOfGoal) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestMetricScore contestMetricScore = (ContestMetricScore) o;

    return Objects.equals(this.metric, contestMetricScore.metric) &&
            Objects.equals(this.score, contestMetricScore.score) &&
            Objects.equals(this.totalPoints, contestMetricScore.totalPoints) &&
            Objects.equals(this.percentOfGoal, contestMetricScore.percentOfGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, score, totalPoints, percentOfGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestMetricScore {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

