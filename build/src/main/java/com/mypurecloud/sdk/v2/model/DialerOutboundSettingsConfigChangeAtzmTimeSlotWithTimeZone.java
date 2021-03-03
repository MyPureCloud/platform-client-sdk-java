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
 * DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone
 */

public class DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone  implements Serializable {
  
  private String earliestCallableTime = null;
  private String latestCallableTime = null;
  private String timeZoneId = null;

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone earliestCallableTime(String earliestCallableTime) {
    this.earliestCallableTime = earliestCallableTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("earliestCallableTime")
  public String getEarliestCallableTime() {
    return earliestCallableTime;
  }
  public void setEarliestCallableTime(String earliestCallableTime) {
    this.earliestCallableTime = earliestCallableTime;
  }

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone latestCallableTime(String latestCallableTime) {
    this.latestCallableTime = latestCallableTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latestCallableTime")
  public String getLatestCallableTime() {
    return latestCallableTime;
  }
  public void setLatestCallableTime(String latestCallableTime) {
    this.latestCallableTime = latestCallableTime;
  }

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone timeZoneId(String timeZoneId) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone dialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone = (DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone) o;
    return Objects.equals(this.earliestCallableTime, dialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone.earliestCallableTime) &&
        Objects.equals(this.latestCallableTime, dialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone.latestCallableTime) &&
        Objects.equals(this.timeZoneId, dialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestCallableTime, latestCallableTime, timeZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeAtzmTimeSlotWithTimeZone {\n");
    
    sb.append("    earliestCallableTime: ").append(toIndentedString(earliestCallableTime)).append("\n");
    sb.append("    latestCallableTime: ").append(toIndentedString(latestCallableTime)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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

