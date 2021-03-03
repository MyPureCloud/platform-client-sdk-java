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
import com.mypurecloud.sdk.v2.model.CallMediaPolicy;
import com.mypurecloud.sdk.v2.model.ChatMediaPolicy;
import com.mypurecloud.sdk.v2.model.EmailMediaPolicy;
import com.mypurecloud.sdk.v2.model.MessageMediaPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaPolicies
 */

public class MediaPolicies  implements Serializable {
  
  private CallMediaPolicy callPolicy = null;
  private ChatMediaPolicy chatPolicy = null;
  private EmailMediaPolicy emailPolicy = null;
  private MessageMediaPolicy messagePolicy = null;

  
  /**
   * Conditions and actions for calls
   **/
  public MediaPolicies callPolicy(CallMediaPolicy callPolicy) {
    this.callPolicy = callPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for calls")
  @JsonProperty("callPolicy")
  public CallMediaPolicy getCallPolicy() {
    return callPolicy;
  }
  public void setCallPolicy(CallMediaPolicy callPolicy) {
    this.callPolicy = callPolicy;
  }

  
  /**
   * Conditions and actions for chats
   **/
  public MediaPolicies chatPolicy(ChatMediaPolicy chatPolicy) {
    this.chatPolicy = chatPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for chats")
  @JsonProperty("chatPolicy")
  public ChatMediaPolicy getChatPolicy() {
    return chatPolicy;
  }
  public void setChatPolicy(ChatMediaPolicy chatPolicy) {
    this.chatPolicy = chatPolicy;
  }

  
  /**
   * Conditions and actions for emails
   **/
  public MediaPolicies emailPolicy(EmailMediaPolicy emailPolicy) {
    this.emailPolicy = emailPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for emails")
  @JsonProperty("emailPolicy")
  public EmailMediaPolicy getEmailPolicy() {
    return emailPolicy;
  }
  public void setEmailPolicy(EmailMediaPolicy emailPolicy) {
    this.emailPolicy = emailPolicy;
  }

  
  /**
   * Conditions and actions for messages
   **/
  public MediaPolicies messagePolicy(MessageMediaPolicy messagePolicy) {
    this.messagePolicy = messagePolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for messages")
  @JsonProperty("messagePolicy")
  public MessageMediaPolicy getMessagePolicy() {
    return messagePolicy;
  }
  public void setMessagePolicy(MessageMediaPolicy messagePolicy) {
    this.messagePolicy = messagePolicy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaPolicies mediaPolicies = (MediaPolicies) o;
    return Objects.equals(this.callPolicy, mediaPolicies.callPolicy) &&
        Objects.equals(this.chatPolicy, mediaPolicies.chatPolicy) &&
        Objects.equals(this.emailPolicy, mediaPolicies.emailPolicy) &&
        Objects.equals(this.messagePolicy, mediaPolicies.messagePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPolicy, chatPolicy, emailPolicy, messagePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaPolicies {\n");
    
    sb.append("    callPolicy: ").append(toIndentedString(callPolicy)).append("\n");
    sb.append("    chatPolicy: ").append(toIndentedString(chatPolicy)).append("\n");
    sb.append("    emailPolicy: ").append(toIndentedString(emailPolicy)).append("\n");
    sb.append("    messagePolicy: ").append(toIndentedString(messagePolicy)).append("\n");
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

