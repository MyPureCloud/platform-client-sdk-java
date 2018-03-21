package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DataColumn;
import com.mypurecloud.sdk.v2.model.TimeZone;
import com.mypurecloud.sdk.v2.model.ViewFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingExportJobRequest
 */

public class ReportingExportJobRequest  implements Serializable {
  
  private String name = null;
  private TimeZone timeZone = null;

  /**
   * The requested format of the exported data
   */
  public enum ExportFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("CSV");

    private String value;

    ExportFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportFormatEnum fromString(String key) {
      if (key == null) return null;

      for (ExportFormatEnum value : ExportFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportFormatEnum exportFormat = null;
  private String interval = null;
  private List<DataColumn> dataColumns = new ArrayList<DataColumn>();
  private String period = null;

  /**
   * The type of view export job to be created
   */
  public enum ViewTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUE_PERFORMANCE_SUMMARY_VIEW("QUEUE_PERFORMANCE_SUMMARY_VIEW"),
    QUEUE_PERFORMANCE_DETAIL_VIEW("QUEUE_PERFORMANCE_DETAIL_VIEW");

    private String value;

    ViewTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ViewTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ViewTypeEnum value : ViewTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ViewTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ViewTypeEnum viewType = null;
  private ViewFilter filter = null;
  private Boolean read = null;

  
  /**
   * The user supplied name of the export request
   **/
  public ReportingExportJobRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied name of the export request")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The requested timezone of the exported data
   **/
  public ReportingExportJobRequest timeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested timezone of the exported data")
  @JsonProperty("timeZone")
  public TimeZone getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The requested format of the exported data
   **/
  public ReportingExportJobRequest exportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested format of the exported data")
  @JsonProperty("exportFormat")
  public ExportFormatEnum getExportFormat() {
    return exportFormat;
  }
  public void setExportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
  }

  
  /**
   * The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ReportingExportJobRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * The data columns included in the export
   **/
  public ReportingExportJobRequest dataColumns(List<DataColumn> dataColumns) {
    this.dataColumns = dataColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data columns included in the export")
  @JsonProperty("dataColumns")
  public List<DataColumn> getDataColumns() {
    return dataColumns;
  }
  public void setDataColumns(List<DataColumn> dataColumns) {
    this.dataColumns = dataColumns;
  }

  
  /**
   * The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public ReportingExportJobRequest period(String period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  
  /**
   * The type of view export job to be created
   **/
  public ReportingExportJobRequest viewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of view export job to be created")
  @JsonProperty("viewType")
  public ViewTypeEnum getViewType() {
    return viewType;
  }
  public void setViewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
  }

  
  /**
   * Filters to apply to create the view
   **/
  public ReportingExportJobRequest filter(ViewFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filters to apply to create the view")
  @JsonProperty("filter")
  public ViewFilter getFilter() {
    return filter;
  }
  public void setFilter(ViewFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Indicates if the request has been marked as read
   **/
  public ReportingExportJobRequest read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the request has been marked as read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingExportJobRequest reportingExportJobRequest = (ReportingExportJobRequest) o;
    return Objects.equals(this.name, reportingExportJobRequest.name) &&
        Objects.equals(this.timeZone, reportingExportJobRequest.timeZone) &&
        Objects.equals(this.exportFormat, reportingExportJobRequest.exportFormat) &&
        Objects.equals(this.interval, reportingExportJobRequest.interval) &&
        Objects.equals(this.dataColumns, reportingExportJobRequest.dataColumns) &&
        Objects.equals(this.period, reportingExportJobRequest.period) &&
        Objects.equals(this.viewType, reportingExportJobRequest.viewType) &&
        Objects.equals(this.filter, reportingExportJobRequest.filter) &&
        Objects.equals(this.read, reportingExportJobRequest.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeZone, exportFormat, interval, dataColumns, period, viewType, filter, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingExportJobRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    dataColumns: ").append(toIndentedString(dataColumns)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

