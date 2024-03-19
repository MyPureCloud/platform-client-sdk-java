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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateTimeOffPlanBusinessUnitAssociation
 */

public class UpdateTimeOffPlanBusinessUnitAssociation  implements Serializable {
  
  private SetWrapperString managementUnitIds = null;
  private SetWrapperString staffingGroupIds = null;

  
  /**
   * The IDs of management units to which this time-off plan applies. This must not be set if staffingGroupIds is populated
   **/
  public UpdateTimeOffPlanBusinessUnitAssociation managementUnitIds(SetWrapperString managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of management units to which this time-off plan applies. This must not be set if staffingGroupIds is populated")
  @JsonProperty("managementUnitIds")
  public SetWrapperString getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(SetWrapperString managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The IDs of staffing groups to which this time-off plan applies. This must not be set if managementUnitIds is populated
   **/
  public UpdateTimeOffPlanBusinessUnitAssociation staffingGroupIds(SetWrapperString staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of staffing groups to which this time-off plan applies. This must not be set if managementUnitIds is populated")
  @JsonProperty("staffingGroupIds")
  public SetWrapperString getStaffingGroupIds() {
    return staffingGroupIds;
  }
  public void setStaffingGroupIds(SetWrapperString staffingGroupIds) {
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
    UpdateTimeOffPlanBusinessUnitAssociation updateTimeOffPlanBusinessUnitAssociation = (UpdateTimeOffPlanBusinessUnitAssociation) o;

    return Objects.equals(this.managementUnitIds, updateTimeOffPlanBusinessUnitAssociation.managementUnitIds) &&
            Objects.equals(this.staffingGroupIds, updateTimeOffPlanBusinessUnitAssociation.staffingGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, staffingGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeOffPlanBusinessUnitAssociation {\n");
    
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

