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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Room
 */

public class Room  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;

  private static class RoomTypeEnumDeserializer extends StdDeserializer<RoomTypeEnum> {
    public RoomTypeEnumDeserializer() {
      super(RoomTypeEnumDeserializer.class);
    }

    @Override
    public RoomTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoomTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of room
   */
 @JsonDeserialize(using = RoomTypeEnumDeserializer.class)
  public enum RoomTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADHOC("adhoc"),
    ACD("acd"),
    GROUP("group"),
    ONEONONE("oneOnOne"),
    SUPERVISORASSISTANCE("supervisorAssistance");

    private String value;

    RoomTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoomTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RoomTypeEnum value : RoomTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoomTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoomTypeEnum roomType = null;
  private String description = null;
  private String subject = null;
  private Integer participantLimit = null;
  private List<UserReference> owners = new ArrayList<UserReference>();
  private List<AddressableEntityRef> pinnedMessages = new ArrayList<AddressableEntityRef>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The jid of the room")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Room name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Room's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Room dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The type of room
   **/
  public Room roomType(RoomTypeEnum roomType) {
    this.roomType = roomType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of room")
  @JsonProperty("roomType")
  public RoomTypeEnum getRoomType() {
    return roomType;
  }
  public void setRoomType(RoomTypeEnum roomType) {
    this.roomType = roomType;
  }


  /**
   * Room's description
   **/
  public Room description(String description) {
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
  public Room subject(String subject) {
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
   * Room's size limit
   **/
  public Room participantLimit(Integer participantLimit) {
    this.participantLimit = participantLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's size limit")
  @JsonProperty("participantLimit")
  public Integer getParticipantLimit() {
    return participantLimit;
  }
  public void setParticipantLimit(Integer participantLimit) {
    this.participantLimit = participantLimit;
  }


  /**
   * Room's owners
   **/
  public Room owners(List<UserReference> owners) {
    this.owners = owners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's owners")
  @JsonProperty("owners")
  public List<UserReference> getOwners() {
    return owners;
  }
  public void setOwners(List<UserReference> owners) {
    this.owners = owners;
  }


  /**
   * Room's pinned messages
   **/
  public Room pinnedMessages(List<AddressableEntityRef> pinnedMessages) {
    this.pinnedMessages = pinnedMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's pinned messages")
  @JsonProperty("pinnedMessages")
  public List<AddressableEntityRef> getPinnedMessages() {
    return pinnedMessages;
  }
  public void setPinnedMessages(List<AddressableEntityRef> pinnedMessages) {
    this.pinnedMessages = pinnedMessages;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;

    return Objects.equals(this.id, room.id) &&
            Objects.equals(this.name, room.name) &&
            Objects.equals(this.dateCreated, room.dateCreated) &&
            Objects.equals(this.roomType, room.roomType) &&
            Objects.equals(this.description, room.description) &&
            Objects.equals(this.subject, room.subject) &&
            Objects.equals(this.participantLimit, room.participantLimit) &&
            Objects.equals(this.owners, room.owners) &&
            Objects.equals(this.pinnedMessages, room.pinnedMessages) &&
            Objects.equals(this.selfUri, room.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, roomType, description, subject, participantLimit, owners, pinnedMessages, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    participantLimit: ").append(toIndentedString(participantLimit)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    pinnedMessages: ").append(toIndentedString(pinnedMessages)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

