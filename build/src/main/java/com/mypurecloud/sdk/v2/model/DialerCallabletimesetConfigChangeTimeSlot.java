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
 * DialerCallabletimesetConfigChangeTimeSlot
 */

public class DialerCallabletimesetConfigChangeTimeSlot  implements Serializable {
  
  private String startTime = null;
  private String stopTime = null;
  private Integer day = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot stopTime(String stopTime) {
    this.stopTime = stopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stopTime")
  public String getStopTime() {
    return stopTime;
  }
  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  
  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot day(Integer day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("day")
  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }

  
  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCallabletimesetConfigChangeTimeSlot dialerCallabletimesetConfigChangeTimeSlot = (DialerCallabletimesetConfigChangeTimeSlot) o;
    return Objects.equals(this.startTime, dialerCallabletimesetConfigChangeTimeSlot.startTime) &&
        Objects.equals(this.stopTime, dialerCallabletimesetConfigChangeTimeSlot.stopTime) &&
        Objects.equals(this.day, dialerCallabletimesetConfigChangeTimeSlot.day) &&
        Objects.equals(this.additionalProperties, dialerCallabletimesetConfigChangeTimeSlot.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeTimeSlot {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

