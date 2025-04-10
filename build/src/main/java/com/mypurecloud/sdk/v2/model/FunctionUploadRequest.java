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
 * Action function URL upload input.
 */
@ApiModel(description = "Action function URL upload input.")

public class FunctionUploadRequest  implements Serializable {
  
  private String fileName = null;
  private Integer signedUrlTimeoutSeconds = null;

  public FunctionUploadRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the file to upload.File name can only contain letters, numbers, and the following special characters: + - _ . ' ( )
   **/
  public FunctionUploadRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the file to upload.File name can only contain letters, numbers, and the following special characters: + - _ . ' ( )")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 900 seconds
   * minimum: 1
   * maximum: 604800
   **/
  public FunctionUploadRequest signedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 900 seconds")
  @JsonProperty("signedUrlTimeoutSeconds")
  public Integer getSignedUrlTimeoutSeconds() {
    return signedUrlTimeoutSeconds;
  }
  public void setSignedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionUploadRequest functionUploadRequest = (FunctionUploadRequest) o;

    return Objects.equals(this.fileName, functionUploadRequest.fileName) &&
            Objects.equals(this.signedUrlTimeoutSeconds, functionUploadRequest.signedUrlTimeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, signedUrlTimeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionUploadRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    signedUrlTimeoutSeconds: ").append(toIndentedString(signedUrlTimeoutSeconds)).append("\n");
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

