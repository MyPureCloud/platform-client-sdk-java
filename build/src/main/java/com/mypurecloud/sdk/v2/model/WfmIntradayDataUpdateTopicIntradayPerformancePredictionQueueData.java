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
 * WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData
 */

public class WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData  implements Serializable {
  
  private BigDecimal serviceLevelPercent = null;
  private BigDecimal averageSpeedOfAnswerSeconds = null;
  private BigDecimal numberOfInteractions = null;

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData serviceLevelPercent(BigDecimal serviceLevelPercent) {
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
  public WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData averageSpeedOfAnswerSeconds(BigDecimal averageSpeedOfAnswerSeconds) {
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
  public WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData numberOfInteractions(BigDecimal numberOfInteractions) {
    this.numberOfInteractions = numberOfInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfInteractions")
  public BigDecimal getNumberOfInteractions() {
    return numberOfInteractions;
  }
  public void setNumberOfInteractions(BigDecimal numberOfInteractions) {
    this.numberOfInteractions = numberOfInteractions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData wfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData = (WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData) o;
    return Objects.equals(this.serviceLevelPercent, wfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, wfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData.averageSpeedOfAnswerSeconds) &&
        Objects.equals(this.numberOfInteractions, wfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData.numberOfInteractions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevelPercent, averageSpeedOfAnswerSeconds, numberOfInteractions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData {\n");
    
    sb.append("    serviceLevelPercent: ").append(toIndentedString(serviceLevelPercent)).append("\n");
    sb.append("    averageSpeedOfAnswerSeconds: ").append(toIndentedString(averageSpeedOfAnswerSeconds)).append("\n");
    sb.append("    numberOfInteractions: ").append(toIndentedString(numberOfInteractions)).append("\n");
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

