package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationIntradayDataGroupings;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotification
 */

public class IntradayDataUpdateNotification  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer intervalLengthMinutes = null;
  private Integer numberOfIntervals = null;
  private List<IntradayDataUpdateNotificationMetrics> metrics = new ArrayList<IntradayDataUpdateNotificationMetrics>();
  private List<String> queueIds = new ArrayList<String>();
  private List<IntradayDataUpdateNotificationIntradayDataGroupings> intradayDataGroupings = new ArrayList<IntradayDataUpdateNotificationIntradayDataGroupings>();

  
  /**
   **/
  public IntradayDataUpdateNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   **/
  public IntradayDataUpdateNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   **/
  public IntradayDataUpdateNotification intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }


  /**
   **/
  public IntradayDataUpdateNotification numberOfIntervals(Integer numberOfIntervals) {
    this.numberOfIntervals = numberOfIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfIntervals")
  public Integer getNumberOfIntervals() {
    return numberOfIntervals;
  }
  public void setNumberOfIntervals(Integer numberOfIntervals) {
    this.numberOfIntervals = numberOfIntervals;
  }


  /**
   **/
  public IntradayDataUpdateNotification metrics(List<IntradayDataUpdateNotificationMetrics> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<IntradayDataUpdateNotificationMetrics> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<IntradayDataUpdateNotificationMetrics> metrics) {
    this.metrics = metrics;
  }


  /**
   **/
  public IntradayDataUpdateNotification queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   **/
  public IntradayDataUpdateNotification intradayDataGroupings(List<IntradayDataUpdateNotificationIntradayDataGroupings> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intradayDataGroupings")
  public List<IntradayDataUpdateNotificationIntradayDataGroupings> getIntradayDataGroupings() {
    return intradayDataGroupings;
  }
  public void setIntradayDataGroupings(List<IntradayDataUpdateNotificationIntradayDataGroupings> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotification intradayDataUpdateNotification = (IntradayDataUpdateNotification) o;
    return Objects.equals(this.startDate, intradayDataUpdateNotification.startDate) &&
        Objects.equals(this.endDate, intradayDataUpdateNotification.endDate) &&
        Objects.equals(this.intervalLengthMinutes, intradayDataUpdateNotification.intervalLengthMinutes) &&
        Objects.equals(this.numberOfIntervals, intradayDataUpdateNotification.numberOfIntervals) &&
        Objects.equals(this.metrics, intradayDataUpdateNotification.metrics) &&
        Objects.equals(this.queueIds, intradayDataUpdateNotification.queueIds) &&
        Objects.equals(this.intradayDataGroupings, intradayDataUpdateNotification.intradayDataGroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, intervalLengthMinutes, numberOfIntervals, metrics, queueIds, intradayDataGroupings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotification {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
    sb.append("    numberOfIntervals: ").append(toIndentedString(numberOfIntervals)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    intradayDataGroupings: ").append(toIndentedString(intradayDataGroupings)).append("\n");
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

