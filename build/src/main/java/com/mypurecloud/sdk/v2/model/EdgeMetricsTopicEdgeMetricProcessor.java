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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeMetricsTopicEdgeMetricProcessor
 */

public class EdgeMetricsTopicEdgeMetricProcessor  implements Serializable {
  
  private String cpuId = null;
  private Long idleTimePct = null;
  private Long activeTimePct = null;
  private Long privilegedTimePct = null;
  private Long userTimePct = null;

  public EdgeMetricsTopicEdgeMetricProcessor() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricProcessor cpuId(String cpuId) {
    this.cpuId = cpuId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpuId")
  public String getCpuId() {
    return cpuId;
  }
  public void setCpuId(String cpuId) {
    this.cpuId = cpuId;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricProcessor idleTimePct(Long idleTimePct) {
    this.idleTimePct = idleTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idleTimePct")
  public Long getIdleTimePct() {
    return idleTimePct;
  }
  public void setIdleTimePct(Long idleTimePct) {
    this.idleTimePct = idleTimePct;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricProcessor activeTimePct(Long activeTimePct) {
    this.activeTimePct = activeTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeTimePct")
  public Long getActiveTimePct() {
    return activeTimePct;
  }
  public void setActiveTimePct(Long activeTimePct) {
    this.activeTimePct = activeTimePct;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricProcessor privilegedTimePct(Long privilegedTimePct) {
    this.privilegedTimePct = privilegedTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("privilegedTimePct")
  public Long getPrivilegedTimePct() {
    return privilegedTimePct;
  }
  public void setPrivilegedTimePct(Long privilegedTimePct) {
    this.privilegedTimePct = privilegedTimePct;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricProcessor userTimePct(Long userTimePct) {
    this.userTimePct = userTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userTimePct")
  public Long getUserTimePct() {
    return userTimePct;
  }
  public void setUserTimePct(Long userTimePct) {
    this.userTimePct = userTimePct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsTopicEdgeMetricProcessor edgeMetricsTopicEdgeMetricProcessor = (EdgeMetricsTopicEdgeMetricProcessor) o;

    return Objects.equals(this.cpuId, edgeMetricsTopicEdgeMetricProcessor.cpuId) &&
            Objects.equals(this.idleTimePct, edgeMetricsTopicEdgeMetricProcessor.idleTimePct) &&
            Objects.equals(this.activeTimePct, edgeMetricsTopicEdgeMetricProcessor.activeTimePct) &&
            Objects.equals(this.privilegedTimePct, edgeMetricsTopicEdgeMetricProcessor.privilegedTimePct) &&
            Objects.equals(this.userTimePct, edgeMetricsTopicEdgeMetricProcessor.userTimePct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuId, idleTimePct, activeTimePct, privilegedTimePct, userTimePct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricProcessor {\n");
    
    sb.append("    cpuId: ").append(toIndentedString(cpuId)).append("\n");
    sb.append("    idleTimePct: ").append(toIndentedString(idleTimePct)).append("\n");
    sb.append("    activeTimePct: ").append(toIndentedString(activeTimePct)).append("\n");
    sb.append("    privilegedTimePct: ").append(toIndentedString(privilegedTimePct)).append("\n");
    sb.append("    userTimePct: ").append(toIndentedString(userTimePct)).append("\n");
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

