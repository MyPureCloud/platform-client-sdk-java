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
import com.mypurecloud.sdk.v2.model.AgentBidWorkPlanOverrideRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentsBidAssignedWorkPlanOverrideRequest
 */

public class AgentsBidAssignedWorkPlanOverrideRequest  implements Serializable {
  
  private List<AgentBidWorkPlanOverrideRequest> agentWorkPlanOverrides = null;

  public AgentsBidAssignedWorkPlanOverrideRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentWorkPlanOverrides = new ArrayList<AgentBidWorkPlanOverrideRequest>();
    }
  }

  
  /**
   * The list of agent work plan overrides
   **/
  public AgentsBidAssignedWorkPlanOverrideRequest agentWorkPlanOverrides(List<AgentBidWorkPlanOverrideRequest> agentWorkPlanOverrides) {
    this.agentWorkPlanOverrides = agentWorkPlanOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of agent work plan overrides")
  @JsonProperty("agentWorkPlanOverrides")
  public List<AgentBidWorkPlanOverrideRequest> getAgentWorkPlanOverrides() {
    return agentWorkPlanOverrides;
  }
  public void setAgentWorkPlanOverrides(List<AgentBidWorkPlanOverrideRequest> agentWorkPlanOverrides) {
    this.agentWorkPlanOverrides = agentWorkPlanOverrides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentsBidAssignedWorkPlanOverrideRequest agentsBidAssignedWorkPlanOverrideRequest = (AgentsBidAssignedWorkPlanOverrideRequest) o;

    return Objects.equals(this.agentWorkPlanOverrides, agentsBidAssignedWorkPlanOverrideRequest.agentWorkPlanOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentWorkPlanOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentsBidAssignedWorkPlanOverrideRequest {\n");
    
    sb.append("    agentWorkPlanOverrides: ").append(toIndentedString(agentWorkPlanOverrides)).append("\n");
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

