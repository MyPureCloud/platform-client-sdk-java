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
 * ChatSettings
 */

public class ChatSettings  implements Serializable {
  
  private Integer messageRetentionPeriodDays = null;

  
  /**
   * Retention time for messages in days
   **/
  public ChatSettings messageRetentionPeriodDays(Integer messageRetentionPeriodDays) {
    this.messageRetentionPeriodDays = messageRetentionPeriodDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retention time for messages in days")
  @JsonProperty("messageRetentionPeriodDays")
  public Integer getMessageRetentionPeriodDays() {
    return messageRetentionPeriodDays;
  }
  public void setMessageRetentionPeriodDays(Integer messageRetentionPeriodDays) {
    this.messageRetentionPeriodDays = messageRetentionPeriodDays;
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
    return Objects.equals(this.messageRetentionPeriodDays, chatSettings.messageRetentionPeriodDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageRetentionPeriodDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatSettings {\n");
    
    sb.append("    messageRetentionPeriodDays: ").append(toIndentedString(messageRetentionPeriodDays)).append("\n");
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

