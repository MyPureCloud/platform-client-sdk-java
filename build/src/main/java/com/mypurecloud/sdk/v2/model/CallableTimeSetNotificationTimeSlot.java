package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CallableTimeSetNotificationTimeSlot
 */

public class CallableTimeSetNotificationTimeSlot  implements Serializable {
  
  private String startTime = null;
  private String stopTime = null;
  private Integer day = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CallableTimeSetNotificationTimeSlot startTime(String startTime) {
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
  public CallableTimeSetNotificationTimeSlot stopTime(String stopTime) {
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
  public CallableTimeSetNotificationTimeSlot day(Integer day) {
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
  public CallableTimeSetNotificationTimeSlot additionalProperties(Object additionalProperties) {
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
    CallableTimeSetNotificationTimeSlot callableTimeSetNotificationTimeSlot = (CallableTimeSetNotificationTimeSlot) o;
    return Objects.equals(this.startTime, callableTimeSetNotificationTimeSlot.startTime) &&
        Objects.equals(this.stopTime, callableTimeSetNotificationTimeSlot.stopTime) &&
        Objects.equals(this.day, callableTimeSetNotificationTimeSlot.day) &&
        Objects.equals(this.additionalProperties, callableTimeSetNotificationTimeSlot.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallableTimeSetNotificationTimeSlot {\n");
    
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

