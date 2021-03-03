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
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayDataGroup;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmIntradayDataUpdateTopicIntradayDataUpdate
 */

public class WfmIntradayDataUpdateTopicIntradayDataUpdate  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer intervalLengthMinutes = null;
  private Integer numberOfIntervals = null;
  private List<WfmIntradayDataUpdateTopicIntradayMetric> metrics = new ArrayList<WfmIntradayDataUpdateTopicIntradayMetric>();
  private List<String> queueIds = new ArrayList<String>();
  private List<WfmIntradayDataUpdateTopicIntradayDataGroup> intradayDataGroupings = new ArrayList<WfmIntradayDataUpdateTopicIntradayDataGroup>();

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataUpdate startDate(Date startDate) {
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate endDate(Date endDate) {
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate intervalLengthMinutes(Integer intervalLengthMinutes) {
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate numberOfIntervals(Integer numberOfIntervals) {
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate metrics(List<WfmIntradayDataUpdateTopicIntradayMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<WfmIntradayDataUpdateTopicIntradayMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<WfmIntradayDataUpdateTopicIntradayMetric> metrics) {
    this.metrics = metrics;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataUpdate queueIds(List<String> queueIds) {
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate intradayDataGroupings(List<WfmIntradayDataUpdateTopicIntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intradayDataGroupings")
  public List<WfmIntradayDataUpdateTopicIntradayDataGroup> getIntradayDataGroupings() {
    return intradayDataGroupings;
  }
  public void setIntradayDataGroupings(List<WfmIntradayDataUpdateTopicIntradayDataGroup> intradayDataGroupings) {
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
    WfmIntradayDataUpdateTopicIntradayDataUpdate wfmIntradayDataUpdateTopicIntradayDataUpdate = (WfmIntradayDataUpdateTopicIntradayDataUpdate) o;
    return Objects.equals(this.startDate, wfmIntradayDataUpdateTopicIntradayDataUpdate.startDate) &&
        Objects.equals(this.endDate, wfmIntradayDataUpdateTopicIntradayDataUpdate.endDate) &&
        Objects.equals(this.intervalLengthMinutes, wfmIntradayDataUpdateTopicIntradayDataUpdate.intervalLengthMinutes) &&
        Objects.equals(this.numberOfIntervals, wfmIntradayDataUpdateTopicIntradayDataUpdate.numberOfIntervals) &&
        Objects.equals(this.metrics, wfmIntradayDataUpdateTopicIntradayDataUpdate.metrics) &&
        Objects.equals(this.queueIds, wfmIntradayDataUpdateTopicIntradayDataUpdate.queueIds) &&
        Objects.equals(this.intradayDataGroupings, wfmIntradayDataUpdateTopicIntradayDataUpdate.intradayDataGroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, intervalLengthMinutes, numberOfIntervals, metrics, queueIds, intradayDataGroupings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayDataUpdate {\n");
    
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

