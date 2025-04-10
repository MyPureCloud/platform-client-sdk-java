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
 * DirectRoutingMediaSettings
 */

public class DirectRoutingMediaSettings  implements Serializable {
  
  private Boolean useAgentAddressOutbound = null;

  public DirectRoutingMediaSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Toggle that enables using an agent's Direct Routing address outbound on behalf of queue for this media type.
   **/
  public DirectRoutingMediaSettings useAgentAddressOutbound(Boolean useAgentAddressOutbound) {
    this.useAgentAddressOutbound = useAgentAddressOutbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Toggle that enables using an agent's Direct Routing address outbound on behalf of queue for this media type.")
  @JsonProperty("useAgentAddressOutbound")
  public Boolean getUseAgentAddressOutbound() {
    return useAgentAddressOutbound;
  }
  public void setUseAgentAddressOutbound(Boolean useAgentAddressOutbound) {
    this.useAgentAddressOutbound = useAgentAddressOutbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectRoutingMediaSettings directRoutingMediaSettings = (DirectRoutingMediaSettings) o;

    return Objects.equals(this.useAgentAddressOutbound, directRoutingMediaSettings.useAgentAddressOutbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAgentAddressOutbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectRoutingMediaSettings {\n");
    
    sb.append("    useAgentAddressOutbound: ").append(toIndentedString(useAgentAddressOutbound)).append("\n");
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

