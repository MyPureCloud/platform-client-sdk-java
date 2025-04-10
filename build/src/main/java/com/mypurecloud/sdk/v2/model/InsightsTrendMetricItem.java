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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.InsightsTrends;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsTrendMetricItem
 */

public class InsightsTrendMetricItem  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private InsightsTrends trends = null;

  public InsightsTrendMetricItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The gamification metric for the trend
   **/
  public InsightsTrendMetricItem metric(AddressableEntityRef metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The gamification metric for the trend")
  @JsonProperty("metric")
  public AddressableEntityRef getMetric() {
    return metric;
  }
  public void setMetric(AddressableEntityRef metric) {
    this.metric = metric;
  }


  /**
   * Trends for the metric
   **/
  public InsightsTrendMetricItem trends(InsightsTrends trends) {
    this.trends = trends;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trends for the metric")
  @JsonProperty("trends")
  public InsightsTrends getTrends() {
    return trends;
  }
  public void setTrends(InsightsTrends trends) {
    this.trends = trends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsTrendMetricItem insightsTrendMetricItem = (InsightsTrendMetricItem) o;

    return Objects.equals(this.metric, insightsTrendMetricItem.metric) &&
            Objects.equals(this.trends, insightsTrendMetricItem.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, trends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsTrendMetricItem {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

