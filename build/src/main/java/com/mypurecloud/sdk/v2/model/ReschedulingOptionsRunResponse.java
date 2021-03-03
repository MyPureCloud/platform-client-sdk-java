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
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import com.mypurecloud.sdk.v2.model.ReschedulingManagementUnitResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ReschedulingOptionsRunResponse
 */

public class ReschedulingOptionsRunResponse  implements Serializable {
  
  private BuScheduleReference existingSchedule = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<ReschedulingManagementUnitResponse> managementUnits = new ArrayList<ReschedulingManagementUnitResponse>();
  private Integer agentCount = null;
  private List<String> activityCodeIds = new ArrayList<String>();
  private Boolean doNotChangeWeeklyPaidTime = null;
  private Boolean doNotChangeDailyPaidTime = null;
  private Boolean doNotChangeShiftStartTimes = null;
  private Boolean doNotChangeManuallyEditedShifts = null;

  
  /**
   * The existing schedule to which this reschedule run applies
   **/
  public ReschedulingOptionsRunResponse existingSchedule(BuScheduleReference existingSchedule) {
    this.existingSchedule = existingSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The existing schedule to which this reschedule run applies")
  @JsonProperty("existingSchedule")
  public BuScheduleReference getExistingSchedule() {
    return existingSchedule;
  }
  public void setExistingSchedule(BuScheduleReference existingSchedule) {
    this.existingSchedule = existingSchedule;
  }

  
  /**
   * The start date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReschedulingOptionsRunResponse startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReschedulingOptionsRunResponse endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of the period to reschedule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Per-management unit rescheduling options
   **/
  public ReschedulingOptionsRunResponse managementUnits(List<ReschedulingManagementUnitResponse> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Per-management unit rescheduling options")
  @JsonProperty("managementUnits")
  public List<ReschedulingManagementUnitResponse> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<ReschedulingManagementUnitResponse> managementUnits) {
    this.managementUnits = managementUnits;
  }

  
  /**
   * The number of agents to be considered in the reschedule
   **/
  public ReschedulingOptionsRunResponse agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of agents to be considered in the reschedule")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  
  /**
   * The IDs of the activity codes being considered for reschedule
   **/
  public ReschedulingOptionsRunResponse activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the activity codes being considered for reschedule")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }

  
  /**
   * Whether weekly paid time is allowed to be changed
   **/
  public ReschedulingOptionsRunResponse doNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether weekly paid time is allowed to be changed")
  @JsonProperty("doNotChangeWeeklyPaidTime")
  public Boolean getDoNotChangeWeeklyPaidTime() {
    return doNotChangeWeeklyPaidTime;
  }
  public void setDoNotChangeWeeklyPaidTime(Boolean doNotChangeWeeklyPaidTime) {
    this.doNotChangeWeeklyPaidTime = doNotChangeWeeklyPaidTime;
  }

  
  /**
   * Whether daily paid time is allowed to be changed
   **/
  public ReschedulingOptionsRunResponse doNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether daily paid time is allowed to be changed")
  @JsonProperty("doNotChangeDailyPaidTime")
  public Boolean getDoNotChangeDailyPaidTime() {
    return doNotChangeDailyPaidTime;
  }
  public void setDoNotChangeDailyPaidTime(Boolean doNotChangeDailyPaidTime) {
    this.doNotChangeDailyPaidTime = doNotChangeDailyPaidTime;
  }

  
  /**
   * Whether shift start times are allowed to be changed
   **/
  public ReschedulingOptionsRunResponse doNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether shift start times are allowed to be changed")
  @JsonProperty("doNotChangeShiftStartTimes")
  public Boolean getDoNotChangeShiftStartTimes() {
    return doNotChangeShiftStartTimes;
  }
  public void setDoNotChangeShiftStartTimes(Boolean doNotChangeShiftStartTimes) {
    this.doNotChangeShiftStartTimes = doNotChangeShiftStartTimes;
  }

  
  /**
   * Whether manually edited shifts are allowed to be changed
   **/
  public ReschedulingOptionsRunResponse doNotChangeManuallyEditedShifts(Boolean doNotChangeManuallyEditedShifts) {
    this.doNotChangeManuallyEditedShifts = doNotChangeManuallyEditedShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether manually edited shifts are allowed to be changed")
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
    ReschedulingOptionsRunResponse reschedulingOptionsRunResponse = (ReschedulingOptionsRunResponse) o;
    return Objects.equals(this.existingSchedule, reschedulingOptionsRunResponse.existingSchedule) &&
        Objects.equals(this.startDate, reschedulingOptionsRunResponse.startDate) &&
        Objects.equals(this.endDate, reschedulingOptionsRunResponse.endDate) &&
        Objects.equals(this.managementUnits, reschedulingOptionsRunResponse.managementUnits) &&
        Objects.equals(this.agentCount, reschedulingOptionsRunResponse.agentCount) &&
        Objects.equals(this.activityCodeIds, reschedulingOptionsRunResponse.activityCodeIds) &&
        Objects.equals(this.doNotChangeWeeklyPaidTime, reschedulingOptionsRunResponse.doNotChangeWeeklyPaidTime) &&
        Objects.equals(this.doNotChangeDailyPaidTime, reschedulingOptionsRunResponse.doNotChangeDailyPaidTime) &&
        Objects.equals(this.doNotChangeShiftStartTimes, reschedulingOptionsRunResponse.doNotChangeShiftStartTimes) &&
        Objects.equals(this.doNotChangeManuallyEditedShifts, reschedulingOptionsRunResponse.doNotChangeManuallyEditedShifts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingSchedule, startDate, endDate, managementUnits, agentCount, activityCodeIds, doNotChangeWeeklyPaidTime, doNotChangeDailyPaidTime, doNotChangeShiftStartTimes, doNotChangeManuallyEditedShifts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReschedulingOptionsRunResponse {\n");
    
    sb.append("    existingSchedule: ").append(toIndentedString(existingSchedule)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
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

