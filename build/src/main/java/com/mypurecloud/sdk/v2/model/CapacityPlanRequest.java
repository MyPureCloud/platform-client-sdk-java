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
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import com.mypurecloud.sdk.v2.model.CreateStaffingGroupAllocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanRequest
 */

public class CapacityPlanRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private LocalDate startBusinessUnitDate = null;
  private LocalDate endBusinessUnitDate = null;
  private BuShortTermForecastReference forecast = null;
  private Double fullTimeEquivalentWeeklyHours = null;
  private List<CreateStaffingGroupAllocation> staffingGroupAllocations = null;

  public CapacityPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroupAllocations = new ArrayList<CreateStaffingGroupAllocation>();
    }
  }

  
  /**
   * The name of the capacity plan
   **/
  public CapacityPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the capacity plan")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description of the capacity plan
   **/
  public CapacityPlanRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the capacity plan")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanRequest startBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("startBusinessUnitDate")
  public LocalDate getStartBusinessUnitDate() {
    return startBusinessUnitDate;
  }
  public void setStartBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
  }


  /**
   * The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanRequest endBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endBusinessUnitDate")
  public LocalDate getEndBusinessUnitDate() {
    return endBusinessUnitDate;
  }
  public void setEndBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
  }


  /**
   * The selected forecast for this capacity plan. Null when main forecast is used in the future
   **/
  public CapacityPlanRequest forecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The selected forecast for this capacity plan. Null when main forecast is used in the future")
  @JsonProperty("forecast")
  public BuShortTermForecastReference getForecast() {
    return forecast;
  }
  public void setForecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The weekly hours used to calculate full time equivalent agents
   **/
  public CapacityPlanRequest fullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekly hours used to calculate full time equivalent agents")
  @JsonProperty("fullTimeEquivalentWeeklyHours")
  public Double getFullTimeEquivalentWeeklyHours() {
    return fullTimeEquivalentWeeklyHours;
  }
  public void setFullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
  }


  /**
   * List of staffing group allocations to be used for the capacity plan
   **/
  public CapacityPlanRequest staffingGroupAllocations(List<CreateStaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of staffing group allocations to be used for the capacity plan")
  @JsonProperty("staffingGroupAllocations")
  public List<CreateStaffingGroupAllocation> getStaffingGroupAllocations() {
    return staffingGroupAllocations;
  }
  public void setStaffingGroupAllocations(List<CreateStaffingGroupAllocation> staffingGroupAllocations) {
    this.staffingGroupAllocations = staffingGroupAllocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanRequest capacityPlanRequest = (CapacityPlanRequest) o;

    return Objects.equals(this.name, capacityPlanRequest.name) &&
            Objects.equals(this.description, capacityPlanRequest.description) &&
            Objects.equals(this.startBusinessUnitDate, capacityPlanRequest.startBusinessUnitDate) &&
            Objects.equals(this.endBusinessUnitDate, capacityPlanRequest.endBusinessUnitDate) &&
            Objects.equals(this.forecast, capacityPlanRequest.forecast) &&
            Objects.equals(this.fullTimeEquivalentWeeklyHours, capacityPlanRequest.fullTimeEquivalentWeeklyHours) &&
            Objects.equals(this.staffingGroupAllocations, capacityPlanRequest.staffingGroupAllocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startBusinessUnitDate, endBusinessUnitDate, forecast, fullTimeEquivalentWeeklyHours, staffingGroupAllocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startBusinessUnitDate: ").append(toIndentedString(startBusinessUnitDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    fullTimeEquivalentWeeklyHours: ").append(toIndentedString(fullTimeEquivalentWeeklyHours)).append("\n");
    sb.append("    staffingGroupAllocations: ").append(toIndentedString(staffingGroupAllocations)).append("\n");
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

