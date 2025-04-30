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
import com.mypurecloud.sdk.v2.model.MobileSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserSettingsForChat
 */

public class UserSettingsForChat  implements Serializable {
  
  private Boolean muted = null;
  private Boolean mentionsOnly = null;
  private Boolean notifyOnReactions = null;
  private MobileSettings mobile = null;

  public UserSettingsForChat() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether or not to enable muting notifications
   **/
  public UserSettingsForChat muted(Boolean muted) {
    this.muted = muted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to enable muting notifications")
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
  public UserSettingsForChat mentionsOnly(Boolean mentionsOnly) {
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
  public UserSettingsForChat notifyOnReactions(Boolean notifyOnReactions) {
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


  /**
   * Settings for mobile devices
   **/
  public UserSettingsForChat mobile(MobileSettings mobile) {
    this.mobile = mobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings for mobile devices")
  @JsonProperty("mobile")
  public MobileSettings getMobile() {
    return mobile;
  }
  public void setMobile(MobileSettings mobile) {
    this.mobile = mobile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsForChat userSettingsForChat = (UserSettingsForChat) o;

    return Objects.equals(this.muted, userSettingsForChat.muted) &&
            Objects.equals(this.mentionsOnly, userSettingsForChat.mentionsOnly) &&
            Objects.equals(this.notifyOnReactions, userSettingsForChat.notifyOnReactions) &&
            Objects.equals(this.mobile, userSettingsForChat.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(muted, mentionsOnly, notifyOnReactions, mobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsForChat {\n");
    
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    mentionsOnly: ").append(toIndentedString(mentionsOnly)).append("\n");
    sb.append("    notifyOnReactions: ").append(toIndentedString(notifyOnReactions)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

