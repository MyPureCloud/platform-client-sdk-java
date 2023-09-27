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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ChatMessageResponse
 */

public class ChatMessageResponse  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String toJid = null;
  private String jid = null;
  private String body = null;
  private Map<String, String> mentions = null;
  private Boolean edited = null;
  private Boolean attachmentDeleted = null;
  private String fileUri = null;
  private Entity thread = null;
  private AddressableEntityRef user = null;
  private AddressableEntityRef toUser = null;

  
  /**
   * The id of the message
   **/
  public ChatMessageResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the message")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Message's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChatMessageResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Message's last updated time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChatMessageResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message's last updated time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Jid of message's recipient (roomJid or userJid)
   **/
  public ChatMessageResponse toJid(String toJid) {
    this.toJid = toJid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Jid of message's recipient (roomJid or userJid)")
  @JsonProperty("toJid")
  public String getToJid() {
    return toJid;
  }
  public void setToJid(String toJid) {
    this.toJid = toJid;
  }


  /**
   * Jid of message's sender (userJid)
   **/
  public ChatMessageResponse jid(String jid) {
    this.jid = jid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Jid of message's sender (userJid)")
  @JsonProperty("jid")
  public String getJid() {
    return jid;
  }
  public void setJid(String jid) {
    this.jid = jid;
  }


  /**
   * Message's body
   **/
  public ChatMessageResponse body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message's body")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }


  /**
   * Message's mentions
   **/
  public ChatMessageResponse mentions(Map<String, String> mentions) {
    this.mentions = mentions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message's mentions")
  @JsonProperty("mentions")
  public Map<String, String> getMentions() {
    return mentions;
  }
  public void setMentions(Map<String, String> mentions) {
    this.mentions = mentions;
  }


  /**
   * If message was edited
   **/
  public ChatMessageResponse edited(Boolean edited) {
    this.edited = edited;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If message was edited")
  @JsonProperty("edited")
  public Boolean getEdited() {
    return edited;
  }
  public void setEdited(Boolean edited) {
    this.edited = edited;
  }


  /**
   * If message's attachment was deleted
   **/
  public ChatMessageResponse attachmentDeleted(Boolean attachmentDeleted) {
    this.attachmentDeleted = attachmentDeleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If message's attachment was deleted")
  @JsonProperty("attachmentDeleted")
  public Boolean getAttachmentDeleted() {
    return attachmentDeleted;
  }
  public void setAttachmentDeleted(Boolean attachmentDeleted) {
    this.attachmentDeleted = attachmentDeleted;
  }


  /**
   * URI of file attachment
   **/
  public ChatMessageResponse fileUri(String fileUri) {
    this.fileUri = fileUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI of file attachment")
  @JsonProperty("fileUri")
  public String getFileUri() {
    return fileUri;
  }
  public void setFileUri(String fileUri) {
    this.fileUri = fileUri;
  }


  /**
   * The id for a thread this message corresponds to
   **/
  public ChatMessageResponse thread(Entity thread) {
    this.thread = thread;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id for a thread this message corresponds to")
  @JsonProperty("thread")
  public Entity getThread() {
    return thread;
  }
  public void setThread(Entity thread) {
    this.thread = thread;
  }


  /**
   * The user who sent the message
   **/
  public ChatMessageResponse user(AddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who sent the message")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }
  public void setUser(AddressableEntityRef user) {
    this.user = user;
  }


  /**
   * The receiving user of the message
   **/
  public ChatMessageResponse toUser(AddressableEntityRef toUser) {
    this.toUser = toUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The receiving user of the message")
  @JsonProperty("toUser")
  public AddressableEntityRef getToUser() {
    return toUser;
  }
  public void setToUser(AddressableEntityRef toUser) {
    this.toUser = toUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessageResponse chatMessageResponse = (ChatMessageResponse) o;

    return Objects.equals(this.id, chatMessageResponse.id) &&
            Objects.equals(this.dateCreated, chatMessageResponse.dateCreated) &&
            Objects.equals(this.dateModified, chatMessageResponse.dateModified) &&
            Objects.equals(this.toJid, chatMessageResponse.toJid) &&
            Objects.equals(this.jid, chatMessageResponse.jid) &&
            Objects.equals(this.body, chatMessageResponse.body) &&
            Objects.equals(this.mentions, chatMessageResponse.mentions) &&
            Objects.equals(this.edited, chatMessageResponse.edited) &&
            Objects.equals(this.attachmentDeleted, chatMessageResponse.attachmentDeleted) &&
            Objects.equals(this.fileUri, chatMessageResponse.fileUri) &&
            Objects.equals(this.thread, chatMessageResponse.thread) &&
            Objects.equals(this.user, chatMessageResponse.user) &&
            Objects.equals(this.toUser, chatMessageResponse.toUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, toJid, jid, body, mentions, edited, attachmentDeleted, fileUri, thread, user, toUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    toJid: ").append(toIndentedString(toJid)).append("\n");
    sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    attachmentDeleted: ").append(toIndentedString(attachmentDeleted)).append("\n");
    sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    toUser: ").append(toIndentedString(toUser)).append("\n");
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

