package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity
 */

public class WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity  implements Serializable {
  
  private String activityCodeId = null;
  private Date startDate = null;
  private Boolean countsAsPaidTime = null;
  private Integer lengthInMinutes = null;
  private String timeOffRequestId = null;
  private String description = null;

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity startDate(Date startDate) {
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
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity description(String description) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity = (WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity) o;
    return Objects.equals(this.activityCodeId, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.activityCodeId) &&
        Objects.equals(this.startDate, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.startDate) &&
        Objects.equals(this.countsAsPaidTime, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.countsAsPaidTime) &&
        Objects.equals(this.lengthInMinutes, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.lengthInMinutes) &&
        Objects.equals(this.timeOffRequestId, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.timeOffRequestId) &&
        Objects.equals(this.description, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, startDate, countsAsPaidTime, lengthInMinutes, timeOffRequestId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateNotificationNotificationWfmScheduleActivity {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

