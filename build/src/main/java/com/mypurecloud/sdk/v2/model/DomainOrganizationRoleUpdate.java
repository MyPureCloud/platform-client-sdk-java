package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * DomainOrganizationRoleUpdate
 */

public class DomainOrganizationRoleUpdate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<String> permissions = null;
  private List<DomainPermissionPolicy> permissionPolicies = null;
  private String selfUri = null;

  public DomainOrganizationRoleUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      permissions = new ArrayList<String>();
      permissionPolicies = new ArrayList<DomainPermissionPolicy>();
    }
  }

  
  /**
   * role id
   **/
  public DomainOrganizationRoleUpdate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "role id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the role
   **/
  public DomainOrganizationRoleUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the role")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public DomainOrganizationRoleUpdate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public DomainOrganizationRoleUpdate permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  /**
   **/
  public DomainOrganizationRoleUpdate permissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissionPolicies")
  public List<DomainPermissionPolicy> getPermissionPolicies() {
    return permissionPolicies;
  }
  public void setPermissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
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
    DomainOrganizationRoleUpdate domainOrganizationRoleUpdate = (DomainOrganizationRoleUpdate) o;

    return Objects.equals(this.id, domainOrganizationRoleUpdate.id) &&
            Objects.equals(this.name, domainOrganizationRoleUpdate.name) &&
            Objects.equals(this.description, domainOrganizationRoleUpdate.description) &&
            Objects.equals(this.permissions, domainOrganizationRoleUpdate.permissions) &&
            Objects.equals(this.permissionPolicies, domainOrganizationRoleUpdate.permissionPolicies) &&
            Objects.equals(this.selfUri, domainOrganizationRoleUpdate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, permissions, permissionPolicies, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrganizationRoleUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
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

