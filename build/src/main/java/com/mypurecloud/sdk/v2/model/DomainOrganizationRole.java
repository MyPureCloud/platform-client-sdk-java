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
import com.mypurecloud.sdk.v2.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DomainOrganizationRole
 */

public class DomainOrganizationRole  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String defaultRoleId = null;
  private List<String> permissions = new ArrayList<String>();
  private List<String> unusedPermissions = new ArrayList<String>();
  private List<DomainPermissionPolicy> permissionPolicies = new ArrayList<DomainPermissionPolicy>();
  private Integer userCount = null;
  private Boolean roleNeedsUpdate = null;
  private Boolean _default = null;
  private Boolean base = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DomainOrganizationRole name(String name) {
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
   **/
  public DomainOrganizationRole description(String description) {
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
  public DomainOrganizationRole defaultRoleId(String defaultRoleId) {
    this.defaultRoleId = defaultRoleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultRoleId")
  public String getDefaultRoleId() {
    return defaultRoleId;
  }
  public void setDefaultRoleId(String defaultRoleId) {
    this.defaultRoleId = defaultRoleId;
  }

  
  /**
   **/
  public DomainOrganizationRole permissions(List<String> permissions) {
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

  
  @ApiModelProperty(example = "null", value = "A collection of the permissions the role is not using")
  @JsonProperty("unusedPermissions")
  public List<String> getUnusedPermissions() {
    return unusedPermissions;
  }

  
  /**
   **/
  public DomainOrganizationRole permissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
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

  
  /**
   **/
  public DomainOrganizationRole userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  
  /**
   * Optional unless patch operation.
   **/
  public DomainOrganizationRole roleNeedsUpdate(Boolean roleNeedsUpdate) {
    this.roleNeedsUpdate = roleNeedsUpdate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unless patch operation.")
  @JsonProperty("roleNeedsUpdate")
  public Boolean getRoleNeedsUpdate() {
    return roleNeedsUpdate;
  }
  public void setRoleNeedsUpdate(Boolean roleNeedsUpdate) {
    this.roleNeedsUpdate = roleNeedsUpdate;
  }

  
  /**
   **/
  public DomainOrganizationRole _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  
  /**
   **/
  public DomainOrganizationRole base(Boolean base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("base")
  public Boolean getBase() {
    return base;
  }
  public void setBase(Boolean base) {
    this.base = base;
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
    DomainOrganizationRole domainOrganizationRole = (DomainOrganizationRole) o;
    return Objects.equals(this.id, domainOrganizationRole.id) &&
        Objects.equals(this.name, domainOrganizationRole.name) &&
        Objects.equals(this.description, domainOrganizationRole.description) &&
        Objects.equals(this.defaultRoleId, domainOrganizationRole.defaultRoleId) &&
        Objects.equals(this.permissions, domainOrganizationRole.permissions) &&
        Objects.equals(this.unusedPermissions, domainOrganizationRole.unusedPermissions) &&
        Objects.equals(this.permissionPolicies, domainOrganizationRole.permissionPolicies) &&
        Objects.equals(this.userCount, domainOrganizationRole.userCount) &&
        Objects.equals(this.roleNeedsUpdate, domainOrganizationRole.roleNeedsUpdate) &&
        Objects.equals(this._default, domainOrganizationRole._default) &&
        Objects.equals(this.base, domainOrganizationRole.base) &&
        Objects.equals(this.selfUri, domainOrganizationRole.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultRoleId, permissions, unusedPermissions, permissionPolicies, userCount, roleNeedsUpdate, _default, base, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrganizationRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultRoleId: ").append(toIndentedString(defaultRoleId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    unusedPermissions: ").append(toIndentedString(unusedPermissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    roleNeedsUpdate: ").append(toIndentedString(roleNeedsUpdate)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
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

