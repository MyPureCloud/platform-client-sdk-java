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
import com.mypurecloud.sdk.v2.model.Daily;
import com.mypurecloud.sdk.v2.model.QuarterHourly;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalData
 */

public class HistoricalData  implements Serializable {
  
  private Daily daily = null;
  private QuarterHourly quarterHour = null;

  
  /**
   * Daily time series for historical data
   **/
  public HistoricalData daily(Daily daily) {
    this.daily = daily;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Daily time series for historical data")
  @JsonProperty("daily")
  public Daily getDaily() {
    return daily;
  }
  public void setDaily(Daily daily) {
    this.daily = daily;
  }


  /**
   * Quarter hour time series for historical data
   **/
  public HistoricalData quarterHour(QuarterHourly quarterHour) {
    this.quarterHour = quarterHour;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quarter hour time series for historical data")
  @JsonProperty("quarterHour")
  public QuarterHourly getQuarterHour() {
    return quarterHour;
  }
  public void setQuarterHour(QuarterHourly quarterHour) {
    this.quarterHour = quarterHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalData historicalData = (HistoricalData) o;

    return Objects.equals(this.daily, historicalData.daily) &&
            Objects.equals(this.quarterHour, historicalData.quarterHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daily, quarterHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalData {\n");
    
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    quarterHour: ").append(toIndentedString(quarterHour)).append("\n");
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

