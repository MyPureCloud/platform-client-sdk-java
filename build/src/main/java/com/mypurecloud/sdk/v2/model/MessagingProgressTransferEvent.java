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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessagingProgressTransferEvent
 */

public class MessagingProgressTransferEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String commandId = null;
  private String objectCommunicationId = null;
  private String destinationCommunicationId = null;

  public MessagingProgressTransferEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public MessagingProgressTransferEvent eventId(String eventId) {
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
  public MessagingProgressTransferEvent eventDateTime(Date eventDateTime) {
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
  public MessagingProgressTransferEvent conversationId(String conversationId) {
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
  public MessagingProgressTransferEvent commandId(String commandId) {
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
   * The id (V4 UUID) of the communication that is being transferred.
   **/
  public MessagingProgressTransferEvent objectCommunicationId(String objectCommunicationId) {
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
   * The id (V4 UUID) of the communication that is being transferred to.
   **/
  public MessagingProgressTransferEvent destinationCommunicationId(String destinationCommunicationId) {
    this.destinationCommunicationId = destinationCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the communication that is being transferred to.")
  @JsonProperty("destinationCommunicationId")
  public String getDestinationCommunicationId() {
    return destinationCommunicationId;
  }
  public void setDestinationCommunicationId(String destinationCommunicationId) {
    this.destinationCommunicationId = destinationCommunicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProgressTransferEvent messagingProgressTransferEvent = (MessagingProgressTransferEvent) o;

    return Objects.equals(this.eventId, messagingProgressTransferEvent.eventId) &&
            Objects.equals(this.eventDateTime, messagingProgressTransferEvent.eventDateTime) &&
            Objects.equals(this.conversationId, messagingProgressTransferEvent.conversationId) &&
            Objects.equals(this.commandId, messagingProgressTransferEvent.commandId) &&
            Objects.equals(this.objectCommunicationId, messagingProgressTransferEvent.objectCommunicationId) &&
            Objects.equals(this.destinationCommunicationId, messagingProgressTransferEvent.destinationCommunicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, commandId, objectCommunicationId, destinationCommunicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProgressTransferEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    objectCommunicationId: ").append(toIndentedString(objectCommunicationId)).append("\n");
    sb.append("    destinationCommunicationId: ").append(toIndentedString(destinationCommunicationId)).append("\n");
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

