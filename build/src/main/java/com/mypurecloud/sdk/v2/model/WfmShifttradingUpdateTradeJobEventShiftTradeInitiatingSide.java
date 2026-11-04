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
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventBuScheduleReference;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventShiftTradeShift;
import com.mypurecloud.sdk.v2.model.WfmShifttradingUpdateTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide
 */

public class WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide  implements Serializable {
  
  private WfmShifttradingUpdateTradeJobEventUserReference user = null;
  private WfmShifttradingUpdateTradeJobEventManagementUnit managementUnit = null;
  private WfmShifttradingUpdateTradeJobEventBuScheduleReference schedule = null;
  private WfmShifttradingUpdateTradeJobEventShiftTradeShift shift = null;
  private String reviewNote = null;

  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide user(WfmShifttradingUpdateTradeJobEventUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmShifttradingUpdateTradeJobEventUserReference getUser() {
    return user;
  }
  public void setUser(WfmShifttradingUpdateTradeJobEventUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide managementUnit(WfmShifttradingUpdateTradeJobEventManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnit")
  public WfmShifttradingUpdateTradeJobEventManagementUnit getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(WfmShifttradingUpdateTradeJobEventManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide schedule(WfmShifttradingUpdateTradeJobEventBuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WfmShifttradingUpdateTradeJobEventBuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(WfmShifttradingUpdateTradeJobEventBuScheduleReference schedule) {
    this.schedule = schedule;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide shift(WfmShifttradingUpdateTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shift")
  public WfmShifttradingUpdateTradeJobEventShiftTradeShift getShift() {
    return shift;
  }
  public void setShift(WfmShifttradingUpdateTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
  }


  /**
   **/
  public WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide reviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reviewNote")
  public String getReviewNote() {
    return reviewNote;
  }
  public void setReviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide = (WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide) o;

    return Objects.equals(this.user, wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide.user) &&
            Objects.equals(this.managementUnit, wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide.managementUnit) &&
            Objects.equals(this.schedule, wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide.schedule) &&
            Objects.equals(this.shift, wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide.shift) &&
            Objects.equals(this.reviewNote, wfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide.reviewNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnit, schedule, shift, reviewNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
    sb.append("    reviewNote: ").append(toIndentedString(reviewNote)).append("\n");
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

