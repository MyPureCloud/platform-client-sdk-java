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
import java.util.Date;

import java.io.Serializable;
/**
 * ScheduleVisibilityRange
 */

public class ScheduleVisibilityRange  implements Serializable {
  
  private Date endDate = null;
  private LocalDate endBusinessUnitDate = null;

  public ScheduleVisibilityRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleVisibilityRange(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The schedule visibility end time in ISO-8601, the schedule is visible up to (but not including) that exact time)
   **/
  public ScheduleVisibilityRange endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule visibility end time in ISO-8601, the schedule is visible up to (but not including) that exact time)")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The schedule visibility end date interpreted in the business unit time zone in yyyy-MM-dd format, the schedule is visible up to (but not including) that exact date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ScheduleVisibilityRange endBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule visibility end date interpreted in the business unit time zone in yyyy-MM-dd format, the schedule is visible up to (but not including) that exact date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endBusinessUnitDate")
  public LocalDate getEndBusinessUnitDate() {
    return endBusinessUnitDate;
  }
  public void setEndBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleVisibilityRange scheduleVisibilityRange = (ScheduleVisibilityRange) o;

    return Objects.equals(this.endDate, scheduleVisibilityRange.endDate) &&
            Objects.equals(this.endBusinessUnitDate, scheduleVisibilityRange.endBusinessUnitDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, endBusinessUnitDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleVisibilityRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
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

