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
import com.mypurecloud.sdk.v2.model.QueueConversationScreenShareEventTopicConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.QueueConversationScreenShareEventTopicScreenShareMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationScreenShareEventTopicScreenShareConversation
 */

public class QueueConversationScreenShareEventTopicScreenShareConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<QueueConversationScreenShareEventTopicScreenShareMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private String address = null;
  private String utilizationLabelId = null;
  private List<QueueConversationScreenShareEventTopicConversationDivisionMembership> divisions = null;

  public QueueConversationScreenShareEventTopicScreenShareConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<QueueConversationScreenShareEventTopicScreenShareMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      divisions = new ArrayList<QueueConversationScreenShareEventTopicConversationDivisionMembership>();
    }
  }

  
  /**
   **/
  public QueueConversationScreenShareEventTopicScreenShareConversation id(String id) {
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
  public QueueConversationScreenShareEventTopicScreenShareConversation name(String name) {
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
  public QueueConversationScreenShareEventTopicScreenShareConversation participants(List<QueueConversationScreenShareEventTopicScreenShareMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<QueueConversationScreenShareEventTopicScreenShareMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<QueueConversationScreenShareEventTopicScreenShareMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public QueueConversationScreenShareEventTopicScreenShareConversation otherMediaUris(List<String> otherMediaUris) {
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
  public QueueConversationScreenShareEventTopicScreenShareConversation address(String address) {
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
  public QueueConversationScreenShareEventTopicScreenShareConversation utilizationLabelId(String utilizationLabelId) {
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
  public QueueConversationScreenShareEventTopicScreenShareConversation divisions(List<QueueConversationScreenShareEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisions")
  public List<QueueConversationScreenShareEventTopicConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<QueueConversationScreenShareEventTopicConversationDivisionMembership> divisions) {
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
    QueueConversationScreenShareEventTopicScreenShareConversation queueConversationScreenShareEventTopicScreenShareConversation = (QueueConversationScreenShareEventTopicScreenShareConversation) o;

    return Objects.equals(this.id, queueConversationScreenShareEventTopicScreenShareConversation.id) &&
            Objects.equals(this.name, queueConversationScreenShareEventTopicScreenShareConversation.name) &&
            Objects.equals(this.participants, queueConversationScreenShareEventTopicScreenShareConversation.participants) &&
            Objects.equals(this.otherMediaUris, queueConversationScreenShareEventTopicScreenShareConversation.otherMediaUris) &&
            Objects.equals(this.address, queueConversationScreenShareEventTopicScreenShareConversation.address) &&
            Objects.equals(this.utilizationLabelId, queueConversationScreenShareEventTopicScreenShareConversation.utilizationLabelId) &&
            Objects.equals(this.divisions, queueConversationScreenShareEventTopicScreenShareConversation.divisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, address, utilizationLabelId, divisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationScreenShareEventTopicScreenShareConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
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

