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
import com.mypurecloud.sdk.v2.model.V3SynchronizationUploadMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V3SynchronizationUploadUrlRequest
 */

public class V3SynchronizationUploadUrlRequest  implements Serializable {
  
  private String fileName = null;
  private String contentMd5 = null;
  private String contentType = null;
  private Integer contentLength = null;
  private V3SynchronizationUploadMetadata metadata = null;

  public V3SynchronizationUploadUrlRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SynchronizationUploadUrlRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|
   **/
  public V3SynchronizationUploadUrlRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * Content MD5 of the file to upload encoded in base64, example: \"f8VicOenD6gaWTW3Lqy+KQ==\". Not the hexadecimal representation as \"7fc56270e7a70fa81a5935b72eacbe29\".
   **/
  public V3SynchronizationUploadUrlRequest contentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content MD5 of the file to upload encoded in base64, example: \"f8VicOenD6gaWTW3Lqy+KQ==\". Not the hexadecimal representation as \"7fc56270e7a70fa81a5935b72eacbe29\".")
  @JsonProperty("contentMd5")
  public String getContentMd5() {
    return contentMd5;
  }
  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }


  /**
   * The content type of the file to upload
   **/
  public V3SynchronizationUploadUrlRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content type of the file to upload")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * The length of the file to upload in bytes
   **/
  public V3SynchronizationUploadUrlRequest contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of the file to upload in bytes")
  @JsonProperty("contentLength")
  public Integer getContentLength() {
    return contentLength;
  }
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  /**
   * The metadata of the file to upload
   **/
  public V3SynchronizationUploadUrlRequest metadata(V3SynchronizationUploadMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metadata of the file to upload")
  @JsonProperty("metadata")
  public V3SynchronizationUploadMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(V3SynchronizationUploadMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationUploadUrlRequest v3SynchronizationUploadUrlRequest = (V3SynchronizationUploadUrlRequest) o;

    return Objects.equals(this.fileName, v3SynchronizationUploadUrlRequest.fileName) &&
            Objects.equals(this.contentMd5, v3SynchronizationUploadUrlRequest.contentMd5) &&
            Objects.equals(this.contentType, v3SynchronizationUploadUrlRequest.contentType) &&
            Objects.equals(this.contentLength, v3SynchronizationUploadUrlRequest.contentLength) &&
            Objects.equals(this.metadata, v3SynchronizationUploadUrlRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, contentMd5, contentType, contentLength, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationUploadUrlRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

