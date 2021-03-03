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
 * EdgeNetworkDiagnosticRequest
 */

public class EdgeNetworkDiagnosticRequest  implements Serializable {
  
  private String host = null;

  
  /**
   * IPv4/6 address or host to be probed for connectivity. No port allowed.
   **/
  public EdgeNetworkDiagnosticRequest host(String host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPv4/6 address or host to be probed for connectivity. No port allowed.")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeNetworkDiagnosticRequest edgeNetworkDiagnosticRequest = (EdgeNetworkDiagnosticRequest) o;
    return Objects.equals(this.host, edgeNetworkDiagnosticRequest.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeNetworkDiagnosticRequest {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

