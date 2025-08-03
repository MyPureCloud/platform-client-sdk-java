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
 * QueryPlanningGroupToStaffingGroupsRequest
 */

public class QueryPlanningGroupToStaffingGroupsRequest  implements Serializable {
  
  private List<String> planningGroupIds = null;
  private List<String> staffingGroupIds = null;

  public QueryPlanningGroupToStaffingGroupsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupIds = new ArrayList<String>();
      staffingGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The list of planning group IDs to request capacity group associations
   **/
  public QueryPlanningGroupToStaffingGroupsRequest planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of planning group IDs to request capacity group associations")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * The list of staffing group IDs to request capacity group associations
   **/
  public QueryPlanningGroupToStaffingGroupsRequest staffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of staffing group IDs to request capacity group associations")
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
    QueryPlanningGroupToStaffingGroupsRequest queryPlanningGroupToStaffingGroupsRequest = (QueryPlanningGroupToStaffingGroupsRequest) o;

    return Objects.equals(this.planningGroupIds, queryPlanningGroupToStaffingGroupsRequest.planningGroupIds) &&
            Objects.equals(this.staffingGroupIds, queryPlanningGroupToStaffingGroupsRequest.staffingGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupIds, staffingGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryPlanningGroupToStaffingGroupsRequest {\n");
    
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
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

