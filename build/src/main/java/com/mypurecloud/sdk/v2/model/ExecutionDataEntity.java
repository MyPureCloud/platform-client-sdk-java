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
 * Represents an individual result of an execution data lookup
 */
@ApiModel(description = "Represents an individual result of an execution data lookup")

public class ExecutionDataEntity  implements Serializable {
  
  private String id = null;
  private String downloadUri = null;
  private Boolean failed = null;
  private String statusCode = null;

  
  /**
   * The id of the execution requested
   **/
  public ExecutionDataEntity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the execution requested")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * A downloadable link to the execution data file.
   **/
  public ExecutionDataEntity downloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A downloadable link to the execution data file.")
  @JsonProperty("downloadUri")
  public String getDownloadUri() {
    return downloadUri;
  }
  public void setDownloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
  }


  /**
   * If the retrieval failed (not found, no permission, etc;), this will be set true.
   **/
  public ExecutionDataEntity failed(Boolean failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the retrieval failed (not found, no permission, etc;), this will be set true.")
  @JsonProperty("failed")
  public Boolean getFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }


  /**
   * This will contain the http status code for the failure
   **/
  public ExecutionDataEntity statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This will contain the http status code for the failure")
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionDataEntity executionDataEntity = (ExecutionDataEntity) o;

    return Objects.equals(this.id, executionDataEntity.id) &&
            Objects.equals(this.downloadUri, executionDataEntity.downloadUri) &&
            Objects.equals(this.failed, executionDataEntity.failed) &&
            Objects.equals(this.statusCode, executionDataEntity.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUri, failed, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionDataEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

