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
 * CreateUploadSourceUrlJobRequest
 */

public class CreateUploadSourceUrlJobRequest  implements Serializable {
  
  private String uploadUrl = null;

  
  /**
   * The URL of the content to upload.
   **/
  public CreateUploadSourceUrlJobRequest uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The URL of the content to upload.")
  @JsonProperty("uploadUrl")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadSourceUrlJobRequest createUploadSourceUrlJobRequest = (CreateUploadSourceUrlJobRequest) o;

    return Objects.equals(this.uploadUrl, createUploadSourceUrlJobRequest.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadSourceUrlJobRequest {\n");
    
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

