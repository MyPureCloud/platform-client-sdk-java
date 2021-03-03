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
import com.mypurecloud.sdk.v2.model.TimeSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeAllowed
 */

public class TimeAllowed  implements Serializable {
  
  private List<TimeSlot> timeSlots = new ArrayList<TimeSlot>();
  private String timeZoneId = null;
  private Boolean empty = null;

  
  /**
   **/
  public TimeAllowed timeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeSlots")
  public List<TimeSlot> getTimeSlots() {
    return timeSlots;
  }
  public void setTimeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  
  /**
   **/
  public TimeAllowed timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  
  /**
   **/
  public TimeAllowed empty(Boolean empty) {
    this.empty = empty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeAllowed timeAllowed = (TimeAllowed) o;
    return Objects.equals(this.timeSlots, timeAllowed.timeSlots) &&
        Objects.equals(this.timeZoneId, timeAllowed.timeZoneId) &&
        Objects.equals(this.empty, timeAllowed.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlots, timeZoneId, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeAllowed {\n");
    
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

