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
 * SchedulingPeriod
 */

public class SchedulingPeriod  implements Serializable {
  
  private LocalDate earliestStartDate = null;
  private LocalDate latestEndDate = null;

  public SchedulingPeriod() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The earliest date the associated activity plan can begin, in YYYY-MM-DD format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public SchedulingPeriod earliestStartDate(LocalDate earliestStartDate) {
    this.earliestStartDate = earliestStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The earliest date the associated activity plan can begin, in YYYY-MM-DD format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("earliestStartDate")
  public LocalDate getEarliestStartDate() {
    return earliestStartDate;
  }
  public void setEarliestStartDate(LocalDate earliestStartDate) {
    this.earliestStartDate = earliestStartDate;
  }


  /**
   * The latest date the associated activity plan can end, in YYYY-MM-DD format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public SchedulingPeriod latestEndDate(LocalDate latestEndDate) {
    this.latestEndDate = latestEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The latest date the associated activity plan can end, in YYYY-MM-DD format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("latestEndDate")
  public LocalDate getLatestEndDate() {
    return latestEndDate;
  }
  public void setLatestEndDate(LocalDate latestEndDate) {
    this.latestEndDate = latestEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingPeriod schedulingPeriod = (SchedulingPeriod) o;

    return Objects.equals(this.earliestStartDate, schedulingPeriod.earliestStartDate) &&
            Objects.equals(this.latestEndDate, schedulingPeriod.latestEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStartDate, latestEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingPeriod {\n");
    
    sb.append("    earliestStartDate: ").append(toIndentedString(earliestStartDate)).append("\n");
    sb.append("    latestEndDate: ").append(toIndentedString(latestEndDate)).append("\n");
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

