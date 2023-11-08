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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SearchShiftTradeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchShiftTradesResponse
 */

public class SearchShiftTradesResponse  implements Serializable {
  
  private List<SearchShiftTradeResponse> trades = new ArrayList<SearchShiftTradeResponse>();
  private String downloadUrl = null;

  
  /**
   * The shift trades that match the search criteria
   **/
  public SearchShiftTradesResponse trades(List<SearchShiftTradeResponse> trades) {
    this.trades = trades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift trades that match the search criteria")
  @JsonProperty("trades")
  public List<SearchShiftTradeResponse> getTrades() {
    return trades;
  }
  public void setTrades(List<SearchShiftTradeResponse> trades) {
    this.trades = trades;
  }


  /**
   * URL from which to fetch results for requests with a large result set. If populated, the downloaded data will conform to the same schema as would normally be returned, excepting downloaded data will never itself contain a downloadUrl
   **/
  public SearchShiftTradesResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL from which to fetch results for requests with a large result set. If populated, the downloaded data will conform to the same schema as would normally be returned, excepting downloaded data will never itself contain a downloadUrl")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShiftTradesResponse searchShiftTradesResponse = (SearchShiftTradesResponse) o;

    return Objects.equals(this.trades, searchShiftTradesResponse.trades) &&
            Objects.equals(this.downloadUrl, searchShiftTradesResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trades, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShiftTradesResponse {\n");
    
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

