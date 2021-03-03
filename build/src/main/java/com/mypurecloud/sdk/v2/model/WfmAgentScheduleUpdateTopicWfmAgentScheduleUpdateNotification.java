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
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicUserReference;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicWfmScheduleShift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification
 */

public class WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification  implements Serializable {
  
  private WfmAgentScheduleUpdateTopicUserReference user = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<WfmAgentScheduleUpdateTopicWfmScheduleShift> shifts = new ArrayList<WfmAgentScheduleUpdateTopicWfmScheduleShift>();
  private List<WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker> fullDayTimeOffMarkers = new ArrayList<WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker>();
  private List<WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate> updates = new ArrayList<WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate>();

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification user(WfmAgentScheduleUpdateTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmAgentScheduleUpdateTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmAgentScheduleUpdateTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification startDate(Date startDate) {
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
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification endDate(Date endDate) {
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
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification shifts(List<WfmAgentScheduleUpdateTopicWfmScheduleShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shifts")
  public List<WfmAgentScheduleUpdateTopicWfmScheduleShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<WfmAgentScheduleUpdateTopicWfmScheduleShift> shifts) {
    this.shifts = shifts;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification fullDayTimeOffMarkers(List<WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayTimeOffMarkers")
  public List<WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker> getFullDayTimeOffMarkers() {
    return fullDayTimeOffMarkers;
  }
  public void setFullDayTimeOffMarkers(List<WfmAgentScheduleUpdateTopicWfmFullDayTimeOffMarker> fullDayTimeOffMarkers) {
    this.fullDayTimeOffMarkers = fullDayTimeOffMarkers;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification updates(List<WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate> updates) {
    this.updates = updates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updates")
  public List<WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate> getUpdates() {
    return updates;
  }
  public void setUpdates(List<WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate> updates) {
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
    WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification = (WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification) o;
    return Objects.equals(this.user, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.user) &&
        Objects.equals(this.startDate, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.startDate) &&
        Objects.equals(this.endDate, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.endDate) &&
        Objects.equals(this.shifts, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.shifts) &&
        Objects.equals(this.fullDayTimeOffMarkers, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.fullDayTimeOffMarkers) &&
        Objects.equals(this.updates, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startDate, endDate, shifts, fullDayTimeOffMarkers, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdateNotification {\n");
    
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

