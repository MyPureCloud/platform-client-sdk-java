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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * GoogleDialogflowCustomSettings
 */

public class GoogleDialogflowCustomSettings  implements Serializable {
  
  private String environment = null;
  private String eventName = null;
  private Map<String, String> webhookQueryParameters = null;
  private Map<String, String> eventInputParameters = null;

  
  /**
   * If set this environment will be used to initiate the dialogflow bot, otherwise the default configuration will be used.  See https://cloud.google.com/dialogflow/docs/agents-versions
   **/
  public GoogleDialogflowCustomSettings environment(String environment) {
    this.environment = environment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If set this environment will be used to initiate the dialogflow bot, otherwise the default configuration will be used.  See https://cloud.google.com/dialogflow/docs/agents-versions")
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  
  /**
   * If set this eventName will be used to initiate the dialogflow bot rather than language processing on the input text.  See https://cloud.google.com/dialogflow/es/docs/events-overview
   **/
  public GoogleDialogflowCustomSettings eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If set this eventName will be used to initiate the dialogflow bot rather than language processing on the input text.  See https://cloud.google.com/dialogflow/es/docs/events-overview")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  
  /**
   * Parameters passed to the fulfillment webhook of the bot (if any).
   **/
  public GoogleDialogflowCustomSettings webhookQueryParameters(Map<String, String> webhookQueryParameters) {
    this.webhookQueryParameters = webhookQueryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters passed to the fulfillment webhook of the bot (if any).")
  @JsonProperty("webhookQueryParameters")
  public Map<String, String> getWebhookQueryParameters() {
    return webhookQueryParameters;
  }
  public void setWebhookQueryParameters(Map<String, String> webhookQueryParameters) {
    this.webhookQueryParameters = webhookQueryParameters;
  }

  
  /**
   * Parameters passed to the event input of the bot.
   **/
  public GoogleDialogflowCustomSettings eventInputParameters(Map<String, String> eventInputParameters) {
    this.eventInputParameters = eventInputParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters passed to the event input of the bot.")
  @JsonProperty("eventInputParameters")
  public Map<String, String> getEventInputParameters() {
    return eventInputParameters;
  }
  public void setEventInputParameters(Map<String, String> eventInputParameters) {
    this.eventInputParameters = eventInputParameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDialogflowCustomSettings googleDialogflowCustomSettings = (GoogleDialogflowCustomSettings) o;
    return Objects.equals(this.environment, googleDialogflowCustomSettings.environment) &&
        Objects.equals(this.eventName, googleDialogflowCustomSettings.eventName) &&
        Objects.equals(this.webhookQueryParameters, googleDialogflowCustomSettings.webhookQueryParameters) &&
        Objects.equals(this.eventInputParameters, googleDialogflowCustomSettings.eventInputParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, eventName, webhookQueryParameters, eventInputParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDialogflowCustomSettings {\n");
    
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    webhookQueryParameters: ").append(toIndentedString(webhookQueryParameters)).append("\n");
    sb.append("    eventInputParameters: ").append(toIndentedString(eventInputParameters)).append("\n");
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

