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
import java.util.Date;

import java.io.Serializable;
/**
 * CommunicationEndedEvent
 */

public class CommunicationEndedEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String communicationId = null;

  private static class DisconnectTypeEnumDeserializer extends StdDeserializer<DisconnectTypeEnum> {
    public DisconnectTypeEnumDeserializer() {
      super(DisconnectTypeEnumDeserializer.class);
    }

    @Override
    public DisconnectTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DisconnectTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates how this communication was ended.
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SELF("Self"),
    PEER("Peer"),
    SYSTEM("System"),
    ERROR("Error"),
    TRANSFER("Transfer"),
    TRANSFERCONSULT("TransferConsult"),
    TRANSFERCONFERENCE("TransferConference");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private String destinationConversationId = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public CommunicationEndedEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique (V4 UUID) eventId for this event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommunicationEndedEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * A unique Id (V4 UUID) identifying this conversation
   **/
  public CommunicationEndedEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * A unique Id (V4 UUID) identifying this communication
   **/
  public CommunicationEndedEvent communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this communication")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * Indicates how this communication was ended.
   **/
  public CommunicationEndedEvent disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates how this communication was ended.")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }


  /**
   * The id (V4 UUID) of the conversation that the communication is being moved to when conversations are merged.
   **/
  public CommunicationEndedEvent destinationConversationId(String destinationConversationId) {
    this.destinationConversationId = destinationConversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id (V4 UUID) of the conversation that the communication is being moved to when conversations are merged.")
  @JsonProperty("destinationConversationId")
  public String getDestinationConversationId() {
    return destinationConversationId;
  }
  public void setDestinationConversationId(String destinationConversationId) {
    this.destinationConversationId = destinationConversationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationEndedEvent communicationEndedEvent = (CommunicationEndedEvent) o;

    return Objects.equals(this.eventId, communicationEndedEvent.eventId) &&
            Objects.equals(this.eventDateTime, communicationEndedEvent.eventDateTime) &&
            Objects.equals(this.conversationId, communicationEndedEvent.conversationId) &&
            Objects.equals(this.communicationId, communicationEndedEvent.communicationId) &&
            Objects.equals(this.disconnectType, communicationEndedEvent.disconnectType) &&
            Objects.equals(this.destinationConversationId, communicationEndedEvent.destinationConversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, communicationId, disconnectType, destinationConversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationEndedEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    destinationConversationId: ").append(toIndentedString(destinationConversationId)).append("\n");
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

