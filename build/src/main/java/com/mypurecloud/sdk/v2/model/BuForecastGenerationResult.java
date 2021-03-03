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
import com.mypurecloud.sdk.v2.model.BuForecastGenerationPlanningGroupResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastGenerationResult
 */

public class BuForecastGenerationResult  implements Serializable {
  
  private List<BuForecastGenerationPlanningGroupResult> planningGroupResults = new ArrayList<BuForecastGenerationPlanningGroupResult>();

  
  /**
   * Generation results, broken down by planning group
   **/
  public BuForecastGenerationResult planningGroupResults(List<BuForecastGenerationPlanningGroupResult> planningGroupResults) {
    this.planningGroupResults = planningGroupResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generation results, broken down by planning group")
  @JsonProperty("planningGroupResults")
  public List<BuForecastGenerationPlanningGroupResult> getPlanningGroupResults() {
    return planningGroupResults;
  }
  public void setPlanningGroupResults(List<BuForecastGenerationPlanningGroupResult> planningGroupResults) {
    this.planningGroupResults = planningGroupResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastGenerationResult buForecastGenerationResult = (BuForecastGenerationResult) o;
    return Objects.equals(this.planningGroupResults, buForecastGenerationResult.planningGroupResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastGenerationResult {\n");
    
    sb.append("    planningGroupResults: ").append(toIndentedString(planningGroupResults)).append("\n");
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

