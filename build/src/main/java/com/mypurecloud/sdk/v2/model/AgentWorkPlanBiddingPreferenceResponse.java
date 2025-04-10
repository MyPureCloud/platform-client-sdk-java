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
import com.mypurecloud.sdk.v2.model.AgentWorkPlanBiddingPreference;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentWorkPlanBiddingPreferenceResponse
 */

public class AgentWorkPlanBiddingPreferenceResponse  implements Serializable {
  
  private String id = null;
  private Boolean submitted = null;
  private WorkPlanReference assignedWorkPlan = null;
  private WorkPlanReference overriddenWorkPlan = null;

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
   * The reason why the assigned work plan has been overridden. This must be null without an override work plan
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
  private List<AgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences = null;
  private String selfUri = null;

  public AgentWorkPlanBiddingPreferenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentWorkPlanBidPreferences = new ArrayList<AgentWorkPlanBiddingPreference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Whether the preference is submitted
   **/
  public AgentWorkPlanBiddingPreferenceResponse submitted(Boolean submitted) {
    this.submitted = submitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the preference is submitted")
  @JsonProperty("submitted")
  public Boolean getSubmitted() {
    return submitted;
  }
  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  /**
   * The work plan assigned to the agent by the bid process
   **/
  public AgentWorkPlanBiddingPreferenceResponse assignedWorkPlan(WorkPlanReference assignedWorkPlan) {
    this.assignedWorkPlan = assignedWorkPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan assigned to the agent by the bid process")
  @JsonProperty("assignedWorkPlan")
  public WorkPlanReference getAssignedWorkPlan() {
    return assignedWorkPlan;
  }
  public void setAssignedWorkPlan(WorkPlanReference assignedWorkPlan) {
    this.assignedWorkPlan = assignedWorkPlan;
  }


  /**
   * The work plan that overrides the assigned work plan for the agent
   **/
  public AgentWorkPlanBiddingPreferenceResponse overriddenWorkPlan(WorkPlanReference overriddenWorkPlan) {
    this.overriddenWorkPlan = overriddenWorkPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan that overrides the assigned work plan for the agent")
  @JsonProperty("overriddenWorkPlan")
  public WorkPlanReference getOverriddenWorkPlan() {
    return overriddenWorkPlan;
  }
  public void setOverriddenWorkPlan(WorkPlanReference overriddenWorkPlan) {
    this.overriddenWorkPlan = overriddenWorkPlan;
  }


  /**
   * The reason why the assigned work plan has been overridden. This must be null without an override work plan
   **/
  public AgentWorkPlanBiddingPreferenceResponse overrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason why the assigned work plan has been overridden. This must be null without an override work plan")
  @JsonProperty("overrideReason")
  public OverrideReasonEnum getOverrideReason() {
    return overrideReason;
  }
  public void setOverrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
  }


  /**
   * The list of work plan bidding preferences
   **/
  public AgentWorkPlanBiddingPreferenceResponse agentWorkPlanBidPreferences(List<AgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of work plan bidding preferences")
  @JsonProperty("agentWorkPlanBidPreferences")
  public List<AgentWorkPlanBiddingPreference> getAgentWorkPlanBidPreferences() {
    return agentWorkPlanBidPreferences;
  }
  public void setAgentWorkPlanBidPreferences(List<AgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentWorkPlanBiddingPreferenceResponse agentWorkPlanBiddingPreferenceResponse = (AgentWorkPlanBiddingPreferenceResponse) o;

    return Objects.equals(this.id, agentWorkPlanBiddingPreferenceResponse.id) &&
            Objects.equals(this.submitted, agentWorkPlanBiddingPreferenceResponse.submitted) &&
            Objects.equals(this.assignedWorkPlan, agentWorkPlanBiddingPreferenceResponse.assignedWorkPlan) &&
            Objects.equals(this.overriddenWorkPlan, agentWorkPlanBiddingPreferenceResponse.overriddenWorkPlan) &&
            Objects.equals(this.overrideReason, agentWorkPlanBiddingPreferenceResponse.overrideReason) &&
            Objects.equals(this.agentWorkPlanBidPreferences, agentWorkPlanBiddingPreferenceResponse.agentWorkPlanBidPreferences) &&
            Objects.equals(this.selfUri, agentWorkPlanBiddingPreferenceResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitted, assignedWorkPlan, overriddenWorkPlan, overrideReason, agentWorkPlanBidPreferences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlanBiddingPreferenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    assignedWorkPlan: ").append(toIndentedString(assignedWorkPlan)).append("\n");
    sb.append("    overriddenWorkPlan: ").append(toIndentedString(overriddenWorkPlan)).append("\n");
    sb.append("    overrideReason: ").append(toIndentedString(overrideReason)).append("\n");
    sb.append("    agentWorkPlanBidPreferences: ").append(toIndentedString(agentWorkPlanBidPreferences)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

