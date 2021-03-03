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
import com.mypurecloud.sdk.v2.model.CrossPlatformCallMediaPolicy;
import com.mypurecloud.sdk.v2.model.CrossPlatformChatMediaPolicy;
import com.mypurecloud.sdk.v2.model.CrossPlatformEmailMediaPolicy;
import com.mypurecloud.sdk.v2.model.CrossPlatformMessageMediaPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CrossPlatformMediaPolicies
 */

public class CrossPlatformMediaPolicies  implements Serializable {
  
  private CrossPlatformCallMediaPolicy callPolicy = null;
  private CrossPlatformChatMediaPolicy chatPolicy = null;
  private CrossPlatformEmailMediaPolicy emailPolicy = null;
  private CrossPlatformMessageMediaPolicy messagePolicy = null;

  
  /**
   * Conditions and actions for calls
   **/
  public CrossPlatformMediaPolicies callPolicy(CrossPlatformCallMediaPolicy callPolicy) {
    this.callPolicy = callPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for calls")
  @JsonProperty("callPolicy")
  public CrossPlatformCallMediaPolicy getCallPolicy() {
    return callPolicy;
  }
  public void setCallPolicy(CrossPlatformCallMediaPolicy callPolicy) {
    this.callPolicy = callPolicy;
  }

  
  /**
   * Conditions and actions for chats
   **/
  public CrossPlatformMediaPolicies chatPolicy(CrossPlatformChatMediaPolicy chatPolicy) {
    this.chatPolicy = chatPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for chats")
  @JsonProperty("chatPolicy")
  public CrossPlatformChatMediaPolicy getChatPolicy() {
    return chatPolicy;
  }
  public void setChatPolicy(CrossPlatformChatMediaPolicy chatPolicy) {
    this.chatPolicy = chatPolicy;
  }

  
  /**
   * Conditions and actions for emails
   **/
  public CrossPlatformMediaPolicies emailPolicy(CrossPlatformEmailMediaPolicy emailPolicy) {
    this.emailPolicy = emailPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for emails")
  @JsonProperty("emailPolicy")
  public CrossPlatformEmailMediaPolicy getEmailPolicy() {
    return emailPolicy;
  }
  public void setEmailPolicy(CrossPlatformEmailMediaPolicy emailPolicy) {
    this.emailPolicy = emailPolicy;
  }

  
  /**
   * Conditions and actions for messages
   **/
  public CrossPlatformMediaPolicies messagePolicy(CrossPlatformMessageMediaPolicy messagePolicy) {
    this.messagePolicy = messagePolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditions and actions for messages")
  @JsonProperty("messagePolicy")
  public CrossPlatformMessageMediaPolicy getMessagePolicy() {
    return messagePolicy;
  }
  public void setMessagePolicy(CrossPlatformMessageMediaPolicy messagePolicy) {
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
    CrossPlatformMediaPolicies crossPlatformMediaPolicies = (CrossPlatformMediaPolicies) o;
    return Objects.equals(this.callPolicy, crossPlatformMediaPolicies.callPolicy) &&
        Objects.equals(this.chatPolicy, crossPlatformMediaPolicies.chatPolicy) &&
        Objects.equals(this.emailPolicy, crossPlatformMediaPolicies.emailPolicy) &&
        Objects.equals(this.messagePolicy, crossPlatformMediaPolicies.messagePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPolicy, chatPolicy, emailPolicy, messagePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossPlatformMediaPolicies {\n");
    
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

