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
import com.mypurecloud.sdk.v2.model.CoachingSlot;
import com.mypurecloud.sdk.v2.model.UserAvailableTimes;
import com.mypurecloud.sdk.v2.model.WfmScheduleActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CoachingSlotsResponse
 */

public class CoachingSlotsResponse  implements Serializable {
  
  private List<CoachingSlot> suggestedSlots = new ArrayList<CoachingSlot>();
  private List<UserAvailableTimes> attendeeSchedules = new ArrayList<UserAvailableTimes>();
  private List<UserAvailableTimes> facilitatorSchedules = new ArrayList<UserAvailableTimes>();
  private List<WfmScheduleActivity> wfmScheduleActivities = new ArrayList<WfmScheduleActivity>();

  
  @ApiModelProperty(example = "null", value = "List of slots where coaching appointment can be scheduled")
  @JsonProperty("suggestedSlots")
  public List<CoachingSlot> getSuggestedSlots() {
    return suggestedSlots;
  }

  
  @ApiModelProperty(example = "null", value = "Periods of availability for attendees to schedule coaching appointment")
  @JsonProperty("attendeeSchedules")
  public List<UserAvailableTimes> getAttendeeSchedules() {
    return attendeeSchedules;
  }

  
  @ApiModelProperty(example = "null", value = "Periods of availability for facilitators to schedule coaching appointment")
  @JsonProperty("facilitatorSchedules")
  public List<UserAvailableTimes> getFacilitatorSchedules() {
    return facilitatorSchedules;
  }

  
  @ApiModelProperty(example = "null", value = "Detailed data for WFM scheduled activities")
  @JsonProperty("wfmScheduleActivities")
  public List<WfmScheduleActivity> getWfmScheduleActivities() {
    return wfmScheduleActivities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingSlotsResponse coachingSlotsResponse = (CoachingSlotsResponse) o;
    return Objects.equals(this.suggestedSlots, coachingSlotsResponse.suggestedSlots) &&
        Objects.equals(this.attendeeSchedules, coachingSlotsResponse.attendeeSchedules) &&
        Objects.equals(this.facilitatorSchedules, coachingSlotsResponse.facilitatorSchedules) &&
        Objects.equals(this.wfmScheduleActivities, coachingSlotsResponse.wfmScheduleActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedSlots, attendeeSchedules, facilitatorSchedules, wfmScheduleActivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingSlotsResponse {\n");
    
    sb.append("    suggestedSlots: ").append(toIndentedString(suggestedSlots)).append("\n");
    sb.append("    attendeeSchedules: ").append(toIndentedString(attendeeSchedules)).append("\n");
    sb.append("    facilitatorSchedules: ").append(toIndentedString(facilitatorSchedules)).append("\n");
    sb.append("    wfmScheduleActivities: ").append(toIndentedString(wfmScheduleActivities)).append("\n");
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

