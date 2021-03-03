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
 * BuIntradayForecastData
 */

public class BuIntradayForecastData  implements Serializable {
  
  private Double offered = null;
  private Double averageHandleTimeSeconds = null;

  
  /**
   * The number of interactions routed into the queues in the selected planning groups for the given media type for an agent to answer
   **/
  public BuIntradayForecastData offered(Double offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions routed into the queues in the selected planning groups for the given media type for an agent to answer")
  @JsonProperty("offered")
  public Double getOffered() {
    return offered;
  }
  public void setOffered(Double offered) {
    this.offered = offered;
  }

  
  /**
   * The average handle time in seconds an agent spent handling interactions
   **/
  public BuIntradayForecastData averageHandleTimeSeconds(Double averageHandleTimeSeconds) {
    this.averageHandleTimeSeconds = averageHandleTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average handle time in seconds an agent spent handling interactions")
  @JsonProperty("averageHandleTimeSeconds")
  public Double getAverageHandleTimeSeconds() {
    return averageHandleTimeSeconds;
  }
  public void setAverageHandleTimeSeconds(Double averageHandleTimeSeconds) {
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
    BuIntradayForecastData buIntradayForecastData = (BuIntradayForecastData) o;
    return Objects.equals(this.offered, buIntradayForecastData.offered) &&
        Objects.equals(this.averageHandleTimeSeconds, buIntradayForecastData.averageHandleTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, averageHandleTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuIntradayForecastData {\n");
    
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

