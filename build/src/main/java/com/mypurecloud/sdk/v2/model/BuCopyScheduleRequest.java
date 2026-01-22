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
 * BuCopyScheduleRequest
 */

public class BuCopyScheduleRequest  implements Serializable {
  
  private String description = null;
  private LocalDate weekDate = null;
  private Boolean includeForecast = null;

  public BuCopyScheduleRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The description for the new schedule
   **/
  public BuCopyScheduleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description for the new schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The start weekDate for the new copy of the schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuCopyScheduleRequest weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start weekDate for the new copy of the schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * Whether to include the forecast while copying the schedule
   **/
  public BuCopyScheduleRequest includeForecast(Boolean includeForecast) {
    this.includeForecast = includeForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to include the forecast while copying the schedule")
  @JsonProperty("includeForecast")
  public Boolean getIncludeForecast() {
    return includeForecast;
  }
  public void setIncludeForecast(Boolean includeForecast) {
    this.includeForecast = includeForecast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuCopyScheduleRequest buCopyScheduleRequest = (BuCopyScheduleRequest) o;

    return Objects.equals(this.description, buCopyScheduleRequest.description) &&
            Objects.equals(this.weekDate, buCopyScheduleRequest.weekDate) &&
            Objects.equals(this.includeForecast, buCopyScheduleRequest.includeForecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, weekDate, includeForecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuCopyScheduleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    includeForecast: ").append(toIndentedString(includeForecast)).append("\n");
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

