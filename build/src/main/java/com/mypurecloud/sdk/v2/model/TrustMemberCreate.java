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
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TrustMemberCreate
 */

public class TrustMemberCreate  implements Serializable {
  
  private String id = null;
  private List<String> roleIds = new ArrayList<String>();
  private RoleDivisionGrants roleDivisions = null;

  
  /**
   * Trustee User or Group Id
   **/
  public TrustMemberCreate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Trustee User or Group Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The list of roles to be granted to this user or group. Roles will be granted in all divisions.
   **/
  public TrustMemberCreate roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of roles to be granted to this user or group. Roles will be granted in all divisions.")
  @JsonProperty("roleIds")
  public List<String> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  
  /**
   * The list of trustor organization roles granting this user or group access paired with the divisions for those roles.
   **/
  public TrustMemberCreate roleDivisions(RoleDivisionGrants roleDivisions) {
    this.roleDivisions = roleDivisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of trustor organization roles granting this user or group access paired with the divisions for those roles.")
  @JsonProperty("roleDivisions")
  public RoleDivisionGrants getRoleDivisions() {
    return roleDivisions;
  }
  public void setRoleDivisions(RoleDivisionGrants roleDivisions) {
    this.roleDivisions = roleDivisions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustMemberCreate trustMemberCreate = (TrustMemberCreate) o;
    return Objects.equals(this.id, trustMemberCreate.id) &&
        Objects.equals(this.roleIds, trustMemberCreate.roleIds) &&
        Objects.equals(this.roleDivisions, trustMemberCreate.roleDivisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleIds, roleDivisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustMemberCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    roleDivisions: ").append(toIndentedString(roleDivisions)).append("\n");
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

