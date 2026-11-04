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
 * WfmShifttradingAddTradeJobEventShiftTradeShift
 */

public class WfmShifttradingAddTradeJobEventShiftTradeShift  implements Serializable {
  
  private String id = null;
  private Date startDate = null;
  private Date endDate = null;
  private Date weekDate = null;

  public WfmShifttradingAddTradeJobEventShiftTradeShift() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingAddTradeJobEventShiftTradeShift(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeShift id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeShift startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeShift endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventShiftTradeShift weekDate(Date weekDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShifttradingAddTradeJobEventShiftTradeShift wfmShifttradingAddTradeJobEventShiftTradeShift = (WfmShifttradingAddTradeJobEventShiftTradeShift) o;

    return Objects.equals(this.id, wfmShifttradingAddTradeJobEventShiftTradeShift.id) &&
            Objects.equals(this.startDate, wfmShifttradingAddTradeJobEventShiftTradeShift.startDate) &&
            Objects.equals(this.endDate, wfmShifttradingAddTradeJobEventShiftTradeShift.endDate) &&
            Objects.equals(this.weekDate, wfmShifttradingAddTradeJobEventShiftTradeShift.weekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, weekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventShiftTradeShift {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
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

