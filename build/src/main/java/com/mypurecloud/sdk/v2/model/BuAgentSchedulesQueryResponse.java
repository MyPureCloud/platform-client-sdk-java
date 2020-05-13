package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleQueryResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentSchedulesQueryResponse
 */

public class BuAgentSchedulesQueryResponse  implements Serializable {
  
  private List<BuAgentScheduleQueryResponse> agentSchedules = new ArrayList<BuAgentScheduleQueryResponse>();

  
  /**
   * The requested agent schedules
   **/
  public BuAgentSchedulesQueryResponse agentSchedules(List<BuAgentScheduleQueryResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuAgentScheduleQueryResponse> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuAgentScheduleQueryResponse> agentSchedules) {
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
    BuAgentSchedulesQueryResponse buAgentSchedulesQueryResponse = (BuAgentSchedulesQueryResponse) o;
    return Objects.equals(this.agentSchedules, buAgentSchedulesQueryResponse.agentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentSchedulesQueryResponse {\n");
    
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

