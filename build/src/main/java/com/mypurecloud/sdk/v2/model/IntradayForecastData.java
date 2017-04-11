package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayForecastData
 */

public class IntradayForecastData  implements Serializable {
  
  private Double offered = null;
  private Double averageTalkTimeSeconds = null;
  private Double averageAfterCallWorkSeconds = null;

  
  /**
   * The number of interactions routed into the queue for the given media type(s) for an agent to answer
   **/
  public IntradayForecastData offered(Double offered) {
    this.offered = offered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions routed into the queue for the given media type(s) for an agent to answer")
  @JsonProperty("offered")
  public Double getOffered() {
    return offered;
  }
  public void setOffered(Double offered) {
    this.offered = offered;
  }


  /**
   * The average time in seconds an agent spends interacting with a customer
   **/
  public IntradayForecastData averageTalkTimeSeconds(Double averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average time in seconds an agent spends interacting with a customer")
  @JsonProperty("averageTalkTimeSeconds")
  public Double getAverageTalkTimeSeconds() {
    return averageTalkTimeSeconds;
  }
  public void setAverageTalkTimeSeconds(Double averageTalkTimeSeconds) {
    this.averageTalkTimeSeconds = averageTalkTimeSeconds;
  }


  /**
   * The average time in seconds spent in after-call work. After-call work is the work that an agent performs immediately following an interaction
   **/
  public IntradayForecastData averageAfterCallWorkSeconds(Double averageAfterCallWorkSeconds) {
    this.averageAfterCallWorkSeconds = averageAfterCallWorkSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average time in seconds spent in after-call work. After-call work is the work that an agent performs immediately following an interaction")
  @JsonProperty("averageAfterCallWorkSeconds")
  public Double getAverageAfterCallWorkSeconds() {
    return averageAfterCallWorkSeconds;
  }
  public void setAverageAfterCallWorkSeconds(Double averageAfterCallWorkSeconds) {
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
    IntradayForecastData intradayForecastData = (IntradayForecastData) o;
    return Objects.equals(this.offered, intradayForecastData.offered) &&
        Objects.equals(this.averageTalkTimeSeconds, intradayForecastData.averageTalkTimeSeconds) &&
        Objects.equals(this.averageAfterCallWorkSeconds, intradayForecastData.averageAfterCallWorkSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offered, averageTalkTimeSeconds, averageAfterCallWorkSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayForecastData {\n");
    
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

