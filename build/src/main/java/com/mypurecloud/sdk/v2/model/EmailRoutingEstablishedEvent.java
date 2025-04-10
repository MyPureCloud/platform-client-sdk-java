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
import com.mypurecloud.sdk.v2.model.EmailInitialConfiguration;
import com.mypurecloud.sdk.v2.model.SourceConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EmailRoutingEstablishedEvent
 */

public class EmailRoutingEstablishedEvent  implements Serializable {
  
  private String eventId = null;
  private Date eventDateTime = null;
  private String conversationId = null;
  private String communicationId = null;
  private String queueId = null;
  private List<String> skillIds = null;
  private String languageId = null;
  private String label = null;
  private EmailInitialConfiguration initialConfiguration = null;
  private SourceConfiguration sourceConfiguration = null;

  public EmailRoutingEstablishedEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillIds = new ArrayList<String>();
    }
  }

  
  /**
   * A unique (V4 UUID) eventId for this event
   **/
  public EmailRoutingEstablishedEvent eventId(String eventId) {
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
  public EmailRoutingEstablishedEvent eventDateTime(Date eventDateTime) {
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
  public EmailRoutingEstablishedEvent conversationId(String conversationId) {
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
  public EmailRoutingEstablishedEvent communicationId(String communicationId) {
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
   * The id of the queue that is routing this conversation.
   **/
  public EmailRoutingEstablishedEvent queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the queue that is routing this conversation.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The unique identifiers for the skills that should be used to determine the destination for the conversation.
   **/
  public EmailRoutingEstablishedEvent skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifiers for the skills that should be used to determine the destination for the conversation.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  /**
   * The unique identifier for the language that should be used to determine the destination for the conversation.
   **/
  public EmailRoutingEstablishedEvent languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the language that should be used to determine the destination for the conversation.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * An optional label that categorizes the conversation. Max-utilization settings can be configured at a per-label level.
   **/
  public EmailRoutingEstablishedEvent label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional label that categorizes the conversation. Max-utilization settings can be configured at a per-label level.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Metadata about this communication.
   **/
  public EmailRoutingEstablishedEvent initialConfiguration(EmailInitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Metadata about this communication.")
  @JsonProperty("initialConfiguration")
  public EmailInitialConfiguration getInitialConfiguration() {
    return initialConfiguration;
  }
  public void setInitialConfiguration(EmailInitialConfiguration initialConfiguration) {
    this.initialConfiguration = initialConfiguration;
  }


  /**
   * Metadata about the source of this communication's interaction.
   **/
  public EmailRoutingEstablishedEvent sourceConfiguration(SourceConfiguration sourceConfiguration) {
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
    EmailRoutingEstablishedEvent emailRoutingEstablishedEvent = (EmailRoutingEstablishedEvent) o;

    return Objects.equals(this.eventId, emailRoutingEstablishedEvent.eventId) &&
            Objects.equals(this.eventDateTime, emailRoutingEstablishedEvent.eventDateTime) &&
            Objects.equals(this.conversationId, emailRoutingEstablishedEvent.conversationId) &&
            Objects.equals(this.communicationId, emailRoutingEstablishedEvent.communicationId) &&
            Objects.equals(this.queueId, emailRoutingEstablishedEvent.queueId) &&
            Objects.equals(this.skillIds, emailRoutingEstablishedEvent.skillIds) &&
            Objects.equals(this.languageId, emailRoutingEstablishedEvent.languageId) &&
            Objects.equals(this.label, emailRoutingEstablishedEvent.label) &&
            Objects.equals(this.initialConfiguration, emailRoutingEstablishedEvent.initialConfiguration) &&
            Objects.equals(this.sourceConfiguration, emailRoutingEstablishedEvent.sourceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventDateTime, conversationId, communicationId, queueId, skillIds, languageId, label, initialConfiguration, sourceConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRoutingEstablishedEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

