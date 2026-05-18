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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupAllocation
 */

public class StaffingGroupAllocation  implements Serializable {
  
  private String staffingGroupId = null;
  private List<Double> shrinkagePercentages = null;
  private List<Double> attritionPercentages = null;
  private List<Double> newHiresFullTimeEquivalentCount = null;
  private Double startingWeeklyFullTimeEquivalentCount = null;
  private List<String> planningGroupIds = null;
  private List<Double> baseStartingFullTimeEquivalentCount = null;
  private List<Double> attritionFullTimeEquivalentCount = null;
  private List<Double> staffingGroupPlannedFullTimeEquivalentCount = null;
  private List<Double> endOfMonthPlannedFullTimeEquivalentCount = null;
  private List<Double> shrinkageFullTimeEquivalentCount = null;
  private List<Double> netFullTimeEquivalentCount = null;
  private List<Double> extraTimeUnderTimeFullTimeEquivalentCount = null;
  private List<Double> transfersFullTimeEquivalentCount = null;

  public StaffingGroupAllocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shrinkagePercentages = new ArrayList<Double>();
      attritionPercentages = new ArrayList<Double>();
      newHiresFullTimeEquivalentCount = new ArrayList<Double>();
      planningGroupIds = new ArrayList<String>();
      baseStartingFullTimeEquivalentCount = new ArrayList<Double>();
      attritionFullTimeEquivalentCount = new ArrayList<Double>();
      staffingGroupPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      endOfMonthPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      shrinkageFullTimeEquivalentCount = new ArrayList<Double>();
      netFullTimeEquivalentCount = new ArrayList<Double>();
      extraTimeUnderTimeFullTimeEquivalentCount = new ArrayList<Double>();
      transfersFullTimeEquivalentCount = new ArrayList<Double>();
    }
  }

  public StaffingGroupAllocation(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shrinkagePercentages = new ArrayList<Double>();
      attritionPercentages = new ArrayList<Double>();
      newHiresFullTimeEquivalentCount = new ArrayList<Double>();
      planningGroupIds = new ArrayList<String>();
      baseStartingFullTimeEquivalentCount = new ArrayList<Double>();
      attritionFullTimeEquivalentCount = new ArrayList<Double>();
      staffingGroupPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      endOfMonthPlannedFullTimeEquivalentCount = new ArrayList<Double>();
      shrinkageFullTimeEquivalentCount = new ArrayList<Double>();
      netFullTimeEquivalentCount = new ArrayList<Double>();
      extraTimeUnderTimeFullTimeEquivalentCount = new ArrayList<Double>();
      transfersFullTimeEquivalentCount = new ArrayList<Double>();
    }
  }

  
  /**
   * The staffing group to which the result allocation belongs
   **/
  public StaffingGroupAllocation staffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The staffing group to which the result allocation belongs")
  @JsonProperty("staffingGroupId")
  public String getStaffingGroupId() {
    return staffingGroupId;
  }
  public void setStaffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
  }


  /**
   * The weekly projected shrinkage percentage of staffing group, in the scale of 0 - 100
   **/
  public StaffingGroupAllocation shrinkagePercentages(List<Double> shrinkagePercentages) {
    this.shrinkagePercentages = shrinkagePercentages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly projected shrinkage percentage of staffing group, in the scale of 0 - 100")
  @JsonProperty("shrinkagePercentages")
  public List<Double> getShrinkagePercentages() {
    return shrinkagePercentages;
  }
  public void setShrinkagePercentages(List<Double> shrinkagePercentages) {
    this.shrinkagePercentages = shrinkagePercentages;
  }


  /**
   * The weekly projected attrition percentage of the staffing group, in the scale of 0 - 100
   **/
  public StaffingGroupAllocation attritionPercentages(List<Double> attritionPercentages) {
    this.attritionPercentages = attritionPercentages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly projected attrition percentage of the staffing group, in the scale of 0 - 100")
  @JsonProperty("attritionPercentages")
  public List<Double> getAttritionPercentages() {
    return attritionPercentages;
  }
  public void setAttritionPercentages(List<Double> attritionPercentages) {
    this.attritionPercentages = attritionPercentages;
  }


  /**
   * The weekly projected full time equivalent agents of new hire agents added to the staffing group
   **/
  public StaffingGroupAllocation newHiresFullTimeEquivalentCount(List<Double> newHiresFullTimeEquivalentCount) {
    this.newHiresFullTimeEquivalentCount = newHiresFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly projected full time equivalent agents of new hire agents added to the staffing group")
  @JsonProperty("newHiresFullTimeEquivalentCount")
  public List<Double> getNewHiresFullTimeEquivalentCount() {
    return newHiresFullTimeEquivalentCount;
  }
  public void setNewHiresFullTimeEquivalentCount(List<Double> newHiresFullTimeEquivalentCount) {
    this.newHiresFullTimeEquivalentCount = newHiresFullTimeEquivalentCount;
  }


  /**
   * The weekly count of full time equivalent agents that can be used for the first week of the capacity plan
   **/
  public StaffingGroupAllocation startingWeeklyFullTimeEquivalentCount(Double startingWeeklyFullTimeEquivalentCount) {
    this.startingWeeklyFullTimeEquivalentCount = startingWeeklyFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly count of full time equivalent agents that can be used for the first week of the capacity plan")
  @JsonProperty("startingWeeklyFullTimeEquivalentCount")
  public Double getStartingWeeklyFullTimeEquivalentCount() {
    return startingWeeklyFullTimeEquivalentCount;
  }
  public void setStartingWeeklyFullTimeEquivalentCount(Double startingWeeklyFullTimeEquivalentCount) {
    this.startingWeeklyFullTimeEquivalentCount = startingWeeklyFullTimeEquivalentCount;
  }


  /**
   * The IDs of the planning groups associated with this staffing group
   **/
  public StaffingGroupAllocation planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the planning groups associated with this staffing group")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * The weekly calculated starting full time equivalent count
   **/
  public StaffingGroupAllocation baseStartingFullTimeEquivalentCount(List<Double> baseStartingFullTimeEquivalentCount) {
    this.baseStartingFullTimeEquivalentCount = baseStartingFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly calculated starting full time equivalent count")
  @JsonProperty("baseStartingFullTimeEquivalentCount")
  public List<Double> getBaseStartingFullTimeEquivalentCount() {
    return baseStartingFullTimeEquivalentCount;
  }
  public void setBaseStartingFullTimeEquivalentCount(List<Double> baseStartingFullTimeEquivalentCount) {
    this.baseStartingFullTimeEquivalentCount = baseStartingFullTimeEquivalentCount;
  }


  /**
   * The weekly projected attrition full time equivalent count
   **/
  public StaffingGroupAllocation attritionFullTimeEquivalentCount(List<Double> attritionFullTimeEquivalentCount) {
    this.attritionFullTimeEquivalentCount = attritionFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly projected attrition full time equivalent count")
  @JsonProperty("attritionFullTimeEquivalentCount")
  public List<Double> getAttritionFullTimeEquivalentCount() {
    return attritionFullTimeEquivalentCount;
  }
  public void setAttritionFullTimeEquivalentCount(List<Double> attritionFullTimeEquivalentCount) {
    this.attritionFullTimeEquivalentCount = attritionFullTimeEquivalentCount;
  }


  /**
   * The weekly calculated staffing group full time equivalent count
   **/
  public StaffingGroupAllocation staffingGroupPlannedFullTimeEquivalentCount(List<Double> staffingGroupPlannedFullTimeEquivalentCount) {
    this.staffingGroupPlannedFullTimeEquivalentCount = staffingGroupPlannedFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly calculated staffing group full time equivalent count")
  @JsonProperty("staffingGroupPlannedFullTimeEquivalentCount")
  public List<Double> getStaffingGroupPlannedFullTimeEquivalentCount() {
    return staffingGroupPlannedFullTimeEquivalentCount;
  }
  public void setStaffingGroupPlannedFullTimeEquivalentCount(List<Double> staffingGroupPlannedFullTimeEquivalentCount) {
    this.staffingGroupPlannedFullTimeEquivalentCount = staffingGroupPlannedFullTimeEquivalentCount;
  }


  /**
   * The end of month planned full time equivalent count of this staffing group
   **/
  public StaffingGroupAllocation endOfMonthPlannedFullTimeEquivalentCount(List<Double> endOfMonthPlannedFullTimeEquivalentCount) {
    this.endOfMonthPlannedFullTimeEquivalentCount = endOfMonthPlannedFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end of month planned full time equivalent count of this staffing group")
  @JsonProperty("endOfMonthPlannedFullTimeEquivalentCount")
  public List<Double> getEndOfMonthPlannedFullTimeEquivalentCount() {
    return endOfMonthPlannedFullTimeEquivalentCount;
  }
  public void setEndOfMonthPlannedFullTimeEquivalentCount(List<Double> endOfMonthPlannedFullTimeEquivalentCount) {
    this.endOfMonthPlannedFullTimeEquivalentCount = endOfMonthPlannedFullTimeEquivalentCount;
  }


  /**
   * The weekly projected shrinkage full time equivalent count of this staffing group
   **/
  public StaffingGroupAllocation shrinkageFullTimeEquivalentCount(List<Double> shrinkageFullTimeEquivalentCount) {
    this.shrinkageFullTimeEquivalentCount = shrinkageFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly projected shrinkage full time equivalent count of this staffing group")
  @JsonProperty("shrinkageFullTimeEquivalentCount")
  public List<Double> getShrinkageFullTimeEquivalentCount() {
    return shrinkageFullTimeEquivalentCount;
  }
  public void setShrinkageFullTimeEquivalentCount(List<Double> shrinkageFullTimeEquivalentCount) {
    this.shrinkageFullTimeEquivalentCount = shrinkageFullTimeEquivalentCount;
  }


  /**
   * The weekly net full time equivalent count of this staffing group
   **/
  public StaffingGroupAllocation netFullTimeEquivalentCount(List<Double> netFullTimeEquivalentCount) {
    this.netFullTimeEquivalentCount = netFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly net full time equivalent count of this staffing group")
  @JsonProperty("netFullTimeEquivalentCount")
  public List<Double> getNetFullTimeEquivalentCount() {
    return netFullTimeEquivalentCount;
  }
  public void setNetFullTimeEquivalentCount(List<Double> netFullTimeEquivalentCount) {
    this.netFullTimeEquivalentCount = netFullTimeEquivalentCount;
  }


  /**
   * The weekly projected extra or under full time equivalent to the staffing group
   **/
  public StaffingGroupAllocation extraTimeUnderTimeFullTimeEquivalentCount(List<Double> extraTimeUnderTimeFullTimeEquivalentCount) {
    this.extraTimeUnderTimeFullTimeEquivalentCount = extraTimeUnderTimeFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly projected extra or under full time equivalent to the staffing group")
  @JsonProperty("extraTimeUnderTimeFullTimeEquivalentCount")
  public List<Double> getExtraTimeUnderTimeFullTimeEquivalentCount() {
    return extraTimeUnderTimeFullTimeEquivalentCount;
  }
  public void setExtraTimeUnderTimeFullTimeEquivalentCount(List<Double> extraTimeUnderTimeFullTimeEquivalentCount) {
    this.extraTimeUnderTimeFullTimeEquivalentCount = extraTimeUnderTimeFullTimeEquivalentCount;
  }


  /**
   * The weekly projected full time equivalent transfers of agents into or out of this staffing group
   **/
  public StaffingGroupAllocation transfersFullTimeEquivalentCount(List<Double> transfersFullTimeEquivalentCount) {
    this.transfersFullTimeEquivalentCount = transfersFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly projected full time equivalent transfers of agents into or out of this staffing group")
  @JsonProperty("transfersFullTimeEquivalentCount")
  public List<Double> getTransfersFullTimeEquivalentCount() {
    return transfersFullTimeEquivalentCount;
  }
  public void setTransfersFullTimeEquivalentCount(List<Double> transfersFullTimeEquivalentCount) {
    this.transfersFullTimeEquivalentCount = transfersFullTimeEquivalentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupAllocation staffingGroupAllocation = (StaffingGroupAllocation) o;

    return Objects.equals(this.staffingGroupId, staffingGroupAllocation.staffingGroupId) &&
            Objects.equals(this.shrinkagePercentages, staffingGroupAllocation.shrinkagePercentages) &&
            Objects.equals(this.attritionPercentages, staffingGroupAllocation.attritionPercentages) &&
            Objects.equals(this.newHiresFullTimeEquivalentCount, staffingGroupAllocation.newHiresFullTimeEquivalentCount) &&
            Objects.equals(this.startingWeeklyFullTimeEquivalentCount, staffingGroupAllocation.startingWeeklyFullTimeEquivalentCount) &&
            Objects.equals(this.planningGroupIds, staffingGroupAllocation.planningGroupIds) &&
            Objects.equals(this.baseStartingFullTimeEquivalentCount, staffingGroupAllocation.baseStartingFullTimeEquivalentCount) &&
            Objects.equals(this.attritionFullTimeEquivalentCount, staffingGroupAllocation.attritionFullTimeEquivalentCount) &&
            Objects.equals(this.staffingGroupPlannedFullTimeEquivalentCount, staffingGroupAllocation.staffingGroupPlannedFullTimeEquivalentCount) &&
            Objects.equals(this.endOfMonthPlannedFullTimeEquivalentCount, staffingGroupAllocation.endOfMonthPlannedFullTimeEquivalentCount) &&
            Objects.equals(this.shrinkageFullTimeEquivalentCount, staffingGroupAllocation.shrinkageFullTimeEquivalentCount) &&
            Objects.equals(this.netFullTimeEquivalentCount, staffingGroupAllocation.netFullTimeEquivalentCount) &&
            Objects.equals(this.extraTimeUnderTimeFullTimeEquivalentCount, staffingGroupAllocation.extraTimeUnderTimeFullTimeEquivalentCount) &&
            Objects.equals(this.transfersFullTimeEquivalentCount, staffingGroupAllocation.transfersFullTimeEquivalentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, shrinkagePercentages, attritionPercentages, newHiresFullTimeEquivalentCount, startingWeeklyFullTimeEquivalentCount, planningGroupIds, baseStartingFullTimeEquivalentCount, attritionFullTimeEquivalentCount, staffingGroupPlannedFullTimeEquivalentCount, endOfMonthPlannedFullTimeEquivalentCount, shrinkageFullTimeEquivalentCount, netFullTimeEquivalentCount, extraTimeUnderTimeFullTimeEquivalentCount, transfersFullTimeEquivalentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupAllocation {\n");
    
    sb.append("    staffingGroupId: ").append(toIndentedString(staffingGroupId)).append("\n");
    sb.append("    shrinkagePercentages: ").append(toIndentedString(shrinkagePercentages)).append("\n");
    sb.append("    attritionPercentages: ").append(toIndentedString(attritionPercentages)).append("\n");
    sb.append("    newHiresFullTimeEquivalentCount: ").append(toIndentedString(newHiresFullTimeEquivalentCount)).append("\n");
    sb.append("    startingWeeklyFullTimeEquivalentCount: ").append(toIndentedString(startingWeeklyFullTimeEquivalentCount)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    baseStartingFullTimeEquivalentCount: ").append(toIndentedString(baseStartingFullTimeEquivalentCount)).append("\n");
    sb.append("    attritionFullTimeEquivalentCount: ").append(toIndentedString(attritionFullTimeEquivalentCount)).append("\n");
    sb.append("    staffingGroupPlannedFullTimeEquivalentCount: ").append(toIndentedString(staffingGroupPlannedFullTimeEquivalentCount)).append("\n");
    sb.append("    endOfMonthPlannedFullTimeEquivalentCount: ").append(toIndentedString(endOfMonthPlannedFullTimeEquivalentCount)).append("\n");
    sb.append("    shrinkageFullTimeEquivalentCount: ").append(toIndentedString(shrinkageFullTimeEquivalentCount)).append("\n");
    sb.append("    netFullTimeEquivalentCount: ").append(toIndentedString(netFullTimeEquivalentCount)).append("\n");
    sb.append("    extraTimeUnderTimeFullTimeEquivalentCount: ").append(toIndentedString(extraTimeUnderTimeFullTimeEquivalentCount)).append("\n");
    sb.append("    transfersFullTimeEquivalentCount: ").append(toIndentedString(transfersFullTimeEquivalentCount)).append("\n");
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

