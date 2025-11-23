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
 * AgentAdherenceScheduledActivity
 */

public class AgentAdherenceScheduledActivity  implements Serializable {
  
  private String activityCodeId = null;
  private Integer startOffsetSeconds = null;
  private Integer endOffsetSeconds = null;

  public AgentAdherenceScheduledActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the activity code from the schedule
   **/
  public AgentAdherenceScheduledActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code from the schedule")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Start offset in seconds relative to query start time
   **/
  public AgentAdherenceScheduledActivity startOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start offset in seconds relative to query start time")
  @JsonProperty("startOffsetSeconds")
  public Integer getStartOffsetSeconds() {
    return startOffsetSeconds;
  }
  public void setStartOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
  }


  /**
   * End offset in seconds relative to query start time
   **/
  public AgentAdherenceScheduledActivity endOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End offset in seconds relative to query start time")
  @JsonProperty("endOffsetSeconds")
  public Integer getEndOffsetSeconds() {
    return endOffsetSeconds;
  }
  public void setEndOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdherenceScheduledActivity agentAdherenceScheduledActivity = (AgentAdherenceScheduledActivity) o;

    return Objects.equals(this.activityCodeId, agentAdherenceScheduledActivity.activityCodeId) &&
            Objects.equals(this.startOffsetSeconds, agentAdherenceScheduledActivity.startOffsetSeconds) &&
            Objects.equals(this.endOffsetSeconds, agentAdherenceScheduledActivity.endOffsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, startOffsetSeconds, endOffsetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdherenceScheduledActivity {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    startOffsetSeconds: ").append(toIndentedString(startOffsetSeconds)).append("\n");
    sb.append("    endOffsetSeconds: ").append(toIndentedString(endOffsetSeconds)).append("\n");
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

