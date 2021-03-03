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
import com.mypurecloud.sdk.v2.model.DomainResourceConditionNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DomainPermissionPolicy
 */

public class DomainPermissionPolicy  implements Serializable {
  
  private String domain = null;
  private String entityName = null;
  private String policyName = null;
  private String policyDescription = null;
  private List<String> actionSet = new ArrayList<String>();
  private List<String> namedResources = new ArrayList<String>();
  private Boolean allowConditions = null;
  private DomainResourceConditionNode resourceConditionNode = null;

  
  /**
   **/
  public DomainPermissionPolicy domain(String domain) {
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
  public DomainPermissionPolicy entityName(String entityName) {
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
  public DomainPermissionPolicy policyName(String policyName) {
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
  public DomainPermissionPolicy policyDescription(String policyDescription) {
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
  public DomainPermissionPolicy actionSet(List<String> actionSet) {
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

  
  /**
   **/
  public DomainPermissionPolicy namedResources(List<String> namedResources) {
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
  public DomainPermissionPolicy allowConditions(Boolean allowConditions) {
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
  public DomainPermissionPolicy resourceConditionNode(DomainResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceConditionNode")
  public DomainResourceConditionNode getResourceConditionNode() {
    return resourceConditionNode;
  }
  public void setResourceConditionNode(DomainResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPermissionPolicy domainPermissionPolicy = (DomainPermissionPolicy) o;
    return Objects.equals(this.domain, domainPermissionPolicy.domain) &&
        Objects.equals(this.entityName, domainPermissionPolicy.entityName) &&
        Objects.equals(this.policyName, domainPermissionPolicy.policyName) &&
        Objects.equals(this.policyDescription, domainPermissionPolicy.policyDescription) &&
        Objects.equals(this.actionSet, domainPermissionPolicy.actionSet) &&
        Objects.equals(this.namedResources, domainPermissionPolicy.namedResources) &&
        Objects.equals(this.allowConditions, domainPermissionPolicy.allowConditions) &&
        Objects.equals(this.resourceConditionNode, domainPermissionPolicy.resourceConditionNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, entityName, policyName, policyDescription, actionSet, namedResources, allowConditions, resourceConditionNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermissionPolicy {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    actionSet: ").append(toIndentedString(actionSet)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    allowConditions: ").append(toIndentedString(allowConditions)).append("\n");
    sb.append("    resourceConditionNode: ").append(toIndentedString(resourceConditionNode)).append("\n");
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

