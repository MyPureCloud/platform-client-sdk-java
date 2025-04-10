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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessageEvent;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage
 */

public class V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage  implements Serializable {
  
  private V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVENT("Event");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets direction
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("Inbound"),
    OUTBOUND("Outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      events = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent>();
    }
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage channel(V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channel")
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel) {
    this.channel = channel;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage events(List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("events")
  public List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events) {
    this.events = events;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage = (V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage) o;

    return Objects.equals(this.channel, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.channel) &&
            Objects.equals(this.type, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.type) &&
            Objects.equals(this.events, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.events) &&
            Objects.equals(this.direction, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, type, events, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

