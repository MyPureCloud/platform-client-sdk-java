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
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventWeekSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmShiftTradingJobCompleteEventWeekSummaryList
 */

public class WfmShiftTradingJobCompleteEventWeekSummaryList  implements Serializable {
  
  private List<WfmShiftTradingJobCompleteEventWeekSummary> weeks = null;

  public WfmShiftTradingJobCompleteEventWeekSummaryList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weeks = new ArrayList<WfmShiftTradingJobCompleteEventWeekSummary>();
    }
  }

  
  /**
   **/
  public WfmShiftTradingJobCompleteEventWeekSummaryList weeks(List<WfmShiftTradingJobCompleteEventWeekSummary> weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weeks")
  public List<WfmShiftTradingJobCompleteEventWeekSummary> getWeeks() {
    return weeks;
  }
  public void setWeeks(List<WfmShiftTradingJobCompleteEventWeekSummary> weeks) {
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
    WfmShiftTradingJobCompleteEventWeekSummaryList wfmShiftTradingJobCompleteEventWeekSummaryList = (WfmShiftTradingJobCompleteEventWeekSummaryList) o;

    return Objects.equals(this.weeks, wfmShiftTradingJobCompleteEventWeekSummaryList.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShiftTradingJobCompleteEventWeekSummaryList {\n");
    
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

