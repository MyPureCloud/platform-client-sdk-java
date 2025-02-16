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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LearningScheduleSlotsQueryRequest
 */

public class LearningScheduleSlotsQueryRequest  implements Serializable {
  
  private String interval = null;
  private Integer lengthInMinutes = null;
  private List<String> userIds = new ArrayList<String>();
  private String interruptibleAssignmentId = null;

  
  /**
   * Range of time to get slots for scheduling learning activities. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public LearningScheduleSlotsQueryRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Range of time to get slots for scheduling learning activities. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * The duration of Learning Assignment to schedule in 15 minutes granularity
   **/
  public LearningScheduleSlotsQueryRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration of Learning Assignment to schedule in 15 minutes granularity")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * The user IDs for which to fetch schedules. Must be only 1.
   **/
  public LearningScheduleSlotsQueryRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user IDs for which to fetch schedules. Must be only 1.")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Assignment ID to exclude from consideration when determining blocked slots
   **/
  public LearningScheduleSlotsQueryRequest interruptibleAssignmentId(String interruptibleAssignmentId) {
    this.interruptibleAssignmentId = interruptibleAssignmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assignment ID to exclude from consideration when determining blocked slots")
  @JsonProperty("interruptibleAssignmentId")
  public String getInterruptibleAssignmentId() {
    return interruptibleAssignmentId;
  }
  public void setInterruptibleAssignmentId(String interruptibleAssignmentId) {
    this.interruptibleAssignmentId = interruptibleAssignmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningScheduleSlotsQueryRequest learningScheduleSlotsQueryRequest = (LearningScheduleSlotsQueryRequest) o;

    return Objects.equals(this.interval, learningScheduleSlotsQueryRequest.interval) &&
            Objects.equals(this.lengthInMinutes, learningScheduleSlotsQueryRequest.lengthInMinutes) &&
            Objects.equals(this.userIds, learningScheduleSlotsQueryRequest.userIds) &&
            Objects.equals(this.interruptibleAssignmentId, learningScheduleSlotsQueryRequest.interruptibleAssignmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, lengthInMinutes, userIds, interruptibleAssignmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningScheduleSlotsQueryRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    interruptibleAssignmentId: ").append(toIndentedString(interruptibleAssignmentId)).append("\n");
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

