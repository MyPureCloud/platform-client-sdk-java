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
import com.mypurecloud.sdk.v2.model.CoachingScheduleSlotsJobSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CoachingScheduleSlotsJobSlot
 */

public class CoachingScheduleSlotsJobSlot  implements Serializable {
  
  private Date dateStart = null;
  private CoachingScheduleSlotsJobSchedule schedule = null;

  public CoachingScheduleSlotsJobSlot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Start date and time of the slot. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CoachingScheduleSlotsJobSlot dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date and time of the slot. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The schedule information of the slot
   **/
  public CoachingScheduleSlotsJobSlot schedule(CoachingScheduleSlotsJobSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule information of the slot")
  @JsonProperty("schedule")
  public CoachingScheduleSlotsJobSchedule getSchedule() {
    return schedule;
  }
  public void setSchedule(CoachingScheduleSlotsJobSchedule schedule) {
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
    CoachingScheduleSlotsJobSlot coachingScheduleSlotsJobSlot = (CoachingScheduleSlotsJobSlot) o;

    return Objects.equals(this.dateStart, coachingScheduleSlotsJobSlot.dateStart) &&
            Objects.equals(this.schedule, coachingScheduleSlotsJobSlot.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingScheduleSlotsJobSlot {\n");
    
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

