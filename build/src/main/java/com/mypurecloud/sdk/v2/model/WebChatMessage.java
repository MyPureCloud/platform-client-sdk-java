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
import com.mypurecloud.sdk.v2.model.WebChatConversation;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WebChatMessage
 */

public class WebChatMessage  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WebChatConversation conversation = null;
  private WebChatMemberInfo sender = null;
  private String body = null;

  private static class BodyTypeEnumDeserializer extends StdDeserializer<BodyTypeEnum> {
    public BodyTypeEnumDeserializer() {
      super(BodyTypeEnumDeserializer.class);
    }

    @Override
    public BodyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BodyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The purpose of the message within the conversation, such as a standard text entry versus a greeting.
   */
 @JsonDeserialize(using = BodyTypeEnumDeserializer.class)
  public enum BodyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("standard"),
    NOTICE("notice"),
    MEMBER_JOIN("member-join"),
    MEMBER_LEAVE("member-leave"),
    MEDIA_REQUEST("media-request");

    private String value;

    BodyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BodyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (BodyTypeEnum value : BodyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BodyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BodyTypeEnum bodyType = null;
  private Date timestamp = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WebChatMessage name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The identifier of the conversation
   **/
  public WebChatMessage conversation(WebChatConversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the conversation")
  @JsonProperty("conversation")
  public WebChatConversation getConversation() {
    return conversation;
  }
  public void setConversation(WebChatConversation conversation) {
    this.conversation = conversation;
  }

  
  /**
   * The member who sent the message
   **/
  public WebChatMessage sender(WebChatMemberInfo sender) {
    this.sender = sender;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The member who sent the message")
  @JsonProperty("sender")
  public WebChatMemberInfo getSender() {
    return sender;
  }
  public void setSender(WebChatMemberInfo sender) {
    this.sender = sender;
  }

  
  /**
   * The message body.
   **/
  public WebChatMessage body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The message body.")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * The purpose of the message within the conversation, such as a standard text entry versus a greeting.
   **/
  public WebChatMessage bodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The purpose of the message within the conversation, such as a standard text entry versus a greeting.")
  @JsonProperty("bodyType")
  public BodyTypeEnum getBodyType() {
    return bodyType;
  }
  public void setBodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
  }

  
  /**
   * The timestamp of the message, in ISO-8601 format
   **/
  public WebChatMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp of the message, in ISO-8601 format")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatMessage webChatMessage = (WebChatMessage) o;
    return Objects.equals(this.id, webChatMessage.id) &&
        Objects.equals(this.name, webChatMessage.name) &&
        Objects.equals(this.conversation, webChatMessage.conversation) &&
        Objects.equals(this.sender, webChatMessage.sender) &&
        Objects.equals(this.body, webChatMessage.body) &&
        Objects.equals(this.bodyType, webChatMessage.bodyType) &&
        Objects.equals(this.timestamp, webChatMessage.timestamp) &&
        Objects.equals(this.selfUri, webChatMessage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, sender, body, bodyType, timestamp, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

