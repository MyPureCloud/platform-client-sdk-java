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
import java.util.List;

import java.io.Serializable;
/**
 * QueryAgentShiftTradeListJobRequest
 */

public class QueryAgentShiftTradeListJobRequest  implements Serializable {
  
  private List<LocalDate> weekDates = null;

  public QueryAgentShiftTradeListJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weekDates = new ArrayList<LocalDate>();
    }
  }

  
  /**
   * The start week dates in which to query shift trades in the business unit time zone (yyyy-MM-dd format)
   **/
  public QueryAgentShiftTradeListJobRequest weekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start week dates in which to query shift trades in the business unit time zone (yyyy-MM-dd format)")
  @JsonProperty("weekDates")
  public List<LocalDate> getWeekDates() {
    return weekDates;
  }
  public void setWeekDates(List<LocalDate> weekDates) {
    this.weekDates = weekDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAgentShiftTradeListJobRequest queryAgentShiftTradeListJobRequest = (QueryAgentShiftTradeListJobRequest) o;

    return Objects.equals(this.weekDates, queryAgentShiftTradeListJobRequest.weekDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAgentShiftTradeListJobRequest {\n");
    
    sb.append("    weekDates: ").append(toIndentedString(weekDates)).append("\n");
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

