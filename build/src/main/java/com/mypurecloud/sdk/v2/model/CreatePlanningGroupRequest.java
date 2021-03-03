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
import com.mypurecloud.sdk.v2.model.RoutePathRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreatePlanningGroupRequest
 */

public class CreatePlanningGroupRequest  implements Serializable {
  
  private String name = null;
  private List<RoutePathRequest> routePaths = new ArrayList<RoutePathRequest>();
  private String serviceGoalTemplateId = null;

  
  /**
   * The name of the planning group
   **/
  public CreatePlanningGroupRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the planning group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Set of route paths to associate with the planning group
   **/
  public CreatePlanningGroupRequest routePaths(List<RoutePathRequest> routePaths) {
    this.routePaths = routePaths;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Set of route paths to associate with the planning group")
  @JsonProperty("routePaths")
  public List<RoutePathRequest> getRoutePaths() {
    return routePaths;
  }
  public void setRoutePaths(List<RoutePathRequest> routePaths) {
    this.routePaths = routePaths;
  }

  
  /**
   * The ID of the service goal template to associate with this planning group
   **/
  public CreatePlanningGroupRequest serviceGoalTemplateId(String serviceGoalTemplateId) {
    this.serviceGoalTemplateId = serviceGoalTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the service goal template to associate with this planning group")
  @JsonProperty("serviceGoalTemplateId")
  public String getServiceGoalTemplateId() {
    return serviceGoalTemplateId;
  }
  public void setServiceGoalTemplateId(String serviceGoalTemplateId) {
    this.serviceGoalTemplateId = serviceGoalTemplateId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlanningGroupRequest createPlanningGroupRequest = (CreatePlanningGroupRequest) o;
    return Objects.equals(this.name, createPlanningGroupRequest.name) &&
        Objects.equals(this.routePaths, createPlanningGroupRequest.routePaths) &&
        Objects.equals(this.serviceGoalTemplateId, createPlanningGroupRequest.serviceGoalTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, routePaths, serviceGoalTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlanningGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routePaths: ").append(toIndentedString(routePaths)).append("\n");
    sb.append("    serviceGoalTemplateId: ").append(toIndentedString(serviceGoalTemplateId)).append("\n");
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

