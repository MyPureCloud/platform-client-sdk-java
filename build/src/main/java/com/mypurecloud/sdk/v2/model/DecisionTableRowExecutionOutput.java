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
 * DecisionTableRowExecutionOutput
 */

public class DecisionTableRowExecutionOutput  implements Serializable {
  
  private String rowId = null;
  private Integer rowIndex = null;
  private Map<String, Object> outputs = null;

  public DecisionTableRowExecutionOutput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique rule identifier.
   **/
  public DecisionTableRowExecutionOutput rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique rule identifier.")
  @JsonProperty("rowId")
  public String getRowId() {
    return rowId;
  }
  public void setRowId(String rowId) {
    this.rowId = rowId;
  }


  /**
   * Unique rule identifier.
   **/
  public DecisionTableRowExecutionOutput rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique rule identifier.")
  @JsonProperty("rowIndex")
  public Integer getRowIndex() {
    return rowIndex;
  }
  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  /**
   * The JSON output produced by this rule. Valid according to the execution output contract. In the case of enum decision table output columns, the enum options key will be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will always be returned  regardless of the business rules queue attribute key and these do not change.
   **/
  public DecisionTableRowExecutionOutput outputs(Map<String, Object> outputs) {
    this.outputs = outputs;
    return this;
  }
  
  @ApiModelProperty(example = "&quot;{\n    outputs: {\n        string_attribute: value,\n        integer_attribute: 1234,\n        number_attribute: 1234.567,\n        boolean_attribute: true,\n        enum_attribute: enum_option_key,\n        date_attribute: 2024-12-01,\n        date_time_attribute: 2024-12-01T00:00:00.000Z,\n        business_rules_queue_attribute: {\n            queue: {\n                id: 4340dbda-acba-4bbb-a861-7016da22cbf6\n            }\n        }\n    }\n}&quot;", required = true, value = "The JSON output produced by this rule. Valid according to the execution output contract. In the case of enum decision table output columns, the enum options key will be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will always be returned  regardless of the business rules queue attribute key and these do not change.")
  @JsonProperty("outputs")
  public Map<String, Object> getOutputs() {
    return outputs;
  }
  public void setOutputs(Map<String, Object> outputs) {
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
    DecisionTableRowExecutionOutput decisionTableRowExecutionOutput = (DecisionTableRowExecutionOutput) o;

    return Objects.equals(this.rowId, decisionTableRowExecutionOutput.rowId) &&
            Objects.equals(this.rowIndex, decisionTableRowExecutionOutput.rowIndex) &&
            Objects.equals(this.outputs, decisionTableRowExecutionOutput.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, rowIndex, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableRowExecutionOutput {\n");
    
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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

