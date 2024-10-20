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
import com.mypurecloud.sdk.v2.model.Header;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CsvUploadResponse
 */

public class CsvUploadResponse  implements Serializable {
  
  private String uploadId = null;
  private String uploadUrl = null;
  private List<Header> uploadHeaders = new ArrayList<Header>();

  
  /**
   * Id of the upload
   **/
  public CsvUploadResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the upload")
  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  /**
   * Url for the upload
   **/
  public CsvUploadResponse uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Url for the upload")
  @JsonProperty("uploadUrl")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  /**
   * Required headers for the upload
   **/
  public CsvUploadResponse uploadHeaders(List<Header> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required headers for the upload")
  @JsonProperty("uploadHeaders")
  public List<Header> getUploadHeaders() {
    return uploadHeaders;
  }
  public void setUploadHeaders(List<Header> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvUploadResponse csvUploadResponse = (CsvUploadResponse) o;

    return Objects.equals(this.uploadId, csvUploadResponse.uploadId) &&
            Objects.equals(this.uploadUrl, csvUploadResponse.uploadUrl) &&
            Objects.equals(this.uploadHeaders, csvUploadResponse.uploadHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, uploadUrl, uploadHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvUploadResponse {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadHeaders: ").append(toIndentedString(uploadHeaders)).append("\n");
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

