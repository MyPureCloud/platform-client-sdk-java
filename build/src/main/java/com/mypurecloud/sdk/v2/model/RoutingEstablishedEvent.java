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
import com.mypurecloud.sdk.v2.model.InitialConfiguration;
import com.mypurecloud.sdk.v2.model.SourceConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingEstablishedEvent
 */

public class RoutingEstablishedEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String communicationId = null;
  private String phoneNumber = null;
  private String queueId = null;
  private String ani = null;
  private String dnis = null;
  private List<String> skillIds = null;
  private String languageId = null;
  private InitialConfiguration initialConfiguration = null;
  private SourceConfiguration sourceConfiguration = null;

  public RoutingEstablishedEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillIds = new ArrayList<String>();
    }
  }

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public RoutingEstablishedEvent eventId(String eventId) {
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
  public RoutingEstablishedEvent eventDateTime(Date eventDateTime) {
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
  public RoutingEstablishedEvent conversationId(String conversationId) {
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
   * A unique Id (V4 UUID) identifying this communication
   **/
  public RoutingEstablishedEvent communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique Id (V4 UUID) identifying this communication")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * Identifies the phone number used to reach this queue if it is different from the information that would be accessed by queueId.
   **/
  public RoutingEstablishedEvent phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies the phone number used to reach this queue if it is different from the information that would be accessed by queueId.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * The id (V4 UUID) of the queue that is routing this conversation.
   **/
  public RoutingEstablishedEvent queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id (V4 UUID) of the queue that is routing this conversation.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The automatic number identification if it is available for this conversation.
   **/
  public RoutingEstablishedEvent ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The automatic number identification if it is available for this conversation.")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }


  /**
   * The dialed number identification if it is available for this conversation.
   **/
  public RoutingEstablishedEvent dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialed number identification if it is available for this conversation.")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  /**
   * The unique identifiers (V4 UUID) for the skills that should be used to determine the destination for the conversation.
   **/
  public RoutingEstablishedEvent skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifiers (V4 UUID) for the skills that should be used to determine the destination for the conversation.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  /**
   * The unique identifier (V4 UUID) for the language that should be used to determine the destination for the conversation.
   **/
  public RoutingEstablishedEvent languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier (V4 UUID) for the language that should be used to determine the destination for the conversation.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * Metadata about this communication.
   **/
  public RoutingEstablishedEvent initialConfiguration(InitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about this communication.")
  @JsonProperty("initialConfiguration")
  public InitialConfiguration getInitialConfiguration() {
    return initialConfiguration;
  }
  public void setInitialConfiguration(InitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
  }


  /**
   * Metadata about the source of this communication's interaction.
   **/
  public RoutingEstablishedEvent sourceConfiguration(SourceConfiguration sourceConfiguration) {
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
    RoutingEstablishedEvent routingEstablishedEvent = (RoutingEstablishedEvent) o;

    return Objects.equals(this.eventId, routingEstablishedEvent.eventId) &&
            Objects.equals(this.eventDateTime, routingEstablishedEvent.eventDateTime) &&
            Objects.equals(this.conversationId, routingEstablishedEvent.conversationId) &&
            Objects.equals(this.communicationId, routingEstablishedEvent.communicationId) &&
            Objects.equals(this.phoneNumber, routingEstablishedEvent.phoneNumber) &&
            Objects.equals(this.queueId, routingEstablishedEvent.queueId) &&
            Objects.equals(this.ani, routingEstablishedEvent.ani) &&
            Objects.equals(this.dnis, routingEstablishedEvent.dnis) &&
            Objects.equals(this.skillIds, routingEstablishedEvent.skillIds) &&
            Objects.equals(this.languageId, routingEstablishedEvent.languageId) &&
            Objects.equals(this.initialConfiguration, routingEstablishedEvent.initialConfiguration) &&
            Objects.equals(this.sourceConfiguration, routingEstablishedEvent.sourceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, communicationId, phoneNumber, queueId, ani, dnis, skillIds, languageId, initialConfiguration, sourceConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingEstablishedEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
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

