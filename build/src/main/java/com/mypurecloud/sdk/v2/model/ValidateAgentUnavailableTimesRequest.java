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
import com.mypurecloud.sdk.v2.model.UpdateUnavailableTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ValidateAgentUnavailableTimesRequest
 */

public class ValidateAgentUnavailableTimesRequest  implements Serializable {
  
  private LocalDate validationWeekDate = null;
  private List<UpdateUnavailableTime> unavailableTimes = null;

  public ValidateAgentUnavailableTimesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      unavailableTimes = new ArrayList<UpdateUnavailableTime>();
    }
  }

  
  /**
   * The ID of the week to validate. Must correspond to the start day of week of the business unit to which the agent belongs in the format YYYY-MM-dd. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ValidateAgentUnavailableTimesRequest validationWeekDate(LocalDate validationWeekDate) {
    this.validationWeekDate = validationWeekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the week to validate. Must correspond to the start day of week of the business unit to which the agent belongs in the format YYYY-MM-dd. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("validationWeekDate")
  public LocalDate getValidationWeekDate() {
    return validationWeekDate;
  }
  public void setValidationWeekDate(LocalDate validationWeekDate) {
    this.validationWeekDate = validationWeekDate;
  }


  /**
   * Proposed changes to agent's unavailable time spans to be validated
   **/
  public ValidateAgentUnavailableTimesRequest unavailableTimes(List<UpdateUnavailableTime> unavailableTimes) {
    this.unavailableTimes = unavailableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Proposed changes to agent's unavailable time spans to be validated")
  @JsonProperty("unavailableTimes")
  public List<UpdateUnavailableTime> getUnavailableTimes() {
    return unavailableTimes;
  }
  public void setUnavailableTimes(List<UpdateUnavailableTime> unavailableTimes) {
    this.unavailableTimes = unavailableTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAgentUnavailableTimesRequest validateAgentUnavailableTimesRequest = (ValidateAgentUnavailableTimesRequest) o;

    return Objects.equals(this.validationWeekDate, validateAgentUnavailableTimesRequest.validationWeekDate) &&
            Objects.equals(this.unavailableTimes, validateAgentUnavailableTimesRequest.unavailableTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationWeekDate, unavailableTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAgentUnavailableTimesRequest {\n");
    
    sb.append("    validationWeekDate: ").append(toIndentedString(validationWeekDate)).append("\n");
    sb.append("    unavailableTimes: ").append(toIndentedString(unavailableTimes)).append("\n");
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

