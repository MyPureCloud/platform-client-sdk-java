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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuIntradayForecastData
 */

public class WfmBuIntradayDataUpdateTopicBuIntradayForecastData  implements Serializable {
  
  private BigDecimal offered = null;
  private BigDecimal averageHandleTimeSeconds = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayForecastData offered(BigDecimal offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offered")
  public BigDecimal getOffered() {
    return offered;
  }
  public void setOffered(BigDecimal offered) {
    this.offered = offered;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayForecastData averageHandleTimeSeconds(BigDecimal averageHandleTimeSeconds) {
    this.averageHandleTimeSeconds = averageHandleTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageHandleTimeSeconds")
  public BigDecimal getAverageHandleTimeSeconds() {
    return averageHandleTimeSeconds;
  }
  public void setAverageHandleTimeSeconds(BigDecimal averageHandleTimeSeconds) {
    this.averageHandleTimeSeconds = averageHandleTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuIntradayForecastData wfmBuIntradayDataUpdateTopicBuIntradayForecastData = (WfmBuIntradayDataUpdateTopicBuIntradayForecastData) o;
    return Objects.equals(this.offered, wfmBuIntradayDataUpdateTopicBuIntradayForecastData.offered) &&
        Objects.equals(this.averageHandleTimeSeconds, wfmBuIntradayDataUpdateTopicBuIntradayForecastData.averageHandleTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, averageHandleTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuIntradayForecastData {\n");
    
    sb.append("    offered: ").append(toIndentedString(offered)).append("\n");
    sb.append("    averageHandleTimeSeconds: ").append(toIndentedString(averageHandleTimeSeconds)).append("\n");
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

