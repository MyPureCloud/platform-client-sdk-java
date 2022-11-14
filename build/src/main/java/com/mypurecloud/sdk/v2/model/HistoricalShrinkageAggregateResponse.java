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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalShrinkageAggregateResponse
 */

public class HistoricalShrinkageAggregateResponse  implements Serializable {
  
  private Integer scheduledShrinkageSeconds = null;
  private Double scheduledShrinkagePercent = null;
  private Integer actualShrinkageSeconds = null;
  private Double actualShrinkagePercent = null;
  private Integer paidShrinkageSeconds = null;
  private Integer unpaidShrinkageSeconds = null;
  private Integer plannedShrinkageSeconds = null;
  private Integer unplannedShrinkageSeconds = null;

  
  /**
   * Aggregated shrinkage value in seconds for scheduled activities
   **/
  public HistoricalShrinkageAggregateResponse scheduledShrinkageSeconds(Integer scheduledShrinkageSeconds) {
    this.scheduledShrinkageSeconds = scheduledShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in seconds for scheduled activities")
  @JsonProperty("scheduledShrinkageSeconds")
  public Integer getScheduledShrinkageSeconds() {
    return scheduledShrinkageSeconds;
  }
  public void setScheduledShrinkageSeconds(Integer scheduledShrinkageSeconds) {
    this.scheduledShrinkageSeconds = scheduledShrinkageSeconds;
  }


  /**
   * Aggregated shrinkage value in percent from 0.0 to 100.0 for scheduled activities
   **/
  public HistoricalShrinkageAggregateResponse scheduledShrinkagePercent(Double scheduledShrinkagePercent) {
    this.scheduledShrinkagePercent = scheduledShrinkagePercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in percent from 0.0 to 100.0 for scheduled activities")
  @JsonProperty("scheduledShrinkagePercent")
  public Double getScheduledShrinkagePercent() {
    return scheduledShrinkagePercent;
  }
  public void setScheduledShrinkagePercent(Double scheduledShrinkagePercent) {
    this.scheduledShrinkagePercent = scheduledShrinkagePercent;
  }


  /**
   * Aggregated actual value in seconds for scheduled activities
   **/
  public HistoricalShrinkageAggregateResponse actualShrinkageSeconds(Integer actualShrinkageSeconds) {
    this.actualShrinkageSeconds = actualShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated actual value in seconds for scheduled activities")
  @JsonProperty("actualShrinkageSeconds")
  public Integer getActualShrinkageSeconds() {
    return actualShrinkageSeconds;
  }
  public void setActualShrinkageSeconds(Integer actualShrinkageSeconds) {
    this.actualShrinkageSeconds = actualShrinkageSeconds;
  }


  /**
   * Aggregated actual value in percent from 0.0 to 100.0 for scheduled activities
   **/
  public HistoricalShrinkageAggregateResponse actualShrinkagePercent(Double actualShrinkagePercent) {
    this.actualShrinkagePercent = actualShrinkagePercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated actual value in percent from 0.0 to 100.0 for scheduled activities")
  @JsonProperty("actualShrinkagePercent")
  public Double getActualShrinkagePercent() {
    return actualShrinkagePercent;
  }
  public void setActualShrinkagePercent(Double actualShrinkagePercent) {
    this.actualShrinkagePercent = actualShrinkagePercent;
  }


  /**
   * Aggregated shrinkage value in seconds for paid activities
   **/
  public HistoricalShrinkageAggregateResponse paidShrinkageSeconds(Integer paidShrinkageSeconds) {
    this.paidShrinkageSeconds = paidShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in seconds for paid activities")
  @JsonProperty("paidShrinkageSeconds")
  public Integer getPaidShrinkageSeconds() {
    return paidShrinkageSeconds;
  }
  public void setPaidShrinkageSeconds(Integer paidShrinkageSeconds) {
    this.paidShrinkageSeconds = paidShrinkageSeconds;
  }


  /**
   * Aggregated shrinkage value in seconds for unpaid activities
   **/
  public HistoricalShrinkageAggregateResponse unpaidShrinkageSeconds(Integer unpaidShrinkageSeconds) {
    this.unpaidShrinkageSeconds = unpaidShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in seconds for unpaid activities")
  @JsonProperty("unpaidShrinkageSeconds")
  public Integer getUnpaidShrinkageSeconds() {
    return unpaidShrinkageSeconds;
  }
  public void setUnpaidShrinkageSeconds(Integer unpaidShrinkageSeconds) {
    this.unpaidShrinkageSeconds = unpaidShrinkageSeconds;
  }


  /**
   * Aggregated shrinkage value in seconds for planned activities
   **/
  public HistoricalShrinkageAggregateResponse plannedShrinkageSeconds(Integer plannedShrinkageSeconds) {
    this.plannedShrinkageSeconds = plannedShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in seconds for planned activities")
  @JsonProperty("plannedShrinkageSeconds")
  public Integer getPlannedShrinkageSeconds() {
    return plannedShrinkageSeconds;
  }
  public void setPlannedShrinkageSeconds(Integer plannedShrinkageSeconds) {
    this.plannedShrinkageSeconds = plannedShrinkageSeconds;
  }


  /**
   * Aggregated shrinkage value in seconds for unplanned activities
   **/
  public HistoricalShrinkageAggregateResponse unplannedShrinkageSeconds(Integer unplannedShrinkageSeconds) {
    this.unplannedShrinkageSeconds = unplannedShrinkageSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage value in seconds for unplanned activities")
  @JsonProperty("unplannedShrinkageSeconds")
  public Integer getUnplannedShrinkageSeconds() {
    return unplannedShrinkageSeconds;
  }
  public void setUnplannedShrinkageSeconds(Integer unplannedShrinkageSeconds) {
    this.unplannedShrinkageSeconds = unplannedShrinkageSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalShrinkageAggregateResponse historicalShrinkageAggregateResponse = (HistoricalShrinkageAggregateResponse) o;

    return Objects.equals(this.scheduledShrinkageSeconds, historicalShrinkageAggregateResponse.scheduledShrinkageSeconds) &&
            Objects.equals(this.scheduledShrinkagePercent, historicalShrinkageAggregateResponse.scheduledShrinkagePercent) &&
            Objects.equals(this.actualShrinkageSeconds, historicalShrinkageAggregateResponse.actualShrinkageSeconds) &&
            Objects.equals(this.actualShrinkagePercent, historicalShrinkageAggregateResponse.actualShrinkagePercent) &&
            Objects.equals(this.paidShrinkageSeconds, historicalShrinkageAggregateResponse.paidShrinkageSeconds) &&
            Objects.equals(this.unpaidShrinkageSeconds, historicalShrinkageAggregateResponse.unpaidShrinkageSeconds) &&
            Objects.equals(this.plannedShrinkageSeconds, historicalShrinkageAggregateResponse.plannedShrinkageSeconds) &&
            Objects.equals(this.unplannedShrinkageSeconds, historicalShrinkageAggregateResponse.unplannedShrinkageSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledShrinkageSeconds, scheduledShrinkagePercent, actualShrinkageSeconds, actualShrinkagePercent, paidShrinkageSeconds, unpaidShrinkageSeconds, plannedShrinkageSeconds, unplannedShrinkageSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalShrinkageAggregateResponse {\n");
    
    sb.append("    scheduledShrinkageSeconds: ").append(toIndentedString(scheduledShrinkageSeconds)).append("\n");
    sb.append("    scheduledShrinkagePercent: ").append(toIndentedString(scheduledShrinkagePercent)).append("\n");
    sb.append("    actualShrinkageSeconds: ").append(toIndentedString(actualShrinkageSeconds)).append("\n");
    sb.append("    actualShrinkagePercent: ").append(toIndentedString(actualShrinkagePercent)).append("\n");
    sb.append("    paidShrinkageSeconds: ").append(toIndentedString(paidShrinkageSeconds)).append("\n");
    sb.append("    unpaidShrinkageSeconds: ").append(toIndentedString(unpaidShrinkageSeconds)).append("\n");
    sb.append("    plannedShrinkageSeconds: ").append(toIndentedString(plannedShrinkageSeconds)).append("\n");
    sb.append("    unplannedShrinkageSeconds: ").append(toIndentedString(unplannedShrinkageSeconds)).append("\n");
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

