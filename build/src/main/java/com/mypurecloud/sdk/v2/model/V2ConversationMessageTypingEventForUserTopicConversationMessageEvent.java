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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationEventCoBrowse;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationEventTyping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationMessageEvent
 */

public class V2ConversationMessageTypingEventForUserTopicConversationMessageEvent  implements Serializable {
  

  private static class EventTypeEnumDeserializer extends StdDeserializer<EventTypeEnum> {
    public EventTypeEnumDeserializer() {
      super(EventTypeEnumDeserializer.class);
    }

    @Override
    public EventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EventTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets eventType
   */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
  public enum EventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COBROWSE("CoBrowse"),
    TYPING("Typing");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EventTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EventTypeEnum value : EventTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EventTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EventTypeEnum eventType = null;
  private V2ConversationMessageTypingEventForUserTopicConversationEventCoBrowse coBrowse = null;
  private V2ConversationMessageTypingEventForUserTopicConversationEventTyping typing = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageEvent coBrowse(V2ConversationMessageTypingEventForUserTopicConversationEventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("coBrowse")
  public V2ConversationMessageTypingEventForUserTopicConversationEventCoBrowse getCoBrowse() {
    return coBrowse;
  }
  public void setCoBrowse(V2ConversationMessageTypingEventForUserTopicConversationEventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessageEvent typing(V2ConversationMessageTypingEventForUserTopicConversationEventTyping typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("typing")
  public V2ConversationMessageTypingEventForUserTopicConversationEventTyping getTyping() {
    return typing;
  }
  public void setTyping(V2ConversationMessageTypingEventForUserTopicConversationEventTyping typing) {
    this.typing = typing;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationMessageEvent v2ConversationMessageTypingEventForUserTopicConversationMessageEvent = (V2ConversationMessageTypingEventForUserTopicConversationMessageEvent) o;
    return Objects.equals(this.eventType, v2ConversationMessageTypingEventForUserTopicConversationMessageEvent.eventType) &&
        Objects.equals(this.coBrowse, v2ConversationMessageTypingEventForUserTopicConversationMessageEvent.coBrowse) &&
        Objects.equals(this.typing, v2ConversationMessageTypingEventForUserTopicConversationMessageEvent.typing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, coBrowse, typing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationMessageEvent {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    coBrowse: ").append(toIndentedString(coBrowse)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
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

