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
import com.mypurecloud.sdk.v2.model.AgentCountRange;
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BidGroupWorkPlanResponse
 */

public class BidGroupWorkPlanResponse  implements Serializable {
  
  private String id = null;
  private ManagementUnitReference managementUnit = null;
  private Integer overrideAgentCount = null;
  private Integer suggestedAgentCount = null;
  private AgentCountRange agentCountRange = null;
  private String selfUri = null;

  public BidGroupWorkPlanResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The management unit to which this work plan belongs.  Nullable in some routes
   **/
  public BidGroupWorkPlanResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit to which this work plan belongs.  Nullable in some routes")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The modified agent count for this work plan
   **/
  public BidGroupWorkPlanResponse overrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modified agent count for this work plan")
  @JsonProperty("overrideAgentCount")
  public Integer getOverrideAgentCount() {
    return overrideAgentCount;
  }
  public void setOverrideAgentCount(Integer overrideAgentCount) {
    this.overrideAgentCount = overrideAgentCount;
  }


  @ApiModelProperty(example = "null", value = "The number of agents needed for this work plan to produce the optimal schedule")
  @JsonProperty("suggestedAgentCount")
  public Integer getSuggestedAgentCount() {
    return suggestedAgentCount;
  }


  @ApiModelProperty(example = "null", value = "The range of agent slot count per work plan. The suggested slot count must be in agent count range")
  @JsonProperty("agentCountRange")
  public AgentCountRange getAgentCountRange() {
    return agentCountRange;
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
    BidGroupWorkPlanResponse bidGroupWorkPlanResponse = (BidGroupWorkPlanResponse) o;

    return Objects.equals(this.id, bidGroupWorkPlanResponse.id) &&
            Objects.equals(this.managementUnit, bidGroupWorkPlanResponse.managementUnit) &&
            Objects.equals(this.overrideAgentCount, bidGroupWorkPlanResponse.overrideAgentCount) &&
            Objects.equals(this.suggestedAgentCount, bidGroupWorkPlanResponse.suggestedAgentCount) &&
            Objects.equals(this.agentCountRange, bidGroupWorkPlanResponse.agentCountRange) &&
            Objects.equals(this.selfUri, bidGroupWorkPlanResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementUnit, overrideAgentCount, suggestedAgentCount, agentCountRange, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidGroupWorkPlanResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    overrideAgentCount: ").append(toIndentedString(overrideAgentCount)).append("\n");
    sb.append("    suggestedAgentCount: ").append(toIndentedString(suggestedAgentCount)).append("\n");
    sb.append("    agentCountRange: ").append(toIndentedString(agentCountRange)).append("\n");
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

