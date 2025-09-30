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
 * Silent Call timeout configuration.
 */
@ApiModel(description = "Silent Call timeout configuration.")

public class QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout  implements Serializable {
  
  private Long timeoutMs = null;
  private BigDecimal timerStartTime = null;
  private BigDecimal timerEndTime = null;

  public QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Configured Silent Call timeout value.
   **/
  public QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout timeoutMs(Long timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured Silent Call timeout value.")
  @JsonProperty("timeoutMs")
  public Long getTimeoutMs() {
    return timeoutMs;
  }
  public void setTimeoutMs(Long timeoutMs) {
    this.timeoutMs = timeoutMs;
  }


  /**
   * Timer start time, measured in epoch milliseconds.
   **/
  public QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout timerStartTime(BigDecimal timerStartTime) {
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
  public QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout timerEndTime(BigDecimal timerEndTime) {
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
    QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout queueConversationSocialExpressionEventTopicDispositionSilentCallTimeout = (QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout) o;

    return Objects.equals(this.timeoutMs, queueConversationSocialExpressionEventTopicDispositionSilentCallTimeout.timeoutMs) &&
            Objects.equals(this.timerStartTime, queueConversationSocialExpressionEventTopicDispositionSilentCallTimeout.timerStartTime) &&
            Objects.equals(this.timerEndTime, queueConversationSocialExpressionEventTopicDispositionSilentCallTimeout.timerEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutMs, timerStartTime, timerEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicDispositionSilentCallTimeout {\n");
    
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

