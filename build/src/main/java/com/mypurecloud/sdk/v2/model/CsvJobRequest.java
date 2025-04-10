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
 * CsvJobRequest
 */

public class CsvJobRequest  implements Serializable {
  
  private String uploadId = null;
  private String settingsId = null;

  public CsvJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Upload for the csv job
   **/
  public CsvJobRequest uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload for the csv job")
  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  /**
   * Settings for the csv job
   **/
  public CsvJobRequest settingsId(String settingsId) {
    this.settingsId = settingsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings for the csv job")
  @JsonProperty("settingsId")
  public String getSettingsId() {
    return settingsId;
  }
  public void setSettingsId(String settingsId) {
    this.settingsId = settingsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvJobRequest csvJobRequest = (CsvJobRequest) o;

    return Objects.equals(this.uploadId, csvJobRequest.uploadId) &&
            Objects.equals(this.settingsId, csvJobRequest.settingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, settingsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvJobRequest {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    settingsId: ").append(toIndentedString(settingsId)).append("\n");
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

