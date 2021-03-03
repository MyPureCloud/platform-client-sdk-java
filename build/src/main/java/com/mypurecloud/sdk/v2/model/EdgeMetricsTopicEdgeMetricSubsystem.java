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
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricSubsystemMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeMetricsTopicEdgeMetricSubsystem
 */

public class EdgeMetricsTopicEdgeMetricSubsystem  implements Serializable {
  
  private String processName = null;
  private Integer delayMs = null;
  private EdgeMetricsTopicEdgeMetricSubsystemMedia mediaSubsystem = null;

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricSubsystem processName(String processName) {
    this.processName = processName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processName")
  public String getProcessName() {
    return processName;
  }
  public void setProcessName(String processName) {
    this.processName = processName;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricSubsystem delayMs(Integer delayMs) {
    this.delayMs = delayMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("delayMs")
  public Integer getDelayMs() {
    return delayMs;
  }
  public void setDelayMs(Integer delayMs) {
    this.delayMs = delayMs;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricSubsystem mediaSubsystem(EdgeMetricsTopicEdgeMetricSubsystemMedia mediaSubsystem) {
    this.mediaSubsystem = mediaSubsystem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaSubsystem")
  public EdgeMetricsTopicEdgeMetricSubsystemMedia getMediaSubsystem() {
    return mediaSubsystem;
  }
  public void setMediaSubsystem(EdgeMetricsTopicEdgeMetricSubsystemMedia mediaSubsystem) {
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
    EdgeMetricsTopicEdgeMetricSubsystem edgeMetricsTopicEdgeMetricSubsystem = (EdgeMetricsTopicEdgeMetricSubsystem) o;
    return Objects.equals(this.processName, edgeMetricsTopicEdgeMetricSubsystem.processName) &&
        Objects.equals(this.delayMs, edgeMetricsTopicEdgeMetricSubsystem.delayMs) &&
        Objects.equals(this.mediaSubsystem, edgeMetricsTopicEdgeMetricSubsystem.mediaSubsystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processName, delayMs, mediaSubsystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricSubsystem {\n");
    
    sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
    sb.append("    delayMs: ").append(toIndentedString(delayMs)).append("\n");
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

