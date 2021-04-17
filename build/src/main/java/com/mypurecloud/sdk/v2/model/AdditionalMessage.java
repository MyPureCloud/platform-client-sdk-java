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
import com.mypurecloud.sdk.v2.model.MessagingTemplateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdditionalMessage
 */

public class AdditionalMessage  implements Serializable {
  
  private String textBody = null;
  private List<String> mediaIds = new ArrayList<String>();
  private List<String> stickerIds = new ArrayList<String>();
  private MessagingTemplateRequest messagingTemplate = null;

  
  /**
   * The body of the text message.
   **/
  public AdditionalMessage textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The body of the text message.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  
  /**
   * The media ids associated with the text message. See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   **/
  public AdditionalMessage mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media ids associated with the text message. See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.")
  @JsonProperty("mediaIds")
  public List<String> getMediaIds() {
    return mediaIds;
  }
  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  
  /**
   * The sticker ids associated with the text message.
   **/
  public AdditionalMessage stickerIds(List<String> stickerIds) {
    this.stickerIds = stickerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sticker ids associated with the text message.")
  @JsonProperty("stickerIds")
  public List<String> getStickerIds() {
    return stickerIds;
  }
  public void setStickerIds(List<String> stickerIds) {
    this.stickerIds = stickerIds;
  }

  
  /**
   * The messaging template use to send a predefined canned response with the message
   **/
  public AdditionalMessage messagingTemplate(MessagingTemplateRequest messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging template use to send a predefined canned response with the message")
  @JsonProperty("messagingTemplate")
  public MessagingTemplateRequest getMessagingTemplate() {
    return messagingTemplate;
  }
  public void setMessagingTemplate(MessagingTemplateRequest messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalMessage additionalMessage = (AdditionalMessage) o;
    return Objects.equals(this.textBody, additionalMessage.textBody) &&
        Objects.equals(this.mediaIds, additionalMessage.mediaIds) &&
        Objects.equals(this.stickerIds, additionalMessage.stickerIds) &&
        Objects.equals(this.messagingTemplate, additionalMessage.messagingTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textBody, mediaIds, stickerIds, messagingTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalMessage {\n");
    
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    stickerIds: ").append(toIndentedString(stickerIds)).append("\n");
    sb.append("    messagingTemplate: ").append(toIndentedString(messagingTemplate)).append("\n");
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

