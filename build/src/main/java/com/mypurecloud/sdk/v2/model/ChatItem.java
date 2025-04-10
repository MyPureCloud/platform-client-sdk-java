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
import com.mypurecloud.sdk.v2.model.ChatFavorite;
import com.mypurecloud.sdk.v2.model.ChatUserRef;
import com.mypurecloud.sdk.v2.model.Image;
import com.mypurecloud.sdk.v2.model.Room;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ChatItem
 */

public class ChatItem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean open = null;
  private ChatFavorite favorite = null;
  private List<Image> images = null;
  private Date dateLastMessage = null;
  private Date dateClosed = null;
  private ChatUserRef user = null;
  private Room room = null;

  private static class ChatTypeEnumDeserializer extends StdDeserializer<ChatTypeEnum> {
    public ChatTypeEnumDeserializer() {
      super(ChatTypeEnumDeserializer.class);
    }

    @Override
    public ChatTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChatTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of chat
   */
 @JsonDeserialize(using = ChatTypeEnumDeserializer.class)
  public enum ChatTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADHOC("adhoc"),
    ACD("acd"),
    GROUP("group"),
    ONEONONE("oneOnOne"),
    SUPERVISORASSISTANCE("supervisorAssistance");

    private String value;

    ChatTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChatTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ChatTypeEnum value : ChatTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChatTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ChatTypeEnum chatType = null;
  private String selfUri = null;

  public ChatItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      images = new ArrayList<Image>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ChatItem name(String name) {
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
   * If the chat is open
   **/
  public ChatItem open(Boolean open) {
    this.open = open;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If the chat is open")
  @JsonProperty("open")
  public Boolean getOpen() {
    return open;
  }
  public void setOpen(Boolean open) {
    this.open = open;
  }


  /**
   * The favorite entity for the chat, only appears if the chat is favorited
   **/
  public ChatItem favorite(ChatFavorite favorite) {
    this.favorite = favorite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The favorite entity for the chat, only appears if the chat is favorited")
  @JsonProperty("favorite")
  public ChatFavorite getFavorite() {
    return favorite;
  }
  public void setFavorite(ChatFavorite favorite) {
    this.favorite = favorite;
  }


  /**
   * Avatar images for the chat
   **/
  public ChatItem images(List<Image> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Avatar images for the chat")
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }


  /**
   * The date of the last message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChatItem dateLastMessage(Date dateLastMessage) {
    this.dateLastMessage = dateLastMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastMessage")
  public Date getDateLastMessage() {
    return dateLastMessage;
  }
  public void setDateLastMessage(Date dateLastMessage) {
    this.dateLastMessage = dateLastMessage;
  }


  /**
   * The date the chat was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChatItem dateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the chat was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateClosed")
  public Date getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   * The other 1on1 user
   **/
  public ChatItem user(ChatUserRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The other 1on1 user")
  @JsonProperty("user")
  public ChatUserRef getUser() {
    return user;
  }
  public void setUser(ChatUserRef user) {
    this.user = user;
  }


  /**
   * The room of the chat
   **/
  public ChatItem room(Room room) {
    this.room = room;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The room of the chat")
  @JsonProperty("room")
  public Room getRoom() {
    return room;
  }
  public void setRoom(Room room) {
    this.room = room;
  }


  /**
   * The type of chat
   **/
  public ChatItem chatType(ChatTypeEnum chatType) {
    this.chatType = chatType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of chat")
  @JsonProperty("chatType")
  public ChatTypeEnum getChatType() {
    return chatType;
  }
  public void setChatType(ChatTypeEnum chatType) {
    this.chatType = chatType;
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
    ChatItem chatItem = (ChatItem) o;

    return Objects.equals(this.id, chatItem.id) &&
            Objects.equals(this.name, chatItem.name) &&
            Objects.equals(this.open, chatItem.open) &&
            Objects.equals(this.favorite, chatItem.favorite) &&
            Objects.equals(this.images, chatItem.images) &&
            Objects.equals(this.dateLastMessage, chatItem.dateLastMessage) &&
            Objects.equals(this.dateClosed, chatItem.dateClosed) &&
            Objects.equals(this.user, chatItem.user) &&
            Objects.equals(this.room, chatItem.room) &&
            Objects.equals(this.chatType, chatItem.chatType) &&
            Objects.equals(this.selfUri, chatItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, open, favorite, images, dateLastMessage, dateClosed, user, room, chatType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    dateLastMessage: ").append(toIndentedString(dateLastMessage)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    chatType: ").append(toIndentedString(chatType)).append("\n");
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

