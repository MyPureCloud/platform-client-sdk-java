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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserChatSettingsPost
 */

public class UserChatSettingsPost  implements Serializable {
  
  private Boolean muted = null;
  private Boolean mentionsOnly = null;
  private Boolean notifyOnReactions = null;

  public UserChatSettingsPost() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether or not to enable muting notifications
   **/
  public UserChatSettingsPost muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not to enable muting notifications")
  @JsonProperty("muted")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  /**
   * Whether or not to enable notifications for mentions only
   **/
  public UserChatSettingsPost mentionsOnly(Boolean mentionsOnly) {
    this.mentionsOnly = mentionsOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to enable notifications for mentions only")
  @JsonProperty("mentionsOnly")
  public Boolean getMentionsOnly() {
    return mentionsOnly;
  }
  public void setMentionsOnly(Boolean mentionsOnly) {
    this.mentionsOnly = mentionsOnly;
  }


  /**
   * Whether or not to enable notifications for reactions on a user's own messages
   **/
  public UserChatSettingsPost notifyOnReactions(Boolean notifyOnReactions) {
    this.notifyOnReactions = notifyOnReactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to enable notifications for reactions on a user's own messages")
  @JsonProperty("notifyOnReactions")
  public Boolean getNotifyOnReactions() {
    return notifyOnReactions;
  }
  public void setNotifyOnReactions(Boolean notifyOnReactions) {
    this.notifyOnReactions = notifyOnReactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserChatSettingsPost userChatSettingsPost = (UserChatSettingsPost) o;

    return Objects.equals(this.muted, userChatSettingsPost.muted) &&
            Objects.equals(this.mentionsOnly, userChatSettingsPost.mentionsOnly) &&
            Objects.equals(this.notifyOnReactions, userChatSettingsPost.notifyOnReactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(muted, mentionsOnly, notifyOnReactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChatSettingsPost {\n");
    
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    mentionsOnly: ").append(toIndentedString(mentionsOnly)).append("\n");
    sb.append("    notifyOnReactions: ").append(toIndentedString(notifyOnReactions)).append("\n");
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

