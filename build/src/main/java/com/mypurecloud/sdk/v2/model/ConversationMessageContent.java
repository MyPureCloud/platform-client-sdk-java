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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationContentAttachment;
import com.mypurecloud.sdk.v2.model.ConversationContentButtonResponse;
import com.mypurecloud.sdk.v2.model.ConversationContentCard;
import com.mypurecloud.sdk.v2.model.ConversationContentCarousel;
import com.mypurecloud.sdk.v2.model.ConversationContentLocation;
import com.mypurecloud.sdk.v2.model.ConversationContentNotificationTemplate;
import com.mypurecloud.sdk.v2.model.ConversationContentQuickReply;
import com.mypurecloud.sdk.v2.model.ConversationContentQuickReplyV2;
import com.mypurecloud.sdk.v2.model.ConversationContentStory;
import com.mypurecloud.sdk.v2.model.ConversationContentText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message content element. If contentType &#x3D; \&quot;Attachment\&quot; only one item is allowed.
 */
@ApiModel(description = "Message content element. If contentType = \"Attachment\" only one item is allowed.")

public class ConversationMessageContent  implements Serializable {
  

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of this content element.
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment"),
    LOCATION("Location"),
    QUICKREPLY("QuickReply"),
    NOTIFICATION("Notification"),
    BUTTONRESPONSE("ButtonResponse"),
    STORY("Story"),
    MENTION("Mention"),
    CARD("Card"),
    CAROUSEL("Carousel"),
    TEXT("Text"),
    QUICKREPLYV2("QuickReplyV2"),
    UNKNOWN("Unknown");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;
  private ConversationContentLocation location = null;
  private ConversationContentAttachment attachment = null;
  private ConversationContentQuickReply quickReply = null;
  private ConversationContentButtonResponse buttonResponse = null;
  private ConversationContentNotificationTemplate template = null;
  private ConversationContentStory story = null;
  private ConversationContentCard card = null;
  private ConversationContentCarousel carousel = null;
  private ConversationContentText text = null;
  private ConversationContentQuickReplyV2 quickReplyV2 = null;

  
  /**
   * Type of this content element.
   **/
  public ConversationMessageContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of this content element.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   * Location content.
   **/
  public ConversationMessageContent location(ConversationContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location content.")
  @JsonProperty("location")
  public ConversationContentLocation getLocation() {
    return location;
  }
  public void setLocation(ConversationContentLocation location) {
    this.location = location;
  }


  /**
   * Attachment content.
   **/
  public ConversationMessageContent attachment(ConversationContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment content.")
  @JsonProperty("attachment")
  public ConversationContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(ConversationContentAttachment attachment) {
    this.attachment = attachment;
  }


  /**
   * Quick reply content.
   **/
  public ConversationMessageContent quickReply(ConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply content.")
  @JsonProperty("quickReply")
  public ConversationContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(ConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }


  /**
   * Button response content.
   **/
  public ConversationMessageContent buttonResponse(ConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public ConversationContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  /**
   * Template notification content.
   **/
  public ConversationMessageContent template(ConversationContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template notification content.")
  @JsonProperty("template")
  public ConversationContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(ConversationContentNotificationTemplate template) {
    this.template = template;
  }


  /**
   * Ephemeral story content.
   **/
  public ConversationMessageContent story(ConversationContentStory story) {
    this.story = story;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ephemeral story content.")
  @JsonProperty("story")
  public ConversationContentStory getStory() {
    return story;
  }
  public void setStory(ConversationContentStory story) {
    this.story = story;
  }


  /**
   * Card content
   **/
  public ConversationMessageContent card(ConversationContentCard card) {
    this.card = card;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card content")
  @JsonProperty("card")
  public ConversationContentCard getCard() {
    return card;
  }
  public void setCard(ConversationContentCard card) {
    this.card = card;
  }


  /**
   * Carousel content
   **/
  public ConversationMessageContent carousel(ConversationContentCarousel carousel) {
    this.carousel = carousel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Carousel content")
  @JsonProperty("carousel")
  public ConversationContentCarousel getCarousel() {
    return carousel;
  }
  public void setCarousel(ConversationContentCarousel carousel) {
    this.carousel = carousel;
  }


  /**
   * Text content.
   **/
  public ConversationMessageContent text(ConversationContentText text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text content.")
  @JsonProperty("text")
  public ConversationContentText getText() {
    return text;
  }
  public void setText(ConversationContentText text) {
    this.text = text;
  }


  /**
   * Quick reply V2 content.
   **/
  public ConversationMessageContent quickReplyV2(ConversationContentQuickReplyV2 quickReplyV2) {
    this.quickReplyV2 = quickReplyV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply V2 content.")
  @JsonProperty("quickReplyV2")
  public ConversationContentQuickReplyV2 getQuickReplyV2() {
    return quickReplyV2;
  }
  public void setQuickReplyV2(ConversationContentQuickReplyV2 quickReplyV2) {
    this.quickReplyV2 = quickReplyV2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageContent conversationMessageContent = (ConversationMessageContent) o;

    return Objects.equals(this.contentType, conversationMessageContent.contentType) &&
            Objects.equals(this.location, conversationMessageContent.location) &&
            Objects.equals(this.attachment, conversationMessageContent.attachment) &&
            Objects.equals(this.quickReply, conversationMessageContent.quickReply) &&
            Objects.equals(this.buttonResponse, conversationMessageContent.buttonResponse) &&
            Objects.equals(this.template, conversationMessageContent.template) &&
            Objects.equals(this.story, conversationMessageContent.story) &&
            Objects.equals(this.card, conversationMessageContent.card) &&
            Objects.equals(this.carousel, conversationMessageContent.carousel) &&
            Objects.equals(this.text, conversationMessageContent.text) &&
            Objects.equals(this.quickReplyV2, conversationMessageContent.quickReplyV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, location, attachment, quickReply, buttonResponse, template, story, card, carousel, text, quickReplyV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    carousel: ").append(toIndentedString(carousel)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    quickReplyV2: ").append(toIndentedString(quickReplyV2)).append("\n");
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

