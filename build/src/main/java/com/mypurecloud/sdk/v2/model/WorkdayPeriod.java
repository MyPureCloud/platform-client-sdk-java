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
 * WorkdayPeriod
 */

public class WorkdayPeriod  implements Serializable {
  
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;

  public WorkdayPeriod() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WorkdayPeriod dateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }
  public void setDateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
  }


  /**
   * End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WorkdayPeriod dateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }
  public void setDateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkdayPeriod workdayPeriod = (WorkdayPeriod) o;

    return Objects.equals(this.dateStartWorkday, workdayPeriod.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, workdayPeriod.dateEndWorkday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStartWorkday, dateEndWorkday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkdayPeriod {\n");
    
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
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

