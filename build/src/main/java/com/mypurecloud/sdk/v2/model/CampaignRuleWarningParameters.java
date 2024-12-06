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
 * CampaignRuleWarningParameters
 */

public class CampaignRuleWarningParameters  implements Serializable {
  
  private String actionId = null;
  private String conditionId = null;

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
   * Type of action
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
    SETCAMPAIGNDIALINGMODE("setCampaignDialingMode"),
    SETCAMPAIGNABANDONRATE("setCampaignAbandonRate"),
    SETCAMPAIGNNUMBEROFLINES("setCampaignNumberOfLines"),
    SETCAMPAIGNWEIGHT("setCampaignWeight"),
    SETCAMPAIGNMAXCALLSPERAGENT("setCampaignMaxCallsPerAgent"),
    SETCAMPAIGNMESSAGESPERMINUTE("setCampaignMessagesPerMinute"),
    CHANGECAMPAIGNQUEUE("changeCampaignQueue"),
    CHANGECAMPAIGNTEMPLATE("changeCampaignTemplate");

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
   * Type of condition
   */
 @JsonDeserialize(using = ConditionTypeEnumDeserializer.class)
  public enum ConditionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CAMPAIGNPROGRESS("campaignProgress"),
    CAMPAIGNAGENTS("campaignAgents"),
    CAMPAIGNRECORDSATTEMPTED("campaignRecordsAttempted"),
    CAMPAIGNCONTACTSMESSAGED("campaignContactsMessaged"),
    CAMPAIGNBUSINESSSUCCESS("campaignBusinessSuccess"),
    CAMPAIGNBUSINESSFAILURE("campaignBusinessFailure"),
    CAMPAIGNBUSINESSNEUTRAL("campaignBusinessNeutral"),
    CAMPAIGNVALIDATTEMPTS("campaignValidAttempts"),
    CAMPAIGNRIGHTPARTYCONTACTS("campaignRightPartyContacts");

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
   * ID of action
   **/
  public CampaignRuleWarningParameters actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of action")
  @JsonProperty("actionId")
  public String getActionId() {
    return actionId;
  }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  /**
   * ID of condition
   **/
  public CampaignRuleWarningParameters conditionId(String conditionId) {
    this.conditionId = conditionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of condition")
  @JsonProperty("conditionId")
  public String getConditionId() {
    return conditionId;
  }
  public void setConditionId(String conditionId) {
    this.conditionId = conditionId;
  }


  /**
   * Type of action
   **/
  public CampaignRuleWarningParameters actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of action")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  /**
   * Type of condition
   **/
  public CampaignRuleWarningParameters conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of condition")
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
    CampaignRuleWarningParameters campaignRuleWarningParameters = (CampaignRuleWarningParameters) o;

    return Objects.equals(this.actionId, campaignRuleWarningParameters.actionId) &&
            Objects.equals(this.conditionId, campaignRuleWarningParameters.conditionId) &&
            Objects.equals(this.actionType, campaignRuleWarningParameters.actionType) &&
            Objects.equals(this.conditionType, campaignRuleWarningParameters.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, conditionId, actionType, conditionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleWarningParameters {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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

