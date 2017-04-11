package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.IntradayMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayQueryDataCommand
 */

public class IntradayQueryDataCommand  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private List<IntradayMetric> metrics = new ArrayList<IntradayMetric>();
  private List<String> queueIds = new ArrayList<String>();
  private Integer intervalLengthMinutes = null;

  
  /**
   * Start date of the requested date range in ISO-8601 format
   **/
  public IntradayQueryDataCommand startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the requested date range in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End date of the requested date range in ISO-8601 format.  Must be within the same 7 day schedule week as defined by the management unit's start day of week
   **/
  public IntradayQueryDataCommand endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End date of the requested date range in ISO-8601 format.  Must be within the same 7 day schedule week as defined by the management unit's start day of week")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The metrics to validate
   **/
  public IntradayQueryDataCommand metrics(List<IntradayMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metrics to validate")
  @JsonProperty("metrics")
  public List<IntradayMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<IntradayMetric> metrics) {
    this.metrics = metrics;
  }


  /**
   * The queue IDs for which to fetch data.  Omitting or passing an empty list will return all available queues
   **/
  public IntradayQueryDataCommand queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue IDs for which to fetch data.  Omitting or passing an empty list will return all available queues")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   * The period/interval for which to aggregate the data.  Optional, defaults to 15
   **/
  public IntradayQueryDataCommand intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The period/interval for which to aggregate the data.  Optional, defaults to 15")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayQueryDataCommand intradayQueryDataCommand = (IntradayQueryDataCommand) o;
    return Objects.equals(this.startDate, intradayQueryDataCommand.startDate) &&
        Objects.equals(this.endDate, intradayQueryDataCommand.endDate) &&
        Objects.equals(this.metrics, intradayQueryDataCommand.metrics) &&
        Objects.equals(this.queueIds, intradayQueryDataCommand.queueIds) &&
        Objects.equals(this.intervalLengthMinutes, intradayQueryDataCommand.intervalLengthMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, metrics, queueIds, intervalLengthMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayQueryDataCommand {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
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

