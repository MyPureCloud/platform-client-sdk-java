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

import java.io.Serializable;
/**
 * EstimateAvailableFullDayTimeOffRequest
 */

public class EstimateAvailableFullDayTimeOffRequest  implements Serializable {
  
  private LocalDate date = null;
  private Integer requestedDurationMinutes = null;

  public EstimateAvailableFullDayTimeOffRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public EstimateAvailableFullDayTimeOffRequest date(LocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * A requested length of time off request in minutes. If the value is null, then the system will use activity code length setting
   **/
  public EstimateAvailableFullDayTimeOffRequest requestedDurationMinutes(Integer requestedDurationMinutes) {
    this.requestedDurationMinutes = requestedDurationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A requested length of time off request in minutes. If the value is null, then the system will use activity code length setting")
  @JsonProperty("requestedDurationMinutes")
  public Integer getRequestedDurationMinutes() {
    return requestedDurationMinutes;
  }
  public void setRequestedDurationMinutes(Integer requestedDurationMinutes) {
    this.requestedDurationMinutes = requestedDurationMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateAvailableFullDayTimeOffRequest estimateAvailableFullDayTimeOffRequest = (EstimateAvailableFullDayTimeOffRequest) o;

    return Objects.equals(this.date, estimateAvailableFullDayTimeOffRequest.date) &&
            Objects.equals(this.requestedDurationMinutes, estimateAvailableFullDayTimeOffRequest.requestedDurationMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, requestedDurationMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailableFullDayTimeOffRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requestedDurationMinutes: ").append(toIndentedString(requestedDurationMinutes)).append("\n");
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

