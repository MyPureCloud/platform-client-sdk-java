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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData
 */

public class WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData  implements Serializable {
  
  private BigDecimal serviceLevelPercent = null;
  private BigDecimal averageSpeedOfAnswerSeconds = null;
  private BigDecimal occupancyPercent = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData serviceLevelPercent(BigDecimal serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceLevelPercent")
  public BigDecimal getServiceLevelPercent() {
    return serviceLevelPercent;
  }
  public void setServiceLevelPercent(BigDecimal serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData averageSpeedOfAnswerSeconds(BigDecimal averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageSpeedOfAnswerSeconds")
  public BigDecimal getAverageSpeedOfAnswerSeconds() {
    return averageSpeedOfAnswerSeconds;
  }
  public void setAverageSpeedOfAnswerSeconds(BigDecimal averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData occupancyPercent(BigDecimal occupancyPercent) {
    this.occupancyPercent = occupancyPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("occupancyPercent")
  public BigDecimal getOccupancyPercent() {
    return occupancyPercent;
  }
  public void setOccupancyPercent(BigDecimal occupancyPercent) {
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
    WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData wfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData = (WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData) o;
    return Objects.equals(this.serviceLevelPercent, wfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, wfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.averageSpeedOfAnswerSeconds) &&
        Objects.equals(this.occupancyPercent, wfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.occupancyPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevelPercent, averageSpeedOfAnswerSeconds, occupancyPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData {\n");
    
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

