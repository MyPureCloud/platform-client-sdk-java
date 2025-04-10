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
import com.mypurecloud.sdk.v2.model.InsightsSummaryOverallPeriodPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsSummaryOverallItem
 */

public class InsightsSummaryOverallItem  implements Serializable {
  
  private InsightsSummaryOverallPeriodPoints comparativePeriod = null;
  private InsightsSummaryOverallPeriodPoints primaryPeriod = null;
  private Double percentOfGoalChange = null;

  public InsightsSummaryOverallItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Insights data in the comparative period
   **/
  public InsightsSummaryOverallItem comparativePeriod(InsightsSummaryOverallPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the comparative period")
  @JsonProperty("comparativePeriod")
  public InsightsSummaryOverallPeriodPoints getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(InsightsSummaryOverallPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * Insights data in the primary period
   **/
  public InsightsSummaryOverallItem primaryPeriod(InsightsSummaryOverallPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the primary period")
  @JsonProperty("primaryPeriod")
  public InsightsSummaryOverallPeriodPoints getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(InsightsSummaryOverallPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  /**
   * Percent of goal change
   **/
  public InsightsSummaryOverallItem percentOfGoalChange(Double percentOfGoalChange) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsSummaryOverallItem insightsSummaryOverallItem = (InsightsSummaryOverallItem) o;

    return Objects.equals(this.comparativePeriod, insightsSummaryOverallItem.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsSummaryOverallItem.primaryPeriod) &&
            Objects.equals(this.percentOfGoalChange, insightsSummaryOverallItem.percentOfGoalChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparativePeriod, primaryPeriod, percentOfGoalChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsSummaryOverallItem {\n");
    
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
    sb.append("    percentOfGoalChange: ").append(toIndentedString(percentOfGoalChange)).append("\n");
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

