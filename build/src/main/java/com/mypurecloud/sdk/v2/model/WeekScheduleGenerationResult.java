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
import com.mypurecloud.sdk.v2.model.ScheduleGenerationWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WeekScheduleGenerationResult
 */

public class WeekScheduleGenerationResult  implements Serializable {
  
  private Boolean failed = null;
  private String runId = null;
  private List<ScheduleGenerationWarning> agentWarnings = new ArrayList<ScheduleGenerationWarning>();
  private Integer agentWarningCount = null;

  
  /**
   * Whether the schedule generation failed
   **/
  public WeekScheduleGenerationResult failed(Boolean failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule generation failed")
  @JsonProperty("failed")
  public Boolean getFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  
  /**
   * ID of the schedule run
   **/
  public WeekScheduleGenerationResult runId(String runId) {
    this.runId = runId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the schedule run")
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  
  /**
   * Warning messages from the schedule run. This will be available only when requesting information for a single week schedule
   **/
  public WeekScheduleGenerationResult agentWarnings(List<ScheduleGenerationWarning> agentWarnings) {
    this.agentWarnings = agentWarnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Warning messages from the schedule run. This will be available only when requesting information for a single week schedule")
  @JsonProperty("agentWarnings")
  public List<ScheduleGenerationWarning> getAgentWarnings() {
    return agentWarnings;
  }
  public void setAgentWarnings(List<ScheduleGenerationWarning> agentWarnings) {
    this.agentWarnings = agentWarnings;
  }

  
  /**
   * Count of warning messages from the schedule run. This will be available only when requesting multiple week schedules
   **/
  public WeekScheduleGenerationResult agentWarningCount(Integer agentWarningCount) {
    this.agentWarningCount = agentWarningCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of warning messages from the schedule run. This will be available only when requesting multiple week schedules")
  @JsonProperty("agentWarningCount")
  public Integer getAgentWarningCount() {
    return agentWarningCount;
  }
  public void setAgentWarningCount(Integer agentWarningCount) {
    this.agentWarningCount = agentWarningCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekScheduleGenerationResult weekScheduleGenerationResult = (WeekScheduleGenerationResult) o;
    return Objects.equals(this.failed, weekScheduleGenerationResult.failed) &&
        Objects.equals(this.runId, weekScheduleGenerationResult.runId) &&
        Objects.equals(this.agentWarnings, weekScheduleGenerationResult.agentWarnings) &&
        Objects.equals(this.agentWarningCount, weekScheduleGenerationResult.agentWarningCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, runId, agentWarnings, agentWarningCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekScheduleGenerationResult {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    agentWarnings: ").append(toIndentedString(agentWarnings)).append("\n");
    sb.append("    agentWarningCount: ").append(toIndentedString(agentWarningCount)).append("\n");
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

