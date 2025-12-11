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
 * StaffingGroupFullTimeEquivalentContribution
 */

public class StaffingGroupFullTimeEquivalentContribution  implements Serializable {
  
  private String staffingGroupId = null;
  private List<Double> plannedFullTimeEquivalentContribution = null;

  public StaffingGroupFullTimeEquivalentContribution() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      plannedFullTimeEquivalentContribution = new ArrayList<Double>();
    }
  }

  
  /**
   * The staffing group ID receiving full time equivalent agents from the planning group
   **/
  public StaffingGroupFullTimeEquivalentContribution staffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The staffing group ID receiving full time equivalent agents from the planning group")
  @JsonProperty("staffingGroupId")
  public String getStaffingGroupId() {
    return staffingGroupId;
  }
  public void setStaffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
  }


  /**
   * The weekly planned full time contribution from the planning group to this staffing group
   **/
  public StaffingGroupFullTimeEquivalentContribution plannedFullTimeEquivalentContribution(List<Double> plannedFullTimeEquivalentContribution) {
    this.plannedFullTimeEquivalentContribution = plannedFullTimeEquivalentContribution;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly planned full time contribution from the planning group to this staffing group")
  @JsonProperty("plannedFullTimeEquivalentContribution")
  public List<Double> getPlannedFullTimeEquivalentContribution() {
    return plannedFullTimeEquivalentContribution;
  }
  public void setPlannedFullTimeEquivalentContribution(List<Double> plannedFullTimeEquivalentContribution) {
    this.plannedFullTimeEquivalentContribution = plannedFullTimeEquivalentContribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupFullTimeEquivalentContribution staffingGroupFullTimeEquivalentContribution = (StaffingGroupFullTimeEquivalentContribution) o;

    return Objects.equals(this.staffingGroupId, staffingGroupFullTimeEquivalentContribution.staffingGroupId) &&
            Objects.equals(this.plannedFullTimeEquivalentContribution, staffingGroupFullTimeEquivalentContribution.plannedFullTimeEquivalentContribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, plannedFullTimeEquivalentContribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupFullTimeEquivalentContribution {\n");
    
    sb.append("    staffingGroupId: ").append(toIndentedString(staffingGroupId)).append("\n");
    sb.append("    plannedFullTimeEquivalentContribution: ").append(toIndentedString(plannedFullTimeEquivalentContribution)).append("\n");
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

