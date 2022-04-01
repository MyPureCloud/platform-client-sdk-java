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

import java.io.Serializable;
/**
 * UploadUrlRequestBody
 */

public class UploadUrlRequestBody  implements Serializable {
  
  private Long contentLengthBytes = null;

  
  /**
   * The expected content length (in bytes) of the gzip-encoded data that will be PUT to the returned signed URL
   **/
  public UploadUrlRequestBody contentLengthBytes(Long contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The expected content length (in bytes) of the gzip-encoded data that will be PUT to the returned signed URL")
  @JsonProperty("contentLengthBytes")
  public Long getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Long contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadUrlRequestBody uploadUrlRequestBody = (UploadUrlRequestBody) o;
    return Objects.equals(this.contentLengthBytes, uploadUrlRequestBody.contentLengthBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLengthBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadUrlRequestBody {\n");
    
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
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

