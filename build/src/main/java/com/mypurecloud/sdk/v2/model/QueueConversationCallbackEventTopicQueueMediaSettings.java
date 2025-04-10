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
 * QueueConversationCallbackEventTopicQueueMediaSettings
 */

public class QueueConversationCallbackEventTopicQueueMediaSettings  implements Serializable {
  
  private Long alertingTimeoutSeconds = null;
  private BigDecimal autoAnswerAlertToneSeconds = null;
  private BigDecimal manualAnswerAlertToneSeconds = null;
  private Boolean enableAutoAnswer = null;

  public QueueConversationCallbackEventTopicQueueMediaSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Specifies how long the agent has to answer an interaction before being marked as not responding.
   **/
  public QueueConversationCallbackEventTopicQueueMediaSettings alertingTimeoutSeconds(Long alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how long the agent has to answer an interaction before being marked as not responding.")
  @JsonProperty("alertingTimeoutSeconds")
  public Long getAlertingTimeoutSeconds() {
    return alertingTimeoutSeconds;
  }
  public void setAlertingTimeoutSeconds(Long alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
  }


  /**
   * Specifies the duration of the alerting sound to be played for auto answered interactions.
   **/
  public QueueConversationCallbackEventTopicQueueMediaSettings autoAnswerAlertToneSeconds(BigDecimal autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the duration of the alerting sound to be played for auto answered interactions.")
  @JsonProperty("autoAnswerAlertToneSeconds")
  public BigDecimal getAutoAnswerAlertToneSeconds() {
    return autoAnswerAlertToneSeconds;
  }
  public void setAutoAnswerAlertToneSeconds(BigDecimal autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
  }


  /**
   * Specifies the duration of the alerting sound to be played for manually answered interactions
   **/
  public QueueConversationCallbackEventTopicQueueMediaSettings manualAnswerAlertToneSeconds(BigDecimal manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the duration of the alerting sound to be played for manually answered interactions")
  @JsonProperty("manualAnswerAlertToneSeconds")
  public BigDecimal getManualAnswerAlertToneSeconds() {
    return manualAnswerAlertToneSeconds;
  }
  public void setManualAnswerAlertToneSeconds(BigDecimal manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
  }


  /**
   * Flag to indicate if auto answer is enabled for the given media type or media subtype.
   **/
  public QueueConversationCallbackEventTopicQueueMediaSettings enableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to indicate if auto answer is enabled for the given media type or media subtype.")
  @JsonProperty("enableAutoAnswer")
  public Boolean getEnableAutoAnswer() {
    return enableAutoAnswer;
  }
  public void setEnableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallbackEventTopicQueueMediaSettings queueConversationCallbackEventTopicQueueMediaSettings = (QueueConversationCallbackEventTopicQueueMediaSettings) o;

    return Objects.equals(this.alertingTimeoutSeconds, queueConversationCallbackEventTopicQueueMediaSettings.alertingTimeoutSeconds) &&
            Objects.equals(this.autoAnswerAlertToneSeconds, queueConversationCallbackEventTopicQueueMediaSettings.autoAnswerAlertToneSeconds) &&
            Objects.equals(this.manualAnswerAlertToneSeconds, queueConversationCallbackEventTopicQueueMediaSettings.manualAnswerAlertToneSeconds) &&
            Objects.equals(this.enableAutoAnswer, queueConversationCallbackEventTopicQueueMediaSettings.enableAutoAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertingTimeoutSeconds, autoAnswerAlertToneSeconds, manualAnswerAlertToneSeconds, enableAutoAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicQueueMediaSettings {\n");
    
    sb.append("    alertingTimeoutSeconds: ").append(toIndentedString(alertingTimeoutSeconds)).append("\n");
    sb.append("    autoAnswerAlertToneSeconds: ").append(toIndentedString(autoAnswerAlertToneSeconds)).append("\n");
    sb.append("    manualAnswerAlertToneSeconds: ").append(toIndentedString(manualAnswerAlertToneSeconds)).append("\n");
    sb.append("    enableAutoAnswer: ").append(toIndentedString(enableAutoAnswer)).append("\n");
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

