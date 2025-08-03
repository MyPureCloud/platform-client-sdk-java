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

import java.io.Serializable;
/**
 * CreateStaffingGroupAllocation
 */

public class CreateStaffingGroupAllocation  implements Serializable {
  
  private String staffingGroupId = null;
  private Double initialShrinkagePercentage = null;
  private Double initialAttritionPercentage = null;
  private Double startingWeeklyFullTimeEquivalentCount = null;

  public CreateStaffingGroupAllocation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the staffing group used in this capacity plan
   **/
  public CreateStaffingGroupAllocation staffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the staffing group used in this capacity plan")
  @JsonProperty("staffingGroupId")
  public String getStaffingGroupId() {
    return staffingGroupId;
  }
  public void setStaffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
  }


  /**
   * The shrinkage percentage of the staffing group that can be used for all weeks in the planning period, in the scale of 0 - 100
   **/
  public CreateStaffingGroupAllocation initialShrinkagePercentage(Double initialShrinkagePercentage) {
    this.initialShrinkagePercentage = initialShrinkagePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shrinkage percentage of the staffing group that can be used for all weeks in the planning period, in the scale of 0 - 100")
  @JsonProperty("initialShrinkagePercentage")
  public Double getInitialShrinkagePercentage() {
    return initialShrinkagePercentage;
  }
  public void setInitialShrinkagePercentage(Double initialShrinkagePercentage) {
    this.initialShrinkagePercentage = initialShrinkagePercentage;
  }


  /**
   * The attrition percentage of the staffing group that can be used for all weeks in the planning period, in the scale of 0 - 100
   **/
  public CreateStaffingGroupAllocation initialAttritionPercentage(Double initialAttritionPercentage) {
    this.initialAttritionPercentage = initialAttritionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attrition percentage of the staffing group that can be used for all weeks in the planning period, in the scale of 0 - 100")
  @JsonProperty("initialAttritionPercentage")
  public Double getInitialAttritionPercentage() {
    return initialAttritionPercentage;
  }
  public void setInitialAttritionPercentage(Double initialAttritionPercentage) {
    this.initialAttritionPercentage = initialAttritionPercentage;
  }


  /**
   * The weekly count of full time equivalent agents in the staffing group that can be used for the first week of the planning period
   **/
  public CreateStaffingGroupAllocation startingWeeklyFullTimeEquivalentCount(Double startingWeeklyFullTimeEquivalentCount) {
    this.startingWeeklyFullTimeEquivalentCount = startingWeeklyFullTimeEquivalentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly count of full time equivalent agents in the staffing group that can be used for the first week of the planning period")
  @JsonProperty("startingWeeklyFullTimeEquivalentCount")
  public Double getStartingWeeklyFullTimeEquivalentCount() {
    return startingWeeklyFullTimeEquivalentCount;
  }
  public void setStartingWeeklyFullTimeEquivalentCount(Double startingWeeklyFullTimeEquivalentCount) {
    this.startingWeeklyFullTimeEquivalentCount = startingWeeklyFullTimeEquivalentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStaffingGroupAllocation createStaffingGroupAllocation = (CreateStaffingGroupAllocation) o;

    return Objects.equals(this.staffingGroupId, createStaffingGroupAllocation.staffingGroupId) &&
            Objects.equals(this.initialShrinkagePercentage, createStaffingGroupAllocation.initialShrinkagePercentage) &&
            Objects.equals(this.initialAttritionPercentage, createStaffingGroupAllocation.initialAttritionPercentage) &&
            Objects.equals(this.startingWeeklyFullTimeEquivalentCount, createStaffingGroupAllocation.startingWeeklyFullTimeEquivalentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, initialShrinkagePercentage, initialAttritionPercentage, startingWeeklyFullTimeEquivalentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStaffingGroupAllocation {\n");
    
    sb.append("    staffingGroupId: ").append(toIndentedString(staffingGroupId)).append("\n");
    sb.append("    initialShrinkagePercentage: ").append(toIndentedString(initialShrinkagePercentage)).append("\n");
    sb.append("    initialAttritionPercentage: ").append(toIndentedString(initialAttritionPercentage)).append("\n");
    sb.append("    startingWeeklyFullTimeEquivalentCount: ").append(toIndentedString(startingWeeklyFullTimeEquivalentCount)).append("\n");
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

