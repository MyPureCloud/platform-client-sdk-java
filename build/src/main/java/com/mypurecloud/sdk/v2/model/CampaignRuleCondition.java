package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CampaignRuleParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleCondition
 */

public class CampaignRuleCondition  implements Serializable {
  
  private String id = null;
  private CampaignRuleParameters parameters = null;

  private static class ConditionTypeEnumDeserializer extends StdDeserializer<ConditionTypeEnum> {
    public ConditionTypeEnumDeserializer() {
      super(ConditionTypeEnumDeserializer.class);
    }

    @Override
    public ConditionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConditionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of condition to evaluate.
   */
 @JsonDeserialize(using = ConditionTypeEnumDeserializer.class)
  public enum ConditionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CAMPAIGNPROGRESS("campaignProgress"),
    CAMPAIGNAGENTS("campaignAgents");

    private String value;

    ConditionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConditionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ConditionTypeEnum value : ConditionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConditionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConditionTypeEnum conditionType = null;

  
  /**
   **/
  public CampaignRuleCondition id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The parameters for the CampaignRuleCondition.
   **/
  public CampaignRuleCondition parameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parameters for the CampaignRuleCondition.")
  @JsonProperty("parameters")
  public CampaignRuleParameters getParameters() {
    return parameters;
  }
  public void setParameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
  }

  
  /**
   * The type of condition to evaluate.
   **/
  public CampaignRuleCondition conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of condition to evaluate.")
  @JsonProperty("conditionType")
  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }
  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleCondition campaignRuleCondition = (CampaignRuleCondition) o;
    return Objects.equals(this.id, campaignRuleCondition.id) &&
        Objects.equals(this.parameters, campaignRuleCondition.parameters) &&
        Objects.equals(this.conditionType, campaignRuleCondition.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, conditionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleCondition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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

