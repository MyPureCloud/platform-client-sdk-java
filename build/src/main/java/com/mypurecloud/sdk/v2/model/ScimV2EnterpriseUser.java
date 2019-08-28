package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Manager;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SCIM Enterprise User
 */
@ApiModel(description = "SCIM Enterprise User")

public class ScimV2EnterpriseUser  implements Serializable {
  
  private String division = null;
  private String department = null;
  private Manager manager = null;

  
  /**
   * The division that the user belongs to.
   **/
  public ScimV2EnterpriseUser division(String division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division that the user belongs to.")
  @JsonProperty("division")
  public String getDivision() {
    return division;
  }
  public void setDivision(String division) {
    this.division = division;
  }

  
  /**
   * The department that the user belongs to.
   **/
  public ScimV2EnterpriseUser department(String department) {
    this.department = department;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The department that the user belongs to.")
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  
  /**
   * The user's manager.
   **/
  public ScimV2EnterpriseUser manager(Manager manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's manager.")
  @JsonProperty("manager")
  public Manager getManager() {
    return manager;
  }
  public void setManager(Manager manager) {
    this.manager = manager;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2EnterpriseUser scimV2EnterpriseUser = (ScimV2EnterpriseUser) o;
    return Objects.equals(this.division, scimV2EnterpriseUser.division) &&
        Objects.equals(this.department, scimV2EnterpriseUser.department) &&
        Objects.equals(this.manager, scimV2EnterpriseUser.manager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, department, manager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2EnterpriseUser {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

