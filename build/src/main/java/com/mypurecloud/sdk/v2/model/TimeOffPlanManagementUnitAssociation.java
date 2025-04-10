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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.StaffingGroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffPlanManagementUnitAssociation
 */

public class TimeOffPlanManagementUnitAssociation  implements Serializable {
  
  private ManagementUnitReference managementUnit = null;
  private List<StaffingGroupReference> staffingGroups = null;

  public TimeOffPlanManagementUnitAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroups = new ArrayList<StaffingGroupReference>();
    }
  }

  
  /**
   * Management unit to which this time-off plan belongs
   **/
  public TimeOffPlanManagementUnitAssociation managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Management unit to which this time-off plan belongs")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * Staffing groups to which this time-off plan applies. If not defined, the plan applies to the management unit
   **/
  public TimeOffPlanManagementUnitAssociation staffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Staffing groups to which this time-off plan applies. If not defined, the plan applies to the management unit")
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
    TimeOffPlanManagementUnitAssociation timeOffPlanManagementUnitAssociation = (TimeOffPlanManagementUnitAssociation) o;

    return Objects.equals(this.managementUnit, timeOffPlanManagementUnitAssociation.managementUnit) &&
            Objects.equals(this.staffingGroups, timeOffPlanManagementUnitAssociation.staffingGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, staffingGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffPlanManagementUnitAssociation {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
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

