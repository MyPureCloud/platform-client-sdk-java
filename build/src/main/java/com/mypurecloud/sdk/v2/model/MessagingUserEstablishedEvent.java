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
import com.mypurecloud.sdk.v2.model.MessagingInitialConfiguration;
import com.mypurecloud.sdk.v2.model.SourceConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessagingUserEstablishedEvent
 */

public class MessagingUserEstablishedEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String communicationId = null;
  private String userId = null;
  private String queueId = null;
  private Boolean afterCallWorkRequired = null;
  private MessagingInitialConfiguration initialConfiguration = null;
  private SourceConfiguration sourceConfiguration = null;

  public MessagingUserEstablishedEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public MessagingUserEstablishedEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique (V4 UUID) eventId for this event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MessagingUserEstablishedEvent eventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDateTime")
  public Date getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(Date eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * A unique Id (V4 UUID) identifying this conversation
   **/
  public MessagingUserEstablishedEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * A unique Id (V4 UUID) identifying this communication.
   **/
  public MessagingUserEstablishedEvent communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this communication.")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * A unique Id (V4 UUID) identifying the user this communication belongs to.
   **/
  public MessagingUserEstablishedEvent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying the user this communication belongs to.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * A unique Id (V4 UUID) identifying the queue that the user is messaging on behalf of. Applies to outbound messages only.
   **/
  public MessagingUserEstablishedEvent queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique Id (V4 UUID) identifying the queue that the user is messaging on behalf of. Applies to outbound messages only.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Indicates whether or not this user will be required to complete after call work.
   **/
  public MessagingUserEstablishedEvent afterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not this user will be required to complete after call work.")
  @JsonProperty("afterCallWorkRequired")
  public Boolean getAfterCallWorkRequired() {
    return afterCallWorkRequired;
  }
  public void setAfterCallWorkRequired(Boolean afterCallWorkRequired) {
    this.afterCallWorkRequired = afterCallWorkRequired;
  }


  /**
   * Metadata about this communication.
   **/
  public MessagingUserEstablishedEvent initialConfiguration(MessagingInitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about this communication.")
  @JsonProperty("initialConfiguration")
  public MessagingInitialConfiguration getInitialConfiguration() {
    return initialConfiguration;
  }
  public void setInitialConfiguration(MessagingInitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
  }


  /**
   * Metadata about the source of this communication's interaction.
   **/
  public MessagingUserEstablishedEvent sourceConfiguration(SourceConfiguration sourceConfiguration) {
    this.sourceConfiguration = sourceConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about the source of this communication's interaction.")
  @JsonProperty("sourceConfiguration")
  public SourceConfiguration getSourceConfiguration() {
    return sourceConfiguration;
  }
  public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
    this.sourceConfiguration = sourceConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingUserEstablishedEvent messagingUserEstablishedEvent = (MessagingUserEstablishedEvent) o;

    return Objects.equals(this.eventId, messagingUserEstablishedEvent.eventId) &&
            Objects.equals(this.eventDateTime, messagingUserEstablishedEvent.eventDateTime) &&
            Objects.equals(this.conversationId, messagingUserEstablishedEvent.conversationId) &&
            Objects.equals(this.communicationId, messagingUserEstablishedEvent.communicationId) &&
            Objects.equals(this.userId, messagingUserEstablishedEvent.userId) &&
            Objects.equals(this.queueId, messagingUserEstablishedEvent.queueId) &&
            Objects.equals(this.afterCallWorkRequired, messagingUserEstablishedEvent.afterCallWorkRequired) &&
            Objects.equals(this.initialConfiguration, messagingUserEstablishedEvent.initialConfiguration) &&
            Objects.equals(this.sourceConfiguration, messagingUserEstablishedEvent.sourceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, communicationId, userId, queueId, afterCallWorkRequired, initialConfiguration, sourceConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingUserEstablishedEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    afterCallWorkRequired: ").append(toIndentedString(afterCallWorkRequired)).append("\n");
    sb.append("    initialConfiguration: ").append(toIndentedString(initialConfiguration)).append("\n");
    sb.append("    sourceConfiguration: ").append(toIndentedString(sourceConfiguration)).append("\n");
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

