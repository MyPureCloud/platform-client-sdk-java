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
import com.mypurecloud.sdk.v2.model.ListWrapperBidGroupWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.ListWrapperScheduleSetRequest;
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScheduleBidGroupUpdate
 */

public class ScheduleBidGroupUpdate  implements Serializable {
  
  private String name = null;
  private String managementUnitId = null;
  private SetWrapperString agentIds = null;
  private SetWrapperString workPlanIds = null;
  private ListWrapperBidGroupWorkPlanRotationRequest workPlanRotations = null;
  private SetWrapperString planningGroupIds = null;
  private ListWrapperScheduleSetRequest scheduleSets = null;

  public ScheduleBidGroupUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBidGroupUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the schedule bid group
   **/
  public ScheduleBidGroupUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the schedule bid group")
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
  public ScheduleBidGroupUpdate managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the management unit to which this bid group belongs")
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
  public ScheduleBidGroupUpdate agentIds(SetWrapperString agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the agents who participate in this bid group")
  @JsonProperty("agentIds")
  public SetWrapperString getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(SetWrapperString agentIds) {
    this.agentIds = agentIds;
  }


  /**
   * The IDs of the work plans used in this bid group
   **/
  public ScheduleBidGroupUpdate workPlanIds(SetWrapperString workPlanIds) {
    this.workPlanIds = workPlanIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the work plans used in this bid group")
  @JsonProperty("workPlanIds")
  public SetWrapperString getWorkPlanIds() {
    return workPlanIds;
  }
  public void setWorkPlanIds(SetWrapperString workPlanIds) {
    this.workPlanIds = workPlanIds;
  }


  /**
   * The work plan rotations used in this bid group
   **/
  public ScheduleBidGroupUpdate workPlanRotations(ListWrapperBidGroupWorkPlanRotationRequest workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan rotations used in this bid group")
  @JsonProperty("workPlanRotations")
  public ListWrapperBidGroupWorkPlanRotationRequest getWorkPlanRotations() {
    return workPlanRotations;
  }
  public void setWorkPlanRotations(ListWrapperBidGroupWorkPlanRotationRequest workPlanRotations) {
    this.workPlanRotations = workPlanRotations;
  }


  /**
   * The IDs of the planning groups selected in this bid group
   **/
  public ScheduleBidGroupUpdate planningGroupIds(SetWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the planning groups selected in this bid group")
  @JsonProperty("planningGroupIds")
  public SetWrapperString getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(SetWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * The schedule sets generated for this bid group
   **/
  public ScheduleBidGroupUpdate scheduleSets(ListWrapperScheduleSetRequest scheduleSets) {
    this.scheduleSets = scheduleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule sets generated for this bid group")
  @JsonProperty("scheduleSets")
  public ListWrapperScheduleSetRequest getScheduleSets() {
    return scheduleSets;
  }
  public void setScheduleSets(ListWrapperScheduleSetRequest scheduleSets) {
    this.scheduleSets = scheduleSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidGroupUpdate scheduleBidGroupUpdate = (ScheduleBidGroupUpdate) o;

    return Objects.equals(this.name, scheduleBidGroupUpdate.name) &&
            Objects.equals(this.managementUnitId, scheduleBidGroupUpdate.managementUnitId) &&
            Objects.equals(this.agentIds, scheduleBidGroupUpdate.agentIds) &&
            Objects.equals(this.workPlanIds, scheduleBidGroupUpdate.workPlanIds) &&
            Objects.equals(this.workPlanRotations, scheduleBidGroupUpdate.workPlanRotations) &&
            Objects.equals(this.planningGroupIds, scheduleBidGroupUpdate.planningGroupIds) &&
            Objects.equals(this.scheduleSets, scheduleBidGroupUpdate.scheduleSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnitId, agentIds, workPlanIds, workPlanRotations, planningGroupIds, scheduleSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroupUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    workPlanIds: ").append(toIndentedString(workPlanIds)).append("\n");
    sb.append("    workPlanRotations: ").append(toIndentedString(workPlanRotations)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    scheduleSets: ").append(toIndentedString(scheduleSets)).append("\n");
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

