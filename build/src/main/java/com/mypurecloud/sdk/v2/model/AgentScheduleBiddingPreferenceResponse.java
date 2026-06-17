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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentScheduleBiddingPreferenceResponse
 */

public class AgentScheduleBiddingPreferenceResponse  implements Serializable {
  
  private String id = null;
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
   * The reason why the assigned schedule set has been overridden. This must be null without an override schedule set
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
  private List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences = null;
  private String selfUri = null;

  public AgentScheduleBiddingPreferenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentScheduleBidPreferences = new ArrayList<AgentScheduleBiddingPreferencePriority>();
    }
  }

  public AgentScheduleBiddingPreferenceResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentScheduleBidPreferences = new ArrayList<AgentScheduleBiddingPreferencePriority>();
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
  public AgentScheduleBiddingPreferenceResponse submitted(Boolean submitted) {
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
   * The schedule set assigned to the agent by the bid process. Will be set after bid is processed
   **/
  public AgentScheduleBiddingPreferenceResponse assignedScheduleSetId(String assignedScheduleSetId) {
    this.assignedScheduleSetId = assignedScheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule set assigned to the agent by the bid process. Will be set after bid is processed")
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
  public AgentScheduleBiddingPreferenceResponse overriddenScheduleSetId(String overriddenScheduleSetId) {
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
   * The reason why the assigned schedule set has been overridden. This must be null without an override schedule set
   **/
  public AgentScheduleBiddingPreferenceResponse overrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason why the assigned schedule set has been overridden. This must be null without an override schedule set")
  @JsonProperty("overrideReason")
  public OverrideReasonEnum getOverrideReason() {
    return overrideReason;
  }
  public void setOverrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
  }


  /**
   * The schedule bidding preferences
   **/
  public AgentScheduleBiddingPreferenceResponse agentScheduleBidPreferences(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences) {
    this.agentScheduleBidPreferences = agentScheduleBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule bidding preferences")
  @JsonProperty("agentScheduleBidPreferences")
  public List<AgentScheduleBiddingPreferencePriority> getAgentScheduleBidPreferences() {
    return agentScheduleBidPreferences;
  }
  public void setAgentScheduleBidPreferences(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences) {
    this.agentScheduleBidPreferences = agentScheduleBidPreferences;
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
    AgentScheduleBiddingPreferenceResponse agentScheduleBiddingPreferenceResponse = (AgentScheduleBiddingPreferenceResponse) o;

    return Objects.equals(this.id, agentScheduleBiddingPreferenceResponse.id) &&
            Objects.equals(this.submitted, agentScheduleBiddingPreferenceResponse.submitted) &&
            Objects.equals(this.assignedScheduleSetId, agentScheduleBiddingPreferenceResponse.assignedScheduleSetId) &&
            Objects.equals(this.overriddenScheduleSetId, agentScheduleBiddingPreferenceResponse.overriddenScheduleSetId) &&
            Objects.equals(this.overrideReason, agentScheduleBiddingPreferenceResponse.overrideReason) &&
            Objects.equals(this.agentScheduleBidPreferences, agentScheduleBiddingPreferenceResponse.agentScheduleBidPreferences) &&
            Objects.equals(this.selfUri, agentScheduleBiddingPreferenceResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitted, assignedScheduleSetId, overriddenScheduleSetId, overrideReason, agentScheduleBidPreferences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleBiddingPreferenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    assignedScheduleSetId: ").append(toIndentedString(assignedScheduleSetId)).append("\n");
    sb.append("    overriddenScheduleSetId: ").append(toIndentedString(overriddenScheduleSetId)).append("\n");
    sb.append("    overrideReason: ").append(toIndentedString(overrideReason)).append("\n");
    sb.append("    agentScheduleBidPreferences: ").append(toIndentedString(agentScheduleBidPreferences)).append("\n");
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

