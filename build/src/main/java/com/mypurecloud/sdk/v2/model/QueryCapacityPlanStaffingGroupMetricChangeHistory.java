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
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueryCapacityPlanStaffingGroupMetricChangeHistory
 */

public class QueryCapacityPlanStaffingGroupMetricChangeHistory  implements Serializable {
  
  private List<String> staffingGroupIds = null;
  private Date queryEndDate = null;

  public QueryCapacityPlanStaffingGroupMetricChangeHistory() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the staffing groups for which to fetch the metric change history
   **/
  public QueryCapacityPlanStaffingGroupMetricChangeHistory staffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the staffing groups for which to fetch the metric change history")
  @JsonProperty("staffingGroupIds")
  public List<String> getStaffingGroupIds() {
    return staffingGroupIds;
  }
  public void setStaffingGroupIds(List<String> staffingGroupIds) {
    this.staffingGroupIds = staffingGroupIds;
  }


  /**
   * Fetch the history of metric changes on or before this date, in IS0-8601 format. If not specified, sets to current date
   **/
  public QueryCapacityPlanStaffingGroupMetricChangeHistory queryEndDate(Date queryEndDate) {
    this.queryEndDate = queryEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fetch the history of metric changes on or before this date, in IS0-8601 format. If not specified, sets to current date")
  @JsonProperty("queryEndDate")
  public Date getQueryEndDate() {
    return queryEndDate;
  }
  public void setQueryEndDate(Date queryEndDate) {
    this.queryEndDate = queryEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCapacityPlanStaffingGroupMetricChangeHistory queryCapacityPlanStaffingGroupMetricChangeHistory = (QueryCapacityPlanStaffingGroupMetricChangeHistory) o;

    return Objects.equals(this.staffingGroupIds, queryCapacityPlanStaffingGroupMetricChangeHistory.staffingGroupIds) &&
            Objects.equals(this.queryEndDate, queryCapacityPlanStaffingGroupMetricChangeHistory.queryEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupIds, queryEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCapacityPlanStaffingGroupMetricChangeHistory {\n");
    
    sb.append("    staffingGroupIds: ").append(toIndentedString(staffingGroupIds)).append("\n");
    sb.append("    queryEndDate: ").append(toIndentedString(queryEndDate)).append("\n");
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

