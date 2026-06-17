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

import java.io.Serializable;
/**
 * BidGroupWorkPlanRotationRequest
 */

public class BidGroupWorkPlanRotationRequest  implements Serializable {
  
  private String workPlanRotationId = null;
  private Integer agentCount = null;

  public BidGroupWorkPlanRotationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BidGroupWorkPlanRotationRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the work plan rotation used in the bid group
   **/
  public BidGroupWorkPlanRotationRequest workPlanRotationId(String workPlanRotationId) {
    this.workPlanRotationId = workPlanRotationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the work plan rotation used in the bid group")
  @JsonProperty("workPlanRotationId")
  public String getWorkPlanRotationId() {
    return workPlanRotationId;
  }
  public void setWorkPlanRotationId(String workPlanRotationId) {
    this.workPlanRotationId = workPlanRotationId;
  }


  /**
   * The count of agents that can be assigned to this work plan rotation
   **/
  public BidGroupWorkPlanRotationRequest agentCount(Integer agentCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidGroupWorkPlanRotationRequest bidGroupWorkPlanRotationRequest = (BidGroupWorkPlanRotationRequest) o;

    return Objects.equals(this.workPlanRotationId, bidGroupWorkPlanRotationRequest.workPlanRotationId) &&
            Objects.equals(this.agentCount, bidGroupWorkPlanRotationRequest.agentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanRotationId, agentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidGroupWorkPlanRotationRequest {\n");
    
    sb.append("    workPlanRotationId: ").append(toIndentedString(workPlanRotationId)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
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

