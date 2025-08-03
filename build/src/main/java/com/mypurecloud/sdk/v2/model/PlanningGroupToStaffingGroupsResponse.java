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
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import com.mypurecloud.sdk.v2.model.StaffingGroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * PlanningGroupToStaffingGroupsResponse
 */

public class PlanningGroupToStaffingGroupsResponse  implements Serializable {
  
  private PlanningGroupReference planningGroup = null;
  private List<StaffingGroupReference> staffingGroups = null;

  public PlanningGroupToStaffingGroupsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroups = new ArrayList<StaffingGroupReference>();
    }
  }

  
  /**
   * The ID of the planning group
   **/
  public PlanningGroupToStaffingGroupsResponse planningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group")
  @JsonProperty("planningGroup")
  public PlanningGroupReference getPlanningGroup() {
    return planningGroup;
  }
  public void setPlanningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
  }


  /**
   * The list of staffing groups that are associated with the planning group
   **/
  public PlanningGroupToStaffingGroupsResponse staffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of staffing groups that are associated with the planning group")
  @JsonProperty("staffingGroups")
  public List<StaffingGroupReference> getStaffingGroups() {
    return staffingGroups;
  }
  public void setStaffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningGroupToStaffingGroupsResponse planningGroupToStaffingGroupsResponse = (PlanningGroupToStaffingGroupsResponse) o;

    return Objects.equals(this.planningGroup, planningGroupToStaffingGroupsResponse.planningGroup) &&
            Objects.equals(this.staffingGroups, planningGroupToStaffingGroupsResponse.staffingGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroup, staffingGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroupToStaffingGroupsResponse {\n");
    
    sb.append("    planningGroup: ").append(toIndentedString(planningGroup)).append("\n");
    sb.append("    staffingGroups: ").append(toIndentedString(staffingGroups)).append("\n");
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

