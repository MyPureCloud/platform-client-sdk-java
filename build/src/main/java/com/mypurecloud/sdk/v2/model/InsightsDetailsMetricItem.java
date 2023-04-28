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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.InsightsDetailsMetricPeriodPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsDetailsMetricItem
 */

public class InsightsDetailsMetricItem  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private InsightsDetailsMetricPeriodPoints comparativePeriod = null;
  private InsightsDetailsMetricPeriodPoints primaryPeriod = null;
  private Double percentOfGoalChange = null;
  private Double valueChange = null;

  
  /**
   * The gamification metric for the data
   **/
  public InsightsDetailsMetricItem metric(AddressableEntityRef metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The gamification metric for the data")
  @JsonProperty("metric")
  public AddressableEntityRef getMetric() {
    return metric;
  }
  public void setMetric(AddressableEntityRef metric) {
    this.metric = metric;
  }


  /**
   * Insights data in the comparative period
   **/
  public InsightsDetailsMetricItem comparativePeriod(InsightsDetailsMetricPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the comparative period")
  @JsonProperty("comparativePeriod")
  public InsightsDetailsMetricPeriodPoints getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(InsightsDetailsMetricPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * Insights data in the primary period
   **/
  public InsightsDetailsMetricItem primaryPeriod(InsightsDetailsMetricPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the primary period")
  @JsonProperty("primaryPeriod")
  public InsightsDetailsMetricPeriodPoints getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(InsightsDetailsMetricPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  /**
   * Percent of goal change
   **/
  public InsightsDetailsMetricItem percentOfGoalChange(Double percentOfGoalChange) {
    this.percentOfGoalChange = percentOfGoalChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percent of goal change")
  @JsonProperty("percentOfGoalChange")
  public Double getPercentOfGoalChange() {
    return percentOfGoalChange;
  }
  public void setPercentOfGoalChange(Double percentOfGoalChange) {
    this.percentOfGoalChange = percentOfGoalChange;
  }


  /**
   * Value change
   **/
  public InsightsDetailsMetricItem valueChange(Double valueChange) {
    this.valueChange = valueChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value change")
  @JsonProperty("valueChange")
  public Double getValueChange() {
    return valueChange;
  }
  public void setValueChange(Double valueChange) {
    this.valueChange = valueChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsDetailsMetricItem insightsDetailsMetricItem = (InsightsDetailsMetricItem) o;

    return Objects.equals(this.metric, insightsDetailsMetricItem.metric) &&
            Objects.equals(this.comparativePeriod, insightsDetailsMetricItem.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsDetailsMetricItem.primaryPeriod) &&
            Objects.equals(this.percentOfGoalChange, insightsDetailsMetricItem.percentOfGoalChange) &&
            Objects.equals(this.valueChange, insightsDetailsMetricItem.valueChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, comparativePeriod, primaryPeriod, percentOfGoalChange, valueChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsDetailsMetricItem {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
    sb.append("    percentOfGoalChange: ").append(toIndentedString(percentOfGoalChange)).append("\n");
    sb.append("    valueChange: ").append(toIndentedString(valueChange)).append("\n");
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

