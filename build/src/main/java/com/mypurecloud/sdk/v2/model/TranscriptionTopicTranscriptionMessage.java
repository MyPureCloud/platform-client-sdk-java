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
import com.mypurecloud.sdk.v2.model.TranscriptionTopicTranscriptResult;
import com.mypurecloud.sdk.v2.model.TranscriptionTopicTranscriptionRequestStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionTopicTranscriptionMessage
 */

public class TranscriptionTopicTranscriptionMessage  implements Serializable {
  
  private Date eventTime = null;
  private String organizationId = null;
  private String conversationId = null;
  private String communicationId = null;
  private Integer sessionStartTimeMs = null;
  private Integer transcriptionStartTimeMs = null;
  private List<TranscriptionTopicTranscriptResult> transcripts = new ArrayList<TranscriptionTopicTranscriptResult>();
  private TranscriptionTopicTranscriptionRequestStatus status = null;

  
  /**
   **/
  public TranscriptionTopicTranscriptionMessage eventTime(Date eventTime) {
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
  public TranscriptionTopicTranscriptionMessage organizationId(String organizationId) {
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
  public TranscriptionTopicTranscriptionMessage conversationId(String conversationId) {
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
  public TranscriptionTopicTranscriptionMessage communicationId(String communicationId) {
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
  public TranscriptionTopicTranscriptionMessage sessionStartTimeMs(Integer sessionStartTimeMs) {
    this.sessionStartTimeMs = sessionStartTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionStartTimeMs")
  public Integer getSessionStartTimeMs() {
    return sessionStartTimeMs;
  }
  public void setSessionStartTimeMs(Integer sessionStartTimeMs) {
    this.sessionStartTimeMs = sessionStartTimeMs;
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptionMessage transcriptionStartTimeMs(Integer transcriptionStartTimeMs) {
    this.transcriptionStartTimeMs = transcriptionStartTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcriptionStartTimeMs")
  public Integer getTranscriptionStartTimeMs() {
    return transcriptionStartTimeMs;
  }
  public void setTranscriptionStartTimeMs(Integer transcriptionStartTimeMs) {
    this.transcriptionStartTimeMs = transcriptionStartTimeMs;
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptionMessage transcripts(List<TranscriptionTopicTranscriptResult> transcripts) {
    this.transcripts = transcripts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcripts")
  public List<TranscriptionTopicTranscriptResult> getTranscripts() {
    return transcripts;
  }
  public void setTranscripts(List<TranscriptionTopicTranscriptResult> transcripts) {
    this.transcripts = transcripts;
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptionMessage status(TranscriptionTopicTranscriptionRequestStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public TranscriptionTopicTranscriptionRequestStatus getStatus() {
    return status;
  }
  public void setStatus(TranscriptionTopicTranscriptionRequestStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionTopicTranscriptionMessage transcriptionTopicTranscriptionMessage = (TranscriptionTopicTranscriptionMessage) o;
    return Objects.equals(this.eventTime, transcriptionTopicTranscriptionMessage.eventTime) &&
        Objects.equals(this.organizationId, transcriptionTopicTranscriptionMessage.organizationId) &&
        Objects.equals(this.conversationId, transcriptionTopicTranscriptionMessage.conversationId) &&
        Objects.equals(this.communicationId, transcriptionTopicTranscriptionMessage.communicationId) &&
        Objects.equals(this.sessionStartTimeMs, transcriptionTopicTranscriptionMessage.sessionStartTimeMs) &&
        Objects.equals(this.transcriptionStartTimeMs, transcriptionTopicTranscriptionMessage.transcriptionStartTimeMs) &&
        Objects.equals(this.transcripts, transcriptionTopicTranscriptionMessage.transcripts) &&
        Objects.equals(this.status, transcriptionTopicTranscriptionMessage.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, organizationId, conversationId, communicationId, sessionStartTimeMs, transcriptionStartTimeMs, transcripts, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionTopicTranscriptionMessage {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    sessionStartTimeMs: ").append(toIndentedString(sessionStartTimeMs)).append("\n");
    sb.append("    transcriptionStartTimeMs: ").append(toIndentedString(transcriptionStartTimeMs)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

