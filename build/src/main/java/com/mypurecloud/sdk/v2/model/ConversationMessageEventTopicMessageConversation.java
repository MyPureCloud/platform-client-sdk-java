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
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicMessageMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationMessageEventTopicMessageConversation
 */

public class ConversationMessageEventTopicMessageConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ConversationMessageEventTopicMessageMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private String address = null;
  private String utilizationLabelId = null;
  private Date inactivityTimeout = null;
  private List<ConversationMessageEventTopicConversationDivisionMembership> divisions = null;

  public ConversationMessageEventTopicMessageConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<ConversationMessageEventTopicMessageMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      divisions = new ArrayList<ConversationMessageEventTopicConversationDivisionMembership>();
    }
  }

  
  /**
   **/
  public ConversationMessageEventTopicMessageConversation id(String id) {
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
  public ConversationMessageEventTopicMessageConversation name(String name) {
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
   **/
  public ConversationMessageEventTopicMessageConversation participants(List<ConversationMessageEventTopicMessageMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationMessageEventTopicMessageMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationMessageEventTopicMessageMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageConversation address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageConversation utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageConversation inactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inactivityTimeout")
  public Date getInactivityTimeout() {
    return inactivityTimeout;
  }
  public void setInactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageConversation divisions(List<ConversationMessageEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisions")
  public List<ConversationMessageEventTopicConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<ConversationMessageEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageEventTopicMessageConversation conversationMessageEventTopicMessageConversation = (ConversationMessageEventTopicMessageConversation) o;

    return Objects.equals(this.id, conversationMessageEventTopicMessageConversation.id) &&
            Objects.equals(this.name, conversationMessageEventTopicMessageConversation.name) &&
            Objects.equals(this.participants, conversationMessageEventTopicMessageConversation.participants) &&
            Objects.equals(this.otherMediaUris, conversationMessageEventTopicMessageConversation.otherMediaUris) &&
            Objects.equals(this.address, conversationMessageEventTopicMessageConversation.address) &&
            Objects.equals(this.utilizationLabelId, conversationMessageEventTopicMessageConversation.utilizationLabelId) &&
            Objects.equals(this.inactivityTimeout, conversationMessageEventTopicMessageConversation.inactivityTimeout) &&
            Objects.equals(this.divisions, conversationMessageEventTopicMessageConversation.divisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, address, utilizationLabelId, inactivityTimeout, divisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventTopicMessageConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    inactivityTimeout: ").append(toIndentedString(inactivityTimeout)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
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

