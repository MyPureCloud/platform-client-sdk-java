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
import com.mypurecloud.sdk.v2.model.StatEventFlowOutcomeTopicMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StatEventFlowOutcomeTopicDatum
 */

public class StatEventFlowOutcomeTopicDatum  implements Serializable {
  
  private String interval = null;
  private List<StatEventFlowOutcomeTopicMetric> metrics = new ArrayList<StatEventFlowOutcomeTopicMetric>();

  
  /**
   **/
  public StatEventFlowOutcomeTopicDatum interval(String interval) {
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
  public StatEventFlowOutcomeTopicDatum metrics(List<StatEventFlowOutcomeTopicMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<StatEventFlowOutcomeTopicMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<StatEventFlowOutcomeTopicMetric> metrics) {
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
    StatEventFlowOutcomeTopicDatum statEventFlowOutcomeTopicDatum = (StatEventFlowOutcomeTopicDatum) o;
    return Objects.equals(this.interval, statEventFlowOutcomeTopicDatum.interval) &&
        Objects.equals(this.metrics, statEventFlowOutcomeTopicDatum.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventFlowOutcomeTopicDatum {\n");
    
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

