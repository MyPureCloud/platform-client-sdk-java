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
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchReviewResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WeekShiftTradeResponse
 */

public class WeekShiftTradeResponse  implements Serializable {
  
  private ShiftTradeResponse trade = null;
  private ShiftTradeMatchReviewResponse matchReview = null;

  
  /**
   * The shift trade details
   **/
  public WeekShiftTradeResponse trade(ShiftTradeResponse trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift trade details")
  @JsonProperty("trade")
  public ShiftTradeResponse getTrade() {
    return trade;
  }
  public void setTrade(ShiftTradeResponse trade) {
    this.trade = trade;
  }

  
  /**
   * A preview of what the schedule would look like if the shift trade is approved plus any violations
   **/
  public WeekShiftTradeResponse matchReview(ShiftTradeMatchReviewResponse matchReview) {
    this.matchReview = matchReview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A preview of what the schedule would look like if the shift trade is approved plus any violations")
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
    WeekShiftTradeResponse weekShiftTradeResponse = (WeekShiftTradeResponse) o;
    return Objects.equals(this.trade, weekShiftTradeResponse.trade) &&
        Objects.equals(this.matchReview, weekShiftTradeResponse.matchReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, matchReview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekShiftTradeResponse {\n");
    
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

