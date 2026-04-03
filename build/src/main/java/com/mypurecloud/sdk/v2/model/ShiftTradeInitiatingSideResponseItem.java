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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.ScheduleReferenceWithBusinessUnit;
import com.mypurecloud.sdk.v2.model.ShiftTradeShiftResponseItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShiftTradeInitiatingSideResponseItem
 */

public class ShiftTradeInitiatingSideResponseItem  implements Serializable {
  
  private UserReference user = null;
  private ManagementUnitReference managementUnit = null;
  private ScheduleReferenceWithBusinessUnit schedule = null;
  private ShiftTradeShiftResponseItem shift = null;

  public ShiftTradeInitiatingSideResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The user who initiated this trade
   **/
  public ShiftTradeInitiatingSideResponseItem user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who initiated this trade")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The management unit of the user who initiated this trade
   **/
  public ShiftTradeInitiatingSideResponseItem managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit of the user who initiated this trade")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * Associated schedule information for the initiating user
   **/
  public ShiftTradeInitiatingSideResponseItem schedule(ScheduleReferenceWithBusinessUnit schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Associated schedule information for the initiating user")
  @JsonProperty("schedule")
  public ScheduleReferenceWithBusinessUnit getSchedule() {
    return schedule;
  }
  public void setSchedule(ScheduleReferenceWithBusinessUnit schedule) {
    this.schedule = schedule;
  }


  /**
   * The shift offered for trade by the initiating user
   **/
  public ShiftTradeInitiatingSideResponseItem shift(ShiftTradeShiftResponseItem shift) {
    this.shift = shift;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift offered for trade by the initiating user")
  @JsonProperty("shift")
  public ShiftTradeShiftResponseItem getShift() {
    return shift;
  }
  public void setShift(ShiftTradeShiftResponseItem shift) {
    this.shift = shift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeInitiatingSideResponseItem shiftTradeInitiatingSideResponseItem = (ShiftTradeInitiatingSideResponseItem) o;

    return Objects.equals(this.user, shiftTradeInitiatingSideResponseItem.user) &&
            Objects.equals(this.managementUnit, shiftTradeInitiatingSideResponseItem.managementUnit) &&
            Objects.equals(this.schedule, shiftTradeInitiatingSideResponseItem.schedule) &&
            Objects.equals(this.shift, shiftTradeInitiatingSideResponseItem.shift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, managementUnit, schedule, shift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeInitiatingSideResponseItem {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
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

