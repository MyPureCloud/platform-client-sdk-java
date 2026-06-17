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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.ScheduleSetError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScheduleBidGroupSummary
 */

public class ScheduleBidGroupSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ManagementUnitReference managementUnit = null;
  private Integer agentCount = null;
  private Integer workPlanCount = null;
  private Integer workPlanRotationCount = null;
  private Integer planningGroupCount = null;
  private ScheduleSetError scheduleSetError = null;
  private String selfUri = null;

  public ScheduleBidGroupSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBidGroupSummary(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ScheduleBidGroupSummary id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name assigned to this bid group
   **/
  public ScheduleBidGroupSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name assigned to this bid group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The management unit to which this bid group belongs
   **/
  public ScheduleBidGroupSummary managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit to which this bid group belongs")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The number of agents in this bid group
   **/
  public ScheduleBidGroupSummary agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of agents in this bid group")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }


  /**
   * The number of work plans in this bid group or the number of work plans in rotations
   **/
  public ScheduleBidGroupSummary workPlanCount(Integer workPlanCount) {
    this.workPlanCount = workPlanCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of work plans in this bid group or the number of work plans in rotations")
  @JsonProperty("workPlanCount")
  public Integer getWorkPlanCount() {
    return workPlanCount;
  }
  public void setWorkPlanCount(Integer workPlanCount) {
    this.workPlanCount = workPlanCount;
  }


  /**
   * The number of work plan rotations used in this bid group
   **/
  public ScheduleBidGroupSummary workPlanRotationCount(Integer workPlanRotationCount) {
    this.workPlanRotationCount = workPlanRotationCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of work plan rotations used in this bid group")
  @JsonProperty("workPlanRotationCount")
  public Integer getWorkPlanRotationCount() {
    return workPlanRotationCount;
  }
  public void setWorkPlanRotationCount(Integer workPlanRotationCount) {
    this.workPlanRotationCount = workPlanRotationCount;
  }


  /**
   * The number of planning groups in this bid group
   **/
  public ScheduleBidGroupSummary planningGroupCount(Integer planningGroupCount) {
    this.planningGroupCount = planningGroupCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of planning groups in this bid group")
  @JsonProperty("planningGroupCount")
  public Integer getPlanningGroupCount() {
    return planningGroupCount;
  }
  public void setPlanningGroupCount(Integer planningGroupCount) {
    this.planningGroupCount = planningGroupCount;
  }


  /**
   * Schedule set optimization error details for this bid group. Present only when optimization fails
   **/
  public ScheduleBidGroupSummary scheduleSetError(ScheduleSetError scheduleSetError) {
    this.scheduleSetError = scheduleSetError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule set optimization error details for this bid group. Present only when optimization fails")
  @JsonProperty("scheduleSetError")
  public ScheduleSetError getScheduleSetError() {
    return scheduleSetError;
  }
  public void setScheduleSetError(ScheduleSetError scheduleSetError) {
    this.scheduleSetError = scheduleSetError;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidGroupSummary scheduleBidGroupSummary = (ScheduleBidGroupSummary) o;

    return Objects.equals(this.id, scheduleBidGroupSummary.id) &&
            Objects.equals(this.name, scheduleBidGroupSummary.name) &&
            Objects.equals(this.managementUnit, scheduleBidGroupSummary.managementUnit) &&
            Objects.equals(this.agentCount, scheduleBidGroupSummary.agentCount) &&
            Objects.equals(this.workPlanCount, scheduleBidGroupSummary.workPlanCount) &&
            Objects.equals(this.workPlanRotationCount, scheduleBidGroupSummary.workPlanRotationCount) &&
            Objects.equals(this.planningGroupCount, scheduleBidGroupSummary.planningGroupCount) &&
            Objects.equals(this.scheduleSetError, scheduleBidGroupSummary.scheduleSetError) &&
            Objects.equals(this.selfUri, scheduleBidGroupSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, managementUnit, agentCount, workPlanCount, workPlanRotationCount, planningGroupCount, scheduleSetError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidGroupSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    workPlanCount: ").append(toIndentedString(workPlanCount)).append("\n");
    sb.append("    workPlanRotationCount: ").append(toIndentedString(workPlanRotationCount)).append("\n");
    sb.append("    planningGroupCount: ").append(toIndentedString(planningGroupCount)).append("\n");
    sb.append("    scheduleSetError: ").append(toIndentedString(scheduleSetError)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

