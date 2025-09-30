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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * Answering Machine Detection timeout configuration.
 */
@ApiModel(description = "Answering Machine Detection timeout configuration.")

public class ConversationEventTopicDispositionAmdTimeout  implements Serializable {
  
  private Long timeoutMs = null;
  private String timerStartEvent = null;
  private BigDecimal timerStartTime = null;
  private BigDecimal timerEndTime = null;

  public ConversationEventTopicDispositionAmdTimeout() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Configured AMD timeout value.
   **/
  public ConversationEventTopicDispositionAmdTimeout timeoutMs(Long timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured AMD timeout value.")
  @JsonProperty("timeoutMs")
  public Long getTimeoutMs() {
    return timeoutMs;
  }
  public void setTimeoutMs(Long timeoutMs) {
    this.timeoutMs = timeoutMs;
  }


  /**
   * Configured option for when to start the AMD timer, such as on line connect or speech start.
   **/
  public ConversationEventTopicDispositionAmdTimeout timerStartEvent(String timerStartEvent) {
    this.timerStartEvent = timerStartEvent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured option for when to start the AMD timer, such as on line connect or speech start.")
  @JsonProperty("timerStartEvent")
  public String getTimerStartEvent() {
    return timerStartEvent;
  }
  public void setTimerStartEvent(String timerStartEvent) {
    this.timerStartEvent = timerStartEvent;
  }


  /**
   * Timer start time, measured in epoch milliseconds.
   **/
  public ConversationEventTopicDispositionAmdTimeout timerStartTime(BigDecimal timerStartTime) {
    this.timerStartTime = timerStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timer start time, measured in epoch milliseconds.")
  @JsonProperty("timerStartTime")
  public BigDecimal getTimerStartTime() {
    return timerStartTime;
  }
  public void setTimerStartTime(BigDecimal timerStartTime) {
    this.timerStartTime = timerStartTime;
  }


  /**
   * Timer end time, measured in epoch milliseconds.
   **/
  public ConversationEventTopicDispositionAmdTimeout timerEndTime(BigDecimal timerEndTime) {
    this.timerEndTime = timerEndTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timer end time, measured in epoch milliseconds.")
  @JsonProperty("timerEndTime")
  public BigDecimal getTimerEndTime() {
    return timerEndTime;
  }
  public void setTimerEndTime(BigDecimal timerEndTime) {
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
    ConversationEventTopicDispositionAmdTimeout conversationEventTopicDispositionAmdTimeout = (ConversationEventTopicDispositionAmdTimeout) o;

    return Objects.equals(this.timeoutMs, conversationEventTopicDispositionAmdTimeout.timeoutMs) &&
            Objects.equals(this.timerStartEvent, conversationEventTopicDispositionAmdTimeout.timerStartEvent) &&
            Objects.equals(this.timerStartTime, conversationEventTopicDispositionAmdTimeout.timerStartTime) &&
            Objects.equals(this.timerEndTime, conversationEventTopicDispositionAmdTimeout.timerEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutMs, timerStartEvent, timerStartTime, timerEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicDispositionAmdTimeout {\n");
    
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
    sb.append("    timerStartEvent: ").append(toIndentedString(timerStartEvent)).append("\n");
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

