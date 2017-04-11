package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayPerformancePredictionQueueData
 */

public class IntradayPerformancePredictionQueueData  implements Serializable {
  
  private Double serviceLevelPercent = null;
  private Double averageSpeedOfAnswerSeconds = null;
  private Double numberOfInteractions = null;

  
  /**
   * Predicted percent of interactions answered in X seconds, where X is the service level objective configured in the service goal group matching this intraday group
   **/
  public IntradayPerformancePredictionQueueData serviceLevelPercent(Double serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Predicted percent of interactions answered in X seconds, where X is the service level objective configured in the service goal group matching this intraday group")
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
  public IntradayPerformancePredictionQueueData averageSpeedOfAnswerSeconds(Double averageSpeedOfAnswerSeconds) {
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
   * Predicted number of interactions
   **/
  public IntradayPerformancePredictionQueueData numberOfInteractions(Double numberOfInteractions) {
    this.numberOfInteractions = numberOfInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Predicted number of interactions")
  @JsonProperty("numberOfInteractions")
  public Double getNumberOfInteractions() {
    return numberOfInteractions;
  }
  public void setNumberOfInteractions(Double numberOfInteractions) {
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
    IntradayPerformancePredictionQueueData intradayPerformancePredictionQueueData = (IntradayPerformancePredictionQueueData) o;
    return Objects.equals(this.serviceLevelPercent, intradayPerformancePredictionQueueData.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, intradayPerformancePredictionQueueData.averageSpeedOfAnswerSeconds) &&
        Objects.equals(this.numberOfInteractions, intradayPerformancePredictionQueueData.numberOfInteractions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevelPercent, averageSpeedOfAnswerSeconds, numberOfInteractions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayPerformancePredictionQueueData {\n");
    
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

