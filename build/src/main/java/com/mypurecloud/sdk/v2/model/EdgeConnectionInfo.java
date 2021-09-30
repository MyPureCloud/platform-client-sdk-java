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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EdgeConnectionInfo
 */

public class EdgeConnectionInfo  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String interfaceName = null;
  private String interfaceIpAddress = null;
  private List<String> connectionErrors = new ArrayList<String>();
  private AddressableEntityRef site = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public EdgeConnectionInfo name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Interface used for the connection on the edge")
  @JsonProperty("interfaceName")
  public String getInterfaceName() {
    return interfaceName;
  }

  
  @ApiModelProperty(example = "null", value = "IP address of the interface")
  @JsonProperty("interfaceIpAddress")
  public String getInterfaceIpAddress() {
    return interfaceIpAddress;
  }

  
  @ApiModelProperty(example = "null", value = "Connection errors")
  @JsonProperty("connectionErrors")
  public List<String> getConnectionErrors() {
    return connectionErrors;
  }

  
  /**
   **/
  public EdgeConnectionInfo site(AddressableEntityRef site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("site")
  public AddressableEntityRef getSite() {
    return site;
  }
  public void setSite(AddressableEntityRef site) {
    this.site = site;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeConnectionInfo edgeConnectionInfo = (EdgeConnectionInfo) o;
    return Objects.equals(this.id, edgeConnectionInfo.id) &&
        Objects.equals(this.name, edgeConnectionInfo.name) &&
        Objects.equals(this.interfaceName, edgeConnectionInfo.interfaceName) &&
        Objects.equals(this.interfaceIpAddress, edgeConnectionInfo.interfaceIpAddress) &&
        Objects.equals(this.connectionErrors, edgeConnectionInfo.connectionErrors) &&
        Objects.equals(this.site, edgeConnectionInfo.site) &&
        Objects.equals(this.selfUri, edgeConnectionInfo.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, interfaceName, interfaceIpAddress, connectionErrors, site, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeConnectionInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    interfaceIpAddress: ").append(toIndentedString(interfaceIpAddress)).append("\n");
    sb.append("    connectionErrors: ").append(toIndentedString(connectionErrors)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

