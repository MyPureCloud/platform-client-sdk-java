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
 * EndTransferEvent
 */

public class EndTransferEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String commandId = null;

  private static class FinalStateEnumDeserializer extends StdDeserializer<FinalStateEnum> {
    public FinalStateEnumDeserializer() {
      super(FinalStateEnumDeserializer.class);
    }

    @Override
    public FinalStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FinalStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates whether the transfer completed successfully, was cancelled, or failed for some reason.
   */
 @JsonDeserialize(using = FinalStateEnumDeserializer.class)
  public enum FinalStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETED("Completed"),
    CANCELED("Canceled"),
    FAILED("Failed");

    private String value;

    FinalStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FinalStateEnum fromString(String key) {
      if (key == null) return null;

      for (FinalStateEnum value : FinalStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FinalStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FinalStateEnum finalState = null;
  private String objectCommunicationId = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public EndTransferEvent eventId(String eventId) {
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
  public EndTransferEvent eventDateTime(Date eventDateTime) {
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
  public EndTransferEvent conversationId(String conversationId) {
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
   * The id (V4 UUID) used to identify the transfer already started by the external platform.
   **/
  public EndTransferEvent commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) used to identify the transfer already started by the external platform.")
  @JsonProperty("commandId")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Indicates whether the transfer completed successfully, was cancelled, or failed for some reason.
   **/
  public EndTransferEvent finalState(FinalStateEnum finalState) {
    this.finalState = finalState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the transfer completed successfully, was cancelled, or failed for some reason.")
  @JsonProperty("finalState")
  public FinalStateEnum getFinalState() {
    return finalState;
  }
  public void setFinalState(FinalStateEnum finalState) {
    this.finalState = finalState;
  }


  /**
   * The id (V4 UUID) of the communication that was being transferred.
   **/
  public EndTransferEvent objectCommunicationId(String objectCommunicationId) {
    this.objectCommunicationId = objectCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the communication that was being transferred.")
  @JsonProperty("objectCommunicationId")
  public String getObjectCommunicationId() {
    return objectCommunicationId;
  }
  public void setObjectCommunicationId(String objectCommunicationId) {
    this.objectCommunicationId = objectCommunicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndTransferEvent endTransferEvent = (EndTransferEvent) o;

    return Objects.equals(this.eventId, endTransferEvent.eventId) &&
            Objects.equals(this.eventDateTime, endTransferEvent.eventDateTime) &&
            Objects.equals(this.conversationId, endTransferEvent.conversationId) &&
            Objects.equals(this.commandId, endTransferEvent.commandId) &&
            Objects.equals(this.finalState, endTransferEvent.finalState) &&
            Objects.equals(this.objectCommunicationId, endTransferEvent.objectCommunicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, commandId, finalState, objectCommunicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndTransferEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    finalState: ").append(toIndentedString(finalState)).append("\n");
    sb.append("    objectCommunicationId: ").append(toIndentedString(objectCommunicationId)).append("\n");
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

