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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BatchDownloadRequest
 */

public class BatchDownloadRequest  implements Serializable {
  
  private String conversationId = null;
  private String recordingId = null;

  
  /**
   * Conversation id requested
   **/
  public BatchDownloadRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation id requested")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Recording id requested, optional.  Leave null for all recordings on the conversation
   **/
  public BatchDownloadRequest recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recording id requested, optional.  Leave null for all recordings on the conversation")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDownloadRequest batchDownloadRequest = (BatchDownloadRequest) o;
    return Objects.equals(this.conversationId, batchDownloadRequest.conversationId) &&
        Objects.equals(this.recordingId, batchDownloadRequest.recordingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, recordingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDownloadRequest {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
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

