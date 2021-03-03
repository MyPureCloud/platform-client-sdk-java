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
 * MoveManagementUnitRequest
 */

public class MoveManagementUnitRequest  implements Serializable {
  
  private String businessUnitId = null;

  
  /**
   * The ID of the business unit to which to move the management unit
   **/
  public MoveManagementUnitRequest businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the business unit to which to move the management unit")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveManagementUnitRequest moveManagementUnitRequest = (MoveManagementUnitRequest) o;
    return Objects.equals(this.businessUnitId, moveManagementUnitRequest.businessUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveManagementUnitRequest {\n");
    
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
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

