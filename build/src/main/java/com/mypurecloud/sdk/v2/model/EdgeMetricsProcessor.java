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
 * EdgeMetricsProcessor
 */

public class EdgeMetricsProcessor  implements Serializable {
  
  private Double activeTimePct = null;
  private String cpuId = null;
  private Double idleTimePct = null;
  private Double privilegedTimePct = null;
  private Double userTimePct = null;

  
  /**
   * Percent time processor was active.
   **/
  public EdgeMetricsProcessor activeTimePct(Double activeTimePct) {
    this.activeTimePct = activeTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent time processor was active.")
  @JsonProperty("activeTimePct")
  public Double getActiveTimePct() {
    return activeTimePct;
  }
  public void setActiveTimePct(Double activeTimePct) {
    this.activeTimePct = activeTimePct;
  }

  
  /**
   * Machine CPU identifier. 'total' will always be included in the array and is the total of all CPU resources.
   **/
  public EdgeMetricsProcessor cpuId(String cpuId) {
    this.cpuId = cpuId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Machine CPU identifier. 'total' will always be included in the array and is the total of all CPU resources.")
  @JsonProperty("cpuId")
  public String getCpuId() {
    return cpuId;
  }
  public void setCpuId(String cpuId) {
    this.cpuId = cpuId;
  }

  
  /**
   * Percent time processor was idle.
   **/
  public EdgeMetricsProcessor idleTimePct(Double idleTimePct) {
    this.idleTimePct = idleTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent time processor was idle.")
  @JsonProperty("idleTimePct")
  public Double getIdleTimePct() {
    return idleTimePct;
  }
  public void setIdleTimePct(Double idleTimePct) {
    this.idleTimePct = idleTimePct;
  }

  
  /**
   * Percent time processor spent in privileged mode.
   **/
  public EdgeMetricsProcessor privilegedTimePct(Double privilegedTimePct) {
    this.privilegedTimePct = privilegedTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent time processor spent in privileged mode.")
  @JsonProperty("privilegedTimePct")
  public Double getPrivilegedTimePct() {
    return privilegedTimePct;
  }
  public void setPrivilegedTimePct(Double privilegedTimePct) {
    this.privilegedTimePct = privilegedTimePct;
  }

  
  /**
   * Percent time processor spent in user mode.
   **/
  public EdgeMetricsProcessor userTimePct(Double userTimePct) {
    this.userTimePct = userTimePct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent time processor spent in user mode.")
  @JsonProperty("userTimePct")
  public Double getUserTimePct() {
    return userTimePct;
  }
  public void setUserTimePct(Double userTimePct) {
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
    EdgeMetricsProcessor edgeMetricsProcessor = (EdgeMetricsProcessor) o;
    return Objects.equals(this.activeTimePct, edgeMetricsProcessor.activeTimePct) &&
        Objects.equals(this.cpuId, edgeMetricsProcessor.cpuId) &&
        Objects.equals(this.idleTimePct, edgeMetricsProcessor.idleTimePct) &&
        Objects.equals(this.privilegedTimePct, edgeMetricsProcessor.privilegedTimePct) &&
        Objects.equals(this.userTimePct, edgeMetricsProcessor.userTimePct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTimePct, cpuId, idleTimePct, privilegedTimePct, userTimePct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsProcessor {\n");
    
    sb.append("    activeTimePct: ").append(toIndentedString(activeTimePct)).append("\n");
    sb.append("    cpuId: ").append(toIndentedString(cpuId)).append("\n");
    sb.append("    idleTimePct: ").append(toIndentedString(idleTimePct)).append("\n");
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

