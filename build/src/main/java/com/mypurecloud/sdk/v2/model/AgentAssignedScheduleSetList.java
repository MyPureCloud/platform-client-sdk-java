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
import com.mypurecloud.sdk.v2.model.AgentAssignedShiftSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentAssignedScheduleSetList
 */

public class AgentAssignedScheduleSetList  implements Serializable {
  
  private List<AgentAssignedShiftSet> agentAssignedShiftSets = null;

  public AgentAssignedScheduleSetList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentAssignedShiftSets = new ArrayList<AgentAssignedShiftSet>();
    }
  }

  public AgentAssignedScheduleSetList(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentAssignedShiftSets = new ArrayList<AgentAssignedShiftSet>();
    }
  }

  
  /**
   * The shift sets, along with the assigned agents
   **/
  public AgentAssignedScheduleSetList agentAssignedShiftSets(List<AgentAssignedShiftSet> agentAssignedShiftSets) {
    this.agentAssignedShiftSets = agentAssignedShiftSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift sets, along with the assigned agents")
  @JsonProperty("agentAssignedShiftSets")
  public List<AgentAssignedShiftSet> getAgentAssignedShiftSets() {
    return agentAssignedShiftSets;
  }
  public void setAgentAssignedShiftSets(List<AgentAssignedShiftSet> agentAssignedShiftSets) {
    this.agentAssignedShiftSets = agentAssignedShiftSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAssignedScheduleSetList agentAssignedScheduleSetList = (AgentAssignedScheduleSetList) o;

    return Objects.equals(this.agentAssignedShiftSets, agentAssignedScheduleSetList.agentAssignedShiftSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentAssignedShiftSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAssignedScheduleSetList {\n");
    
    sb.append("    agentAssignedShiftSets: ").append(toIndentedString(agentAssignedShiftSets)).append("\n");
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

