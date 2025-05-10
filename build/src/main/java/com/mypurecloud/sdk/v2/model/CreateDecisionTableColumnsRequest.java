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
import com.mypurecloud.sdk.v2.model.DecisionTableInputColumnRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableOutputColumnRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateDecisionTableColumnsRequest
 */

public class CreateDecisionTableColumnsRequest  implements Serializable {
  
  private List<DecisionTableInputColumnRequest> inputs = null;
  private List<DecisionTableOutputColumnRequest> outputs = null;

  public CreateDecisionTableColumnsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inputs = new ArrayList<DecisionTableInputColumnRequest>();
      outputs = new ArrayList<DecisionTableOutputColumnRequest>();
    }
  }

  
  /**
   * The input columns of the decision table.
   **/
  public CreateDecisionTableColumnsRequest inputs(List<DecisionTableInputColumnRequest> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The input columns of the decision table.")
  @JsonProperty("inputs")
  public List<DecisionTableInputColumnRequest> getInputs() {
    return inputs;
  }
  public void setInputs(List<DecisionTableInputColumnRequest> inputs) {
    this.inputs = inputs;
  }


  /**
   * The output columns of the decision table.
   **/
  public CreateDecisionTableColumnsRequest outputs(List<DecisionTableOutputColumnRequest> outputs) {
    this.outputs = outputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The output columns of the decision table.")
  @JsonProperty("outputs")
  public List<DecisionTableOutputColumnRequest> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<DecisionTableOutputColumnRequest> outputs) {
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
    CreateDecisionTableColumnsRequest createDecisionTableColumnsRequest = (CreateDecisionTableColumnsRequest) o;

    return Objects.equals(this.inputs, createDecisionTableColumnsRequest.inputs) &&
            Objects.equals(this.outputs, createDecisionTableColumnsRequest.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionTableColumnsRequest {\n");
    
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

