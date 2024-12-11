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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BatchDownloadJobResult
 */

public class BatchDownloadJobResult  implements Serializable {
  
  private String conversationId = null;
  private String recordingId = null;
  private String resultUrl = null;
  private String contentType = null;
  private String errorMsg = null;

  
  /**
   * Conversation id of the result
   **/
  public BatchDownloadJobResult conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation id of the result")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Recording id of the result
   **/
  public BatchDownloadJobResult recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recording id of the result")
  @JsonProperty("recordingId")
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  /**
   * URL of results... HTTP GET from this location to download results for this item
   **/
  public BatchDownloadJobResult resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of results... HTTP GET from this location to download results for this item")
  @JsonProperty("resultUrl")
  public String getResultUrl() {
    return resultUrl;
  }
  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }


  /**
   * Content type of this result
   **/
  public BatchDownloadJobResult contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content type of this result")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * An error message, in case of failed processing will indicate the cause of the failure
   **/
  public BatchDownloadJobResult errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An error message, in case of failed processing will indicate the cause of the failure")
  @JsonProperty("errorMsg")
  public String getErrorMsg() {
    return errorMsg;
  }
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDownloadJobResult batchDownloadJobResult = (BatchDownloadJobResult) o;

    return Objects.equals(this.conversationId, batchDownloadJobResult.conversationId) &&
            Objects.equals(this.recordingId, batchDownloadJobResult.recordingId) &&
            Objects.equals(this.resultUrl, batchDownloadJobResult.resultUrl) &&
            Objects.equals(this.contentType, batchDownloadJobResult.contentType) &&
            Objects.equals(this.errorMsg, batchDownloadJobResult.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, recordingId, resultUrl, contentType, errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDownloadJobResult {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

