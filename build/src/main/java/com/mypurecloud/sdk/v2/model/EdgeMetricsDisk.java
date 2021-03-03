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
 * EdgeMetricsDisk
 */

public class EdgeMetricsDisk  implements Serializable {
  
  private Double availableBytes = null;
  private String partitionName = null;
  private Double totalBytes = null;

  
  /**
   * Available memory in bytes.
   **/
  public EdgeMetricsDisk availableBytes(Double availableBytes) {
    this.availableBytes = availableBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Available memory in bytes.")
  @JsonProperty("availableBytes")
  public Double getAvailableBytes() {
    return availableBytes;
  }
  public void setAvailableBytes(Double availableBytes) {
    this.availableBytes = availableBytes;
  }

  
  /**
   * Disk partition name.
   **/
  public EdgeMetricsDisk partitionName(String partitionName) {
    this.partitionName = partitionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disk partition name.")
  @JsonProperty("partitionName")
  public String getPartitionName() {
    return partitionName;
  }
  public void setPartitionName(String partitionName) {
    this.partitionName = partitionName;
  }

  
  /**
   * Total memory in bytes.
   **/
  public EdgeMetricsDisk totalBytes(Double totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total memory in bytes.")
  @JsonProperty("totalBytes")
  public Double getTotalBytes() {
    return totalBytes;
  }
  public void setTotalBytes(Double totalBytes) {
    this.totalBytes = totalBytes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsDisk edgeMetricsDisk = (EdgeMetricsDisk) o;
    return Objects.equals(this.availableBytes, edgeMetricsDisk.availableBytes) &&
        Objects.equals(this.partitionName, edgeMetricsDisk.partitionName) &&
        Objects.equals(this.totalBytes, edgeMetricsDisk.totalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBytes, partitionName, totalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsDisk {\n");
    
    sb.append("    availableBytes: ").append(toIndentedString(availableBytes)).append("\n");
    sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
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

