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
import com.mypurecloud.sdk.v2.model.AggregateMetricData;
import com.mypurecloud.sdk.v2.model.AggregateViewData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StatisticalResponse
 */

public class StatisticalResponse  implements Serializable {
  
  private String interval = null;
  private List<AggregateMetricData> metrics = new ArrayList<AggregateMetricData>();
  private List<AggregateViewData> views = new ArrayList<AggregateViewData>();

  
  /**
   **/
  public StatisticalResponse interval(String interval) {
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
  public StatisticalResponse metrics(List<AggregateMetricData> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<AggregateMetricData> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<AggregateMetricData> metrics) {
    this.metrics = metrics;
  }

  
  /**
   **/
  public StatisticalResponse views(List<AggregateViewData> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("views")
  public List<AggregateViewData> getViews() {
    return views;
  }
  public void setViews(List<AggregateViewData> views) {
    this.views = views;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticalResponse statisticalResponse = (StatisticalResponse) o;
    return Objects.equals(this.interval, statisticalResponse.interval) &&
        Objects.equals(this.metrics, statisticalResponse.metrics) &&
        Objects.equals(this.views, statisticalResponse.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticalResponse {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

