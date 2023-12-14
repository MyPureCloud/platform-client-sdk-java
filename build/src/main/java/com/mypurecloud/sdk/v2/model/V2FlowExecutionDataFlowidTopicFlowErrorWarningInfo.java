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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo
 */

public class V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo  implements Serializable {
  
  private String reason = null;
  private String executionId = null;
  private String objectId = null;

  
  /**
   * The reason a executionItem encountered an error or warning.
   **/
  public V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo reason(String reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason a executionItem encountered an error or warning.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  /**
   * If applicable, the executionId for the executionItem that invoked the error or warning.
   **/
  public V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the executionId for the executionItem that invoked the error or warning.")
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }
  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  /**
   * If applicable, the objectId for the executionItem that invoked the error or warning.
   **/
  public V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the objectId for the executionItem that invoked the error or warning.")
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo v2FlowExecutionDataFlowidTopicFlowErrorWarningInfo = (V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo) o;

    return Objects.equals(this.reason, v2FlowExecutionDataFlowidTopicFlowErrorWarningInfo.reason) &&
            Objects.equals(this.executionId, v2FlowExecutionDataFlowidTopicFlowErrorWarningInfo.executionId) &&
            Objects.equals(this.objectId, v2FlowExecutionDataFlowidTopicFlowErrorWarningInfo.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, executionId, objectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

