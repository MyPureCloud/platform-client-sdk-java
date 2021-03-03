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
import com.mypurecloud.sdk.v2.model.MediaSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationSummary
 */

public class UserConversationSummary  implements Serializable {
  
  private String userId = null;
  private MediaSummary call = null;
  private MediaSummary callback = null;
  private MediaSummary email = null;
  private MediaSummary message = null;
  private MediaSummary chat = null;
  private MediaSummary socialExpression = null;
  private MediaSummary video = null;

  
  /**
   **/
  public UserConversationSummary userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public UserConversationSummary call(MediaSummary call) {
    this.call = call;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("call")
  public MediaSummary getCall() {
    return call;
  }
  public void setCall(MediaSummary call) {
    this.call = call;
  }

  
  /**
   **/
  public UserConversationSummary callback(MediaSummary callback) {
    this.callback = callback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callback")
  public MediaSummary getCallback() {
    return callback;
  }
  public void setCallback(MediaSummary callback) {
    this.callback = callback;
  }

  
  /**
   **/
  public UserConversationSummary email(MediaSummary email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public MediaSummary getEmail() {
    return email;
  }
  public void setEmail(MediaSummary email) {
    this.email = email;
  }

  
  /**
   **/
  public UserConversationSummary message(MediaSummary message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public MediaSummary getMessage() {
    return message;
  }
  public void setMessage(MediaSummary message) {
    this.message = message;
  }

  
  /**
   **/
  public UserConversationSummary chat(MediaSummary chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public MediaSummary getChat() {
    return chat;
  }
  public void setChat(MediaSummary chat) {
    this.chat = chat;
  }

  
  /**
   **/
  public UserConversationSummary socialExpression(MediaSummary socialExpression) {
    this.socialExpression = socialExpression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpression")
  public MediaSummary getSocialExpression() {
    return socialExpression;
  }
  public void setSocialExpression(MediaSummary socialExpression) {
    this.socialExpression = socialExpression;
  }

  
  /**
   **/
  public UserConversationSummary video(MediaSummary video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("video")
  public MediaSummary getVideo() {
    return video;
  }
  public void setVideo(MediaSummary video) {
    this.video = video;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummary userConversationSummary = (UserConversationSummary) o;
    return Objects.equals(this.userId, userConversationSummary.userId) &&
        Objects.equals(this.call, userConversationSummary.call) &&
        Objects.equals(this.callback, userConversationSummary.callback) &&
        Objects.equals(this.email, userConversationSummary.email) &&
        Objects.equals(this.message, userConversationSummary.message) &&
        Objects.equals(this.chat, userConversationSummary.chat) &&
        Objects.equals(this.socialExpression, userConversationSummary.socialExpression) &&
        Objects.equals(this.video, userConversationSummary.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, call, callback, email, message, chat, socialExpression, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummary {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    socialExpression: ").append(toIndentedString(socialExpression)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

