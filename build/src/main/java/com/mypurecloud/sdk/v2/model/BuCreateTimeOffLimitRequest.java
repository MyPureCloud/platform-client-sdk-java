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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuCreateTimeOffLimitRequest
 */

public class BuCreateTimeOffLimitRequest  implements Serializable {
  
  private String staffingGroupId = null;
  private String managementUnitId = null;

  
  /**
   * The ID of the staffing group to which this time-off limit is associated. It can be either management unit or business unit level staffing group. One of managementUnitId or staffingGroupId must be set. This must not be set if managementUnitId has value
   **/
  public BuCreateTimeOffLimitRequest staffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the staffing group to which this time-off limit is associated. It can be either management unit or business unit level staffing group. One of managementUnitId or staffingGroupId must be set. This must not be set if managementUnitId has value")
  @JsonProperty("staffingGroupId")
  public String getStaffingGroupId() {
    return staffingGroupId;
  }
  public void setStaffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
  }


  /**
   * The ID of the management unit to which this time-off limit is associated. One of managementUnitId or staffingGroupId must be set. This must not be set if staffingGroupId has value
   **/
  public BuCreateTimeOffLimitRequest managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the management unit to which this time-off limit is associated. One of managementUnitId or staffingGroupId must be set. This must not be set if staffingGroupId has value")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuCreateTimeOffLimitRequest buCreateTimeOffLimitRequest = (BuCreateTimeOffLimitRequest) o;

    return Objects.equals(this.staffingGroupId, buCreateTimeOffLimitRequest.staffingGroupId) &&
            Objects.equals(this.managementUnitId, buCreateTimeOffLimitRequest.managementUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, managementUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuCreateTimeOffLimitRequest {\n");
    
    sb.append("    staffingGroupId: ").append(toIndentedString(staffingGroupId)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
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

