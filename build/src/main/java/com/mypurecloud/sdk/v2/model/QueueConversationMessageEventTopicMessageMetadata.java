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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageMetadataContent;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageMetadataEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicMessageMetadata
 */

public class QueueConversationMessageEventTopicMessageMetadata  implements Serializable {
  
  private String type = null;
  private List<QueueConversationMessageEventTopicMessageMetadataEvent> events = null;
  private List<QueueConversationMessageEventTopicMessageMetadataContent> content = null;

  
  /**
   * Message type.
   **/
  public QueueConversationMessageEventTopicMessageMetadata type(String type) {
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
  public QueueConversationMessageEventTopicMessageMetadata events(List<QueueConversationMessageEventTopicMessageMetadataEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message events, if any")
  @JsonProperty("events")
  public List<QueueConversationMessageEventTopicMessageMetadataEvent> getEvents() {
    return events;
  }
  public void setEvents(List<QueueConversationMessageEventTopicMessageMetadataEvent> events) {
    this.events = events;
  }


  /**
   * List of message content, if any
   **/
  public QueueConversationMessageEventTopicMessageMetadata content(List<QueueConversationMessageEventTopicMessageMetadataContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message content, if any")
  @JsonProperty("content")
  public List<QueueConversationMessageEventTopicMessageMetadataContent> getContent() {
    return content;
  }
  public void setContent(List<QueueConversationMessageEventTopicMessageMetadataContent> content) {
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
    QueueConversationMessageEventTopicMessageMetadata queueConversationMessageEventTopicMessageMetadata = (QueueConversationMessageEventTopicMessageMetadata) o;

    return Objects.equals(this.type, queueConversationMessageEventTopicMessageMetadata.type) &&
            Objects.equals(this.events, queueConversationMessageEventTopicMessageMetadata.events) &&
            Objects.equals(this.content, queueConversationMessageEventTopicMessageMetadata.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, events, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicMessageMetadata {\n");
    
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

