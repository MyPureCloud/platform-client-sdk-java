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
import com.mypurecloud.sdk.v2.model.SetWrapperRoutePathRequest;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdatePlanningGroupRequest
 */

public class UpdatePlanningGroupRequest  implements Serializable {
  
  private String name = null;
  private SetWrapperRoutePathRequest routePaths = null;
  private String serviceGoalTemplateId = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The name of the planning group
   **/
  public UpdatePlanningGroupRequest name(String name) {
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
   * Set of route paths to associate with the planning group
   **/
  public UpdatePlanningGroupRequest routePaths(SetWrapperRoutePathRequest routePaths) {
    this.routePaths = routePaths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of route paths to associate with the planning group")
  @JsonProperty("routePaths")
  public SetWrapperRoutePathRequest getRoutePaths() {
    return routePaths;
  }
  public void setRoutePaths(SetWrapperRoutePathRequest routePaths) {
    this.routePaths = routePaths;
  }

  
  /**
   * The ID of the service goal template to associate with this planning group
   **/
  public UpdatePlanningGroupRequest serviceGoalTemplateId(String serviceGoalTemplateId) {
    this.serviceGoalTemplateId = serviceGoalTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the service goal template to associate with this planning group")
  @JsonProperty("serviceGoalTemplateId")
  public String getServiceGoalTemplateId() {
    return serviceGoalTemplateId;
  }
  public void setServiceGoalTemplateId(String serviceGoalTemplateId) {
    this.serviceGoalTemplateId = serviceGoalTemplateId;
  }

  
  /**
   * Version metadata for the planning group
   **/
  public UpdatePlanningGroupRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the planning group")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlanningGroupRequest updatePlanningGroupRequest = (UpdatePlanningGroupRequest) o;
    return Objects.equals(this.name, updatePlanningGroupRequest.name) &&
        Objects.equals(this.routePaths, updatePlanningGroupRequest.routePaths) &&
        Objects.equals(this.serviceGoalTemplateId, updatePlanningGroupRequest.serviceGoalTemplateId) &&
        Objects.equals(this.metadata, updatePlanningGroupRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, routePaths, serviceGoalTemplateId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlanningGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routePaths: ").append(toIndentedString(routePaths)).append("\n");
    sb.append("    serviceGoalTemplateId: ").append(toIndentedString(serviceGoalTemplateId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

