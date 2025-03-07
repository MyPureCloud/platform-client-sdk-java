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
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateBody;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateButton;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateFooter;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template notification object.
 */
@ApiModel(description = "Template notification object.")

public class ConversationContentNotificationTemplate  implements Serializable {
  
  private String id = null;
  private String language = null;
  private ConversationNotificationTemplateHeader header = null;
  private ConversationNotificationTemplateBody body = null;
  private List<ConversationNotificationTemplateButton> buttons = new ArrayList<ConversationNotificationTemplateButton>();
  private ConversationNotificationTemplateFooter footer = null;

  
  /**
   * The identifier of the message template in 'your-namespace@your-template-id/name' format. For External vendor (e.g WhatsApp), 'your-namespace@your-template-name'. For GenesysCloud canned response message template use 'cannedresponse' as your-namespace and use response ID as your-template-id (e.g. response ID=1234 then 'cannedresponse@1234')
   **/
  public ConversationContentNotificationTemplate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the message template in 'your-namespace@your-template-id/name' format. For External vendor (e.g WhatsApp), 'your-namespace@your-template-name'. For GenesysCloud canned response message template use 'cannedresponse' as your-namespace and use response ID as your-template-id (e.g. response ID=1234 then 'cannedresponse@1234')")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Template language.
   **/
  public ConversationContentNotificationTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The template header.
   **/
  public ConversationContentNotificationTemplate header(ConversationNotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template header.")
  @JsonProperty("header")
  public ConversationNotificationTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(ConversationNotificationTemplateHeader header) {
    this.header = header;
  }


  /**
   * The template body.
   **/
  public ConversationContentNotificationTemplate body(ConversationNotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The template body.")
  @JsonProperty("body")
  public ConversationNotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(ConversationNotificationTemplateBody body) {
    this.body = body;
  }


  /**
   * Template buttons
   **/
  public ConversationContentNotificationTemplate buttons(List<ConversationNotificationTemplateButton> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template buttons")
  @JsonProperty("buttons")
  public List<ConversationNotificationTemplateButton> getButtons() {
    return buttons;
  }
  public void setButtons(List<ConversationNotificationTemplateButton> buttons) {
    this.buttons = buttons;
  }


  /**
   * The template footer.
   **/
  public ConversationContentNotificationTemplate footer(ConversationNotificationTemplateFooter footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template footer.")
  @JsonProperty("footer")
  public ConversationNotificationTemplateFooter getFooter() {
    return footer;
  }
  public void setFooter(ConversationNotificationTemplateFooter footer) {
    this.footer = footer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentNotificationTemplate conversationContentNotificationTemplate = (ConversationContentNotificationTemplate) o;

    return Objects.equals(this.id, conversationContentNotificationTemplate.id) &&
            Objects.equals(this.language, conversationContentNotificationTemplate.language) &&
            Objects.equals(this.header, conversationContentNotificationTemplate.header) &&
            Objects.equals(this.body, conversationContentNotificationTemplate.body) &&
            Objects.equals(this.buttons, conversationContentNotificationTemplate.buttons) &&
            Objects.equals(this.footer, conversationContentNotificationTemplate.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, header, body, buttons, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentNotificationTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

