package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationHistoricalQueueDataPerInterval
 */

public class IntradayDataUpdateNotificationHistoricalQueueDataPerInterval  implements Serializable {
  
  private Integer offered = null;
  private Integer completed = null;
  private Integer answered = null;
  private Integer abandoned = null;
  private BigDecimal averageTalkTimeSeconds = null;
  private BigDecimal averageAfterCallWorkSeconds = null;
  private BigDecimal serviceLevelPercent = null;
  private BigDecimal averageSpeedOfAnswerSeconds = null;

  
  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval offered(Integer offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offered")
  public Integer getOffered() {
    return offered;
  }
  public void setOffered(Integer offered) {
    this.offered = offered;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval completed(Integer completed) {
    this.completed = completed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval answered(Integer answered) {
    this.answered = answered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answered")
  public Integer getAnswered() {
    return answered;
  }
  public void setAnswered(Integer answered) {
    this.answered = answered;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval abandoned(Integer abandoned) {
    this.abandoned = abandoned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("abandoned")
  public Integer getAbandoned() {
    return abandoned;
  }
  public void setAbandoned(Integer abandoned) {
    this.abandoned = abandoned;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval averageTalkTimeSeconds(BigDecimal averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageTalkTimeSeconds")
  public BigDecimal getAverageTalkTimeSeconds() {
    return averageTalkTimeSeconds;
  }
  public void setAverageTalkTimeSeconds(BigDecimal averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval averageAfterCallWorkSeconds(BigDecimal averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageAfterCallWorkSeconds")
  public BigDecimal getAverageAfterCallWorkSeconds() {
    return averageAfterCallWorkSeconds;
  }
  public void setAverageAfterCallWorkSeconds(BigDecimal averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
  }


  /**
   **/
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval serviceLevelPercent(BigDecimal serviceLevelPercent) {
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
  public IntradayDataUpdateNotificationHistoricalQueueDataPerInterval averageSpeedOfAnswerSeconds(BigDecimal averageSpeedOfAnswerSeconds) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationHistoricalQueueDataPerInterval intradayDataUpdateNotificationHistoricalQueueDataPerInterval = (IntradayDataUpdateNotificationHistoricalQueueDataPerInterval) o;
    return Objects.equals(this.offered, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.offered) &&
        Objects.equals(this.completed, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.completed) &&
        Objects.equals(this.answered, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.answered) &&
        Objects.equals(this.abandoned, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.abandoned) &&
        Objects.equals(this.averageTalkTimeSeconds, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.averageTalkTimeSeconds) &&
        Objects.equals(this.averageAfterCallWorkSeconds, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.averageAfterCallWorkSeconds) &&
        Objects.equals(this.serviceLevelPercent, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.serviceLevelPercent) &&
        Objects.equals(this.averageSpeedOfAnswerSeconds, intradayDataUpdateNotificationHistoricalQueueDataPerInterval.averageSpeedOfAnswerSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, completed, answered, abandoned, averageTalkTimeSeconds, averageAfterCallWorkSeconds, serviceLevelPercent, averageSpeedOfAnswerSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationHistoricalQueueDataPerInterval {\n");
    
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

