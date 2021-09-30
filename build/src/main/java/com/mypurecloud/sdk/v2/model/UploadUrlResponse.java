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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UploadUrlResponse
 */

public class UploadUrlResponse  implements Serializable {
  
  private String url = null;
  private String uploadKey = null;
  private Map<String, String> headers = null;

  
  @ApiModelProperty(example = "null", value = "Presigned URL to PUT the file to")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  
  @ApiModelProperty(example = "null", value = "Key that identifies the file in the storage including the file name")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }

  
  @ApiModelProperty(example = "null", value = "Required headers when uploading a file through PUT request to the URL")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadUrlResponse uploadUrlResponse = (UploadUrlResponse) o;
    return Objects.equals(this.url, uploadUrlResponse.url) &&
        Objects.equals(this.uploadKey, uploadUrlResponse.uploadKey) &&
        Objects.equals(this.headers, uploadUrlResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, uploadKey, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadUrlResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

