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
 * BuImportTimeOffLimitValuesRequest
 */

public class BuImportTimeOffLimitValuesRequest  implements Serializable {
  
  private String uploadKey = null;

  public BuImportTimeOffLimitValuesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuImportTimeOffLimitValuesRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The uploadKey provided by the request to get an upload URL
   **/
  public BuImportTimeOffLimitValuesRequest uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The uploadKey provided by the request to get an upload URL")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuImportTimeOffLimitValuesRequest buImportTimeOffLimitValuesRequest = (BuImportTimeOffLimitValuesRequest) o;

    return Objects.equals(this.uploadKey, buImportTimeOffLimitValuesRequest.uploadKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuImportTimeOffLimitValuesRequest {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
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

