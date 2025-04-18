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
import com.mypurecloud.sdk.v2.model.StatEventWrapUpCodeTopicMetricStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StatEventWrapUpCodeTopicIntervalMetrics
 */

public class StatEventWrapUpCodeTopicIntervalMetrics  implements Serializable {
  
  private String interval = null;
  private List<StatEventWrapUpCodeTopicMetricStats> metrics = null;

  public StatEventWrapUpCodeTopicIntervalMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<StatEventWrapUpCodeTopicMetricStats>();
    }
  }

  
  /**
   **/
  public StatEventWrapUpCodeTopicIntervalMetrics interval(String interval) {
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
  public StatEventWrapUpCodeTopicIntervalMetrics metrics(List<StatEventWrapUpCodeTopicMetricStats> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<StatEventWrapUpCodeTopicMetricStats> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<StatEventWrapUpCodeTopicMetricStats> metrics) {
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
    StatEventWrapUpCodeTopicIntervalMetrics statEventWrapUpCodeTopicIntervalMetrics = (StatEventWrapUpCodeTopicIntervalMetrics) o;

    return Objects.equals(this.interval, statEventWrapUpCodeTopicIntervalMetrics.interval) &&
            Objects.equals(this.metrics, statEventWrapUpCodeTopicIntervalMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventWrapUpCodeTopicIntervalMetrics {\n");
    
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

