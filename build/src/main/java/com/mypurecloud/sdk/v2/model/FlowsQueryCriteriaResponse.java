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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueryCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The response for QueryCapabilities which contains the allowed criteria, flow types and action types for the organization.
 */
@ApiModel(description = "The response for QueryCapabilities which contains the allowed criteria, flow types and action types for the organization.")

public class FlowsQueryCriteriaResponse  implements Serializable {
  
  private List<QueryCriteria> criteria = null;

  private static class FlowTypesEnumDeserializer extends StdDeserializer<FlowTypesEnum> {
    public FlowTypesEnumDeserializer() {
      super(FlowTypesEnumDeserializer.class);
    }

    @Override
    public FlowTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flowTypes
   */
 @JsonDeserialize(using = FlowTypesEnumDeserializer.class)
  public enum FlowTypesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("bot"),
    COMMONMODULE("commonmodule"),
    DIGITALBOT("digitalbot"),
    INBOUNDCALL("inboundcall"),
    INBOUNDCHAT("inboundchat"),
    INBOUNDEMAIL("inboundemail"),
    INBOUNDSHORTMESSAGE("inboundshortmessage"),
    INQUEUECALL("inqueuecall"),
    INQUEUESHORTMESSAGE("inqueueshortmessage"),
    INQUEUEEMAIL("inqueueemail"),
    OUTBOUNDCALL("outboundcall"),
    SECURECALL("securecall"),
    SURVEYINVITE("surveyinvite"),
    VOICE("voice"),
    VOICEMAIL("voicemail"),
    VOICESURVEY("voicesurvey"),
    WORKFLOW("workflow"),
    WORKITEM("workitem");

    private String value;

    FlowTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowTypesEnum fromString(String key) {
      if (key == null) return null;

      for (FlowTypesEnum value : FlowTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlowTypesEnum> flowTypes = null;

  private static class ActionTypesEnumDeserializer extends StdDeserializer<ActionTypesEnum> {
    public ActionTypesEnumDeserializer() {
      super(ActionTypesEnumDeserializer.class);
    }

    @Override
    public ActionTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actionTypes
   */
 @JsonDeserialize(using = ActionTypesEnumDeserializer.class)
  public enum ActionTypesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIONABORTSURVEYINVITE("actionAbortSurveyInvite"),
    ACTIONADDFLOWMILESTONE("actionAddFlowMilestone"),
    ACTIONASKFORBOOLEAN("actionAskForBoolean"),
    ACTIONASKFORNLUINTENT("actionAskForNLUIntent"),
    ACTIONASKFORNLUNEXTINTENT("actionAskForNLUNextIntent"),
    ACTIONASKFORSLOT("actionAskForSlot"),
    ACTIONCALLBOTCONNECTOR("actionCallBotConnector"),
    ACTIONCALLBOTFLOW("actionCallBotFlow"),
    ACTIONCALLCOMMONMODULE("actionCallCommonModule"),
    ACTIONCALLDATA("actionCallData"),
    ACTIONCALLDATASECURE("actionCallDataSecure"),
    ACTIONCALLDIALOGENGINEBOT("actionCallDialogEngineBot"),
    ACTIONCALLDIALOGFLOWBOT("actionCallDialogflowBot"),
    ACTIONCALLDIALOGFLOWCXBOT("actionCallDialogflowCxBot"),
    ACTIONCALLDIGITALBOTFLOW("actionCallDigitalBotFlow"),
    ACTIONCALLLEXBOT("actionCallLexBot"),
    ACTIONCALLLEXV2BOT("actionCallLexV2Bot"),
    ACTIONCALLNUANCEMIXBOT("actionCallNuanceMixBot"),
    ACTIONCALLTASK("actionCallTask"),
    ACTIONCHANGESTATE("actionChangeState"),
    ACTIONCLEARSLOT("actionClearSlot"),
    ACTIONCLEARVOICEMAILSNIPPET("actionClearVoicemailSnippet"),
    ACTIONCOLLECTINPUT("actionCollectInput"),
    ACTIONCOMMUNICATE("actionCommunicate"),
    ACTIONCOMPLETESURVEYINVITE("actionCompleteSurveyInvite"),
    ACTIONCREATECALLBACK("actionCreateCallback"),
    ACTIONDATATABLELOOKUP("actionDataTableLookup"),
    ACTIONDECISION("actionDecision"),
    ACTIONDECRYPTDATA("actionDecryptData"),
    ACTIONDETECTSILENCE("actionDetectSilence"),
    ACTIONDIALEXTENSION("actionDialExtension"),
    ACTIONDIALNAME("actionDialName"),
    ACTIONDIGITALMENU("actionDigitalMenu"),
    ACTIONDISCONNECT("actionDisconnect"),
    ACTIONENABLEPARTICIPANTRECORD("actionEnableParticipantRecord"),
    ACTIONENCRYPTDATA("actionEncryptData"),
    ACTIONENDSTATE("actionEndState"),
    ACTIONENDTASK("actionEndTask"),
    ACTIONENDWORKFLOW("actionEndWorkflow"),
    ACTIONEVALUATESCHEDULE("actionEvaluateSchedule"),
    ACTIONEVALUATESCHEDULEGROUP("actionEvaluateScheduleGroup"),
    ACTIONEXITBOTFLOW("actionExitBotFlow"),
    ACTIONEXITLOOP("actionExitLoop"),
    ACTIONEXTRACTSECUREDATA("actionExtractSecureData"),
    ACTIONFINDEMERGENCYGROUP("actionFindEmergencyGroup"),
    ACTIONFINDGROUP("actionFindGroup"),
    ACTIONFINDLANGUAGESKILL("actionFindLanguageSkill"),
    ACTIONFINDQUEUE("actionFindQueue"),
    ACTIONFINDQUEUEBYID("actionFindQueueById"),
    ACTIONFINDSCHEDULE("actionFindSchedule"),
    ACTIONFINDSCHEDULEGROUP("actionFindScheduleGroup"),
    ACTIONFINDSKILL("actionFindSkill"),
    ACTIONFINDSYSTEMPROMPT("actionFindSystemPrompt"),
    ACTIONFINDUSER("actionFindUser"),
    ACTIONFINDUSERBYID("actionFindUserById"),
    ACTIONFINDUSERPROMPT("actionFindUserPrompt"),
    ACTIONFINDUSERSBYID("actionFindUsersById"),
    ACTIONFLUSHAUDIO("actionFlushAudio"),
    ACTIONGETCONVERSATIONDATA("actionGetConversationData"),
    ACTIONGETEXTERNALCONTACT("actionGetExternalContact"),
    ACTIONGETEXTERNALORGANIZATION("actionGetExternalOrganization"),
    ACTIONGETJOURNEYOUTCOME("actionGetJourneyOutcome"),
    ACTIONGETJOURNEYOUTCOMESCORESBYSESSION("actionGetJourneyOutcomeScoresBySession"),
    ACTIONGETJOURNEYSEGMENT("actionGetJourneySegment"),
    ACTIONGETJOURNEYSESSION("actionGetJourneySession"),
    ACTIONGETJOURNEYSESSIONSBYCUSTOMER("actionGetJourneySessionsByCustomer"),
    ACTIONGETJOURNEYSESSIONSBYEXTERNALCONTACT("actionGetJourneySessionsByExternalContact"),
    ACTIONGETPARTICIPANTDATA("actionGetParticipantData"),
    ACTIONGETRESPONSE("actionGetResponse"),
    ACTIONGETSECUREDDATA("actionGetSecuredData"),
    ACTIONHOLDMUSIC("actionHoldMusic"),
    ACTIONINITIALIZEFLOWOUTCOME("actionInitializeFlowOutcome"),
    ACTIONJUMPTOMENU("actionJumpToMenu"),
    ACTIONJUMPTOTASK("actionJumpToTask"),
    ACTIONLOOP("actionLoop"),
    ACTIONLOOPUNTIL("actionLoopUntil"),
    ACTIONNEXTLOOP("actionNextLoop"),
    ACTIONPLAYAUDIO("actionPlayAudio"),
    ACTIONPLAYAUDIOONSILENCE("actionPlayAudioOnSilence"),
    ACTIONPLAYESTIMATEDWAITTIME("actionPlayEstimatedWaitTime"),
    ACTIONPLAYPOSITIONINQUEUE("actionPlayPositionInQueue"),
    ACTIONPLAYUSERGREETING("actionPlayUserGreeting"),
    ACTIONPLAYUSERNAME("actionPlayUserName"),
    ACTIONPREVIOUSMENU("actionPreviousMenu"),
    ACTIONPROCESSVOICEMAILINPUT("actionProcessVoicemailInput"),
    ACTIONREPEATMENU("actionRepeatMenu"),
    ACTIONRETURNTOAGENT("actionReturnToAgent"),
    ACTIONSAVEWORKITEM("actionSaveWorkitem"),
    ACTIONSCREENPOP("actionScreenPop"),
    ACTIONSEARCHEXTERNALCONTACTS("actionSearchExternalContacts"),
    ACTIONSENDAUTOREPLY("actionSendAutoReply"),
    ACTIONSENDRESPONSE("actionSendResponse"),
    ACTIONSETACTIVEINTENT("actionSetActiveIntent"),
    ACTIONSETCONVERSATIONDATA("actionSetConversationData"),
    ACTIONSETEXTERNALTAG("actionSetExternalTag"),
    ACTIONSETFLOWOUTCOME("actionSetFlowOutcome"),
    ACTIONSETLOCALE("actionSetLocale"),
    ACTIONSETPARTICIPANTDATA("actionSetParticipantData"),
    ACTIONSETPRIORITY("actionSetPriority"),
    ACTIONSETSECUREDDATA("actionSetSecuredData"),
    ACTIONSETSKILLS("actionSetSkills"),
    ACTIONSETUUIDATA("actionSetUUIData"),
    ACTIONSETWHISPERAUDIO("actionSetWhisperAudio"),
    ACTIONSETWRAPUPCODE("actionSetWrapupCode"),
    ACTIONSHOWKNOWLEDGEARTICLE("actionShowKnowledgeArticle"),
    ACTIONSUBMITVOICEMAILSNIPPET("actionSubmitVoicemailSnippet"),
    ACTIONSWITCH("actionSwitch"),
    ACTIONTRANSCRIPTION("actionTranscription"),
    ACTIONTRANSFEREXTERNAL("actionTransferExternal"),
    ACTIONTRANSFERFLOW("actionTransferFlow"),
    ACTIONTRANSFERFLOWSECURE("actionTransferFlowSecure"),
    ACTIONTRANSFERGROUP("actionTransferGroup"),
    ACTIONTRANSFERTOACD("actionTransferToAcd"),
    ACTIONTRANSFERUSER("actionTransferUser"),
    ACTIONTRANSFERVOICEMAIL("actionTransferVoicemail"),
    ACTIONUPDATEDATA("actionUpdateData"),
    ACTIONWAIT("actionWait"),
    ACTIONWAITFORINPUT("actionWaitForInput"),
    MENUDIALEXTENSION("menuDialExtension"),
    MENUDIALNAME("menuDialName"),
    MENUDISCONNECT("menuDisconnect"),
    MENUJUMPTOMENU("menuJumpToMenu"),
    MENUJUMPTOTASK("menuJumpToTask"),
    MENUMENU("menuMenu"),
    MENUPREVIOUSMENU("menuPreviousMenu"),
    MENUREPEATMENU("menuRepeatMenu"),
    MENUSHOWKNOWLEDGEARTICLE("menuShowKnowledgeArticle"),
    MENUTASK("menuTask"),
    MENUTRANSFERTOACD("menuTransferToAcd"),
    MENUTRANSFERFLOW("menuTransferFlow"),
    MENUTRANSFERGROUP("menuTransferGroup"),
    MENUTRANSFEREXTERNAL("menuTransferExternal"),
    MENUTRANSFERFLOWSECURE("menuTransferFlowSecure"),
    MENUTRANSFERUSER("menuTransferUser"),
    MENUTRANSFERVOICEMAIL("menuTransferVoicemail");

    private String value;

    ActionTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypesEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypesEnum value : ActionTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ActionTypesEnum> actionTypes = null;
  private List<String> errorCodes = null;
  private List<String> warningCodes = null;

  public FlowsQueryCriteriaResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      criteria = new ArrayList<QueryCriteria>();
      flowTypes = new ArrayList<FlowTypesEnum>();
      actionTypes = new ArrayList<ActionTypesEnum>();
      errorCodes = new ArrayList<String>();
      warningCodes = new ArrayList<String>();
    }
  }

  
  /**
   * The is a list of allowed criteria to query on.
   **/
  public FlowsQueryCriteriaResponse criteria(List<QueryCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is a list of allowed criteria to query on.")
  @JsonProperty("criteria")
  public List<QueryCriteria> getCriteria() {
    return criteria;
  }
  public void setCriteria(List<QueryCriteria> criteria) {
    this.criteria = criteria;
  }


  /**
   * The is a list of flow types the organization has access to.
   **/
  public FlowsQueryCriteriaResponse flowTypes(List<FlowTypesEnum> flowTypes) {
    this.flowTypes = flowTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is a list of flow types the organization has access to.")
  @JsonProperty("flowTypes")
  public List<FlowTypesEnum> getFlowTypes() {
    return flowTypes;
  }
  public void setFlowTypes(List<FlowTypesEnum> flowTypes) {
    this.flowTypes = flowTypes;
  }


  /**
   * The is a list of action types the organization has access to.
   **/
  public FlowsQueryCriteriaResponse actionTypes(List<ActionTypesEnum> actionTypes) {
    this.actionTypes = actionTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is a list of action types the organization has access to.")
  @JsonProperty("actionTypes")
  public List<ActionTypesEnum> getActionTypes() {
    return actionTypes;
  }
  public void setActionTypes(List<ActionTypesEnum> actionTypes) {
    this.actionTypes = actionTypes;
  }


  /**
   * The is a list of potential error codes the organization may encounter.
   **/
  public FlowsQueryCriteriaResponse errorCodes(List<String> errorCodes) {
    this.errorCodes = errorCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is a list of potential error codes the organization may encounter.")
  @JsonProperty("errorCodes")
  public List<String> getErrorCodes() {
    return errorCodes;
  }
  public void setErrorCodes(List<String> errorCodes) {
    this.errorCodes = errorCodes;
  }


  /**
   * The is a list of potential warning codes the organization may encounter.
   **/
  public FlowsQueryCriteriaResponse warningCodes(List<String> warningCodes) {
    this.warningCodes = warningCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is a list of potential warning codes the organization may encounter.")
  @JsonProperty("warningCodes")
  public List<String> getWarningCodes() {
    return warningCodes;
  }
  public void setWarningCodes(List<String> warningCodes) {
    this.warningCodes = warningCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowsQueryCriteriaResponse flowsQueryCriteriaResponse = (FlowsQueryCriteriaResponse) o;

    return Objects.equals(this.criteria, flowsQueryCriteriaResponse.criteria) &&
            Objects.equals(this.flowTypes, flowsQueryCriteriaResponse.flowTypes) &&
            Objects.equals(this.actionTypes, flowsQueryCriteriaResponse.actionTypes) &&
            Objects.equals(this.errorCodes, flowsQueryCriteriaResponse.errorCodes) &&
            Objects.equals(this.warningCodes, flowsQueryCriteriaResponse.warningCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, flowTypes, actionTypes, errorCodes, warningCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowsQueryCriteriaResponse {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    flowTypes: ").append(toIndentedString(flowTypes)).append("\n");
    sb.append("    actionTypes: ").append(toIndentedString(actionTypes)).append("\n");
    sb.append("    errorCodes: ").append(toIndentedString(errorCodes)).append("\n");
    sb.append("    warningCodes: ").append(toIndentedString(warningCodes)).append("\n");
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

