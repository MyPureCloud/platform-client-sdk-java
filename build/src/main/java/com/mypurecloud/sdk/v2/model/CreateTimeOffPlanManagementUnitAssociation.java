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
 * CreateTimeOffPlanManagementUnitAssociation
 */

public class CreateTimeOffPlanManagementUnitAssociation  implements Serializable {
  
  private String managementUnitId = null;
  private List<String> staffingGroupIds = null;

  public CreateTimeOffPlanManagementUnitAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The ID of the management unit to which this time-off plan belongs
   **/
  public CreateTimeOffPlanManagementUnitAssociation managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the management unit to which this time-off plan belongs")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * A IDs of staffing groups to which this time-off plan applies. If not defined, the plan is applied to the management unit
   **/
  public CreateTimeOffPlanManagementUnitAssociation staffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A IDs of staffing groups to which this time-off plan applies. If not defined, the plan is applied to the management unit")
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
    CreateTimeOffPlanManagementUnitAssociation createTimeOffPlanManagementUnitAssociation = (CreateTimeOffPlanManagementUnitAssociation) o;

    return Objects.equals(this.managementUnitId, createTimeOffPlanManagementUnitAssociation.managementUnitId) &&
            Objects.equals(this.staffingGroupIds, createTimeOffPlanManagementUnitAssociation.staffingGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitId, staffingGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOffPlanManagementUnitAssociation {\n");
    
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
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

