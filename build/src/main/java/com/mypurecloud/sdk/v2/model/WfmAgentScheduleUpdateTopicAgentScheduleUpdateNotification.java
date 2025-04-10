package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate;
import com.mypurecloud.sdk.v2.model.WfmAgentScheduleUpdateTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification
 */

public class WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification  implements Serializable {
  
  private WfmAgentScheduleUpdateTopicUserReference user = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate> updates = null;

  public WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      updates = new ArrayList<WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate>();
    }
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification user(WfmAgentScheduleUpdateTopicUserReference user) {
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
  public WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification startDate(Date startDate) {
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
  public WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification endDate(Date endDate) {
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
  public WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification updates(List<WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate> updates) {
    this.updates = updates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updates")
  public List<WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate> getUpdates() {
    return updates;
  }
  public void setUpdates(List<WfmAgentScheduleUpdateTopicAgentScheduleShiftUpdate> updates) {
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
    WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification wfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification = (WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification) o;

    return Objects.equals(this.user, wfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification.user) &&
            Objects.equals(this.startDate, wfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification.startDate) &&
            Objects.equals(this.endDate, wfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification.endDate) &&
            Objects.equals(this.updates, wfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startDate, endDate, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateTopicAgentScheduleUpdateNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

