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
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DomainOrgRoleDifference
 */

public class DomainOrgRoleDifference  implements Serializable {
  
  private List<DomainPermissionPolicy> removedPermissionPolicies = new ArrayList<DomainPermissionPolicy>();
  private List<DomainPermissionPolicy> addedPermissionPolicies = new ArrayList<DomainPermissionPolicy>();
  private List<DomainPermissionPolicy> samePermissionPolicies = new ArrayList<DomainPermissionPolicy>();
  private DomainOrganizationRole userOrgRole = null;
  private DomainOrganizationRole roleFromDefault = null;

  
  /**
   **/
  public DomainOrgRoleDifference removedPermissionPolicies(List<DomainPermissionPolicy> removedPermissionPolicies) {
    this.removedPermissionPolicies = removedPermissionPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removedPermissionPolicies")
  public List<DomainPermissionPolicy> getRemovedPermissionPolicies() {
    return removedPermissionPolicies;
  }
  public void setRemovedPermissionPolicies(List<DomainPermissionPolicy> removedPermissionPolicies) {
    this.removedPermissionPolicies = removedPermissionPolicies;
  }

  
  /**
   **/
  public DomainOrgRoleDifference addedPermissionPolicies(List<DomainPermissionPolicy> addedPermissionPolicies) {
    this.addedPermissionPolicies = addedPermissionPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addedPermissionPolicies")
  public List<DomainPermissionPolicy> getAddedPermissionPolicies() {
    return addedPermissionPolicies;
  }
  public void setAddedPermissionPolicies(List<DomainPermissionPolicy> addedPermissionPolicies) {
    this.addedPermissionPolicies = addedPermissionPolicies;
  }

  
  /**
   **/
  public DomainOrgRoleDifference samePermissionPolicies(List<DomainPermissionPolicy> samePermissionPolicies) {
    this.samePermissionPolicies = samePermissionPolicies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("samePermissionPolicies")
  public List<DomainPermissionPolicy> getSamePermissionPolicies() {
    return samePermissionPolicies;
  }
  public void setSamePermissionPolicies(List<DomainPermissionPolicy> samePermissionPolicies) {
    this.samePermissionPolicies = samePermissionPolicies;
  }

  
  /**
   **/
  public DomainOrgRoleDifference userOrgRole(DomainOrganizationRole userOrgRole) {
    this.userOrgRole = userOrgRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userOrgRole")
  public DomainOrganizationRole getUserOrgRole() {
    return userOrgRole;
  }
  public void setUserOrgRole(DomainOrganizationRole userOrgRole) {
    this.userOrgRole = userOrgRole;
  }

  
  /**
   **/
  public DomainOrgRoleDifference roleFromDefault(DomainOrganizationRole roleFromDefault) {
    this.roleFromDefault = roleFromDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roleFromDefault")
  public DomainOrganizationRole getRoleFromDefault() {
    return roleFromDefault;
  }
  public void setRoleFromDefault(DomainOrganizationRole roleFromDefault) {
    this.roleFromDefault = roleFromDefault;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainOrgRoleDifference domainOrgRoleDifference = (DomainOrgRoleDifference) o;
    return Objects.equals(this.removedPermissionPolicies, domainOrgRoleDifference.removedPermissionPolicies) &&
        Objects.equals(this.addedPermissionPolicies, domainOrgRoleDifference.addedPermissionPolicies) &&
        Objects.equals(this.samePermissionPolicies, domainOrgRoleDifference.samePermissionPolicies) &&
        Objects.equals(this.userOrgRole, domainOrgRoleDifference.userOrgRole) &&
        Objects.equals(this.roleFromDefault, domainOrgRoleDifference.roleFromDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedPermissionPolicies, addedPermissionPolicies, samePermissionPolicies, userOrgRole, roleFromDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrgRoleDifference {\n");
    
    sb.append("    removedPermissionPolicies: ").append(toIndentedString(removedPermissionPolicies)).append("\n");
    sb.append("    addedPermissionPolicies: ").append(toIndentedString(addedPermissionPolicies)).append("\n");
    sb.append("    samePermissionPolicies: ").append(toIndentedString(samePermissionPolicies)).append("\n");
    sb.append("    userOrgRole: ").append(toIndentedString(userOrgRole)).append("\n");
    sb.append("    roleFromDefault: ").append(toIndentedString(roleFromDefault)).append("\n");
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

