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
import com.mypurecloud.sdk.v2.model.RecordingEventMediaResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingEventRecording
 */

public class RecordingEventRecording  implements Serializable {
  
  private String id = null;
  private String conversationId = null;
  private String fileState = null;
  private List<RecordingEventMediaResult> mediaUris = new ArrayList<RecordingEventMediaResult>();
  private Integer estimatedTranscodeTimeMs = null;
  private Integer actualTranscodeTimeMs = null;

  
  /**
   **/
  public RecordingEventRecording id(String id) {
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
  public RecordingEventRecording conversationId(String conversationId) {
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
  public RecordingEventRecording fileState(String fileState) {
    this.fileState = fileState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileState")
  public String getFileState() {
    return fileState;
  }
  public void setFileState(String fileState) {
    this.fileState = fileState;
  }

  
  /**
   **/
  public RecordingEventRecording mediaUris(List<RecordingEventMediaResult> mediaUris) {
    this.mediaUris = mediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaUris")
  public List<RecordingEventMediaResult> getMediaUris() {
    return mediaUris;
  }
  public void setMediaUris(List<RecordingEventMediaResult> mediaUris) {
    this.mediaUris = mediaUris;
  }

  
  /**
   **/
  public RecordingEventRecording estimatedTranscodeTimeMs(Integer estimatedTranscodeTimeMs) {
    this.estimatedTranscodeTimeMs = estimatedTranscodeTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedTranscodeTimeMs")
  public Integer getEstimatedTranscodeTimeMs() {
    return estimatedTranscodeTimeMs;
  }
  public void setEstimatedTranscodeTimeMs(Integer estimatedTranscodeTimeMs) {
    this.estimatedTranscodeTimeMs = estimatedTranscodeTimeMs;
  }

  
  /**
   **/
  public RecordingEventRecording actualTranscodeTimeMs(Integer actualTranscodeTimeMs) {
    this.actualTranscodeTimeMs = actualTranscodeTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualTranscodeTimeMs")
  public Integer getActualTranscodeTimeMs() {
    return actualTranscodeTimeMs;
  }
  public void setActualTranscodeTimeMs(Integer actualTranscodeTimeMs) {
    this.actualTranscodeTimeMs = actualTranscodeTimeMs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingEventRecording recordingEventRecording = (RecordingEventRecording) o;
    return Objects.equals(this.id, recordingEventRecording.id) &&
        Objects.equals(this.conversationId, recordingEventRecording.conversationId) &&
        Objects.equals(this.fileState, recordingEventRecording.fileState) &&
        Objects.equals(this.mediaUris, recordingEventRecording.mediaUris) &&
        Objects.equals(this.estimatedTranscodeTimeMs, recordingEventRecording.estimatedTranscodeTimeMs) &&
        Objects.equals(this.actualTranscodeTimeMs, recordingEventRecording.actualTranscodeTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, fileState, mediaUris, estimatedTranscodeTimeMs, actualTranscodeTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingEventRecording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    mediaUris: ").append(toIndentedString(mediaUris)).append("\n");
    sb.append("    estimatedTranscodeTimeMs: ").append(toIndentedString(estimatedTranscodeTimeMs)).append("\n");
    sb.append("    actualTranscodeTimeMs: ").append(toIndentedString(actualTranscodeTimeMs)).append("\n");
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

