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

import java.io.Serializable;
/**
 * CampaignRuleParameters
 */

public class CampaignRuleParameters  implements Serializable {
  

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator for comparison. Required for a CampaignRuleCondition.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("equals"),
    GREATERTHAN("greaterThan"),
    GREATERTHANEQUALTO("greaterThanEqualTo"),
    LESSTHAN("lessThan"),
    LESSTHANEQUALTO("lessThanEqualTo");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;

  private static class PriorityEnumDeserializer extends StdDeserializer<PriorityEnum> {
    public PriorityEnumDeserializer() {
      super(PriorityEnumDeserializer.class);
    }

    @Override
    public PriorityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PriorityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The priority to set a campaign to. Required for the 'setCampaignPriority' action.
   */
 @JsonDeserialize(using = PriorityEnumDeserializer.class)
  public enum PriorityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _1("1"),
    _2("2"),
    _3("3"),
    _4("4"),
    _5("5");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PriorityEnum fromString(String key) {
      if (key == null) return null;

      for (PriorityEnum value : PriorityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PriorityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PriorityEnum priority = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive"),
    EXTERNAL("external");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;

  
  /**
   * The operator for comparison. Required for a CampaignRuleCondition.
   **/
  public CampaignRuleParameters operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator for comparison. Required for a CampaignRuleCondition.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * The value for comparison. Required for a CampaignRuleCondition.
   **/
  public CampaignRuleParameters value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for comparison. Required for a CampaignRuleCondition.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The priority to set a campaign to. Required for the 'setCampaignPriority' action.
   **/
  public CampaignRuleParameters priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to set a campaign to. Required for the 'setCampaignPriority' action.")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  
  /**
   * The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.
   **/
  public CampaignRuleParameters dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleParameters campaignRuleParameters = (CampaignRuleParameters) o;
    return Objects.equals(this.operator, campaignRuleParameters.operator) &&
        Objects.equals(this.value, campaignRuleParameters.value) &&
        Objects.equals(this.priority, campaignRuleParameters.priority) &&
        Objects.equals(this.dialingMode, campaignRuleParameters.dialingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, priority, dialingMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleParameters {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
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

