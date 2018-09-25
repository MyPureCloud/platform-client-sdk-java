package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UnscheduledAgentWarning
 */

public class UnscheduledAgentWarning  implements Serializable {
  
  private UserReference agent = null;

  /**
   * The reason this agent was not scheduled
   */
  public enum UnscheduledReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOWORKPLAN("NoWorkPlan"),
    WORKPLANNOTFOUND("WorkPlanNotFound"),
    UNABLETOPRODUCESCHEDULE("UnableToProduceSchedule");

    private String value;

    UnscheduledReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnscheduledReasonEnum fromString(String key) {
      if (key == null) return null;

      for (UnscheduledReasonEnum value : UnscheduledReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnscheduledReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnscheduledReasonEnum unscheduledReason = null;

  
  /**
   * The agent for which this warning applies
   **/
  public UnscheduledAgentWarning agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent for which this warning applies")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }

  
  /**
   * The reason this agent was not scheduled
   **/
  public UnscheduledAgentWarning unscheduledReason(UnscheduledReasonEnum unscheduledReason) {
    this.unscheduledReason = unscheduledReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason this agent was not scheduled")
  @JsonProperty("unscheduledReason")
  public UnscheduledReasonEnum getUnscheduledReason() {
    return unscheduledReason;
  }
  public void setUnscheduledReason(UnscheduledReasonEnum unscheduledReason) {
    this.unscheduledReason = unscheduledReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnscheduledAgentWarning unscheduledAgentWarning = (UnscheduledAgentWarning) o;
    return Objects.equals(this.agent, unscheduledAgentWarning.agent) &&
        Objects.equals(this.unscheduledReason, unscheduledAgentWarning.unscheduledReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, unscheduledReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnscheduledAgentWarning {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    unscheduledReason: ").append(toIndentedString(unscheduledReason)).append("\n");
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

