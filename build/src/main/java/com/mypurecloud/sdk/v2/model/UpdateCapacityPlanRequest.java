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
import com.mypurecloud.sdk.v2.model.CapacityPlanMetadata;
import com.mypurecloud.sdk.v2.model.ValueWrapperBuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * UpdateCapacityPlanRequest
 */

public class UpdateCapacityPlanRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private LocalDate startBusinessUnitDate = null;
  private LocalDate endBusinessUnitDate = null;
  private ValueWrapperBuShortTermForecastReference forecast = null;
  private Double fullTimeEquivalentWeeklyHours = null;
  private Boolean useLatestPlanningGroupStaffingGroupAssociation = null;
  private CapacityPlanMetadata metadata = null;

  public UpdateCapacityPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the capacity plan
   **/
  public UpdateCapacityPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the capacity plan")
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
  public UpdateCapacityPlanRequest description(String description) {
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
  public UpdateCapacityPlanRequest startBusinessUnitDate(LocalDate startBusinessUnitDate) {
    this.startBusinessUnitDate = startBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public UpdateCapacityPlanRequest endBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endBusinessUnitDate")
  public LocalDate getEndBusinessUnitDate() {
    return endBusinessUnitDate;
  }
  public void setEndBusinessUnitDate(LocalDate endBusinessUnitDate) {
    this.endBusinessUnitDate = endBusinessUnitDate;
  }


  /**
   * The selected forecast for this capacity plan
   **/
  public UpdateCapacityPlanRequest forecast(ValueWrapperBuShortTermForecastReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected forecast for this capacity plan")
  @JsonProperty("forecast")
  public ValueWrapperBuShortTermForecastReference getForecast() {
    return forecast;
  }
  public void setForecast(ValueWrapperBuShortTermForecastReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The weekly hours used to calculate full time equivalent agents
   **/
  public UpdateCapacityPlanRequest fullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The weekly hours used to calculate full time equivalent agents")
  @JsonProperty("fullTimeEquivalentWeeklyHours")
  public Double getFullTimeEquivalentWeeklyHours() {
    return fullTimeEquivalentWeeklyHours;
  }
  public void setFullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
    this.fullTimeEquivalentWeeklyHours = fullTimeEquivalentWeeklyHours;
  }


  /**
   * Whether to use latest staffing group to planning group association
   **/
  public UpdateCapacityPlanRequest useLatestPlanningGroupStaffingGroupAssociation(Boolean useLatestPlanningGroupStaffingGroupAssociation) {
    this.useLatestPlanningGroupStaffingGroupAssociation = useLatestPlanningGroupStaffingGroupAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to use latest staffing group to planning group association")
  @JsonProperty("useLatestPlanningGroupStaffingGroupAssociation")
  public Boolean getUseLatestPlanningGroupStaffingGroupAssociation() {
    return useLatestPlanningGroupStaffingGroupAssociation;
  }
  public void setUseLatestPlanningGroupStaffingGroupAssociation(Boolean useLatestPlanningGroupStaffingGroupAssociation) {
    this.useLatestPlanningGroupStaffingGroupAssociation = useLatestPlanningGroupStaffingGroupAssociation;
  }


  /**
   * The metadata of this capacity plan
   **/
  public UpdateCapacityPlanRequest metadata(CapacityPlanMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metadata of this capacity plan")
  @JsonProperty("metadata")
  public CapacityPlanMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CapacityPlanMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCapacityPlanRequest updateCapacityPlanRequest = (UpdateCapacityPlanRequest) o;

    return Objects.equals(this.name, updateCapacityPlanRequest.name) &&
            Objects.equals(this.description, updateCapacityPlanRequest.description) &&
            Objects.equals(this.startBusinessUnitDate, updateCapacityPlanRequest.startBusinessUnitDate) &&
            Objects.equals(this.endBusinessUnitDate, updateCapacityPlanRequest.endBusinessUnitDate) &&
            Objects.equals(this.forecast, updateCapacityPlanRequest.forecast) &&
            Objects.equals(this.fullTimeEquivalentWeeklyHours, updateCapacityPlanRequest.fullTimeEquivalentWeeklyHours) &&
            Objects.equals(this.useLatestPlanningGroupStaffingGroupAssociation, updateCapacityPlanRequest.useLatestPlanningGroupStaffingGroupAssociation) &&
            Objects.equals(this.metadata, updateCapacityPlanRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startBusinessUnitDate, endBusinessUnitDate, forecast, fullTimeEquivalentWeeklyHours, useLatestPlanningGroupStaffingGroupAssociation, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCapacityPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startBusinessUnitDate: ").append(toIndentedString(startBusinessUnitDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    fullTimeEquivalentWeeklyHours: ").append(toIndentedString(fullTimeEquivalentWeeklyHours)).append("\n");
    sb.append("    useLatestPlanningGroupStaffingGroupAssociation: ").append(toIndentedString(useLatestPlanningGroupStaffingGroupAssociation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

