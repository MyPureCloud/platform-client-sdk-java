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
import com.mypurecloud.sdk.v2.model.StaffingGroupFullTimeEquivalentContribution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanningPlanningGroupAllocation
 */

public class CapacityPlanningPlanningGroupAllocation  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> requiredStaffFullTimeEquivalentCount = null;
  private List<StaffingGroupFullTimeEquivalentContribution> staffingGroupFullTimeEquivalentContributions = null;
  private List<Double> totalPlannedFullTimeEquivalentCount = null;
  private List<Double> overUnderFullTimeEquivalentCount = null;

  public CapacityPlanningPlanningGroupAllocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requiredStaffFullTimeEquivalentCount = new ArrayList<Double>();
      staffingGroupFullTimeEquivalentContributions = new ArrayList<StaffingGroupFullTimeEquivalentContribution>();
      totalPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      overUnderFullTimeEquivalentCount = new ArrayList<Double>();
    }
  }

  
  /**
   * The planning group ID to which the capacity planning allocations apply
   **/
  public CapacityPlanningPlanningGroupAllocation planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The planning group ID to which the capacity planning allocations apply")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * The weekly required staff to this planning group
   **/
  public CapacityPlanningPlanningGroupAllocation requiredStaffFullTimeEquivalentCount(List<Double> requiredStaffFullTimeEquivalentCount) {
    this.requiredStaffFullTimeEquivalentCount = requiredStaffFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly required staff to this planning group")
  @JsonProperty("requiredStaffFullTimeEquivalentCount")
  public List<Double> getRequiredStaffFullTimeEquivalentCount() {
    return requiredStaffFullTimeEquivalentCount;
  }
  public void setRequiredStaffFullTimeEquivalentCount(List<Double> requiredStaffFullTimeEquivalentCount) {
    this.requiredStaffFullTimeEquivalentCount = requiredStaffFullTimeEquivalentCount;
  }


  /**
   * The weekly planned full time equivalent contributions from associated staffing groups
   **/
  public CapacityPlanningPlanningGroupAllocation staffingGroupFullTimeEquivalentContributions(List<StaffingGroupFullTimeEquivalentContribution> staffingGroupFullTimeEquivalentContributions) {
    this.staffingGroupFullTimeEquivalentContributions = staffingGroupFullTimeEquivalentContributions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly planned full time equivalent contributions from associated staffing groups")
  @JsonProperty("staffingGroupFullTimeEquivalentContributions")
  public List<StaffingGroupFullTimeEquivalentContribution> getStaffingGroupFullTimeEquivalentContributions() {
    return staffingGroupFullTimeEquivalentContributions;
  }
  public void setStaffingGroupFullTimeEquivalentContributions(List<StaffingGroupFullTimeEquivalentContribution> staffingGroupFullTimeEquivalentContributions) {
    this.staffingGroupFullTimeEquivalentContributions = staffingGroupFullTimeEquivalentContributions;
  }


  /**
   * The total weekly full time equivalent planned for this planning group, based on the associated staffing groups
   **/
  public CapacityPlanningPlanningGroupAllocation totalPlannedFullTimeEquivalentCount(List<Double> totalPlannedFullTimeEquivalentCount) {
    this.totalPlannedFullTimeEquivalentCount = totalPlannedFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total weekly full time equivalent planned for this planning group, based on the associated staffing groups")
  @JsonProperty("totalPlannedFullTimeEquivalentCount")
  public List<Double> getTotalPlannedFullTimeEquivalentCount() {
    return totalPlannedFullTimeEquivalentCount;
  }
  public void setTotalPlannedFullTimeEquivalentCount(List<Double> totalPlannedFullTimeEquivalentCount) {
    this.totalPlannedFullTimeEquivalentCount = totalPlannedFullTimeEquivalentCount;
  }


  /**
   * The weekly difference between the total planned full time equivalent and the required staff
   **/
  public CapacityPlanningPlanningGroupAllocation overUnderFullTimeEquivalentCount(List<Double> overUnderFullTimeEquivalentCount) {
    this.overUnderFullTimeEquivalentCount = overUnderFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly difference between the total planned full time equivalent and the required staff")
  @JsonProperty("overUnderFullTimeEquivalentCount")
  public List<Double> getOverUnderFullTimeEquivalentCount() {
    return overUnderFullTimeEquivalentCount;
  }
  public void setOverUnderFullTimeEquivalentCount(List<Double> overUnderFullTimeEquivalentCount) {
    this.overUnderFullTimeEquivalentCount = overUnderFullTimeEquivalentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanningPlanningGroupAllocation capacityPlanningPlanningGroupAllocation = (CapacityPlanningPlanningGroupAllocation) o;

    return Objects.equals(this.planningGroupId, capacityPlanningPlanningGroupAllocation.planningGroupId) &&
            Objects.equals(this.requiredStaffFullTimeEquivalentCount, capacityPlanningPlanningGroupAllocation.requiredStaffFullTimeEquivalentCount) &&
            Objects.equals(this.staffingGroupFullTimeEquivalentContributions, capacityPlanningPlanningGroupAllocation.staffingGroupFullTimeEquivalentContributions) &&
            Objects.equals(this.totalPlannedFullTimeEquivalentCount, capacityPlanningPlanningGroupAllocation.totalPlannedFullTimeEquivalentCount) &&
            Objects.equals(this.overUnderFullTimeEquivalentCount, capacityPlanningPlanningGroupAllocation.overUnderFullTimeEquivalentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, requiredStaffFullTimeEquivalentCount, staffingGroupFullTimeEquivalentContributions, totalPlannedFullTimeEquivalentCount, overUnderFullTimeEquivalentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanningPlanningGroupAllocation {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    requiredStaffFullTimeEquivalentCount: ").append(toIndentedString(requiredStaffFullTimeEquivalentCount)).append("\n");
    sb.append("    staffingGroupFullTimeEquivalentContributions: ").append(toIndentedString(staffingGroupFullTimeEquivalentContributions)).append("\n");
    sb.append("    totalPlannedFullTimeEquivalentCount: ").append(toIndentedString(totalPlannedFullTimeEquivalentCount)).append("\n");
    sb.append("    overUnderFullTimeEquivalentCount: ").append(toIndentedString(overUnderFullTimeEquivalentCount)).append("\n");
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

