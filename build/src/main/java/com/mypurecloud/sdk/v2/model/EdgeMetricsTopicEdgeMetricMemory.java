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
 * EdgeMetricsTopicEdgeMetricMemory
 */

public class EdgeMetricsTopicEdgeMetricMemory  implements Serializable {
  
  private String type = null;
  private Integer availableBytes = null;
  private Integer totalBytes = null;

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricMemory type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricMemory availableBytes(Integer availableBytes) {
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
  public EdgeMetricsTopicEdgeMetricMemory totalBytes(Integer totalBytes) {
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
    EdgeMetricsTopicEdgeMetricMemory edgeMetricsTopicEdgeMetricMemory = (EdgeMetricsTopicEdgeMetricMemory) o;
    return Objects.equals(this.type, edgeMetricsTopicEdgeMetricMemory.type) &&
        Objects.equals(this.availableBytes, edgeMetricsTopicEdgeMetricMemory.availableBytes) &&
        Objects.equals(this.totalBytes, edgeMetricsTopicEdgeMetricMemory.totalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, availableBytes, totalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricMemory {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

