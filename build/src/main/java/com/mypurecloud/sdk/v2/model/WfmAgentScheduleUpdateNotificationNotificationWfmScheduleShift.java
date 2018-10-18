package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateNotificationNotificationActivities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift
 */

public class WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift  implements Serializable {
  
  private Date startDate = null;
  private Integer lengthInMinutes = null;
  private List<WfmAgentScheduleUpdateNotificationNotificationActivities> activities = new ArrayList<WfmAgentScheduleUpdateNotificationNotificationActivities>();

  
  /**
   **/
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift startDate(Date startDate) {
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
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift lengthInMinutes(Integer lengthInMinutes) {
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
  public WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift activities(List<WfmAgentScheduleUpdateNotificationNotificationActivities> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activities")
  public List<WfmAgentScheduleUpdateNotificationNotificationActivities> getActivities() {
    return activities;
  }
  public void setActivities(List<WfmAgentScheduleUpdateNotificationNotificationActivities> activities) {
    this.activities = activities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift wfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift = (WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift) o;
    return Objects.equals(this.startDate, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift.startDate) &&
        Objects.equals(this.lengthInMinutes, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift.lengthInMinutes) &&
        Objects.equals(this.activities, wfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, lengthInMinutes, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateNotificationNotificationWfmScheduleShift {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

