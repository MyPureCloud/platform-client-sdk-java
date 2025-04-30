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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Metadata information about a message content.
 */
@ApiModel(description = "Metadata information about a message content.")

public class ConversationMessageMetadataContent  implements Serializable {
  

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
    REACTIONS("Reactions"),
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
    DATEPICKER("DatePicker"),
    INTERACTIVEAPPLICATION("InteractiveApplication"),
    LISTPICKER("ListPicker"),
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

  private static class SubTypeEnumDeserializer extends StdDeserializer<SubTypeEnum> {
    public SubTypeEnumDeserializer() {
      super(SubTypeEnumDeserializer.class);
    }

    @Override
    public SubTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Content subtype
   */
 @JsonDeserialize(using = SubTypeEnumDeserializer.class)
  public enum SubTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMAGE("Image"),
    VIDEO("Video"),
    AUDIO("Audio"),
    FILE("File"),
    LINK("Link"),
    MENTION("Mention"),
    REPLY("Reply"),
    BUTTON("Button"),
    QUICKREPLY("QuickReply"),
    POSTBACK("Postback"),
    UNKNOWN("Unknown");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubTypeEnum value : SubTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubTypeEnum subType = null;

  public ConversationMessageMetadataContent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of this content element.
   **/
  public ConversationMessageMetadataContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this content element.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   * Content subtype
   **/
  public ConversationMessageMetadataContent subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content subtype")
  @JsonProperty("subType")
  public SubTypeEnum getSubType() {
    return subType;
  }
  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageMetadataContent conversationMessageMetadataContent = (ConversationMessageMetadataContent) o;

    return Objects.equals(this.contentType, conversationMessageMetadataContent.contentType) &&
            Objects.equals(this.subType, conversationMessageMetadataContent.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageMetadataContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

