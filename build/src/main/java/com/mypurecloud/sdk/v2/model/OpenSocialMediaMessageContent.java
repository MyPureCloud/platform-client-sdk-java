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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationContentAttachment;
import com.mypurecloud.sdk.v2.model.ConversationContentReaction;
import com.mypurecloud.sdk.v2.model.ConversationContentText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message content element.
 */
@ApiModel(description = "Message content element.")

public class OpenSocialMediaMessageContent  implements Serializable {
  

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
    REACTIONS("Reactions"),
    TEXT("Text");

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
  private ConversationContentAttachment attachment = null;
  private ConversationContentText text = null;
  private ConversationContentReaction reaction = null;

  public OpenSocialMediaMessageContent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of this content element.
   **/
  public OpenSocialMediaMessageContent contentType(ContentTypeEnum contentType) {
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
   * Attachment content.
   **/
  public OpenSocialMediaMessageContent attachment(ConversationContentAttachment attachment) {
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
   * A content type containing text.
   **/
  public OpenSocialMediaMessageContent text(ConversationContentText text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A content type containing text.")
  @JsonProperty("text")
  public ConversationContentText getText() {
    return text;
  }
  public void setText(ConversationContentText text) {
    this.text = text;
  }


  /**
   * A set of reactions to a message.
   **/
  public OpenSocialMediaMessageContent reaction(ConversationContentReaction reaction) {
    this.reaction = reaction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of reactions to a message.")
  @JsonProperty("reaction")
  public ConversationContentReaction getReaction() {
    return reaction;
  }
  public void setReaction(ConversationContentReaction reaction) {
    this.reaction = reaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSocialMediaMessageContent openSocialMediaMessageContent = (OpenSocialMediaMessageContent) o;

    return Objects.equals(this.contentType, openSocialMediaMessageContent.contentType) &&
            Objects.equals(this.attachment, openSocialMediaMessageContent.attachment) &&
            Objects.equals(this.text, openSocialMediaMessageContent.text) &&
            Objects.equals(this.reaction, openSocialMediaMessageContent.reaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, attachment, text, reaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSocialMediaMessageContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
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

