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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchShiftTradesRequest
 */

public class SearchShiftTradesRequest  implements Serializable {
  
  private String receivingScheduleId = null;
  private List<String> receivingShiftIds = new ArrayList<String>();

  
  /**
   * The ID of the schedule for which to search for available shift trades
   **/
  public SearchShiftTradesRequest receivingScheduleId(String receivingScheduleId) {
    this.receivingScheduleId = receivingScheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule for which to search for available shift trades")
  @JsonProperty("receivingScheduleId")
  public String getReceivingScheduleId() {
    return receivingScheduleId;
  }
  public void setReceivingScheduleId(String receivingScheduleId) {
    this.receivingScheduleId = receivingScheduleId;
  }

  
  /**
   * The IDs of shifts that the receiving user would potentially be willing to trade. If empty, only returns one sided trades (pick up a shift)
   **/
  public SearchShiftTradesRequest receivingShiftIds(List<String> receivingShiftIds) {
    this.receivingShiftIds = receivingShiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of shifts that the receiving user would potentially be willing to trade. If empty, only returns one sided trades (pick up a shift)")
  @JsonProperty("receivingShiftIds")
  public List<String> getReceivingShiftIds() {
    return receivingShiftIds;
  }
  public void setReceivingShiftIds(List<String> receivingShiftIds) {
    this.receivingShiftIds = receivingShiftIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShiftTradesRequest searchShiftTradesRequest = (SearchShiftTradesRequest) o;
    return Objects.equals(this.receivingScheduleId, searchShiftTradesRequest.receivingScheduleId) &&
        Objects.equals(this.receivingShiftIds, searchShiftTradesRequest.receivingShiftIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivingScheduleId, receivingShiftIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShiftTradesRequest {\n");
    
    sb.append("    receivingScheduleId: ").append(toIndentedString(receivingScheduleId)).append("\n");
    sb.append("    receivingShiftIds: ").append(toIndentedString(receivingShiftIds)).append("\n");
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

