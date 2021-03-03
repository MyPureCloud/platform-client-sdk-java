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
import com.mypurecloud.sdk.v2.model.PatchBuReschedulingOptionsManagementUnitRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PatchBuReschedulingOptionsRequest
 */

public class PatchBuReschedulingOptionsRequest  implements Serializable {
  
  private List<PatchBuReschedulingOptionsManagementUnitRequest> managementUnits = new ArrayList<PatchBuReschedulingOptionsManagementUnitRequest>();

  
  /**
   * Per-management unit rescheduling options to update
   **/
  public PatchBuReschedulingOptionsRequest managementUnits(List<PatchBuReschedulingOptionsManagementUnitRequest> managementUnits) {
    this.managementUnits = managementUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Per-management unit rescheduling options to update")
  @JsonProperty("managementUnits")
  public List<PatchBuReschedulingOptionsManagementUnitRequest> getManagementUnits() {
    return managementUnits;
  }
  public void setManagementUnits(List<PatchBuReschedulingOptionsManagementUnitRequest> managementUnits) {
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
    PatchBuReschedulingOptionsRequest patchBuReschedulingOptionsRequest = (PatchBuReschedulingOptionsRequest) o;
    return Objects.equals(this.managementUnits, patchBuReschedulingOptionsRequest.managementUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBuReschedulingOptionsRequest {\n");
    
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

