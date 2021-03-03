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
 * EdgeMetricsTopicEdgeMetricDisk
 */

public class EdgeMetricsTopicEdgeMetricDisk  implements Serializable {
  
  private String partitionName = null;
  private Integer availableBytes = null;
  private Integer totalBytes = null;

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricDisk partitionName(String partitionName) {
    this.partitionName = partitionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("partitionName")
  public String getPartitionName() {
    return partitionName;
  }
  public void setPartitionName(String partitionName) {
    this.partitionName = partitionName;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricDisk availableBytes(Integer availableBytes) {
    this.availableBytes = availableBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("availableBytes")
  public Integer getAvailableBytes() {
    return availableBytes;
  }
  public void setAvailableBytes(Integer availableBytes) {
    this.availableBytes = availableBytes;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricDisk totalBytes(Integer totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalBytes")
  public Integer getTotalBytes() {
    return totalBytes;
  }
  public void setTotalBytes(Integer totalBytes) {
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
    EdgeMetricsTopicEdgeMetricDisk edgeMetricsTopicEdgeMetricDisk = (EdgeMetricsTopicEdgeMetricDisk) o;
    return Objects.equals(this.partitionName, edgeMetricsTopicEdgeMetricDisk.partitionName) &&
        Objects.equals(this.availableBytes, edgeMetricsTopicEdgeMetricDisk.availableBytes) &&
        Objects.equals(this.totalBytes, edgeMetricsTopicEdgeMetricDisk.totalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partitionName, availableBytes, totalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricDisk {\n");
    
    sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
    sb.append("    availableBytes: ").append(toIndentedString(availableBytes)).append("\n");
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

