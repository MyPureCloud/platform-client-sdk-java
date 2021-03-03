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
 * DomainCapabilities
 */

public class DomainCapabilities  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean dhcp = null;
  private Integer metric = null;
  private Boolean autoMetric = null;
  private Boolean supportsMetric = null;
  private Boolean pingEnabled = null;

  
  /**
   * True if this address family on the interface is enabled.
   **/
  public DomainCapabilities enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this address family on the interface is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * True if this address family on the interface is using DHCP.
   **/
  public DomainCapabilities dhcp(Boolean dhcp) {
    this.dhcp = dhcp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this address family on the interface is using DHCP.")
  @JsonProperty("dhcp")
  public Boolean getDhcp() {
    return dhcp;
  }
  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }

  
  /**
   * The metric being used for the address family on this interface. Lower values will have a higher priority. If autoMetric is true, this value will be the automatically calculated metric. To set this value be sure autoMetric is false. If no value is returned, metric configuration is not supported on this Edge.
   **/
  public DomainCapabilities metric(Integer metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric being used for the address family on this interface. Lower values will have a higher priority. If autoMetric is true, this value will be the automatically calculated metric. To set this value be sure autoMetric is false. If no value is returned, metric configuration is not supported on this Edge.")
  @JsonProperty("metric")
  public Integer getMetric() {
    return metric;
  }
  public void setMetric(Integer metric) {
    this.metric = metric;
  }

  
  /**
   * True if the metric is being calculated automatically for the address family on this interface.
   **/
  public DomainCapabilities autoMetric(Boolean autoMetric) {
    this.autoMetric = autoMetric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the metric is being calculated automatically for the address family on this interface.")
  @JsonProperty("autoMetric")
  public Boolean getAutoMetric() {
    return autoMetric;
  }
  public void setAutoMetric(Boolean autoMetric) {
    this.autoMetric = autoMetric;
  }

  
  @ApiModelProperty(example = "null", value = "True if metric configuration is supported.")
  @JsonProperty("supportsMetric")
  public Boolean getSupportsMetric() {
    return supportsMetric;
  }

  
  /**
   * Set to true to enable this address family on this interface to respond to ping requests.
   **/
  public DomainCapabilities pingEnabled(Boolean pingEnabled) {
    this.pingEnabled = pingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to true to enable this address family on this interface to respond to ping requests.")
  @JsonProperty("pingEnabled")
  public Boolean getPingEnabled() {
    return pingEnabled;
  }
  public void setPingEnabled(Boolean pingEnabled) {
    this.pingEnabled = pingEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainCapabilities domainCapabilities = (DomainCapabilities) o;
    return Objects.equals(this.enabled, domainCapabilities.enabled) &&
        Objects.equals(this.dhcp, domainCapabilities.dhcp) &&
        Objects.equals(this.metric, domainCapabilities.metric) &&
        Objects.equals(this.autoMetric, domainCapabilities.autoMetric) &&
        Objects.equals(this.supportsMetric, domainCapabilities.supportsMetric) &&
        Objects.equals(this.pingEnabled, domainCapabilities.pingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, dhcp, metric, autoMetric, supportsMetric, pingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainCapabilities {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    autoMetric: ").append(toIndentedString(autoMetric)).append("\n");
    sb.append("    supportsMetric: ").append(toIndentedString(supportsMetric)).append("\n");
    sb.append("    pingEnabled: ").append(toIndentedString(pingEnabled)).append("\n");
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

