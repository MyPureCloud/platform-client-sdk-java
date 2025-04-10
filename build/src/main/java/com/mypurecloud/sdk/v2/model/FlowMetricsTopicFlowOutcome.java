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
 * FlowMetricsTopicFlowOutcome
 */

public class FlowMetricsTopicFlowOutcome  implements Serializable {
  
  private String flowOutcome = null;
  private String flowOutcomeId = null;
  private String flowOutcomeValue = null;

  public FlowMetricsTopicFlowOutcome() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Combination of unique flow outcome identifier and its value separated by colon
   **/
  public FlowMetricsTopicFlowOutcome flowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Combination of unique flow outcome identifier and its value separated by colon")
  @JsonProperty("flowOutcome")
  public String getFlowOutcome() {
    return flowOutcome;
  }
  public void setFlowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
  }


  /**
   * Unique identifier of a flow outcome
   **/
  public FlowMetricsTopicFlowOutcome flowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of a flow outcome")
  @JsonProperty("flowOutcomeId")
  public String getFlowOutcomeId() {
    return flowOutcomeId;
  }
  public void setFlowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
  }


  /**
   * Flow outcome value, e.g. SUCCESS
   **/
  public FlowMetricsTopicFlowOutcome flowOutcomeValue(String flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow outcome value, e.g. SUCCESS")
  @JsonProperty("flowOutcomeValue")
  public String getFlowOutcomeValue() {
    return flowOutcomeValue;
  }
  public void setFlowOutcomeValue(String flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowMetricsTopicFlowOutcome flowMetricsTopicFlowOutcome = (FlowMetricsTopicFlowOutcome) o;

    return Objects.equals(this.flowOutcome, flowMetricsTopicFlowOutcome.flowOutcome) &&
            Objects.equals(this.flowOutcomeId, flowMetricsTopicFlowOutcome.flowOutcomeId) &&
            Objects.equals(this.flowOutcomeValue, flowMetricsTopicFlowOutcome.flowOutcomeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowOutcome, flowOutcomeId, flowOutcomeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowMetricsTopicFlowOutcome {\n");
    
    sb.append("    flowOutcome: ").append(toIndentedString(flowOutcome)).append("\n");
    sb.append("    flowOutcomeId: ").append(toIndentedString(flowOutcomeId)).append("\n");
    sb.append("    flowOutcomeValue: ").append(toIndentedString(flowOutcomeValue)).append("\n");
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

