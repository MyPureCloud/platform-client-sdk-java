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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationEventTopicMessageMetadataEvent
 */

public class QueueConversationEventTopicMessageMetadataEvent  implements Serializable {
  
  private String eventType = null;
  private String subType = null;

  
  /**
   * Type of this event element.
   **/
  public QueueConversationEventTopicMessageMetadataEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this event element.")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  /**
   * Event subtype, if any
   **/
  public QueueConversationEventTopicMessageMetadataEvent subType(String subType) {
    this.subType = subType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event subtype, if any")
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicMessageMetadataEvent queueConversationEventTopicMessageMetadataEvent = (QueueConversationEventTopicMessageMetadataEvent) o;

    return Objects.equals(this.eventType, queueConversationEventTopicMessageMetadataEvent.eventType) &&
            Objects.equals(this.subType, queueConversationEventTopicMessageMetadataEvent.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicMessageMetadataEvent {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

