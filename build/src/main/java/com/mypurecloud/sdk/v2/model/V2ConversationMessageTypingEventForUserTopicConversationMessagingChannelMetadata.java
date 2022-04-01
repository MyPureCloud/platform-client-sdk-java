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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata
 */

public class V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata  implements Serializable {
  
  private Map<String, String> customAttributes = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customAttributes")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }
  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata v2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata = (V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata) o;
    return Objects.equals(this.customAttributes, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata {\n");
    
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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

