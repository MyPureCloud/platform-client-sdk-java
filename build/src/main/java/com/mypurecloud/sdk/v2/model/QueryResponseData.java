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
import com.mypurecloud.sdk.v2.model.QueryResponseMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueryResponseData
 */

public class QueryResponseData  implements Serializable {
  
  private String interval = null;
  private List<QueryResponseMetric> metrics = new ArrayList<QueryResponseMetric>();

  
  /**
   * Interval with start and end represented as ISO-8601 string. i.e: yyyy-MM-dd'T'HH:mm:ss.SSS'Z'/yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
   **/
  public QueryResponseData interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interval with start and end represented as ISO-8601 string. i.e: yyyy-MM-dd'T'HH:mm:ss.SSS'Z'/yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * A list of aggregated metrics
   **/
  public QueryResponseData metrics(List<QueryResponseMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of aggregated metrics")
  @JsonProperty("metrics")
  public List<QueryResponseMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<QueryResponseMetric> metrics) {
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
    QueryResponseData queryResponseData = (QueryResponseData) o;
    return Objects.equals(this.interval, queryResponseData.interval) &&
        Objects.equals(this.metrics, queryResponseData.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseData {\n");
    
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

