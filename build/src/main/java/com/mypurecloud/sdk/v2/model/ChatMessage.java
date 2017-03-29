package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
  private ChatMessageUser user = null;

  
  /**
   **/
  public ChatMessage body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public ChatMessage to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }


  /**
   **/
  public ChatMessage from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public ChatMessage chat(String chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public String getChat() {
    return chat;
  }
  public void setChat(String chat) {
    this.chat = chat;
  }


  /**
   **/
  public ChatMessage message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
   **/
  public ChatMessage user(ChatMessageUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
        Objects.equals(this.user, chatMessage.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, id, to, from, utc, chat, message, type, user);
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

