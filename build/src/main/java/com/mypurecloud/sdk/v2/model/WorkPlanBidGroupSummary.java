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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkPlanBidGroupSummary
 */

public class WorkPlanBidGroupSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ManagementUnitReference managementUnit = null;
  private Integer agentCount = null;
  private Integer workPlanCount = null;
  private Integer planningGroupCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name assigned to this bid group
   **/
  public WorkPlanBidGroupSummary name(String name) {
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
   * The management unit this bid group belongs to
   **/
  public WorkPlanBidGroupSummary managementUnit(ManagementUnitReference managementUnit) {
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
   * The number of agents in this bid group
   **/
  public WorkPlanBidGroupSummary agentCount(Integer agentCount) {
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
   * The number of work plans in this bid group
   **/
  public WorkPlanBidGroupSummary workPlanCount(Integer workPlanCount) {
    this.workPlanCount = workPlanCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of work plans in this bid group")
  @JsonProperty("workPlanCount")
  public Integer getWorkPlanCount() {
    return workPlanCount;
  }
  public void setWorkPlanCount(Integer workPlanCount) {
    this.workPlanCount = workPlanCount;
  }


  /**
   * The number of planning groups in this bid group
   **/
  public WorkPlanBidGroupSummary planningGroupCount(Integer planningGroupCount) {
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
    WorkPlanBidGroupSummary workPlanBidGroupSummary = (WorkPlanBidGroupSummary) o;

    return Objects.equals(this.id, workPlanBidGroupSummary.id) &&
            Objects.equals(this.name, workPlanBidGroupSummary.name) &&
            Objects.equals(this.managementUnit, workPlanBidGroupSummary.managementUnit) &&
            Objects.equals(this.agentCount, workPlanBidGroupSummary.agentCount) &&
            Objects.equals(this.workPlanCount, workPlanBidGroupSummary.workPlanCount) &&
            Objects.equals(this.planningGroupCount, workPlanBidGroupSummary.planningGroupCount) &&
            Objects.equals(this.selfUri, workPlanBidGroupSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, managementUnit, agentCount, workPlanCount, planningGroupCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanBidGroupSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    workPlanCount: ").append(toIndentedString(workPlanCount)).append("\n");
    sb.append("    planningGroupCount: ").append(toIndentedString(planningGroupCount)).append("\n");
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

