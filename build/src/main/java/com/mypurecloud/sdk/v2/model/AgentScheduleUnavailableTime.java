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
import com.mypurecloud.sdk.v2.model.UnavailableTimesTimeSpan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentScheduleUnavailableTime
 */

public class AgentScheduleUnavailableTime  implements Serializable {
  
  private UnavailableTimesTimeSpan timeSpan = null;
  private String notes = null;

  public AgentScheduleUnavailableTime() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Exact date, time and length of the unavailability time span
   **/
  public AgentScheduleUnavailableTime timeSpan(UnavailableTimesTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Exact date, time and length of the unavailability time span")
  @JsonProperty("timeSpan")
  public UnavailableTimesTimeSpan getTimeSpan() {
    return timeSpan;
  }
  public void setTimeSpan(UnavailableTimesTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  /**
   * Comments explaining the unavailability time span
   **/
  public AgentScheduleUnavailableTime notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Comments explaining the unavailability time span")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentScheduleUnavailableTime agentScheduleUnavailableTime = (AgentScheduleUnavailableTime) o;

    return Objects.equals(this.timeSpan, agentScheduleUnavailableTime.timeSpan) &&
            Objects.equals(this.notes, agentScheduleUnavailableTime.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSpan, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleUnavailableTime {\n");
    
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

