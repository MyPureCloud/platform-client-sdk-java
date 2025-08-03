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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanDeleteRequest
 */

public class CapacityPlanDeleteRequest  implements Serializable {
  
  private List<String> capacityPlanIds = null;

  public CapacityPlanDeleteRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      capacityPlanIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the capacity plans to be deleted
   **/
  public CapacityPlanDeleteRequest capacityPlanIds(List<String> capacityPlanIds) {
    this.capacityPlanIds = capacityPlanIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the capacity plans to be deleted")
  @JsonProperty("capacityPlanIds")
  public List<String> getCapacityPlanIds() {
    return capacityPlanIds;
  }
  public void setCapacityPlanIds(List<String> capacityPlanIds) {
    this.capacityPlanIds = capacityPlanIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanDeleteRequest capacityPlanDeleteRequest = (CapacityPlanDeleteRequest) o;

    return Objects.equals(this.capacityPlanIds, capacityPlanDeleteRequest.capacityPlanIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityPlanIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanDeleteRequest {\n");
    
    sb.append("    capacityPlanIds: ").append(toIndentedString(capacityPlanIds)).append("\n");
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

