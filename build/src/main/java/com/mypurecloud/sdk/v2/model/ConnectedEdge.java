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
import com.mypurecloud.sdk.v2.model.EdgeConnectionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConnectedEdge
 */

public class ConnectedEdge  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String interfaceName = null;
  private String interfaceIpAddress = null;
  private List<EdgeConnectionInfo> edgeConnectionList = new ArrayList<EdgeConnectionInfo>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ConnectedEdge name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Edge interface name used for the connection")
  @JsonProperty("interfaceName")
  public String getInterfaceName() {
    return interfaceName;
  }

  
  @ApiModelProperty(example = "null", value = "Edge interface IP address")
  @JsonProperty("interfaceIpAddress")
  public String getInterfaceIpAddress() {
    return interfaceIpAddress;
  }

  
  /**
   **/
  public ConnectedEdge edgeConnectionList(List<EdgeConnectionInfo> edgeConnectionList) {
    this.edgeConnectionList = edgeConnectionList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeConnectionList")
  public List<EdgeConnectionInfo> getEdgeConnectionList() {
    return edgeConnectionList;
  }
  public void setEdgeConnectionList(List<EdgeConnectionInfo> edgeConnectionList) {
    this.edgeConnectionList = edgeConnectionList;
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
    ConnectedEdge connectedEdge = (ConnectedEdge) o;
    return Objects.equals(this.id, connectedEdge.id) &&
        Objects.equals(this.name, connectedEdge.name) &&
        Objects.equals(this.interfaceName, connectedEdge.interfaceName) &&
        Objects.equals(this.interfaceIpAddress, connectedEdge.interfaceIpAddress) &&
        Objects.equals(this.edgeConnectionList, connectedEdge.edgeConnectionList) &&
        Objects.equals(this.selfUri, connectedEdge.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, interfaceName, interfaceIpAddress, edgeConnectionList, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedEdge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    interfaceIpAddress: ").append(toIndentedString(interfaceIpAddress)).append("\n");
    sb.append("    edgeConnectionList: ").append(toIndentedString(edgeConnectionList)).append("\n");
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

