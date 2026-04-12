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

import java.io.Serializable;
/**
 * WfmShiftTradingJobCompleteEventTradeShift
 */

public class WfmShiftTradingJobCompleteEventTradeShift  implements Serializable {
  
  private String scheduleId = null;
  private String scheduleStartDate = null;
  private String managementUnitId = null;
  private String id = null;
  private String startDate = null;
  private String endDate = null;
  private String weekDate = null;

  public WfmShiftTradingJobCompleteEventTradeShift() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleId")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift scheduleStartDate(String scheduleStartDate) {
    this.scheduleStartDate = scheduleStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleStartDate")
  public String getScheduleStartDate() {
    return scheduleStartDate;
  }
  public void setScheduleStartDate(String scheduleStartDate) {
    this.scheduleStartDate = scheduleStartDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventTradeShift weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShiftTradingJobCompleteEventTradeShift wfmShiftTradingJobCompleteEventTradeShift = (WfmShiftTradingJobCompleteEventTradeShift) o;

    return Objects.equals(this.scheduleId, wfmShiftTradingJobCompleteEventTradeShift.scheduleId) &&
            Objects.equals(this.scheduleStartDate, wfmShiftTradingJobCompleteEventTradeShift.scheduleStartDate) &&
            Objects.equals(this.managementUnitId, wfmShiftTradingJobCompleteEventTradeShift.managementUnitId) &&
            Objects.equals(this.id, wfmShiftTradingJobCompleteEventTradeShift.id) &&
            Objects.equals(this.startDate, wfmShiftTradingJobCompleteEventTradeShift.startDate) &&
            Objects.equals(this.endDate, wfmShiftTradingJobCompleteEventTradeShift.endDate) &&
            Objects.equals(this.weekDate, wfmShiftTradingJobCompleteEventTradeShift.weekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, scheduleStartDate, managementUnitId, id, startDate, endDate, weekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShiftTradingJobCompleteEventTradeShift {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    scheduleStartDate: ").append(toIndentedString(scheduleStartDate)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
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

