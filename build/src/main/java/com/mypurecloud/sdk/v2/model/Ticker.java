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

import java.io.Serializable;
/**
 * Ticker
 */

public class Ticker  implements Serializable {
  
  private String symbol = null;
  private String exchange = null;

  
  /**
   * The ticker symbol for this organization. Example: ININ, AAPL, MSFT, etc.
   **/
  public Ticker symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ticker symbol for this organization. Example: ININ, AAPL, MSFT, etc.")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   * The exchange for this ticker symbol. Examples: NYSE, FTSE, NASDAQ, etc.
   **/
  public Ticker exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The exchange for this ticker symbol. Examples: NYSE, FTSE, NASDAQ, etc.")
  @JsonProperty("exchange")
  public String getExchange() {
    return exchange;
  }
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticker ticker = (Ticker) o;
    return Objects.equals(this.symbol, ticker.symbol) &&
        Objects.equals(this.exchange, ticker.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticker {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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

