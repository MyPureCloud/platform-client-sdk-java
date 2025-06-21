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
 * MessagingConferResponse
 */

public class MessagingConferResponse  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private String communicationId = null;
  private String peerCommunicationId = null;
  private String commandId = null;

  public MessagingConferResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * conversation ID.
   **/
  public MessagingConferResponse conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "conversation ID.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The internal communication ID.
   **/
  public MessagingConferResponse communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The internal communication ID.")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * The peer internal communication ID.
   **/
  public MessagingConferResponse peerCommunicationId(String peerCommunicationId) {
    this.peerCommunicationId = peerCommunicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The peer internal communication ID.")
  @JsonProperty("peerCommunicationId")
  public String getPeerCommunicationId() {
    return peerCommunicationId;
  }
  public void setPeerCommunicationId(String peerCommunicationId) {
    this.peerCommunicationId = peerCommunicationId;
  }


  /**
   * Command ID for a given request.
   **/
  public MessagingConferResponse commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Command ID for a given request.")
  @JsonProperty("commandId")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingConferResponse messagingConferResponse = (MessagingConferResponse) o;

    return Objects.equals(this.conversation, messagingConferResponse.conversation) &&
            Objects.equals(this.communicationId, messagingConferResponse.communicationId) &&
            Objects.equals(this.peerCommunicationId, messagingConferResponse.peerCommunicationId) &&
            Objects.equals(this.commandId, messagingConferResponse.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, communicationId, peerCommunicationId, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingConferResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    peerCommunicationId: ").append(toIndentedString(peerCommunicationId)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

