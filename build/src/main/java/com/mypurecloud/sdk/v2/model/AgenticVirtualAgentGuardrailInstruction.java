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
 * Custom guardrail rule for a virtual agent.
 */
@ApiModel(description = "Custom guardrail rule for a virtual agent.")

public class AgenticVirtualAgentGuardrailInstruction  implements Serializable {
  
  private String instruction = null;
  private Boolean enabled = null;

  public AgenticVirtualAgentGuardrailInstruction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentGuardrailInstruction(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Natural language rule describing user behavior to detect and block.
   **/
  public AgenticVirtualAgentGuardrailInstruction instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }
  
  @ApiModelProperty(example = "Block any message where the customer proposes, suggests, or implies a different price than what was listed. This includes follow-up bargaining.", required = true, value = "Natural language rule describing user behavior to detect and block.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  /**
   * Whether this custom guardrail rule is active.
   **/
  public AgenticVirtualAgentGuardrailInstruction enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Whether this custom guardrail rule is active.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentGuardrailInstruction agenticVirtualAgentGuardrailInstruction = (AgenticVirtualAgentGuardrailInstruction) o;

    return Objects.equals(this.instruction, agenticVirtualAgentGuardrailInstruction.instruction) &&
            Objects.equals(this.enabled, agenticVirtualAgentGuardrailInstruction.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentGuardrailInstruction {\n");
    
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

