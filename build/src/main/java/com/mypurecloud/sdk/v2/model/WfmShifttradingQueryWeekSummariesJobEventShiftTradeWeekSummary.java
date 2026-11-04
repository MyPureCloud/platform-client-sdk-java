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
import java.util.Date;

import java.io.Serializable;
/**
 * WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary
 */

public class WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary  implements Serializable {
  
  private Date weekDate = null;
  private Long initiatingMatchedCount = null;
  private Long crossWeekReceivingMatchedCount = null;

  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary weekDate(Date weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public Date getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(Date weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary initiatingMatchedCount(Long initiatingMatchedCount) {
    this.initiatingMatchedCount = initiatingMatchedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiatingMatchedCount")
  public Long getInitiatingMatchedCount() {
    return initiatingMatchedCount;
  }
  public void setInitiatingMatchedCount(Long initiatingMatchedCount) {
    this.initiatingMatchedCount = initiatingMatchedCount;
  }


  /**
   **/
  public WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary crossWeekReceivingMatchedCount(Long crossWeekReceivingMatchedCount) {
    this.crossWeekReceivingMatchedCount = crossWeekReceivingMatchedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("crossWeekReceivingMatchedCount")
  public Long getCrossWeekReceivingMatchedCount() {
    return crossWeekReceivingMatchedCount;
  }
  public void setCrossWeekReceivingMatchedCount(Long crossWeekReceivingMatchedCount) {
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
    WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary = (WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary) o;

    return Objects.equals(this.weekDate, wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary.weekDate) &&
            Objects.equals(this.initiatingMatchedCount, wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary.initiatingMatchedCount) &&
            Objects.equals(this.crossWeekReceivingMatchedCount, wfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary.crossWeekReceivingMatchedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, initiatingMatchedCount, crossWeekReceivingMatchedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingQueryWeekSummariesJobEventShiftTradeWeekSummary {\n");
    
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

