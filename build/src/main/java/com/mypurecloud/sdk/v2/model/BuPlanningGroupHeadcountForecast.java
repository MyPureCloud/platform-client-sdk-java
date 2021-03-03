package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuPlanningGroupHeadcountForecast
 */

public class BuPlanningGroupHeadcountForecast  implements Serializable {
  
  private PlanningGroupReference planningGroup = null;
  private List<Double> requiredPerInterval = new ArrayList<Double>();
  private List<Double> requiredWithoutShrinkagePerInterval = new ArrayList<Double>();

  
  /**
   * The planning group to which this portion of the headcount forecast applies
   **/
  public BuPlanningGroupHeadcountForecast planningGroup(PlanningGroupReference planningGroup) {
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

  
  /**
   * Required headcount per interval, referenced against the reference start date
   **/
  public BuPlanningGroupHeadcountForecast requiredPerInterval(List<Double> requiredPerInterval) {
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
  public BuPlanningGroupHeadcountForecast requiredWithoutShrinkagePerInterval(List<Double> requiredWithoutShrinkagePerInterval) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuPlanningGroupHeadcountForecast buPlanningGroupHeadcountForecast = (BuPlanningGroupHeadcountForecast) o;
    return Objects.equals(this.planningGroup, buPlanningGroupHeadcountForecast.planningGroup) &&
        Objects.equals(this.requiredPerInterval, buPlanningGroupHeadcountForecast.requiredPerInterval) &&
        Objects.equals(this.requiredWithoutShrinkagePerInterval, buPlanningGroupHeadcountForecast.requiredWithoutShrinkagePerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroup, requiredPerInterval, requiredWithoutShrinkagePerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuPlanningGroupHeadcountForecast {\n");
    
    sb.append("    planningGroup: ").append(toIndentedString(planningGroup)).append("\n");
    sb.append("    requiredPerInterval: ").append(toIndentedString(requiredPerInterval)).append("\n");
    sb.append("    requiredWithoutShrinkagePerInterval: ").append(toIndentedString(requiredWithoutShrinkagePerInterval)).append("\n");
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

