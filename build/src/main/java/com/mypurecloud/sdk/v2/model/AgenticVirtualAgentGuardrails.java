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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentGuardrailInstruction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Guardrail rules for a virtual agent.
 */
@ApiModel(description = "Guardrail rules for a virtual agent.")

public class AgenticVirtualAgentGuardrails  implements Serializable {
  
  private List<AgenticVirtualAgentGuardrailInstruction> custom = null;

  public AgenticVirtualAgentGuardrails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      custom = new ArrayList<AgenticVirtualAgentGuardrailInstruction>();
    }
  }

  public AgenticVirtualAgentGuardrails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      custom = new ArrayList<AgenticVirtualAgentGuardrailInstruction>();
    }
  }

  
  /**
   * Custom guardrail rules used to detect and block matching user behavior.
   **/
  public AgenticVirtualAgentGuardrails custom(List<AgenticVirtualAgentGuardrailInstruction> custom) {
    this.custom = custom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom guardrail rules used to detect and block matching user behavior.")
  @JsonProperty("custom")
  public List<AgenticVirtualAgentGuardrailInstruction> getCustom() {
    return custom;
  }
  public void setCustom(List<AgenticVirtualAgentGuardrailInstruction> custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentGuardrails agenticVirtualAgentGuardrails = (AgenticVirtualAgentGuardrails) o;

    return Objects.equals(this.custom, agenticVirtualAgentGuardrails.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentGuardrails {\n");
    
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

