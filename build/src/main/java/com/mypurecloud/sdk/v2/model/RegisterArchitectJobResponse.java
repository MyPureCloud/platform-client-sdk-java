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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * RegisterArchitectJobResponse
 */

public class RegisterArchitectJobResponse  implements Serializable {
  
  private String id = null;
  private String presignedUrl = null;
  private Map<String, String> headers = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Presigned URL to upload the file in S3")
  @JsonProperty("presignedUrl")
  public String getPresignedUrl() {
    return presignedUrl;
  }


  @ApiModelProperty(example = "null", value = "Required headers when uploading a file through PUT request to the URL")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterArchitectJobResponse registerArchitectJobResponse = (RegisterArchitectJobResponse) o;

    return Objects.equals(this.id, registerArchitectJobResponse.id) &&
            Objects.equals(this.presignedUrl, registerArchitectJobResponse.presignedUrl) &&
            Objects.equals(this.headers, registerArchitectJobResponse.headers) &&
            Objects.equals(this.selfUri, registerArchitectJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, presignedUrl, headers, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterArchitectJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

