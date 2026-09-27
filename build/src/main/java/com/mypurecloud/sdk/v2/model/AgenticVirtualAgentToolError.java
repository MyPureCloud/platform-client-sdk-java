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
 * Error handling configuration for a tool.
 */
@ApiModel(description = "Error handling configuration for a tool.")

public class AgenticVirtualAgentToolError  implements Serializable {
  
  private String type = null;
  private String instruction = null;

  public AgenticVirtualAgentToolError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentToolError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Error type name as defined in the types list.
   **/
  public AgenticVirtualAgentToolError type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "NotFoundError", required = true, value = "Error type name as defined in the types list.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Instruction for how the virtual agent should handle this error.
   **/
  public AgenticVirtualAgentToolError instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }
  
  @ApiModelProperty(example = "Tell the customer an unexpected error has occurred and it is not possible to retry, apologise and confirm that they would like to escalate to a human agent", value = "Instruction for how the virtual agent should handle this error.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentToolError agenticVirtualAgentToolError = (AgenticVirtualAgentToolError) o;

    return Objects.equals(this.type, agenticVirtualAgentToolError.type) &&
            Objects.equals(this.instruction, agenticVirtualAgentToolError.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, instruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentToolError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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

