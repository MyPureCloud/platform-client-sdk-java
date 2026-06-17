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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentScheduleBiddingPreferencePriority
 */

public class AgentScheduleBiddingPreferencePriority  implements Serializable {
  
  private String scheduleSetId = null;
  private Integer priority = null;

  public AgentScheduleBiddingPreferencePriority() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentScheduleBiddingPreferencePriority(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the schedule set that belongs to agent's bid group
   **/
  public AgentScheduleBiddingPreferencePriority scheduleSetId(String scheduleSetId) {
    this.scheduleSetId = scheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule set that belongs to agent's bid group")
  @JsonProperty("scheduleSetId")
  public String getScheduleSetId() {
    return scheduleSetId;
  }
  public void setScheduleSetId(String scheduleSetId) {
    this.scheduleSetId = scheduleSetId;
  }


  /**
   * The agent's priority for this schedule set. Lower numbers indicate higher priority, with 1 being the highest priority. Minimum value is 1. Null if priority is not set for the schedule set
   **/
  public AgentScheduleBiddingPreferencePriority priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent's priority for this schedule set. Lower numbers indicate higher priority, with 1 being the highest priority. Minimum value is 1. Null if priority is not set for the schedule set")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentScheduleBiddingPreferencePriority agentScheduleBiddingPreferencePriority = (AgentScheduleBiddingPreferencePriority) o;

    return Objects.equals(this.scheduleSetId, agentScheduleBiddingPreferencePriority.scheduleSetId) &&
            Objects.equals(this.priority, agentScheduleBiddingPreferencePriority.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleSetId, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleBiddingPreferencePriority {\n");
    
    sb.append("    scheduleSetId: ").append(toIndentedString(scheduleSetId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

