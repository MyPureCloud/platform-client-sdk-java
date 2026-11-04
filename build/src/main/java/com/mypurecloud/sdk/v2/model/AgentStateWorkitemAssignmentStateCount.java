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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentStateWorkitemAssignmentStateCount
 */

public class AgentStateWorkitemAssignmentStateCount  implements Serializable {
  

  private static class AssignmentStateEnumDeserializer extends StdDeserializer<AssignmentStateEnum> {
    public AssignmentStateEnumDeserializer() {
      super(AssignmentStateEnumDeserializer.class);
    }

    @Override
    public AssignmentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssignmentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Workitem assignment state
   */
 @JsonDeserialize(using = AssignmentStateEnumDeserializer.class)
  public enum AssignmentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    IDLE("Idle"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
    ACDEXPIRED("AcdExpired");

    private String value;

    AssignmentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssignmentStateEnum fromString(String key) {
      if (key == null) return null;

      for (AssignmentStateEnum value : AssignmentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssignmentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssignmentStateEnum assignmentState = null;
  private Integer count = null;

  public AgentStateWorkitemAssignmentStateCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentStateWorkitemAssignmentStateCount(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Workitem assignment state
   **/
  public AgentStateWorkitemAssignmentStateCount assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workitem assignment state")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   * Count of workitems with this assignment state
   **/
  public AgentStateWorkitemAssignmentStateCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of workitems with this assignment state")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateWorkitemAssignmentStateCount agentStateWorkitemAssignmentStateCount = (AgentStateWorkitemAssignmentStateCount) o;

    return Objects.equals(this.assignmentState, agentStateWorkitemAssignmentStateCount.assignmentState) &&
            Objects.equals(this.count, agentStateWorkitemAssignmentStateCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentState, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateWorkitemAssignmentStateCount {\n");
    
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

