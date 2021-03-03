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
 * EdgeMetricsTopicEdgeMetricSubsystemMedia
 */

public class EdgeMetricsTopicEdgeMetricSubsystemMedia  implements Serializable {
  
  private String processName = null;
  private Integer delayMs = null;

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricSubsystemMedia processName(String processName) {
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
  public EdgeMetricsTopicEdgeMetricSubsystemMedia delayMs(Integer delayMs) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsTopicEdgeMetricSubsystemMedia edgeMetricsTopicEdgeMetricSubsystemMedia = (EdgeMetricsTopicEdgeMetricSubsystemMedia) o;
    return Objects.equals(this.processName, edgeMetricsTopicEdgeMetricSubsystemMedia.processName) &&
        Objects.equals(this.delayMs, edgeMetricsTopicEdgeMetricSubsystemMedia.delayMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processName, delayMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricSubsystemMedia {\n");
    
    sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
    sb.append("    delayMs: ").append(toIndentedString(delayMs)).append("\n");
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

