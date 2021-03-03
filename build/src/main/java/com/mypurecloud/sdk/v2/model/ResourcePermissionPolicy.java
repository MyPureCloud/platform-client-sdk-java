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
import com.mypurecloud.sdk.v2.model.ResourceConditionNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ResourcePermissionPolicy
 */

public class ResourcePermissionPolicy  implements Serializable {
  
  private String id = null;
  private String domain = null;
  private String entityName = null;
  private String policyName = null;
  private String policyDescription = null;
  private String actionSetKey = null;
  private Boolean allowConditions = null;
  private ResourceConditionNode resourceConditionNode = null;
  private List<String> namedResources = new ArrayList<String>();
  private String resourceCondition = null;
  private List<String> actionSet = new ArrayList<String>();

  
  /**
   **/
  public ResourcePermissionPolicy id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ResourcePermissionPolicy domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public ResourcePermissionPolicy entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  
  /**
   **/
  public ResourcePermissionPolicy policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  
  /**
   **/
  public ResourcePermissionPolicy policyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyDescription")
  public String getPolicyDescription() {
    return policyDescription;
  }
  public void setPolicyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
  }

  
  /**
   **/
  public ResourcePermissionPolicy actionSetKey(String actionSetKey) {
    this.actionSetKey = actionSetKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionSetKey")
  public String getActionSetKey() {
    return actionSetKey;
  }
  public void setActionSetKey(String actionSetKey) {
    this.actionSetKey = actionSetKey;
  }

  
  /**
   **/
  public ResourcePermissionPolicy allowConditions(Boolean allowConditions) {
    this.allowConditions = allowConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowConditions")
  public Boolean getAllowConditions() {
    return allowConditions;
  }
  public void setAllowConditions(Boolean allowConditions) {
    this.allowConditions = allowConditions;
  }

  
  /**
   **/
  public ResourcePermissionPolicy resourceConditionNode(ResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceConditionNode")
  public ResourceConditionNode getResourceConditionNode() {
    return resourceConditionNode;
  }
  public void setResourceConditionNode(ResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
  }

  
  /**
   **/
  public ResourcePermissionPolicy namedResources(List<String> namedResources) {
    this.namedResources = namedResources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("namedResources")
  public List<String> getNamedResources() {
    return namedResources;
  }
  public void setNamedResources(List<String> namedResources) {
    this.namedResources = namedResources;
  }

  
  /**
   **/
  public ResourcePermissionPolicy resourceCondition(String resourceCondition) {
    this.resourceCondition = resourceCondition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceCondition")
  public String getResourceCondition() {
    return resourceCondition;
  }
  public void setResourceCondition(String resourceCondition) {
    this.resourceCondition = resourceCondition;
  }

  
  /**
   **/
  public ResourcePermissionPolicy actionSet(List<String> actionSet) {
    this.actionSet = actionSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionSet")
  public List<String> getActionSet() {
    return actionSet;
  }
  public void setActionSet(List<String> actionSet) {
    this.actionSet = actionSet;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcePermissionPolicy resourcePermissionPolicy = (ResourcePermissionPolicy) o;
    return Objects.equals(this.id, resourcePermissionPolicy.id) &&
        Objects.equals(this.domain, resourcePermissionPolicy.domain) &&
        Objects.equals(this.entityName, resourcePermissionPolicy.entityName) &&
        Objects.equals(this.policyName, resourcePermissionPolicy.policyName) &&
        Objects.equals(this.policyDescription, resourcePermissionPolicy.policyDescription) &&
        Objects.equals(this.actionSetKey, resourcePermissionPolicy.actionSetKey) &&
        Objects.equals(this.allowConditions, resourcePermissionPolicy.allowConditions) &&
        Objects.equals(this.resourceConditionNode, resourcePermissionPolicy.resourceConditionNode) &&
        Objects.equals(this.namedResources, resourcePermissionPolicy.namedResources) &&
        Objects.equals(this.resourceCondition, resourcePermissionPolicy.resourceCondition) &&
        Objects.equals(this.actionSet, resourcePermissionPolicy.actionSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, entityName, policyName, policyDescription, actionSetKey, allowConditions, resourceConditionNode, namedResources, resourceCondition, actionSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePermissionPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    actionSetKey: ").append(toIndentedString(actionSetKey)).append("\n");
    sb.append("    allowConditions: ").append(toIndentedString(allowConditions)).append("\n");
    sb.append("    resourceConditionNode: ").append(toIndentedString(resourceConditionNode)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    resourceCondition: ").append(toIndentedString(resourceCondition)).append("\n");
    sb.append("    actionSet: ").append(toIndentedString(actionSet)).append("\n");
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

