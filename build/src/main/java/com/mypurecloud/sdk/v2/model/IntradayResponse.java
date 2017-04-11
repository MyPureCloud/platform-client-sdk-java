package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.IntradayDataGroup;
import com.mypurecloud.sdk.v2.model.IntradayMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayResponse
 */

public class IntradayResponse  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer intervalLengthMinutes = null;
  private Integer numberOfIntervals = null;
  private List<IntradayMetric> metrics = new ArrayList<IntradayMetric>();

  /**
   * If not null, the reason there was no data for the request
   */
  public enum NoDataReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOWEEKDATA("NoWeekData"),
    NOPUBLISHEDSCHEDULE("NoPublishedSchedule"),
    NOSOURCEFORECAST("NoSourceForecast");

    private String value;

    NoDataReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NoDataReasonEnum fromString(String key) {
      if (key == null) return null;

      for (NoDataReasonEnum value : NoDataReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NoDataReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NoDataReasonEnum noDataReason = null;
  private List<String> queueIds = new ArrayList<String>();
  private List<IntradayDataGroup> intradayDataGroupings = new ArrayList<IntradayDataGroup>();

  
  /**
   * The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public IntradayResponse startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public IntradayResponse endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The aggregation period in minutes, which determines the interval duration of the returned data
   **/
  public IntradayResponse intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aggregation period in minutes, which determines the interval duration of the returned data")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }


  /**
   * The total number of time intervals represented by this data
   **/
  public IntradayResponse numberOfIntervals(Integer numberOfIntervals) {
    this.numberOfIntervals = numberOfIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of time intervals represented by this data")
  @JsonProperty("numberOfIntervals")
  public Integer getNumberOfIntervals() {
    return numberOfIntervals;
  }
  public void setNumberOfIntervals(Integer numberOfIntervals) {
    this.numberOfIntervals = numberOfIntervals;
  }


  /**
   * The metrics to which this data corresponds
   **/
  public IntradayResponse metrics(List<IntradayMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metrics to which this data corresponds")
  @JsonProperty("metrics")
  public List<IntradayMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<IntradayMetric> metrics) {
    this.metrics = metrics;
  }


  /**
   * If not null, the reason there was no data for the request
   **/
  public IntradayResponse noDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If not null, the reason there was no data for the request")
  @JsonProperty("noDataReason")
  public NoDataReasonEnum getNoDataReason() {
    return noDataReason;
  }
  public void setNoDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
  }


  /**
   * The IDs of the queues this data corresponds to
   **/
  public IntradayResponse queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the queues this data corresponds to")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   * Intraday data grouped by a single media type and set of queue IDs
   **/
  public IntradayResponse intradayDataGroupings(List<IntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Intraday data grouped by a single media type and set of queue IDs")
  @JsonProperty("intradayDataGroupings")
  public List<IntradayDataGroup> getIntradayDataGroupings() {
    return intradayDataGroupings;
  }
  public void setIntradayDataGroupings(List<IntradayDataGroup> intradayDataGroupings) {
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
    IntradayResponse intradayResponse = (IntradayResponse) o;
    return Objects.equals(this.startDate, intradayResponse.startDate) &&
        Objects.equals(this.endDate, intradayResponse.endDate) &&
        Objects.equals(this.intervalLengthMinutes, intradayResponse.intervalLengthMinutes) &&
        Objects.equals(this.numberOfIntervals, intradayResponse.numberOfIntervals) &&
        Objects.equals(this.metrics, intradayResponse.metrics) &&
        Objects.equals(this.noDataReason, intradayResponse.noDataReason) &&
        Objects.equals(this.queueIds, intradayResponse.queueIds) &&
        Objects.equals(this.intradayDataGroupings, intradayResponse.intradayDataGroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, intervalLengthMinutes, numberOfIntervals, metrics, noDataReason, queueIds, intradayDataGroupings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayResponse {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
    sb.append("    numberOfIntervals: ").append(toIndentedString(numberOfIntervals)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    noDataReason: ").append(toIndentedString(noDataReason)).append("\n");
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

