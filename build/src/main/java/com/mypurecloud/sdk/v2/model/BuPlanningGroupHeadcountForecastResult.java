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
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuPlanningGroupHeadcountForecastResult
 */

public class BuPlanningGroupHeadcountForecastResult  implements Serializable {
  
  private List<Double> requiredPerInterval = null;
  private List<Double> requiredWithoutShrinkagePerInterval = null;
  private PlanningGroupReference planningGroup = null;

  public BuPlanningGroupHeadcountForecastResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requiredPerInterval = new ArrayList<Double>();
      requiredWithoutShrinkagePerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * Required headcount per interval, referenced against the reference start date
   **/
  public BuPlanningGroupHeadcountForecastResult requiredPerInterval(List<Double> requiredPerInterval) {
    this.requiredPerInterval = requiredPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headcount per interval, referenced against the reference start date")
  @JsonProperty("requiredPerInterval")
  public List<Double> getRequiredPerInterval() {
    return requiredPerInterval;
  }
  public void setRequiredPerInterval(List<Double> requiredPerInterval) {
    this.requiredPerInterval = requiredPerInterval;
  }


  /**
   * Required headcount per interval without accounting for shrinkage, referenced against the reference start date
   **/
  public BuPlanningGroupHeadcountForecastResult requiredWithoutShrinkagePerInterval(List<Double> requiredWithoutShrinkagePerInterval) {
    this.requiredWithoutShrinkagePerInterval = requiredWithoutShrinkagePerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headcount per interval without accounting for shrinkage, referenced against the reference start date")
  @JsonProperty("requiredWithoutShrinkagePerInterval")
  public List<Double> getRequiredWithoutShrinkagePerInterval() {
    return requiredWithoutShrinkagePerInterval;
  }
  public void setRequiredWithoutShrinkagePerInterval(List<Double> requiredWithoutShrinkagePerInterval) {
    this.requiredWithoutShrinkagePerInterval = requiredWithoutShrinkagePerInterval;
  }


  /**
   * The planning group to which this portion of the headcount forecast applies
   **/
  public BuPlanningGroupHeadcountForecastResult planningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group to which this portion of the headcount forecast applies")
  @JsonProperty("planningGroup")
  public PlanningGroupReference getPlanningGroup() {
    return planningGroup;
  }
  public void setPlanningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuPlanningGroupHeadcountForecastResult buPlanningGroupHeadcountForecastResult = (BuPlanningGroupHeadcountForecastResult) o;

    return Objects.equals(this.requiredPerInterval, buPlanningGroupHeadcountForecastResult.requiredPerInterval) &&
            Objects.equals(this.requiredWithoutShrinkagePerInterval, buPlanningGroupHeadcountForecastResult.requiredWithoutShrinkagePerInterval) &&
            Objects.equals(this.planningGroup, buPlanningGroupHeadcountForecastResult.planningGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPerInterval, requiredWithoutShrinkagePerInterval, planningGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuPlanningGroupHeadcountForecastResult {\n");
    
    sb.append("    requiredPerInterval: ").append(toIndentedString(requiredPerInterval)).append("\n");
    sb.append("    requiredWithoutShrinkagePerInterval: ").append(toIndentedString(requiredWithoutShrinkagePerInterval)).append("\n");
    sb.append("    planningGroup: ").append(toIndentedString(planningGroup)).append("\n");
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

