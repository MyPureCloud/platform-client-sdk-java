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
import com.mypurecloud.sdk.v2.model.ButtonResponse;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.MessageMediaAttachment;
import com.mypurecloud.sdk.v2.model.MessageStickerAttachment;
import com.mypurecloud.sdk.v2.model.QuickReply;
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
  private List<QuickReply> quickReplies = new ArrayList<QuickReply>();
  private ButtonResponse buttonResponse = null;

  
  /**
   * The message sender session id.
   **/
  public RecordingMessagingMessage from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message sender session id.")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  
  /**
   * The user who sent this message.
   **/
  public RecordingMessagingMessage fromUser(User fromUser) {
    this.fromUser = fromUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who sent this message.")
  @JsonProperty("fromUser")
  public User getFromUser() {
    return fromUser;
  }
  public void setFromUser(User fromUser) {
    this.fromUser = fromUser;
  }

  
  /**
   * The PureCloud external contact sender details.
   **/
  public RecordingMessagingMessage fromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud external contact sender details.")
  @JsonProperty("fromExternalContact")
  public ExternalContact getFromExternalContact() {
    return fromExternalContact;
  }
  public void setFromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
  }

  
  /**
   * The message recipient.
   **/
  public RecordingMessagingMessage to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message recipient.")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  
  /**
   * The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingMessagingMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * A globally unique identifier for this communication.
   **/
  public RecordingMessagingMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this communication.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The content of this message.
   **/
  public RecordingMessagingMessage messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content of this message.")
  @JsonProperty("messageText")
  public String getMessageText() {
    return messageText;
  }
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  
  /**
   * List of media objects attached  with this message.
   **/
  public RecordingMessagingMessage messageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of media objects attached  with this message.")
  @JsonProperty("messageMediaAttachments")
  public List<MessageMediaAttachment> getMessageMediaAttachments() {
    return messageMediaAttachments;
  }
  public void setMessageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
  }

  
  /**
   * List of message stickers attached with this message.
   **/
  public RecordingMessagingMessage messageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message stickers attached with this message.")
  @JsonProperty("messageStickerAttachments")
  public List<MessageStickerAttachment> getMessageStickerAttachments() {
    return messageStickerAttachments;
  }
  public void setMessageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
  }

  
  /**
   * List of quick reply options offered with this message.
   **/
  public RecordingMessagingMessage quickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of quick reply options offered with this message.")
  @JsonProperty("quickReplies")
  public List<QuickReply> getQuickReplies() {
    return quickReplies;
  }
  public void setQuickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
  }

  
  /**
   * Button Response selected by user for this message.
   **/
  public RecordingMessagingMessage buttonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button Response selected by user for this message.")
  @JsonProperty("buttonResponse")
  public ButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
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
        Objects.equals(this.messageStickerAttachments, recordingMessagingMessage.messageStickerAttachments) &&
        Objects.equals(this.quickReplies, recordingMessagingMessage.quickReplies) &&
        Objects.equals(this.buttonResponse, recordingMessagingMessage.buttonResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, fromUser, fromExternalContact, to, timestamp, id, messageText, messageMediaAttachments, messageStickerAttachments, quickReplies, buttonResponse);
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
    sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
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

