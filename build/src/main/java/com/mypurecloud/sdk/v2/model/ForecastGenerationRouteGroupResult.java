package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ForecastTimeSeriesResult;
import com.mypurecloud.sdk.v2.model.RouteGroupAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ForecastGenerationRouteGroupResult
 */

public class ForecastGenerationRouteGroupResult  implements Serializable {
  
  private RouteGroupAttributes routeGroup = null;
  private List<ForecastTimeSeriesResult> metricResults = new ArrayList<ForecastTimeSeriesResult>();

  
  /**
   * The route group this result represents
   **/
  public ForecastGenerationRouteGroupResult routeGroup(RouteGroupAttributes routeGroup) {
    this.routeGroup = routeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The route group this result represents")
  @JsonProperty("routeGroup")
  public RouteGroupAttributes getRouteGroup() {
    return routeGroup;
  }
  public void setRouteGroup(RouteGroupAttributes routeGroup) {
    this.routeGroup = routeGroup;
  }

  
  /**
   * The generation results for the associated route group
   **/
  public ForecastGenerationRouteGroupResult metricResults(List<ForecastTimeSeriesResult> metricResults) {
    this.metricResults = metricResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generation results for the associated route group")
  @JsonProperty("metricResults")
  public List<ForecastTimeSeriesResult> getMetricResults() {
    return metricResults;
  }
  public void setMetricResults(List<ForecastTimeSeriesResult> metricResults) {
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
    ForecastGenerationRouteGroupResult forecastGenerationRouteGroupResult = (ForecastGenerationRouteGroupResult) o;
    return Objects.equals(this.routeGroup, forecastGenerationRouteGroupResult.routeGroup) &&
        Objects.equals(this.metricResults, forecastGenerationRouteGroupResult.metricResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeGroup, metricResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastGenerationRouteGroupResult {\n");
    
    sb.append("    routeGroup: ").append(toIndentedString(routeGroup)).append("\n");
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

