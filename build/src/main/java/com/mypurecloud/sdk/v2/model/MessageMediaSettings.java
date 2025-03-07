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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BaseMediaSettings;
import com.mypurecloud.sdk.v2.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * MessageMediaSettings
 */

public class MessageMediaSettings  implements Serializable {
  
  private Boolean enableAutoAnswer = null;
  private Integer alertingTimeoutSeconds = null;
  private ServiceLevel serviceLevel = null;
  private Double autoAnswerAlertToneSeconds = null;
  private Double manualAnswerAlertToneSeconds = null;
  private Map<String, BaseMediaSettings> subTypeSettings = null;

  
  /**
   * Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings.
   **/
  public MessageMediaSettings enableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings.")
  @JsonProperty("enableAutoAnswer")
  public Boolean getEnableAutoAnswer() {
    return enableAutoAnswer;
  }
  public void setEnableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
  }


  /**
   * The alerting timeout for the media type, in seconds
   **/
  public MessageMediaSettings alertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alerting timeout for the media type, in seconds")
  @JsonProperty("alertingTimeoutSeconds")
  public Integer getAlertingTimeoutSeconds() {
    return alertingTimeoutSeconds;
  }
  public void setAlertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
  }


  /**
   * The targeted service level for the media type
   **/
  public MessageMediaSettings serviceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The targeted service level for the media type")
  @JsonProperty("serviceLevel")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  /**
   * How long to play the alerting tone for an auto-answer interaction
   **/
  public MessageMediaSettings autoAnswerAlertToneSeconds(Double autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to play the alerting tone for an auto-answer interaction")
  @JsonProperty("autoAnswerAlertToneSeconds")
  public Double getAutoAnswerAlertToneSeconds() {
    return autoAnswerAlertToneSeconds;
  }
  public void setAutoAnswerAlertToneSeconds(Double autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
  }


  /**
   * How long to play the alerting tone for a manual-answer interaction
   **/
  public MessageMediaSettings manualAnswerAlertToneSeconds(Double manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to play the alerting tone for a manual-answer interaction")
  @JsonProperty("manualAnswerAlertToneSeconds")
  public Double getManualAnswerAlertToneSeconds() {
    return manualAnswerAlertToneSeconds;
  }
  public void setManualAnswerAlertToneSeconds(Double manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
  }


  /**
   * Map of media subtype to media subtype specific settings.
   **/
  public MessageMediaSettings subTypeSettings(Map<String, BaseMediaSettings> subTypeSettings) {
    this.subTypeSettings = subTypeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of media subtype to media subtype specific settings.")
  @JsonProperty("subTypeSettings")
  public Map<String, BaseMediaSettings> getSubTypeSettings() {
    return subTypeSettings;
  }
  public void setSubTypeSettings(Map<String, BaseMediaSettings> subTypeSettings) {
    this.subTypeSettings = subTypeSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageMediaSettings messageMediaSettings = (MessageMediaSettings) o;

    return Objects.equals(this.enableAutoAnswer, messageMediaSettings.enableAutoAnswer) &&
            Objects.equals(this.alertingTimeoutSeconds, messageMediaSettings.alertingTimeoutSeconds) &&
            Objects.equals(this.serviceLevel, messageMediaSettings.serviceLevel) &&
            Objects.equals(this.autoAnswerAlertToneSeconds, messageMediaSettings.autoAnswerAlertToneSeconds) &&
            Objects.equals(this.manualAnswerAlertToneSeconds, messageMediaSettings.manualAnswerAlertToneSeconds) &&
            Objects.equals(this.subTypeSettings, messageMediaSettings.subTypeSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAutoAnswer, alertingTimeoutSeconds, serviceLevel, autoAnswerAlertToneSeconds, manualAnswerAlertToneSeconds, subTypeSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMediaSettings {\n");
    
    sb.append("    enableAutoAnswer: ").append(toIndentedString(enableAutoAnswer)).append("\n");
    sb.append("    alertingTimeoutSeconds: ").append(toIndentedString(alertingTimeoutSeconds)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    autoAnswerAlertToneSeconds: ").append(toIndentedString(autoAnswerAlertToneSeconds)).append("\n");
    sb.append("    manualAnswerAlertToneSeconds: ").append(toIndentedString(manualAnswerAlertToneSeconds)).append("\n");
    sb.append("    subTypeSettings: ").append(toIndentedString(subTypeSettings)).append("\n");
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

