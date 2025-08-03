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
import com.mypurecloud.sdk.v2.model.StaffingGroupAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupAllocationsResponseTemplate
 */

public class StaffingGroupAllocationsResponseTemplate  implements Serializable {
  
  private List<StaffingGroupAllocation> staffingGroupAllocations = null;

  public StaffingGroupAllocationsResponseTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroupAllocations = new ArrayList<StaffingGroupAllocation>();
    }
  }

  
  /**
   * List of staffing group allocations
   **/
  public StaffingGroupAllocationsResponseTemplate staffingGroupAllocations(List<StaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of staffing group allocations")
  @JsonProperty("staffingGroupAllocations")
  public List<StaffingGroupAllocation> getStaffingGroupAllocations() {
    return staffingGroupAllocations;
  }
  public void setStaffingGroupAllocations(List<StaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupAllocationsResponseTemplate staffingGroupAllocationsResponseTemplate = (StaffingGroupAllocationsResponseTemplate) o;

    return Objects.equals(this.staffingGroupAllocations, staffingGroupAllocationsResponseTemplate.staffingGroupAllocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupAllocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupAllocationsResponseTemplate {\n");
    
    sb.append("    staffingGroupAllocations: ").append(toIndentedString(staffingGroupAllocations)).append("\n");
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

