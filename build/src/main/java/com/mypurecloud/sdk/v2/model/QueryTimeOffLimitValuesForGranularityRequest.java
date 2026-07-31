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
import com.mypurecloud.sdk.v2.model.LocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryTimeOffLimitValuesForGranularityRequest
 */

public class QueryTimeOffLimitValuesForGranularityRequest  implements Serializable {
  
  private List<LocalDateRange> dateRanges = null;

  public QueryTimeOffLimitValuesForGranularityRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dateRanges = new ArrayList<LocalDateRange>();
    }
  }

  public QueryTimeOffLimitValuesForGranularityRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      dateRanges = new ArrayList<LocalDateRange>();
    }
  }

  
  /**
   * The date range to return time off limit, allocated and waitlisted minutes. Maximum allowed number of days in range in 366
   **/
  public QueryTimeOffLimitValuesForGranularityRequest dateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date range to return time off limit, allocated and waitlisted minutes. Maximum allowed number of days in range in 366")
  @JsonProperty("dateRanges")
  public List<LocalDateRange> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimeOffLimitValuesForGranularityRequest queryTimeOffLimitValuesForGranularityRequest = (QueryTimeOffLimitValuesForGranularityRequest) o;

    return Objects.equals(this.dateRanges, queryTimeOffLimitValuesForGranularityRequest.dateRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimeOffLimitValuesForGranularityRequest {\n");
    
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
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

