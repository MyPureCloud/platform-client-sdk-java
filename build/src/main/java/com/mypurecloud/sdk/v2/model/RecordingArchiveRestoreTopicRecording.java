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
import com.mypurecloud.sdk.v2.model.RecordingArchiveRestoreTopicMediaResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingArchiveRestoreTopicRecording
 */

public class RecordingArchiveRestoreTopicRecording  implements Serializable {
  
  private String id = null;
  private String conversationId = null;
  private String fileState = null;
  private List<RecordingArchiveRestoreTopicMediaResult> mediaUris = new ArrayList<RecordingArchiveRestoreTopicMediaResult>();
  private Integer estimatedTranscodeTimeMs = null;
  private Integer actualTranscodeTimeMs = null;

  
  /**
   **/
  public RecordingArchiveRestoreTopicRecording id(String id) {
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
  public RecordingArchiveRestoreTopicRecording conversationId(String conversationId) {
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
  public RecordingArchiveRestoreTopicRecording fileState(String fileState) {
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
  public RecordingArchiveRestoreTopicRecording mediaUris(List<RecordingArchiveRestoreTopicMediaResult> mediaUris) {
    this.mediaUris = mediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaUris")
  public List<RecordingArchiveRestoreTopicMediaResult> getMediaUris() {
    return mediaUris;
  }
  public void setMediaUris(List<RecordingArchiveRestoreTopicMediaResult> mediaUris) {
    this.mediaUris = mediaUris;
  }

  
  /**
   **/
  public RecordingArchiveRestoreTopicRecording estimatedTranscodeTimeMs(Integer estimatedTranscodeTimeMs) {
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
  public RecordingArchiveRestoreTopicRecording actualTranscodeTimeMs(Integer actualTranscodeTimeMs) {
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
    RecordingArchiveRestoreTopicRecording recordingArchiveRestoreTopicRecording = (RecordingArchiveRestoreTopicRecording) o;
    return Objects.equals(this.id, recordingArchiveRestoreTopicRecording.id) &&
        Objects.equals(this.conversationId, recordingArchiveRestoreTopicRecording.conversationId) &&
        Objects.equals(this.fileState, recordingArchiveRestoreTopicRecording.fileState) &&
        Objects.equals(this.mediaUris, recordingArchiveRestoreTopicRecording.mediaUris) &&
        Objects.equals(this.estimatedTranscodeTimeMs, recordingArchiveRestoreTopicRecording.estimatedTranscodeTimeMs) &&
        Objects.equals(this.actualTranscodeTimeMs, recordingArchiveRestoreTopicRecording.actualTranscodeTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, fileState, mediaUris, estimatedTranscodeTimeMs, actualTranscodeTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingArchiveRestoreTopicRecording {\n");
    
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

