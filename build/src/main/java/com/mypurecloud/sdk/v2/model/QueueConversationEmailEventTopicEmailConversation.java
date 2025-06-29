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
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.QueueConversationEmailEventTopicEmailMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEmailEventTopicEmailConversation
 */

public class QueueConversationEmailEventTopicEmailConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<QueueConversationEmailEventTopicEmailMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private String address = null;
  private String utilizationLabelId = null;
  private Date inactivityTimeout = null;
  private List<QueueConversationEmailEventTopicConversationDivisionMembership> divisions = null;

  public QueueConversationEmailEventTopicEmailConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<QueueConversationEmailEventTopicEmailMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      divisions = new ArrayList<QueueConversationEmailEventTopicConversationDivisionMembership>();
    }
  }

  
  /**
   **/
  public QueueConversationEmailEventTopicEmailConversation id(String id) {
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
  public QueueConversationEmailEventTopicEmailConversation name(String name) {
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
  public QueueConversationEmailEventTopicEmailConversation participants(List<QueueConversationEmailEventTopicEmailMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<QueueConversationEmailEventTopicEmailMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<QueueConversationEmailEventTopicEmailMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public QueueConversationEmailEventTopicEmailConversation otherMediaUris(List<String> otherMediaUris) {
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
  public QueueConversationEmailEventTopicEmailConversation address(String address) {
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
  public QueueConversationEmailEventTopicEmailConversation utilizationLabelId(String utilizationLabelId) {
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
  public QueueConversationEmailEventTopicEmailConversation inactivityTimeout(Date inactivityTimeout) {
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
  public QueueConversationEmailEventTopicEmailConversation divisions(List<QueueConversationEmailEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisions")
  public List<QueueConversationEmailEventTopicConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<QueueConversationEmailEventTopicConversationDivisionMembership> divisions) {
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
    QueueConversationEmailEventTopicEmailConversation queueConversationEmailEventTopicEmailConversation = (QueueConversationEmailEventTopicEmailConversation) o;

    return Objects.equals(this.id, queueConversationEmailEventTopicEmailConversation.id) &&
            Objects.equals(this.name, queueConversationEmailEventTopicEmailConversation.name) &&
            Objects.equals(this.participants, queueConversationEmailEventTopicEmailConversation.participants) &&
            Objects.equals(this.otherMediaUris, queueConversationEmailEventTopicEmailConversation.otherMediaUris) &&
            Objects.equals(this.address, queueConversationEmailEventTopicEmailConversation.address) &&
            Objects.equals(this.utilizationLabelId, queueConversationEmailEventTopicEmailConversation.utilizationLabelId) &&
            Objects.equals(this.inactivityTimeout, queueConversationEmailEventTopicEmailConversation.inactivityTimeout) &&
            Objects.equals(this.divisions, queueConversationEmailEventTopicEmailConversation.divisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, address, utilizationLabelId, inactivityTimeout, divisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEmailEventTopicEmailConversation {\n");
    
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

