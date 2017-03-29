package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleParameters
 */

public class CampaignRuleParameters  implements Serializable {
  

  /**
   * The operator for comparison. Required for all campaign rule conditions
   */
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

  /**
   * The priority to set the campaign to. Required for 'set campaign priority' actions
   */
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

  /**
   * The dialing mode to set the campaign to. Reqired for 'set campaign dialing mode' actions
   */
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive");

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
   * The operator for comparison. Required for all campaign rule conditions
   **/
  public CampaignRuleParameters operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator for comparison. Required for all campaign rule conditions")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value for comparison. Required for all campaign rule conditions
   **/
  public CampaignRuleParameters value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for comparison. Required for all campaign rule conditions")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The priority to set the campaign to. Required for 'set campaign priority' actions
   **/
  public CampaignRuleParameters priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to set the campaign to. Required for 'set campaign priority' actions")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  /**
   * The dialing mode to set the campaign to. Reqired for 'set campaign dialing mode' actions
   **/
  public CampaignRuleParameters dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialing mode to set the campaign to. Reqired for 'set campaign dialing mode' actions")
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

