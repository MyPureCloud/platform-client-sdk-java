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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuRescheduleRequest
 */

public class BuRescheduleRequest  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private List<String> agentIds = new ArrayList<String>();
  private List<String> activityCodeIds = new ArrayList<String>();
  private List<String> managementUnitIds = new ArrayList<String>();
  private Boolean doNotChangeWeeklyPaidTime = null;
  private Boolean doNotChangeDailyPaidTime = null;
  private Boolean doNotChangeShiftStartTimes = null;
  private Boolean doNotChangeManuallyEditedShifts = null;

  
  /**
   * The start of the range to reschedule.  Defaults to the beginning of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuRescheduleRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start of the range to reschedule.  Defaults to the beginning of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end of the range to reschedule.  Defaults the the end of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuRescheduleRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end of the range to reschedule.  Defaults the the end of the schedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The IDs of the agents to consider for rescheduling.  Omit to consider all agents in the specified management units.Agents not in the specified management units will be ignored
   **/
  public BuRescheduleRequest agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents to consider for rescheduling.  Omit to consider all agents in the specified management units.Agents not in the specified management units will be ignored")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }

  
  /**
   * The IDs of the activity codes to consider for rescheduling.  Omit to consider all activity codes
   **/
  public BuRescheduleRequest activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the activity codes to consider for rescheduling.  Omit to consider all activity codes")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }

  
  /**
   * The IDs of the management units to reschedule
   **/
  public BuRescheduleRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the management units to reschedule")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }

  
  /**
   * Instructs the scheduler whether it is allowed to change weekly paid time
   **/
  public BuRescheduleRequest doNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Instructs the scheduler whether it is allowed to change weekly paid time")
  @JsonProperty("doNotChangeWeeklyPaidTime")
  public Boolean getDoNotChangeWeeklyPaidTime() {
    return doNotChangeWeeklyPaidTime;
  }
  public void setDoNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
  }

  
  /**
   * Instructs the scheduler whether it is allowed to change daily paid time
   **/
  public BuRescheduleRequest doNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Instructs the scheduler whether it is allowed to change daily paid time")
  @JsonProperty("doNotChangeDailyPaidTime")
  public Boolean getDoNotChangeDailyPaidTime() {
    return doNotChangeDailyPaidTime;
  }
  public void setDoNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
  }

  
  /**
   * Instructs the scheduler whether it is allowed to change shift start times
   **/
  public BuRescheduleRequest doNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Instructs the scheduler whether it is allowed to change shift start times")
  @JsonProperty("doNotChangeShiftStartTimes")
  public Boolean getDoNotChangeShiftStartTimes() {
    return doNotChangeShiftStartTimes;
  }
  public void setDoNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
  }

  
  /**
   * Instructs the scheduler whether it is allowed to change manually edited shifts
   **/
  public BuRescheduleRequest doNotChangeManuallyEditedShifts(Boolean doNotChangeManuallyEditedShifts) {
    this.doNotChangeManuallyEditedShifts = doNotChangeManuallyEditedShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Instructs the scheduler whether it is allowed to change manually edited shifts")
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
    BuRescheduleRequest buRescheduleRequest = (BuRescheduleRequest) o;
    return Objects.equals(this.startDate, buRescheduleRequest.startDate) &&
        Objects.equals(this.endDate, buRescheduleRequest.endDate) &&
        Objects.equals(this.agentIds, buRescheduleRequest.agentIds) &&
        Objects.equals(this.activityCodeIds, buRescheduleRequest.activityCodeIds) &&
        Objects.equals(this.managementUnitIds, buRescheduleRequest.managementUnitIds) &&
        Objects.equals(this.doNotChangeWeeklyPaidTime, buRescheduleRequest.doNotChangeWeeklyPaidTime) &&
        Objects.equals(this.doNotChangeDailyPaidTime, buRescheduleRequest.doNotChangeDailyPaidTime) &&
        Objects.equals(this.doNotChangeShiftStartTimes, buRescheduleRequest.doNotChangeShiftStartTimes) &&
        Objects.equals(this.doNotChangeManuallyEditedShifts, buRescheduleRequest.doNotChangeManuallyEditedShifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, agentIds, activityCodeIds, managementUnitIds, doNotChangeWeeklyPaidTime, doNotChangeDailyPaidTime, doNotChangeShiftStartTimes, doNotChangeManuallyEditedShifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuRescheduleRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
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

