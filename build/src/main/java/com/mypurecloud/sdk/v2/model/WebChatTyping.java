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
import com.mypurecloud.sdk.v2.model.WebChatConversation;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WebChatTyping
 */

public class WebChatTyping  implements Serializable {
  
  private String id = null;
  private WebChatConversation conversation = null;
  private WebChatMemberInfo sender = null;
  private Date timestamp = null;

  
  /**
   * The event identifier of this typing indicator event (useful to guard against event re-delivery
   **/
  public WebChatTyping id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event identifier of this typing indicator event (useful to guard against event re-delivery")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The identifier of the conversation
   **/
  public WebChatTyping conversation(WebChatConversation conversation) {
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
  public WebChatTyping sender(WebChatMemberInfo sender) {
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
   * The timestamp of the message, in ISO-8601 format
   **/
  public WebChatTyping timestamp(Date timestamp) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatTyping webChatTyping = (WebChatTyping) o;
    return Objects.equals(this.id, webChatTyping.id) &&
        Objects.equals(this.conversation, webChatTyping.conversation) &&
        Objects.equals(this.sender, webChatTyping.sender) &&
        Objects.equals(this.timestamp, webChatTyping.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversation, sender, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatTyping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

