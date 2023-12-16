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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentQueueTimeRequest
 */

public class AgentQueueTimeRequest  implements Serializable {
  
  private String agentId = null;
  private List<Integer> startOffsetMinutes = new ArrayList<Integer>();
  private List<Integer> onQueueLengthMinutesPerInterval = new ArrayList<Integer>();

  
  /**
   * ID of the agent
   **/
  public AgentQueueTimeRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the agent")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * List of offsets in minutes from calculationStartDate
   **/
  public AgentQueueTimeRequest startOffsetMinutes(List<Integer> startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of offsets in minutes from calculationStartDate")
  @JsonProperty("startOffsetMinutes")
  public List<Integer> getStartOffsetMinutes() {
    return startOffsetMinutes;
  }
  public void setStartOffsetMinutes(List<Integer> startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
  }


  /**
   * List of on queue time lengths in minutes per interval of elements in startOffsetMinutes
   **/
  public AgentQueueTimeRequest onQueueLengthMinutesPerInterval(List<Integer> onQueueLengthMinutesPerInterval) {
    this.onQueueLengthMinutesPerInterval = onQueueLengthMinutesPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of on queue time lengths in minutes per interval of elements in startOffsetMinutes")
  @JsonProperty("onQueueLengthMinutesPerInterval")
  public List<Integer> getOnQueueLengthMinutesPerInterval() {
    return onQueueLengthMinutesPerInterval;
  }
  public void setOnQueueLengthMinutesPerInterval(List<Integer> onQueueLengthMinutesPerInterval) {
    this.onQueueLengthMinutesPerInterval = onQueueLengthMinutesPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueueTimeRequest agentQueueTimeRequest = (AgentQueueTimeRequest) o;

    return Objects.equals(this.agentId, agentQueueTimeRequest.agentId) &&
            Objects.equals(this.startOffsetMinutes, agentQueueTimeRequest.startOffsetMinutes) &&
            Objects.equals(this.onQueueLengthMinutesPerInterval, agentQueueTimeRequest.onQueueLengthMinutesPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, startOffsetMinutes, onQueueLengthMinutesPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentQueueTimeRequest {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    startOffsetMinutes: ").append(toIndentedString(startOffsetMinutes)).append("\n");
    sb.append("    onQueueLengthMinutesPerInterval: ").append(toIndentedString(onQueueLengthMinutesPerInterval)).append("\n");
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

