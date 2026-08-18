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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentRepetitionCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Instructions dynamically added to the virtual agent based on conversation state.
 */
@ApiModel(description = "Instructions dynamically added to the virtual agent based on conversation state.")

public class AgenticVirtualAgentDynamicTurnInstructions  implements Serializable {
  
  private List<AgenticVirtualAgentRepetitionCheck> repetitionChecks = null;

  public AgenticVirtualAgentDynamicTurnInstructions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      repetitionChecks = new ArrayList<AgenticVirtualAgentRepetitionCheck>();
    }
  }

  public AgenticVirtualAgentDynamicTurnInstructions(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      repetitionChecks = new ArrayList<AgenticVirtualAgentRepetitionCheck>();
    }
  }

  
  /**
   * Checks that can be configured to add dynamic instructions for the agent, if user / agent messages repeat.
   **/
  public AgenticVirtualAgentDynamicTurnInstructions repetitionChecks(List<AgenticVirtualAgentRepetitionCheck> repetitionChecks) {
    this.repetitionChecks = repetitionChecks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Checks that can be configured to add dynamic instructions for the agent, if user / agent messages repeat.")
  @JsonProperty("repetitionChecks")
  public List<AgenticVirtualAgentRepetitionCheck> getRepetitionChecks() {
    return repetitionChecks;
  }
  public void setRepetitionChecks(List<AgenticVirtualAgentRepetitionCheck> repetitionChecks) {
    this.repetitionChecks = repetitionChecks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentDynamicTurnInstructions agenticVirtualAgentDynamicTurnInstructions = (AgenticVirtualAgentDynamicTurnInstructions) o;

    return Objects.equals(this.repetitionChecks, agenticVirtualAgentDynamicTurnInstructions.repetitionChecks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repetitionChecks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentDynamicTurnInstructions {\n");
    
    sb.append("    repetitionChecks: ").append(toIndentedString(repetitionChecks)).append("\n");
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

