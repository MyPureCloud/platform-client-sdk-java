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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuTimeOffLimitRange
 */

public class BuTimeOffLimitRange  implements Serializable {
  
  private LocalDate startDate = null;
  private List<Integer> limitMinutesPerDay = null;

  public BuTimeOffLimitRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      limitMinutesPerDay = new ArrayList<Integer>();
    }
  }

  
  /**
   * Start date of the range. The end date is determined by the size of 'limitMinutesPerDay'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuTimeOffLimitRange startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the range. The end date is determined by the size of 'limitMinutesPerDay'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * The list of time-off limit values in minutes per day. If 'null' is specified, then the day-specific value is cleared. Such a day will have a value of 0
   **/
  public BuTimeOffLimitRange limitMinutesPerDay(List<Integer> limitMinutesPerDay) {
    this.limitMinutesPerDay = limitMinutesPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of time-off limit values in minutes per day. If 'null' is specified, then the day-specific value is cleared. Such a day will have a value of 0")
  @JsonProperty("limitMinutesPerDay")
  public List<Integer> getLimitMinutesPerDay() {
    return limitMinutesPerDay;
  }
  public void setLimitMinutesPerDay(List<Integer> limitMinutesPerDay) {
    this.limitMinutesPerDay = limitMinutesPerDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuTimeOffLimitRange buTimeOffLimitRange = (BuTimeOffLimitRange) o;

    return Objects.equals(this.startDate, buTimeOffLimitRange.startDate) &&
            Objects.equals(this.limitMinutesPerDay, buTimeOffLimitRange.limitMinutesPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, limitMinutesPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuTimeOffLimitRange {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    limitMinutesPerDay: ").append(toIndentedString(limitMinutesPerDay)).append("\n");
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

