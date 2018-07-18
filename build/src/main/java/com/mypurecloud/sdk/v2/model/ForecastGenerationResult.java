package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ForecastGenerationRouteGroupResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ForecastGenerationResult
 */

public class ForecastGenerationResult  implements Serializable {
  
  private List<ForecastGenerationRouteGroupResult> routeGroupResults = new ArrayList<ForecastGenerationRouteGroupResult>();

  
  /**
   * Generation results, broken down by route group
   **/
  public ForecastGenerationResult routeGroupResults(List<ForecastGenerationRouteGroupResult> routeGroupResults) {
    this.routeGroupResults = routeGroupResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generation results, broken down by route group")
  @JsonProperty("routeGroupResults")
  public List<ForecastGenerationRouteGroupResult> getRouteGroupResults() {
    return routeGroupResults;
  }
  public void setRouteGroupResults(List<ForecastGenerationRouteGroupResult> routeGroupResults) {
    this.routeGroupResults = routeGroupResults;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastGenerationResult forecastGenerationResult = (ForecastGenerationResult) o;
    return Objects.equals(this.routeGroupResults, forecastGenerationResult.routeGroupResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeGroupResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastGenerationResult {\n");
    
    sb.append("    routeGroupResults: ").append(toIndentedString(routeGroupResults)).append("\n");
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

