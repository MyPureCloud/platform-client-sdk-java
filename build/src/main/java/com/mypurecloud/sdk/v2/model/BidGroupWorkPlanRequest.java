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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BidGroupWorkPlanRequest
 */

public class BidGroupWorkPlanRequest  implements Serializable {
  
  private String workPlanId = null;
  private Integer overrideAgentCount = null;
  private Integer suggestedAgentCount = null;
  private AgentCountRange agentCountRange = null;

  public BidGroupWorkPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the work plan used in the bid group
   **/
  public BidGroupWorkPlanRequest workPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the work plan used in the bid group")
  @JsonProperty("workPlanId")
  public String getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The modified agent count for this work plan
   **/
  public BidGroupWorkPlanRequest overrideAgentCount(Integer overrideAgentCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidGroupWorkPlanRequest bidGroupWorkPlanRequest = (BidGroupWorkPlanRequest) o;

    return Objects.equals(this.workPlanId, bidGroupWorkPlanRequest.workPlanId) &&
            Objects.equals(this.overrideAgentCount, bidGroupWorkPlanRequest.overrideAgentCount) &&
            Objects.equals(this.suggestedAgentCount, bidGroupWorkPlanRequest.suggestedAgentCount) &&
            Objects.equals(this.agentCountRange, bidGroupWorkPlanRequest.agentCountRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanId, overrideAgentCount, suggestedAgentCount, agentCountRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidGroupWorkPlanRequest {\n");
    
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    overrideAgentCount: ").append(toIndentedString(overrideAgentCount)).append("\n");
    sb.append("    suggestedAgentCount: ").append(toIndentedString(suggestedAgentCount)).append("\n");
    sb.append("    agentCountRange: ").append(toIndentedString(agentCountRange)).append("\n");
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

