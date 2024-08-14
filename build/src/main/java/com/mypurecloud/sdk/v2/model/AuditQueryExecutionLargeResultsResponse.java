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
 * AuditQueryExecutionLargeResultsResponse
 */

public class AuditQueryExecutionLargeResultsResponse  implements Serializable {
  
  private String id = null;
  private Integer pageSize = null;
  private String cursor = null;
  private String downloadUrl = null;

  
  /**
   * Id of the audit query execution request.
   **/
  public AuditQueryExecutionLargeResultsResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the audit query execution request.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Number of results in a page.
   **/
  public AuditQueryExecutionLargeResultsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of results in a page.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Optional cursor to indicate where to resume the results.
   **/
  public AuditQueryExecutionLargeResultsResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional cursor to indicate where to resume the results.")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  /**
   * The presigned url which can be used to download the results.
   **/
  public AuditQueryExecutionLargeResultsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The presigned url which can be used to download the results.")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryExecutionLargeResultsResponse auditQueryExecutionLargeResultsResponse = (AuditQueryExecutionLargeResultsResponse) o;

    return Objects.equals(this.id, auditQueryExecutionLargeResultsResponse.id) &&
            Objects.equals(this.pageSize, auditQueryExecutionLargeResultsResponse.pageSize) &&
            Objects.equals(this.cursor, auditQueryExecutionLargeResultsResponse.cursor) &&
            Objects.equals(this.downloadUrl, auditQueryExecutionLargeResultsResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pageSize, cursor, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryExecutionLargeResultsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

