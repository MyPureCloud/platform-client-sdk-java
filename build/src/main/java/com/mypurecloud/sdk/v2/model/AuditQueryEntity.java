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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditQueryEntity
 */

public class AuditQueryEntity  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the Entity
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCESSTOKEN("AccessToken"),
    ACTIONMAP("ActionMap"),
    ACTIONTEMPLATE("ActionTemplate"),
    ACTIVITYCODE("ActivityCode"),
    AGENTROUTINGINFO("AgentRoutingInfo"),
    ANNOTATION("Annotation"),
    APPOINTMENT("Appointment"),
    ASSIGNMENT("Assignment"),
    ATTEMPTLIMITS("AttemptLimits"),
    AUTHORGANIZATION("AuthOrganization"),
    AUTHUSER("AuthUser"),
    BULK("Bulk"),
    BULKACTIONS("BulkActions"),
    BUSINESSUNIT("BusinessUnit"),
    CALIBRATION("Calibration"),
    CALLABLETIMESET("CallableTimeSet"),
    CALLANALYSISRESPONSESET("CallAnalysisResponseSet"),
    CAMPAIGN("Campaign"),
    CAMPAIGNRULE("CampaignRule"),
    CAMPAIGNSCHEDULE("CampaignSchedule"),
    CHANGEREQUEST("ChangeRequest"),
    CLICKSTREAMSETTINGS("ClickstreamSettings"),
    CONFIGURATION("Configuration"),
    CONFIGURATIONVERSION("ConfigurationVersion"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    CONVERSATIONATTRIBUTES("ConversationAttributes"),
    CONVERSATIONACCOUNT("ConversationAccount"),
    CONVERSATIONDEFAULTSUPPORTEDCONTENT("ConversationDefaultSupportedContent"),
    CONVERSATIONPHONENUMBER("ConversationPhoneNumber"),
    CONVERSATIONRECIPIENT("ConversationRecipient"),
    CONVERSATIONTHREADINGWINDOW("ConversationThreadingWindow"),
    DASHBOARDSETTINGS("DashboardSettings"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    DEPLOYMENT("Deployment"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    DNCLIST("DNCList"),
    DOCUMENT("Document"),
    DYNAMICGROUP("DynamicGroup"),
    DYNAMICSCHEMA("DynamicSchema"),
    EDGE("Edge"),
    EDGEGROUP("EdgeGroup"),
    EDGELOG("EdgeLog"),
    EDGELOGZIP("EdgeLogZip"),
    EDGEPCAPS("EdgePcaps"),
    EDGEPREFERENCES("EdgePreferences"),
    EDGETRACELEVEL("EdgeTraceLevel"),
    EMERGENCYGROUP("EmergencyGroup"),
    EVALUATION("Evaluation"),
    EVALUATIONFORM("EvaluationForm"),
    EVENTTYPE("EventType"),
    EXPORTS("Exports"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    EXTERNALMETRICSDATA("ExternalMetricsData"),
    EXTERNALMETRICSDEFINITION("ExternalMetricsDefinition"),
    FEEDBACK("Feedback"),
    FLOW("Flow"),
    FLOWMILESTONE("FlowMilestone"),
    FLOWOUTCOME("FlowOutcome"),
    FORECAST("Forecast"),
    HISTORICALDATA("HistoricalData"),
    INSIGHTSETTINGS("InsightSettings"),
    INTEGRATION("Integration"),
    IVR("IVR"),
    KNOWLEDGEBASE("KnowledgeBase"),
    KNOWLEDGECATEGORY("KnowledgeCategory"),
    KNOWLEDGEDOCUMENT("KnowledgeDocument"),
    KNOWLEDGEDOCUMENTVARIATION("KnowledgeDocumentVariation"),
    KNOWLEDGESEARCHFEEDBACK("KnowledgeSearchFeedback"),
    KNOWLEDGETRAINING("KnowledgeTraining"),
    LINE("Line"),
    LINEBASE("LineBase"),
    LOCATION("Location"),
    MANAGEMENTUNIT("ManagementUnit"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    MEDIADIAGNOSTICSTRACEFILE("MediaDiagnosticsTraceFile"),
    MESSAGINGCAMPAIGN("MessagingCampaign"),
    METRIC("Metric"),
    MODULE("Module"),
    NUMBERPLAN("NumberPlan"),
    OAUTHCLIENT("OAuthClient"),
    OAUTHCLIENTAUTHORIZATION("OAuthClientAuthorization"),
    ORGANIZATIONAUTHORIZATIONTRUST("OrganizationAuthorizationTrust"),
    ORGANIZATIONAUTHORIZATIONUSERTRUST("OrganizationAuthorizationUserTrust"),
    ORGANIZATIONFEATURE("OrganizationFeature"),
    ORGANIZATIONINTEGRATIONSACCESS("OrganizationIntegrationsAccess"),
    ORGANIZATIONSETTINGS("OrganizationSettings"),
    ORPHANEDRECORDING("OrphanedRecording"),
    OUTBOUNDROUTE("OutboundRoute"),
    OUTCOME("Outcome"),
    PCAPS("Pcaps"),
    PHONE("Phone"),
    PHONEBASE("PhoneBase"),
    PLANNINGGROUP("PlanningGroup"),
    POLICY("Policy"),
    PREDICTOR("Predictor"),
    PRODUCT("Product"),
    PROFILE("Profile"),
    PROFILEMEMBERS("ProfileMembers"),
    PROGRAM("Program"),
    PROMPT("Prompt"),
    PROMPTRESOURCE("PromptResource"),
    QUEUE("Queue"),
    RECORDING("Recording"),
    RECORDINGANNOTATION("RecordingAnnotation"),
    RECORDINGSETTINGS("RecordingSettings"),
    RESPONSE("Response"),
    ROLE("Role"),
    ROW("Row"),
    ROUTINGTRANSCRIPTIONSETTINGS("RoutingTranscriptionSettings"),
    ROUTINGUTILIZATIONTAG("RoutingUtilizationTag"),
    RULE("Rule"),
    RULESET("RuleSet"),
    SCHEDULE("Schedule"),
    SCHEDULEDEXPORTS("ScheduledExports"),
    SCHEDULEGROUP("ScheduleGroup"),
    SCHEMA("Schema"),
    SCREENRECORDING("ScreenRecording"),
    SEGMENT("Segment"),
    SENTIMENTFEEDBACK("SentimentFeedback"),
    SEQUENCE("Sequence"),
    SEQUENCESCHEDULE("SequenceSchedule"),
    SERVICEGOALTEMPLATE("ServiceGoalTemplate"),
    SESSIONTYPE("SessionType"),
    SHIFTTRADE("ShiftTrade"),
    SITE("Site"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings"),
    STATUS("Status"),
    SUPPORTEDCONTENT("SupportedContent"),
    SUPPORTFILE("SupportFile"),
    SURVEY("Survey"),
    SURVEYFORM("SurveyForm"),
    TEAM("Team"),
    TIMEOFFREQUEST("TimeOffRequest"),
    TOPIC("Topic"),
    TRANSCRIPTIONSETTINGS("TranscriptionSettings"),
    TRIGGER("Trigger"),
    TRUNK("Trunk"),
    TRUNKBASE("TrunkBase"),
    USER("User"),
    USERPRESENCE("UserPresence"),
    VOICEMAILPOLICY("VoicemailPolicy"),
    VOICEMAILUSERPOLICY("VoicemailUserPolicy"),
    WEBHOOK("Webhook"),
    WORKPLAN("WorkPlan"),
    WORKPLANROTATION("WorkPlanRotation"),
    WORKSPACE("Workspace"),
    WRAPUPCODE("WrapupCode"),
    WRAPUPCODEMAPPING("WrapUpCodeMapping"),
    PARTICIPANT("Participant");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

  private static class ActionsEnumDeserializer extends StdDeserializer<ActionsEnum> {
    public ActionsEnumDeserializer() {
      super(ActionsEnumDeserializer.class);
    }

    @Override
    public ActionsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actions
   */
 @JsonDeserialize(using = ActionsEnumDeserializer.class)
  public enum ActionsEnum {
    CREATE("Create"),
    VIEW("View"),
    UPDATE("Update"),
    MOVE("Move"),
    DELETE("Delete"),
    DELETEALL("DeleteAll"),
    DOWNLOAD("Download"),
    UPLOAD("Upload"),
    MEMBERADD("MemberAdd"),
    MEMBERUPDATE("MemberUpdate"),
    MEMBERREMOVE("MemberRemove"),
    READ("Read"),
    READALL("ReadAll"),
    EXECUTE("Execute"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    UPDATERETENTION("UpdateRetention"),
    ABANDON("Abandon"),
    ARCHIVE("Archive"),
    RESTOREREQUEST("RestoreRequest"),
    RESTORECOMPLETE("RestoreComplete"),
    PROMOTE("Promote"),
    PUBLISH("Publish"),
    UNPUBLISH("Unpublish"),
    ACTIVATE("Activate"),
    CHECKIN("Checkin"),
    CHECKOUT("Checkout"),
    DEACTIVATE("Deactivate"),
    DEBUG("Debug"),
    SAVE("Save"),
    REVERT("Revert"),
    TRANSCODE("Transcode"),
    ENABLE("Enable"),
    DISABLE("Disable"),
    AUTHORIZE("Authorize"),
    DEAUTHORIZE("Deauthorize"),
    AUTHENTICATE("Authenticate"),
    CHANGEPASSWORD("ChangePassword"),
    REVOKE("Revoke"),
    EXPORT("Export"),
    APPEND("Append"),
    RECYCLE("Recycle"),
    OPEN("Open"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented"),
    WRITE("Write"),
    PURGE("Purge"),
    PROCESSED("Processed"),
    REPLACE("Replace"),
    UPDATEINSERVICE("UpdateInService"),
    UPDATEOUTOFSERVICE("UpdateOutOfService"),
    CYCLE("Cycle"),
    SCALE("Scale"),
    IPALLOWLISTCLEAR("IpAllowlistClear"),
    ADDPAIRINGROLE("AddPairingRole"),
    ADD("Add"),
    VERIFY("Verify"),
    ASSIGN("Assign"),
    UNASSIGN("Unassign"),
    REASSIGN("Reassign"),
    RESCHEDULE("Reschedule"),
    CANCEL("Cancel"),
    SOFTDELETE("SoftDelete");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionsEnum fromString(String key) {
      if (key == null) return null;

      for (ActionsEnum value : ActionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ActionsEnum> actions = new ArrayList<ActionsEnum>();

  
  /**
   * Name of the Entity
   **/
  public AuditQueryEntity name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Entity")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  
  /**
   * List of Actions
   **/
  public AuditQueryEntity actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Actions")
  @JsonProperty("actions")
  public List<ActionsEnum> getActions() {
    return actions;
  }
  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryEntity auditQueryEntity = (AuditQueryEntity) o;
    return Objects.equals(this.name, auditQueryEntity.name) &&
        Objects.equals(this.actions, auditQueryEntity.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

