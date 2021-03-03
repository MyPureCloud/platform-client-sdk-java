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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Parameters for launching a flow.
 */
@ApiModel(description = "Parameters for launching a flow.")

public class FlowExecutionLaunchRequest  implements Serializable {
  
  private String flowId = null;
  private String flowVersion = null;
  private Map<String, Object> inputData = null;
  private String name = null;

  
  /**
   * ID of the flow to launch.
   **/
  public FlowExecutionLaunchRequest flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the flow to launch.")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  
  /**
   * The version of the flow to launch. Omit this value (or supply null/empty) to use the latest published version.
   **/
  public FlowExecutionLaunchRequest flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the flow to launch. Omit this value (or supply null/empty) to use the latest published version.")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }

  
  /**
   * Input values to the flow. Valid values are defined by a flow's input JSON schema.
   **/
  public FlowExecutionLaunchRequest inputData(Map<String, Object> inputData) {
    this.inputData = inputData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input values to the flow. Valid values are defined by a flow's input JSON schema.")
  @JsonProperty("inputData")
  public Map<String, Object> getInputData() {
    return inputData;
  }
  public void setInputData(Map<String, Object> inputData) {
    this.inputData = inputData;
  }

  
  /**
   * A displayable name to assign to the new flow execution
   **/
  public FlowExecutionLaunchRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A displayable name to assign to the new flow execution")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowExecutionLaunchRequest flowExecutionLaunchRequest = (FlowExecutionLaunchRequest) o;
    return Objects.equals(this.flowId, flowExecutionLaunchRequest.flowId) &&
        Objects.equals(this.flowVersion, flowExecutionLaunchRequest.flowVersion) &&
        Objects.equals(this.inputData, flowExecutionLaunchRequest.inputData) &&
        Objects.equals(this.name, flowExecutionLaunchRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowId, flowVersion, inputData, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowExecutionLaunchRequest {\n");
    
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

