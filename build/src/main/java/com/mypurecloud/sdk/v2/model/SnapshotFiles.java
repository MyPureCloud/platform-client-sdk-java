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
import com.mypurecloud.sdk.v2.model.SnapshotMetaData;
import com.mypurecloud.sdk.v2.model.SnapshotMetricData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SnapshotFiles
 */

public class SnapshotFiles  implements Serializable {
  
  private SnapshotMetaData metaData = null;
  private SnapshotMetricData offered = null;
  private SnapshotMetricData averageHandleTime = null;

  public SnapshotFiles() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Metadata for requested snapshot
   **/
  public SnapshotFiles metaData(SnapshotMetaData metaData) {
    this.metaData = metaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for requested snapshot")
  @JsonProperty("metaData")
  public SnapshotMetaData getMetaData() {
    return metaData;
  }
  public void setMetaData(SnapshotMetaData metaData) {
    this.metaData = metaData;
  }


  /**
   * Offered data for the requested snapshot
   **/
  public SnapshotFiles offered(SnapshotMetricData offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offered data for the requested snapshot")
  @JsonProperty("offered")
  public SnapshotMetricData getOffered() {
    return offered;
  }
  public void setOffered(SnapshotMetricData offered) {
    this.offered = offered;
  }


  /**
   * Average handle time data for the requested snapshot
   **/
  public SnapshotFiles averageHandleTime(SnapshotMetricData averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average handle time data for the requested snapshot")
  @JsonProperty("averageHandleTime")
  public SnapshotMetricData getAverageHandleTime() {
    return averageHandleTime;
  }
  public void setAverageHandleTime(SnapshotMetricData averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotFiles snapshotFiles = (SnapshotFiles) o;

    return Objects.equals(this.metaData, snapshotFiles.metaData) &&
            Objects.equals(this.offered, snapshotFiles.offered) &&
            Objects.equals(this.averageHandleTime, snapshotFiles.averageHandleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, offered, averageHandleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotFiles {\n");
    
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    offered: ").append(toIndentedString(offered)).append("\n");
    sb.append("    averageHandleTime: ").append(toIndentedString(averageHandleTime)).append("\n");
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

