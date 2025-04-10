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
  private Long intervalLengthMinutes = null;
  private Long numberOfIntervals = null;
  private List<WfmIntradayDataUpdateTopicIntradayMetric> metrics = null;
  private List<String> queueIds = null;
  private List<WfmIntradayDataUpdateTopicIntradayDataGroup> intradayDataGroupings = null;

  public WfmIntradayDataUpdateTopicIntradayDataUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<WfmIntradayDataUpdateTopicIntradayMetric>();
      queueIds = new ArrayList<String>();
      intradayDataGroupings = new ArrayList<WfmIntradayDataUpdateTopicIntradayDataGroup>();
    }
  }

  
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
  public WfmIntradayDataUpdateTopicIntradayDataUpdate intervalLengthMinutes(Long intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervalLengthMinutes")
  public Long getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Long intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }


  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataUpdate numberOfIntervals(Long numberOfIntervals) {
    this.numberOfIntervals = numberOfIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfIntervals")
  public Long getNumberOfIntervals() {
    return numberOfIntervals;
  }
  public void setNumberOfIntervals(Long numberOfIntervals) {
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

