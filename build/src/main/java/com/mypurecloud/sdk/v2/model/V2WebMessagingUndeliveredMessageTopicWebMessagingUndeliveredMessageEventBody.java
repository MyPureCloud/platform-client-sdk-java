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
import com.mypurecloud.sdk.v2.model.V2WebMessagingUndeliveredMessageTopicMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody
 */

public class V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody  implements Serializable {
  
  private String conversationId = null;
  private String deploymentId = null;
  private String participantId = null;
  private String externalContactId = null;
  private String communicationId = null;
  private Integer sessionExpiry = null;
  private List<V2WebMessagingUndeliveredMessageTopicMessage> messages = new ArrayList<V2WebMessagingUndeliveredMessageTopicMessage>();
  private Integer eventTimeMs = null;

  
  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody sessionExpiry(Integer sessionExpiry) {
    this.sessionExpiry = sessionExpiry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionExpiry")
  public Integer getSessionExpiry() {
    return sessionExpiry;
  }
  public void setSessionExpiry(Integer sessionExpiry) {
    this.sessionExpiry = sessionExpiry;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody messages(List<V2WebMessagingUndeliveredMessageTopicMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messages")
  public List<V2WebMessagingUndeliveredMessageTopicMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<V2WebMessagingUndeliveredMessageTopicMessage> messages) {
    this.messages = messages;
  }


  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody eventTimeMs(Integer eventTimeMs) {
    this.eventTimeMs = eventTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTimeMs")
  public Integer getEventTimeMs() {
    return eventTimeMs;
  }
  public void setEventTimeMs(Integer eventTimeMs) {
    this.eventTimeMs = eventTimeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody = (V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody) o;

    return Objects.equals(this.conversationId, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.conversationId) &&
            Objects.equals(this.deploymentId, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.deploymentId) &&
            Objects.equals(this.participantId, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.participantId) &&
            Objects.equals(this.externalContactId, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.externalContactId) &&
            Objects.equals(this.communicationId, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.communicationId) &&
            Objects.equals(this.sessionExpiry, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.sessionExpiry) &&
            Objects.equals(this.messages, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.messages) &&
            Objects.equals(this.eventTimeMs, v2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody.eventTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, deploymentId, participantId, externalContactId, communicationId, sessionExpiry, messages, eventTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WebMessagingUndeliveredMessageTopicWebMessagingUndeliveredMessageEventBody {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    sessionExpiry: ").append(toIndentedString(sessionExpiry)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    eventTimeMs: ").append(toIndentedString(eventTimeMs)).append("\n");
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

