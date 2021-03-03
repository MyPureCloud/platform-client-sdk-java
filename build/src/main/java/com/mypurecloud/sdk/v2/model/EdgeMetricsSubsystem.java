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
import com.mypurecloud.sdk.v2.model.EdgeMetricsSubsystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeMetricsSubsystem
 */

public class EdgeMetricsSubsystem  implements Serializable {
  
  private Integer delayMs = null;
  private String processName = null;
  private EdgeMetricsSubsystem mediaSubsystem = null;

  
  /**
   * Delay in milliseconds.
   **/
  public EdgeMetricsSubsystem delayMs(Integer delayMs) {
    this.delayMs = delayMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Delay in milliseconds.")
  @JsonProperty("delayMs")
  public Integer getDelayMs() {
    return delayMs;
  }
  public void setDelayMs(Integer delayMs) {
    this.delayMs = delayMs;
  }

  
  /**
   * Name of the Edge process.
   **/
  public EdgeMetricsSubsystem processName(String processName) {
    this.processName = processName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Edge process.")
  @JsonProperty("processName")
  public String getProcessName() {
    return processName;
  }
  public void setProcessName(String processName) {
    this.processName = processName;
  }

  
  /**
   * Subsystem for an Edge device.
   **/
  public EdgeMetricsSubsystem mediaSubsystem(EdgeMetricsSubsystem mediaSubsystem) {
    this.mediaSubsystem = mediaSubsystem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subsystem for an Edge device.")
  @JsonProperty("mediaSubsystem")
  public EdgeMetricsSubsystem getMediaSubsystem() {
    return mediaSubsystem;
  }
  public void setMediaSubsystem(EdgeMetricsSubsystem mediaSubsystem) {
    this.mediaSubsystem = mediaSubsystem;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsSubsystem edgeMetricsSubsystem = (EdgeMetricsSubsystem) o;
    return Objects.equals(this.delayMs, edgeMetricsSubsystem.delayMs) &&
        Objects.equals(this.processName, edgeMetricsSubsystem.processName) &&
        Objects.equals(this.mediaSubsystem, edgeMetricsSubsystem.mediaSubsystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayMs, processName, mediaSubsystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsSubsystem {\n");
    
    sb.append("    delayMs: ").append(toIndentedString(delayMs)).append("\n");
    sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
    sb.append("    mediaSubsystem: ").append(toIndentedString(mediaSubsystem)).append("\n");
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

