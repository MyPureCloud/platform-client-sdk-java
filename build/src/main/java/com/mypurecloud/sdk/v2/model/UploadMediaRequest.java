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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UploadMediaRequest
 */

public class UploadMediaRequest  implements Serializable {
  
  private String fileName = null;
  private Integer contentLengthBytes = null;
  private String contentMd5 = null;

  public UploadMediaRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the media file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|
   **/
  public UploadMediaRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the media file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The length of the file to upload in bytes
   **/
  public UploadMediaRequest contentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the file to upload in bytes")
  @JsonProperty("contentLengthBytes")
  public Integer getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Integer contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }


  /**
   * Content MD5 of the file to upload
   **/
  public UploadMediaRequest contentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content MD5 of the file to upload")
  @JsonProperty("contentMd5")
  public String getContentMd5() {
    return contentMd5;
  }
  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadMediaRequest uploadMediaRequest = (UploadMediaRequest) o;

    return Objects.equals(this.fileName, uploadMediaRequest.fileName) &&
            Objects.equals(this.contentLengthBytes, uploadMediaRequest.contentLengthBytes) &&
            Objects.equals(this.contentMd5, uploadMediaRequest.contentMd5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, contentLengthBytes, contentMd5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadMediaRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
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

