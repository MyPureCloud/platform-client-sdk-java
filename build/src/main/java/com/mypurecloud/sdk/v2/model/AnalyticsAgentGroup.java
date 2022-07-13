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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsAgentGroup
 */

public class AnalyticsAgentGroup  implements Serializable {
  
  private String agentGroupId = null;

  private static class AgentGroupTypeEnumDeserializer extends StdDeserializer<AgentGroupTypeEnum> {
    public AgentGroupTypeEnumDeserializer() {
      super(AgentGroupTypeEnumDeserializer.class);
    }

    @Override
    public AgentGroupTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AgentGroupTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Conditional group routing agent group type
   */
 @JsonDeserialize(using = AgentGroupTypeEnumDeserializer.class)
  public enum AgentGroupTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GROUP("Group"),
    SKILLGROUP("SkillGroup"),
    TEAM("Team");

    private String value;

    AgentGroupTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentGroupTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AgentGroupTypeEnum value : AgentGroupTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentGroupTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentGroupTypeEnum agentGroupType = null;

  
  /**
   * Conditional group routing agent group identifier
   **/
  public AnalyticsAgentGroup agentGroupId(String agentGroupId) {
    this.agentGroupId = agentGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditional group routing agent group identifier")
  @JsonProperty("agentGroupId")
  public String getAgentGroupId() {
    return agentGroupId;
  }
  public void setAgentGroupId(String agentGroupId) {
    this.agentGroupId = agentGroupId;
  }


  /**
   * Conditional group routing agent group type
   **/
  public AnalyticsAgentGroup agentGroupType(AgentGroupTypeEnum agentGroupType) {
    this.agentGroupType = agentGroupType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conditional group routing agent group type")
  @JsonProperty("agentGroupType")
  public AgentGroupTypeEnum getAgentGroupType() {
    return agentGroupType;
  }
  public void setAgentGroupType(AgentGroupTypeEnum agentGroupType) {
    this.agentGroupType = agentGroupType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentGroup analyticsAgentGroup = (AnalyticsAgentGroup) o;

    return Objects.equals(this.agentGroupId, analyticsAgentGroup.agentGroupId) &&
            Objects.equals(this.agentGroupType, analyticsAgentGroup.agentGroupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentGroupId, agentGroupType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentGroup {\n");
    
    sb.append("    agentGroupId: ").append(toIndentedString(agentGroupId)).append("\n");
    sb.append("    agentGroupType: ").append(toIndentedString(agentGroupType)).append("\n");
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

