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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V3SynchronizationUploadUrlResponse
 */

public class V3SynchronizationUploadUrlResponse  implements Serializable {
  
  private String url = null;
  private Map<String, String> headers = null;

  public V3SynchronizationUploadUrlResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationUploadUrlResponse v3SynchronizationUploadUrlResponse = (V3SynchronizationUploadUrlResponse) o;

    return Objects.equals(this.url, v3SynchronizationUploadUrlResponse.url) &&
            Objects.equals(this.headers, v3SynchronizationUploadUrlResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationUploadUrlResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

