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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationEventCoBrowse;
import com.mypurecloud.sdk.v2.model.ConversationEventPresence;
import com.mypurecloud.sdk.v2.model.ConversationEventTyping;
import com.mypurecloud.sdk.v2.model.ConversationEventVideo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.
 */
@ApiModel(description = "Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.")

public class ConversationMessageEvent  implements Serializable {
  

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
   * Type of this event element
   */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
  public enum EventTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COBROWSE("CoBrowse"),
    TYPING("Typing"),
    PRESENCE("Presence"),
    VIDEO("Video"),
    UNKNOWN("Unknown");

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
  private ConversationEventCoBrowse coBrowse = null;
  private ConversationEventTyping typing = null;
  private ConversationEventPresence presence = null;
  private ConversationEventVideo video = null;

  public ConversationMessageEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of this event element
   **/
  public ConversationMessageEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of this event element")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   * CoBrowse event.
   **/
  public ConversationMessageEvent coBrowse(ConversationEventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CoBrowse event.")
  @JsonProperty("coBrowse")
  public ConversationEventCoBrowse getCoBrowse() {
    return coBrowse;
  }
  public void setCoBrowse(ConversationEventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
  }


  /**
   * Typing event.
   **/
  public ConversationMessageEvent typing(ConversationEventTyping typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Typing event.")
  @JsonProperty("typing")
  public ConversationEventTyping getTyping() {
    return typing;
  }
  public void setTyping(ConversationEventTyping typing) {
    this.typing = typing;
  }


  /**
   * Presence event.
   **/
  public ConversationMessageEvent presence(ConversationEventPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Presence event.")
  @JsonProperty("presence")
  public ConversationEventPresence getPresence() {
    return presence;
  }
  public void setPresence(ConversationEventPresence presence) {
    this.presence = presence;
  }


  /**
   * Video event.
   **/
  public ConversationMessageEvent video(ConversationEventVideo video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video event.")
  @JsonProperty("video")
  public ConversationEventVideo getVideo() {
    return video;
  }
  public void setVideo(ConversationEventVideo video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageEvent conversationMessageEvent = (ConversationMessageEvent) o;

    return Objects.equals(this.eventType, conversationMessageEvent.eventType) &&
            Objects.equals(this.coBrowse, conversationMessageEvent.coBrowse) &&
            Objects.equals(this.typing, conversationMessageEvent.typing) &&
            Objects.equals(this.presence, conversationMessageEvent.presence) &&
            Objects.equals(this.video, conversationMessageEvent.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, coBrowse, typing, presence, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEvent {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    coBrowse: ").append(toIndentedString(coBrowse)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

