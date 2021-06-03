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
import com.mypurecloud.sdk.v2.model.ContentAttachment;
import com.mypurecloud.sdk.v2.model.ContentButtonResponse;
import com.mypurecloud.sdk.v2.model.ContentGeneric;
import com.mypurecloud.sdk.v2.model.ContentList;
import com.mypurecloud.sdk.v2.model.ContentLocation;
import com.mypurecloud.sdk.v2.model.ContentNotificationTemplate;
import com.mypurecloud.sdk.v2.model.ContentPostback;
import com.mypurecloud.sdk.v2.model.ContentQuickReply;
import com.mypurecloud.sdk.v2.model.ContentReaction;
import com.mypurecloud.sdk.v2.model.MessagingRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Message content element.
 */
@ApiModel(description = "Message content element.")

public class MessageContent  implements Serializable {
  

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
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment"),
    LOCATION("Location"),
    QUICKREPLY("QuickReply"),
    NOTIFICATION("Notification"),
    GENERICTEMPLATE("GenericTemplate"),
    LISTTEMPLATE("ListTemplate"),
    POSTBACK("Postback"),
    REACTIONS("Reactions"),
    MENTION("Mention"),
    BUTTONRESPONSE("ButtonResponse");

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
  private ContentLocation location = null;
  private ContentAttachment attachment = null;
  private ContentQuickReply quickReply = null;
  private ContentButtonResponse buttonResponse = null;
  private ContentGeneric generic = null;
  private ContentList list = null;
  private ContentNotificationTemplate template = null;
  private List<ContentReaction> reactions = new ArrayList<ContentReaction>();
  private MessagingRecipient mention = null;
  private ContentPostback postback = null;

  
  /**
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   **/
  public MessageContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of this content element. If contentType = \"Attachment\" only one item is allowed.")
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
  public MessageContent location(ContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location content.")
  @JsonProperty("location")
  public ContentLocation getLocation() {
    return location;
  }
  public void setLocation(ContentLocation location) {
    this.location = location;
  }

  
  /**
   * Attachment content.
   **/
  public MessageContent attachment(ContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment content.")
  @JsonProperty("attachment")
  public ContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(ContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   * Quick reply content.
   **/
  public MessageContent quickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply content.")
  @JsonProperty("quickReply")
  public ContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   * Button response content.
   **/
  public MessageContent buttonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public ContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }

  
  /**
   * Generic content.
   **/
  public MessageContent generic(ContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generic content.")
  @JsonProperty("generic")
  public ContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(ContentGeneric generic) {
    this.generic = generic;
  }

  
  /**
   * List content.
   **/
  public MessageContent list(ContentList list) {
    this.list = list;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List content.")
  @JsonProperty("list")
  public ContentList getList() {
    return list;
  }
  public void setList(ContentList list) {
    this.list = list;
  }

  
  /**
   * Template notification content.
   **/
  public MessageContent template(ContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template notification content.")
  @JsonProperty("template")
  public ContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(ContentNotificationTemplate template) {
    this.template = template;
  }

  
  /**
   * A set of reactions to a message.
   **/
  public MessageContent reactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of reactions to a message.")
  @JsonProperty("reactions")
  public List<ContentReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
  }

  
  /**
   * Mention content.
   **/
  public MessageContent mention(MessagingRecipient mention) {
    this.mention = mention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mention content.")
  @JsonProperty("mention")
  public MessagingRecipient getMention() {
    return mention;
  }
  public void setMention(MessagingRecipient mention) {
    this.mention = mention;
  }

  
  /**
   * Structured message postback (Deprecated).
   **/
  public MessageContent postback(ContentPostback postback) {
    this.postback = postback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Structured message postback (Deprecated).")
  @JsonProperty("postback")
  public ContentPostback getPostback() {
    return postback;
  }
  public void setPostback(ContentPostback postback) {
    this.postback = postback;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContent messageContent = (MessageContent) o;
    return Objects.equals(this.contentType, messageContent.contentType) &&
        Objects.equals(this.location, messageContent.location) &&
        Objects.equals(this.attachment, messageContent.attachment) &&
        Objects.equals(this.quickReply, messageContent.quickReply) &&
        Objects.equals(this.buttonResponse, messageContent.buttonResponse) &&
        Objects.equals(this.generic, messageContent.generic) &&
        Objects.equals(this.list, messageContent.list) &&
        Objects.equals(this.template, messageContent.template) &&
        Objects.equals(this.reactions, messageContent.reactions) &&
        Objects.equals(this.mention, messageContent.mention) &&
        Objects.equals(this.postback, messageContent.postback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, location, attachment, quickReply, buttonResponse, generic, list, template, reactions, mention, postback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    mention: ").append(toIndentedString(mention)).append("\n");
    sb.append("    postback: ").append(toIndentedString(postback)).append("\n");
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

