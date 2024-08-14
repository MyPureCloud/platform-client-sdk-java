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
import com.mypurecloud.sdk.v2.model.AlternativeShiftScheduleLookup;
import com.mypurecloud.sdk.v2.model.InitiatingAlternativeShift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AlternativeShiftSearchOffersRequest
 */

public class AlternativeShiftSearchOffersRequest  implements Serializable {
  
  private AlternativeShiftScheduleLookup schedule = null;
  private LocalDate queryWeekDate = null;
  private InitiatingAlternativeShift initiatingShift = null;
  private List<String> acceptableIntervals = new ArrayList<String>();

  
  /**
   * The existing schedule being used to find alternative shift offers
   **/
  public AlternativeShiftSearchOffersRequest schedule(AlternativeShiftScheduleLookup schedule) {
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
  public AlternativeShiftSearchOffersRequest queryWeekDate(LocalDate queryWeekDate) {
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


  /**
   * The shift a user puts up for alternative shift offers
   **/
  public AlternativeShiftSearchOffersRequest initiatingShift(InitiatingAlternativeShift initiatingShift) {
    this.initiatingShift = initiatingShift;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift a user puts up for alternative shift offers")
  @JsonProperty("initiatingShift")
  public InitiatingAlternativeShift getInitiatingShift() {
    return initiatingShift;
  }
  public void setInitiatingShift(InitiatingAlternativeShift initiatingShift) {
    this.initiatingShift = initiatingShift;
  }


  /**
   * The acceptable intervals in offers. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AlternativeShiftSearchOffersRequest acceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The acceptable intervals in offers. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("acceptableIntervals")
  public List<String> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeShiftSearchOffersRequest alternativeShiftSearchOffersRequest = (AlternativeShiftSearchOffersRequest) o;

    return Objects.equals(this.schedule, alternativeShiftSearchOffersRequest.schedule) &&
            Objects.equals(this.queryWeekDate, alternativeShiftSearchOffersRequest.queryWeekDate) &&
            Objects.equals(this.initiatingShift, alternativeShiftSearchOffersRequest.initiatingShift) &&
            Objects.equals(this.acceptableIntervals, alternativeShiftSearchOffersRequest.acceptableIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, queryWeekDate, initiatingShift, acceptableIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftSearchOffersRequest {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    queryWeekDate: ").append(toIndentedString(queryWeekDate)).append("\n");
    sb.append("    initiatingShift: ").append(toIndentedString(initiatingShift)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
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

