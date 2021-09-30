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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingJobFailedRecording
 */

public class RecordingJobFailedRecording  implements Serializable {
  
  private AddressableEntityRef conversation = null;
  private AddressableEntityRef recording = null;

  
  @ApiModelProperty(example = "null", value = "Conversation")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }

  
  @ApiModelProperty(example = "null", value = "Recording")
  @JsonProperty("recording")
  public AddressableEntityRef getRecording() {
    return recording;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingJobFailedRecording recordingJobFailedRecording = (RecordingJobFailedRecording) o;
    return Objects.equals(this.conversation, recordingJobFailedRecording.conversation) &&
        Objects.equals(this.recording, recordingJobFailedRecording.recording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, recording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingJobFailedRecording {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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

