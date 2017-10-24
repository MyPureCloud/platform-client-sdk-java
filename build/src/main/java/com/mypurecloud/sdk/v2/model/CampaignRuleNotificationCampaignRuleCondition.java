package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CampaignRuleNotificationCampaignRuleCondition
 */

public class CampaignRuleNotificationCampaignRuleCondition  implements Serializable {
  
  private String id = null;
  private Map<String, String> parameters = null;

  /**
   * Gets or Sets conditionType
   */
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
  public CampaignRuleNotificationCampaignRuleCondition id(String id) {
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
  public CampaignRuleNotificationCampaignRuleCondition parameters(Map<String, String> parameters) {
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
  public CampaignRuleNotificationCampaignRuleCondition conditionType(ConditionTypeEnum conditionType) {
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
  public CampaignRuleNotificationCampaignRuleCondition additionalProperties(Object additionalProperties) {
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
    CampaignRuleNotificationCampaignRuleCondition campaignRuleNotificationCampaignRuleCondition = (CampaignRuleNotificationCampaignRuleCondition) o;
    return Objects.equals(this.id, campaignRuleNotificationCampaignRuleCondition.id) &&
        Objects.equals(this.parameters, campaignRuleNotificationCampaignRuleCondition.parameters) &&
        Objects.equals(this.conditionType, campaignRuleNotificationCampaignRuleCondition.conditionType) &&
        Objects.equals(this.additionalProperties, campaignRuleNotificationCampaignRuleCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, conditionType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleNotificationCampaignRuleCondition {\n");
    
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

