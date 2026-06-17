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
 * QueryEffectiveScheduleSetsRequest
 */

public class QueryEffectiveScheduleSetsRequest  implements Serializable {
  
  private LocalDate startDate = null;
  private Integer weekCount = null;

  public QueryEffectiveScheduleSetsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryEffectiveScheduleSetsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The start date for querying effective bids relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public QueryEffectiveScheduleSetsRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for querying effective bids relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * The number of weeks to query for effective bids
   **/
  public QueryEffectiveScheduleSetsRequest weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks to query for effective bids")
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
    QueryEffectiveScheduleSetsRequest queryEffectiveScheduleSetsRequest = (QueryEffectiveScheduleSetsRequest) o;

    return Objects.equals(this.startDate, queryEffectiveScheduleSetsRequest.startDate) &&
            Objects.equals(this.weekCount, queryEffectiveScheduleSetsRequest.weekCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, weekCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEffectiveScheduleSetsRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

