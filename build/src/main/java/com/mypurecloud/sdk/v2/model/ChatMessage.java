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
import com.mypurecloud.sdk.v2.model.ChatMessageUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ChatMessage
 */

public class ChatMessage  implements Serializable {
  
  private String body = null;
  private String id = null;
  private String to = null;
  private String from = null;
  private String utc = null;
  private String chat = null;
  private String message = null;
  private String type = null;

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
   * Type of the message body (v2 chats only)
   */
 @JsonDeserialize(using = BodyTypeEnumDeserializer.class)
  public enum BodyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("STANDARD"),
    ACTIVITY("ACTIVITY"),
    TYPING("TYPING"),
    NOTICE("NOTICE"),
    MEMBERJOIN("MEMBERJOIN"),
    MEMBERLEAVE("MEMBERLEAVE"),
    MEDIAREQUEST("MEDIAREQUEST");

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
  private String senderCommunicationId = null;
  private String participantPurpose = null;
  private ChatMessageUser user = null;

  
  /**
   * The message body
   **/
  public ChatMessage body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message body")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   **/
  public ChatMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The message recipient
   **/
  public ChatMessage to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message recipient")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  
  /**
   * The message sender
   **/
  public ChatMessage from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message sender")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  
  /**
   **/
  public ChatMessage utc(String utc) {
    this.utc = utc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utc")
  public String getUtc() {
    return utc;
  }
  public void setUtc(String utc) {
    this.utc = utc;
  }

  
  /**
   * The interaction id (if available)
   **/
  public ChatMessage chat(String chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interaction id (if available)")
  @JsonProperty("chat")
  public String getChat() {
    return chat;
  }
  public void setChat(String chat) {
    this.chat = chat;
  }

  
  /**
   * The message id
   **/
  public ChatMessage message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message id")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public ChatMessage type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Type of the message body (v2 chats only)
   **/
  public ChatMessage bodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the message body (v2 chats only)")
  @JsonProperty("bodyType")
  public BodyTypeEnum getBodyType() {
    return bodyType;
  }
  public void setBodyType(BodyTypeEnum bodyType) {
    this.bodyType = bodyType;
  }

  
  /**
   * Communication of sender (v2 chats only)
   **/
  public ChatMessage senderCommunicationId(String senderCommunicationId) {
    this.senderCommunicationId = senderCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Communication of sender (v2 chats only)")
  @JsonProperty("senderCommunicationId")
  public String getSenderCommunicationId() {
    return senderCommunicationId;
  }
  public void setSenderCommunicationId(String senderCommunicationId) {
    this.senderCommunicationId = senderCommunicationId;
  }

  
  /**
   * Participant purpose of sender (v2 chats only)
   **/
  public ChatMessage participantPurpose(String participantPurpose) {
    this.participantPurpose = participantPurpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Participant purpose of sender (v2 chats only)")
  @JsonProperty("participantPurpose")
  public String getParticipantPurpose() {
    return participantPurpose;
  }
  public void setParticipantPurpose(String participantPurpose) {
    this.participantPurpose = participantPurpose;
  }

  
  /**
   * The user information for the sender (if available)
   **/
  public ChatMessage user(ChatMessageUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user information for the sender (if available)")
  @JsonProperty("user")
  public ChatMessageUser getUser() {
    return user;
  }
  public void setUser(ChatMessageUser user) {
    this.user = user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessage chatMessage = (ChatMessage) o;
    return Objects.equals(this.body, chatMessage.body) &&
        Objects.equals(this.id, chatMessage.id) &&
        Objects.equals(this.to, chatMessage.to) &&
        Objects.equals(this.from, chatMessage.from) &&
        Objects.equals(this.utc, chatMessage.utc) &&
        Objects.equals(this.chat, chatMessage.chat) &&
        Objects.equals(this.message, chatMessage.message) &&
        Objects.equals(this.type, chatMessage.type) &&
        Objects.equals(this.bodyType, chatMessage.bodyType) &&
        Objects.equals(this.senderCommunicationId, chatMessage.senderCommunicationId) &&
        Objects.equals(this.participantPurpose, chatMessage.participantPurpose) &&
        Objects.equals(this.user, chatMessage.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, id, to, from, utc, chat, message, type, bodyType, senderCommunicationId, participantPurpose, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessage {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    utc: ").append(toIndentedString(utc)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    senderCommunicationId: ").append(toIndentedString(senderCommunicationId)).append("\n");
    sb.append("    participantPurpose: ").append(toIndentedString(participantPurpose)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

