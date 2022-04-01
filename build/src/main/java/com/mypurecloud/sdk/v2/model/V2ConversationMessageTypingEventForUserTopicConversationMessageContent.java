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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentAttachment;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentGeneric;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentLocation;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentStory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationMessageContent
 */

public class V2ConversationMessageTypingEventForUserTopicConversationMessageContent  implements Serializable {
  

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
   * Gets or Sets contentType
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment"),
    LOCATION("Location"),
    STORY("Story"),
    QUICKREPLY("QuickReply"),
    NOTIFICATION("Notification"),
    BUTTONRESPONSE("ButtonResponse"),
    GENERICTEMPLATE("GenericTemplate");

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
  private V2ConversationMessageTypingEventForUserTopicConversationContentLocation location = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentStory story = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentAttachment attachment = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply quickReply = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate template = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse buttonResponse = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentGeneric generic = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent location(V2ConversationMessageTypingEventForUserTopicConversationContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation getLocation() {
    return location;
  }
  public void setLocation(V2ConversationMessageTypingEventForUserTopicConversationContentLocation location) {
    this.location = location;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent story(V2ConversationMessageTypingEventForUserTopicConversationContentStory story) {
    this.story = story;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("story")
  public V2ConversationMessageTypingEventForUserTopicConversationContentStory getStory() {
    return story;
  }
  public void setStory(V2ConversationMessageTypingEventForUserTopicConversationContentStory story) {
    this.story = story;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent attachment(V2ConversationMessageTypingEventForUserTopicConversationContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachment")
  public V2ConversationMessageTypingEventForUserTopicConversationContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(V2ConversationMessageTypingEventForUserTopicConversationContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent quickReply(V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quickReply")
  public V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent template(V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("template")
  public V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate template) {
    this.template = template;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent buttonResponse(V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buttonResponse")
  public V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageContent generic(V2ConversationMessageTypingEventForUserTopicConversationContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generic")
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(V2ConversationMessageTypingEventForUserTopicConversationContentGeneric generic) {
    this.generic = generic;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationMessageContent v2ConversationMessageTypingEventForUserTopicConversationMessageContent = (V2ConversationMessageTypingEventForUserTopicConversationMessageContent) o;
    return Objects.equals(this.contentType, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.contentType) &&
        Objects.equals(this.location, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.location) &&
        Objects.equals(this.story, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.story) &&
        Objects.equals(this.attachment, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.attachment) &&
        Objects.equals(this.quickReply, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.quickReply) &&
        Objects.equals(this.template, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.template) &&
        Objects.equals(this.buttonResponse, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.buttonResponse) &&
        Objects.equals(this.generic, v2ConversationMessageTypingEventForUserTopicConversationMessageContent.generic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, location, story, attachment, quickReply, template, buttonResponse, generic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationMessageContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
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

