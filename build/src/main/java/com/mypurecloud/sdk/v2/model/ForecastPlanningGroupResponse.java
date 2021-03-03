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
import com.mypurecloud.sdk.v2.model.ForecastServiceGoalTemplateResponse;
import com.mypurecloud.sdk.v2.model.RoutePathResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ForecastPlanningGroupResponse
 */

public class ForecastPlanningGroupResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<RoutePathResponse> routePaths = new ArrayList<RoutePathResponse>();
  private ForecastServiceGoalTemplateResponse serviceGoalTemplate = null;

  
  /**
   * The ID of the planning group
   **/
  public ForecastPlanningGroupResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the planning group")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The name of the planning group
   **/
  public ForecastPlanningGroupResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the planning group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Route path configuration for this planning group
   **/
  public ForecastPlanningGroupResponse routePaths(List<RoutePathResponse> routePaths) {
    this.routePaths = routePaths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Route path configuration for this planning group")
  @JsonProperty("routePaths")
  public List<RoutePathResponse> getRoutePaths() {
    return routePaths;
  }
  public void setRoutePaths(List<RoutePathResponse> routePaths) {
    this.routePaths = routePaths;
  }

  
  /**
   * Service goals for this planning group
   **/
  public ForecastPlanningGroupResponse serviceGoalTemplate(ForecastServiceGoalTemplateResponse serviceGoalTemplate) {
    this.serviceGoalTemplate = serviceGoalTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service goals for this planning group")
  @JsonProperty("serviceGoalTemplate")
  public ForecastServiceGoalTemplateResponse getServiceGoalTemplate() {
    return serviceGoalTemplate;
  }
  public void setServiceGoalTemplate(ForecastServiceGoalTemplateResponse serviceGoalTemplate) {
    this.serviceGoalTemplate = serviceGoalTemplate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastPlanningGroupResponse forecastPlanningGroupResponse = (ForecastPlanningGroupResponse) o;
    return Objects.equals(this.id, forecastPlanningGroupResponse.id) &&
        Objects.equals(this.name, forecastPlanningGroupResponse.name) &&
        Objects.equals(this.routePaths, forecastPlanningGroupResponse.routePaths) &&
        Objects.equals(this.serviceGoalTemplate, forecastPlanningGroupResponse.serviceGoalTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, routePaths, serviceGoalTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastPlanningGroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routePaths: ").append(toIndentedString(routePaths)).append("\n");
    sb.append("    serviceGoalTemplate: ").append(toIndentedString(serviceGoalTemplate)).append("\n");
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

