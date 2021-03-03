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
import com.mypurecloud.sdk.v2.model.ConversationChatEventTopicChatMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationChatEventTopicChatConversation
 */

public class ConversationChatEventTopicChatConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ConversationChatEventTopicChatMediaParticipant> participants = new ArrayList<ConversationChatEventTopicChatMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();

  
  /**
   **/
  public ConversationChatEventTopicChatConversation id(String id) {
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
  public ConversationChatEventTopicChatConversation name(String name) {
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
  public ConversationChatEventTopicChatConversation participants(List<ConversationChatEventTopicChatMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationChatEventTopicChatMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationChatEventTopicChatMediaParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   **/
  public ConversationChatEventTopicChatConversation otherMediaUris(List<String> otherMediaUris) {
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
    ConversationChatEventTopicChatConversation conversationChatEventTopicChatConversation = (ConversationChatEventTopicChatConversation) o;
    return Objects.equals(this.id, conversationChatEventTopicChatConversation.id) &&
        Objects.equals(this.name, conversationChatEventTopicChatConversation.name) &&
        Objects.equals(this.participants, conversationChatEventTopicChatConversation.participants) &&
        Objects.equals(this.otherMediaUris, conversationChatEventTopicChatConversation.otherMediaUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChatEventTopicChatConversation {\n");
    
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

