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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ConsultTransferEvent
 */

public class ConsultTransferEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String initiatingCommunicationId = null;
  private String destinationCommunicationId = null;
  private String objectCommunicationId = null;

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public ConsultTransferEvent eventId(String eventId) {
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
  public ConsultTransferEvent eventDateTime(Date eventDateTime) {
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
  public ConsultTransferEvent conversationId(String conversationId) {
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
   * The id (V4 UUID) of the communication representing the participant that is initiating the transfer.
   **/
  public ConsultTransferEvent initiatingCommunicationId(String initiatingCommunicationId) {
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
   * The id (V4 UUID) of the communication that is being transferred to.
   **/
  public ConsultTransferEvent destinationCommunicationId(String destinationCommunicationId) {
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


  /**
   * The id (V4 UUID) of the communication that is being transferred.
   **/
  public ConsultTransferEvent objectCommunicationId(String objectCommunicationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferEvent consultTransferEvent = (ConsultTransferEvent) o;

    return Objects.equals(this.eventId, consultTransferEvent.eventId) &&
            Objects.equals(this.eventDateTime, consultTransferEvent.eventDateTime) &&
            Objects.equals(this.conversationId, consultTransferEvent.conversationId) &&
            Objects.equals(this.initiatingCommunicationId, consultTransferEvent.initiatingCommunicationId) &&
            Objects.equals(this.destinationCommunicationId, consultTransferEvent.destinationCommunicationId) &&
            Objects.equals(this.objectCommunicationId, consultTransferEvent.objectCommunicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, initiatingCommunicationId, destinationCommunicationId, objectCommunicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    initiatingCommunicationId: ").append(toIndentedString(initiatingCommunicationId)).append("\n");
    sb.append("    destinationCommunicationId: ").append(toIndentedString(destinationCommunicationId)).append("\n");
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

