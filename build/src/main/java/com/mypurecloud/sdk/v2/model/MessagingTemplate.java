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
import com.mypurecloud.sdk.v2.model.WhatsAppDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The messaging template identifies a structured message templates supported by a messaging channel.
 */
@ApiModel(description = "The messaging template identifies a structured message templates supported by a messaging channel.")

public class MessagingTemplate  implements Serializable {
  
  private WhatsAppDefinition whatsApp = null;

  
  /**
   * Defines a messaging template for a WhatsApp messaging channel
   **/
  public MessagingTemplate whatsApp(WhatsAppDefinition whatsApp) {
    this.whatsApp = whatsApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines a messaging template for a WhatsApp messaging channel")
  @JsonProperty("whatsApp")
  public WhatsAppDefinition getWhatsApp() {
    return whatsApp;
  }
  public void setWhatsApp(WhatsAppDefinition whatsApp) {
    this.whatsApp = whatsApp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingTemplate messagingTemplate = (MessagingTemplate) o;
    return Objects.equals(this.whatsApp, messagingTemplate.whatsApp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsApp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingTemplate {\n");
    
    sb.append("    whatsApp: ").append(toIndentedString(whatsApp)).append("\n");
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

