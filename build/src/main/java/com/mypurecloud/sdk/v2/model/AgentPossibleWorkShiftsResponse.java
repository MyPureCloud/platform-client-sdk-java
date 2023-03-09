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
import com.mypurecloud.sdk.v2.model.PossibleWorkShiftsForWeek;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentPossibleWorkShiftsResponse
 */

public class AgentPossibleWorkShiftsResponse  implements Serializable {
  
  private LocalDate weekStartDate = null;
  private List<Integer> pattern = new ArrayList<Integer>();
  private List<PossibleWorkShiftsForWeek> weeklyPossibleWorkShifts = new ArrayList<PossibleWorkShiftsForWeek>();
  private Integer schedulerIntervalLengthMinutes = null;
  private String timeZone = null;

  
  /**
   * Start date of requested effective work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentPossibleWorkShiftsResponse weekStartDate(LocalDate weekStartDate) {
    this.weekStartDate = weekStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of requested effective work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekStartDate")
  public LocalDate getWeekStartDate() {
    return weekStartDate;
  }
  public void setWeekStartDate(LocalDate weekStartDate) {
    this.weekStartDate = weekStartDate;
  }


  /**
   * Each element is the ID of an effective work plan for a specific week
   **/
  public AgentPossibleWorkShiftsResponse pattern(List<Integer> pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Each element is the ID of an effective work plan for a specific week")
  @JsonProperty("pattern")
  public List<Integer> getPattern() {
    return pattern;
  }
  public void setPattern(List<Integer> pattern) {
    this.pattern = pattern;
  }


  /**
   * Each element is a weekly effective work plan that can be used for multiple weeks
   **/
  public AgentPossibleWorkShiftsResponse weeklyPossibleWorkShifts(List<PossibleWorkShiftsForWeek> weeklyPossibleWorkShifts) {
    this.weeklyPossibleWorkShifts = weeklyPossibleWorkShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Each element is a weekly effective work plan that can be used for multiple weeks")
  @JsonProperty("weeklyPossibleWorkShifts")
  public List<PossibleWorkShiftsForWeek> getWeeklyPossibleWorkShifts() {
    return weeklyPossibleWorkShifts;
  }
  public void setWeeklyPossibleWorkShifts(List<PossibleWorkShiftsForWeek> weeklyPossibleWorkShifts) {
    this.weeklyPossibleWorkShifts = weeklyPossibleWorkShifts;
  }


  /**
   * Number of minutes in each interval in the intervalScheduleProbabilities
   **/
  public AgentPossibleWorkShiftsResponse schedulerIntervalLengthMinutes(Integer schedulerIntervalLengthMinutes) {
    this.schedulerIntervalLengthMinutes = schedulerIntervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of minutes in each interval in the intervalScheduleProbabilities")
  @JsonProperty("schedulerIntervalLengthMinutes")
  public Integer getSchedulerIntervalLengthMinutes() {
    return schedulerIntervalLengthMinutes;
  }
  public void setSchedulerIntervalLengthMinutes(Integer schedulerIntervalLengthMinutes) {
    this.schedulerIntervalLengthMinutes = schedulerIntervalLengthMinutes;
  }


  /**
   * The time zone of the business unit
   **/
  public AgentPossibleWorkShiftsResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone of the business unit")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentPossibleWorkShiftsResponse agentPossibleWorkShiftsResponse = (AgentPossibleWorkShiftsResponse) o;

    return Objects.equals(this.weekStartDate, agentPossibleWorkShiftsResponse.weekStartDate) &&
            Objects.equals(this.pattern, agentPossibleWorkShiftsResponse.pattern) &&
            Objects.equals(this.weeklyPossibleWorkShifts, agentPossibleWorkShiftsResponse.weeklyPossibleWorkShifts) &&
            Objects.equals(this.schedulerIntervalLengthMinutes, agentPossibleWorkShiftsResponse.schedulerIntervalLengthMinutes) &&
            Objects.equals(this.timeZone, agentPossibleWorkShiftsResponse.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekStartDate, pattern, weeklyPossibleWorkShifts, schedulerIntervalLengthMinutes, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentPossibleWorkShiftsResponse {\n");
    
    sb.append("    weekStartDate: ").append(toIndentedString(weekStartDate)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    weeklyPossibleWorkShifts: ").append(toIndentedString(weeklyPossibleWorkShifts)).append("\n");
    sb.append("    schedulerIntervalLengthMinutes: ").append(toIndentedString(schedulerIntervalLengthMinutes)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

