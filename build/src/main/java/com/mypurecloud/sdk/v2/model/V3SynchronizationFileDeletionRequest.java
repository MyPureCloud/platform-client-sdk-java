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
 * V3SynchronizationFileDeletionRequest
 */

public class V3SynchronizationFileDeletionRequest  implements Serializable {
  
  private String fileId = null;
  private String fileName = null;

  public V3SynchronizationFileDeletionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SynchronizationFileDeletionRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The identifier of the file to mark for deletion. Mutually exclusive with fileName.
   **/
  public V3SynchronizationFileDeletionRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the file to mark for deletion. Mutually exclusive with fileName.")
  @JsonProperty("fileId")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  /**
   * Name of the file to mark for deletion. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|. Mutually exclusive with fileId.
   **/
  public V3SynchronizationFileDeletionRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the file to mark for deletion. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#|. Mutually exclusive with fileId.")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationFileDeletionRequest v3SynchronizationFileDeletionRequest = (V3SynchronizationFileDeletionRequest) o;

    return Objects.equals(this.fileId, v3SynchronizationFileDeletionRequest.fileId) &&
            Objects.equals(this.fileName, v3SynchronizationFileDeletionRequest.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationFileDeletionRequest {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

