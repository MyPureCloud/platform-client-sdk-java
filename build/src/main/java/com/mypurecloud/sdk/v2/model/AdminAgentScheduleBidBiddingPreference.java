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
import com.mypurecloud.sdk.v2.model.AgentScheduleBiddingPreferencePriority;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdminAgentScheduleBidBiddingPreference
 */

public class AdminAgentScheduleBidBiddingPreference  implements Serializable {
  
  private UserReference agent = null;
  private Boolean submitted = null;
  private String assignedScheduleSetId = null;
  private String overriddenScheduleSetId = null;

  private static class OverrideReasonEnumDeserializer extends StdDeserializer<OverrideReasonEnum> {
    public OverrideReasonEnumDeserializer() {
      super(OverrideReasonEnumDeserializer.class);
    }

    @Override
    public OverrideReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OverrideReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason the assigned schedule set has been overridden. This must be null if no override schedule is set
   */
 @JsonDeserialize(using = OverrideReasonEnumDeserializer.class)
  public enum OverrideReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNABLETOBID("UnableToBid"),
    CHANGEOFCIRCUMSTANCE("ChangeOfCircumstance"),
    NEWHIRE("NewHire"),
    EMPLOYEEMOVE("EmployeeMove");

    private String value;

    OverrideReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OverrideReasonEnum fromString(String key) {
      if (key == null) return null;

      for (OverrideReasonEnum value : OverrideReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OverrideReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OverrideReasonEnum overrideReason = null;
  private List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferencePriorities = null;
  private LocalDate endDate = null;

  public AdminAgentScheduleBidBiddingPreference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentScheduleBidPreferencePriorities = new ArrayList<AgentScheduleBiddingPreferencePriority>();
    }
  }

  public AdminAgentScheduleBidBiddingPreference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentScheduleBidPreferencePriorities = new ArrayList<AgentScheduleBiddingPreferencePriority>();
    }
  }

  
  /**
   * The agent to whom this schedule bid preference applies
   **/
  public AdminAgentScheduleBidBiddingPreference agent(UserReference agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent to whom this schedule bid preference applies")
  @JsonProperty("agent")
  public UserReference getAgent() {
    return agent;
  }
  public void setAgent(UserReference agent) {
    this.agent = agent;
  }


  /**
   * Indicates whether the preference has been submitted
   **/
  public AdminAgentScheduleBidBiddingPreference submitted(Boolean submitted) {
    this.submitted = submitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the preference has been submitted")
  @JsonProperty("submitted")
  public Boolean getSubmitted() {
    return submitted;
  }
  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  /**
   * The schedule set assigned to the agent by the bid process. This will be set after bid is processed
   **/
  public AdminAgentScheduleBidBiddingPreference assignedScheduleSetId(String assignedScheduleSetId) {
    this.assignedScheduleSetId = assignedScheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule set assigned to the agent by the bid process. This will be set after bid is processed")
  @JsonProperty("assignedScheduleSetId")
  public String getAssignedScheduleSetId() {
    return assignedScheduleSetId;
  }
  public void setAssignedScheduleSetId(String assignedScheduleSetId) {
    this.assignedScheduleSetId = assignedScheduleSetId;
  }


  /**
   * The schedule set that overrides the assigned schedule set for the agent
   **/
  public AdminAgentScheduleBidBiddingPreference overriddenScheduleSetId(String overriddenScheduleSetId) {
    this.overriddenScheduleSetId = overriddenScheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule set that overrides the assigned schedule set for the agent")
  @JsonProperty("overriddenScheduleSetId")
  public String getOverriddenScheduleSetId() {
    return overriddenScheduleSetId;
  }
  public void setOverriddenScheduleSetId(String overriddenScheduleSetId) {
    this.overriddenScheduleSetId = overriddenScheduleSetId;
  }


  /**
   * The reason the assigned schedule set has been overridden. This must be null if no override schedule is set
   **/
  public AdminAgentScheduleBidBiddingPreference overrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the assigned schedule set has been overridden. This must be null if no override schedule is set")
  @JsonProperty("overrideReason")
  public OverrideReasonEnum getOverrideReason() {
    return overrideReason;
  }
  public void setOverrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
  }


  /**
   * The agent schedule set preferences
   **/
  public AdminAgentScheduleBidBiddingPreference agentScheduleBidPreferencePriorities(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferencePriorities) {
    this.agentScheduleBidPreferencePriorities = agentScheduleBidPreferencePriorities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent schedule set preferences")
  @JsonProperty("agentScheduleBidPreferencePriorities")
  public List<AgentScheduleBiddingPreferencePriority> getAgentScheduleBidPreferencePriorities() {
    return agentScheduleBidPreferencePriorities;
  }
  public void setAgentScheduleBidPreferencePriorities(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferencePriorities) {
    this.agentScheduleBidPreferencePriorities = agentScheduleBidPreferencePriorities;
  }


  /**
   * The end date of this scheduling set preference relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AdminAgentScheduleBidBiddingPreference endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of this scheduling set preference relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminAgentScheduleBidBiddingPreference adminAgentScheduleBidBiddingPreference = (AdminAgentScheduleBidBiddingPreference) o;

    return Objects.equals(this.agent, adminAgentScheduleBidBiddingPreference.agent) &&
            Objects.equals(this.submitted, adminAgentScheduleBidBiddingPreference.submitted) &&
            Objects.equals(this.assignedScheduleSetId, adminAgentScheduleBidBiddingPreference.assignedScheduleSetId) &&
            Objects.equals(this.overriddenScheduleSetId, adminAgentScheduleBidBiddingPreference.overriddenScheduleSetId) &&
            Objects.equals(this.overrideReason, adminAgentScheduleBidBiddingPreference.overrideReason) &&
            Objects.equals(this.agentScheduleBidPreferencePriorities, adminAgentScheduleBidBiddingPreference.agentScheduleBidPreferencePriorities) &&
            Objects.equals(this.endDate, adminAgentScheduleBidBiddingPreference.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, submitted, assignedScheduleSetId, overriddenScheduleSetId, overrideReason, agentScheduleBidPreferencePriorities, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAgentScheduleBidBiddingPreference {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    assignedScheduleSetId: ").append(toIndentedString(assignedScheduleSetId)).append("\n");
    sb.append("    overriddenScheduleSetId: ").append(toIndentedString(overriddenScheduleSetId)).append("\n");
    sb.append("    overrideReason: ").append(toIndentedString(overrideReason)).append("\n");
    sb.append("    agentScheduleBidPreferencePriorities: ").append(toIndentedString(agentScheduleBidPreferencePriorities)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

