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
import com.mypurecloud.sdk.v2.model.CapacityPlanMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * CapacityPlanResponse
 */

public class CapacityPlanResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private BuShortTermForecastReference forecast = null;
  private LocalDate startBusinessUnitDate = null;
  private LocalDate endBusinessUnitDate = null;
  private Double fullTimeEquivalentWeeklyHours = null;
  private CapacityPlanMetadata metadata = null;
  private String selfUri = null;

  public CapacityPlanResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CapacityPlanResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public CapacityPlanResponse description(String description) {
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
   * The selected forecast for this capacity plan. Null when main forecast is used in the future
   **/
  public CapacityPlanResponse forecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected forecast for this capacity plan. Null when main forecast is used in the future")
  @JsonProperty("forecast")
  public BuShortTermForecastReference getForecast() {
    return forecast;
  }
  public void setForecast(BuShortTermForecastReference forecast) {
    this.forecast = forecast;
  }


  /**
   * The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanResponse startBusinessUnitDate(LocalDate startBusinessUnitDate) {
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
  public CapacityPlanResponse endBusinessUnitDate(LocalDate endBusinessUnitDate) {
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
   * The weekly hours used to calculate full time equivalent agents
   **/
  public CapacityPlanResponse fullTimeEquivalentWeeklyHours(Double fullTimeEquivalentWeeklyHours) {
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
   * The metadata of this capacity plan
   **/
  public CapacityPlanResponse metadata(CapacityPlanMetadata metadata) {
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


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanResponse capacityPlanResponse = (CapacityPlanResponse) o;

    return Objects.equals(this.id, capacityPlanResponse.id) &&
            Objects.equals(this.name, capacityPlanResponse.name) &&
            Objects.equals(this.description, capacityPlanResponse.description) &&
            Objects.equals(this.forecast, capacityPlanResponse.forecast) &&
            Objects.equals(this.startBusinessUnitDate, capacityPlanResponse.startBusinessUnitDate) &&
            Objects.equals(this.endBusinessUnitDate, capacityPlanResponse.endBusinessUnitDate) &&
            Objects.equals(this.fullTimeEquivalentWeeklyHours, capacityPlanResponse.fullTimeEquivalentWeeklyHours) &&
            Objects.equals(this.metadata, capacityPlanResponse.metadata) &&
            Objects.equals(this.selfUri, capacityPlanResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, forecast, startBusinessUnitDate, endBusinessUnitDate, fullTimeEquivalentWeeklyHours, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    startBusinessUnitDate: ").append(toIndentedString(startBusinessUnitDate)).append("\n");
    sb.append("    endBusinessUnitDate: ").append(toIndentedString(endBusinessUnitDate)).append("\n");
    sb.append("    fullTimeEquivalentWeeklyHours: ").append(toIndentedString(fullTimeEquivalentWeeklyHours)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

