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
 * UserTransferEvent
 */

public class UserTransferEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the desired type of transfer.
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDED("Attended"),
    UNATTENDED("Unattended");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;
  private String commandId = null;
  private String initiatingCommunicationId = null;
  private String targetCommunicationId = null;
  private String objectCommunicationId = null;
  private String destinationUserId = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public UserTransferEvent eventId(String eventId) {
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
  public UserTransferEvent eventDateTime(Date eventDateTime) {
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
  public UserTransferEvent conversationId(String conversationId) {
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
   * Indicates the desired type of transfer.
   **/
  public UserTransferEvent transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the desired type of transfer.")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  /**
   * The id (V4 UUID) used by the external platform to refer to the transfer in subsequent Transfer events.
   **/
  public UserTransferEvent commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) used by the external platform to refer to the transfer in subsequent Transfer events.")
  @JsonProperty("commandId")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * The id (V4 UUID) of the communication representing the participant that is initiating the transfer.
   **/
  public UserTransferEvent initiatingCommunicationId(String initiatingCommunicationId) {
    this.initiatingCommunicationId = initiatingCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the communication representing the participant that is initiating the transfer.")
  @JsonProperty("initiatingCommunicationId")
  public String getInitiatingCommunicationId() {
    return initiatingCommunicationId;
  }
  public void setInitiatingCommunicationId(String initiatingCommunicationId) {
    this.initiatingCommunicationId = initiatingCommunicationId;
  }


  /**
   * The id (V4 UUID) of the communication that is being transferred away from. In many cases this will be the same as the `initiatingCommunicationId`.
   **/
  public UserTransferEvent targetCommunicationId(String targetCommunicationId) {
    this.targetCommunicationId = targetCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the communication that is being transferred away from. In many cases this will be the same as the `initiatingCommunicationId`.")
  @JsonProperty("targetCommunicationId")
  public String getTargetCommunicationId() {
    return targetCommunicationId;
  }
  public void setTargetCommunicationId(String targetCommunicationId) {
    this.targetCommunicationId = targetCommunicationId;
  }


  /**
   * The id (V4 UUID) of the communication that is being transferred.
   **/
  public UserTransferEvent objectCommunicationId(String objectCommunicationId) {
    this.objectCommunicationId = objectCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the communication that is being transferred.")
  @JsonProperty("objectCommunicationId")
  public String getObjectCommunicationId() {
    return objectCommunicationId;
  }
  public void setObjectCommunicationId(String objectCommunicationId) {
    this.objectCommunicationId = objectCommunicationId;
  }


  /**
   * The id (V4 UUID) of the desired destination user that the object communication should be transferred to.
   **/
  public UserTransferEvent destinationUserId(String destinationUserId) {
    this.destinationUserId = destinationUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the desired destination user that the object communication should be transferred to.")
  @JsonProperty("destinationUserId")
  public String getDestinationUserId() {
    return destinationUserId;
  }
  public void setDestinationUserId(String destinationUserId) {
    this.destinationUserId = destinationUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTransferEvent userTransferEvent = (UserTransferEvent) o;

    return Objects.equals(this.eventId, userTransferEvent.eventId) &&
            Objects.equals(this.eventDateTime, userTransferEvent.eventDateTime) &&
            Objects.equals(this.conversationId, userTransferEvent.conversationId) &&
            Objects.equals(this.transferType, userTransferEvent.transferType) &&
            Objects.equals(this.commandId, userTransferEvent.commandId) &&
            Objects.equals(this.initiatingCommunicationId, userTransferEvent.initiatingCommunicationId) &&
            Objects.equals(this.targetCommunicationId, userTransferEvent.targetCommunicationId) &&
            Objects.equals(this.objectCommunicationId, userTransferEvent.objectCommunicationId) &&
            Objects.equals(this.destinationUserId, userTransferEvent.destinationUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, transferType, commandId, initiatingCommunicationId, targetCommunicationId, objectCommunicationId, destinationUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTransferEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    initiatingCommunicationId: ").append(toIndentedString(initiatingCommunicationId)).append("\n");
    sb.append("    targetCommunicationId: ").append(toIndentedString(targetCommunicationId)).append("\n");
    sb.append("    objectCommunicationId: ").append(toIndentedString(objectCommunicationId)).append("\n");
    sb.append("    destinationUserId: ").append(toIndentedString(destinationUserId)).append("\n");
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

