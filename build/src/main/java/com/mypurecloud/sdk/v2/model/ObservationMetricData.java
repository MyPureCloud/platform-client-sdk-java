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
import com.mypurecloud.sdk.v2.model.ObservationValue;
import com.mypurecloud.sdk.v2.model.StatisticalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ObservationMetricData
 */

public class ObservationMetricData  implements Serializable {
  
  private String metric = null;
  private String qualifier = null;
  private StatisticalSummary stats = null;
  private Boolean truncated = null;
  private List<ObservationValue> observations = new ArrayList<ObservationValue>();

  
  /**
   **/
  public ObservationMetricData metric(String metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public String getMetric() {
    return metric;
  }
  public void setMetric(String metric) {
    this.metric = metric;
  }

  
  /**
   **/
  public ObservationMetricData qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qualifier")
  public String getQualifier() {
    return qualifier;
  }
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  
  /**
   **/
  public ObservationMetricData stats(StatisticalSummary stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stats")
  public StatisticalSummary getStats() {
    return stats;
  }
  public void setStats(StatisticalSummary stats) {
    this.stats = stats;
  }

  
  /**
   * Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations.
   **/
  public ObservationMetricData truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations.")
  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }
  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  
  /**
   * List of observations sorted by timestamp in ascending order. This list may be truncated.
   **/
  public ObservationMetricData observations(List<ObservationValue> observations) {
    this.observations = observations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of observations sorted by timestamp in ascending order. This list may be truncated.")
  @JsonProperty("observations")
  public List<ObservationValue> getObservations() {
    return observations;
  }
  public void setObservations(List<ObservationValue> observations) {
    this.observations = observations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationMetricData observationMetricData = (ObservationMetricData) o;
    return Objects.equals(this.metric, observationMetricData.metric) &&
        Objects.equals(this.qualifier, observationMetricData.qualifier) &&
        Objects.equals(this.stats, observationMetricData.stats) &&
        Objects.equals(this.truncated, observationMetricData.truncated) &&
        Objects.equals(this.observations, observationMetricData.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, stats, truncated, observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationMetricData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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

