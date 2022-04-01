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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent  implements Serializable {
  

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
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation location = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory story = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment attachment = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply quickReply = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate template = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse buttonResponse = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric generic = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent contentType(ContentTypeEnum contentType) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent location(V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation getLocation() {
    return location;
  }
  public void setLocation(V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation location) {
    this.location = location;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent story(V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory story) {
    this.story = story;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("story")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory getStory() {
    return story;
  }
  public void setStory(V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory story) {
    this.story = story;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent attachment(V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachment")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent quickReply(V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quickReply")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent template(V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("template")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate template) {
    this.template = template;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent buttonResponse(V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buttonResponse")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent generic(V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generic")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric generic) {
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
    V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent = (V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent) o;
    return Objects.equals(this.contentType, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.contentType) &&
        Objects.equals(this.location, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.location) &&
        Objects.equals(this.story, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.story) &&
        Objects.equals(this.attachment, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.attachment) &&
        Objects.equals(this.quickReply, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.quickReply) &&
        Objects.equals(this.template, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.template) &&
        Objects.equals(this.buttonResponse, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.buttonResponse) &&
        Objects.equals(this.generic, v2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.generic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, location, story, attachment, quickReply, template, buttonResponse, generic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent {\n");
    
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

