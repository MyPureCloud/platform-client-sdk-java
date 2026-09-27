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
 * Data action input and output JSON schemas.
 */
@ApiModel(description = "Data action input and output JSON schemas.")

public class AgenticVirtualAgentDataActionSchemas  implements Serializable {
  
  private Map<String, Object> inputs = null;
  private Map<String, Object> outputs = null;

  public AgenticVirtualAgentDataActionSchemas() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentDataActionSchemas(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Input JSON schema for the selected data action.
   **/
  public AgenticVirtualAgentDataActionSchemas inputs(Map<String, Object> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input JSON schema for the selected data action.")
  @JsonProperty("inputs")
  public Map<String, Object> getInputs() {
    return inputs;
  }
  public void setInputs(Map<String, Object> inputs) {
    this.inputs = inputs;
  }


  /**
   * Output JSON schema for the selected data action.
   **/
  public AgenticVirtualAgentDataActionSchemas outputs(Map<String, Object> outputs) {
    this.outputs = outputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Output JSON schema for the selected data action.")
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
    AgenticVirtualAgentDataActionSchemas agenticVirtualAgentDataActionSchemas = (AgenticVirtualAgentDataActionSchemas) o;

    return Objects.equals(this.inputs, agenticVirtualAgentDataActionSchemas.inputs) &&
            Objects.equals(this.outputs, agenticVirtualAgentDataActionSchemas.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentDataActionSchemas {\n");
    
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

