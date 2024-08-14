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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BidGroupWorkPlanResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanBidGroup
 */

public class WorkPlanBidGroup  implements Serializable {
  
  private String name = null;
  private ManagementUnitReference managementUnit = null;
  private List<UserReference> agents = new ArrayList<UserReference>();
  private List<BidGroupWorkPlanResponse> workPlans = new ArrayList<BidGroupWorkPlanResponse>();
  private List<PlanningGroupReference> planningGroups = new ArrayList<PlanningGroupReference>();

  
  /**
   * The name of the work plan bid group
   **/
  public WorkPlanBidGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the work plan bid group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The management unit this bid group belongs to
   **/
  public WorkPlanBidGroup managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit this bid group belongs to")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The list of agents who participate in this bid group
   **/
  public WorkPlanBidGroup agents(List<UserReference> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of agents who participate in this bid group")
  @JsonProperty("agents")
  public List<UserReference> getAgents() {
    return agents;
  }
  public void setAgents(List<UserReference> agents) {
    this.agents = agents;
  }


  /**
   * The list of work plans used in this bid group
   **/
  public WorkPlanBidGroup workPlans(List<BidGroupWorkPlanResponse> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of work plans used in this bid group")
  @JsonProperty("workPlans")
  public List<BidGroupWorkPlanResponse> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<BidGroupWorkPlanResponse> workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * The list of planning groups selected in this bid group
   **/
  public WorkPlanBidGroup planningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of planning groups selected in this bid group")
  @JsonProperty("planningGroups")
  public List<PlanningGroupReference> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanBidGroup workPlanBidGroup = (WorkPlanBidGroup) o;

    return Objects.equals(this.name, workPlanBidGroup.name) &&
            Objects.equals(this.managementUnit, workPlanBidGroup.managementUnit) &&
            Objects.equals(this.agents, workPlanBidGroup.agents) &&
            Objects.equals(this.workPlans, workPlanBidGroup.workPlans) &&
            Objects.equals(this.planningGroups, workPlanBidGroup.planningGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnit, agents, workPlans, planningGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
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

