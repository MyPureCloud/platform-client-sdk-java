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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsDetailsMetricPeriodPoints
 */

public class InsightsDetailsMetricPeriodPoints  implements Serializable {
  
  private Integer points = null;
  private Integer maxPoints = null;
  private Integer dataPointCount = null;
  private Double percentOfGoal = null;
  private Integer rankTotalPoints = null;
  private Integer rankPercentagePoints = null;
  private Double value = null;

  
  /**
   * Points scored
   **/
  public InsightsDetailsMetricPeriodPoints points(Integer points) {
    this.points = points;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Points scored")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }


  /**
   * Max possible points
   **/
  public InsightsDetailsMetricPeriodPoints maxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Max possible points")
  @JsonProperty("maxPoints")
  public Integer getMaxPoints() {
    return maxPoints;
  }
  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }


  /**
   * Number of data points
   **/
  public InsightsDetailsMetricPeriodPoints dataPointCount(Integer dataPointCount) {
    this.dataPointCount = dataPointCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of data points")
  @JsonProperty("dataPointCount")
  public Integer getDataPointCount() {
    return dataPointCount;
  }
  public void setDataPointCount(Integer dataPointCount) {
    this.dataPointCount = dataPointCount;
  }


  /**
   * Percentage of the goal
   **/
  public InsightsDetailsMetricPeriodPoints percentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of the goal")
  @JsonProperty("percentOfGoal")
  public Double getPercentOfGoal() {
    return percentOfGoal;
  }
  public void setPercentOfGoal(Double percentOfGoal) {
    this.percentOfGoal = percentOfGoal;
  }


  /**
   * The agent's rank in leader board for points on this metric
   **/
  public InsightsDetailsMetricPeriodPoints rankTotalPoints(Integer rankTotalPoints) {
    this.rankTotalPoints = rankTotalPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent's rank in leader board for points on this metric")
  @JsonProperty("rankTotalPoints")
  public Integer getRankTotalPoints() {
    return rankTotalPoints;
  }
  public void setRankTotalPoints(Integer rankTotalPoints) {
    this.rankTotalPoints = rankTotalPoints;
  }


  /**
   * The agent's rank in leader board for percentage on this metric
   **/
  public InsightsDetailsMetricPeriodPoints rankPercentagePoints(Integer rankPercentagePoints) {
    this.rankPercentagePoints = rankPercentagePoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent's rank in leader board for percentage on this metric")
  @JsonProperty("rankPercentagePoints")
  public Integer getRankPercentagePoints() {
    return rankPercentagePoints;
  }
  public void setRankPercentagePoints(Integer rankPercentagePoints) {
    this.rankPercentagePoints = rankPercentagePoints;
  }


  /**
   * Average value
   **/
  public InsightsDetailsMetricPeriodPoints value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average value")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsDetailsMetricPeriodPoints insightsDetailsMetricPeriodPoints = (InsightsDetailsMetricPeriodPoints) o;

    return Objects.equals(this.points, insightsDetailsMetricPeriodPoints.points) &&
            Objects.equals(this.maxPoints, insightsDetailsMetricPeriodPoints.maxPoints) &&
            Objects.equals(this.dataPointCount, insightsDetailsMetricPeriodPoints.dataPointCount) &&
            Objects.equals(this.percentOfGoal, insightsDetailsMetricPeriodPoints.percentOfGoal) &&
            Objects.equals(this.rankTotalPoints, insightsDetailsMetricPeriodPoints.rankTotalPoints) &&
            Objects.equals(this.rankPercentagePoints, insightsDetailsMetricPeriodPoints.rankPercentagePoints) &&
            Objects.equals(this.value, insightsDetailsMetricPeriodPoints.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, maxPoints, dataPointCount, percentOfGoal, rankTotalPoints, rankPercentagePoints, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsDetailsMetricPeriodPoints {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    dataPointCount: ").append(toIndentedString(dataPointCount)).append("\n");
    sb.append("    percentOfGoal: ").append(toIndentedString(percentOfGoal)).append("\n");
    sb.append("    rankTotalPoints: ").append(toIndentedString(rankTotalPoints)).append("\n");
    sb.append("    rankPercentagePoints: ").append(toIndentedString(rankPercentagePoints)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

