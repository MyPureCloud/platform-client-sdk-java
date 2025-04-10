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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageMetadataContent;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageMetadataEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Metadata information about a message.
 */
@ApiModel(description = "Metadata information about a message.")

public class QueueConversationSocialExpressionEventTopicMessageMetadata  implements Serializable {
  
  private String type = null;
  private List<QueueConversationSocialExpressionEventTopicMessageMetadataEvent> events = null;
  private List<QueueConversationSocialExpressionEventTopicMessageMetadataContent> content = null;

  public QueueConversationSocialExpressionEventTopicMessageMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      events = new ArrayList<QueueConversationSocialExpressionEventTopicMessageMetadataEvent>();
      content = new ArrayList<QueueConversationSocialExpressionEventTopicMessageMetadataContent>();
    }
  }

  
  /**
   * Message type.
   **/
  public QueueConversationSocialExpressionEventTopicMessageMetadata type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message type.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * List of message events, if any
   **/
  public QueueConversationSocialExpressionEventTopicMessageMetadata events(List<QueueConversationSocialExpressionEventTopicMessageMetadataEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message events, if any")
  @JsonProperty("events")
  public List<QueueConversationSocialExpressionEventTopicMessageMetadataEvent> getEvents() {
    return events;
  }
  public void setEvents(List<QueueConversationSocialExpressionEventTopicMessageMetadataEvent> events) {
    this.events = events;
  }


  /**
   * List of message content, if any
   **/
  public QueueConversationSocialExpressionEventTopicMessageMetadata content(List<QueueConversationSocialExpressionEventTopicMessageMetadataContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message content, if any")
  @JsonProperty("content")
  public List<QueueConversationSocialExpressionEventTopicMessageMetadataContent> getContent() {
    return content;
  }
  public void setContent(List<QueueConversationSocialExpressionEventTopicMessageMetadataContent> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicMessageMetadata queueConversationSocialExpressionEventTopicMessageMetadata = (QueueConversationSocialExpressionEventTopicMessageMetadata) o;

    return Objects.equals(this.type, queueConversationSocialExpressionEventTopicMessageMetadata.type) &&
            Objects.equals(this.events, queueConversationSocialExpressionEventTopicMessageMetadata.events) &&
            Objects.equals(this.content, queueConversationSocialExpressionEventTopicMessageMetadata.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, events, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicMessageMetadata {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

