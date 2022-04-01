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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicMessageData
 */

public class V2ConversationMessageTypingEventForUserTopicMessageData  implements Serializable {
  
  private String conversationId = null;
  private V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage normalizedMessage = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicMessageData conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicMessageData normalizedMessage(V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage normalizedMessage) {
    this.normalizedMessage = normalizedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("normalizedMessage")
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage getNormalizedMessage() {
    return normalizedMessage;
  }
  public void setNormalizedMessage(V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage normalizedMessage) {
    this.normalizedMessage = normalizedMessage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicMessageData v2ConversationMessageTypingEventForUserTopicMessageData = (V2ConversationMessageTypingEventForUserTopicMessageData) o;
    return Objects.equals(this.conversationId, v2ConversationMessageTypingEventForUserTopicMessageData.conversationId) &&
        Objects.equals(this.normalizedMessage, v2ConversationMessageTypingEventForUserTopicMessageData.normalizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, normalizedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicMessageData {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    normalizedMessage: ").append(toIndentedString(normalizedMessage)).append("\n");
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

