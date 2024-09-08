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
import com.mypurecloud.sdk.v2.model.AutoStart;
import com.mypurecloud.sdk.v2.model.ConversationClearSettings;
import com.mypurecloud.sdk.v2.model.ConversationDisconnectSettings;
import com.mypurecloud.sdk.v2.model.Humanize;
import com.mypurecloud.sdk.v2.model.Markdown;
import com.mypurecloud.sdk.v2.model.NotificationsSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Conversation settings that handles chats within the messenger
 */
@ApiModel(description = "Conversation settings that handles chats within the messenger")

public class ConversationAppSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean showAgentTypingIndicator = null;
  private Boolean showUserTypingIndicator = null;
  private AutoStart autoStart = null;
  private Markdown markdown = null;
  private ConversationDisconnectSettings conversationDisconnect = null;
  private ConversationClearSettings conversationClear = null;
  private Humanize humanize = null;
  private NotificationsSettings notifications = null;

  
  /**
   * The toggle to enable or disable conversations
   **/
  public ConversationAppSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable conversations")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The toggle to enable or disable typing indicator for messenger
   **/
  public ConversationAppSettings showAgentTypingIndicator(Boolean showAgentTypingIndicator) {
    this.showAgentTypingIndicator = showAgentTypingIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable typing indicator for messenger")
  @JsonProperty("showAgentTypingIndicator")
  public Boolean getShowAgentTypingIndicator() {
    return showAgentTypingIndicator;
  }
  public void setShowAgentTypingIndicator(Boolean showAgentTypingIndicator) {
    this.showAgentTypingIndicator = showAgentTypingIndicator;
  }


  /**
   * The toggle to enable or disable typing indicator for messenger
   **/
  public ConversationAppSettings showUserTypingIndicator(Boolean showUserTypingIndicator) {
    this.showUserTypingIndicator = showUserTypingIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable typing indicator for messenger")
  @JsonProperty("showUserTypingIndicator")
  public Boolean getShowUserTypingIndicator() {
    return showUserTypingIndicator;
  }
  public void setShowUserTypingIndicator(Boolean showUserTypingIndicator) {
    this.showUserTypingIndicator = showUserTypingIndicator;
  }


  /**
   * The auto start for the messenger conversation
   **/
  public ConversationAppSettings autoStart(AutoStart autoStart) {
    this.autoStart = autoStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The auto start for the messenger conversation")
  @JsonProperty("autoStart")
  public AutoStart getAutoStart() {
    return autoStart;
  }
  public void setAutoStart(AutoStart autoStart) {
    this.autoStart = autoStart;
  }


  /**
   * The markdown for the messenger app
   **/
  public ConversationAppSettings markdown(Markdown markdown) {
    this.markdown = markdown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The markdown for the messenger app")
  @JsonProperty("markdown")
  public Markdown getMarkdown() {
    return markdown;
  }
  public void setMarkdown(Markdown markdown) {
    this.markdown = markdown;
  }


  /**
   * The conversation disconnect settings for the messenger app
   **/
  public ConversationAppSettings conversationDisconnect(ConversationDisconnectSettings conversationDisconnect) {
    this.conversationDisconnect = conversationDisconnect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation disconnect settings for the messenger app")
  @JsonProperty("conversationDisconnect")
  public ConversationDisconnectSettings getConversationDisconnect() {
    return conversationDisconnect;
  }
  public void setConversationDisconnect(ConversationDisconnectSettings conversationDisconnect) {
    this.conversationDisconnect = conversationDisconnect;
  }


  /**
   * The conversation clear settings for the messenger app
   **/
  public ConversationAppSettings conversationClear(ConversationClearSettings conversationClear) {
    this.conversationClear = conversationClear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation clear settings for the messenger app")
  @JsonProperty("conversationClear")
  public ConversationClearSettings getConversationClear() {
    return conversationClear;
  }
  public void setConversationClear(ConversationClearSettings conversationClear) {
    this.conversationClear = conversationClear;
  }


  /**
   * The humanize conversations settings for the messenger app
   **/
  public ConversationAppSettings humanize(Humanize humanize) {
    this.humanize = humanize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The humanize conversations settings for the messenger app")
  @JsonProperty("humanize")
  public Humanize getHumanize() {
    return humanize;
  }
  public void setHumanize(Humanize humanize) {
    this.humanize = humanize;
  }


  /**
   * The notification settings for messenger apps
   **/
  public ConversationAppSettings notifications(NotificationsSettings notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The notification settings for messenger apps")
  @JsonProperty("notifications")
  public NotificationsSettings getNotifications() {
    return notifications;
  }
  public void setNotifications(NotificationsSettings notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAppSettings conversationAppSettings = (ConversationAppSettings) o;

    return Objects.equals(this.enabled, conversationAppSettings.enabled) &&
            Objects.equals(this.showAgentTypingIndicator, conversationAppSettings.showAgentTypingIndicator) &&
            Objects.equals(this.showUserTypingIndicator, conversationAppSettings.showUserTypingIndicator) &&
            Objects.equals(this.autoStart, conversationAppSettings.autoStart) &&
            Objects.equals(this.markdown, conversationAppSettings.markdown) &&
            Objects.equals(this.conversationDisconnect, conversationAppSettings.conversationDisconnect) &&
            Objects.equals(this.conversationClear, conversationAppSettings.conversationClear) &&
            Objects.equals(this.humanize, conversationAppSettings.humanize) &&
            Objects.equals(this.notifications, conversationAppSettings.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, showAgentTypingIndicator, showUserTypingIndicator, autoStart, markdown, conversationDisconnect, conversationClear, humanize, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAppSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    showAgentTypingIndicator: ").append(toIndentedString(showAgentTypingIndicator)).append("\n");
    sb.append("    showUserTypingIndicator: ").append(toIndentedString(showUserTypingIndicator)).append("\n");
    sb.append("    autoStart: ").append(toIndentedString(autoStart)).append("\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
    sb.append("    conversationDisconnect: ").append(toIndentedString(conversationDisconnect)).append("\n");
    sb.append("    conversationClear: ").append(toIndentedString(conversationClear)).append("\n");
    sb.append("    humanize: ").append(toIndentedString(humanize)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

