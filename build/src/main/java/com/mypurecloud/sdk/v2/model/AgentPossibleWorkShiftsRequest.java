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

import java.io.Serializable;
/**
 * AgentPossibleWorkShiftsRequest
 */

public class AgentPossibleWorkShiftsRequest  implements Serializable {
  
  private LocalDate weekStartDate = null;
  private Integer weekCount = null;

  
  /**
   * Start date of requested effective work plan, day of week will be in line with business unit start day of week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AgentPossibleWorkShiftsRequest weekStartDate(LocalDate weekStartDate) {
    this.weekStartDate = weekStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date of requested effective work plan, day of week will be in line with business unit start day of week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekStartDate")
  public LocalDate getWeekStartDate() {
    return weekStartDate;
  }
  public void setWeekStartDate(LocalDate weekStartDate) {
    this.weekStartDate = weekStartDate;
  }


  /**
   * Number of weeks for which to return possible work shifts
   **/
  public AgentPossibleWorkShiftsRequest weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of weeks for which to return possible work shifts")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentPossibleWorkShiftsRequest agentPossibleWorkShiftsRequest = (AgentPossibleWorkShiftsRequest) o;

    return Objects.equals(this.weekStartDate, agentPossibleWorkShiftsRequest.weekStartDate) &&
            Objects.equals(this.weekCount, agentPossibleWorkShiftsRequest.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekStartDate, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentPossibleWorkShiftsRequest {\n");
    
    sb.append("    weekStartDate: ").append(toIndentedString(weekStartDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
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

