package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AcknowledgeScreenRecordingRequest
 */

public class AcknowledgeScreenRecordingRequest  implements Serializable {
  
  private String participantJid = null;
  private String roomId = null;
  private String conversationId = null;

  
  /**
   **/
  public AcknowledgeScreenRecordingRequest participantJid(String participantJid) {
    this.participantJid = participantJid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participantJid")
  public String getParticipantJid() {
    return participantJid;
  }
  public void setParticipantJid(String participantJid) {
    this.participantJid = participantJid;
  }

  
  /**
   **/
  public AcknowledgeScreenRecordingRequest roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  
  /**
   **/
  public AcknowledgeScreenRecordingRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcknowledgeScreenRecordingRequest acknowledgeScreenRecordingRequest = (AcknowledgeScreenRecordingRequest) o;
    return Objects.equals(this.participantJid, acknowledgeScreenRecordingRequest.participantJid) &&
        Objects.equals(this.roomId, acknowledgeScreenRecordingRequest.roomId) &&
        Objects.equals(this.conversationId, acknowledgeScreenRecordingRequest.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantJid, roomId, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcknowledgeScreenRecordingRequest {\n");
    
    sb.append("    participantJid: ").append(toIndentedString(participantJid)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

