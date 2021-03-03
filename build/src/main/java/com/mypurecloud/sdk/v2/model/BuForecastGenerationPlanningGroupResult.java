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
import com.mypurecloud.sdk.v2.model.BuForecastTimeSeriesResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastGenerationPlanningGroupResult
 */

public class BuForecastGenerationPlanningGroupResult  implements Serializable {
  
  private String planningGroupId = null;
  private List<BuForecastTimeSeriesResult> metricResults = new ArrayList<BuForecastTimeSeriesResult>();

  
  /**
   * The ID of the planning group
   **/
  public BuForecastGenerationPlanningGroupResult planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the planning group")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }

  
  /**
   * The generation results for the associated planning group
   **/
  public BuForecastGenerationPlanningGroupResult metricResults(List<BuForecastTimeSeriesResult> metricResults) {
    this.metricResults = metricResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generation results for the associated planning group")
  @JsonProperty("metricResults")
  public List<BuForecastTimeSeriesResult> getMetricResults() {
    return metricResults;
  }
  public void setMetricResults(List<BuForecastTimeSeriesResult> metricResults) {
    this.metricResults = metricResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastGenerationPlanningGroupResult buForecastGenerationPlanningGroupResult = (BuForecastGenerationPlanningGroupResult) o;
    return Objects.equals(this.planningGroupId, buForecastGenerationPlanningGroupResult.planningGroupId) &&
        Objects.equals(this.metricResults, buForecastGenerationPlanningGroupResult.metricResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, metricResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastGenerationPlanningGroupResult {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    metricResults: ").append(toIndentedString(metricResults)).append("\n");
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

