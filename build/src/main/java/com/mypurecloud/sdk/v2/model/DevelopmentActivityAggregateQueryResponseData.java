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
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateQueryResponseMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DevelopmentActivityAggregateQueryResponseData
 */

public class DevelopmentActivityAggregateQueryResponseData  implements Serializable {
  
  private String interval = null;
  private List<DevelopmentActivityAggregateQueryResponseMetric> metrics = new ArrayList<DevelopmentActivityAggregateQueryResponseMetric>();

  
  /**
   * Specifies the range of due dates to be used for filtering. A maximum of 1 year can be specified in the range. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public DevelopmentActivityAggregateQueryResponseData interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the range of due dates to be used for filtering. A maximum of 1 year can be specified in the range. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * The list of aggregated metrics
   **/
  public DevelopmentActivityAggregateQueryResponseData metrics(List<DevelopmentActivityAggregateQueryResponseMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of aggregated metrics")
  @JsonProperty("metrics")
  public List<DevelopmentActivityAggregateQueryResponseMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<DevelopmentActivityAggregateQueryResponseMetric> metrics) {
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
    DevelopmentActivityAggregateQueryResponseData developmentActivityAggregateQueryResponseData = (DevelopmentActivityAggregateQueryResponseData) o;
    return Objects.equals(this.interval, developmentActivityAggregateQueryResponseData.interval) &&
        Objects.equals(this.metrics, developmentActivityAggregateQueryResponseData.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevelopmentActivityAggregateQueryResponseData {\n");
    
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

