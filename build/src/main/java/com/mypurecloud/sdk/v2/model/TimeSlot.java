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

import java.io.Serializable;
/**
 * TimeSlot
 */

public class TimeSlot  implements Serializable {
  
  private String startTime = null;
  private String stopTime = null;
  private Integer day = null;

  
  /**
   * start time in xx:xx:xx.xxx format
   **/
  public TimeSlot startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "start time in xx:xx:xx.xxx format")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * stop time in xx:xx:xx.xxx format
   **/
  public TimeSlot stopTime(String stopTime) {
    this.stopTime = stopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "stop time in xx:xx:xx.xxx format")
  @JsonProperty("stopTime")
  public String getStopTime() {
    return stopTime;
  }
  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  
  /**
   * Day for this time slot, Monday = 1 ... Sunday = 7
   **/
  public TimeSlot day(Integer day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Day for this time slot, Monday = 1 ... Sunday = 7")
  @JsonProperty("day")
  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.startTime, timeSlot.startTime) &&
        Objects.equals(this.stopTime, timeSlot.stopTime) &&
        Objects.equals(this.day, timeSlot.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

