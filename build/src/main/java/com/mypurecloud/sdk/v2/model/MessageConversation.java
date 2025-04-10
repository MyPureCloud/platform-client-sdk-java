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
import com.mypurecloud.sdk.v2.model.ConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.MessageMediaParticipant;
import com.mypurecloud.sdk.v2.model.TransferResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MessageConversation
 */

public class MessageConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<MessageMediaParticipant> participants = null;
  private List<String> otherMediaUris = null;
  private List<TransferResponse> recentTransfers = null;
  private String utilizationLabelId = null;
  private List<ConversationDivisionMembership> divisions = null;
  private String selfUri = null;

  public MessageConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<MessageMediaParticipant>();
      otherMediaUris = new ArrayList<String>();
      recentTransfers = new ArrayList<TransferResponse>();
      divisions = new ArrayList<ConversationDivisionMembership>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public MessageConversation name(String name) {
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
   * The list of participants involved in the conversation.
   **/
  public MessageConversation participants(List<MessageMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants involved in the conversation.")
  @JsonProperty("participants")
  public List<MessageMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<MessageMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   * The list of other media channels involved in the conversation.
   **/
  public MessageConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of other media channels involved in the conversation.")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }


  /**
   * The list of the most recent 20 transfer commands applied to this conversation.
   **/
  public MessageConversation recentTransfers(List<TransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of the most recent 20 transfer commands applied to this conversation.")
  @JsonProperty("recentTransfers")
  public List<TransferResponse> getRecentTransfers() {
    return recentTransfers;
  }
  public void setRecentTransfers(List<TransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
  }


  /**
   * An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level
   **/
  public MessageConversation utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   * Identifiers of divisions associated with this conversation.
   **/
  public MessageConversation divisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifiers of divisions associated with this conversation.")
  @JsonProperty("divisions")
  public List<ConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<ConversationDivisionMembership> divisions) {
    this.divisions = divisions;
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
    MessageConversation messageConversation = (MessageConversation) o;

    return Objects.equals(this.id, messageConversation.id) &&
            Objects.equals(this.name, messageConversation.name) &&
            Objects.equals(this.participants, messageConversation.participants) &&
            Objects.equals(this.otherMediaUris, messageConversation.otherMediaUris) &&
            Objects.equals(this.recentTransfers, messageConversation.recentTransfers) &&
            Objects.equals(this.utilizationLabelId, messageConversation.utilizationLabelId) &&
            Objects.equals(this.divisions, messageConversation.divisions) &&
            Objects.equals(this.selfUri, messageConversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, recentTransfers, utilizationLabelId, divisions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    recentTransfers: ").append(toIndentedString(recentTransfers)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
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

