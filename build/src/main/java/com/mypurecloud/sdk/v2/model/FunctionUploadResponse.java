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
 * Action function create upload URL response.
 */
@ApiModel(description = "Action function create upload URL response.")

public class FunctionUploadResponse  implements Serializable {
  
  private String url = null;
  private Map<String, String> headers = null;
  private Integer signedUrlTimeoutSeconds = null;

  public FunctionUploadResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Presigned URL to PUT the file to")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }


  @ApiModelProperty(example = "null", value = "Required headers when uploading a file through PUT request to the URL")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }


  /**
   * Upload time to live in seconds.
   **/
  public FunctionUploadResponse signedUrlTimeoutSeconds(Integer signedUrlTimeoutSeconds) {
    this.signedUrlTimeoutSeconds = signedUrlTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Upload time to live in seconds.")
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
    FunctionUploadResponse functionUploadResponse = (FunctionUploadResponse) o;

    return Objects.equals(this.url, functionUploadResponse.url) &&
            Objects.equals(this.headers, functionUploadResponse.headers) &&
            Objects.equals(this.signedUrlTimeoutSeconds, functionUploadResponse.signedUrlTimeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, headers, signedUrlTimeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionUploadResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

