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
import com.mypurecloud.sdk.v2.model.SnapshotFiles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContinuousForecastSnapshotResponse
 */

public class ContinuousForecastSnapshotResponse  implements Serializable {
  
  private String sessionId = null;
  private String snapshotId = null;
  private SnapshotFiles files = null;

  public ContinuousForecastSnapshotResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Session Id of the continuous forecast
   **/
  public ContinuousForecastSnapshotResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session Id of the continuous forecast")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Snapshot Id of the continuous forecast session
   **/
  public ContinuousForecastSnapshotResponse snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Snapshot Id of the continuous forecast session")
  @JsonProperty("snapshotId")
  public String getSnapshotId() {
    return snapshotId;
  }
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }


  /**
   * Link to the files containing data for requested snapshot
   **/
  public ContinuousForecastSnapshotResponse files(SnapshotFiles files) {
    this.files = files;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to the files containing data for requested snapshot")
  @JsonProperty("files")
  public SnapshotFiles getFiles() {
    return files;
  }
  public void setFiles(SnapshotFiles files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinuousForecastSnapshotResponse continuousForecastSnapshotResponse = (ContinuousForecastSnapshotResponse) o;

    return Objects.equals(this.sessionId, continuousForecastSnapshotResponse.sessionId) &&
            Objects.equals(this.snapshotId, continuousForecastSnapshotResponse.snapshotId) &&
            Objects.equals(this.files, continuousForecastSnapshotResponse.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, snapshotId, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContinuousForecastSnapshotResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

