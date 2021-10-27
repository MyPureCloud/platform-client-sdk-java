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
import com.mypurecloud.sdk.v2.model.ScheduleGenerationMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleGenerationResult
 */

public class ScheduleGenerationResult  implements Serializable {
  
  private Boolean failed = null;
  private String runId = null;
  private Integer messageCount = null;
  private List<ScheduleGenerationMessage> messages = new ArrayList<ScheduleGenerationMessage>();

  
  /**
   * Whether the schedule generation run failed
   **/
  public ScheduleGenerationResult failed(Boolean failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule generation run failed")
  @JsonProperty("failed")
  public Boolean getFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  
  /**
   * The ID of the schedule generation run. Reference this when requesting support
   **/
  public ScheduleGenerationResult runId(String runId) {
    this.runId = runId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the schedule generation run. Reference this when requesting support")
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  
  /**
   * The number of schedule generation messages for this schedule generation run
   **/
  public ScheduleGenerationResult messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of schedule generation messages for this schedule generation run")
  @JsonProperty("messageCount")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  
  /**
   * User facing messages related to the schedule generation run
   **/
  public ScheduleGenerationResult messages(List<ScheduleGenerationMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User facing messages related to the schedule generation run")
  @JsonProperty("messages")
  public List<ScheduleGenerationMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ScheduleGenerationMessage> messages) {
    this.messages = messages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGenerationResult scheduleGenerationResult = (ScheduleGenerationResult) o;
    return Objects.equals(this.failed, scheduleGenerationResult.failed) &&
        Objects.equals(this.runId, scheduleGenerationResult.runId) &&
        Objects.equals(this.messageCount, scheduleGenerationResult.messageCount) &&
        Objects.equals(this.messages, scheduleGenerationResult.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, runId, messageCount, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenerationResult {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

