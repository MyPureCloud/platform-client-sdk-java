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
import com.mypurecloud.sdk.v2.model.HistoricalShrinkageActivityCategoryResponse;
import com.mypurecloud.sdk.v2.model.HistoricalShrinkageAggregateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * HistoricalShrinkageResult
 */

public class HistoricalShrinkageResult  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer totalScheduledDurationSeconds = null;
  private Integer totalLoggedInDurationSeconds = null;
  private HistoricalShrinkageAggregateResponse aggregatedShrinkage = null;
  private List<HistoricalShrinkageActivityCategoryResponse> shrinkageForActivityCategories = null;
  private List<String> businessUnitIds = null;

  public HistoricalShrinkageResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shrinkageForActivityCategories = new ArrayList<HistoricalShrinkageActivityCategoryResponse>();
      businessUnitIds = new ArrayList<String>();
    }
  }

  
  /**
   * Beginning of the date range that was queried, in ISO-8601 format
   **/
  public HistoricalShrinkageResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning of the date range that was queried, in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time
   **/
  public HistoricalShrinkageResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * Total duration in seconds for which agents in the management unit are scheduled
   **/
  public HistoricalShrinkageResult totalScheduledDurationSeconds(Integer totalScheduledDurationSeconds) {
    this.totalScheduledDurationSeconds = totalScheduledDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for which agents in the management unit are scheduled")
  @JsonProperty("totalScheduledDurationSeconds")
  public Integer getTotalScheduledDurationSeconds() {
    return totalScheduledDurationSeconds;
  }
  public void setTotalScheduledDurationSeconds(Integer totalScheduledDurationSeconds) {
    this.totalScheduledDurationSeconds = totalScheduledDurationSeconds;
  }


  /**
   * Total duration in seconds for which agents in the management unit are actually logged-in
   **/
  public HistoricalShrinkageResult totalLoggedInDurationSeconds(Integer totalLoggedInDurationSeconds) {
    this.totalLoggedInDurationSeconds = totalLoggedInDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for which agents in the management unit are actually logged-in")
  @JsonProperty("totalLoggedInDurationSeconds")
  public Integer getTotalLoggedInDurationSeconds() {
    return totalLoggedInDurationSeconds;
  }
  public void setTotalLoggedInDurationSeconds(Integer totalLoggedInDurationSeconds) {
    this.totalLoggedInDurationSeconds = totalLoggedInDurationSeconds;
  }


  /**
   * Aggregated shrinkage data for all the activity categories
   **/
  public HistoricalShrinkageResult aggregatedShrinkage(HistoricalShrinkageAggregateResponse aggregatedShrinkage) {
    this.aggregatedShrinkage = aggregatedShrinkage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage data for all the activity categories")
  @JsonProperty("aggregatedShrinkage")
  public HistoricalShrinkageAggregateResponse getAggregatedShrinkage() {
    return aggregatedShrinkage;
  }
  public void setAggregatedShrinkage(HistoricalShrinkageAggregateResponse aggregatedShrinkage) {
    this.aggregatedShrinkage = aggregatedShrinkage;
  }


  /**
   * Shrinkage for activity categories
   **/
  public HistoricalShrinkageResult shrinkageForActivityCategories(List<HistoricalShrinkageActivityCategoryResponse> shrinkageForActivityCategories) {
    this.shrinkageForActivityCategories = shrinkageForActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shrinkage for activity categories")
  @JsonProperty("shrinkageForActivityCategories")
  public List<HistoricalShrinkageActivityCategoryResponse> getShrinkageForActivityCategories() {
    return shrinkageForActivityCategories;
  }
  public void setShrinkageForActivityCategories(List<HistoricalShrinkageActivityCategoryResponse> shrinkageForActivityCategories) {
    this.shrinkageForActivityCategories = shrinkageForActivityCategories;
  }


  /**
   * List of all business units of all the agents in response
   **/
  public HistoricalShrinkageResult businessUnitIds(List<String> businessUnitIds) {
    this.businessUnitIds = businessUnitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of all business units of all the agents in response")
  @JsonProperty("businessUnitIds")
  public List<String> getBusinessUnitIds() {
    return businessUnitIds;
  }
  public void setBusinessUnitIds(List<String> businessUnitIds) {
    this.businessUnitIds = businessUnitIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalShrinkageResult historicalShrinkageResult = (HistoricalShrinkageResult) o;

    return Objects.equals(this.startDate, historicalShrinkageResult.startDate) &&
            Objects.equals(this.endDate, historicalShrinkageResult.endDate) &&
            Objects.equals(this.totalScheduledDurationSeconds, historicalShrinkageResult.totalScheduledDurationSeconds) &&
            Objects.equals(this.totalLoggedInDurationSeconds, historicalShrinkageResult.totalLoggedInDurationSeconds) &&
            Objects.equals(this.aggregatedShrinkage, historicalShrinkageResult.aggregatedShrinkage) &&
            Objects.equals(this.shrinkageForActivityCategories, historicalShrinkageResult.shrinkageForActivityCategories) &&
            Objects.equals(this.businessUnitIds, historicalShrinkageResult.businessUnitIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, totalScheduledDurationSeconds, totalLoggedInDurationSeconds, aggregatedShrinkage, shrinkageForActivityCategories, businessUnitIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalShrinkageResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalScheduledDurationSeconds: ").append(toIndentedString(totalScheduledDurationSeconds)).append("\n");
    sb.append("    totalLoggedInDurationSeconds: ").append(toIndentedString(totalLoggedInDurationSeconds)).append("\n");
    sb.append("    aggregatedShrinkage: ").append(toIndentedString(aggregatedShrinkage)).append("\n");
    sb.append("    shrinkageForActivityCategories: ").append(toIndentedString(shrinkageForActivityCategories)).append("\n");
    sb.append("    businessUnitIds: ").append(toIndentedString(businessUnitIds)).append("\n");
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

