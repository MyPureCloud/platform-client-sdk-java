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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BidGroupWorkPlanRotationResponse
 */

public class BidGroupWorkPlanRotationResponse  implements Serializable {
  
  private String id = null;
  private ManagementUnitReference managementUnit = null;
  private Integer agentCount = null;
  private String selfUri = null;

  public BidGroupWorkPlanRotationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BidGroupWorkPlanRotationResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public BidGroupWorkPlanRotationResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The management unit to which the work plan rotation belongs
   **/
  public BidGroupWorkPlanRotationResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The management unit to which the work plan rotation belongs")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The count of agents that can be assigned to this work plan rotation
   **/
  public BidGroupWorkPlanRotationResponse agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The count of agents that can be assigned to this work plan rotation")
  @JsonProperty("agentCount")
  public Integer getAgentCount() {
    return agentCount;
  }
  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidGroupWorkPlanRotationResponse bidGroupWorkPlanRotationResponse = (BidGroupWorkPlanRotationResponse) o;

    return Objects.equals(this.id, bidGroupWorkPlanRotationResponse.id) &&
            Objects.equals(this.managementUnit, bidGroupWorkPlanRotationResponse.managementUnit) &&
            Objects.equals(this.agentCount, bidGroupWorkPlanRotationResponse.agentCount) &&
            Objects.equals(this.selfUri, bidGroupWorkPlanRotationResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementUnit, agentCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidGroupWorkPlanRotationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

