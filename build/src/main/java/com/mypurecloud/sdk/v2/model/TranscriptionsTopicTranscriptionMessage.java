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
import com.mypurecloud.sdk.v2.model.TranscriptionsTopicTranscriptResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionsTopicTranscriptionMessage
 */

public class TranscriptionsTopicTranscriptionMessage  implements Serializable {
  
  private Date eventTime = null;
  private Integer batchIntervalMs = null;
  private String organizationId = null;
  private String conversationId = null;
  private String communicationId = null;
  private String sessionId = null;
  private List<TranscriptionsTopicTranscriptResult> transcripts = new ArrayList<TranscriptionsTopicTranscriptResult>();

  
  /**
   **/
  public TranscriptionsTopicTranscriptionMessage eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptionMessage batchIntervalMs(Integer batchIntervalMs) {
    this.batchIntervalMs = batchIntervalMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("batchIntervalMs")
  public Integer getBatchIntervalMs() {
    return batchIntervalMs;
  }
  public void setBatchIntervalMs(Integer batchIntervalMs) {
    this.batchIntervalMs = batchIntervalMs;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptionMessage organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptionMessage conversationId(String conversationId) {
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
  public TranscriptionsTopicTranscriptionMessage communicationId(String communicationId) {
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
  public TranscriptionsTopicTranscriptionMessage sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptionMessage transcripts(List<TranscriptionsTopicTranscriptResult> transcripts) {
    this.transcripts = transcripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcripts")
  public List<TranscriptionsTopicTranscriptResult> getTranscripts() {
    return transcripts;
  }
  public void setTranscripts(List<TranscriptionsTopicTranscriptResult> transcripts) {
    this.transcripts = transcripts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionsTopicTranscriptionMessage transcriptionsTopicTranscriptionMessage = (TranscriptionsTopicTranscriptionMessage) o;
    return Objects.equals(this.eventTime, transcriptionsTopicTranscriptionMessage.eventTime) &&
        Objects.equals(this.batchIntervalMs, transcriptionsTopicTranscriptionMessage.batchIntervalMs) &&
        Objects.equals(this.organizationId, transcriptionsTopicTranscriptionMessage.organizationId) &&
        Objects.equals(this.conversationId, transcriptionsTopicTranscriptionMessage.conversationId) &&
        Objects.equals(this.communicationId, transcriptionsTopicTranscriptionMessage.communicationId) &&
        Objects.equals(this.sessionId, transcriptionsTopicTranscriptionMessage.sessionId) &&
        Objects.equals(this.transcripts, transcriptionsTopicTranscriptionMessage.transcripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, batchIntervalMs, organizationId, conversationId, communicationId, sessionId, transcripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionsTopicTranscriptionMessage {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    batchIntervalMs: ").append(toIndentedString(batchIntervalMs)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
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

