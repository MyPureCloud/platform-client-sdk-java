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
import com.mypurecloud.sdk.v2.model.WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot
 */

public class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot  implements Serializable {
  
  private String dateStart = null;
  private WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule schedule = null;

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot dateStart(String dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateStart")
  public String getDateStart() {
    return dateStart;
  }
  public void setDateStart(String dateStart) {
    this.dateStart = dateStart;
  }


  /**
   **/
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot schedule(WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule getSchedule() {
    return schedule;
  }
  public void setSchedule(WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlotSchedule schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot = (WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot) o;

    return Objects.equals(this.dateStart, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot.dateStart) &&
            Objects.equals(this.schedule, wemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingScheduleSlotJobCompleteTopicCoachingScheduleSlotJobResultsSlot {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

