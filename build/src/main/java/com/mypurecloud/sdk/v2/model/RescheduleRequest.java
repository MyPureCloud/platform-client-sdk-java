package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RescheduleRequest
 */

public class RescheduleRequest  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private List<String> agentIds = new ArrayList<String>();
  private List<String> activityCodeIds = new ArrayList<String>();
  private Boolean doNotChangeWeeklyPaidTime = null;
  private Boolean doNotChangeDailyPaidTime = null;
  private Boolean doNotChangeShiftStartTimes = null;
  private Boolean doNotChangeManuallyEditedShifts = null;

  
  /**
   * The start date of the range to reschedule in ISO-8601 format
   **/
  public RescheduleRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date of the range to reschedule in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end date of the range to reschedule in ISO-8601 format
   **/
  public RescheduleRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date of the range to reschedule in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The IDs of the agents to reschedule.  Null or empty means all agents on the schedule
   **/
  public RescheduleRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents to reschedule.  Null or empty means all agents on the schedule")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }

  
  /**
   * The IDs of the activity codes to reschedule. Null or empty means all activity codes will be considered
   **/
  public RescheduleRequest activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the activity codes to reschedule. Null or empty means all activity codes will be considered")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }

  
  /**
   * Whether to prevent changes to weekly paid time
   **/
  public RescheduleRequest doNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to prevent changes to weekly paid time")
  @JsonProperty("doNotChangeWeeklyPaidTime")
  public Boolean getDoNotChangeWeeklyPaidTime() {
    return doNotChangeWeeklyPaidTime;
  }
  public void setDoNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
  }

  
  /**
   * Whether to prevent changes to daily paid time
   **/
  public RescheduleRequest doNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to prevent changes to daily paid time")
  @JsonProperty("doNotChangeDailyPaidTime")
  public Boolean getDoNotChangeDailyPaidTime() {
    return doNotChangeDailyPaidTime;
  }
  public void setDoNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
  }

  
  /**
   * Whether to prevent changes to shift start times
   **/
  public RescheduleRequest doNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to prevent changes to shift start times")
  @JsonProperty("doNotChangeShiftStartTimes")
  public Boolean getDoNotChangeShiftStartTimes() {
    return doNotChangeShiftStartTimes;
  }
  public void setDoNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
  }

  
  /**
   * Whether to prevent changes to manually edited shifts
   **/
  public RescheduleRequest doNotChangeManuallyEditedShifts(Boolean doNotChangeManuallyEditedShifts) {
    this.doNotChangeManuallyEditedShifts = doNotChangeManuallyEditedShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to prevent changes to manually edited shifts")
  @JsonProperty("doNotChangeManuallyEditedShifts")
  public Boolean getDoNotChangeManuallyEditedShifts() {
    return doNotChangeManuallyEditedShifts;
  }
  public void setDoNotChangeManuallyEditedShifts(Boolean doNotChangeManuallyEditedShifts) {
    this.doNotChangeManuallyEditedShifts = doNotChangeManuallyEditedShifts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RescheduleRequest rescheduleRequest = (RescheduleRequest) o;
    return Objects.equals(this.startDate, rescheduleRequest.startDate) &&
        Objects.equals(this.endDate, rescheduleRequest.endDate) &&
        Objects.equals(this.agentIds, rescheduleRequest.agentIds) &&
        Objects.equals(this.activityCodeIds, rescheduleRequest.activityCodeIds) &&
        Objects.equals(this.doNotChangeWeeklyPaidTime, rescheduleRequest.doNotChangeWeeklyPaidTime) &&
        Objects.equals(this.doNotChangeDailyPaidTime, rescheduleRequest.doNotChangeDailyPaidTime) &&
        Objects.equals(this.doNotChangeShiftStartTimes, rescheduleRequest.doNotChangeShiftStartTimes) &&
        Objects.equals(this.doNotChangeManuallyEditedShifts, rescheduleRequest.doNotChangeManuallyEditedShifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, agentIds, activityCodeIds, doNotChangeWeeklyPaidTime, doNotChangeDailyPaidTime, doNotChangeShiftStartTimes, doNotChangeManuallyEditedShifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RescheduleRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    doNotChangeWeeklyPaidTime: ").append(toIndentedString(doNotChangeWeeklyPaidTime)).append("\n");
    sb.append("    doNotChangeDailyPaidTime: ").append(toIndentedString(doNotChangeDailyPaidTime)).append("\n");
    sb.append("    doNotChangeShiftStartTimes: ").append(toIndentedString(doNotChangeShiftStartTimes)).append("\n");
    sb.append("    doNotChangeManuallyEditedShifts: ").append(toIndentedString(doNotChangeManuallyEditedShifts)).append("\n");
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

