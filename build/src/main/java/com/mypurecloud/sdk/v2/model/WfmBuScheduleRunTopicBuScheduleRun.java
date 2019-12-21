package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicBuScheduleReference;
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicBuScheduleRun
 */

public class WfmBuScheduleRunTopicBuScheduleRun  implements Serializable {
  
  private String id = null;
  private Integer weekCount = null;
  private WfmBuScheduleRunTopicBuScheduleReference schedule = null;
  private WfmBuScheduleRunTopicUserReference schedulingCanceledByUser = null;
  private String schedulingCompletedTime = null;
  private Integer messageCount = null;

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun id(String id) {
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
  public WfmBuScheduleRunTopicBuScheduleRun weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedule(WfmBuScheduleRunTopicBuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WfmBuScheduleRunTopicBuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(WfmBuScheduleRunTopicBuScheduleReference schedule) {
    this.schedule = schedule;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedulingCanceledByUser(WfmBuScheduleRunTopicUserReference schedulingCanceledByUser) {
    this.schedulingCanceledByUser = schedulingCanceledByUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedulingCanceledByUser")
  public WfmBuScheduleRunTopicUserReference getSchedulingCanceledByUser() {
    return schedulingCanceledByUser;
  }
  public void setSchedulingCanceledByUser(WfmBuScheduleRunTopicUserReference schedulingCanceledByUser) {
    this.schedulingCanceledByUser = schedulingCanceledByUser;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun schedulingCompletedTime(String schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedulingCompletedTime")
  public String getSchedulingCompletedTime() {
    return schedulingCompletedTime;
  }
  public void setSchedulingCompletedTime(String schedulingCompletedTime) {
    this.schedulingCompletedTime = schedulingCompletedTime;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleRun messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageCount")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicBuScheduleRun wfmBuScheduleRunTopicBuScheduleRun = (WfmBuScheduleRunTopicBuScheduleRun) o;
    return Objects.equals(this.id, wfmBuScheduleRunTopicBuScheduleRun.id) &&
        Objects.equals(this.weekCount, wfmBuScheduleRunTopicBuScheduleRun.weekCount) &&
        Objects.equals(this.schedule, wfmBuScheduleRunTopicBuScheduleRun.schedule) &&
        Objects.equals(this.schedulingCanceledByUser, wfmBuScheduleRunTopicBuScheduleRun.schedulingCanceledByUser) &&
        Objects.equals(this.schedulingCompletedTime, wfmBuScheduleRunTopicBuScheduleRun.schedulingCompletedTime) &&
        Objects.equals(this.messageCount, wfmBuScheduleRunTopicBuScheduleRun.messageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekCount, schedule, schedulingCanceledByUser, schedulingCompletedTime, messageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicBuScheduleRun {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedulingCanceledByUser: ").append(toIndentedString(schedulingCanceledByUser)).append("\n");
    sb.append("    schedulingCompletedTime: ").append(toIndentedString(schedulingCompletedTime)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
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

