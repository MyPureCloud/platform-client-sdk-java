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
 * SchedulingPeriodBase
 */

public class SchedulingPeriodBase  implements Serializable {
  
  private LocalDate latestEndDate = null;

  public SchedulingPeriodBase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SchedulingPeriodBase(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The latest date the associated activity plan can end, in YYYY-MM-DD format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public SchedulingPeriodBase latestEndDate(LocalDate latestEndDate) {
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
    SchedulingPeriodBase schedulingPeriodBase = (SchedulingPeriodBase) o;

    return Objects.equals(this.latestEndDate, schedulingPeriodBase.latestEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingPeriodBase {\n");
    
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

