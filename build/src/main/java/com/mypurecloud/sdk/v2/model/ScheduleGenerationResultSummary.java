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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScheduleGenerationResultSummary
 */

public class ScheduleGenerationResultSummary  implements Serializable {
  
  private Boolean failed = null;
  private String runId = null;
  private Integer messageCount = null;

  
  /**
   * Whether the schedule generation run failed
   **/
  public ScheduleGenerationResultSummary failed(Boolean failed) {
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
  public ScheduleGenerationResultSummary runId(String runId) {
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
  public ScheduleGenerationResultSummary messageCount(Integer messageCount) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGenerationResultSummary scheduleGenerationResultSummary = (ScheduleGenerationResultSummary) o;
    return Objects.equals(this.failed, scheduleGenerationResultSummary.failed) &&
        Objects.equals(this.runId, scheduleGenerationResultSummary.runId) &&
        Objects.equals(this.messageCount, scheduleGenerationResultSummary.messageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, runId, messageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenerationResultSummary {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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

