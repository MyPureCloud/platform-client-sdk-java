package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallMediaPolicy;
import com.mypurecloud.sdk.v2.model.ChatMediaPolicy;
import com.mypurecloud.sdk.v2.model.EmailMediaPolicy;
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
        Objects.equals(this.emailPolicy, mediaPolicies.emailPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPolicy, chatPolicy, emailPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaPolicies {\n");
    
    sb.append("    callPolicy: ").append(toIndentedString(callPolicy)).append("\n");
    sb.append("    chatPolicy: ").append(toIndentedString(chatPolicy)).append("\n");
    sb.append("    emailPolicy: ").append(toIndentedString(emailPolicy)).append("\n");
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

