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
import com.mypurecloud.sdk.v2.model.ListWrapperBidGroupWorkPlanRequest;
import com.mypurecloud.sdk.v2.model.ListWrapperString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkPlanBidGroupUpdate
 */

public class WorkPlanBidGroupUpdate  implements Serializable {
  
  private String name = null;
  private String managementUnitId = null;
  private ListWrapperString agentIds = null;
  private ListWrapperBidGroupWorkPlanRequest workPlans = null;
  private ListWrapperString planningGroupIds = null;

  
  /**
   * The name of the work plan bid group
   **/
  public WorkPlanBidGroupUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the work plan bid group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The management unit ID used for this work plan bid group
   **/
  public WorkPlanBidGroupUpdate managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit ID used for this work plan bid group")
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
  public WorkPlanBidGroupUpdate agentIds(ListWrapperString agentIds) {
    this.agentIds = agentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent IDs who participate in this bid group")
  @JsonProperty("agentIds")
  public ListWrapperString getAgentIds() {
    return agentIds;
  }
  public void setAgentIds(ListWrapperString agentIds) {
    this.agentIds = agentIds;
  }


  /**
   * The list of work plans used in this bid group
   **/
  public WorkPlanBidGroupUpdate workPlans(ListWrapperBidGroupWorkPlanRequest workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of work plans used in this bid group")
  @JsonProperty("workPlans")
  public ListWrapperBidGroupWorkPlanRequest getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(ListWrapperBidGroupWorkPlanRequest workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * The planning group IDs selected in this bid group
   **/
  public WorkPlanBidGroupUpdate planningGroupIds(ListWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group IDs selected in this bid group")
  @JsonProperty("planningGroupIds")
  public ListWrapperString getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(ListWrapperString planningGroupIds) {
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
    WorkPlanBidGroupUpdate workPlanBidGroupUpdate = (WorkPlanBidGroupUpdate) o;

    return Objects.equals(this.name, workPlanBidGroupUpdate.name) &&
            Objects.equals(this.managementUnitId, workPlanBidGroupUpdate.managementUnitId) &&
            Objects.equals(this.agentIds, workPlanBidGroupUpdate.agentIds) &&
            Objects.equals(this.workPlans, workPlanBidGroupUpdate.workPlans) &&
            Objects.equals(this.planningGroupIds, workPlanBidGroupUpdate.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managementUnitId, agentIds, workPlans, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroupUpdate {\n");
    
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

