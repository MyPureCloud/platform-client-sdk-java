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
import com.mypurecloud.sdk.v2.model.V2StaTopicsDetectedRealtimeTopicConversationParticipant;
import com.mypurecloud.sdk.v2.model.V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification
 */

public class V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification  implements Serializable {
  
  private String conversationId = null;
  private String communicationId = null;
  private String programId = null;
  private List<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag> topics = null;
  private List<V2StaTopicsDetectedRealtimeTopicConversationParticipant> participants = null;

  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topics = new ArrayList<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag>();
      participants = new ArrayList<V2StaTopicsDetectedRealtimeTopicConversationParticipant>();
    }
  }

  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      topics = new ArrayList<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag>();
      participants = new ArrayList<V2StaTopicsDetectedRealtimeTopicConversationParticipant>();
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification conversationId(String conversationId) {
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
  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification programId(String programId) {
    this.programId = programId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification topics(List<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topics")
  public List<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag> getTopics() {
    return topics;
  }
  public void setTopics(List<V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag> topics) {
    this.topics = topics;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification participants(List<V2StaTopicsDetectedRealtimeTopicConversationParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<V2StaTopicsDetectedRealtimeTopicConversationParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<V2StaTopicsDetectedRealtimeTopicConversationParticipant> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification = (V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification) o;

    return Objects.equals(this.conversationId, v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification.conversationId) &&
            Objects.equals(this.communicationId, v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification.communicationId) &&
            Objects.equals(this.programId, v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification.programId) &&
            Objects.equals(this.topics, v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification.topics) &&
            Objects.equals(this.participants, v2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, communicationId, programId, topics, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedRealtimeTopicTopicSpottingRealTimeNotification {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

