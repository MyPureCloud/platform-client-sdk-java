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
import com.mypurecloud.sdk.v2.model.LocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffBalanceRequest
 */

public class TimeOffBalanceRequest  implements Serializable {
  
  private List<String> activityCodeIds = null;
  private List<LocalDateRange> dateRanges = null;

  public TimeOffBalanceRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activityCodeIds = new ArrayList<String>();
      dateRanges = new ArrayList<LocalDateRange>();
    }
  }

  
  /**
   * The set of activity code IDs for which to query available time off balances
   **/
  public TimeOffBalanceRequest activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of activity code IDs for which to query available time off balances")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }


  /**
   * The list of date ranges for which to query time off balance
   **/
  public TimeOffBalanceRequest dateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of date ranges for which to query time off balance")
  @JsonProperty("dateRanges")
  public List<LocalDateRange> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffBalanceRequest timeOffBalanceRequest = (TimeOffBalanceRequest) o;

    return Objects.equals(this.activityCodeIds, timeOffBalanceRequest.activityCodeIds) &&
            Objects.equals(this.dateRanges, timeOffBalanceRequest.dateRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeIds, dateRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalanceRequest {\n");
    
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
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

