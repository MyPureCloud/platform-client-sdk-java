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
import com.mypurecloud.sdk.v2.model.SearchUnmatchedShiftTradeResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchUnmatchedShiftTradeListJobResponseItem
 */

public class SearchUnmatchedShiftTradeListJobResponseItem  implements Serializable {
  
  private List<SearchUnmatchedShiftTradeResponseItem> trades = null;

  public SearchUnmatchedShiftTradeListJobResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      trades = new ArrayList<SearchUnmatchedShiftTradeResponseItem>();
    }
  }

  
  /**
   * The shift trades that match the search criteria
   **/
  public SearchUnmatchedShiftTradeListJobResponseItem trades(List<SearchUnmatchedShiftTradeResponseItem> trades) {
    this.trades = trades;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The shift trades that match the search criteria")
  @JsonProperty("trades")
  public List<SearchUnmatchedShiftTradeResponseItem> getTrades() {
    return trades;
  }
  public void setTrades(List<SearchUnmatchedShiftTradeResponseItem> trades) {
    this.trades = trades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUnmatchedShiftTradeListJobResponseItem searchUnmatchedShiftTradeListJobResponseItem = (SearchUnmatchedShiftTradeListJobResponseItem) o;

    return Objects.equals(this.trades, searchUnmatchedShiftTradeListJobResponseItem.trades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUnmatchedShiftTradeListJobResponseItem {\n");
    
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
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

