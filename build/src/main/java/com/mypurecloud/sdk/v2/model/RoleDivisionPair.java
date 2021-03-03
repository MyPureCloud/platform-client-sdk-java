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
 * RoleDivisionPair
 */

public class RoleDivisionPair  implements Serializable {
  
  private String roleId = null;
  private String divisionId = null;

  
  /**
   * The ID of the role
   **/
  public RoleDivisionPair roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the role")
  @JsonProperty("roleId")
  public String getRoleId() {
    return roleId;
  }
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  
  /**
   * The ID of the division
   **/
  public RoleDivisionPair divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the division")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDivisionPair roleDivisionPair = (RoleDivisionPair) o;
    return Objects.equals(this.roleId, roleDivisionPair.roleId) &&
        Objects.equals(this.divisionId, roleDivisionPair.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDivisionPair {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

