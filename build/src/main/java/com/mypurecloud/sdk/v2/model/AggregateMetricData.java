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
import com.mypurecloud.sdk.v2.model.StatisticalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AggregateMetricData
 */

public class AggregateMetricData  implements Serializable {
  
  private String metric = null;
  private String qualifier = null;
  private StatisticalSummary stats = null;

  
  /**
   **/
  public AggregateMetricData metric(String metric) {
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
  public AggregateMetricData qualifier(String qualifier) {
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
  public AggregateMetricData stats(StatisticalSummary stats) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateMetricData aggregateMetricData = (AggregateMetricData) o;
    return Objects.equals(this.metric, aggregateMetricData.metric) &&
        Objects.equals(this.qualifier, aggregateMetricData.qualifier) &&
        Objects.equals(this.stats, aggregateMetricData.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateMetricData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

