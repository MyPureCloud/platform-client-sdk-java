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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CoachingSlotsRequest
 */

public class CoachingSlotsRequest  implements Serializable {
  
  private String interval = null;
  private Integer lengthInMinutes = null;
  private List<String> attendeeIds = new ArrayList<String>();
  private List<String> facilitatorIds = new ArrayList<String>();
  private List<String> interruptibleAppointmentIds = new ArrayList<String>();

  
  /**
   * Range of time to get slots for scheduling coaching appointments. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public CoachingSlotsRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Range of time to get slots for scheduling coaching appointments. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * The duration of coaching appointment to schedule in 15 minutes granularity up to maximum of 60 minutes
   **/
  public CoachingSlotsRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration of coaching appointment to schedule in 15 minutes granularity up to maximum of 60 minutes")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   * List of attendees to determine coaching appointment slots
   **/
  public CoachingSlotsRequest attendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of attendees to determine coaching appointment slots")
  @JsonProperty("attendeeIds")
  public List<String> getAttendeeIds() {
    return attendeeIds;
  }
  public void setAttendeeIds(List<String> attendeeIds) {
    this.attendeeIds = attendeeIds;
  }

  
  /**
   * List of facilitators to determine coaching appointment slots
   **/
  public CoachingSlotsRequest facilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of facilitators to determine coaching appointment slots")
  @JsonProperty("facilitatorIds")
  public List<String> getFacilitatorIds() {
    return facilitatorIds;
  }
  public void setFacilitatorIds(List<String> facilitatorIds) {
    this.facilitatorIds = facilitatorIds;
  }

  
  /**
   * List of appointment ids to exclude from consideration when determining blocked slots
   **/
  public CoachingSlotsRequest interruptibleAppointmentIds(List<String> interruptibleAppointmentIds) {
    this.interruptibleAppointmentIds = interruptibleAppointmentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of appointment ids to exclude from consideration when determining blocked slots")
  @JsonProperty("interruptibleAppointmentIds")
  public List<String> getInterruptibleAppointmentIds() {
    return interruptibleAppointmentIds;
  }
  public void setInterruptibleAppointmentIds(List<String> interruptibleAppointmentIds) {
    this.interruptibleAppointmentIds = interruptibleAppointmentIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingSlotsRequest coachingSlotsRequest = (CoachingSlotsRequest) o;
    return Objects.equals(this.interval, coachingSlotsRequest.interval) &&
        Objects.equals(this.lengthInMinutes, coachingSlotsRequest.lengthInMinutes) &&
        Objects.equals(this.attendeeIds, coachingSlotsRequest.attendeeIds) &&
        Objects.equals(this.facilitatorIds, coachingSlotsRequest.facilitatorIds) &&
        Objects.equals(this.interruptibleAppointmentIds, coachingSlotsRequest.interruptibleAppointmentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, lengthInMinutes, attendeeIds, facilitatorIds, interruptibleAppointmentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingSlotsRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    attendeeIds: ").append(toIndentedString(attendeeIds)).append("\n");
    sb.append("    facilitatorIds: ").append(toIndentedString(facilitatorIds)).append("\n");
    sb.append("    interruptibleAppointmentIds: ").append(toIndentedString(interruptibleAppointmentIds)).append("\n");
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

