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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingTransferEvent
 */

public class RoutingTransferEvent  implements Serializable {
  
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
  private String destinationQueueId = null;
  private String languageId = null;
  private List<String> skillIds = null;

  public RoutingTransferEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillIds = new ArrayList<String>();
    }
  }

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public RoutingTransferEvent eventId(String eventId) {
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
  public RoutingTransferEvent eventDateTime(Date eventDateTime) {
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
  public RoutingTransferEvent conversationId(String conversationId) {
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
  public RoutingTransferEvent transferType(TransferTypeEnum transferType) {
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
   * The id (V4 UUID) used by the external platform to refer to the transfer in subsequent *Transfer events.
   **/
  public RoutingTransferEvent commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) used by the external platform to refer to the transfer in subsequent *Transfer events.")
  @JsonProperty("commandId")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Indicates the desired type of transfer.
   **/
  public RoutingTransferEvent initiatingCommunicationId(String initiatingCommunicationId) {
    this.initiatingCommunicationId = initiatingCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the desired type of transfer.")
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
  public RoutingTransferEvent targetCommunicationId(String targetCommunicationId) {
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
  public RoutingTransferEvent objectCommunicationId(String objectCommunicationId) {
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
   * The id (V4 UUID) of the desired destination queue that the object communication should be transferred to.
   **/
  public RoutingTransferEvent destinationQueueId(String destinationQueueId) {
    this.destinationQueueId = destinationQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the desired destination queue that the object communication should be transferred to.")
  @JsonProperty("destinationQueueId")
  public String getDestinationQueueId() {
    return destinationQueueId;
  }
  public void setDestinationQueueId(String destinationQueueId) {
    this.destinationQueueId = destinationQueueId;
  }


  /**
   * The unique identifier (V4 UUID) for the language that should be used to determine the destination for the conversation.
   **/
  public RoutingTransferEvent languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier (V4 UUID) for the language that should be used to determine the destination for the conversation.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * The unique identifiers (V4 UUID) for the skills that should be used to determine the destination for the conversation.
   **/
  public RoutingTransferEvent skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifiers (V4 UUID) for the skills that should be used to determine the destination for the conversation.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingTransferEvent routingTransferEvent = (RoutingTransferEvent) o;

    return Objects.equals(this.eventId, routingTransferEvent.eventId) &&
            Objects.equals(this.eventDateTime, routingTransferEvent.eventDateTime) &&
            Objects.equals(this.conversationId, routingTransferEvent.conversationId) &&
            Objects.equals(this.transferType, routingTransferEvent.transferType) &&
            Objects.equals(this.commandId, routingTransferEvent.commandId) &&
            Objects.equals(this.initiatingCommunicationId, routingTransferEvent.initiatingCommunicationId) &&
            Objects.equals(this.targetCommunicationId, routingTransferEvent.targetCommunicationId) &&
            Objects.equals(this.objectCommunicationId, routingTransferEvent.objectCommunicationId) &&
            Objects.equals(this.destinationQueueId, routingTransferEvent.destinationQueueId) &&
            Objects.equals(this.languageId, routingTransferEvent.languageId) &&
            Objects.equals(this.skillIds, routingTransferEvent.skillIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, transferType, commandId, initiatingCommunicationId, targetCommunicationId, objectCommunicationId, destinationQueueId, languageId, skillIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingTransferEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    initiatingCommunicationId: ").append(toIndentedString(initiatingCommunicationId)).append("\n");
    sb.append("    targetCommunicationId: ").append(toIndentedString(targetCommunicationId)).append("\n");
    sb.append("    objectCommunicationId: ").append(toIndentedString(objectCommunicationId)).append("\n");
    sb.append("    destinationQueueId: ").append(toIndentedString(destinationQueueId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
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

