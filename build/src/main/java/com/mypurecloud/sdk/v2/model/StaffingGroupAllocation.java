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

  public StaffingGroupAllocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shrinkagePercentages = new ArrayList<Double>();
      attritionPercentages = new ArrayList<Double>();
      newHiresFullTimeEquivalentCount = new ArrayList<Double>();
      planningGroupIds = new ArrayList<String>();
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
            Objects.equals(this.planningGroupIds, staffingGroupAllocation.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, shrinkagePercentages, attritionPercentages, newHiresFullTimeEquivalentCount, startingWeeklyFullTimeEquivalentCount, planningGroupIds);
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

