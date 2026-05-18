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
import com.mypurecloud.sdk.v2.model.CapacityPlanMetricsSummary;
import com.mypurecloud.sdk.v2.model.CapacityPlanningPlanningGroupAllocation;
import com.mypurecloud.sdk.v2.model.StaffingGroupAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupAllocationsResponseTemplate
 */

public class StaffingGroupAllocationsResponseTemplate  implements Serializable {
  
  private List<StaffingGroupAllocation> staffingGroupAllocations = null;
  private List<YearMonth> months = null;
  private List<CapacityPlanningPlanningGroupAllocation> planningGroupAllocations = null;
  private CapacityPlanMetricsSummary capacityPlanMetricsSummary = null;

  public StaffingGroupAllocationsResponseTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroupAllocations = new ArrayList<StaffingGroupAllocation>();
      months = new ArrayList<YearMonth>();
      planningGroupAllocations = new ArrayList<CapacityPlanningPlanningGroupAllocation>();
    }
  }

  public StaffingGroupAllocationsResponseTemplate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      staffingGroupAllocations = new ArrayList<StaffingGroupAllocation>();
      months = new ArrayList<YearMonth>();
      planningGroupAllocations = new ArrayList<CapacityPlanningPlanningGroupAllocation>();
    }
  }

  
  /**
   * List of staffing group allocations
   **/
  public StaffingGroupAllocationsResponseTemplate staffingGroupAllocations(List<StaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of staffing group allocations")
  @JsonProperty("staffingGroupAllocations")
  public List<StaffingGroupAllocation> getStaffingGroupAllocations() {
    return staffingGroupAllocations;
  }
  public void setStaffingGroupAllocations(List<StaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
  }


  /**
   * The list of months covered by this capacity plan, formatted as yyyy-MM
   **/
  public StaffingGroupAllocationsResponseTemplate months(List<YearMonth> months) {
    this.months = months;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of months covered by this capacity plan, formatted as yyyy-MM")
  @JsonProperty("months")
  public List<YearMonth> getMonths() {
    return months;
  }
  public void setMonths(List<YearMonth> months) {
    this.months = months;
  }


  /**
   * The planning group allocations
   **/
  public StaffingGroupAllocationsResponseTemplate planningGroupAllocations(List<CapacityPlanningPlanningGroupAllocation> planningGroupAllocations) {
    this.planningGroupAllocations = planningGroupAllocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group allocations")
  @JsonProperty("planningGroupAllocations")
  public List<CapacityPlanningPlanningGroupAllocation> getPlanningGroupAllocations() {
    return planningGroupAllocations;
  }
  public void setPlanningGroupAllocations(List<CapacityPlanningPlanningGroupAllocation> planningGroupAllocations) {
    this.planningGroupAllocations = planningGroupAllocations;
  }


  /**
   * The total summary of staffing allocation metrics for this capacity plan, for the selected granularity
   **/
  public StaffingGroupAllocationsResponseTemplate capacityPlanMetricsSummary(CapacityPlanMetricsSummary capacityPlanMetricsSummary) {
    this.capacityPlanMetricsSummary = capacityPlanMetricsSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total summary of staffing allocation metrics for this capacity plan, for the selected granularity")
  @JsonProperty("capacityPlanMetricsSummary")
  public CapacityPlanMetricsSummary getCapacityPlanMetricsSummary() {
    return capacityPlanMetricsSummary;
  }
  public void setCapacityPlanMetricsSummary(CapacityPlanMetricsSummary capacityPlanMetricsSummary) {
    this.capacityPlanMetricsSummary = capacityPlanMetricsSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupAllocationsResponseTemplate staffingGroupAllocationsResponseTemplate = (StaffingGroupAllocationsResponseTemplate) o;

    return Objects.equals(this.staffingGroupAllocations, staffingGroupAllocationsResponseTemplate.staffingGroupAllocations) &&
            Objects.equals(this.months, staffingGroupAllocationsResponseTemplate.months) &&
            Objects.equals(this.planningGroupAllocations, staffingGroupAllocationsResponseTemplate.planningGroupAllocations) &&
            Objects.equals(this.capacityPlanMetricsSummary, staffingGroupAllocationsResponseTemplate.capacityPlanMetricsSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupAllocations, months, planningGroupAllocations, capacityPlanMetricsSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupAllocationsResponseTemplate {\n");
    
    sb.append("    staffingGroupAllocations: ").append(toIndentedString(staffingGroupAllocations)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    planningGroupAllocations: ").append(toIndentedString(planningGroupAllocations)).append("\n");
    sb.append("    capacityPlanMetricsSummary: ").append(toIndentedString(capacityPlanMetricsSummary)).append("\n");
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

