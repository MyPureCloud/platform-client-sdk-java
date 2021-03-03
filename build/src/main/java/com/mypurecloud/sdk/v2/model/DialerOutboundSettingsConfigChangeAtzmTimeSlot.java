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
 * DialerOutboundSettingsConfigChangeAtzmTimeSlot
 */

public class DialerOutboundSettingsConfigChangeAtzmTimeSlot  implements Serializable {
  
  private String earliestCallableTime = null;
  private String latestCallableTime = null;

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeAtzmTimeSlot earliestCallableTime(String earliestCallableTime) {
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
  public DialerOutboundSettingsConfigChangeAtzmTimeSlot latestCallableTime(String latestCallableTime) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerOutboundSettingsConfigChangeAtzmTimeSlot dialerOutboundSettingsConfigChangeAtzmTimeSlot = (DialerOutboundSettingsConfigChangeAtzmTimeSlot) o;
    return Objects.equals(this.earliestCallableTime, dialerOutboundSettingsConfigChangeAtzmTimeSlot.earliestCallableTime) &&
        Objects.equals(this.latestCallableTime, dialerOutboundSettingsConfigChangeAtzmTimeSlot.latestCallableTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestCallableTime, latestCallableTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeAtzmTimeSlot {\n");
    
    sb.append("    earliestCallableTime: ").append(toIndentedString(earliestCallableTime)).append("\n");
    sb.append("    latestCallableTime: ").append(toIndentedString(latestCallableTime)).append("\n");
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

