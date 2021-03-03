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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DomainPermission
 */

public class DomainPermission  implements Serializable {
  
  private String domain = null;
  private String entityType = null;
  private String action = null;
  private String label = null;
  private Boolean allowsConditions = null;
  private Boolean divisionAware = null;

  
  /**
   **/
  public DomainPermission domain(String domain) {
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
  public DomainPermission entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  
  /**
   **/
  public DomainPermission action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  public DomainPermission label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  public DomainPermission allowsConditions(Boolean allowsConditions) {
    this.allowsConditions = allowsConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowsConditions")
  public Boolean getAllowsConditions() {
    return allowsConditions;
  }
  public void setAllowsConditions(Boolean allowsConditions) {
    this.allowsConditions = allowsConditions;
  }

  
  /**
   **/
  public DomainPermission divisionAware(Boolean divisionAware) {
    this.divisionAware = divisionAware;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionAware")
  public Boolean getDivisionAware() {
    return divisionAware;
  }
  public void setDivisionAware(Boolean divisionAware) {
    this.divisionAware = divisionAware;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPermission domainPermission = (DomainPermission) o;
    return Objects.equals(this.domain, domainPermission.domain) &&
        Objects.equals(this.entityType, domainPermission.entityType) &&
        Objects.equals(this.action, domainPermission.action) &&
        Objects.equals(this.label, domainPermission.label) &&
        Objects.equals(this.allowsConditions, domainPermission.allowsConditions) &&
        Objects.equals(this.divisionAware, domainPermission.divisionAware);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, entityType, action, label, allowsConditions, divisionAware);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermission {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    allowsConditions: ").append(toIndentedString(allowsConditions)).append("\n");
    sb.append("    divisionAware: ").append(toIndentedString(divisionAware)).append("\n");
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

