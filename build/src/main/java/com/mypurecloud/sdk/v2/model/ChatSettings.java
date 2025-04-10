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

import java.io.Serializable;
/**
 * ChatSettings
 */

public class ChatSettings  implements Serializable {
  
  private Integer messageRetentionPeriodDays = null;
  private Boolean reactionsEnabled = null;

  public ChatSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Retention time for messages in days, expressed as int in the range [10,3650]
   **/
  public ChatSettings messageRetentionPeriodDays(Integer messageRetentionPeriodDays) {
    this.messageRetentionPeriodDays = messageRetentionPeriodDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retention time for messages in days, expressed as int in the range [10,3650]")
  @JsonProperty("messageRetentionPeriodDays")
  public Integer getMessageRetentionPeriodDays() {
    return messageRetentionPeriodDays;
  }
  public void setMessageRetentionPeriodDays(Integer messageRetentionPeriodDays) {
    this.messageRetentionPeriodDays = messageRetentionPeriodDays;
  }


  /**
   * Reactions enabled for org
   **/
  public ChatSettings reactionsEnabled(Boolean reactionsEnabled) {
    this.reactionsEnabled = reactionsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reactions enabled for org")
  @JsonProperty("reactionsEnabled")
  public Boolean getReactionsEnabled() {
    return reactionsEnabled;
  }
  public void setReactionsEnabled(Boolean reactionsEnabled) {
    this.reactionsEnabled = reactionsEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatSettings chatSettings = (ChatSettings) o;

    return Objects.equals(this.messageRetentionPeriodDays, chatSettings.messageRetentionPeriodDays) &&
            Objects.equals(this.reactionsEnabled, chatSettings.reactionsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageRetentionPeriodDays, reactionsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatSettings {\n");
    
    sb.append("    messageRetentionPeriodDays: ").append(toIndentedString(messageRetentionPeriodDays)).append("\n");
    sb.append("    reactionsEnabled: ").append(toIndentedString(reactionsEnabled)).append("\n");
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

