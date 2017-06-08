package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserConversationSummaryNotificationCall;
import com.mypurecloud.sdk.v2.model.UserConversationSummaryNotificationMediaSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationSummaryNotification
 */

public class UserConversationSummaryNotification  implements Serializable {
  
  private String userId = null;
  private UserConversationSummaryNotificationCall call = null;
  private UserConversationSummaryNotificationMediaSummary callback = null;
  private UserConversationSummaryNotificationMediaSummary email = null;
  private UserConversationSummaryNotificationMediaSummary chat = null;
  private UserConversationSummaryNotificationMediaSummary socialExpression = null;
  private UserConversationSummaryNotificationMediaSummary video = null;

  
  /**
   **/
  public UserConversationSummaryNotification userId(String userId) {
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
  public UserConversationSummaryNotification call(UserConversationSummaryNotificationCall call) {
    this.call = call;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("call")
  public UserConversationSummaryNotificationCall getCall() {
    return call;
  }
  public void setCall(UserConversationSummaryNotificationCall call) {
    this.call = call;
  }

  
  /**
   **/
  public UserConversationSummaryNotification callback(UserConversationSummaryNotificationMediaSummary callback) {
    this.callback = callback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callback")
  public UserConversationSummaryNotificationMediaSummary getCallback() {
    return callback;
  }
  public void setCallback(UserConversationSummaryNotificationMediaSummary callback) {
    this.callback = callback;
  }

  
  /**
   **/
  public UserConversationSummaryNotification email(UserConversationSummaryNotificationMediaSummary email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public UserConversationSummaryNotificationMediaSummary getEmail() {
    return email;
  }
  public void setEmail(UserConversationSummaryNotificationMediaSummary email) {
    this.email = email;
  }

  
  /**
   **/
  public UserConversationSummaryNotification chat(UserConversationSummaryNotificationMediaSummary chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public UserConversationSummaryNotificationMediaSummary getChat() {
    return chat;
  }
  public void setChat(UserConversationSummaryNotificationMediaSummary chat) {
    this.chat = chat;
  }

  
  /**
   **/
  public UserConversationSummaryNotification socialExpression(UserConversationSummaryNotificationMediaSummary socialExpression) {
    this.socialExpression = socialExpression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialExpression")
  public UserConversationSummaryNotificationMediaSummary getSocialExpression() {
    return socialExpression;
  }
  public void setSocialExpression(UserConversationSummaryNotificationMediaSummary socialExpression) {
    this.socialExpression = socialExpression;
  }

  
  /**
   **/
  public UserConversationSummaryNotification video(UserConversationSummaryNotificationMediaSummary video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("video")
  public UserConversationSummaryNotificationMediaSummary getVideo() {
    return video;
  }
  public void setVideo(UserConversationSummaryNotificationMediaSummary video) {
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
    UserConversationSummaryNotification userConversationSummaryNotification = (UserConversationSummaryNotification) o;
    return Objects.equals(this.userId, userConversationSummaryNotification.userId) &&
        Objects.equals(this.call, userConversationSummaryNotification.call) &&
        Objects.equals(this.callback, userConversationSummaryNotification.callback) &&
        Objects.equals(this.email, userConversationSummaryNotification.email) &&
        Objects.equals(this.chat, userConversationSummaryNotification.chat) &&
        Objects.equals(this.socialExpression, userConversationSummaryNotification.socialExpression) &&
        Objects.equals(this.video, userConversationSummaryNotification.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, call, callback, email, chat, socialExpression, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotification {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

