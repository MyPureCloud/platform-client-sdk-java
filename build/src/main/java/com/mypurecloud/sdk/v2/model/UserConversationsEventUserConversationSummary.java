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
import com.mypurecloud.sdk.v2.model.UserConversationsEventMediaSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationsEventUserConversationSummary
 */

public class UserConversationsEventUserConversationSummary  implements Serializable {
  
  private String userId = null;
  private UserConversationsEventMediaSummary call = null;
  private UserConversationsEventMediaSummary callback = null;
  private UserConversationsEventMediaSummary email = null;
  private UserConversationsEventMediaSummary message = null;
  private UserConversationsEventMediaSummary chat = null;
  private UserConversationsEventMediaSummary socialExpression = null;
  private UserConversationsEventMediaSummary video = null;

  
  /**
   **/
  public UserConversationsEventUserConversationSummary userId(String userId) {
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
  public UserConversationsEventUserConversationSummary call(UserConversationsEventMediaSummary call) {
    this.call = call;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("call")
  public UserConversationsEventMediaSummary getCall() {
    return call;
  }
  public void setCall(UserConversationsEventMediaSummary call) {
    this.call = call;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary callback(UserConversationsEventMediaSummary callback) {
    this.callback = callback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callback")
  public UserConversationsEventMediaSummary getCallback() {
    return callback;
  }
  public void setCallback(UserConversationsEventMediaSummary callback) {
    this.callback = callback;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary email(UserConversationsEventMediaSummary email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public UserConversationsEventMediaSummary getEmail() {
    return email;
  }
  public void setEmail(UserConversationsEventMediaSummary email) {
    this.email = email;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary message(UserConversationsEventMediaSummary message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public UserConversationsEventMediaSummary getMessage() {
    return message;
  }
  public void setMessage(UserConversationsEventMediaSummary message) {
    this.message = message;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary chat(UserConversationsEventMediaSummary chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public UserConversationsEventMediaSummary getChat() {
    return chat;
  }
  public void setChat(UserConversationsEventMediaSummary chat) {
    this.chat = chat;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary socialExpression(UserConversationsEventMediaSummary socialExpression) {
    this.socialExpression = socialExpression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpression")
  public UserConversationsEventMediaSummary getSocialExpression() {
    return socialExpression;
  }
  public void setSocialExpression(UserConversationsEventMediaSummary socialExpression) {
    this.socialExpression = socialExpression;
  }

  
  /**
   **/
  public UserConversationsEventUserConversationSummary video(UserConversationsEventMediaSummary video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("video")
  public UserConversationsEventMediaSummary getVideo() {
    return video;
  }
  public void setVideo(UserConversationsEventMediaSummary video) {
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
    UserConversationsEventUserConversationSummary userConversationsEventUserConversationSummary = (UserConversationsEventUserConversationSummary) o;
    return Objects.equals(this.userId, userConversationsEventUserConversationSummary.userId) &&
        Objects.equals(this.call, userConversationsEventUserConversationSummary.call) &&
        Objects.equals(this.callback, userConversationsEventUserConversationSummary.callback) &&
        Objects.equals(this.email, userConversationsEventUserConversationSummary.email) &&
        Objects.equals(this.message, userConversationsEventUserConversationSummary.message) &&
        Objects.equals(this.chat, userConversationsEventUserConversationSummary.chat) &&
        Objects.equals(this.socialExpression, userConversationsEventUserConversationSummary.socialExpression) &&
        Objects.equals(this.video, userConversationsEventUserConversationSummary.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, call, callback, email, message, chat, socialExpression, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationsEventUserConversationSummary {\n");
    
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

