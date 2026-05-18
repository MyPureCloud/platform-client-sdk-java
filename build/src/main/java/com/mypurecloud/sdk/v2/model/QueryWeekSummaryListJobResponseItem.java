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
import com.mypurecloud.sdk.v2.model.ShiftTradeWeekSummaryResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryWeekSummaryListJobResponseItem
 */

public class QueryWeekSummaryListJobResponseItem  implements Serializable {
  
  private List<ShiftTradeWeekSummaryResponseItem> weeks = null;

  public QueryWeekSummaryListJobResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weeks = new ArrayList<ShiftTradeWeekSummaryResponseItem>();
    }
  }

  public QueryWeekSummaryListJobResponseItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      weeks = new ArrayList<ShiftTradeWeekSummaryResponseItem>();
    }
  }

  
  /**
   * Weekly summary counts of the trades for the requested weeks
   **/
  public QueryWeekSummaryListJobResponseItem weeks(List<ShiftTradeWeekSummaryResponseItem> weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Weekly summary counts of the trades for the requested weeks")
  @JsonProperty("weeks")
  public List<ShiftTradeWeekSummaryResponseItem> getWeeks() {
    return weeks;
  }
  public void setWeeks(List<ShiftTradeWeekSummaryResponseItem> weeks) {
    this.weeks = weeks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryWeekSummaryListJobResponseItem queryWeekSummaryListJobResponseItem = (QueryWeekSummaryListJobResponseItem) o;

    return Objects.equals(this.weeks, queryWeekSummaryListJobResponseItem.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryWeekSummaryListJobResponseItem {\n");
    
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
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

