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
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchResponseItem;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchUnmatchedShiftTradeResponseItem
 */

public class SearchUnmatchedShiftTradeResponseItem  implements Serializable {
  
  private ShiftTradeResponseItem trade = null;
  private List<ShiftTradeMatchResponseItem> receivingShiftMatches = null;

  public SearchUnmatchedShiftTradeResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      receivingShiftMatches = new ArrayList<ShiftTradeMatchResponseItem>();
    }
  }

  
  /**
   * A trade which matches search criteria
   **/
  public SearchUnmatchedShiftTradeResponseItem trade(ShiftTradeResponseItem trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A trade which matches search criteria")
  @JsonProperty("trade")
  public ShiftTradeResponseItem getTrade() {
    return trade;
  }
  public void setTrade(ShiftTradeResponseItem trade) {
    this.trade = trade;
  }


  /**
   * The shifts that match the search criteria
   **/
  public SearchUnmatchedShiftTradeResponseItem receivingShiftMatches(List<ShiftTradeMatchResponseItem> receivingShiftMatches) {
    this.receivingShiftMatches = receivingShiftMatches;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shifts that match the search criteria")
  @JsonProperty("receivingShiftMatches")
  public List<ShiftTradeMatchResponseItem> getReceivingShiftMatches() {
    return receivingShiftMatches;
  }
  public void setReceivingShiftMatches(List<ShiftTradeMatchResponseItem> receivingShiftMatches) {
    this.receivingShiftMatches = receivingShiftMatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUnmatchedShiftTradeResponseItem searchUnmatchedShiftTradeResponseItem = (SearchUnmatchedShiftTradeResponseItem) o;

    return Objects.equals(this.trade, searchUnmatchedShiftTradeResponseItem.trade) &&
            Objects.equals(this.receivingShiftMatches, searchUnmatchedShiftTradeResponseItem.receivingShiftMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, receivingShiftMatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUnmatchedShiftTradeResponseItem {\n");
    
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    receivingShiftMatches: ").append(toIndentedString(receivingShiftMatches)).append("\n");
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

