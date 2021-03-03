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
 * WfmIntradayDataUpdateTopicIntradayForecastData
 */

public class WfmIntradayDataUpdateTopicIntradayForecastData  implements Serializable {
  
  private BigDecimal offered = null;
  private BigDecimal averageTalkTimeSeconds = null;
  private BigDecimal averageAfterCallWorkSeconds = null;

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayForecastData offered(BigDecimal offered) {
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
  public WfmIntradayDataUpdateTopicIntradayForecastData averageTalkTimeSeconds(BigDecimal averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageTalkTimeSeconds")
  public BigDecimal getAverageTalkTimeSeconds() {
    return averageTalkTimeSeconds;
  }
  public void setAverageTalkTimeSeconds(BigDecimal averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayForecastData averageAfterCallWorkSeconds(BigDecimal averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageAfterCallWorkSeconds")
  public BigDecimal getAverageAfterCallWorkSeconds() {
    return averageAfterCallWorkSeconds;
  }
  public void setAverageAfterCallWorkSeconds(BigDecimal averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntradayDataUpdateTopicIntradayForecastData wfmIntradayDataUpdateTopicIntradayForecastData = (WfmIntradayDataUpdateTopicIntradayForecastData) o;
    return Objects.equals(this.offered, wfmIntradayDataUpdateTopicIntradayForecastData.offered) &&
        Objects.equals(this.averageTalkTimeSeconds, wfmIntradayDataUpdateTopicIntradayForecastData.averageTalkTimeSeconds) &&
        Objects.equals(this.averageAfterCallWorkSeconds, wfmIntradayDataUpdateTopicIntradayForecastData.averageAfterCallWorkSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, averageTalkTimeSeconds, averageAfterCallWorkSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayForecastData {\n");
    
    sb.append("    offered: ").append(toIndentedString(offered)).append("\n");
    sb.append("    averageTalkTimeSeconds: ").append(toIndentedString(averageTalkTimeSeconds)).append("\n");
    sb.append("    averageAfterCallWorkSeconds: ").append(toIndentedString(averageAfterCallWorkSeconds)).append("\n");
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

