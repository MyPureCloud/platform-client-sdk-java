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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Conversation settings that handles chats within the messenger
 */
@ApiModel(description = "Conversation settings that handles chats within the messenger")

public class ConversationAppSettings  implements Serializable {
  
  private Boolean showAgentTypingIndicator = null;
  private Boolean showUserTypingIndicator = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAppSettings conversationAppSettings = (ConversationAppSettings) o;
    return Objects.equals(this.showAgentTypingIndicator, conversationAppSettings.showAgentTypingIndicator) &&
        Objects.equals(this.showUserTypingIndicator, conversationAppSettings.showUserTypingIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAgentTypingIndicator, showUserTypingIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAppSettings {\n");
    
    sb.append("    showAgentTypingIndicator: ").append(toIndentedString(showAgentTypingIndicator)).append("\n");
    sb.append("    showUserTypingIndicator: ").append(toIndentedString(showUserTypingIndicator)).append("\n");
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

