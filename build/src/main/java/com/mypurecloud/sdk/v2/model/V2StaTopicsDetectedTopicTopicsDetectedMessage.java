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
import com.mypurecloud.sdk.v2.model.V2StaTopicsDetectedTopicParticipant;
import com.mypurecloud.sdk.v2.model.V2StaTopicsDetectedTopicTopicDetected;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaTopicsDetectedTopicTopicsDetectedMessage
 */

public class V2StaTopicsDetectedTopicTopicsDetectedMessage  implements Serializable {
  
  private String conversationId = null;
  private String communicationId = null;
  private String recordingId = null;
  private String transcriptId = null;
  private String mediaType = null;
  private List<V2StaTopicsDetectedTopicTopicDetected> topics = null;
  private List<V2StaTopicsDetectedTopicParticipant> participants = null;

  public V2StaTopicsDetectedTopicTopicsDetectedMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topics = new ArrayList<V2StaTopicsDetectedTopicTopicDetected>();
      participants = new ArrayList<V2StaTopicsDetectedTopicParticipant>();
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedTopicTopicsDetectedMessage conversationId(String conversationId) {
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
  public V2StaTopicsDetectedTopicTopicsDetectedMessage communicationId(String communicationId) {
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
  public V2StaTopicsDetectedTopicTopicsDetectedMessage recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  /**
   **/
  public V2StaTopicsDetectedTopicTopicsDetectedMessage transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcriptId")
  public String getTranscriptId() {
    return transcriptId;
  }
  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }


  /**
   **/
  public V2StaTopicsDetectedTopicTopicsDetectedMessage mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public V2StaTopicsDetectedTopicTopicsDetectedMessage topics(List<V2StaTopicsDetectedTopicTopicDetected> topics) {
    this.topics = topics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topics")
  public List<V2StaTopicsDetectedTopicTopicDetected> getTopics() {
    return topics;
  }
  public void setTopics(List<V2StaTopicsDetectedTopicTopicDetected> topics) {
    this.topics = topics;
  }


  /**
   **/
  public V2StaTopicsDetectedTopicTopicsDetectedMessage participants(List<V2StaTopicsDetectedTopicParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<V2StaTopicsDetectedTopicParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<V2StaTopicsDetectedTopicParticipant> participants) {
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
    V2StaTopicsDetectedTopicTopicsDetectedMessage v2StaTopicsDetectedTopicTopicsDetectedMessage = (V2StaTopicsDetectedTopicTopicsDetectedMessage) o;

    return Objects.equals(this.conversationId, v2StaTopicsDetectedTopicTopicsDetectedMessage.conversationId) &&
            Objects.equals(this.communicationId, v2StaTopicsDetectedTopicTopicsDetectedMessage.communicationId) &&
            Objects.equals(this.recordingId, v2StaTopicsDetectedTopicTopicsDetectedMessage.recordingId) &&
            Objects.equals(this.transcriptId, v2StaTopicsDetectedTopicTopicsDetectedMessage.transcriptId) &&
            Objects.equals(this.mediaType, v2StaTopicsDetectedTopicTopicsDetectedMessage.mediaType) &&
            Objects.equals(this.topics, v2StaTopicsDetectedTopicTopicsDetectedMessage.topics) &&
            Objects.equals(this.participants, v2StaTopicsDetectedTopicTopicsDetectedMessage.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, communicationId, recordingId, transcriptId, mediaType, topics, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedTopicTopicsDetectedMessage {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

