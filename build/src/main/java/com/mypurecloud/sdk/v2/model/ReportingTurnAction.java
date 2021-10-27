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
 * ReportingTurnAction
 */

public class ReportingTurnAction  implements Serializable {
  
  private String actionId = null;
  private String actionName = null;
  private Integer actionNumber = null;

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
   * Gets or Sets actionType
   */
 @JsonDeserialize(using = ActionTypeEnumDeserializer.class)
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASKFORNLUINTENTACTION("AskForNLUIntentAction"),
    ASKFORBOOLEANACTION("AskForBooleanAction"),
    ASKFORSLOTACTION("AskForSlotAction"),
    ASKFORNLUNEXTINTENTACTION("AskForNLUNextIntentAction"),
    BOTSTATE("BotState"),
    DISCONNECTACTION("DisconnectAction"),
    EXITBOTFLOWACTION("ExitBotFlowAction"),
    CALLTASKACTION("CallTaskAction"),
    ENDTASKACTION("EndTaskAction"),
    UPDATEVARIABLEACTION("UpdateVariableAction"),
    COMMUNICATEACTION("CommunicateAction"),
    DECISIONACTION("DecisionAction"),
    SWITCHACTION("SwitchAction"),
    DATAACTION("DataAction"),
    DATATABLELOOKUPACTION("DataTableLookupAction"),
    GETEXTERNALCONTACTACTION("GetExternalContactAction"),
    GETEXTERNALORGANIZATIONACTION("GetExternalOrganizationAction"),
    LOOPACTION("LoopAction"),
    EXITLOOPACTION("ExitLoopAction"),
    NEXTLOOPACTION("NextLoopAction"),
    LOOPUNTILACTION("LoopUntilAction"),
    SETACTIVEINTENTACTION("SetActiveIntentAction"),
    CLEARSLOTACTION("ClearSlotAction"),
    SETFLOWOUTCOMEACTION("SetFlowOutcomeAction"),
    INITIALIZEFLOWOUTCOMEACTION("InitializeFlowOutcomeAction"),
    ADDFLOWMILESTONEACTION("AddFlowMilestoneAction"),
    ASKFORSTRINGACTION("AskForStringAction"),
    SENDRESPONSEACTION("SendResponseAction"),
    GETRESPONSEACTION("GetResponseAction"),
    UNKNOWN("Unknown");

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

  
  /**
   * The ID of the action in the bot flow.
   **/
  public ReportingTurnAction actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the action in the bot flow.")
  @JsonProperty("actionId")
  public String getActionId() {
    return actionId;
  }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  
  /**
   * The name of the action in the bot flow.
   **/
  public ReportingTurnAction actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the action in the bot flow.")
  @JsonProperty("actionName")
  public String getActionName() {
    return actionName;
  }
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  
  /**
   * The number of the action in the bot flow.
   **/
  public ReportingTurnAction actionNumber(Integer actionNumber) {
    this.actionNumber = actionNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of the action in the bot flow.")
  @JsonProperty("actionNumber")
  public Integer getActionNumber() {
    return actionNumber;
  }
  public void setActionNumber(Integer actionNumber) {
    this.actionNumber = actionNumber;
  }

  
  /**
   **/
  public ReportingTurnAction actionType(ActionTypeEnum actionType) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnAction reportingTurnAction = (ReportingTurnAction) o;
    return Objects.equals(this.actionId, reportingTurnAction.actionId) &&
        Objects.equals(this.actionName, reportingTurnAction.actionName) &&
        Objects.equals(this.actionNumber, reportingTurnAction.actionNumber) &&
        Objects.equals(this.actionType, reportingTurnAction.actionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionName, actionNumber, actionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnAction {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionNumber: ").append(toIndentedString(actionNumber)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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

