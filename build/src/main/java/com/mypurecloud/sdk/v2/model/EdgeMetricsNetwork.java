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
 * EdgeMetricsNetwork
 */

public class EdgeMetricsNetwork  implements Serializable {
  
  private String ifname = null;
  private Integer sentBytesPerSec = null;
  private Integer receivedBytesPerSec = null;
  private Double bandwidthBitsPerSec = null;
  private Double utilizationPct = null;

  
  /**
   * Identifier for the network adapter.
   **/
  public EdgeMetricsNetwork ifname(String ifname) {
    this.ifname = ifname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier for the network adapter.")
  @JsonProperty("ifname")
  public String getIfname() {
    return ifname;
  }
  public void setIfname(String ifname) {
    this.ifname = ifname;
  }

  
  /**
   * Number of byes sent per second.
   **/
  public EdgeMetricsNetwork sentBytesPerSec(Integer sentBytesPerSec) {
    this.sentBytesPerSec = sentBytesPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of byes sent per second.")
  @JsonProperty("sentBytesPerSec")
  public Integer getSentBytesPerSec() {
    return sentBytesPerSec;
  }
  public void setSentBytesPerSec(Integer sentBytesPerSec) {
    this.sentBytesPerSec = sentBytesPerSec;
  }

  
  /**
   * Number of byes received per second.
   **/
  public EdgeMetricsNetwork receivedBytesPerSec(Integer receivedBytesPerSec) {
    this.receivedBytesPerSec = receivedBytesPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of byes received per second.")
  @JsonProperty("receivedBytesPerSec")
  public Integer getReceivedBytesPerSec() {
    return receivedBytesPerSec;
  }
  public void setReceivedBytesPerSec(Integer receivedBytesPerSec) {
    this.receivedBytesPerSec = receivedBytesPerSec;
  }

  
  /**
   * Total bandwidth of the adapter in bits per second.
   **/
  public EdgeMetricsNetwork bandwidthBitsPerSec(Double bandwidthBitsPerSec) {
    this.bandwidthBitsPerSec = bandwidthBitsPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total bandwidth of the adapter in bits per second.")
  @JsonProperty("bandwidthBitsPerSec")
  public Double getBandwidthBitsPerSec() {
    return bandwidthBitsPerSec;
  }
  public void setBandwidthBitsPerSec(Double bandwidthBitsPerSec) {
    this.bandwidthBitsPerSec = bandwidthBitsPerSec;
  }

  
  /**
   * Percent utilization of the network adapter.
   **/
  public EdgeMetricsNetwork utilizationPct(Double utilizationPct) {
    this.utilizationPct = utilizationPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent utilization of the network adapter.")
  @JsonProperty("utilizationPct")
  public Double getUtilizationPct() {
    return utilizationPct;
  }
  public void setUtilizationPct(Double utilizationPct) {
    this.utilizationPct = utilizationPct;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeMetricsNetwork edgeMetricsNetwork = (EdgeMetricsNetwork) o;
    return Objects.equals(this.ifname, edgeMetricsNetwork.ifname) &&
        Objects.equals(this.sentBytesPerSec, edgeMetricsNetwork.sentBytesPerSec) &&
        Objects.equals(this.receivedBytesPerSec, edgeMetricsNetwork.receivedBytesPerSec) &&
        Objects.equals(this.bandwidthBitsPerSec, edgeMetricsNetwork.bandwidthBitsPerSec) &&
        Objects.equals(this.utilizationPct, edgeMetricsNetwork.utilizationPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifname, sentBytesPerSec, receivedBytesPerSec, bandwidthBitsPerSec, utilizationPct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsNetwork {\n");
    
    sb.append("    ifname: ").append(toIndentedString(ifname)).append("\n");
    sb.append("    sentBytesPerSec: ").append(toIndentedString(sentBytesPerSec)).append("\n");
    sb.append("    receivedBytesPerSec: ").append(toIndentedString(receivedBytesPerSec)).append("\n");
    sb.append("    bandwidthBitsPerSec: ").append(toIndentedString(bandwidthBitsPerSec)).append("\n");
    sb.append("    utilizationPct: ").append(toIndentedString(utilizationPct)).append("\n");
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

