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
 * EdgeNetworkDiagnosticResponse
 */

public class EdgeNetworkDiagnosticResponse  implements Serializable {
  
  private String commandCorrelationId = null;
  private String diagnostics = null;

  
  /**
   * UUID of each executed command on edge
   **/
  public EdgeNetworkDiagnosticResponse commandCorrelationId(String commandCorrelationId) {
    this.commandCorrelationId = commandCorrelationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UUID of each executed command on edge")
  @JsonProperty("commandCorrelationId")
  public String getCommandCorrelationId() {
    return commandCorrelationId;
  }
  public void setCommandCorrelationId(String commandCorrelationId) {
    this.commandCorrelationId = commandCorrelationId;
  }

  
  /**
   * Response string of executed command from edge
   **/
  public EdgeNetworkDiagnosticResponse diagnostics(String diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response string of executed command from edge")
  @JsonProperty("diagnostics")
  public String getDiagnostics() {
    return diagnostics;
  }
  public void setDiagnostics(String diagnostics) {
    this.diagnostics = diagnostics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeNetworkDiagnosticResponse edgeNetworkDiagnosticResponse = (EdgeNetworkDiagnosticResponse) o;
    return Objects.equals(this.commandCorrelationId, edgeNetworkDiagnosticResponse.commandCorrelationId) &&
        Objects.equals(this.diagnostics, edgeNetworkDiagnosticResponse.diagnostics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandCorrelationId, diagnostics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeNetworkDiagnosticResponse {\n");
    
    sb.append("    commandCorrelationId: ").append(toIndentedString(commandCorrelationId)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
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

