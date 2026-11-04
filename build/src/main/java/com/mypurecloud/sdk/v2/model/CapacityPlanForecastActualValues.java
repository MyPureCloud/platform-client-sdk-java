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
 * CapacityPlanForecastActualValues
 */

public class CapacityPlanForecastActualValues  implements Serializable {
  
  private List<Double> offeredPerInterval = null;
  private List<Double> averageHandleTimeSecondsPerInterval = null;

  public CapacityPlanForecastActualValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      offeredPerInterval = new ArrayList<Double>();
      averageHandleTimeSecondsPerInterval = new ArrayList<Double>();
    }
  }

  public CapacityPlanForecastActualValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      offeredPerInterval = new ArrayList<Double>();
      averageHandleTimeSecondsPerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * Forecast offered counts per interval, ordered by the granularity, starting from the business unit's start day of the week
   **/
  public CapacityPlanForecastActualValues offeredPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast offered counts per interval, ordered by the granularity, starting from the business unit's start day of the week")
  @JsonProperty("offeredPerInterval")
  public List<Double> getOfferedPerInterval() {
    return offeredPerInterval;
  }
  public void setOfferedPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
  }


  /**
   * Forecast average handle time in seconds per interval, ordered by the granularity, starting from the business unit's start day of the week
   **/
  public CapacityPlanForecastActualValues averageHandleTimeSecondsPerInterval(List<Double> averageHandleTimeSecondsPerInterval) {
    this.averageHandleTimeSecondsPerInterval = averageHandleTimeSecondsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast average handle time in seconds per interval, ordered by the granularity, starting from the business unit's start day of the week")
  @JsonProperty("averageHandleTimeSecondsPerInterval")
  public List<Double> getAverageHandleTimeSecondsPerInterval() {
    return averageHandleTimeSecondsPerInterval;
  }
  public void setAverageHandleTimeSecondsPerInterval(List<Double> averageHandleTimeSecondsPerInterval) {
    this.averageHandleTimeSecondsPerInterval = averageHandleTimeSecondsPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastActualValues capacityPlanForecastActualValues = (CapacityPlanForecastActualValues) o;

    return Objects.equals(this.offeredPerInterval, capacityPlanForecastActualValues.offeredPerInterval) &&
            Objects.equals(this.averageHandleTimeSecondsPerInterval, capacityPlanForecastActualValues.averageHandleTimeSecondsPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offeredPerInterval, averageHandleTimeSecondsPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastActualValues {\n");
    
    sb.append("    offeredPerInterval: ").append(toIndentedString(offeredPerInterval)).append("\n");
    sb.append("    averageHandleTimeSecondsPerInterval: ").append(toIndentedString(averageHandleTimeSecondsPerInterval)).append("\n");
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

