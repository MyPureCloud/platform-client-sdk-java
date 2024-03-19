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
import com.mypurecloud.sdk.v2.model.RoomParticipantResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoomParticipantsResponse
 */

public class RoomParticipantsResponse  implements Serializable {
  
  private List<RoomParticipantResponse> participants = new ArrayList<RoomParticipantResponse>();

  
  /**
   * list of room participants
   **/
  public RoomParticipantsResponse participants(List<RoomParticipantResponse> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "list of room participants")
  @JsonProperty("participants")
  public List<RoomParticipantResponse> getParticipants() {
    return participants;
  }
  public void setParticipants(List<RoomParticipantResponse> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomParticipantsResponse roomParticipantsResponse = (RoomParticipantsResponse) o;

    return Objects.equals(this.participants, roomParticipantsResponse.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomParticipantsResponse {\n");
    
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

