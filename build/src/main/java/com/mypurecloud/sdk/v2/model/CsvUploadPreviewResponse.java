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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CsvUploadPreviewResponse
 */

public class CsvUploadPreviewResponse  implements Serializable {
  
  private String uploadId = null;
  private List<String> headers = null;
  private List<List<String>> entries = null;

  public CsvUploadPreviewResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      headers = new ArrayList<String>();
      entries = new ArrayList<List<String>>();
    }
  }

  
  /**
   * Id for the upload
   **/
  public CsvUploadPreviewResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for the upload")
  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  /**
   * List of headers in the CSV
   **/
  public CsvUploadPreviewResponse headers(List<String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of headers in the CSV")
  @JsonProperty("headers")
  public List<String> getHeaders() {
    return headers;
  }
  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  /**
   * List of entries in the CSV
   **/
  public CsvUploadPreviewResponse entries(List<List<String>> entries) {
    this.entries = entries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of entries in the CSV")
  @JsonProperty("entries")
  public List<List<String>> getEntries() {
    return entries;
  }
  public void setEntries(List<List<String>> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvUploadPreviewResponse csvUploadPreviewResponse = (CsvUploadPreviewResponse) o;

    return Objects.equals(this.uploadId, csvUploadPreviewResponse.uploadId) &&
            Objects.equals(this.headers, csvUploadPreviewResponse.headers) &&
            Objects.equals(this.entries, csvUploadPreviewResponse.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, headers, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvUploadPreviewResponse {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

