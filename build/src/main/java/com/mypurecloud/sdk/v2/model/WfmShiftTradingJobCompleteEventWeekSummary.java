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

import java.io.Serializable;
/**
 * WfmShiftTradingJobCompleteEventWeekSummary
 */

public class WfmShiftTradingJobCompleteEventWeekSummary  implements Serializable {
  
  private String weekDate = null;
  private Long initiatingMatchedCount = null;
  private Long crossWeekReceivingMatchedCount = null;

  public WfmShiftTradingJobCompleteEventWeekSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmShiftTradingJobCompleteEventWeekSummary weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventWeekSummary initiatingMatchedCount(Long initiatingMatchedCount) {
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
  public WfmShiftTradingJobCompleteEventWeekSummary crossWeekReceivingMatchedCount(Long crossWeekReceivingMatchedCount) {
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
    WfmShiftTradingJobCompleteEventWeekSummary wfmShiftTradingJobCompleteEventWeekSummary = (WfmShiftTradingJobCompleteEventWeekSummary) o;

    return Objects.equals(this.weekDate, wfmShiftTradingJobCompleteEventWeekSummary.weekDate) &&
            Objects.equals(this.initiatingMatchedCount, wfmShiftTradingJobCompleteEventWeekSummary.initiatingMatchedCount) &&
            Objects.equals(this.crossWeekReceivingMatchedCount, wfmShiftTradingJobCompleteEventWeekSummary.crossWeekReceivingMatchedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, initiatingMatchedCount, crossWeekReceivingMatchedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShiftTradingJobCompleteEventWeekSummary {\n");
    
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

