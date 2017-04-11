package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayHistoricalQueueData
 */

public class IntradayHistoricalQueueData  implements Serializable {
  
  private Integer offered = null;
  private Integer completed = null;
  private Integer answered = null;
  private Integer abandoned = null;
  private Double averageTalkTimeSeconds = null;
  private Double averageAfterCallWorkSeconds = null;
  private Double serviceLevelPercent = null;
  private Double averageSpeedOfAnswerSeconds = null;

  
  /**
   * The number of interactions routed into the queue for the given media type(s) for an agent to answer
   **/
  public IntradayHistoricalQueueData offered(Integer offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions routed into the queue for the given media type(s) for an agent to answer")
  @JsonProperty("offered")
  public Integer getOffered() {
    return offered;
  }
  public void setOffered(Integer offered) {
    this.offered = offered;
  }


  /**
   * The number of interactions completed
   **/
  public IntradayHistoricalQueueData completed(Integer completed) {
    this.completed = completed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions completed")
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }


  /**
   * The number of interactions answered by an agent in a given period
   **/
  public IntradayHistoricalQueueData answered(Integer answered) {
    this.answered = answered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions answered by an agent in a given period")
  @JsonProperty("answered")
  public Integer getAnswered() {
    return answered;
  }
  public void setAnswered(Integer answered) {
    this.answered = answered;
  }


  /**
   * The number of customers who disconnect before connecting with an agent
   **/
  public IntradayHistoricalQueueData abandoned(Integer abandoned) {
    this.abandoned = abandoned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of customers who disconnect before connecting with an agent")
  @JsonProperty("abandoned")
  public Integer getAbandoned() {
    return abandoned;
  }
  public void setAbandoned(Integer abandoned) {
    this.abandoned = abandoned;
  }


  /**
   * The average time in seconds an agent spends interacting with a customer per talk segment for a defined period of time
   **/
  public IntradayHistoricalQueueData averageTalkTimeSeconds(Double averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average time in seconds an agent spends interacting with a customer per talk segment for a defined period of time")
  @JsonProperty("averageTalkTimeSeconds")
  public Double getAverageTalkTimeSeconds() {
    return averageTalkTimeSeconds;
  }
  public void setAverageTalkTimeSeconds(Double averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
  }


  /**
   * The average time in seconds spent in after-call work. After-call work is the work that an agent performs immediately following an interaction
   **/
  public IntradayHistoricalQueueData averageAfterCallWorkSeconds(Double averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average time in seconds spent in after-call work. After-call work is the work that an agent performs immediately following an interaction")
  @JsonProperty("averageAfterCallWorkSeconds")
  public Double getAverageAfterCallWorkSeconds() {
    return averageAfterCallWorkSeconds;
  }
  public void setAverageAfterCallWorkSeconds(Double averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
  }


  /**
   * Percent of interactions answered in X seconds, where X is the service level objective configured in the service goal group matching this intraday group
   **/
  public IntradayHistoricalQueueData serviceLevelPercent(Double serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent of interactions answered in X seconds, where X is the service level objective configured in the service goal group matching this intraday group")
  @JsonProperty("serviceLevelPercent")
  public Double getServiceLevelPercent() {
    return serviceLevelPercent;
  }
  public void setServiceLevelPercent(Double serviceLevelPercent) {
    this.serviceLevelPercent = serviceLevelPercent;
  }


  /**
   * The average time in seconds it takes to answer an interaction once the interaction becomes available to be routed
   **/
  public IntradayHistoricalQueueData averageSpeedOfAnswerSeconds(Double averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average time in seconds it takes to answer an interaction once the interaction becomes available to be routed")
  @JsonProperty("averageSpeedOfAnswerSeconds")
  public Double getAverageSpeedOfAnswerSeconds() {
    return averageSpeedOfAnswerSeconds;
  }
  public void setAverageSpeedOfAnswerSeconds(Double averageSpeedOfAnswerSeconds) {
    this.averageSpeedOfAnswerSeconds = averageSpeedOfAnswerSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayHistoricalQueueData intradayHistoricalQueueData = (IntradayHistoricalQueueData) o;
    return Objects.equals(this.offered, intradayHistoricalQueueData.offered) &&
        Objects.equals(this.completed, intradayHistoricalQueueData.completed) &&
        Objects.equals(this.answered, intradayHistoricalQueueData.answered) &&
        Objects.equals(this.abandoned, intradayHistoricalQueueData.abandoned) &&
        Objects.equals(this.averageTalkTimeSeconds, intradayHistoricalQueueData.averageTalkTimeSeconds) &&
        Objects.equals(this.averageAfterCallWorkSeconds, intradayHistoricalQueueData.averageAfterCallWorkSeconds) &&
        Objects.equals(this.serviceLevelPercent, intradayHistoricalQueueData.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, intradayHistoricalQueueData.averageSpeedOfAnswerSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, completed, answered, abandoned, averageTalkTimeSeconds, averageAfterCallWorkSeconds, serviceLevelPercent, averageSpeedOfAnswerSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayHistoricalQueueData {\n");
    
    sb.append("    offered: ").append(toIndentedString(offered)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    abandoned: ").append(toIndentedString(abandoned)).append("\n");
    sb.append("    averageTalkTimeSeconds: ").append(toIndentedString(averageTalkTimeSeconds)).append("\n");
    sb.append("    averageAfterCallWorkSeconds: ").append(toIndentedString(averageAfterCallWorkSeconds)).append("\n");
    sb.append("    serviceLevelPercent: ").append(toIndentedString(serviceLevelPercent)).append("\n");
    sb.append("    averageSpeedOfAnswerSeconds: ").append(toIndentedString(averageSpeedOfAnswerSeconds)).append("\n");
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

