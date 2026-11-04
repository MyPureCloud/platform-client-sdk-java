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
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventBuScheduleReference;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventManagementUnit;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventShiftTradeShift;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide
 */

public class WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide  implements Serializable {
  
  private WfmShifttradingAddTradeJobEventUserReference user = null;
  private WfmShifttradingAddTradeJobEventManagementUnit managementUnit = null;
  private WfmShifttradingAddTradeJobEventBuScheduleReference schedule = null;
  private WfmShifttradingAddTradeJobEventShiftTradeShift shift = null;
  private String reviewNote = null;

  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide user(WfmShifttradingAddTradeJobEventUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmShifttradingAddTradeJobEventUserReference getUser() {
    return user;
  }
  public void setUser(WfmShifttradingAddTradeJobEventUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide managementUnit(WfmShifttradingAddTradeJobEventManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managementUnit")
  public WfmShifttradingAddTradeJobEventManagementUnit getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(WfmShifttradingAddTradeJobEventManagementUnit managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide schedule(WfmShifttradingAddTradeJobEventBuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WfmShifttradingAddTradeJobEventBuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(WfmShifttradingAddTradeJobEventBuScheduleReference schedule) {
    this.schedule = schedule;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide shift(WfmShifttradingAddTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shift")
  public WfmShifttradingAddTradeJobEventShiftTradeShift getShift() {
    return shift;
  }
  public void setShift(WfmShifttradingAddTradeJobEventShiftTradeShift shift) {
    this.shift = shift;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide reviewNote(String reviewNote) {
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
    WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide = (WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide) o;

    return Objects.equals(this.user, wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide.user) &&
            Objects.equals(this.managementUnit, wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide.managementUnit) &&
            Objects.equals(this.schedule, wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide.schedule) &&
            Objects.equals(this.shift, wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide.shift) &&
            Objects.equals(this.reviewNote, wfmShifttradingAddTradeJobEventShiftTradeInitiatingSide.reviewNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnit, schedule, shift, reviewNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide {\n");
    
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

