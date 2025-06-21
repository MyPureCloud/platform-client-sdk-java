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
import com.mypurecloud.sdk.v2.model.DecisionTableRowParameterValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PutDecisionTableRowRequest
 */

public class PutDecisionTableRowRequest  implements Serializable {
  
  private Map<String, DecisionTableRowParameterValue> inputs = null;
  private Map<String, DecisionTableRowParameterValue> outputs = null;

  public PutDecisionTableRowRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The full updated input values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity
   **/
  public PutDecisionTableRowRequest inputs(Map<String, DecisionTableRowParameterValue> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The full updated input values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity")
  @JsonProperty("inputs")
  public Map<String, DecisionTableRowParameterValue> getInputs() {
    return inputs;
  }
  public void setInputs(Map<String, DecisionTableRowParameterValue> inputs) {
    this.inputs = inputs;
  }


  /**
   * The full updated output values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity
   **/
  public PutDecisionTableRowRequest outputs(Map<String, DecisionTableRowParameterValue> outputs) {
    this.outputs = outputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The full updated output values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity")
  @JsonProperty("outputs")
  public Map<String, DecisionTableRowParameterValue> getOutputs() {
    return outputs;
  }
  public void setOutputs(Map<String, DecisionTableRowParameterValue> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutDecisionTableRowRequest putDecisionTableRowRequest = (PutDecisionTableRowRequest) o;

    return Objects.equals(this.inputs, putDecisionTableRowRequest.inputs) &&
            Objects.equals(this.outputs, putDecisionTableRowRequest.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutDecisionTableRowRequest {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

