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
import com.mypurecloud.sdk.v2.model.ReceivingScheduleLookup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.List;

import java.io.Serializable;
/**
 * SearchUnmatchedShiftTradeListJobRequest
 */

public class SearchUnmatchedShiftTradeListJobRequest  implements Serializable {
  
  private List<String> managementUnitIds = null;
  private List<LocalDate> weekDates = null;
  private ReceivingScheduleLookup receivingSchedule = null;
  private List<String> receivingShiftIds = null;

  public SearchUnmatchedShiftTradeListJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnitIds = new ArrayList<String>();
      weekDates = new ArrayList<LocalDate>();
      receivingShiftIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of management units from which to query shift trades
   **/
  public SearchUnmatchedShiftTradeListJobRequest managementUnitIds(List<String> managementUnitIds) {
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
  public SearchUnmatchedShiftTradeListJobRequest weekDates(List<LocalDate> weekDates) {
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
   * Associated schedule information for the receiving user
   **/
  public SearchUnmatchedShiftTradeListJobRequest receivingSchedule(ReceivingScheduleLookup receivingSchedule) {
    this.receivingSchedule = receivingSchedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Associated schedule information for the receiving user")
  @JsonProperty("receivingSchedule")
  public ReceivingScheduleLookup getReceivingSchedule() {
    return receivingSchedule;
  }
  public void setReceivingSchedule(ReceivingScheduleLookup receivingSchedule) {
    this.receivingSchedule = receivingSchedule;
  }


  /**
   * The IDs of shifts that the receiving user would potentially be willing to trade. If empty, only returns one-sided trades
   **/
  public SearchUnmatchedShiftTradeListJobRequest receivingShiftIds(List<String> receivingShiftIds) {
    this.receivingShiftIds = receivingShiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of shifts that the receiving user would potentially be willing to trade. If empty, only returns one-sided trades")
  @JsonProperty("receivingShiftIds")
  public List<String> getReceivingShiftIds() {
    return receivingShiftIds;
  }
  public void setReceivingShiftIds(List<String> receivingShiftIds) {
    this.receivingShiftIds = receivingShiftIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUnmatchedShiftTradeListJobRequest searchUnmatchedShiftTradeListJobRequest = (SearchUnmatchedShiftTradeListJobRequest) o;

    return Objects.equals(this.managementUnitIds, searchUnmatchedShiftTradeListJobRequest.managementUnitIds) &&
            Objects.equals(this.weekDates, searchUnmatchedShiftTradeListJobRequest.weekDates) &&
            Objects.equals(this.receivingSchedule, searchUnmatchedShiftTradeListJobRequest.receivingSchedule) &&
            Objects.equals(this.receivingShiftIds, searchUnmatchedShiftTradeListJobRequest.receivingShiftIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitIds, weekDates, receivingSchedule, receivingShiftIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUnmatchedShiftTradeListJobRequest {\n");
    
    sb.append("    managementUnitIds: ").append(toIndentedString(managementUnitIds)).append("\n");
    sb.append("    weekDates: ").append(toIndentedString(weekDates)).append("\n");
    sb.append("    receivingSchedule: ").append(toIndentedString(receivingSchedule)).append("\n");
    sb.append("    receivingShiftIds: ").append(toIndentedString(receivingShiftIds)).append("\n");
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

