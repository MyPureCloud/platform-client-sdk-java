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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCallabletimesetConfigChangeTimeSlot
 */

public class DialerCallabletimesetConfigChangeTimeSlot  implements Serializable {
  
  private String startTime = null;
  private String stopTime = null;
  private Long day = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerCallabletimesetConfigChangeTimeSlot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The start time of this time slot
   **/
  public DialerCallabletimesetConfigChangeTimeSlot startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of this time slot")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  /**
   * The stop time of this time slot
   **/
  public DialerCallabletimesetConfigChangeTimeSlot stopTime(String stopTime) {
    this.stopTime = stopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The stop time of this time slot")
  @JsonProperty("stopTime")
  public String getStopTime() {
    return stopTime;
  }
  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }


  /**
   * The day this time slot applies
   **/
  public DialerCallabletimesetConfigChangeTimeSlot day(Long day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The day this time slot applies")
  @JsonProperty("day")
  public Long getDay() {
    return day;
  }
  public void setDay(Long day) {
    this.day = day;
  }


  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public DialerCallabletimesetConfigChangeTimeSlot getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
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
            Objects.equals(this.additionalProperties, dialerCallabletimesetConfigChangeTimeSlot.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, dialerCallabletimesetConfigChangeTimeSlot.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeTimeSlot {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

