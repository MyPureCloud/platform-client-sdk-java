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
import com.mypurecloud.sdk.v2.model.AssignedAgentDetails;
import com.mypurecloud.sdk.v2.model.ScheduleBidScheduledShift;
import com.mypurecloud.sdk.v2.model.ShiftSetEffectiveWorkPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentAssignedShiftSet
 */

public class AgentAssignedShiftSet  implements Serializable {
  
  private String id = null;
  private ShiftSetEffectiveWorkPlan effectiveWorkPlan = null;
  private List<ScheduleBidScheduledShift> shifts = null;
  private List<AssignedAgentDetails> agents = null;

  public AgentAssignedShiftSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shifts = new ArrayList<ScheduleBidScheduledShift>();
      agents = new ArrayList<AssignedAgentDetails>();
    }
  }

  public AgentAssignedShiftSet(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shifts = new ArrayList<ScheduleBidScheduledShift>();
      agents = new ArrayList<AssignedAgentDetails>();
    }
  }

  
  /**
   * The ID of the shift set
   **/
  public AgentAssignedShiftSet id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift set")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The work plan or work plan rotation used for generating the shift set
   **/
  public AgentAssignedShiftSet effectiveWorkPlan(ShiftSetEffectiveWorkPlan effectiveWorkPlan) {
    this.effectiveWorkPlan = effectiveWorkPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan or work plan rotation used for generating the shift set")
  @JsonProperty("effectiveWorkPlan")
  public ShiftSetEffectiveWorkPlan getEffectiveWorkPlan() {
    return effectiveWorkPlan;
  }
  public void setEffectiveWorkPlan(ShiftSetEffectiveWorkPlan effectiveWorkPlan) {
    this.effectiveWorkPlan = effectiveWorkPlan;
  }


  /**
   * The scheduled shifts
   **/
  public AgentAssignedShiftSet shifts(List<ScheduleBidScheduledShift> shifts) {
    this.shifts = shifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The scheduled shifts")
  @JsonProperty("shifts")
  public List<ScheduleBidScheduledShift> getShifts() {
    return shifts;
  }
  public void setShifts(List<ScheduleBidScheduledShift> shifts) {
    this.shifts = shifts;
  }


  /**
   * The details of the agents assigned to this shift set
   **/
  public AgentAssignedShiftSet agents(List<AssignedAgentDetails> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The details of the agents assigned to this shift set")
  @JsonProperty("agents")
  public List<AssignedAgentDetails> getAgents() {
    return agents;
  }
  public void setAgents(List<AssignedAgentDetails> agents) {
    this.agents = agents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAssignedShiftSet agentAssignedShiftSet = (AgentAssignedShiftSet) o;

    return Objects.equals(this.id, agentAssignedShiftSet.id) &&
            Objects.equals(this.effectiveWorkPlan, agentAssignedShiftSet.effectiveWorkPlan) &&
            Objects.equals(this.shifts, agentAssignedShiftSet.shifts) &&
            Objects.equals(this.agents, agentAssignedShiftSet.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, effectiveWorkPlan, shifts, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAssignedShiftSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    effectiveWorkPlan: ").append(toIndentedString(effectiveWorkPlan)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

