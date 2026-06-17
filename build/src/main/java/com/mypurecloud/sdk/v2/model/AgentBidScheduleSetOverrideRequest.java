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
 * AgentBidScheduleSetOverrideRequest
 */

public class AgentBidScheduleSetOverrideRequest  implements Serializable {
  
  private String agentId = null;
  private String overrideScheduleSetId = null;

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

  public AgentBidScheduleSetOverrideRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentBidScheduleSetOverrideRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the agent
   **/
  public AgentBidScheduleSetOverrideRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the agent")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * If provided, the schedule set overrides the agent's assigned schedule set
   **/
  public AgentBidScheduleSetOverrideRequest overrideScheduleSetId(String overrideScheduleSetId) {
    this.overrideScheduleSetId = overrideScheduleSetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If provided, the schedule set overrides the agent's assigned schedule set")
  @JsonProperty("overrideScheduleSetId")
  public String getOverrideScheduleSetId() {
    return overrideScheduleSetId;
  }
  public void setOverrideScheduleSetId(String overrideScheduleSetId) {
    this.overrideScheduleSetId = overrideScheduleSetId;
  }


  /**
   * The reason the assigned schedule set has been overridden. This must be null if no override schedule is set
   **/
  public AgentBidScheduleSetOverrideRequest overrideReason(OverrideReasonEnum overrideReason) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBidScheduleSetOverrideRequest agentBidScheduleSetOverrideRequest = (AgentBidScheduleSetOverrideRequest) o;

    return Objects.equals(this.agentId, agentBidScheduleSetOverrideRequest.agentId) &&
            Objects.equals(this.overrideScheduleSetId, agentBidScheduleSetOverrideRequest.overrideScheduleSetId) &&
            Objects.equals(this.overrideReason, agentBidScheduleSetOverrideRequest.overrideReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, overrideScheduleSetId, overrideReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBidScheduleSetOverrideRequest {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    overrideScheduleSetId: ").append(toIndentedString(overrideScheduleSetId)).append("\n");
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

