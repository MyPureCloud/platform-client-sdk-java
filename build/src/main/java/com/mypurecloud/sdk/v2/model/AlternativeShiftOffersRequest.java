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
import com.mypurecloud.sdk.v2.model.AlternativeShiftScheduleLookup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * AlternativeShiftOffersRequest
 */

public class AlternativeShiftOffersRequest  implements Serializable {
  
  private AlternativeShiftScheduleLookup schedule = null;
  private LocalDate queryWeekDate = null;

  public AlternativeShiftOffersRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The existing schedule being used to find alternative shift offers
   **/
  public AlternativeShiftOffersRequest schedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The existing schedule being used to find alternative shift offers")
  @JsonProperty("schedule")
  public AlternativeShiftScheduleLookup getSchedule() {
    return schedule;
  }
  public void setSchedule(AlternativeShiftScheduleLookup schedule) {
    this.schedule = schedule;
  }


  /**
   * The start date for the week in this schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AlternativeShiftOffersRequest queryWeekDate(LocalDate queryWeekDate) {
    this.queryWeekDate = queryWeekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the week in this schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("queryWeekDate")
  public LocalDate getQueryWeekDate() {
    return queryWeekDate;
  }
  public void setQueryWeekDate(LocalDate queryWeekDate) {
    this.queryWeekDate = queryWeekDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeShiftOffersRequest alternativeShiftOffersRequest = (AlternativeShiftOffersRequest) o;

    return Objects.equals(this.schedule, alternativeShiftOffersRequest.schedule) &&
            Objects.equals(this.queryWeekDate, alternativeShiftOffersRequest.queryWeekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, queryWeekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftOffersRequest {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    queryWeekDate: ").append(toIndentedString(queryWeekDate)).append("\n");
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

