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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DecisionTableExecutionRequest
 */

public class DecisionTableExecutionRequest  implements Serializable {
  
  private Map<String, Object> inputs = null;

  public DecisionTableExecutionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The JSON input data for executing the decision table. Must be valid according to the execution input contract defined on the table. In the case of enum decision table columns the enum options key should be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will be required regardless of the queue attribute key and these do not change.
   **/
  public DecisionTableExecutionRequest inputs(Map<String, Object> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "&quot;{\n    inputs: {\n        string_attribute: value,\n        integer_attribute: 1234,\n        number_attribute: 1234.567,\n        boolean_attribute: true,\n        enum_attribute: enum_option_key,\n        date_attribute: 2024-12-01,\n        date_time_attribute: 2024-12-01T00:00:00.000Z,\n        queue_attribute: {\n            queue: {\n                id: 4340dbda-acba-4bbb-a861-7016da22cbf6\n            }\n        }\n    }\n}&quot;", required = true, value = "The JSON input data for executing the decision table. Must be valid according to the execution input contract defined on the table. In the case of enum decision table columns the enum options key should be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will be required regardless of the queue attribute key and these do not change.")
  @JsonProperty("inputs")
  public Map<String, Object> getInputs() {
    return inputs;
  }
  public void setInputs(Map<String, Object> inputs) {
    this.inputs = inputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableExecutionRequest decisionTableExecutionRequest = (DecisionTableExecutionRequest) o;

    return Objects.equals(this.inputs, decisionTableExecutionRequest.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableExecutionRequest {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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

