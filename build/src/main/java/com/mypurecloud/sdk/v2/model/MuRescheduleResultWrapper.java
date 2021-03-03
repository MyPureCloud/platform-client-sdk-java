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
import com.mypurecloud.sdk.v2.model.BuAgentScheduleRescheduleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MuRescheduleResultWrapper
 */

public class MuRescheduleResultWrapper  implements Serializable {
  
  private List<BuAgentScheduleRescheduleResponse> agentSchedules = new ArrayList<BuAgentScheduleRescheduleResponse>();

  
  /**
   * The list of agent schedules
   **/
  public MuRescheduleResultWrapper agentSchedules(List<BuAgentScheduleRescheduleResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuAgentScheduleRescheduleResponse> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuAgentScheduleRescheduleResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuRescheduleResultWrapper muRescheduleResultWrapper = (MuRescheduleResultWrapper) o;
    return Objects.equals(this.agentSchedules, muRescheduleResultWrapper.agentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuRescheduleResultWrapper {\n");
    
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
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

