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
import com.mypurecloud.sdk.v2.model.TimeOffLimitValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuTimeOffLimitValues
 */

public class BuTimeOffLimitValues  implements Serializable {
  
  private LocalDate startDate = null;
  private TimeOffLimitValues valuesPerDay = null;
  private TimeOffLimitValues valuesPerFifteenMinutes = null;

  public BuTimeOffLimitValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuTimeOffLimitValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists
   **/
  public BuTimeOffLimitValues startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * Time-off limit values specified in per day granularity. Set only if granularity is 'Daily'
   **/
  public BuTimeOffLimitValues valuesPerDay(TimeOffLimitValues valuesPerDay) {
    this.valuesPerDay = valuesPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time-off limit values specified in per day granularity. Set only if granularity is 'Daily'")
  @JsonProperty("valuesPerDay")
  public TimeOffLimitValues getValuesPerDay() {
    return valuesPerDay;
  }
  public void setValuesPerDay(TimeOffLimitValues valuesPerDay) {
    this.valuesPerDay = valuesPerDay;
  }


  /**
   * Time-off limit values specified in per fifteen minutes granularity. Set only if granularity is 'FifteenMinutes'
   **/
  public BuTimeOffLimitValues valuesPerFifteenMinutes(TimeOffLimitValues valuesPerFifteenMinutes) {
    this.valuesPerFifteenMinutes = valuesPerFifteenMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time-off limit values specified in per fifteen minutes granularity. Set only if granularity is 'FifteenMinutes'")
  @JsonProperty("valuesPerFifteenMinutes")
  public TimeOffLimitValues getValuesPerFifteenMinutes() {
    return valuesPerFifteenMinutes;
  }
  public void setValuesPerFifteenMinutes(TimeOffLimitValues valuesPerFifteenMinutes) {
    this.valuesPerFifteenMinutes = valuesPerFifteenMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuTimeOffLimitValues buTimeOffLimitValues = (BuTimeOffLimitValues) o;

    return Objects.equals(this.startDate, buTimeOffLimitValues.startDate) &&
            Objects.equals(this.valuesPerDay, buTimeOffLimitValues.valuesPerDay) &&
            Objects.equals(this.valuesPerFifteenMinutes, buTimeOffLimitValues.valuesPerFifteenMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, valuesPerDay, valuesPerFifteenMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuTimeOffLimitValues {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    valuesPerDay: ").append(toIndentedString(valuesPerDay)).append("\n");
    sb.append("    valuesPerFifteenMinutes: ").append(toIndentedString(valuesPerFifteenMinutes)).append("\n");
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

