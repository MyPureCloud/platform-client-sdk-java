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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayPerformancePredictionData
 */

public class IntradayPerformancePredictionData  implements Serializable {
  
  private Double serviceLevelPercent = null;
  private Double averageSpeedOfAnswerSeconds = null;
  private Double occupancyPercent = null;

  
  /**
   * Percentage of interactions that meets service level target as defined in the matching service goal templates
   **/
  public IntradayPerformancePredictionData serviceLevelPercent(Double serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of interactions that meets service level target as defined in the matching service goal templates")
  @JsonProperty("serviceLevelPercent")
  public Double getServiceLevelPercent() {
    return serviceLevelPercent;
  }
  public void setServiceLevelPercent(Double serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
  }

  
  /**
   * Predicted average time in seconds it takes to answer an interaction once the interaction becomes available to be routed
   **/
  public IntradayPerformancePredictionData averageSpeedOfAnswerSeconds(Double averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Predicted average time in seconds it takes to answer an interaction once the interaction becomes available to be routed")
  @JsonProperty("averageSpeedOfAnswerSeconds")
  public Double getAverageSpeedOfAnswerSeconds() {
    return averageSpeedOfAnswerSeconds;
  }
  public void setAverageSpeedOfAnswerSeconds(Double averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
  }

  
  /**
   * Percentage of on-queue time for all agents in this group that are occupied handling interactions
   **/
  public IntradayPerformancePredictionData occupancyPercent(Double occupancyPercent) {
    this.occupancyPercent = occupancyPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of on-queue time for all agents in this group that are occupied handling interactions")
  @JsonProperty("occupancyPercent")
  public Double getOccupancyPercent() {
    return occupancyPercent;
  }
  public void setOccupancyPercent(Double occupancyPercent) {
    this.occupancyPercent = occupancyPercent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayPerformancePredictionData intradayPerformancePredictionData = (IntradayPerformancePredictionData) o;
    return Objects.equals(this.serviceLevelPercent, intradayPerformancePredictionData.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, intradayPerformancePredictionData.averageSpeedOfAnswerSeconds) &&
        Objects.equals(this.occupancyPercent, intradayPerformancePredictionData.occupancyPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevelPercent, averageSpeedOfAnswerSeconds, occupancyPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayPerformancePredictionData {\n");
    
    sb.append("    serviceLevelPercent: ").append(toIndentedString(serviceLevelPercent)).append("\n");
    sb.append("    averageSpeedOfAnswerSeconds: ").append(toIndentedString(averageSpeedOfAnswerSeconds)).append("\n");
    sb.append("    occupancyPercent: ").append(toIndentedString(occupancyPercent)).append("\n");
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

