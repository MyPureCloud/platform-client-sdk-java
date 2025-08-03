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
import com.mypurecloud.sdk.v2.model.DialerCallabletimesetConfigChangeTimeSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCallabletimesetConfigChangeCallableTime
 */

public class DialerCallabletimesetConfigChangeCallableTime  implements Serializable {
  
  private List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots = null;
  private String timeZoneId = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerCallabletimesetConfigChangeCallableTime() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      timeSlots = new ArrayList<DialerCallabletimesetConfigChangeTimeSlot>();
    }
  }

  
  /**
   * The time slots
   **/
  public DialerCallabletimesetConfigChangeCallableTime timeSlots(List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time slots")
  @JsonProperty("timeSlots")
  public List<DialerCallabletimesetConfigChangeTimeSlot> getTimeSlots() {
    return timeSlots;
  }
  public void setTimeSlots(List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }


  /**
   * The ISO ID for the timezone
   **/
  public DialerCallabletimesetConfigChangeCallableTime timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ISO ID for the timezone")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  /**
   **/
  public DialerCallabletimesetConfigChangeCallableTime additionalProperties(Map<String, Object> additionalProperties) {
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
  public DialerCallabletimesetConfigChangeCallableTime getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
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
    DialerCallabletimesetConfigChangeCallableTime dialerCallabletimesetConfigChangeCallableTime = (DialerCallabletimesetConfigChangeCallableTime) o;

    return Objects.equals(this.timeSlots, dialerCallabletimesetConfigChangeCallableTime.timeSlots) &&
            Objects.equals(this.timeZoneId, dialerCallabletimesetConfigChangeCallableTime.timeZoneId) &&
            Objects.equals(this.additionalProperties, dialerCallabletimesetConfigChangeCallableTime.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, dialerCallabletimesetConfigChangeCallableTime.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlots, timeZoneId, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeCallableTime {\n");
    
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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

