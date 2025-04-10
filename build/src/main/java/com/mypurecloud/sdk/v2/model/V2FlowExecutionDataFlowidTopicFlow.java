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
 * This contains information about the flow that invoked this execution.  Both a flow execution and action identifier are needed to uniquely identify the invocation point.
 */
@ApiModel(description = "This contains information about the flow that invoked this execution.  Both a flow execution and action identifier are needed to uniquely identify the invocation point.")

public class V2FlowExecutionDataFlowidTopicFlow  implements Serializable {
  
  private String flowExecutionId = null;
  private String objectExecutionId = null;

  public V2FlowExecutionDataFlowidTopicFlow() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The flow execution identifier whose runtime that invoked this.
   **/
  public V2FlowExecutionDataFlowidTopicFlow flowExecutionId(String flowExecutionId) {
    this.flowExecutionId = flowExecutionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow execution identifier whose runtime that invoked this.")
  @JsonProperty("flowExecutionId")
  public String getFlowExecutionId() {
    return flowExecutionId;
  }
  public void setFlowExecutionId(String flowExecutionId) {
    this.flowExecutionId = flowExecutionId;
  }


  /**
   * The object execution identifier within the flow whose runtime that invoked this.  In Architect flows, this object execution identifier will be either an action execution identifier or a menu execution identifier.
   **/
  public V2FlowExecutionDataFlowidTopicFlow objectExecutionId(String objectExecutionId) {
    this.objectExecutionId = objectExecutionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The object execution identifier within the flow whose runtime that invoked this.  In Architect flows, this object execution identifier will be either an action execution identifier or a menu execution identifier.")
  @JsonProperty("objectExecutionId")
  public String getObjectExecutionId() {
    return objectExecutionId;
  }
  public void setObjectExecutionId(String objectExecutionId) {
    this.objectExecutionId = objectExecutionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicFlow v2FlowExecutionDataFlowidTopicFlow = (V2FlowExecutionDataFlowidTopicFlow) o;

    return Objects.equals(this.flowExecutionId, v2FlowExecutionDataFlowidTopicFlow.flowExecutionId) &&
            Objects.equals(this.objectExecutionId, v2FlowExecutionDataFlowidTopicFlow.objectExecutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowExecutionId, objectExecutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicFlow {\n");
    
    sb.append("    flowExecutionId: ").append(toIndentedString(flowExecutionId)).append("\n");
    sb.append("    objectExecutionId: ").append(toIndentedString(objectExecutionId)).append("\n");
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

