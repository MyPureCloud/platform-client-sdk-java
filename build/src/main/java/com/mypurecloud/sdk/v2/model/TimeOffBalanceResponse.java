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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffBalanceResponse
 */

public class TimeOffBalanceResponse  implements Serializable {
  
  private String activityCodeId = null;
  private String hrisTimeOffTypeId = null;
  private String hrisTimeOffTypeSecondaryId = null;
  private LocalDate startDate = null;
  private List<Integer> balanceMinutesPerDay = new ArrayList<Integer>();

  
  /**
   * The ID for activity code associated with time off balance
   **/
  public TimeOffBalanceResponse activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID for activity code associated with time off balance")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * The ID of the time off type configured in HRIS integration
   **/
  public TimeOffBalanceResponse hrisTimeOffTypeId(String hrisTimeOffTypeId) {
    this.hrisTimeOffTypeId = hrisTimeOffTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the time off type configured in HRIS integration")
  @JsonProperty("hrisTimeOffTypeId")
  public String getHrisTimeOffTypeId() {
    return hrisTimeOffTypeId;
  }
  public void setHrisTimeOffTypeId(String hrisTimeOffTypeId) {
    this.hrisTimeOffTypeId = hrisTimeOffTypeId;
  }


  /**
   * The secondary ID of the time off type configured in HRIS integration
   **/
  public TimeOffBalanceResponse hrisTimeOffTypeSecondaryId(String hrisTimeOffTypeSecondaryId) {
    this.hrisTimeOffTypeSecondaryId = hrisTimeOffTypeSecondaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary ID of the time off type configured in HRIS integration")
  @JsonProperty("hrisTimeOffTypeSecondaryId")
  public String getHrisTimeOffTypeSecondaryId() {
    return hrisTimeOffTypeSecondaryId;
  }
  public void setHrisTimeOffTypeSecondaryId(String hrisTimeOffTypeSecondaryId) {
    this.hrisTimeOffTypeSecondaryId = hrisTimeOffTypeSecondaryId;
  }


  /**
   * The Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public TimeOffBalanceResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Start date of the requested date range. The end date is determined by the size of interval list. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * The list of available time off balance values in minutes for each day
   **/
  public TimeOffBalanceResponse balanceMinutesPerDay(List<Integer> balanceMinutesPerDay) {
    this.balanceMinutesPerDay = balanceMinutesPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of available time off balance values in minutes for each day")
  @JsonProperty("balanceMinutesPerDay")
  public List<Integer> getBalanceMinutesPerDay() {
    return balanceMinutesPerDay;
  }
  public void setBalanceMinutesPerDay(List<Integer> balanceMinutesPerDay) {
    this.balanceMinutesPerDay = balanceMinutesPerDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffBalanceResponse timeOffBalanceResponse = (TimeOffBalanceResponse) o;

    return Objects.equals(this.activityCodeId, timeOffBalanceResponse.activityCodeId) &&
            Objects.equals(this.hrisTimeOffTypeId, timeOffBalanceResponse.hrisTimeOffTypeId) &&
            Objects.equals(this.hrisTimeOffTypeSecondaryId, timeOffBalanceResponse.hrisTimeOffTypeSecondaryId) &&
            Objects.equals(this.startDate, timeOffBalanceResponse.startDate) &&
            Objects.equals(this.balanceMinutesPerDay, timeOffBalanceResponse.balanceMinutesPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, hrisTimeOffTypeId, hrisTimeOffTypeSecondaryId, startDate, balanceMinutesPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalanceResponse {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    hrisTimeOffTypeId: ").append(toIndentedString(hrisTimeOffTypeId)).append("\n");
    sb.append("    hrisTimeOffTypeSecondaryId: ").append(toIndentedString(hrisTimeOffTypeSecondaryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    balanceMinutesPerDay: ").append(toIndentedString(balanceMinutesPerDay)).append("\n");
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

