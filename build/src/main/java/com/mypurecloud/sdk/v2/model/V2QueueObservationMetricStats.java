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
 * V2QueueObservationMetricStats
 */

public class V2QueueObservationMetricStats  implements Serializable {
  
  private Long count = null;
  private Long calculatedMetricValue = null;

  public V2QueueObservationMetricStats() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The total number of ongoing observations for this metric and media type
   **/
  public V2QueueObservationMetricStats count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of ongoing observations for this metric and media type")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  /**
   * Calculated metric value
   **/
  public V2QueueObservationMetricStats calculatedMetricValue(Long calculatedMetricValue) {
    this.calculatedMetricValue = calculatedMetricValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Calculated metric value")
  @JsonProperty("calculatedMetricValue")
  public Long getCalculatedMetricValue() {
    return calculatedMetricValue;
  }
  public void setCalculatedMetricValue(Long calculatedMetricValue) {
    this.calculatedMetricValue = calculatedMetricValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2QueueObservationMetricStats v2QueueObservationMetricStats = (V2QueueObservationMetricStats) o;

    return Objects.equals(this.count, v2QueueObservationMetricStats.count) &&
            Objects.equals(this.calculatedMetricValue, v2QueueObservationMetricStats.calculatedMetricValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, calculatedMetricValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationMetricStats {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    calculatedMetricValue: ").append(toIndentedString(calculatedMetricValue)).append("\n");
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

