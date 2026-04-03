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
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchReviewResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EvaluatedShiftTradeResponseItem
 */

public class EvaluatedShiftTradeResponseItem  implements Serializable {
  
  private ShiftTradeResponseItem trade = null;
  private ShiftTradeMatchReviewResponse matchReview = null;

  public EvaluatedShiftTradeResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The evaluated shift trade
   **/
  public EvaluatedShiftTradeResponseItem trade(ShiftTradeResponseItem trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The evaluated shift trade")
  @JsonProperty("trade")
  public ShiftTradeResponseItem getTrade() {
    return trade;
  }
  public void setTrade(ShiftTradeResponseItem trade) {
    this.trade = trade;
  }


  /**
   * A preview of what the schedule would look like if the shift trade is approved plus any violations, or null if the shift is in a one-sided trade
   **/
  public EvaluatedShiftTradeResponseItem matchReview(ShiftTradeMatchReviewResponse matchReview) {
    this.matchReview = matchReview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A preview of what the schedule would look like if the shift trade is approved plus any violations, or null if the shift is in a one-sided trade")
  @JsonProperty("matchReview")
  public ShiftTradeMatchReviewResponse getMatchReview() {
    return matchReview;
  }
  public void setMatchReview(ShiftTradeMatchReviewResponse matchReview) {
    this.matchReview = matchReview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatedShiftTradeResponseItem evaluatedShiftTradeResponseItem = (EvaluatedShiftTradeResponseItem) o;

    return Objects.equals(this.trade, evaluatedShiftTradeResponseItem.trade) &&
            Objects.equals(this.matchReview, evaluatedShiftTradeResponseItem.matchReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, matchReview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatedShiftTradeResponseItem {\n");
    
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    matchReview: ").append(toIndentedString(matchReview)).append("\n");
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

