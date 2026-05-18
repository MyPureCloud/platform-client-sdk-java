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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ManagementUnitUserListing
 */

public class ManagementUnitUserListing  implements Serializable {
  
  private ManagementUnitReference managementUnit = null;
  private List<UserReference> users = null;

  public ManagementUnitUserListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<UserReference>();
    }
  }

  public ManagementUnitUserListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      users = new ArrayList<UserReference>();
    }
  }

  
  /**
   * The management unit associated with the users
   **/
  public ManagementUnitUserListing managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit associated with the users")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * Users in the management unit
   **/
  public ManagementUnitUserListing users(List<UserReference> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Users in the management unit")
  @JsonProperty("users")
  public List<UserReference> getUsers() {
    return users;
  }
  public void setUsers(List<UserReference> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementUnitUserListing managementUnitUserListing = (ManagementUnitUserListing) o;

    return Objects.equals(this.managementUnit, managementUnitUserListing.managementUnit) &&
            Objects.equals(this.users, managementUnitUserListing.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnitUserListing {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

