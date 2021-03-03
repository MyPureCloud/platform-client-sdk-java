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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EdgeMetricsDisk;
import com.mypurecloud.sdk.v2.model.EdgeMetricsMemory;
import com.mypurecloud.sdk.v2.model.EdgeMetricsNetwork;
import com.mypurecloud.sdk.v2.model.EdgeMetricsProcessor;
import com.mypurecloud.sdk.v2.model.EdgeMetricsSubsystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeMetrics
 */

public class EdgeMetrics  implements Serializable {
  
  private DomainEntityRef edge = null;
  private Date eventTime = null;
  private Long upTimeMsec = null;
  private List<EdgeMetricsProcessor> processors = new ArrayList<EdgeMetricsProcessor>();
  private List<EdgeMetricsMemory> memory = new ArrayList<EdgeMetricsMemory>();
  private List<EdgeMetricsDisk> disks = new ArrayList<EdgeMetricsDisk>();
  private List<EdgeMetricsSubsystem> subsystems = new ArrayList<EdgeMetricsSubsystem>();
  private List<EdgeMetricsNetwork> networks = new ArrayList<EdgeMetricsNetwork>();

  
  /**
   **/
  public EdgeMetrics edge(DomainEntityRef edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edge")
  public DomainEntityRef getEdge() {
    return edge;
  }
  public void setEdge(DomainEntityRef edge) {
    this.edge = edge;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EdgeMetrics eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  
  /**
   **/
  public EdgeMetrics upTimeMsec(Long upTimeMsec) {
    this.upTimeMsec = upTimeMsec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upTimeMsec")
  public Long getUpTimeMsec() {
    return upTimeMsec;
  }
  public void setUpTimeMsec(Long upTimeMsec) {
    this.upTimeMsec = upTimeMsec;
  }

  
  /**
   **/
  public EdgeMetrics processors(List<EdgeMetricsProcessor> processors) {
    this.processors = processors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processors")
  public List<EdgeMetricsProcessor> getProcessors() {
    return processors;
  }
  public void setProcessors(List<EdgeMetricsProcessor> processors) {
    this.processors = processors;
  }

  
  /**
   **/
  public EdgeMetrics memory(List<EdgeMetricsMemory> memory) {
    this.memory = memory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memory")
  public List<EdgeMetricsMemory> getMemory() {
    return memory;
  }
  public void setMemory(List<EdgeMetricsMemory> memory) {
    this.memory = memory;
  }

  
  /**
   **/
  public EdgeMetrics disks(List<EdgeMetricsDisk> disks) {
    this.disks = disks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disks")
  public List<EdgeMetricsDisk> getDisks() {
    return disks;
  }
  public void setDisks(List<EdgeMetricsDisk> disks) {
    this.disks = disks;
  }

  
  /**
   **/
  public EdgeMetrics subsystems(List<EdgeMetricsSubsystem> subsystems) {
    this.subsystems = subsystems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subsystems")
  public List<EdgeMetricsSubsystem> getSubsystems() {
    return subsystems;
  }
  public void setSubsystems(List<EdgeMetricsSubsystem> subsystems) {
    this.subsystems = subsystems;
  }

  
  /**
   **/
  public EdgeMetrics networks(List<EdgeMetricsNetwork> networks) {
    this.networks = networks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("networks")
  public List<EdgeMetricsNetwork> getNetworks() {
    return networks;
  }
  public void setNetworks(List<EdgeMetricsNetwork> networks) {
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
    EdgeMetrics edgeMetrics = (EdgeMetrics) o;
    return Objects.equals(this.edge, edgeMetrics.edge) &&
        Objects.equals(this.eventTime, edgeMetrics.eventTime) &&
        Objects.equals(this.upTimeMsec, edgeMetrics.upTimeMsec) &&
        Objects.equals(this.processors, edgeMetrics.processors) &&
        Objects.equals(this.memory, edgeMetrics.memory) &&
        Objects.equals(this.disks, edgeMetrics.disks) &&
        Objects.equals(this.subsystems, edgeMetrics.subsystems) &&
        Objects.equals(this.networks, edgeMetrics.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edge, eventTime, upTimeMsec, processors, memory, disks, subsystems, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetrics {\n");
    
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
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

