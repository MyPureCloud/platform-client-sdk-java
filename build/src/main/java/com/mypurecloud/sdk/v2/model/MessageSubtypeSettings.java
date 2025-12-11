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
 * MessageSubtypeSettings
 */

public class MessageSubtypeSettings  implements Serializable {
  
  private Boolean enableAutoAnswer = null;
  private Boolean enableInactivityTimeout = null;

  public MessageSubtypeSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings.
   **/
  public MessageSubtypeSettings enableAutoAnswer(Boolean enableAutoAnswer) {
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
   * Indicates if inactivity timeout is enabled for the given subtype.
   **/
  public MessageSubtypeSettings enableInactivityTimeout(Boolean enableInactivityTimeout) {
    this.enableInactivityTimeout = enableInactivityTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if inactivity timeout is enabled for the given subtype.")
  @JsonProperty("enableInactivityTimeout")
  public Boolean getEnableInactivityTimeout() {
    return enableInactivityTimeout;
  }
  public void setEnableInactivityTimeout(Boolean enableInactivityTimeout) {
    this.enableInactivityTimeout = enableInactivityTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageSubtypeSettings messageSubtypeSettings = (MessageSubtypeSettings) o;

    return Objects.equals(this.enableAutoAnswer, messageSubtypeSettings.enableAutoAnswer) &&
            Objects.equals(this.enableInactivityTimeout, messageSubtypeSettings.enableInactivityTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAutoAnswer, enableInactivityTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSubtypeSettings {\n");
    
    sb.append("    enableAutoAnswer: ").append(toIndentedString(enableAutoAnswer)).append("\n");
    sb.append("    enableInactivityTimeout: ").append(toIndentedString(enableInactivityTimeout)).append("\n");
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

