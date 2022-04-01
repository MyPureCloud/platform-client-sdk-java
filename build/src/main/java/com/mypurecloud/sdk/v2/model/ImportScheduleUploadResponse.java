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
import com.mypurecloud.sdk.v2.model.ImportScheduleUploadSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ImportScheduleUploadResponse
 */

public class ImportScheduleUploadResponse  implements Serializable {
  
  private String uploadKey = null;
  private String url = null;
  private Map<String, String> headers = null;
  private ImportScheduleUploadSchema uploadBodySchema = null;

  
  /**
   * The key to pass to the secondary request to start processing of the upload
   **/
  public ImportScheduleUploadResponse uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key to pass to the secondary request to start processing of the upload")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }

  
  /**
   * The url to which to PUT the upload body
   **/
  public ImportScheduleUploadResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to which to PUT the upload body")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Required headers for the PUT request to the url
   **/
  public ImportScheduleUploadResponse headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headers for the PUT request to the url")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  
  /**
   * Always null. Defines the schema of the json body to be PUT to the url. The json body should be gzip encoded before uploading
   **/
  public ImportScheduleUploadResponse uploadBodySchema(ImportScheduleUploadSchema uploadBodySchema) {
    this.uploadBodySchema = uploadBodySchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Always null. Defines the schema of the json body to be PUT to the url. The json body should be gzip encoded before uploading")
  @JsonProperty("uploadBodySchema")
  public ImportScheduleUploadSchema getUploadBodySchema() {
    return uploadBodySchema;
  }
  public void setUploadBodySchema(ImportScheduleUploadSchema uploadBodySchema) {
    this.uploadBodySchema = uploadBodySchema;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportScheduleUploadResponse importScheduleUploadResponse = (ImportScheduleUploadResponse) o;
    return Objects.equals(this.uploadKey, importScheduleUploadResponse.uploadKey) &&
        Objects.equals(this.url, importScheduleUploadResponse.url) &&
        Objects.equals(this.headers, importScheduleUploadResponse.headers) &&
        Objects.equals(this.uploadBodySchema, importScheduleUploadResponse.uploadBodySchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey, url, headers, uploadBodySchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportScheduleUploadResponse {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    uploadBodySchema: ").append(toIndentedString(uploadBodySchema)).append("\n");
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

