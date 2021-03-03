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
 * EdgeMetricsMemory
 */

public class EdgeMetricsMemory  implements Serializable {
  
  private Double availableBytes = null;
  private String type = null;
  private Double totalBytes = null;

  
  /**
   * Available memory in bytes.
   **/
  public EdgeMetricsMemory availableBytes(Double availableBytes) {
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
   * Type of memory. Virtual or physical.
   **/
  public EdgeMetricsMemory type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of memory. Virtual or physical.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Total memory in bytes.
   **/
  public EdgeMetricsMemory totalBytes(Double totalBytes) {
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
    EdgeMetricsMemory edgeMetricsMemory = (EdgeMetricsMemory) o;
    return Objects.equals(this.availableBytes, edgeMetricsMemory.availableBytes) &&
        Objects.equals(this.type, edgeMetricsMemory.type) &&
        Objects.equals(this.totalBytes, edgeMetricsMemory.totalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBytes, type, totalBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsMemory {\n");
    
    sb.append("    availableBytes: ").append(toIndentedString(availableBytes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

