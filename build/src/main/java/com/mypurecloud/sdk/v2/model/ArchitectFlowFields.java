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
import com.mypurecloud.sdk.v2.model.RequestMapping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ArchitectFlowFields
 */

public class ArchitectFlowFields  implements Serializable {
  
  private AddressableEntityRef architectFlow = null;
  private List<RequestMapping> flowRequestMappings = new ArrayList<RequestMapping>();

  
  /**
   * The architect flow.
   **/
  public ArchitectFlowFields architectFlow(AddressableEntityRef architectFlow) {
    this.architectFlow = architectFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The architect flow.")
  @JsonProperty("architectFlow")
  public AddressableEntityRef getArchitectFlow() {
    return architectFlow;
  }
  public void setArchitectFlow(AddressableEntityRef architectFlow) {
    this.architectFlow = architectFlow;
  }

  
  /**
   * Collection of Architect Flow Request Mappings to use.
   **/
  public ArchitectFlowFields flowRequestMappings(List<RequestMapping> flowRequestMappings) {
    this.flowRequestMappings = flowRequestMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of Architect Flow Request Mappings to use.")
  @JsonProperty("flowRequestMappings")
  public List<RequestMapping> getFlowRequestMappings() {
    return flowRequestMappings;
  }
  public void setFlowRequestMappings(List<RequestMapping> flowRequestMappings) {
    this.flowRequestMappings = flowRequestMappings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectFlowFields architectFlowFields = (ArchitectFlowFields) o;
    return Objects.equals(this.architectFlow, architectFlowFields.architectFlow) &&
        Objects.equals(this.flowRequestMappings, architectFlowFields.flowRequestMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architectFlow, flowRequestMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowFields {\n");
    
    sb.append("    architectFlow: ").append(toIndentedString(architectFlow)).append("\n");
    sb.append("    flowRequestMappings: ").append(toIndentedString(flowRequestMappings)).append("\n");
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

