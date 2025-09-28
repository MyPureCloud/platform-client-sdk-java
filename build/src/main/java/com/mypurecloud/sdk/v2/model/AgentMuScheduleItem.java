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
import com.mypurecloud.sdk.v2.model.AgentMuScheduleShift;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentMuScheduleItem
 */

public class AgentMuScheduleItem  implements Serializable {
  
  private UserReference agent = null;
  private List<AgentMuScheduleShift> shifts = null;
  private List<LocalDate> fullDayTimeOffMarkerDates = null;

  public AgentMuScheduleItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shifts = new ArrayList<AgentMuScheduleShift>();
      fullDayTimeOffMarkerDates = new ArrayList<LocalDate>();
    }
  }

  
  /**
   * The agent to whom this schedule applies. Note: selfUri will not be populated if retrieving result via downloadUrl
   **/
  public AgentMuScheduleItem agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent to whom this schedule applies. Note: selfUri will not be populated if retrieving result via downloadUrl")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }


  /**
   * The shift definitions for this agent schedule
   **/
  public AgentMuScheduleItem shifts(List<AgentMuScheduleShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift definitions for this agent schedule")
  @JsonProperty("shifts")
  public List<AgentMuScheduleShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<AgentMuScheduleShift> shifts) {
    this.shifts = shifts;
  }


  /**
   * The full day time off marker dates which apply to this agent schedule, interpreted in the time zone of the relevant business unit
   **/
  public AgentMuScheduleItem fullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The full day time off marker dates which apply to this agent schedule, interpreted in the time zone of the relevant business unit")
  @JsonProperty("fullDayTimeOffMarkerDates")
  public List<LocalDate> getFullDayTimeOffMarkerDates() {
    return fullDayTimeOffMarkerDates;
  }
  public void setFullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMuScheduleItem agentMuScheduleItem = (AgentMuScheduleItem) o;

    return Objects.equals(this.agent, agentMuScheduleItem.agent) &&
            Objects.equals(this.shifts, agentMuScheduleItem.shifts) &&
            Objects.equals(this.fullDayTimeOffMarkerDates, agentMuScheduleItem.fullDayTimeOffMarkerDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, shifts, fullDayTimeOffMarkerDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMuScheduleItem {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    fullDayTimeOffMarkerDates: ").append(toIndentedString(fullDayTimeOffMarkerDates)).append("\n");
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

