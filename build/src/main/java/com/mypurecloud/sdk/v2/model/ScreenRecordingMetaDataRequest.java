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
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScreenRecordingMetaDataRequest
 */

public class ScreenRecordingMetaDataRequest  implements Serializable {
  
  private String participantJid = null;
  private String roomId = null;
  private List<ScreenRecordingMetaData> metaData = new ArrayList<ScreenRecordingMetaData>();

  
  /**
   **/
  public ScreenRecordingMetaDataRequest participantJid(String participantJid) {
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
  public ScreenRecordingMetaDataRequest roomId(String roomId) {
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
  public ScreenRecordingMetaDataRequest metaData(List<ScreenRecordingMetaData> metaData) {
    this.metaData = metaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metaData")
  public List<ScreenRecordingMetaData> getMetaData() {
    return metaData;
  }
  public void setMetaData(List<ScreenRecordingMetaData> metaData) {
    this.metaData = metaData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingMetaDataRequest screenRecordingMetaDataRequest = (ScreenRecordingMetaDataRequest) o;
    return Objects.equals(this.participantJid, screenRecordingMetaDataRequest.participantJid) &&
        Objects.equals(this.roomId, screenRecordingMetaDataRequest.roomId) &&
        Objects.equals(this.metaData, screenRecordingMetaDataRequest.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantJid, roomId, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingMetaDataRequest {\n");
    
    sb.append("    participantJid: ").append(toIndentedString(participantJid)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

