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
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ReportingExportJobResponse
 */

public class ReportingExportJobResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * The current status of the export request
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUBMITTED("SUBMITTED"),
    RUNNING("RUNNING"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
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
  private String downloadUrl = null;

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

  /**
   * The error message in case the export request failed
   */
  public enum ExportErrorMessagesTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAILED_CONVERTING_EXPORT_JOB("FAILED_CONVERTING_EXPORT_JOB"),
    FAILED_NO_DATA_EXPORT_JOB_FOUND("FAILED_NO_DATA_EXPORT_JOB_FOUND"),
    FAILED_GETTING_DATA_FROM_SERVICE("FAILED_GETTING_DATA_FROM_SERVICE"),
    FAILED_GENERATING_TEMP_FILE("FAILED_GENERATING_TEMP_FILE"),
    FAILED_SAVING_FILE_TO_S3("FAILED_SAVING_FILE_TO_S3"),
    FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD("FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD"),
    FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE("FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE"),
    FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB("FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB"),
    EXPORT_TYPE_NOT_IMPLEMENTED("EXPORT_TYPE_NOT_IMPLEMENTED");

    private String value;

    ExportErrorMessagesTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportErrorMessagesTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExportErrorMessagesTypeEnum value : ExportErrorMessagesTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportErrorMessagesTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportErrorMessagesTypeEnum exportErrorMessagesType = null;
  private String period = null;
  private ViewFilter filter = null;
  private Boolean read = null;
  private Date createdDateTime = null;
  private Date modifiedDateTime = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportingExportJobResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The current status of the export request
   **/
  public ReportingExportJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the export request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The requested timezone of the exported data
   **/
  public ReportingExportJobResponse timeZone(TimeZone timeZone) {
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
  public ReportingExportJobResponse exportFormat(ExportFormatEnum exportFormat) {
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
  public ReportingExportJobResponse interval(String interval) {
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
  public ReportingExportJobResponse dataColumns(List<DataColumn> dataColumns) {
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
   * The url to download the request if it's status is completed
   **/
  public ReportingExportJobResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to download the request if it's status is completed")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   * The type of view export job to be created
   **/
  public ReportingExportJobResponse viewType(ViewTypeEnum viewType) {
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
   * The error message in case the export request failed
   **/
  public ReportingExportJobResponse exportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error message in case the export request failed")
  @JsonProperty("exportErrorMessagesType")
  public ExportErrorMessagesTypeEnum getExportErrorMessagesType() {
    return exportErrorMessagesType;
  }
  public void setExportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
  }

  
  /**
   * The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public ReportingExportJobResponse period(String period) {
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
   * Filters to apply to create the view
   **/
  public ReportingExportJobResponse filter(ViewFilter filter) {
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
  public ReportingExportJobResponse read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the request has been marked as read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   * The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ReportingExportJobResponse createdDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDateTime")
  public Date getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ReportingExportJobResponse modifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDateTime")
  public Date getModifiedDateTime() {
    return modifiedDateTime;
  }
  public void setModifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingExportJobResponse reportingExportJobResponse = (ReportingExportJobResponse) o;
    return Objects.equals(this.id, reportingExportJobResponse.id) &&
        Objects.equals(this.name, reportingExportJobResponse.name) &&
        Objects.equals(this.status, reportingExportJobResponse.status) &&
        Objects.equals(this.timeZone, reportingExportJobResponse.timeZone) &&
        Objects.equals(this.exportFormat, reportingExportJobResponse.exportFormat) &&
        Objects.equals(this.interval, reportingExportJobResponse.interval) &&
        Objects.equals(this.dataColumns, reportingExportJobResponse.dataColumns) &&
        Objects.equals(this.downloadUrl, reportingExportJobResponse.downloadUrl) &&
        Objects.equals(this.viewType, reportingExportJobResponse.viewType) &&
        Objects.equals(this.exportErrorMessagesType, reportingExportJobResponse.exportErrorMessagesType) &&
        Objects.equals(this.period, reportingExportJobResponse.period) &&
        Objects.equals(this.filter, reportingExportJobResponse.filter) &&
        Objects.equals(this.read, reportingExportJobResponse.read) &&
        Objects.equals(this.createdDateTime, reportingExportJobResponse.createdDateTime) &&
        Objects.equals(this.modifiedDateTime, reportingExportJobResponse.modifiedDateTime) &&
        Objects.equals(this.selfUri, reportingExportJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, timeZone, exportFormat, interval, dataColumns, downloadUrl, viewType, exportErrorMessagesType, period, filter, read, createdDateTime, modifiedDateTime, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingExportJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    dataColumns: ").append(toIndentedString(dataColumns)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    exportErrorMessagesType: ").append(toIndentedString(exportErrorMessagesType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

