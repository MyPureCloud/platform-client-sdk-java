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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleHistoryDeletedChange
 */

public class BuAgentScheduleHistoryDeletedChange  implements Serializable {
  
  private List<String> shiftIds = new ArrayList<String>();
  private List<LocalDate> fullDayTimeOffMarkerDates = new ArrayList<LocalDate>();
  private Boolean agentSchedule = null;

  
  /**
   * The IDs of deleted shifts
   **/
  public BuAgentScheduleHistoryDeletedChange shiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of deleted shifts")
  @JsonProperty("shiftIds")
  public List<String> getShiftIds() {
    return shiftIds;
  }
  public void setShiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
  }

  
  /**
   * The dates of any deleted full day time off markers
   **/
  public BuAgentScheduleHistoryDeletedChange fullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dates of any deleted full day time off markers")
  @JsonProperty("fullDayTimeOffMarkerDates")
  public List<LocalDate> getFullDayTimeOffMarkerDates() {
    return fullDayTimeOffMarkerDates;
  }
  public void setFullDayTimeOffMarkerDates(List<LocalDate> fullDayTimeOffMarkerDates) {
    this.fullDayTimeOffMarkerDates = fullDayTimeOffMarkerDates;
  }

  
  /**
   * Whether the entire agent schedule was deleted
   **/
  public BuAgentScheduleHistoryDeletedChange agentSchedule(Boolean agentSchedule) {
    this.agentSchedule = agentSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the entire agent schedule was deleted")
  @JsonProperty("agentSchedule")
  public Boolean getAgentSchedule() {
    return agentSchedule;
  }
  public void setAgentSchedule(Boolean agentSchedule) {
    this.agentSchedule = agentSchedule;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleHistoryDeletedChange buAgentScheduleHistoryDeletedChange = (BuAgentScheduleHistoryDeletedChange) o;
    return Objects.equals(this.shiftIds, buAgentScheduleHistoryDeletedChange.shiftIds) &&
        Objects.equals(this.fullDayTimeOffMarkerDates, buAgentScheduleHistoryDeletedChange.fullDayTimeOffMarkerDates) &&
        Objects.equals(this.agentSchedule, buAgentScheduleHistoryDeletedChange.agentSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftIds, fullDayTimeOffMarkerDates, agentSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleHistoryDeletedChange {\n");
    
    sb.append("    shiftIds: ").append(toIndentedString(shiftIds)).append("\n");
    sb.append("    fullDayTimeOffMarkerDates: ").append(toIndentedString(fullDayTimeOffMarkerDates)).append("\n");
    sb.append("    agentSchedule: ").append(toIndentedString(agentSchedule)).append("\n");
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

