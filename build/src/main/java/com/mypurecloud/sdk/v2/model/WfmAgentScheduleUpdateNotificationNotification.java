package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateNotificationNotificationShifts;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateNotificationNotificationUpdates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateNotificationNotification
 */

public class WfmAgentScheduleUpdateNotificationNotification  implements Serializable {
  
  private DocumentDataV2NotificationWorkspace user = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<WfmAgentScheduleUpdateNotificationNotificationShifts> shifts = new ArrayList<WfmAgentScheduleUpdateNotificationNotificationShifts>();
  private List<WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers> fullDayTimeOffMarkers = new ArrayList<WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers>();
  private List<WfmAgentScheduleUpdateNotificationNotificationUpdates> updates = new ArrayList<WfmAgentScheduleUpdateNotificationNotificationUpdates>();

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotification user(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationWorkspace getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotification startDate(Date startDate) {
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
  public WfmAgentScheduleUpdateNotificationNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotification shifts(List<WfmAgentScheduleUpdateNotificationNotificationShifts> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shifts")
  public List<WfmAgentScheduleUpdateNotificationNotificationShifts> getShifts() {
    return shifts;
  }
  public void setShifts(List<WfmAgentScheduleUpdateNotificationNotificationShifts> shifts) {
    this.shifts = shifts;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotification fullDayTimeOffMarkers(List<WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<WfmAgentScheduleUpdateNotificationNotificationFullDayTimeOffMarkers> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotification updates(List<WfmAgentScheduleUpdateNotificationNotificationUpdates> updates) {
    this.updates = updates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updates")
  public List<WfmAgentScheduleUpdateNotificationNotificationUpdates> getUpdates() {
    return updates;
  }
  public void setUpdates(List<WfmAgentScheduleUpdateNotificationNotificationUpdates> updates) {
    this.updates = updates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentScheduleUpdateNotificationNotification wfmAgentScheduleUpdateNotificationNotification = (WfmAgentScheduleUpdateNotificationNotification) o;
    return Objects.equals(this.user, wfmAgentScheduleUpdateNotificationNotification.user) &&
        Objects.equals(this.startDate, wfmAgentScheduleUpdateNotificationNotification.startDate) &&
        Objects.equals(this.endDate, wfmAgentScheduleUpdateNotificationNotification.endDate) &&
        Objects.equals(this.shifts, wfmAgentScheduleUpdateNotificationNotification.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, wfmAgentScheduleUpdateNotificationNotification.fullDayTimeOffMarkers) &&
        Objects.equals(this.updates, wfmAgentScheduleUpdateNotificationNotification.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startDate, endDate, shifts, fullDayTimeOffMarkers, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateNotificationNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkers: ").append(toIndentedString(fullDayTimeOffMarkers)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

