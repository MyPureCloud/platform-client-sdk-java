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
 * BatchDownloadJobResult
 */

public class BatchDownloadJobResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String conversationId = null;
  private String recordingId = null;
  private String resultUrl = null;
  private String contentType = null;
  private String errorMsg = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public BatchDownloadJobResult name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
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
    return Objects.equals(this.id, batchDownloadJobResult.id) &&
        Objects.equals(this.name, batchDownloadJobResult.name) &&
        Objects.equals(this.conversationId, batchDownloadJobResult.conversationId) &&
        Objects.equals(this.recordingId, batchDownloadJobResult.recordingId) &&
        Objects.equals(this.resultUrl, batchDownloadJobResult.resultUrl) &&
        Objects.equals(this.contentType, batchDownloadJobResult.contentType) &&
        Objects.equals(this.errorMsg, batchDownloadJobResult.errorMsg) &&
        Objects.equals(this.selfUri, batchDownloadJobResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, recordingId, resultUrl, contentType, errorMsg, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDownloadJobResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

