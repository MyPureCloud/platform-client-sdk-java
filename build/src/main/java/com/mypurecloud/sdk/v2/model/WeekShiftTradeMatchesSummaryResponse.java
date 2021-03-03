package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * WeekShiftTradeMatchesSummaryResponse
 */

public class WeekShiftTradeMatchesSummaryResponse  implements Serializable {
  
  private LocalDate weekDate = null;
  private Integer count = null;

  
  /**
   * The schedule week date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WeekShiftTradeMatchesSummaryResponse weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule week date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The number of trades in the Matched state for the given week
   **/
  public WeekShiftTradeMatchesSummaryResponse count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of trades in the Matched state for the given week")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekShiftTradeMatchesSummaryResponse weekShiftTradeMatchesSummaryResponse = (WeekShiftTradeMatchesSummaryResponse) o;
    return Objects.equals(this.weekDate, weekShiftTradeMatchesSummaryResponse.weekDate) &&
        Objects.equals(this.count, weekShiftTradeMatchesSummaryResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekShiftTradeMatchesSummaryResponse {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

