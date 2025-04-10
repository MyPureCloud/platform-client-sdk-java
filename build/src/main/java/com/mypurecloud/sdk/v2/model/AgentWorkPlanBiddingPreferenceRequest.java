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
 * AgentWorkPlanBiddingPreferenceRequest
 */

public class AgentWorkPlanBiddingPreferenceRequest  implements Serializable {
  
  private String workPlanId = null;
  private Integer priority = null;

  public AgentWorkPlanBiddingPreferenceRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the work plan that belongs to agent's bid group
   **/
  public AgentWorkPlanBiddingPreferenceRequest workPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the work plan that belongs to agent's bid group")
  @JsonProperty("workPlanId")
  public String getWorkPlanId() {
    return workPlanId;
  }
  public void setWorkPlanId(String workPlanId) {
    this.workPlanId = workPlanId;
  }


  /**
   * The agent's priority for this work plan, with 1 being the best priority. Null if priority is not set for the work plan
   **/
  public AgentWorkPlanBiddingPreferenceRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent's priority for this work plan, with 1 being the best priority. Null if priority is not set for the work plan")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentWorkPlanBiddingPreferenceRequest agentWorkPlanBiddingPreferenceRequest = (AgentWorkPlanBiddingPreferenceRequest) o;

    return Objects.equals(this.workPlanId, agentWorkPlanBiddingPreferenceRequest.workPlanId) &&
            Objects.equals(this.priority, agentWorkPlanBiddingPreferenceRequest.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlanId, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanBiddingPreferenceRequest {\n");
    
    sb.append("    workPlanId: ").append(toIndentedString(workPlanId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

