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
import java.time.LocalDate;
import java.util.List;

import java.io.Serializable;
/**
 * QueryShiftTradeListJobRequest
 */

public class QueryShiftTradeListJobRequest  implements Serializable {
  
  private List<String> managementUnitIds = null;
  private List<LocalDate> weekDates = null;
  private List<String> userIds = null;

  public QueryShiftTradeListJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnitIds = new ArrayList<String>();
      weekDates = new ArrayList<LocalDate>();
      userIds = new ArrayList<String>();
    }
  }

  public QueryShiftTradeListJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      managementUnitIds = new ArrayList<String>();
      weekDates = new ArrayList<LocalDate>();
      userIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of management units from which to query shift trades
   **/
  public QueryShiftTradeListJobRequest managementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of management units from which to query shift trades")
  @JsonProperty("managementUnitIds")
  public List<String> getManagementUnitIds() {
    return managementUnitIds;
  }
  public void setManagementUnitIds(List<String> managementUnitIds) {
    this.managementUnitIds = managementUnitIds;
  }


  /**
   * The start week dates in which to query shift trades in the business unit time zone (yyyy-MM-dd format)
   **/
  public QueryShiftTradeListJobRequest weekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week dates in which to query shift trades in the business unit time zone (yyyy-MM-dd format)")
  @JsonProperty("weekDates")
  public List<LocalDate> getWeekDates() {
    return weekDates;
  }
  public void setWeekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
  }


  /**
   * The IDs of the users for whom to query trades
   **/
  public QueryShiftTradeListJobRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the users for whom to query trades")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryShiftTradeListJobRequest queryShiftTradeListJobRequest = (QueryShiftTradeListJobRequest) o;

    return Objects.equals(this.managementUnitIds, queryShiftTradeListJobRequest.managementUnitIds) &&
            Objects.equals(this.weekDates, queryShiftTradeListJobRequest.weekDates) &&
            Objects.equals(this.userIds, queryShiftTradeListJobRequest.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, weekDates, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryShiftTradeListJobRequest {\n");
    
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    weekDates: ").append(toIndentedString(weekDates)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

