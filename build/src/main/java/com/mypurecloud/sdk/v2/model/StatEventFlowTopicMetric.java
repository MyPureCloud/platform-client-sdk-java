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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * StatEventFlowTopicMetric
 */

public class StatEventFlowTopicMetric  implements Serializable {
  
  private String metric = null;
  private String qualifier = null;
  private Map<String, BigDecimal> stats = null;

  
  /**
   **/
  public StatEventFlowTopicMetric metric(String metric) {
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
  public StatEventFlowTopicMetric qualifier(String qualifier) {
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
  public StatEventFlowTopicMetric stats(Map<String, BigDecimal> stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stats")
  public Map<String, BigDecimal> getStats() {
    return stats;
  }
  public void setStats(Map<String, BigDecimal> stats) {
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
    StatEventFlowTopicMetric statEventFlowTopicMetric = (StatEventFlowTopicMetric) o;
    return Objects.equals(this.metric, statEventFlowTopicMetric.metric) &&
        Objects.equals(this.qualifier, statEventFlowTopicMetric.qualifier) &&
        Objects.equals(this.stats, statEventFlowTopicMetric.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatEventFlowTopicMetric {\n");
    
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

