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
import com.mypurecloud.sdk.v2.model.BidGroupWorkPlanRotationRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ScheduleBidGroupCreate
 */

public class ScheduleBidGroupCreate  implements Serializable {
  
  private String name = null;
  private String managementUnitId = null;
  private List<String> agentIds = null;
  private List<String> workPlanIds = null;
  private List<BidGroupWorkPlanRotationRequest> workPlanRotations = null;
  private List<String> planningGroupIds = null;

  public ScheduleBidGroupCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentIds = new ArrayList<String>();
      workPlanIds = new ArrayList<String>();
      workPlanRotations = new ArrayList<BidGroupWorkPlanRotationRequest>();
      planningGroupIds = new ArrayList<String>();
    }
  }

  public ScheduleBidGroupCreate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentIds = new ArrayList<String>();
      workPlanIds = new ArrayList<String>();
      workPlanRotations = new ArrayList<BidGroupWorkPlanRotationRequest>();
      planningGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The name of the schedule bid group
   **/
  public ScheduleBidGroupCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the schedule bid group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The ID of the management unit to which this bid group belongs
   **/
  public ScheduleBidGroupCreate managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the management unit to which this bid group belongs")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * The IDs of the agents who participate in this bid group
   **/
  public ScheduleBidGroupCreate agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the agents who participate in this bid group")
  @JsonProperty("agentIds")
  public List<String> getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  /**
   * The IDs of the work plans used in this bid group
   **/
  public ScheduleBidGroupCreate workPlanIds(List<String> workPlanIds) {
    this.workPlanIds = workPlanIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the work plans used in this bid group")
  @JsonProperty("workPlanIds")
  public List<String> getWorkPlanIds() {
    return workPlanIds;
  }
  public void setWorkPlanIds(List<String> workPlanIds) {
    this.workPlanIds = workPlanIds;
  }


  /**
   * The work plan rotations used in this bid group
   **/
  public ScheduleBidGroupCreate workPlanRotations(List<BidGroupWorkPlanRotationRequest> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan rotations used in this bid group")
  @JsonProperty("workPlanRotations")
  public List<BidGroupWorkPlanRotationRequest> getWorkPlanRotations() {
    return workPlanRotations;
  }
  public void setWorkPlanRotations(List<BidGroupWorkPlanRotationRequest> workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
  }


  /**
   * The IDs of the planning groups selected in this bid group
   **/
  public ScheduleBidGroupCreate planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the planning groups selected in this bid group")
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
    ScheduleBidGroupCreate scheduleBidGroupCreate = (ScheduleBidGroupCreate) o;

    return Objects.equals(this.name, scheduleBidGroupCreate.name) &&
            Objects.equals(this.managementUnitId, scheduleBidGroupCreate.managementUnitId) &&
            Objects.equals(this.agentIds, scheduleBidGroupCreate.agentIds) &&
            Objects.equals(this.workPlanIds, scheduleBidGroupCreate.workPlanIds) &&
            Objects.equals(this.workPlanRotations, scheduleBidGroupCreate.workPlanRotations) &&
            Objects.equals(this.planningGroupIds, scheduleBidGroupCreate.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnitId, agentIds, workPlanIds, workPlanRotations, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroupCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    workPlanIds: ").append(toIndentedString(workPlanIds)).append("\n");
    sb.append("    workPlanRotations: ").append(toIndentedString(workPlanRotations)).append("\n");
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

