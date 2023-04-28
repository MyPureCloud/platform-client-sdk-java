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
import com.mypurecloud.sdk.v2.model.InsightsDetailsOverallPeriodPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InsightsDetailsOverallItem
 */

public class InsightsDetailsOverallItem  implements Serializable {
  
  private InsightsDetailsOverallPeriodPoints comparativePeriod = null;
  private InsightsDetailsOverallPeriodPoints primaryPeriod = null;
  private Double percentOfGoalChange = null;

  
  /**
   * Insights data in the comparative period
   **/
  public InsightsDetailsOverallItem comparativePeriod(InsightsDetailsOverallPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the comparative period")
  @JsonProperty("comparativePeriod")
  public InsightsDetailsOverallPeriodPoints getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(InsightsDetailsOverallPeriodPoints comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * Insights data in the primary period
   **/
  public InsightsDetailsOverallItem primaryPeriod(InsightsDetailsOverallPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insights data in the primary period")
  @JsonProperty("primaryPeriod")
  public InsightsDetailsOverallPeriodPoints getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(InsightsDetailsOverallPeriodPoints primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  /**
   * Percent of goal change
   **/
  public InsightsDetailsOverallItem percentOfGoalChange(Double percentOfGoalChange) {
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
    InsightsDetailsOverallItem insightsDetailsOverallItem = (InsightsDetailsOverallItem) o;

    return Objects.equals(this.comparativePeriod, insightsDetailsOverallItem.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsDetailsOverallItem.primaryPeriod) &&
            Objects.equals(this.percentOfGoalChange, insightsDetailsOverallItem.percentOfGoalChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparativePeriod, primaryPeriod, percentOfGoalChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsDetailsOverallItem {\n");
    
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

