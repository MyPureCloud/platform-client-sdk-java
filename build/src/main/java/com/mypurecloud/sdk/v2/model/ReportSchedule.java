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
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ReportSchedule
 */

public class ReportSchedule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String quartzCronExpression = null;
  private Date nextFireTime = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String description = null;
  private String timeZone = null;
  private String timePeriod = null;
  private String interval = null;
  private String reportFormat = null;
  private String locale = null;
  private Boolean enabled = null;
  private String reportId = null;
  private Map<String, Object> parameters = null;
  private ReportRunEntry lastRun = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportSchedule name(String name) {
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
   * Quartz Cron Expression
   **/
  public ReportSchedule quartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quartz Cron Expression")
  @JsonProperty("quartzCronExpression")
  public String getQuartzCronExpression() {
    return quartzCronExpression;
  }
  public void setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportSchedule nextFireTime(Date nextFireTime) {
    this.nextFireTime = nextFireTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("nextFireTime")
  public Date getNextFireTime() {
    return nextFireTime;
  }
  public void setNextFireTime(Date nextFireTime) {
    this.nextFireTime = nextFireTime;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportSchedule dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportSchedule dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public ReportSchedule description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public ReportSchedule timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  public ReportSchedule timePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timePeriod")
  public String getTimePeriod() {
    return timePeriod;
  }
  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }

  
  /**
   * Interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ReportSchedule interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   **/
  public ReportSchedule reportFormat(String reportFormat) {
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
  public ReportSchedule locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  public ReportSchedule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Report ID
   **/
  public ReportSchedule reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Report ID")
  @JsonProperty("reportId")
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  
  /**
   **/
  public ReportSchedule parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public Map<String, Object> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  
  /**
   **/
  public ReportSchedule lastRun(ReportRunEntry lastRun) {
    this.lastRun = lastRun;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastRun")
  public ReportRunEntry getLastRun() {
    return lastRun;
  }
  public void setLastRun(ReportRunEntry lastRun) {
    this.lastRun = lastRun;
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
    ReportSchedule reportSchedule = (ReportSchedule) o;
    return Objects.equals(this.id, reportSchedule.id) &&
        Objects.equals(this.name, reportSchedule.name) &&
        Objects.equals(this.quartzCronExpression, reportSchedule.quartzCronExpression) &&
        Objects.equals(this.nextFireTime, reportSchedule.nextFireTime) &&
        Objects.equals(this.dateCreated, reportSchedule.dateCreated) &&
        Objects.equals(this.dateModified, reportSchedule.dateModified) &&
        Objects.equals(this.description, reportSchedule.description) &&
        Objects.equals(this.timeZone, reportSchedule.timeZone) &&
        Objects.equals(this.timePeriod, reportSchedule.timePeriod) &&
        Objects.equals(this.interval, reportSchedule.interval) &&
        Objects.equals(this.reportFormat, reportSchedule.reportFormat) &&
        Objects.equals(this.locale, reportSchedule.locale) &&
        Objects.equals(this.enabled, reportSchedule.enabled) &&
        Objects.equals(this.reportId, reportSchedule.reportId) &&
        Objects.equals(this.parameters, reportSchedule.parameters) &&
        Objects.equals(this.lastRun, reportSchedule.lastRun) &&
        Objects.equals(this.selfUri, reportSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quartzCronExpression, nextFireTime, dateCreated, dateModified, description, timeZone, timePeriod, interval, reportFormat, locale, enabled, reportId, parameters, lastRun, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quartzCronExpression: ").append(toIndentedString(quartzCronExpression)).append("\n");
    sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
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

