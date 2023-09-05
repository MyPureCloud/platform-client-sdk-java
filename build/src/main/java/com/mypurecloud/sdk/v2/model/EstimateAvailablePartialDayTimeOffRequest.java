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
import java.util.Date;

import java.io.Serializable;
/**
 * EstimateAvailablePartialDayTimeOffRequest
 */

public class EstimateAvailablePartialDayTimeOffRequest  implements Serializable {
  
  private Date date = null;
  private Integer requestedDurationMinutes = null;

  
  /**
   * Start date-time in ISO-8601 format for partial day request
   **/
  public EstimateAvailablePartialDayTimeOffRequest date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date-time in ISO-8601 format for partial day request")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * A requested length of time off request in minutes. If the value is null, then the system will use activity code length setting
   **/
  public EstimateAvailablePartialDayTimeOffRequest requestedDurationMinutes(Integer requestedDurationMinutes) {
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
    EstimateAvailablePartialDayTimeOffRequest estimateAvailablePartialDayTimeOffRequest = (EstimateAvailablePartialDayTimeOffRequest) o;

    return Objects.equals(this.date, estimateAvailablePartialDayTimeOffRequest.date) &&
            Objects.equals(this.requestedDurationMinutes, estimateAvailablePartialDayTimeOffRequest.requestedDurationMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, requestedDurationMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailablePartialDayTimeOffRequest {\n");
    
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

