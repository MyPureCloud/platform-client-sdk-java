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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContentReaction;
import com.mypurecloud.sdk.v2.model.EventCoBrowse;
import com.mypurecloud.sdk.v2.model.EventPresence;
import com.mypurecloud.sdk.v2.model.EventTyping;
import com.mypurecloud.sdk.v2.model.EventVideo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.
 */
@ApiModel(description = "Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.")

public class MessageEvent  implements Serializable {
  

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
    REACTIONS("Reactions");

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
  private EventCoBrowse coBrowse = null;
  private EventTyping typing = null;
  private EventPresence presence = null;
  private EventVideo video = null;
  private List<ContentReaction> reactions = new ArrayList<ContentReaction>();

  
  /**
   * Type of this event element
   **/
  public MessageEvent eventType(EventTypeEnum eventType) {
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
  public MessageEvent coBrowse(EventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CoBrowse event.")
  @JsonProperty("coBrowse")
  public EventCoBrowse getCoBrowse() {
    return coBrowse;
  }
  public void setCoBrowse(EventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
  }


  /**
   * Typing event.
   **/
  public MessageEvent typing(EventTyping typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Typing event.")
  @JsonProperty("typing")
  public EventTyping getTyping() {
    return typing;
  }
  public void setTyping(EventTyping typing) {
    this.typing = typing;
  }


  /**
   * Presence event.
   **/
  public MessageEvent presence(EventPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Presence event.")
  @JsonProperty("presence")
  public EventPresence getPresence() {
    return presence;
  }
  public void setPresence(EventPresence presence) {
    this.presence = presence;
  }


  /**
   * Video event.
   **/
  public MessageEvent video(EventVideo video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video event.")
  @JsonProperty("video")
  public EventVideo getVideo() {
    return video;
  }
  public void setVideo(EventVideo video) {
    this.video = video;
  }


  /**
   * A list of reactions to a message.
   **/
  public MessageEvent reactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of reactions to a message.")
  @JsonProperty("reactions")
  public List<ContentReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageEvent messageEvent = (MessageEvent) o;

    return Objects.equals(this.eventType, messageEvent.eventType) &&
            Objects.equals(this.coBrowse, messageEvent.coBrowse) &&
            Objects.equals(this.typing, messageEvent.typing) &&
            Objects.equals(this.presence, messageEvent.presence) &&
            Objects.equals(this.video, messageEvent.video) &&
            Objects.equals(this.reactions, messageEvent.reactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, coBrowse, typing, presence, video, reactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageEvent {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    coBrowse: ").append(toIndentedString(coBrowse)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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

