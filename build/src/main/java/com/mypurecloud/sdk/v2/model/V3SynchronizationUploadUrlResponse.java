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
import com.mypurecloud.sdk.v2.model.V3SynchronizationRef;
import com.mypurecloud.sdk.v2.model.V3SynchronizationUploadMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V3SynchronizationUploadUrlResponse
 */

public class V3SynchronizationUploadUrlResponse  implements Serializable {
  
  private String fileId = null;
  private String fileName = null;
  private V3SynchronizationUploadMetadata metadata = null;
  private V3SynchronizationRef synchronization = null;
  private String url = null;
  private Map<String, String> headers = null;
  private String selfUri = null;

  public V3SynchronizationUploadUrlResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SynchronizationUploadUrlResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The unique identifier for the upload object.
   **/
  public V3SynchronizationUploadUrlResponse fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the upload object.")
  @JsonProperty("fileId")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  /**
   * Name of the uploaded file.
   **/
  public V3SynchronizationUploadUrlResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the uploaded file.")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The metadata of the uploaded file
   **/
  public V3SynchronizationUploadUrlResponse metadata(V3SynchronizationUploadMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metadata of the uploaded file")
  @JsonProperty("metadata")
  public V3SynchronizationUploadMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(V3SynchronizationUploadMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * The synchronization of the file upload.
   **/
  public V3SynchronizationUploadUrlResponse synchronization(V3SynchronizationRef synchronization) {
    this.synchronization = synchronization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The synchronization of the file upload.")
  @JsonProperty("synchronization")
  public V3SynchronizationRef getSynchronization() {
    return synchronization;
  }
  public void setSynchronization(V3SynchronizationRef synchronization) {
    this.synchronization = synchronization;
  }


  /**
   * Pre-signed URL to PUT the file to.
   **/
  public V3SynchronizationUploadUrlResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pre-signed URL to PUT the file to.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Required headers when uploading a file through PUT request to the URL.
   **/
  public V3SynchronizationUploadUrlResponse headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headers when uploading a file through PUT request to the URL.")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
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
    V3SynchronizationUploadUrlResponse v3SynchronizationUploadUrlResponse = (V3SynchronizationUploadUrlResponse) o;

    return Objects.equals(this.fileId, v3SynchronizationUploadUrlResponse.fileId) &&
            Objects.equals(this.fileName, v3SynchronizationUploadUrlResponse.fileName) &&
            Objects.equals(this.metadata, v3SynchronizationUploadUrlResponse.metadata) &&
            Objects.equals(this.synchronization, v3SynchronizationUploadUrlResponse.synchronization) &&
            Objects.equals(this.url, v3SynchronizationUploadUrlResponse.url) &&
            Objects.equals(this.headers, v3SynchronizationUploadUrlResponse.headers) &&
            Objects.equals(this.selfUri, v3SynchronizationUploadUrlResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, fileName, metadata, synchronization, url, headers, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationUploadUrlResponse {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

