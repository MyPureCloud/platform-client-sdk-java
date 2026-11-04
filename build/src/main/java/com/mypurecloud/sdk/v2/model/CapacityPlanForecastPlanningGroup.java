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
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastActualValues;
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastDistributionValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CapacityPlanForecastPlanningGroup
 */

public class CapacityPlanForecastPlanningGroup  implements Serializable {
  
  private String planningGroupId = null;
  private CapacityPlanForecastActualValues actual = null;
  private CapacityPlanForecastDistributionValues distribution = null;

  public CapacityPlanForecastPlanningGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CapacityPlanForecastPlanningGroup(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the planning group to which the forecast applies
   **/
  public CapacityPlanForecastPlanningGroup planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which the forecast applies")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * Absolute forecast values for offered counts and average handle time for this planning group. Exactly one of actual or distribution must be provided
   **/
  public CapacityPlanForecastPlanningGroup actual(CapacityPlanForecastActualValues actual) {
    this.actual = actual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Absolute forecast values for offered counts and average handle time for this planning group. Exactly one of actual or distribution must be provided")
  @JsonProperty("actual")
  public CapacityPlanForecastActualValues getActual() {
    return actual;
  }
  public void setActual(CapacityPlanForecastActualValues actual) {
    this.actual = actual;
  }


  /**
   * Hourly forecast distribution values for offered volume and average handle time for this planning group. Exactly one of actual or distribution must be provided
   **/
  public CapacityPlanForecastPlanningGroup distribution(CapacityPlanForecastDistributionValues distribution) {
    this.distribution = distribution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hourly forecast distribution values for offered volume and average handle time for this planning group. Exactly one of actual or distribution must be provided")
  @JsonProperty("distribution")
  public CapacityPlanForecastDistributionValues getDistribution() {
    return distribution;
  }
  public void setDistribution(CapacityPlanForecastDistributionValues distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastPlanningGroup capacityPlanForecastPlanningGroup = (CapacityPlanForecastPlanningGroup) o;

    return Objects.equals(this.planningGroupId, capacityPlanForecastPlanningGroup.planningGroupId) &&
            Objects.equals(this.actual, capacityPlanForecastPlanningGroup.actual) &&
            Objects.equals(this.distribution, capacityPlanForecastPlanningGroup.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, actual, distribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastPlanningGroup {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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

