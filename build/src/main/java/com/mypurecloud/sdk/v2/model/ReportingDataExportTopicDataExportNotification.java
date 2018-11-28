package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * ReportingDataExportTopicDataExportNotification
 */

public class ReportingDataExportTopicDataExportNotification  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUBMITTED("SUBMITTED"),
    RUNNING("RUNNING"),
    CANCELLING("CANCELLING"),
    CANCELLED("CANCELLED"),
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

  /**
   * Gets or Sets exportFormat
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
  private String downloadUrl = null;

  /**
   * Gets or Sets viewType
   */
  public enum ViewTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUE_PERFORMANCE_SUMMARY_VIEW("QUEUE_PERFORMANCE_SUMMARY_VIEW"),
    QUEUE_PERFORMANCE_DETAIL_VIEW("QUEUE_PERFORMANCE_DETAIL_VIEW"),
    INTERACTION_SEARCH_VIEW("INTERACTION_SEARCH_VIEW"),
    AGENT_PERFORMANCE_SUMMARY_VIEW("AGENT_PERFORMANCE_SUMMARY_VIEW"),
    AGENT_PERFORMANCE_DETAIL_VIEW("AGENT_PERFORMANCE_DETAIL_VIEW"),
    AGENT_STATUS_SUMMARY_VIEW("AGENT_STATUS_SUMMARY_VIEW"),
    AGENT_STATUS_DETAIL_VIEW("AGENT_STATUS_DETAIL_VIEW"),
    AGENT_EVALUATION_SUMMARY_VIEW("AGENT_EVALUATION_SUMMARY_VIEW"),
    AGENT_EVALUATION_DETAIL_VIEW("AGENT_EVALUATION_DETAIL_VIEW"),
    AGENT_QUEUE_DETAIL_VIEW("AGENT_QUEUE_DETAIL_VIEW"),
    AGENT_INTERACTION_DETAIL_VIEW("AGENT_INTERACTION_DETAIL_VIEW"),
    ABANDON_INSIGHTS_VIEW("ABANDON_INSIGHTS_VIEW"),
    SKILLS_PERFORMANCE_VIEW("SKILLS_PERFORMANCE_VIEW"),
    SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW("SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW"),
    SURVEY_FORM_PERFORMANCE_DETAIL_VIEW("SURVEY_FORM_PERFORMANCE_DETAIL_VIEW"),
    DNIS_PERFORMANCE_SUMMARY_VIEW("DNIS_PERFORMANCE_SUMMARY_VIEW"),
    DNIS_PERFORMANCE_DETAIL_VIEW("DNIS_PERFORMANCE_DETAIL_VIEW"),
    WRAP_UP_PERFORMANCE_SUMMARY_VIEW("WRAP_UP_PERFORMANCE_SUMMARY_VIEW"),
    AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW("AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW"),
    QUEUE_ACTIVITY_SUMMARY_VIEW("QUEUE_ACTIVITY_SUMMARY_VIEW"),
    QUEUE_ACTIVITY_DETAIL_VIEW("QUEUE_ACTIVITY_DETAIL_VIEW"),
    AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW("AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW"),
    QUEUE_AGENT_DETAIL_VIEW("QUEUE_AGENT_DETAIL_VIEW"),
    QUEUE_INTERACTION_DETAIL_VIEW("QUEUE_INTERACTION_DETAIL_VIEW"),
    AGENT_SCHEDULE_DETAIL_VIEW("AGENT_SCHEDULE_DETAIL_VIEW"),
    IVR_PERFORMANCE_SUMMARY_VIEW("IVR_PERFORMANCE_SUMMARY_VIEW"),
    IVR_PERFORMANCE_DETAIL_VIEW("IVR_PERFORMANCE_DETAIL_VIEW"),
    ANSWER_INSIGHTS_VIEW("ANSWER_INSIGHTS_VIEW"),
    HANDLE_INSIGHTS_VIEW("HANDLE_INSIGHTS_VIEW"),
    TALK_INSIGHTS_VIEW("TALK_INSIGHTS_VIEW"),
    HOLD_INSIGHTS_VIEW("HOLD_INSIGHTS_VIEW"),
    ACW_INSIGHTS_VIEW("ACW_INSIGHTS_VIEW"),
    WAIT_INSIGHTS_VIEW("WAIT_INSIGHTS_VIEW"),
    AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW("AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW");

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
   * Gets or Sets exportErrorMessagesType
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
  private Boolean read = null;
  private Date createdDateTime = null;
  private Date modifiedDateTime = null;
  private BigDecimal percentageComplete = null;

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification name(String name) {
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
   **/
  public ReportingDataExportTopicDataExportNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification exportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exportFormat")
  public ExportFormatEnum getExportFormat() {
    return exportFormat;
  }
  public void setExportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification viewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewType")
  public ViewTypeEnum getViewType() {
    return viewType;
  }
  public void setViewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification exportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exportErrorMessagesType")
  public ExportErrorMessagesTypeEnum getExportErrorMessagesType() {
    return exportErrorMessagesType;
  }
  public void setExportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification createdDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDateTime")
  public Date getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification modifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDateTime")
  public Date getModifiedDateTime() {
    return modifiedDateTime;
  }
  public void setModifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }

  
  /**
   **/
  public ReportingDataExportTopicDataExportNotification percentageComplete(BigDecimal percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentageComplete")
  public BigDecimal getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(BigDecimal percentageComplete) {
    this.percentageComplete = percentageComplete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingDataExportTopicDataExportNotification reportingDataExportTopicDataExportNotification = (ReportingDataExportTopicDataExportNotification) o;
    return Objects.equals(this.id, reportingDataExportTopicDataExportNotification.id) &&
        Objects.equals(this.name, reportingDataExportTopicDataExportNotification.name) &&
        Objects.equals(this.status, reportingDataExportTopicDataExportNotification.status) &&
        Objects.equals(this.exportFormat, reportingDataExportTopicDataExportNotification.exportFormat) &&
        Objects.equals(this.downloadUrl, reportingDataExportTopicDataExportNotification.downloadUrl) &&
        Objects.equals(this.viewType, reportingDataExportTopicDataExportNotification.viewType) &&
        Objects.equals(this.exportErrorMessagesType, reportingDataExportTopicDataExportNotification.exportErrorMessagesType) &&
        Objects.equals(this.read, reportingDataExportTopicDataExportNotification.read) &&
        Objects.equals(this.createdDateTime, reportingDataExportTopicDataExportNotification.createdDateTime) &&
        Objects.equals(this.modifiedDateTime, reportingDataExportTopicDataExportNotification.modifiedDateTime) &&
        Objects.equals(this.percentageComplete, reportingDataExportTopicDataExportNotification.percentageComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, exportFormat, downloadUrl, viewType, exportErrorMessagesType, read, createdDateTime, modifiedDateTime, percentageComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingDataExportTopicDataExportNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    exportErrorMessagesType: ").append(toIndentedString(exportErrorMessagesType)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
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

