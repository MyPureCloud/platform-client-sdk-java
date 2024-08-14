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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AdminBulkUpdateAlternativeShiftTradeState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdminBulkUpdateAlternativeShiftTradeStateRequest
 */

public class AdminBulkUpdateAlternativeShiftTradeStateRequest  implements Serializable {
  
  private List<AdminBulkUpdateAlternativeShiftTradeState> entities = new ArrayList<AdminBulkUpdateAlternativeShiftTradeState>();
  private String managementUnitId = null;

  
  /**
   **/
  public AdminBulkUpdateAlternativeShiftTradeStateRequest entities(List<AdminBulkUpdateAlternativeShiftTradeState> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<AdminBulkUpdateAlternativeShiftTradeState> getEntities() {
    return entities;
  }
  public void setEntities(List<AdminBulkUpdateAlternativeShiftTradeState> entities) {
    this.entities = entities;
  }


  /**
   * The ID of the management unit for this alternative shift bulk trade update
   **/
  public AdminBulkUpdateAlternativeShiftTradeStateRequest managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the management unit for this alternative shift bulk trade update")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBulkUpdateAlternativeShiftTradeStateRequest adminBulkUpdateAlternativeShiftTradeStateRequest = (AdminBulkUpdateAlternativeShiftTradeStateRequest) o;

    return Objects.equals(this.entities, adminBulkUpdateAlternativeShiftTradeStateRequest.entities) &&
            Objects.equals(this.managementUnitId, adminBulkUpdateAlternativeShiftTradeStateRequest.managementUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, managementUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBulkUpdateAlternativeShiftTradeStateRequest {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
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

