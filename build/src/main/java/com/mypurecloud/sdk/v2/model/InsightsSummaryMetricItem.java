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
import com.mypurecloud.sdk.v2.model.InsightsSummaryMetricPeriodPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsSummaryMetricItem
 */

public class InsightsSummaryMetricItem  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private InsightsSummaryMetricPeriodPoints comparativePeriod = null;
  private InsightsSummaryMetricPeriodPoints primaryPeriod = null;
  private Double percentOfGoalChange = null;
  private Double valueChange = null;

  
  /**
   * The gamification metric for the data
   **/
  public InsightsSummaryMetricItem metric(AddressableEntityRef metric) {
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
  public InsightsSummaryMetricItem comparativePeriod(InsightsSummaryMetricPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the comparative period")
  @JsonProperty("comparativePeriod")
  public InsightsSummaryMetricPeriodPoints getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(InsightsSummaryMetricPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * Insights data in the primary period
   **/
  public InsightsSummaryMetricItem primaryPeriod(InsightsSummaryMetricPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the primary period")
  @JsonProperty("primaryPeriod")
  public InsightsSummaryMetricPeriodPoints getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(InsightsSummaryMetricPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  /**
   * Percent of goal change
   **/
  public InsightsSummaryMetricItem percentOfGoalChange(Double percentOfGoalChange) {
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
  public InsightsSummaryMetricItem valueChange(Double valueChange) {
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
    InsightsSummaryMetricItem insightsSummaryMetricItem = (InsightsSummaryMetricItem) o;

    return Objects.equals(this.metric, insightsSummaryMetricItem.metric) &&
            Objects.equals(this.comparativePeriod, insightsSummaryMetricItem.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsSummaryMetricItem.primaryPeriod) &&
            Objects.equals(this.percentOfGoalChange, insightsSummaryMetricItem.percentOfGoalChange) &&
            Objects.equals(this.valueChange, insightsSummaryMetricItem.valueChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, comparativePeriod, primaryPeriod, percentOfGoalChange, valueChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsSummaryMetricItem {\n");
    
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

