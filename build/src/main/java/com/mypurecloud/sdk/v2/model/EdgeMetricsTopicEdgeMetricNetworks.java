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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * EdgeMetricsTopicEdgeMetricNetworks
 */

public class EdgeMetricsTopicEdgeMetricNetworks  implements Serializable {
  
  private String ifname = null;
  private Long sentBytesPerSec = null;
  private Long receivedBytesPerSec = null;
  private Long bandwidthBitsPerSec = null;
  private BigDecimal utilizationPct = null;

  public EdgeMetricsTopicEdgeMetricNetworks() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EdgeMetricsTopicEdgeMetricNetworks ifname(String ifname) {
    this.ifname = ifname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifname")
  public String getIfname() {
    return ifname;
  }
  public void setIfname(String ifname) {
    this.ifname = ifname;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricNetworks sentBytesPerSec(Long sentBytesPerSec) {
    this.sentBytesPerSec = sentBytesPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentBytesPerSec")
  public Long getSentBytesPerSec() {
    return sentBytesPerSec;
  }
  public void setSentBytesPerSec(Long sentBytesPerSec) {
    this.sentBytesPerSec = sentBytesPerSec;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricNetworks receivedBytesPerSec(Long receivedBytesPerSec) {
    this.receivedBytesPerSec = receivedBytesPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivedBytesPerSec")
  public Long getReceivedBytesPerSec() {
    return receivedBytesPerSec;
  }
  public void setReceivedBytesPerSec(Long receivedBytesPerSec) {
    this.receivedBytesPerSec = receivedBytesPerSec;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricNetworks bandwidthBitsPerSec(Long bandwidthBitsPerSec) {
    this.bandwidthBitsPerSec = bandwidthBitsPerSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bandwidthBitsPerSec")
  public Long getBandwidthBitsPerSec() {
    return bandwidthBitsPerSec;
  }
  public void setBandwidthBitsPerSec(Long bandwidthBitsPerSec) {
    this.bandwidthBitsPerSec = bandwidthBitsPerSec;
  }


  /**
   **/
  public EdgeMetricsTopicEdgeMetricNetworks utilizationPct(BigDecimal utilizationPct) {
    this.utilizationPct = utilizationPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utilizationPct")
  public BigDecimal getUtilizationPct() {
    return utilizationPct;
  }
  public void setUtilizationPct(BigDecimal utilizationPct) {
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
    EdgeMetricsTopicEdgeMetricNetworks edgeMetricsTopicEdgeMetricNetworks = (EdgeMetricsTopicEdgeMetricNetworks) o;

    return Objects.equals(this.ifname, edgeMetricsTopicEdgeMetricNetworks.ifname) &&
            Objects.equals(this.sentBytesPerSec, edgeMetricsTopicEdgeMetricNetworks.sentBytesPerSec) &&
            Objects.equals(this.receivedBytesPerSec, edgeMetricsTopicEdgeMetricNetworks.receivedBytesPerSec) &&
            Objects.equals(this.bandwidthBitsPerSec, edgeMetricsTopicEdgeMetricNetworks.bandwidthBitsPerSec) &&
            Objects.equals(this.utilizationPct, edgeMetricsTopicEdgeMetricNetworks.utilizationPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifname, sentBytesPerSec, receivedBytesPerSec, bandwidthBitsPerSec, utilizationPct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeMetricsTopicEdgeMetricNetworks {\n");
    
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

