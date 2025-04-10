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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoomUpdateRequest
 */

public class RoomUpdateRequest  implements Serializable {
  
  private String description = null;
  private String subject = null;
  private List<String> pinnedMessageIds = null;
  private List<String> ownerIds = null;

  public RoomUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      pinnedMessageIds = new ArrayList<String>();
      ownerIds = new ArrayList<String>();
    }
  }

  
  /**
   * Room's description
   **/
  public RoomUpdateRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Room's subject
   **/
  public RoomUpdateRequest subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's subject")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * Room's pinned messages
   **/
  public RoomUpdateRequest pinnedMessageIds(List<String> pinnedMessageIds) {
    this.pinnedMessageIds = pinnedMessageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's pinned messages")
  @JsonProperty("pinnedMessageIds")
  public List<String> getPinnedMessageIds() {
    return pinnedMessageIds;
  }
  public void setPinnedMessageIds(List<String> pinnedMessageIds) {
    this.pinnedMessageIds = pinnedMessageIds;
  }


  /**
   * Room's owners
   **/
  public RoomUpdateRequest ownerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's owners")
  @JsonProperty("ownerIds")
  public List<String> getOwnerIds() {
    return ownerIds;
  }
  public void setOwnerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUpdateRequest roomUpdateRequest = (RoomUpdateRequest) o;

    return Objects.equals(this.description, roomUpdateRequest.description) &&
            Objects.equals(this.subject, roomUpdateRequest.subject) &&
            Objects.equals(this.pinnedMessageIds, roomUpdateRequest.pinnedMessageIds) &&
            Objects.equals(this.ownerIds, roomUpdateRequest.ownerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, subject, pinnedMessageIds, ownerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUpdateRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    pinnedMessageIds: ").append(toIndentedString(pinnedMessageIds)).append("\n");
    sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
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

