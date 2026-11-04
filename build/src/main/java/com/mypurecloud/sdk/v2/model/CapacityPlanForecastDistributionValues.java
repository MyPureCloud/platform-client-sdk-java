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
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastDistribution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanForecastDistributionValues
 */

public class CapacityPlanForecastDistributionValues  implements Serializable {
  
  private List<CapacityPlanForecastDistribution> offeredDistributions = null;
  private List<CapacityPlanForecastDistribution> averageHandleTimeDistributions = null;

  public CapacityPlanForecastDistributionValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      offeredDistributions = new ArrayList<CapacityPlanForecastDistribution>();
      averageHandleTimeDistributions = new ArrayList<CapacityPlanForecastDistribution>();
    }
  }

  public CapacityPlanForecastDistributionValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      offeredDistributions = new ArrayList<CapacityPlanForecastDistribution>();
      averageHandleTimeDistributions = new ArrayList<CapacityPlanForecastDistribution>();
    }
  }

  
  /**
   * Hourly distribution of forecast offered volume for the forecast week, with one entry per day of the week. Each value is a proportional weight between 0.0 to 1.0. Each day's 24 values must sum to approximately 1.0 (0.999 to 1.001 to allow for rounding)
   **/
  public CapacityPlanForecastDistributionValues offeredDistributions(List<CapacityPlanForecastDistribution> offeredDistributions) {
    this.offeredDistributions = offeredDistributions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hourly distribution of forecast offered volume for the forecast week, with one entry per day of the week. Each value is a proportional weight between 0.0 to 1.0. Each day's 24 values must sum to approximately 1.0 (0.999 to 1.001 to allow for rounding)")
  @JsonProperty("offeredDistributions")
  public List<CapacityPlanForecastDistribution> getOfferedDistributions() {
    return offeredDistributions;
  }
  public void setOfferedDistributions(List<CapacityPlanForecastDistribution> offeredDistributions) {
    this.offeredDistributions = offeredDistributions;
  }


  /**
   * Hourly distribution of forecast average handle time for the forecast week, with one entry per day of the week. Each value is a weighting factor relative to the daily average handle time. Each day's 24 values must average to approximately 1.0 (0.999 to 1.001 to allow for rounding)
   **/
  public CapacityPlanForecastDistributionValues averageHandleTimeDistributions(List<CapacityPlanForecastDistribution> averageHandleTimeDistributions) {
    this.averageHandleTimeDistributions = averageHandleTimeDistributions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hourly distribution of forecast average handle time for the forecast week, with one entry per day of the week. Each value is a weighting factor relative to the daily average handle time. Each day's 24 values must average to approximately 1.0 (0.999 to 1.001 to allow for rounding)")
  @JsonProperty("averageHandleTimeDistributions")
  public List<CapacityPlanForecastDistribution> getAverageHandleTimeDistributions() {
    return averageHandleTimeDistributions;
  }
  public void setAverageHandleTimeDistributions(List<CapacityPlanForecastDistribution> averageHandleTimeDistributions) {
    this.averageHandleTimeDistributions = averageHandleTimeDistributions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastDistributionValues capacityPlanForecastDistributionValues = (CapacityPlanForecastDistributionValues) o;

    return Objects.equals(this.offeredDistributions, capacityPlanForecastDistributionValues.offeredDistributions) &&
            Objects.equals(this.averageHandleTimeDistributions, capacityPlanForecastDistributionValues.averageHandleTimeDistributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offeredDistributions, averageHandleTimeDistributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastDistributionValues {\n");
    
    sb.append("    offeredDistributions: ").append(toIndentedString(offeredDistributions)).append("\n");
    sb.append("    averageHandleTimeDistributions: ").append(toIndentedString(averageHandleTimeDistributions)).append("\n");
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

