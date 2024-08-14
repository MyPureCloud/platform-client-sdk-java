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
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentWorkPlanBiddingPreference
 */

public class AgentWorkPlanBiddingPreference  implements Serializable {
  
  private WorkPlanReference workPlan = null;
  private Integer priority = null;

  
  /**
   * The work plan that belongs to the agent's bid group
   **/
  public AgentWorkPlanBiddingPreference workPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan that belongs to the agent's bid group")
  @JsonProperty("workPlan")
  public WorkPlanReference getWorkPlan() {
    return workPlan;
  }
  public void setWorkPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
  }


  /**
   * The agent's priority for this work plan, with 1 being the best priority. Null if priority is not set for the work plan
   **/
  public AgentWorkPlanBiddingPreference priority(Integer priority) {
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
    AgentWorkPlanBiddingPreference agentWorkPlanBiddingPreference = (AgentWorkPlanBiddingPreference) o;

    return Objects.equals(this.workPlan, agentWorkPlanBiddingPreference.workPlan) &&
            Objects.equals(this.priority, agentWorkPlanBiddingPreference.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlan, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanBiddingPreference {\n");
    
    sb.append("    workPlan: ").append(toIndentedString(workPlan)).append("\n");
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

