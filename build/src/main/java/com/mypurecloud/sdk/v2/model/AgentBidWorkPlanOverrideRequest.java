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
 * AgentBidWorkPlanOverrideRequest
 */

public class AgentBidWorkPlanOverrideRequest  implements Serializable {
  
  private String agentId = null;
  private String overrideWorkPlanId = null;

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
   * The reason for overriding the assigned work plan. This must be null if overrideWorkPlanId is not specified
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

  public AgentBidWorkPlanOverrideRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of agent
   **/
  public AgentBidWorkPlanOverrideRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of agent")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The ID of the work plan that overrides the assigned work plan for the agent
   **/
  public AgentBidWorkPlanOverrideRequest overrideWorkPlanId(String overrideWorkPlanId) {
    this.overrideWorkPlanId = overrideWorkPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the work plan that overrides the assigned work plan for the agent")
  @JsonProperty("overrideWorkPlanId")
  public String getOverrideWorkPlanId() {
    return overrideWorkPlanId;
  }
  public void setOverrideWorkPlanId(String overrideWorkPlanId) {
    this.overrideWorkPlanId = overrideWorkPlanId;
  }


  /**
   * The reason for overriding the assigned work plan. This must be null if overrideWorkPlanId is not specified
   **/
  public AgentBidWorkPlanOverrideRequest overrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason for overriding the assigned work plan. This must be null if overrideWorkPlanId is not specified")
  @JsonProperty("overrideReason")
  public OverrideReasonEnum getOverrideReason() {
    return overrideReason;
  }
  public void setOverrideReason(OverrideReasonEnum overrideReason) {
    this.overrideReason = overrideReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBidWorkPlanOverrideRequest agentBidWorkPlanOverrideRequest = (AgentBidWorkPlanOverrideRequest) o;

    return Objects.equals(this.agentId, agentBidWorkPlanOverrideRequest.agentId) &&
            Objects.equals(this.overrideWorkPlanId, agentBidWorkPlanOverrideRequest.overrideWorkPlanId) &&
            Objects.equals(this.overrideReason, agentBidWorkPlanOverrideRequest.overrideReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, overrideWorkPlanId, overrideReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBidWorkPlanOverrideRequest {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    overrideWorkPlanId: ").append(toIndentedString(overrideWorkPlanId)).append("\n");
    sb.append("    overrideReason: ").append(toIndentedString(overrideReason)).append("\n");
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

