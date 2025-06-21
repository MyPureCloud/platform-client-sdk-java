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
import com.mypurecloud.sdk.v2.model.ConversationNormalizedMessage;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * InternalMessageData
 */

public class InternalMessageData  implements Serializable {
  
  private String id = null;
  private String name = null;
  private AddressableEntityRef conversation = null;
  private String communicationId = null;
  private Date timestamp = null;
  private UserReference sender = null;
  private UserReference recipient = null;
  private ConversationNormalizedMessage normalizedMessage = null;
  private String selfUri = null;

  public InternalMessageData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public InternalMessageData name(String name) {
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
   * The conversation of this message.
   **/
  public InternalMessageData conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation of this message.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The id of the communication of this message.
   **/
  public InternalMessageData communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the communication of this message.")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public InternalMessageData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * The sender of the text message.
   **/
  public InternalMessageData sender(UserReference sender) {
    this.sender = sender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sender of the text message.")
  @JsonProperty("sender")
  public UserReference getSender() {
    return sender;
  }
  public void setSender(UserReference sender) {
    this.sender = sender;
  }


  /**
   * The recipient of the text message.
   **/
  public InternalMessageData recipient(UserReference recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient of the text message.")
  @JsonProperty("recipient")
  public UserReference getRecipient() {
    return recipient;
  }
  public void setRecipient(UserReference recipient) {
    this.recipient = recipient;
  }


  @ApiModelProperty(example = "null", value = "The message into normalized format")
  @JsonProperty("normalizedMessage")
  public ConversationNormalizedMessage getNormalizedMessage() {
    return normalizedMessage;
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
    InternalMessageData internalMessageData = (InternalMessageData) o;

    return Objects.equals(this.id, internalMessageData.id) &&
            Objects.equals(this.name, internalMessageData.name) &&
            Objects.equals(this.conversation, internalMessageData.conversation) &&
            Objects.equals(this.communicationId, internalMessageData.communicationId) &&
            Objects.equals(this.timestamp, internalMessageData.timestamp) &&
            Objects.equals(this.sender, internalMessageData.sender) &&
            Objects.equals(this.recipient, internalMessageData.recipient) &&
            Objects.equals(this.normalizedMessage, internalMessageData.normalizedMessage) &&
            Objects.equals(this.selfUri, internalMessageData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, communicationId, timestamp, sender, recipient, normalizedMessage, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalMessageData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    normalizedMessage: ").append(toIndentedString(normalizedMessage)).append("\n");
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

