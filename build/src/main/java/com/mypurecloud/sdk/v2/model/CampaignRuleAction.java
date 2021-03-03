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
import com.mypurecloud.sdk.v2.model.CampaignRuleActionEntities;
import com.mypurecloud.sdk.v2.model.CampaignRuleParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleAction
 */

public class CampaignRuleAction  implements Serializable {
  
  private String id = null;
  private CampaignRuleParameters parameters = null;

  private static class ActionTypeEnumDeserializer extends StdDeserializer<ActionTypeEnum> {
    public ActionTypeEnumDeserializer() {
      super(ActionTypeEnumDeserializer.class);
    }

    @Override
    public ActionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action to take on the campaignRuleActionEntities.
   */
 @JsonDeserialize(using = ActionTypeEnumDeserializer.class)
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TURNONCAMPAIGN("turnOnCampaign"),
    TURNOFFCAMPAIGN("turnOffCampaign"),
    TURNONSEQUENCE("turnOnSequence"),
    TURNOFFSEQUENCE("turnOffSequence"),
    SETCAMPAIGNPRIORITY("setCampaignPriority"),
    RECYCLECAMPAIGN("recycleCampaign"),
    SETCAMPAIGNDIALINGMODE("setCampaignDialingMode");

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
  private CampaignRuleActionEntities campaignRuleActionEntities = null;

  
  /**
   **/
  public CampaignRuleAction id(String id) {
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
   * The parameters for the CampaignRuleAction. Required for certain actionTypes.
   **/
  public CampaignRuleAction parameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The parameters for the CampaignRuleAction. Required for certain actionTypes.")
  @JsonProperty("parameters")
  public CampaignRuleParameters getParameters() {
    return parameters;
  }
  public void setParameters(CampaignRuleParameters parameters) {
    this.parameters = parameters;
  }

  
  /**
   * The action to take on the campaignRuleActionEntities.
   **/
  public CampaignRuleAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action to take on the campaignRuleActionEntities.")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  
  /**
   * The list of entities that this action will apply to.
   **/
  public CampaignRuleAction campaignRuleActionEntities(CampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of entities that this action will apply to.")
  @JsonProperty("campaignRuleActionEntities")
  public CampaignRuleActionEntities getCampaignRuleActionEntities() {
    return campaignRuleActionEntities;
  }
  public void setCampaignRuleActionEntities(CampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleAction campaignRuleAction = (CampaignRuleAction) o;
    return Objects.equals(this.id, campaignRuleAction.id) &&
        Objects.equals(this.parameters, campaignRuleAction.parameters) &&
        Objects.equals(this.actionType, campaignRuleAction.actionType) &&
        Objects.equals(this.campaignRuleActionEntities, campaignRuleAction.campaignRuleActionEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, actionType, campaignRuleActionEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    campaignRuleActionEntities: ").append(toIndentedString(campaignRuleActionEntities)).append("\n");
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

