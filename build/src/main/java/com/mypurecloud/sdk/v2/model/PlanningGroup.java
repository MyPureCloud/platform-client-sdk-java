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
import com.mypurecloud.sdk.v2.model.RoutePathResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplateReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PlanningGroup
 */

public class PlanningGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ServiceGoalTemplateReference serviceGoalTemplate = null;
  private List<RoutePathResponse> routePaths = new ArrayList<RoutePathResponse>();
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public PlanningGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The ID of the service goal template associated with this planning group
   **/
  public PlanningGroup serviceGoalTemplate(ServiceGoalTemplateReference serviceGoalTemplate) {
    this.serviceGoalTemplate = serviceGoalTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the service goal template associated with this planning group")
  @JsonProperty("serviceGoalTemplate")
  public ServiceGoalTemplateReference getServiceGoalTemplate() {
    return serviceGoalTemplate;
  }
  public void setServiceGoalTemplate(ServiceGoalTemplateReference serviceGoalTemplate) {
    this.serviceGoalTemplate = serviceGoalTemplate;
  }

  
  /**
   * Set of route paths associated with the planning group
   **/
  public PlanningGroup routePaths(List<RoutePathResponse> routePaths) {
    this.routePaths = routePaths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of route paths associated with the planning group")
  @JsonProperty("routePaths")
  public List<RoutePathResponse> getRoutePaths() {
    return routePaths;
  }
  public void setRoutePaths(List<RoutePathResponse> routePaths) {
    this.routePaths = routePaths;
  }

  
  /**
   * Version metadata for the planning group
   **/
  public PlanningGroup metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the planning group")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningGroup planningGroup = (PlanningGroup) o;
    return Objects.equals(this.id, planningGroup.id) &&
        Objects.equals(this.name, planningGroup.name) &&
        Objects.equals(this.serviceGoalTemplate, planningGroup.serviceGoalTemplate) &&
        Objects.equals(this.routePaths, planningGroup.routePaths) &&
        Objects.equals(this.metadata, planningGroup.metadata) &&
        Objects.equals(this.selfUri, planningGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serviceGoalTemplate, routePaths, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceGoalTemplate: ").append(toIndentedString(serviceGoalTemplate)).append("\n");
    sb.append("    routePaths: ").append(toIndentedString(routePaths)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

