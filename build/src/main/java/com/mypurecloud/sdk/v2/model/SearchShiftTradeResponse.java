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
import com.mypurecloud.sdk.v2.model.ShiftTradePreviewResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchShiftTradeResponse
 */

public class SearchShiftTradeResponse  implements Serializable {
  
  private ShiftTradeResponse trade = null;
  private List<String> matchingReceivingShiftIds = new ArrayList<String>();
  private ShiftTradePreviewResponse preview = null;

  
  /**
   * A trade which matches search criteria
   **/
  public SearchShiftTradeResponse trade(ShiftTradeResponse trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A trade which matches search criteria")
  @JsonProperty("trade")
  public ShiftTradeResponse getTrade() {
    return trade;
  }
  public void setTrade(ShiftTradeResponse trade) {
    this.trade = trade;
  }

  
  /**
   * IDs of shifts which match the search criteria
   **/
  public SearchShiftTradeResponse matchingReceivingShiftIds(List<String> matchingReceivingShiftIds) {
    this.matchingReceivingShiftIds = matchingReceivingShiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of shifts which match the search criteria")
  @JsonProperty("matchingReceivingShiftIds")
  public List<String> getMatchingReceivingShiftIds() {
    return matchingReceivingShiftIds;
  }
  public void setMatchingReceivingShiftIds(List<String> matchingReceivingShiftIds) {
    this.matchingReceivingShiftIds = matchingReceivingShiftIds;
  }

  
  /**
   * A preview of what the shift trade would look like if matched
   **/
  public SearchShiftTradeResponse preview(ShiftTradePreviewResponse preview) {
    this.preview = preview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A preview of what the shift trade would look like if matched")
  @JsonProperty("preview")
  public ShiftTradePreviewResponse getPreview() {
    return preview;
  }
  public void setPreview(ShiftTradePreviewResponse preview) {
    this.preview = preview;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShiftTradeResponse searchShiftTradeResponse = (SearchShiftTradeResponse) o;
    return Objects.equals(this.trade, searchShiftTradeResponse.trade) &&
        Objects.equals(this.matchingReceivingShiftIds, searchShiftTradeResponse.matchingReceivingShiftIds) &&
        Objects.equals(this.preview, searchShiftTradeResponse.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, matchingReceivingShiftIds, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShiftTradeResponse {\n");
    
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    matchingReceivingShiftIds: ").append(toIndentedString(matchingReceivingShiftIds)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

