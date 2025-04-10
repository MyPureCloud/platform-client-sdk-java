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
 * TimeOffPlanBusinessUnitAssociation
 */

public class TimeOffPlanBusinessUnitAssociation  implements Serializable {
  
  private List<ManagementUnitReference> managementUnits = null;
  private List<StaffingGroupReference> staffingGroups = null;

  public TimeOffPlanBusinessUnitAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnits = new ArrayList<ManagementUnitReference>();
      staffingGroups = new ArrayList<StaffingGroupReference>();
    }
  }

  
  /**
   * Management units to which this time-off plan applies. This must not be set if staffingGroups is populated
   **/
  public TimeOffPlanBusinessUnitAssociation managementUnits(List<ManagementUnitReference> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Management units to which this time-off plan applies. This must not be set if staffingGroups is populated")
  @JsonProperty("managementUnits")
  public List<ManagementUnitReference> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<ManagementUnitReference> managementUnits) {
    this.managementUnits = managementUnits;
  }


  /**
   * Staffing groups to which this time-off plan applies. This must not be set if managementUnits is populated
   **/
  public TimeOffPlanBusinessUnitAssociation staffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Staffing groups to which this time-off plan applies. This must not be set if managementUnits is populated")
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
    TimeOffPlanBusinessUnitAssociation timeOffPlanBusinessUnitAssociation = (TimeOffPlanBusinessUnitAssociation) o;

    return Objects.equals(this.managementUnits, timeOffPlanBusinessUnitAssociation.managementUnits) &&
            Objects.equals(this.staffingGroups, timeOffPlanBusinessUnitAssociation.staffingGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnits, staffingGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffPlanBusinessUnitAssociation {\n");
    
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
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

