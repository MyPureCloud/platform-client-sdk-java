package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AvailableTimeOffRequest
 */

public class AvailableTimeOffRequest  implements Serializable {
  
  private String activityCodeId = null;
  private List<LocalDateRange> dateRanges = new ArrayList<LocalDateRange>();

  
  /**
   * The ID for activity code to query available time off minutes
   **/
  public AvailableTimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID for activity code to query available time off minutes")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * A list of date ranges of available time off minutes.
   **/
  public AvailableTimeOffRequest dateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of date ranges of available time off minutes.")
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
    AvailableTimeOffRequest availableTimeOffRequest = (AvailableTimeOffRequest) o;
    return Objects.equals(this.activityCodeId, availableTimeOffRequest.activityCodeId) &&
        Objects.equals(this.dateRanges, availableTimeOffRequest.dateRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, dateRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTimeOffRequest {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
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

