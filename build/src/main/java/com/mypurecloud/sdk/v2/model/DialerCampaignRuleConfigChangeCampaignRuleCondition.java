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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCampaignRuleConfigChangeCampaignRuleCondition
 */

public class DialerCampaignRuleConfigChangeCampaignRuleCondition  implements Serializable {
  
  private String id = null;
  private Map<String, String> parameters = null;

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
   * Gets or Sets conditionType
   */
 @JsonDeserialize(using = ConditionTypeEnumDeserializer.class)
  public enum ConditionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CAMPAIGN_PROGRESS("CAMPAIGN_PROGRESS"),
    CAMPAIGN_AGENTS("CAMPAIGN_AGENTS");

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
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleCondition id(String id) {
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
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleCondition parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleCondition conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conditionType")
  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }
  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleCondition additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignRuleConfigChangeCampaignRuleCondition dialerCampaignRuleConfigChangeCampaignRuleCondition = (DialerCampaignRuleConfigChangeCampaignRuleCondition) o;
    return Objects.equals(this.id, dialerCampaignRuleConfigChangeCampaignRuleCondition.id) &&
        Objects.equals(this.parameters, dialerCampaignRuleConfigChangeCampaignRuleCondition.parameters) &&
        Objects.equals(this.conditionType, dialerCampaignRuleConfigChangeCampaignRuleCondition.conditionType) &&
        Objects.equals(this.additionalProperties, dialerCampaignRuleConfigChangeCampaignRuleCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, conditionType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRuleCondition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

