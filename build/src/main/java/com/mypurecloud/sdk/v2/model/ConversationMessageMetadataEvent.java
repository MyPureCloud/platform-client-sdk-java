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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Metadata information about a message event.
 */
@ApiModel(description = "Metadata information about a message event.")

public class ConversationMessageMetadataEvent  implements Serializable {
  

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

  private static class SubTypeEnumDeserializer extends StdDeserializer<SubTypeEnum> {
    public SubTypeEnumDeserializer() {
      super(SubTypeEnumDeserializer.class);
    }

    @Override
    public SubTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Event subtype
   */
 @JsonDeserialize(using = SubTypeEnumDeserializer.class)
  public enum SubTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("On"),
    JOIN("Join"),
    OFFERING("Offering"),
    OFFERINGEXPIRED("OfferingExpired"),
    OFFERINGACCEPTED("OfferingAccepted"),
    OFFERINGREJECTED("OfferingRejected"),
    DISCONNECT("Disconnect"),
    CLEAR("Clear"),
    SIGNIN("SignIn"),
    SESSIONEXPIRED("SessionExpired"),
    UNKNOWN("Unknown");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubTypeEnum value : SubTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubTypeEnum subType = null;

  
  /**
   * Type of this event element
   **/
  public ConversationMessageMetadataEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this event element")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   * Event subtype
   **/
  public ConversationMessageMetadataEvent subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event subtype")
  @JsonProperty("subType")
  public SubTypeEnum getSubType() {
    return subType;
  }
  public void setSubType(SubTypeEnum subType) {
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
    ConversationMessageMetadataEvent conversationMessageMetadataEvent = (ConversationMessageMetadataEvent) o;

    return Objects.equals(this.eventType, conversationMessageMetadataEvent.eventType) &&
            Objects.equals(this.subType, conversationMessageMetadataEvent.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageMetadataEvent {\n");
    
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

