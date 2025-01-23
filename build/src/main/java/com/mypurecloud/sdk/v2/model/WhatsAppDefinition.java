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
import com.mypurecloud.sdk.v2.model.Button;
import com.mypurecloud.sdk.v2.model.MessageFooter;
import com.mypurecloud.sdk.v2.model.MessageHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A WhatsApp messaging template definition as defined in the WhatsApp Business Manager
 */
@ApiModel(description = "A WhatsApp messaging template definition as defined in the WhatsApp Business Manager")

public class WhatsAppDefinition  implements Serializable {
  
  private String name = null;
  private String namespace = null;
  private String language = null;
  private List<Button> buttons = new ArrayList<Button>();
  private MessageFooter messageFooter = null;
  private MessageHeader header = null;

  
  /**
   * The messaging template name.
   **/
  public WhatsAppDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The messaging template namespace.
   **/
  public WhatsAppDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging template namespace.")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * The messaging template language configured for this template. This is a WhatsApp specific value. For example, 'en_US'
   **/
  public WhatsAppDefinition language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template language configured for this template. This is a WhatsApp specific value. For example, 'en_US'")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * List of buttons to be included in the WhatsApp messages channel
   **/
  public WhatsAppDefinition buttons(List<Button> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of buttons to be included in the WhatsApp messages channel")
  @JsonProperty("buttons")
  public List<Button> getButtons() {
    return buttons;
  }
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }


  /**
   * Footer for the message in the WhatsApp messages channel
   **/
  public WhatsAppDefinition messageFooter(MessageFooter messageFooter) {
    this.messageFooter = messageFooter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Footer for the message in the WhatsApp messages channel")
  @JsonProperty("messageFooter")
  public MessageFooter getMessageFooter() {
    return messageFooter;
  }
  public void setMessageFooter(MessageFooter messageFooter) {
    this.messageFooter = messageFooter;
  }


  /**
   * Header for the message in the WhatsApp messages channel
   **/
  public WhatsAppDefinition header(MessageHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header for the message in the WhatsApp messages channel")
  @JsonProperty("header")
  public MessageHeader getHeader() {
    return header;
  }
  public void setHeader(MessageHeader header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppDefinition whatsAppDefinition = (WhatsAppDefinition) o;

    return Objects.equals(this.name, whatsAppDefinition.name) &&
            Objects.equals(this.namespace, whatsAppDefinition.namespace) &&
            Objects.equals(this.language, whatsAppDefinition.language) &&
            Objects.equals(this.buttons, whatsAppDefinition.buttons) &&
            Objects.equals(this.messageFooter, whatsAppDefinition.messageFooter) &&
            Objects.equals(this.header, whatsAppDefinition.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, language, buttons, messageFooter, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    messageFooter: ").append(toIndentedString(messageFooter)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

