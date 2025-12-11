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
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateBody;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateButton;
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template card object.
 */
@ApiModel(description = "Template card object.")

public class ConversationNotificationTemplateCard  implements Serializable {
  
  private ConversationNotificationTemplateHeader header = null;
  private ConversationNotificationTemplateBody body = null;
  private List<ConversationNotificationTemplateButton> buttons = null;

  public ConversationNotificationTemplateCard() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buttons = new ArrayList<ConversationNotificationTemplateButton>();
    }
  }

  
  /**
   * The template header.
   **/
  public ConversationNotificationTemplateCard header(ConversationNotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The template header.")
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
  public ConversationNotificationTemplateCard body(ConversationNotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template body.")
  @JsonProperty("body")
  public ConversationNotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(ConversationNotificationTemplateBody body) {
    this.body = body;
  }


  /**
   * Template buttons.
   **/
  public ConversationNotificationTemplateCard buttons(List<ConversationNotificationTemplateButton> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template buttons.")
  @JsonProperty("buttons")
  public List<ConversationNotificationTemplateButton> getButtons() {
    return buttons;
  }
  public void setButtons(List<ConversationNotificationTemplateButton> buttons) {
    this.buttons = buttons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotificationTemplateCard conversationNotificationTemplateCard = (ConversationNotificationTemplateCard) o;

    return Objects.equals(this.header, conversationNotificationTemplateCard.header) &&
            Objects.equals(this.body, conversationNotificationTemplateCard.body) &&
            Objects.equals(this.buttons, conversationNotificationTemplateCard.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationTemplateCard {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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

