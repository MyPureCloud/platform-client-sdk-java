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
import com.mypurecloud.sdk.v2.model.ChatMediaParticipant;
import com.mypurecloud.sdk.v2.model.TransferResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChatConversation
 */

public class ChatConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ChatMediaParticipant> participants = new ArrayList<ChatMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();
  private List<TransferResponse> recentTransfers = new ArrayList<TransferResponse>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ChatConversation name(String name) {
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
  public ChatConversation participants(List<ChatMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants involved in the conversation.")
  @JsonProperty("participants")
  public List<ChatMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ChatMediaParticipant> participants) {
    this.participants = participants;
  }


  /**
   * The list of other media channels involved in the conversation.
   **/
  public ChatConversation otherMediaUris(List<String> otherMediaUris) {
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
  public ChatConversation recentTransfers(List<TransferResponse> recentTransfers) {
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
    ChatConversation chatConversation = (ChatConversation) o;

    return Objects.equals(this.id, chatConversation.id) &&
            Objects.equals(this.name, chatConversation.name) &&
            Objects.equals(this.participants, chatConversation.participants) &&
            Objects.equals(this.otherMediaUris, chatConversation.otherMediaUris) &&
            Objects.equals(this.recentTransfers, chatConversation.recentTransfers) &&
            Objects.equals(this.selfUri, chatConversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, recentTransfers, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    recentTransfers: ").append(toIndentedString(recentTransfers)).append("\n");
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

