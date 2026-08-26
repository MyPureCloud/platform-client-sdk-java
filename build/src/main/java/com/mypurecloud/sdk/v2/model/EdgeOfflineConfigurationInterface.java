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
import com.mypurecloud.sdk.v2.model.DomainCapabilities;
import com.mypurecloud.sdk.v2.model.DomainNetworkAddress;
import com.mypurecloud.sdk.v2.model.DomainNetworkRoute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeOfflineConfigurationInterface
 */

public class EdgeOfflineConfigurationInterface  implements Serializable {
  
  private List<DomainNetworkRoute> routes = null;
  private List<DomainNetworkAddress> addresses = null;
  private DomainCapabilities ipv4Capabilities = null;
  private DomainCapabilities ipv6Capabilities = null;

  public EdgeOfflineConfigurationInterface() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      routes = new ArrayList<DomainNetworkRoute>();
      addresses = new ArrayList<DomainNetworkAddress>();
    }
  }

  public EdgeOfflineConfigurationInterface(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      routes = new ArrayList<DomainNetworkRoute>();
      addresses = new ArrayList<DomainNetworkAddress>();
    }
  }

  
  /**
   * The list of routes assigned to this interface.
   **/
  public EdgeOfflineConfigurationInterface routes(List<DomainNetworkRoute> routes) {
    this.routes = routes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of routes assigned to this interface.")
  @JsonProperty("routes")
  public List<DomainNetworkRoute> getRoutes() {
    return routes;
  }
  public void setRoutes(List<DomainNetworkRoute> routes) {
    this.routes = routes;
  }


  /**
   * The list of IP addresses on this interface.  Priority of dns addresses are based on order in the list.
   **/
  public EdgeOfflineConfigurationInterface addresses(List<DomainNetworkAddress> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of IP addresses on this interface.  Priority of dns addresses are based on order in the list.")
  @JsonProperty("addresses")
  public List<DomainNetworkAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<DomainNetworkAddress> addresses) {
    this.addresses = addresses;
  }


  /**
   * IPv4 interface settings.
   **/
  public EdgeOfflineConfigurationInterface ipv4Capabilities(DomainCapabilities ipv4Capabilities) {
    this.ipv4Capabilities = ipv4Capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv4 interface settings.")
  @JsonProperty("ipv4Capabilities")
  public DomainCapabilities getIpv4Capabilities() {
    return ipv4Capabilities;
  }
  public void setIpv4Capabilities(DomainCapabilities ipv4Capabilities) {
    this.ipv4Capabilities = ipv4Capabilities;
  }


  /**
   * IPv6 interface settings.
   **/
  public EdgeOfflineConfigurationInterface ipv6Capabilities(DomainCapabilities ipv6Capabilities) {
    this.ipv6Capabilities = ipv6Capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv6 interface settings.")
  @JsonProperty("ipv6Capabilities")
  public DomainCapabilities getIpv6Capabilities() {
    return ipv6Capabilities;
  }
  public void setIpv6Capabilities(DomainCapabilities ipv6Capabilities) {
    this.ipv6Capabilities = ipv6Capabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeOfflineConfigurationInterface edgeOfflineConfigurationInterface = (EdgeOfflineConfigurationInterface) o;

    return Objects.equals(this.routes, edgeOfflineConfigurationInterface.routes) &&
            Objects.equals(this.addresses, edgeOfflineConfigurationInterface.addresses) &&
            Objects.equals(this.ipv4Capabilities, edgeOfflineConfigurationInterface.ipv4Capabilities) &&
            Objects.equals(this.ipv6Capabilities, edgeOfflineConfigurationInterface.ipv6Capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes, addresses, ipv4Capabilities, ipv6Capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeOfflineConfigurationInterface {\n");
    
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    ipv4Capabilities: ").append(toIndentedString(ipv4Capabilities)).append("\n");
    sb.append("    ipv6Capabilities: ").append(toIndentedString(ipv6Capabilities)).append("\n");
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

