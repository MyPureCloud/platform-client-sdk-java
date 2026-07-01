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
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ForecastInputPlanningGroupData
 */

public class ForecastInputPlanningGroupData  implements Serializable {
  
  private String planningGroupId = null;
  private CapacityPlanForecastMetrics capacityPlanForecastMetrics = null;

  public ForecastInputPlanningGroupData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ForecastInputPlanningGroupData(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the planning group for which this data applies
   **/
  public ForecastInputPlanningGroupData planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group for which this data applies")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * The capacity plan forecast metrics for this planning group
   **/
  public ForecastInputPlanningGroupData capacityPlanForecastMetrics(CapacityPlanForecastMetrics capacityPlanForecastMetrics) {
    this.capacityPlanForecastMetrics = capacityPlanForecastMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity plan forecast metrics for this planning group")
  @JsonProperty("capacityPlanForecastMetrics")
  public CapacityPlanForecastMetrics getCapacityPlanForecastMetrics() {
    return capacityPlanForecastMetrics;
  }
  public void setCapacityPlanForecastMetrics(CapacityPlanForecastMetrics capacityPlanForecastMetrics) {
    this.capacityPlanForecastMetrics = capacityPlanForecastMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastInputPlanningGroupData forecastInputPlanningGroupData = (ForecastInputPlanningGroupData) o;

    return Objects.equals(this.planningGroupId, forecastInputPlanningGroupData.planningGroupId) &&
            Objects.equals(this.capacityPlanForecastMetrics, forecastInputPlanningGroupData.capacityPlanForecastMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, capacityPlanForecastMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastInputPlanningGroupData {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    capacityPlanForecastMetrics: ").append(toIndentedString(capacityPlanForecastMetrics)).append("\n");
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

