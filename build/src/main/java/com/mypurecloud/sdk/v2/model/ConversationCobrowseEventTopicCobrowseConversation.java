package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationCobrowseEventTopicCobrowseMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationCobrowseEventTopicCobrowseConversation
 */

public class ConversationCobrowseEventTopicCobrowseConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ConversationCobrowseEventTopicCobrowseMediaParticipant> participants = new ArrayList<ConversationCobrowseEventTopicCobrowseMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseConversation id(String id) {
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
  public ConversationCobrowseEventTopicCobrowseConversation name(String name) {
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
  public ConversationCobrowseEventTopicCobrowseConversation participants(List<ConversationCobrowseEventTopicCobrowseMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationCobrowseEventTopicCobrowseMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationCobrowseEventTopicCobrowseMediaParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicCobrowseConversation otherMediaUris(List<String> otherMediaUris) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCobrowseEventTopicCobrowseConversation conversationCobrowseEventTopicCobrowseConversation = (ConversationCobrowseEventTopicCobrowseConversation) o;
    return Objects.equals(this.id, conversationCobrowseEventTopicCobrowseConversation.id) &&
        Objects.equals(this.name, conversationCobrowseEventTopicCobrowseConversation.name) &&
        Objects.equals(this.participants, conversationCobrowseEventTopicCobrowseConversation.participants) &&
        Objects.equals(this.otherMediaUris, conversationCobrowseEventTopicCobrowseConversation.otherMediaUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCobrowseEventTopicCobrowseConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
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

