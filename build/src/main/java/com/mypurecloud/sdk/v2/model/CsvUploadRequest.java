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
 * CsvUploadRequest
 */

public class CsvUploadRequest  implements Serializable {
  
  private String fileName = null;
  private Long fileSize = null;

  public CsvUploadRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the file to upload
   **/
  public CsvUploadRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the file to upload")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The size of the upload file
   * maximum: 52428800
   **/
  public CsvUploadRequest fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the upload file")
  @JsonProperty("fileSize")
  public Long getFileSize() {
    return fileSize;
  }
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvUploadRequest csvUploadRequest = (CsvUploadRequest) o;

    return Objects.equals(this.fileName, csvUploadRequest.fileName) &&
            Objects.equals(this.fileSize, csvUploadRequest.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvUploadRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

