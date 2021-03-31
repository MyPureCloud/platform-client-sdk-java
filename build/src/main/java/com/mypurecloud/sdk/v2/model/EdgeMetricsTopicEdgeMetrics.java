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
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricDisk;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricMemory;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricNetworks;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricProcessor;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicEdgeMetricSubsystem;
import com.mypurecloud.sdk.v2.model.EdgeMetricsTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeMetricsTopicEdgeMetrics
 */

public class EdgeMetricsTopicEdgeMetrics  implements Serializable {
  
  private EdgeMetricsTopicUriReference edge = null;
  private Integer upTimeMsec = null;
  private List<EdgeMetricsTopicEdgeMetricProcessor> processors = new ArrayList<EdgeMetricsTopicEdgeMetricProcessor>();
  private List<EdgeMetricsTopicEdgeMetricMemory> memory = new ArrayList<EdgeMetricsTopicEdgeMetricMemory>();
  private List<EdgeMetricsTopicEdgeMetricDisk> disks = new ArrayList<EdgeMetricsTopicEdgeMetricDisk>();
  private List<EdgeMetricsTopicEdgeMetricSubsystem> subsystems = new ArrayList<EdgeMetricsTopicEdgeMetricSubsystem>();
  private List<EdgeMetricsTopicEdgeMetricNetworks> networks = new ArrayList<EdgeMetricsTopicEdgeMetricNetworks>();

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics edge(EdgeMetricsTopicUriReference edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edge")
  public EdgeMetricsTopicUriReference getEdge() {
    return edge;
  }
  public void setEdge(EdgeMetricsTopicUriReference edge) {
    this.edge = edge;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics upTimeMsec(Integer upTimeMsec) {
    this.upTimeMsec = upTimeMsec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upTimeMsec")
  public Integer getUpTimeMsec() {
    return upTimeMsec;
  }
  public void setUpTimeMsec(Integer upTimeMsec) {
    this.upTimeMsec = upTimeMsec;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics processors(List<EdgeMetricsTopicEdgeMetricProcessor> processors) {
    this.processors = processors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processors")
  public List<EdgeMetricsTopicEdgeMetricProcessor> getProcessors() {
    return processors;
  }
  public void setProcessors(List<EdgeMetricsTopicEdgeMetricProcessor> processors) {
    this.processors = processors;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics memory(List<EdgeMetricsTopicEdgeMetricMemory> memory) {
    this.memory = memory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memory")
  public List<EdgeMetricsTopicEdgeMetricMemory> getMemory() {
    return memory;
  }
  public void setMemory(List<EdgeMetricsTopicEdgeMetricMemory> memory) {
    this.memory = memory;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics disks(List<EdgeMetricsTopicEdgeMetricDisk> disks) {
    this.disks = disks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disks")
  public List<EdgeMetricsTopicEdgeMetricDisk> getDisks() {
    return disks;
  }
  public void setDisks(List<EdgeMetricsTopicEdgeMetricDisk> disks) {
    this.disks = disks;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics subsystems(List<EdgeMetricsTopicEdgeMetricSubsystem> subsystems) {
    this.subsystems = subsystems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subsystems")
  public List<EdgeMetricsTopicEdgeMetricSubsystem> getSubsystems() {
    return subsystems;
  }
  public void setSubsystems(List<EdgeMetricsTopicEdgeMetricSubsystem> subsystems) {
    this.subsystems = subsystems;
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetrics networks(List<EdgeMetricsTopicEdgeMetricNetworks> networks) {
    this.networks = networks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("networks")
  public List<EdgeMetricsTopicEdgeMetricNetworks> getNetworks() {
    return networks;
  }
  public void setNetworks(List<EdgeMetricsTopicEdgeMetricNetworks> networks) {
    this.networks = networks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsTopicEdgeMetrics edgeMetricsTopicEdgeMetrics = (EdgeMetricsTopicEdgeMetrics) o;
    return Objects.equals(this.edge, edgeMetricsTopicEdgeMetrics.edge) &&
        Objects.equals(this.upTimeMsec, edgeMetricsTopicEdgeMetrics.upTimeMsec) &&
        Objects.equals(this.processors, edgeMetricsTopicEdgeMetrics.processors) &&
        Objects.equals(this.memory, edgeMetricsTopicEdgeMetrics.memory) &&
        Objects.equals(this.disks, edgeMetricsTopicEdgeMetrics.disks) &&
        Objects.equals(this.subsystems, edgeMetricsTopicEdgeMetrics.subsystems) &&
        Objects.equals(this.networks, edgeMetricsTopicEdgeMetrics.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edge, upTimeMsec, processors, memory, disks, subsystems, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetrics {\n");
    
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    upTimeMsec: ").append(toIndentedString(upTimeMsec)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    subsystems: ").append(toIndentedString(subsystems)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

