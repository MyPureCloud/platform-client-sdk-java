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
import com.mypurecloud.sdk.v2.model.BidGroupWorkPlanRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanBidGroupCreate
 */

public class WorkPlanBidGroupCreate  implements Serializable {
  
  private String name = null;
  private String managementUnitId = null;
  private List<String> agentIds = null;
  private List<BidGroupWorkPlanRequest> workPlans = null;
  private List<String> planningGroupIds = null;

  public WorkPlanBidGroupCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentIds = new ArrayList<String>();
      workPlans = new ArrayList<BidGroupWorkPlanRequest>();
      planningGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The name of the work plan bid group
   **/
  public WorkPlanBidGroupCreate name(String name) {
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
   * The management unit ID this bid group belongs to
   **/
  public WorkPlanBidGroupCreate managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit ID this bid group belongs to")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * Agent IDs who participate in this bid group
   **/
  public WorkPlanBidGroupCreate agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Agent IDs who participate in this bid group")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  /**
   * The list of work plans used in this bid group
   **/
  public WorkPlanBidGroupCreate workPlans(List<BidGroupWorkPlanRequest> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of work plans used in this bid group")
  @JsonProperty("workPlans")
  public List<BidGroupWorkPlanRequest> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<BidGroupWorkPlanRequest> workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * The planning group IDs selected in this bid group
   **/
  public WorkPlanBidGroupCreate planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The planning group IDs selected in this bid group")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanBidGroupCreate workPlanBidGroupCreate = (WorkPlanBidGroupCreate) o;

    return Objects.equals(this.name, workPlanBidGroupCreate.name) &&
            Objects.equals(this.managementUnitId, workPlanBidGroupCreate.managementUnitId) &&
            Objects.equals(this.agentIds, workPlanBidGroupCreate.agentIds) &&
            Objects.equals(this.workPlans, workPlanBidGroupCreate.workPlans) &&
            Objects.equals(this.planningGroupIds, workPlanBidGroupCreate.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnitId, agentIds, workPlans, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroupCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
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

