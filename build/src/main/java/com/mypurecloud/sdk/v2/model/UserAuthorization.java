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
import com.mypurecloud.sdk.v2.model.DomainRole;
import com.mypurecloud.sdk.v2.model.ResourcePermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserAuthorization
 */

public class UserAuthorization  implements Serializable {
  
  private List<DomainRole> roles = new ArrayList<DomainRole>();
  private List<DomainRole> unusedRoles = new ArrayList<DomainRole>();
  private List<String> permissions = new ArrayList<String>();
  private List<ResourcePermissionPolicy> permissionPolicies = new ArrayList<ResourcePermissionPolicy>();

  
  /**
   **/
  public UserAuthorization roles(List<DomainRole> roles) {
    this.roles = roles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roles")
  public List<DomainRole> getRoles() {
    return roles;
  }
  public void setRoles(List<DomainRole> roles) {
    this.roles = roles;
  }

  
  @ApiModelProperty(example = "null", value = "A collection of the roles the user is not using")
  @JsonProperty("unusedRoles")
  public List<DomainRole> getUnusedRoles() {
    return unusedRoles;
  }

  
  @ApiModelProperty(example = "null", value = "A collection of the permissions granted by all assigned roles")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  
  @ApiModelProperty(example = "null", value = "The policies configured for assigned permissions.")
  @JsonProperty("permissionPolicies")
  public List<ResourcePermissionPolicy> getPermissionPolicies() {
    return permissionPolicies;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthorization userAuthorization = (UserAuthorization) o;
    return Objects.equals(this.roles, userAuthorization.roles) &&
        Objects.equals(this.unusedRoles, userAuthorization.unusedRoles) &&
        Objects.equals(this.permissions, userAuthorization.permissions) &&
        Objects.equals(this.permissionPolicies, userAuthorization.permissionPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, unusedRoles, permissions, permissionPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorization {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    unusedRoles: ").append(toIndentedString(unusedRoles)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
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

