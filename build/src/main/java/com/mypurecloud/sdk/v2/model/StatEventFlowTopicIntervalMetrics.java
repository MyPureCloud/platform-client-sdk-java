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
import com.mypurecloud.sdk.v2.model.StatEventFlowTopicMetricStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StatEventFlowTopicIntervalMetrics
 */

public class StatEventFlowTopicIntervalMetrics  implements Serializable {
  
  private String interval = null;
  private List<StatEventFlowTopicMetricStats> metrics = null;

  public StatEventFlowTopicIntervalMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<StatEventFlowTopicMetricStats>();
    }
  }

  
  /**
   **/
  public StatEventFlowTopicIntervalMetrics interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   **/
  public StatEventFlowTopicIntervalMetrics metrics(List<StatEventFlowTopicMetricStats> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<StatEventFlowTopicMetricStats> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<StatEventFlowTopicMetricStats> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatEventFlowTopicIntervalMetrics statEventFlowTopicIntervalMetrics = (StatEventFlowTopicIntervalMetrics) o;

    return Objects.equals(this.interval, statEventFlowTopicIntervalMetrics.interval) &&
            Objects.equals(this.metrics, statEventFlowTopicIntervalMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventFlowTopicIntervalMetrics {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

