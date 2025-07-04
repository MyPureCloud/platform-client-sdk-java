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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AuditTopicAddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AuditTopicDomainEntityRef;
import com.mypurecloud.sdk.v2.model.AuditTopicMessageInfo;
import com.mypurecloud.sdk.v2.model.AuditTopicPropertyChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AuditTopicAuditLogMessage
 */

public class AuditTopicAuditLogMessage  implements Serializable {
  
  private String id = null;
  private String userId = null;
  private String userHomeOrgId = null;
  private AuditTopicDomainEntityRef username = null;
  private String userDisplay = null;
  private AuditTopicAddressableEntityRef clientId = null;
  private List<String> remoteIp = null;

  private static class ServiceNameEnumDeserializer extends StdDeserializer<ServiceNameEnum> {
    public ServiceNameEnumDeserializer() {
      super(ServiceNameEnumDeserializer.class);
    }

    @Override
    public ServiceNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ServiceNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets serviceName
   */
 @JsonDeserialize(using = ServiceNameEnumDeserializer.class)
  public enum ServiceNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LANGUAGEUNDERSTANDING("LanguageUnderstanding"),
    CONTENTMANAGEMENT("ContentManagement"),
    PEOPLEPERMISSIONS("PeoplePermissions"),
    PRESENCE("Presence"),
    ARCHITECT("Architect"),
    CONTACTCENTER("ContactCenter"),
    QUALITY("Quality"),
    SPEECHANDTEXTANALYTICS("SpeechAndTextAnalytics"),
    PREDICTIVEENGAGEMENT("PredictiveEngagement"),
    KNOWLEDGE("Knowledge"),
    COACHING("Coaching"),
    LEARNING("Learning"),
    GAMIFICATION("Gamification"),
    EMPLOYEEENGAGEMENT("EmployeeEngagement"),
    WORKFORCEMANAGEMENT("WorkforceManagement"),
    TRIGGERS("Triggers"),
    PROCESSAUTOMATION("ProcessAutomation"),
    RESPONSEMANAGEMENT("ResponseManagement"),
    GROUPS("Groups"),
    TELEPHONY("Telephony"),
    OUTBOUND("Outbound"),
    ROUTING("Routing"),
    INTEGRATIONS("Integrations"),
    WEBHOOKS("Webhooks"),
    ANALYTICSREPORTING("AnalyticsReporting"),
    LIMITS("Limits"),
    EMPLOYEEPERFORMANCE("EmployeePerformance"),
    DATATABLES("Datatables"),
    MESSAGING("Messaging"),
    WEBDEPLOYMENTS("WebDeployments"),
    SUPPORTABILITY("Supportability"),
    CALLBACK("Callback"),
    DIRECTORY("Directory"),
    EXTERNALCONTACTS("ExternalContacts"),
    TASKMANAGEMENT("TaskManagement"),
    SCIM("SCIM"),
    NUMBERPURCHASING("NumberPurchasing"),
    MARKETPLACE("Marketplace"),
    LOGCAPTURE("LogCapture"),
    GDPR("GDPR"),
    DSAR("DSAR"),
    EXTERNALCONTACTSEXPORT("ExternalContactsExport"),
    AGENTCONFIG("AgentConfig"),
    EMAILS("Emails"),
    SCRIPTER("Scripter"),
    BILLING("Billing"),
    JOURNEYANALYTICS("JourneyAnalytics"),
    NERSERVICE("NerService"),
    ONBOARDING("Onboarding"),
    SOCIALLISTENING("SocialListening"),
    BUSINESSRULES("BusinessRules"),
    SOCIALESCALATIONRULES("SocialEscalationRules"),
    ALERTING("Alerting");

    private String value;

    ServiceNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ServiceNameEnum fromString(String key) {
      if (key == null) return null;

      for (ServiceNameEnum value : ServiceNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ServiceNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ServiceNameEnum serviceName = null;
  private String level = null;
  private Date eventTime = null;
  private AuditTopicMessageInfo message = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets action
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VIEW("View"),
    CREATE("Create"),
    UPDATE("Update"),
    DELETE("Delete"),
    MOVE("Move"),
    COPY("Copy"),
    DOWNLOAD("Download"),
    SHAREADD("ShareAdd"),
    SHAREREMOVE("ShareRemove"),
    FAX("Fax"),
    CONVERT("Convert"),
    RECEIVE("Receive"),
    VERSIONCREATE("VersionCreate"),
    TAGADD("TagAdd"),
    TAGREMOVE("TagRemove"),
    TAGUPDATE("TagUpdate"),
    ADD("Add"),
    REMOVE("Remove"),
    MEMBERADD("MemberAdd"),
    MEMBERUPDATE("MemberUpdate"),
    MEMBERREMOVE("MemberRemove"),
    AUTHENTICATE("Authenticate"),
    AUTHENTICATIONFAILED("AuthenticationFailed"),
    SINGLELOGOUT("SingleLogout"),
    SINGLELOGOUTFAILED("SingleLogoutFailed"),
    AUTHORIZE("Authorize"),
    DEAUTHORIZE("Deauthorize"),
    AUTHORIZATIONCHANGED("AuthorizationChanged"),
    CHANGEPASSWORD("ChangePassword"),
    REVOKE("Revoke"),
    CHECKIN("Checkin"),
    CHECKOUT("Checkout"),
    DEACTIVATE("Deactivate"),
    DEBUG("Debug"),
    PUBLISH("Publish"),
    REVERT("Revert"),
    SAVE("Save"),
    TRANSCODE("Transcode"),
    UPLOAD("Upload"),
    WRAPUPCODEADD("WrapupCodeAdd"),
    WRAPUPCODEREMOVE("WrapupCodeRemove"),
    READ("Read"),
    EXECUTE("Execute"),
    ABANDON("Abandon"),
    ARCHIVE("Archive"),
    EXPORT("Export"),
    RESTOREREQUEST("RestoreRequest"),
    RESTORECOMPLETE("RestoreComplete"),
    UPDATERETENTION("UpdateRetention"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    ROTATE("Rotate"),
    DELETEALL("DeleteAll"),
    REASSIGN("Reassign"),
    UNARCHIVE("Unarchive"),
    ACTIVATE("Activate"),
    ASSIGN("Assign"),
    UNASSIGN("Unassign"),
    RESET("Reset"),
    RESCHEDULE("Reschedule"),
    COMPLETE("Complete"),
    CANCEL("Cancel"),
    UNPUBLISH("Unpublish"),
    PURGE("Purge"),
    PROCESSED("Processed"),
    ENABLE("Enable"),
    DISABLE("Disable"),
    RECYCLE("Recycle"),
    APPEND("Append"),
    CONTACTSUPDATED("ContactsUpdated"),
    CONTACTSDELETED("ContactsDeleted"),
    RESTORE("Restore"),
    BLOCK("Block"),
    UNBLOCK("Unblock"),
    OPEN("Open"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented"),
    WRITE("Write"),
    REPLACE("Replace"),
    UPDATEINSERVICE("UpdateInService"),
    UPDATEOUTOFSERVICE("UpdateOutOfService"),
    CYCLE("Cycle"),
    SCALE("Scale"),
    ASGINSERVICE("AsgInservice"),
    AWSOUTOFSERVICE("AwsOutofservice"),
    ASGTERMINATE("AsgTerminate"),
    DETACH("Detach"),
    TERMINATE("Terminate"),
    BLOCKUPGRADE("BlockUpgrade"),
    UNBLOCKUPGRADE("UnblockUpgrade"),
    ASGSWAPINSTANCETYPE("AsgSwapInstanceType"),
    RECREATEASG("RecreateAsg"),
    DELETEUNCONFIGUREDEDGE("DeleteUnconfiguredEdge"),
    GETASGLIST("GetAsgList"),
    GETASG("GetAsg"),
    UPGRADEORGANIZATIONSITE("UpgradeOrganizationSite"),
    UPDATEAWSCONFIG("UpdateAwsConfig"),
    GETAWSCONFIG("GetAwsConfig"),
    DELETEGHOSTEDGERECORD("DeleteGhostEdgeRecord"),
    UPGRADECLEANUP("UpgradeCleanup"),
    IPALLOWLISTCLEAR("IpAllowlistClear"),
    ADDPAIRINGROLE("AddPairingRole"),
    VERIFY("Verify"),
    RESTOREDELETED("RestoreDeleted"),
    RESTOREALL("RestoreAll"),
    APPROVE("Approve"),
    REJECT("Reject"),
    REVERSE("Reverse"),
    SEND("Send"),
    HARDDELETE("HardDelete"),
    SOFTDELETE("SoftDelete"),
    SUBMIT("Submit"),
    ENABLECAPTURE("EnableCapture"),
    DOWNLOADCAPTURE("DownloadCapture"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed"),
    INITIATE("Initiate"),
    REVERSEMANUALLY("ReverseManually"),
    CALCULATE("Calculate"),
    PROVISIONED("Provisioned"),
    UPDATEABORTED("UpdateAborted");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;

  private static class EntityTypeEnumDeserializer extends StdDeserializer<EntityTypeEnum> {
    public EntityTypeEnumDeserializer() {
      super(EntityTypeEnumDeserializer.class);
    }

    @Override
    public EntityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets entityType
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FEEDBACK("Feedback"),
    DOCUMENT("Document"),
    WORKSPACE("Workspace"),
    TAG("Tag"),
    USERSAMLAUTHENTICATION("UserSamlAuthentication"),
    ACCESSTOKEN("AccessToken"),
    OAUTHCLIENTAUTHORIZATION("OAuthClientAuthorization"),
    AUTHORGANIZATION("AuthOrganization"),
    OAUTHCLIENT("OAuthClient"),
    AUTHUSER("AuthUser"),
    ORGANIZATIONAUTHORIZATIONTRUST("OrganizationAuthorizationTrust"),
    ORGANIZATIONAUTHORIZATIONUSERTRUST("OrganizationAuthorizationUserTrust"),
    ROLE("Role"),
    ROLESETTINGS("RoleSettings"),
    POLICY("Policy"),
    VOICEMAILUSERPOLICY("VoicemailUserPolicy"),
    USERPRESENCE("UserPresence"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    FLOW("Flow"),
    PROMPT("Prompt"),
    PROMPTRESOURCE("PromptResource"),
    FLOWOUTCOME("FlowOutcome"),
    FLOWMILESTONE("FlowMilestone"),
    GRAMMAR("Grammar"),
    GRAMMARLANGUAGE("GrammarLanguage"),
    AGENTROUTINGINFO("AgentRoutingInfo"),
    QUEUE("Queue"),
    WRAPUPCODE("WrapupCode"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    CONVERSATIONATTRIBUTES("ConversationAttributes"),
    ROUTINGUTILIZATIONTAG("RoutingUtilizationTag"),
    EVALUATION("Evaluation"),
    CALIBRATION("Calibration"),
    SURVEY("Survey"),
    EVALUATIONFORM("EvaluationForm"),
    SURVEYFORM("SurveyForm"),
    RECORDING("Recording"),
    SCREENRECORDING("ScreenRecording"),
    BULKACTIONS("BulkActions"),
    ORPHANEDRECORDING("OrphanedRecording"),
    RECORDINGANNOTATION("RecordingAnnotation"),
    RECORDINGSETTINGS("RecordingSettings"),
    RECORDINGKEY("RecordingKey"),
    RECORDINGKEYCONFIG("RecordingKeyConfig"),
    TOPIC("Topic"),
    PROGRAM("Program"),
    CATEGORY("Category"),
    SENTIMENTFEEDBACK("SentimentFeedback"),
    DICTIONARYFEEDBACK("DictionaryFeedback"),
    INTERACTIONREPROCESSINGJOB("InteractionReprocessingJob"),
    SEGMENT("Segment"),
    OUTCOME("Outcome"),
    ACTIONMAP("ActionMap"),
    ACTIONTEMPLATE("ActionTemplate"),
    CLICKSTREAMSETTINGS("ClickstreamSettings"),
    EVENTTYPE("EventType"),
    SESSIONTYPE("SessionType"),
    KNOWLEDGEBASE("KnowledgeBase"),
    KNOWLEDGECATEGORY("KnowledgeCategory"),
    KNOWLEDGECONTEXT("KnowledgeContext"),
    KNOWLEDGECONTEXTVALUE("KnowledgeContextValue"),
    KNOWLEDGEDOCUMENT("KnowledgeDocument"),
    KNOWLEDGEDOCUMENTVARIATION("KnowledgeDocumentVariation"),
    KNOWLEDGELABEL("KnowledgeLabel"),
    KNOWLEDGETRAINING("KnowledgeTraining"),
    KNOWLEDGESEARCHFEEDBACK("KnowledgeSearchFeedback"),
    TRANSCRIPTIONSETTINGS("TranscriptionSettings"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings"),
    APPOINTMENT("Appointment"),
    ANNOTATION("Annotation"),
    ORGANIZATION("Organization"),
    MODULE("Module"),
    RULE("Rule"),
    ASSIGNMENT("Assignment"),
    CONTEST("Contest"),
    RECOGNITION("Recognition"),
    ACTIVITYCODE("ActivityCode"),
    ACTIVITYPLAN("ActivityPlan"),
    ACTIVITYPLANOCCURRENCE("ActivityPlanOccurrence"),
    ADHERENCEEXPLANATION("AdherenceExplanation"),
    ALTERNATIVESHIFT("AlternativeShift"),
    BUSINESSUNIT("BusinessUnit"),
    FORECAST("Forecast"),
    MANAGEMENTUNIT("ManagementUnit"),
    PLANNINGGROUP("PlanningGroup"),
    SCHEDULE("Schedule"),
    SERVICEGOALTEMPLATE("ServiceGoalTemplate"),
    SHIFTTRADE("ShiftTrade"),
    TIMEOFFLIMIT("TimeOffLimit"),
    TIMEOFFPLAN("TimeOffPlan"),
    TIMEOFFREQUEST("TimeOffRequest"),
    WORKPLAN("WorkPlan"),
    WORKPLANBID("WorkPlanBid"),
    WORKPLANBIDGROUP("WorkPlanBidGroup"),
    WORKPLANROTATION("WorkPlanRotation"),
    HISTORICALDATA("HistoricalData"),
    STAFFINGGROUP("StaffingGroup"),
    CAPACITYPLAN("CapacityPlan"),
    TRIGGER("Trigger"),
    RESPONSE("Response"),
    RESPONSELIBRARY("ResponseLibrary"),
    RESPONSEASSET("ResponseAsset"),
    SKILLGROUP("SkillGroup"),
    DIRECTORYGROUP("DirectoryGroup"),
    TEAM("Team"),
    SKILLGROUPDEFINITION("SkillGroupDefinition"),
    EDGE("Edge"),
    EDGEGROUP("EdgeGroup"),
    VOICEMAILPOLICY("VoicemailPolicy"),
    ROUTINGTRANSCRIPTIONSETTINGS("RoutingTranscriptionSettings"),
    TRUNK("Trunk"),
    TRUNKBASE("TrunkBase"),
    SCHEDULEGROUP("ScheduleGroup"),
    EMERGENCYGROUP("EmergencyGroup"),
    IVR("IVR"),
    ALERTABLEPRESENCESOVERRIDES("AlertablePresencesOverrides"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    PHONE("Phone"),
    PHONEBASE("PhoneBase"),
    LINE("Line"),
    LINEBASE("LineBase"),
    OUTBOUNDROUTE("OutboundRoute"),
    NUMBERPLAN("NumberPlan"),
    SITE("Site"),
    ATTEMPTLIMITS("AttemptLimits"),
    CALLABLETIMESET("CallableTimeSet"),
    CAMPAIGN("Campaign"),
    CAMPAIGNRULE("CampaignRule"),
    CAMPAIGNSCHEDULE("CampaignSchedule"),
    SEQUENCE("Sequence"),
    SEQUENCESCHEDULE("SequenceSchedule"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    CONTACTLISTTEMPLATE("ContactListTemplate"),
    DIGITALRULESET("DigitalRuleSet"),
    DNCLIST("DNCList"),
    FILESPECIFICATIONTEMPLATE("FileSpecificationTemplate"),
    IMPORTTEMPLATE("ImportTemplate"),
    ORGANIZATIONSETTINGS("OrganizationSettings"),
    CALLANALYSISRESPONSESET("CallAnalysisResponseSet"),
    RULESET("RuleSet"),
    WRAPUPCODEMAPPING("WrapUpCodeMapping"),
    MESSAGINGCAMPAIGN("MessagingCampaign"),
    MESSAGINGCAMPAIGNSCHEDULE("MessagingCampaignSchedule"),
    EMAILCAMPAIGNSCHEDULE("EmailCampaignSchedule"),
    WHATSAPPCAMPAIGNSCHEDULE("WhatsAppCampaignSchedule"),
    PREDICTOR("Predictor"),
    KPISPECIFICATION("KpiSpecification"),
    METRIC("Metric"),
    STATUS("Status"),
    PROFILE("Profile"),
    PROFILEMEMBERS("ProfileMembers"),
    ACTION("Action"),
    ACTIONDRAFT("ActionDraft"),
    INTEGRATION("Integration"),
    WEBHOOK("Webhook"),
    DASHBOARDSETTINGS("DashboardSettings"),
    INSIGHTSETTINGS("InsightSettings"),
    ANALYTICSREPORTINGSETTINGS("AnalyticsReportingSettings"),
    CUSTOMCALCULATIONS("CustomCalculations"),
    SCHEDULEDEXPORTS("ScheduledExports"),
    EXPORTS("Exports"),
    EXPORTPDFTEMPLATES("ExportPdfTemplates"),
    CHANGEREQUEST("ChangeRequest"),
    MIGRATION("Migration"),
    EXTERNALMETRICSDEFINITION("ExternalMetricsDefinition"),
    EXTERNALMETRICSDATA("ExternalMetricsData"),
    SCHEMA("Schema"),
    ROW("Row"),
    BULK("Bulk"),
    SUPPORTEDCONTENT("SupportedContent"),
    CONVERSATIONPHONENUMBER("ConversationPhoneNumber"),
    CONVERSATIONRECIPIENT("ConversationRecipient"),
    CONVERSATIONACCOUNT("ConversationAccount"),
    CONVERSATIONDEFAULTSUPPORTEDCONTENT("ConversationDefaultSupportedContent"),
    CONVERSATIONTHREADINGWINDOW("ConversationThreadingWindow"),
    DEPLOYMENT("Deployment"),
    CONFIGURATION("Configuration"),
    CONFIGURATIONVERSION("ConfigurationVersion"),
    EDGEPREFERENCES("EdgePreferences"),
    EDGETRACELEVEL("EdgeTraceLevel"),
    ORGANIZATIONINTEGRATIONSACCESS("OrganizationIntegrationsAccess"),
    SUPPORTFILE("SupportFile"),
    EDGELOGZIP("EdgeLogZip"),
    PCAPS("Pcaps"),
    MEDIADIAGNOSTICSTRACEFILE("MediaDiagnosticsTraceFile"),
    EDGEPCAPS("EdgePcaps"),
    EDGELOG("EdgeLog"),
    ORGANIZATIONFEATURE("OrganizationFeature"),
    PRODUCT("Product"),
    USER("User"),
    LOCATION("Location"),
    CONVERSATION("Conversation"),
    ORGANIZATIONSUSPENSION("OrganizationSuspension"),
    OPERATIONALEVENT("OperationalEvent"),
    PARTICIPANT("Participant"),
    CONTACTSCHEMA("ContactSchema"),
    EXTERNALORGANIZATIONSCHEMA("ExternalOrganizationSchema"),
    WORKBIN("Workbin"),
    WORKTYPE("Worktype"),
    BULKJOB("BulkJob"),
    CREDENTIAL("Credential"),
    NUMBERORDER("NumberOrder"),
    ENTERPRISEAGREEMENT("EnterpriseAgreement"),
    VENDORLISTING("VendorListing"),
    GDPRREQUEST("GdprRequest"),
    DSARREQUEST("DsarRequest"),
    EXPORTREQUEST("ExportRequest"),
    DEFAULTPANELSETTINGS("DefaultPanelSettings"),
    INBOUNDDOMAIN("InboundDomain"),
    OUTBOUNDDOMAIN("OutboundDomain"),
    INBOUNDROUTE("InboundRoute"),
    ORGANIZATIONLIMITS("OrganizationLimits"),
    COMPOSERPAGE("ComposerPage"),
    COMPOSERPUBLISHEDSCRIPT("ComposerPublishedScript"),
    COMPOSERSCRIPT("ComposerScript"),
    COMPOSERTEMPLATE("ComposerTemplate"),
    INTENTMINER("IntentMiner"),
    TOPICMINER("TopicMiner"),
    SOFTSUSPENSION("SoftSuspension"),
    JOURNEYVIEW("JourneyView"),
    CUSTOMENTITY("CustomEntity"),
    DIRECTORYFEATURE("DirectoryFeature"),
    RULECATEGORY("RuleCategory"),
    DECISIONTABLE("DecisionTable"),
    DECISIONTABLEVERSION("DecisionTableVersion"),
    DECISIONTABLEROW("DecisionTableRow"),
    ESCALATIONRULE("EscalationRule"),
    RULES("Rules"),
    CONTACT("Contact"),
    NOTE("Note"),
    RELATIONSHIP("Relationship"),
    EXTERNALORG("ExternalOrg");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntityTypeEnum value : EntityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntityTypeEnum entityType = null;
  private AuditTopicDomainEntityRef entity = null;
  private List<AuditTopicPropertyChange> propertyChanges = null;
  private Map<String, String> context = null;

  public AuditTopicAuditLogMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      remoteIp = new ArrayList<String>();
      propertyChanges = new ArrayList<AuditTopicPropertyChange>();
    }
  }

  
  /**
   **/
  public AuditTopicAuditLogMessage id(String id) {
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
  public AuditTopicAuditLogMessage userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public AuditTopicAuditLogMessage userHomeOrgId(String userHomeOrgId) {
    this.userHomeOrgId = userHomeOrgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userHomeOrgId")
  public String getUserHomeOrgId() {
    return userHomeOrgId;
  }
  public void setUserHomeOrgId(String userHomeOrgId) {
    this.userHomeOrgId = userHomeOrgId;
  }


  /**
   **/
  public AuditTopicAuditLogMessage username(AuditTopicDomainEntityRef username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("username")
  public AuditTopicDomainEntityRef getUsername() {
    return username;
  }
  public void setUsername(AuditTopicDomainEntityRef username) {
    this.username = username;
  }


  /**
   **/
  public AuditTopicAuditLogMessage userDisplay(String userDisplay) {
    this.userDisplay = userDisplay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userDisplay")
  public String getUserDisplay() {
    return userDisplay;
  }
  public void setUserDisplay(String userDisplay) {
    this.userDisplay = userDisplay;
  }


  /**
   **/
  public AuditTopicAuditLogMessage clientId(AuditTopicAddressableEntityRef clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientId")
  public AuditTopicAddressableEntityRef getClientId() {
    return clientId;
  }
  public void setClientId(AuditTopicAddressableEntityRef clientId) {
    this.clientId = clientId;
  }


  /**
   **/
  public AuditTopicAuditLogMessage remoteIp(List<String> remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remoteIp")
  public List<String> getRemoteIp() {
    return remoteIp;
  }
  public void setRemoteIp(List<String> remoteIp) {
    this.remoteIp = remoteIp;
  }


  /**
   **/
  public AuditTopicAuditLogMessage serviceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceName")
  public ServiceNameEnum getServiceName() {
    return serviceName;
  }
  public void setServiceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
  }


  /**
   **/
  public AuditTopicAuditLogMessage level(String level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }


  /**
   **/
  public AuditTopicAuditLogMessage eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public AuditTopicAuditLogMessage message(AuditTopicMessageInfo message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public AuditTopicMessageInfo getMessage() {
    return message;
  }
  public void setMessage(AuditTopicMessageInfo message) {
    this.message = message;
  }


  /**
   **/
  public AuditTopicAuditLogMessage action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   **/
  public AuditTopicAuditLogMessage entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  /**
   **/
  public AuditTopicAuditLogMessage entity(AuditTopicDomainEntityRef entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public AuditTopicDomainEntityRef getEntity() {
    return entity;
  }
  public void setEntity(AuditTopicDomainEntityRef entity) {
    this.entity = entity;
  }


  /**
   **/
  public AuditTopicAuditLogMessage propertyChanges(List<AuditTopicPropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("propertyChanges")
  public List<AuditTopicPropertyChange> getPropertyChanges() {
    return propertyChanges;
  }
  public void setPropertyChanges(List<AuditTopicPropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
  }


  /**
   **/
  public AuditTopicAuditLogMessage context(Map<String, String> context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public Map<String, String> getContext() {
    return context;
  }
  public void setContext(Map<String, String> context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTopicAuditLogMessage auditTopicAuditLogMessage = (AuditTopicAuditLogMessage) o;

    return Objects.equals(this.id, auditTopicAuditLogMessage.id) &&
            Objects.equals(this.userId, auditTopicAuditLogMessage.userId) &&
            Objects.equals(this.userHomeOrgId, auditTopicAuditLogMessage.userHomeOrgId) &&
            Objects.equals(this.username, auditTopicAuditLogMessage.username) &&
            Objects.equals(this.userDisplay, auditTopicAuditLogMessage.userDisplay) &&
            Objects.equals(this.clientId, auditTopicAuditLogMessage.clientId) &&
            Objects.equals(this.remoteIp, auditTopicAuditLogMessage.remoteIp) &&
            Objects.equals(this.serviceName, auditTopicAuditLogMessage.serviceName) &&
            Objects.equals(this.level, auditTopicAuditLogMessage.level) &&
            Objects.equals(this.eventTime, auditTopicAuditLogMessage.eventTime) &&
            Objects.equals(this.message, auditTopicAuditLogMessage.message) &&
            Objects.equals(this.action, auditTopicAuditLogMessage.action) &&
            Objects.equals(this.entityType, auditTopicAuditLogMessage.entityType) &&
            Objects.equals(this.entity, auditTopicAuditLogMessage.entity) &&
            Objects.equals(this.propertyChanges, auditTopicAuditLogMessage.propertyChanges) &&
            Objects.equals(this.context, auditTopicAuditLogMessage.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, userHomeOrgId, username, userDisplay, clientId, remoteIp, serviceName, level, eventTime, message, action, entityType, entity, propertyChanges, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTopicAuditLogMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userHomeOrgId: ").append(toIndentedString(userHomeOrgId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userDisplay: ").append(toIndentedString(userDisplay)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    propertyChanges: ").append(toIndentedString(propertyChanges)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

