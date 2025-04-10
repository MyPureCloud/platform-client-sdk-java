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
import com.mypurecloud.sdk.v2.model.AttributeDetailEventTopicCommunication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AttributeDetailEventTopicAttributeUpdateEvent
 */

public class AttributeDetailEventTopicAttributeUpdateEvent  implements Serializable {
  
  private Long eventTime = null;
  private String conversationId = null;
  private String participantId = null;
  private Map<String, String> attributes = null;
  private List<String> conversationExternalContactIds = null;
  private List<String> conversationExternalOrganizationIds = null;
  private List<AttributeDetailEventTopicCommunication> communications = null;

  public AttributeDetailEventTopicAttributeUpdateEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationExternalContactIds = new ArrayList<String>();
      conversationExternalOrganizationIds = new ArrayList<String>();
      communications = new ArrayList<AttributeDetailEventTopicCommunication>();
    }
  }

  
  /**
   **/
  public AttributeDetailEventTopicAttributeUpdateEvent eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public AttributeDetailEventTopicAttributeUpdateEvent conversationId(String conversationId) {
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
  public AttributeDetailEventTopicAttributeUpdateEvent participantId(String participantId) {
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
  public AttributeDetailEventTopicAttributeUpdateEvent attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  /**
   **/
  public AttributeDetailEventTopicAttributeUpdateEvent conversationExternalContactIds(List<String> conversationExternalContactIds) {
    this.conversationExternalContactIds = conversationExternalContactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationExternalContactIds")
  public List<String> getConversationExternalContactIds() {
    return conversationExternalContactIds;
  }
  public void setConversationExternalContactIds(List<String> conversationExternalContactIds) {
    this.conversationExternalContactIds = conversationExternalContactIds;
  }


  /**
   **/
  public AttributeDetailEventTopicAttributeUpdateEvent conversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
    this.conversationExternalOrganizationIds = conversationExternalOrganizationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationExternalOrganizationIds")
  public List<String> getConversationExternalOrganizationIds() {
    return conversationExternalOrganizationIds;
  }
  public void setConversationExternalOrganizationIds(List<String> conversationExternalOrganizationIds) {
    this.conversationExternalOrganizationIds = conversationExternalOrganizationIds;
  }


  /**
   **/
  public AttributeDetailEventTopicAttributeUpdateEvent communications(List<AttributeDetailEventTopicCommunication> communications) {
    this.communications = communications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communications")
  public List<AttributeDetailEventTopicCommunication> getCommunications() {
    return communications;
  }
  public void setCommunications(List<AttributeDetailEventTopicCommunication> communications) {
    this.communications = communications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeDetailEventTopicAttributeUpdateEvent attributeDetailEventTopicAttributeUpdateEvent = (AttributeDetailEventTopicAttributeUpdateEvent) o;

    return Objects.equals(this.eventTime, attributeDetailEventTopicAttributeUpdateEvent.eventTime) &&
            Objects.equals(this.conversationId, attributeDetailEventTopicAttributeUpdateEvent.conversationId) &&
            Objects.equals(this.participantId, attributeDetailEventTopicAttributeUpdateEvent.participantId) &&
            Objects.equals(this.attributes, attributeDetailEventTopicAttributeUpdateEvent.attributes) &&
            Objects.equals(this.conversationExternalContactIds, attributeDetailEventTopicAttributeUpdateEvent.conversationExternalContactIds) &&
            Objects.equals(this.conversationExternalOrganizationIds, attributeDetailEventTopicAttributeUpdateEvent.conversationExternalOrganizationIds) &&
            Objects.equals(this.communications, attributeDetailEventTopicAttributeUpdateEvent.communications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, conversationId, participantId, attributes, conversationExternalContactIds, conversationExternalOrganizationIds, communications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeDetailEventTopicAttributeUpdateEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    conversationExternalContactIds: ").append(toIndentedString(conversationExternalContactIds)).append("\n");
    sb.append("    conversationExternalOrganizationIds: ").append(toIndentedString(conversationExternalOrganizationIds)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
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

