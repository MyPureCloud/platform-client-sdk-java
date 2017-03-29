package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationCampaignRuleActionEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CampaignRuleNotificationCampaignRuleActions
 */

public class CampaignRuleNotificationCampaignRuleActions  implements Serializable {
  
  private String id = null;
  private Map<String, String> parameters = new HashMap<String, String>();

  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TURN_ON_CAMPAIGN("TURN_ON_CAMPAIGN"),
    TURN_OFF_CAMPAIGN("TURN_OFF_CAMPAIGN"),
    TURN_ON_SEQUENCE("TURN_ON_SEQUENCE"),
    TURN_OFF_SEQUENCE("TURN_OFF_SEQUENCE"),
    SET_CAMPAIGN_PRIORITY("SET_CAMPAIGN_PRIORITY"),
    RECYCLE_CAMPAIGN("RECYCLE_CAMPAIGN");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeEnum value : ActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeEnum actionType = null;
  private CampaignRuleNotificationCampaignRuleActionEntities campaignRuleActionEntities = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleActions id(String id) {
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
  public CampaignRuleNotificationCampaignRuleActions parameters(Map<String, String> parameters) {
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
  public CampaignRuleNotificationCampaignRuleActions actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  /**
   **/
  public CampaignRuleNotificationCampaignRuleActions campaignRuleActionEntities(CampaignRuleNotificationCampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleActionEntities")
  public CampaignRuleNotificationCampaignRuleActionEntities getCampaignRuleActionEntities() {
    return campaignRuleActionEntities;
  }
  public void setCampaignRuleActionEntities(CampaignRuleNotificationCampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
  }


  /**
   **/
  public CampaignRuleNotificationCampaignRuleActions additionalProperties(Object additionalProperties) {
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
    CampaignRuleNotificationCampaignRuleActions campaignRuleNotificationCampaignRuleActions = (CampaignRuleNotificationCampaignRuleActions) o;
    return Objects.equals(this.id, campaignRuleNotificationCampaignRuleActions.id) &&
        Objects.equals(this.parameters, campaignRuleNotificationCampaignRuleActions.parameters) &&
        Objects.equals(this.actionType, campaignRuleNotificationCampaignRuleActions.actionType) &&
        Objects.equals(this.campaignRuleActionEntities, campaignRuleNotificationCampaignRuleActions.campaignRuleActionEntities) &&
        Objects.equals(this.additionalProperties, campaignRuleNotificationCampaignRuleActions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, actionType, campaignRuleActionEntities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleNotificationCampaignRuleActions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    campaignRuleActionEntities: ").append(toIndentedString(campaignRuleActionEntities)).append("\n");
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

