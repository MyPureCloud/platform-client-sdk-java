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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CallbackMediaSettings;
import com.mypurecloud.sdk.v2.model.EmailMediaSettings;
import com.mypurecloud.sdk.v2.model.MediaSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueMediaSettings
 */

public class QueueMediaSettings  implements Serializable {
  
  private MediaSettings call = null;
  private CallbackMediaSettings callback = null;
  private MediaSettings chat = null;
  private EmailMediaSettings email = null;
  private MediaSettings message = null;

  
  /**
   * The queue media settings for call interactions.
   **/
  public QueueMediaSettings call(MediaSettings call) {
    this.call = call;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue media settings for call interactions.")
  @JsonProperty("call")
  public MediaSettings getCall() {
    return call;
  }
  public void setCall(MediaSettings call) {
    this.call = call;
  }


  /**
   * The queue media settings for callback interactions.
   **/
  public QueueMediaSettings callback(CallbackMediaSettings callback) {
    this.callback = callback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue media settings for callback interactions.")
  @JsonProperty("callback")
  public CallbackMediaSettings getCallback() {
    return callback;
  }
  public void setCallback(CallbackMediaSettings callback) {
    this.callback = callback;
  }


  /**
   * The queue media settings for chat interactions.
   **/
  public QueueMediaSettings chat(MediaSettings chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue media settings for chat interactions.")
  @JsonProperty("chat")
  public MediaSettings getChat() {
    return chat;
  }
  public void setChat(MediaSettings chat) {
    this.chat = chat;
  }


  /**
   * The queue media settings for email interactions.
   **/
  public QueueMediaSettings email(EmailMediaSettings email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue media settings for email interactions.")
  @JsonProperty("email")
  public EmailMediaSettings getEmail() {
    return email;
  }
  public void setEmail(EmailMediaSettings email) {
    this.email = email;
  }


  /**
   * The queue media settings for message interactions.
   **/
  public QueueMediaSettings message(MediaSettings message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue media settings for message interactions.")
  @JsonProperty("message")
  public MediaSettings getMessage() {
    return message;
  }
  public void setMessage(MediaSettings message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMediaSettings queueMediaSettings = (QueueMediaSettings) o;

    return Objects.equals(this.call, queueMediaSettings.call) &&
            Objects.equals(this.callback, queueMediaSettings.callback) &&
            Objects.equals(this.chat, queueMediaSettings.chat) &&
            Objects.equals(this.email, queueMediaSettings.email) &&
            Objects.equals(this.message, queueMediaSettings.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(call, callback, chat, email, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMediaSettings {\n");
    
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

