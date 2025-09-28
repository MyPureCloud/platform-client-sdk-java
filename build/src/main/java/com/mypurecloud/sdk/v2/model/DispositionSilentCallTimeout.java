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
import java.util.Date;

import java.io.Serializable;
/**
 * DispositionSilentCallTimeout
 */

public class DispositionSilentCallTimeout  implements Serializable {
  
  private Integer timeoutMs = null;
  private Date timerStartTime = null;
  private Date timerEndTime = null;

  public DispositionSilentCallTimeout() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Configured silent call timeout value.
   **/
  public DispositionSilentCallTimeout timeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured silent call timeout value.")
  @JsonProperty("timeoutMs")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }
  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }


  /**
   * Timer start time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DispositionSilentCallTimeout timerStartTime(Date timerStartTime) {
    this.timerStartTime = timerStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timer start time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timerStartTime")
  public Date getTimerStartTime() {
    return timerStartTime;
  }
  public void setTimerStartTime(Date timerStartTime) {
    this.timerStartTime = timerStartTime;
  }


  /**
   * Timer end time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DispositionSilentCallTimeout timerEndTime(Date timerEndTime) {
    this.timerEndTime = timerEndTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timer end time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timerEndTime")
  public Date getTimerEndTime() {
    return timerEndTime;
  }
  public void setTimerEndTime(Date timerEndTime) {
    this.timerEndTime = timerEndTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositionSilentCallTimeout dispositionSilentCallTimeout = (DispositionSilentCallTimeout) o;

    return Objects.equals(this.timeoutMs, dispositionSilentCallTimeout.timeoutMs) &&
            Objects.equals(this.timerStartTime, dispositionSilentCallTimeout.timerStartTime) &&
            Objects.equals(this.timerEndTime, dispositionSilentCallTimeout.timerEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutMs, timerStartTime, timerEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositionSilentCallTimeout {\n");
    
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
    sb.append("    timerStartTime: ").append(toIndentedString(timerStartTime)).append("\n");
    sb.append("    timerEndTime: ").append(toIndentedString(timerEndTime)).append("\n");
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

