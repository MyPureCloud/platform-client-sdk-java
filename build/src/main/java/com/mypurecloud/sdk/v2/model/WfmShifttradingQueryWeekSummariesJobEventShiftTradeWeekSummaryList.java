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
import com.mypurecloud.sdk.v2.model.WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList
 */

public class WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList  implements Serializable {
  
  private List<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary> weeks = null;

  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weeks = new ArrayList<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary>();
    }
  }

  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      weeks = new ArrayList<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary>();
    }
  }

  
  /**
   **/
  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList weeks(List<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary> weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weeks")
  public List<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary> getWeeks() {
    return weeks;
  }
  public void setWeeks(List<WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary> weeks) {
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
    WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList = (WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList) o;

    return Objects.equals(this.weeks, wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummaryList {\n");
    
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

