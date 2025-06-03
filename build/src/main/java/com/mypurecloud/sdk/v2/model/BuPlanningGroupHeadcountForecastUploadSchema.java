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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuPlanningGroupHeadcountForecastUploadSchema
 */

public class BuPlanningGroupHeadcountForecastUploadSchema  implements Serializable {
  
  private List<Double> requiredPerInterval = null;
  private List<Double> requiredWithoutShrinkagePerInterval = null;
  private String planningGroupId = null;

  public BuPlanningGroupHeadcountForecastUploadSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requiredPerInterval = new ArrayList<Double>();
      requiredWithoutShrinkagePerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * Required headcount per interval, referenced against the reference start date
   **/
  public BuPlanningGroupHeadcountForecastUploadSchema requiredPerInterval(List<Double> requiredPerInterval) {
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
  public BuPlanningGroupHeadcountForecastUploadSchema requiredWithoutShrinkagePerInterval(List<Double> requiredWithoutShrinkagePerInterval) {
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
   * The ID of the planning group to which this portion of the headcount forecast applies
   **/
  public BuPlanningGroupHeadcountForecastUploadSchema planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which this portion of the headcount forecast applies")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuPlanningGroupHeadcountForecastUploadSchema buPlanningGroupHeadcountForecastUploadSchema = (BuPlanningGroupHeadcountForecastUploadSchema) o;

    return Objects.equals(this.requiredPerInterval, buPlanningGroupHeadcountForecastUploadSchema.requiredPerInterval) &&
            Objects.equals(this.requiredWithoutShrinkagePerInterval, buPlanningGroupHeadcountForecastUploadSchema.requiredWithoutShrinkagePerInterval) &&
            Objects.equals(this.planningGroupId, buPlanningGroupHeadcountForecastUploadSchema.planningGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPerInterval, requiredWithoutShrinkagePerInterval, planningGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuPlanningGroupHeadcountForecastUploadSchema {\n");
    
    sb.append("    requiredPerInterval: ").append(toIndentedString(requiredPerInterval)).append("\n");
    sb.append("    requiredWithoutShrinkagePerInterval: ").append(toIndentedString(requiredWithoutShrinkagePerInterval)).append("\n");
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
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

