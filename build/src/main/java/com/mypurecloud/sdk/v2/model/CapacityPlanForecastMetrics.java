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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanForecastMetrics
 */

public class CapacityPlanForecastMetrics  implements Serializable {
  
  private List<Double> volume = null;
  private List<Double> averageHandleTime = null;

  public CapacityPlanForecastMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      volume = new ArrayList<Double>();
      averageHandleTime = new ArrayList<Double>();
    }
  }

  public CapacityPlanForecastMetrics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      volume = new ArrayList<Double>();
      averageHandleTime = new ArrayList<Double>();
    }
  }

  
  /**
   * Forecast offered counts per requested granularity interval
   **/
  public CapacityPlanForecastMetrics volume(List<Double> volume) {
    this.volume = volume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast offered counts per requested granularity interval")
  @JsonProperty("volume")
  public List<Double> getVolume() {
    return volume;
  }
  public void setVolume(List<Double> volume) {
    this.volume = volume;
  }


  /**
   * Average handle time in seconds per requested granularity interval
   **/
  public CapacityPlanForecastMetrics averageHandleTime(List<Double> averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Average handle time in seconds per requested granularity interval")
  @JsonProperty("averageHandleTime")
  public List<Double> getAverageHandleTime() {
    return averageHandleTime;
  }
  public void setAverageHandleTime(List<Double> averageHandleTime) {
    this.averageHandleTime = averageHandleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastMetrics capacityPlanForecastMetrics = (CapacityPlanForecastMetrics) o;

    return Objects.equals(this.volume, capacityPlanForecastMetrics.volume) &&
            Objects.equals(this.averageHandleTime, capacityPlanForecastMetrics.averageHandleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, averageHandleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastMetrics {\n");
    
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    averageHandleTime: ").append(toIndentedString(averageHandleTime)).append("\n");
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

