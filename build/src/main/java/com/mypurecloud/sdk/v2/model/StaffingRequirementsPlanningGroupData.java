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
 * StaffingRequirementsPlanningGroupData
 */

public class StaffingRequirementsPlanningGroupData  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> staffingRequirementsPerInterval = null;

  public StaffingRequirementsPlanningGroupData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingRequirementsPerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * The ID of the planning group to which this data applies
   **/
  public StaffingRequirementsPlanningGroupData planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which this data applies")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * Staffing requirements per interval for this week forecast
   **/
  public StaffingRequirementsPlanningGroupData staffingRequirementsPerInterval(List<Double> staffingRequirementsPerInterval) {
    this.staffingRequirementsPerInterval = staffingRequirementsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Staffing requirements per interval for this week forecast")
  @JsonProperty("staffingRequirementsPerInterval")
  public List<Double> getStaffingRequirementsPerInterval() {
    return staffingRequirementsPerInterval;
  }
  public void setStaffingRequirementsPerInterval(List<Double> staffingRequirementsPerInterval) {
    this.staffingRequirementsPerInterval = staffingRequirementsPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingRequirementsPlanningGroupData staffingRequirementsPlanningGroupData = (StaffingRequirementsPlanningGroupData) o;

    return Objects.equals(this.planningGroupId, staffingRequirementsPlanningGroupData.planningGroupId) &&
            Objects.equals(this.staffingRequirementsPerInterval, staffingRequirementsPlanningGroupData.staffingRequirementsPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, staffingRequirementsPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingRequirementsPlanningGroupData {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    staffingRequirementsPerInterval: ").append(toIndentedString(staffingRequirementsPerInterval)).append("\n");
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

