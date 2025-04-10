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
import java.util.List;

import java.io.Serializable;
/**
 * CreateTimeOffPlanBusinessUnitAssociation
 */

public class CreateTimeOffPlanBusinessUnitAssociation  implements Serializable {
  
  private List<String> managementUnitIds = null;
  private List<String> staffingGroupIds = null;

  public CreateTimeOffPlanBusinessUnitAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnitIds = new ArrayList<String>();
      staffingGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of management units to which this time-off plan applies. This must not be set if staffingGroupIds is populated
   **/
  public CreateTimeOffPlanBusinessUnitAssociation managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of management units to which this time-off plan applies. This must not be set if staffingGroupIds is populated")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The IDs of staffing groups to which this time-off plan applies. This must not be set if managementUnitIds is populated
   **/
  public CreateTimeOffPlanBusinessUnitAssociation staffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of staffing groups to which this time-off plan applies. This must not be set if managementUnitIds is populated")
  @JsonProperty("staffingGroupIds")
  public List<String> getStaffingGroupIds() {
    return staffingGroupIds;
  }
  public void setStaffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeOffPlanBusinessUnitAssociation createTimeOffPlanBusinessUnitAssociation = (CreateTimeOffPlanBusinessUnitAssociation) o;

    return Objects.equals(this.managementUnitIds, createTimeOffPlanBusinessUnitAssociation.managementUnitIds) &&
            Objects.equals(this.staffingGroupIds, createTimeOffPlanBusinessUnitAssociation.staffingGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, staffingGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOffPlanBusinessUnitAssociation {\n");
    
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    staffingGroupIds: ").append(toIndentedString(staffingGroupIds)).append("\n");
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

