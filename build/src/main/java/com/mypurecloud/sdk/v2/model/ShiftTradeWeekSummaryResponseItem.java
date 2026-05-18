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
 * ShiftTradeWeekSummaryResponseItem
 */

public class ShiftTradeWeekSummaryResponseItem  implements Serializable {
  
  private LocalDate weekDate = null;
  private Integer initiatingMatchedCount = null;
  private Integer crossWeekReceivingMatchedCount = null;

  public ShiftTradeWeekSummaryResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ShiftTradeWeekSummaryResponseItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The schedule week date in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ShiftTradeWeekSummaryResponseItem weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule week date in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * The number of trades in the 'Matched' state with the initiating shift in the given week
   **/
  public ShiftTradeWeekSummaryResponseItem initiatingMatchedCount(Integer initiatingMatchedCount) {
    this.initiatingMatchedCount = initiatingMatchedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of trades in the 'Matched' state with the initiating shift in the given week")
  @JsonProperty("initiatingMatchedCount")
  public Integer getInitiatingMatchedCount() {
    return initiatingMatchedCount;
  }
  public void setInitiatingMatchedCount(Integer initiatingMatchedCount) {
    this.initiatingMatchedCount = initiatingMatchedCount;
  }


  /**
   * The number of cross-week trades in the 'Matched' state with the receiving shift for the given week
   **/
  public ShiftTradeWeekSummaryResponseItem crossWeekReceivingMatchedCount(Integer crossWeekReceivingMatchedCount) {
    this.crossWeekReceivingMatchedCount = crossWeekReceivingMatchedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of cross-week trades in the 'Matched' state with the receiving shift for the given week")
  @JsonProperty("crossWeekReceivingMatchedCount")
  public Integer getCrossWeekReceivingMatchedCount() {
    return crossWeekReceivingMatchedCount;
  }
  public void setCrossWeekReceivingMatchedCount(Integer crossWeekReceivingMatchedCount) {
    this.crossWeekReceivingMatchedCount = crossWeekReceivingMatchedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeWeekSummaryResponseItem shiftTradeWeekSummaryResponseItem = (ShiftTradeWeekSummaryResponseItem) o;

    return Objects.equals(this.weekDate, shiftTradeWeekSummaryResponseItem.weekDate) &&
            Objects.equals(this.initiatingMatchedCount, shiftTradeWeekSummaryResponseItem.initiatingMatchedCount) &&
            Objects.equals(this.crossWeekReceivingMatchedCount, shiftTradeWeekSummaryResponseItem.crossWeekReceivingMatchedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, initiatingMatchedCount, crossWeekReceivingMatchedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeWeekSummaryResponseItem {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    initiatingMatchedCount: ").append(toIndentedString(initiatingMatchedCount)).append("\n");
    sb.append("    crossWeekReceivingMatchedCount: ").append(toIndentedString(crossWeekReceivingMatchedCount)).append("\n");
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

