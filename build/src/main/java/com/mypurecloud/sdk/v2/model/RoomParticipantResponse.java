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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RoomParticipantResponse
 */

public class RoomParticipantResponse  implements Serializable {
  
  private String jid = null;
  private AddressableEntityRef user = null;

  public RoomParticipantResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * jid of the participant
   **/
  public RoomParticipantResponse jid(String jid) {
    this.jid = jid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "jid of the participant")
  @JsonProperty("jid")
  public String getJid() {
    return jid;
  }
  public void setJid(String jid) {
    this.jid = jid;
  }


  /**
   * User id of the participant
   **/
  public RoomParticipantResponse user(AddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User id of the participant")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }
  public void setUser(AddressableEntityRef user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomParticipantResponse roomParticipantResponse = (RoomParticipantResponse) o;

    return Objects.equals(this.jid, roomParticipantResponse.jid) &&
            Objects.equals(this.user, roomParticipantResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomParticipantResponse {\n");
    
    sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

