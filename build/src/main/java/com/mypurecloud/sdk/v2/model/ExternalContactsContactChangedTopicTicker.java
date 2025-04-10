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
 * ExternalContactsContactChangedTopicTicker
 */

public class ExternalContactsContactChangedTopicTicker  implements Serializable {
  
  private String symbol = null;
  private String exchange = null;

  public ExternalContactsContactChangedTopicTicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsContactChangedTopicTicker symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicTicker exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    ExternalContactsContactChangedTopicTicker externalContactsContactChangedTopicTicker = (ExternalContactsContactChangedTopicTicker) o;

    return Objects.equals(this.symbol, externalContactsContactChangedTopicTicker.symbol) &&
            Objects.equals(this.exchange, externalContactsContactChangedTopicTicker.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicTicker {\n");
    
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

