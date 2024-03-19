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

import java.io.Serializable;
/**
 * RoomParticipant
 */

public class RoomParticipant  implements Serializable {
  
  private String participantJid = null;

  
  /**
   * participantJid
   **/
  public RoomParticipant participantJid(String participantJid) {
    this.participantJid = participantJid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "participantJid")
  @JsonProperty("participantJid")
  public String getParticipantJid() {
    return participantJid;
  }
  public void setParticipantJid(String participantJid) {
    this.participantJid = participantJid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomParticipant roomParticipant = (RoomParticipant) o;

    return Objects.equals(this.participantJid, roomParticipant.participantJid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantJid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomParticipant {\n");
    
    sb.append("    participantJid: ").append(toIndentedString(participantJid)).append("\n");
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

