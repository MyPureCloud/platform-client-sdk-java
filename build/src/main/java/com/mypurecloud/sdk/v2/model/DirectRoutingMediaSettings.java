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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DirectRoutingMediaSettings
 */

public class DirectRoutingMediaSettings  implements Serializable {
  
  private Boolean enabled = null;
  private AddressableEntityRef inboundFlow = null;

  
  /**
   * Toggle that enables Direct Routing for this media type.
   **/
  public DirectRoutingMediaSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Toggle that enables Direct Routing for this media type.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The Direct Routing inbound flow id for this media type.
   **/
  public DirectRoutingMediaSettings inboundFlow(AddressableEntityRef inboundFlow) {
    this.inboundFlow = inboundFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Direct Routing inbound flow id for this media type.")
  @JsonProperty("inboundFlow")
  public AddressableEntityRef getInboundFlow() {
    return inboundFlow;
  }
  public void setInboundFlow(AddressableEntityRef inboundFlow) {
    this.inboundFlow = inboundFlow;
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

    return Objects.equals(this.enabled, directRoutingMediaSettings.enabled) &&
            Objects.equals(this.inboundFlow, directRoutingMediaSettings.inboundFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, inboundFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectRoutingMediaSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inboundFlow: ").append(toIndentedString(inboundFlow)).append("\n");
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

