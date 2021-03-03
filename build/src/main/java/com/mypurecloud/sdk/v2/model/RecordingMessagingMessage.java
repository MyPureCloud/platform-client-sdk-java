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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.MessageMediaAttachment;
import com.mypurecloud.sdk.v2.model.MessageStickerAttachment;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingMessagingMessage
 */

public class RecordingMessagingMessage  implements Serializable {
  
  private String from = null;
  private User fromUser = null;
  private ExternalContact fromExternalContact = null;
  private String to = null;
  private Date timestamp = null;
  private String id = null;
  private String messageText = null;
  private List<MessageMediaAttachment> messageMediaAttachments = new ArrayList<MessageMediaAttachment>();
  private List<MessageStickerAttachment> messageStickerAttachments = new ArrayList<MessageStickerAttachment>();

  
  /**
   **/
  public RecordingMessagingMessage from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  
  /**
   **/
  public RecordingMessagingMessage fromUser(User fromUser) {
    this.fromUser = fromUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromUser")
  public User getFromUser() {
    return fromUser;
  }
  public void setFromUser(User fromUser) {
    this.fromUser = fromUser;
  }

  
  /**
   **/
  public RecordingMessagingMessage fromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromExternalContact")
  public ExternalContact getFromExternalContact() {
    return fromExternalContact;
  }
  public void setFromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
  }

  
  /**
   **/
  public RecordingMessagingMessage to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingMessagingMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public RecordingMessagingMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public RecordingMessagingMessage messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageText")
  public String getMessageText() {
    return messageText;
  }
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  
  /**
   **/
  public RecordingMessagingMessage messageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageMediaAttachments")
  public List<MessageMediaAttachment> getMessageMediaAttachments() {
    return messageMediaAttachments;
  }
  public void setMessageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
  }

  
  /**
   **/
  public RecordingMessagingMessage messageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageStickerAttachments")
  public List<MessageStickerAttachment> getMessageStickerAttachments() {
    return messageStickerAttachments;
  }
  public void setMessageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingMessagingMessage recordingMessagingMessage = (RecordingMessagingMessage) o;
    return Objects.equals(this.from, recordingMessagingMessage.from) &&
        Objects.equals(this.fromUser, recordingMessagingMessage.fromUser) &&
        Objects.equals(this.fromExternalContact, recordingMessagingMessage.fromExternalContact) &&
        Objects.equals(this.to, recordingMessagingMessage.to) &&
        Objects.equals(this.timestamp, recordingMessagingMessage.timestamp) &&
        Objects.equals(this.id, recordingMessagingMessage.id) &&
        Objects.equals(this.messageText, recordingMessagingMessage.messageText) &&
        Objects.equals(this.messageMediaAttachments, recordingMessagingMessage.messageMediaAttachments) &&
        Objects.equals(this.messageStickerAttachments, recordingMessagingMessage.messageStickerAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, fromUser, fromExternalContact, to, timestamp, id, messageText, messageMediaAttachments, messageStickerAttachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMessagingMessage {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromUser: ").append(toIndentedString(fromUser)).append("\n");
    sb.append("    fromExternalContact: ").append(toIndentedString(fromExternalContact)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    messageMediaAttachments: ").append(toIndentedString(messageMediaAttachments)).append("\n");
    sb.append("    messageStickerAttachments: ").append(toIndentedString(messageStickerAttachments)).append("\n");
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

