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
import com.mypurecloud.sdk.v2.model.ManagementUnitUserListing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuUserListing
 */

public class BuUserListing  implements Serializable {
  
  private List<ManagementUnitUserListing> managementUnits = null;

  public BuUserListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      managementUnits = new ArrayList<ManagementUnitUserListing>();
    }
  }

  public BuUserListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      managementUnits = new ArrayList<ManagementUnitUserListing>();
    }
  }

  
  /**
   * Management units and their associated users
   **/
  public BuUserListing managementUnits(List<ManagementUnitUserListing> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Management units and their associated users")
  @JsonProperty("managementUnits")
  public List<ManagementUnitUserListing> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<ManagementUnitUserListing> managementUnits) {
    this.managementUnits = managementUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuUserListing buUserListing = (BuUserListing) o;

    return Objects.equals(this.managementUnits, buUserListing.managementUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuUserListing {\n");
    
    sb.append("    managementUnits: ").append(toIndentedString(managementUnits)).append("\n");
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

