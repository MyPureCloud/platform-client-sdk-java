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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ReportRunEntry
 */

public class ReportRunEntry  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String reportId = null;
  private Date runTime = null;

  private static class RunStatusEnumDeserializer extends StdDeserializer<RunStatusEnum> {
    public RunStatusEnumDeserializer() {
      super(RunStatusEnumDeserializer.class);
    }

    @Override
    public RunStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RunStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets runStatus
   */
 @JsonDeserialize(using = RunStatusEnumDeserializer.class)
  public enum RunStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("RUNNING"),
    COMPLETED("COMPLETED"),
    COMPLETED_WITH_ERRORS("COMPLETED_WITH_ERRORS"),
    FAILED("FAILED"),
    FAILED_TIMEOUT("FAILED_TIMEOUT"),
    FAILED_DATALIMIT("FAILED_DATALIMIT"),
    UNABLE_TO_COMPLETE("UNABLE_TO_COMPLETE");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RunStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RunStatusEnum value : RunStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RunStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RunStatusEnum runStatus = null;
  private String errorMessage = null;
  private Long runDurationMsec = null;
  private String reportUrl = null;
  private String reportFormat = null;
  private String scheduleUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportRunEntry name(String name) {
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
  public ReportRunEntry reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reportId")
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportRunEntry runTime(Date runTime) {
    this.runTime = runTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("runTime")
  public Date getRunTime() {
    return runTime;
  }
  public void setRunTime(Date runTime) {
    this.runTime = runTime;
  }

  
  /**
   **/
  public ReportRunEntry runStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("runStatus")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }
  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  
  /**
   **/
  public ReportRunEntry errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public ReportRunEntry runDurationMsec(Long runDurationMsec) {
    this.runDurationMsec = runDurationMsec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("runDurationMsec")
  public Long getRunDurationMsec() {
    return runDurationMsec;
  }
  public void setRunDurationMsec(Long runDurationMsec) {
    this.runDurationMsec = runDurationMsec;
  }

  
  /**
   **/
  public ReportRunEntry reportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reportUrl")
  public String getReportUrl() {
    return reportUrl;
  }
  public void setReportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
  }

  
  /**
   **/
  public ReportRunEntry reportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reportFormat")
  public String getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
  }

  
  /**
   **/
  public ReportRunEntry scheduleUri(String scheduleUri) {
    this.scheduleUri = scheduleUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleUri")
  public String getScheduleUri() {
    return scheduleUri;
  }
  public void setScheduleUri(String scheduleUri) {
    this.scheduleUri = scheduleUri;
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
    ReportRunEntry reportRunEntry = (ReportRunEntry) o;
    return Objects.equals(this.id, reportRunEntry.id) &&
        Objects.equals(this.name, reportRunEntry.name) &&
        Objects.equals(this.reportId, reportRunEntry.reportId) &&
        Objects.equals(this.runTime, reportRunEntry.runTime) &&
        Objects.equals(this.runStatus, reportRunEntry.runStatus) &&
        Objects.equals(this.errorMessage, reportRunEntry.errorMessage) &&
        Objects.equals(this.runDurationMsec, reportRunEntry.runDurationMsec) &&
        Objects.equals(this.reportUrl, reportRunEntry.reportUrl) &&
        Objects.equals(this.reportFormat, reportRunEntry.reportFormat) &&
        Objects.equals(this.scheduleUri, reportRunEntry.scheduleUri) &&
        Objects.equals(this.selfUri, reportRunEntry.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, reportId, runTime, runStatus, errorMessage, runDurationMsec, reportUrl, reportFormat, scheduleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRunEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    runDurationMsec: ").append(toIndentedString(runDurationMsec)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    scheduleUri: ").append(toIndentedString(scheduleUri)).append("\n");
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

