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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReschedulingManagementUnitResponse
 */

public class ReschedulingManagementUnitResponse  implements Serializable {
  
  private ManagementUnitReference managementUnit = null;
  private Boolean applied = null;

  
  /**
   * The management unit
   **/
  public ReschedulingManagementUnitResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }

  
  /**
   * Whether the rescheduling run is applied for the given management unit
   **/
  public ReschedulingManagementUnitResponse applied(Boolean applied) {
    this.applied = applied;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the rescheduling run is applied for the given management unit")
  @JsonProperty("applied")
  public Boolean getApplied() {
    return applied;
  }
  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReschedulingManagementUnitResponse reschedulingManagementUnitResponse = (ReschedulingManagementUnitResponse) o;
    return Objects.equals(this.managementUnit, reschedulingManagementUnitResponse.managementUnit) &&
        Objects.equals(this.applied, reschedulingManagementUnitResponse.applied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, applied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReschedulingManagementUnitResponse {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
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

