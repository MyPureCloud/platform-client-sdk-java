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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EntityChange
 */

public class EntityChange  implements Serializable {
  
  private String entityId = null;
  private String entityName = null;

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
   * Type of the entity that was changed
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCESSTOKEN("AccessToken"),
    ACTION("Action"),
    ACTIONDRAFT("ActionDraft"),
    ACTIONMAP("ActionMap"),
    ACTIONTEMPLATE("ActionTemplate"),
    ACTIVITYCODE("ActivityCode"),
    ADHERENCEEXPLANATION("AdherenceExplanation"),
    AGENTROUTINGINFO("AgentRoutingInfo"),
    ANALYTICSREPORTINGSETTINGS("AnalyticsReportingSettings"),
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
    COMPOSERPAGE("ComposerPage"),
    COMPOSERSCRIPT("ComposerScript"),
    COMPOSERPUBLISHEDSCRIPT("ComposerPublishedScript"),
    COMPOSERTEMPLATE("ComposerTemplate"),
    CONFIGURATION("Configuration"),
    CONFIGURATIONVERSION("ConfigurationVersion"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    CONTACTSCHEMA("ContactSchema"),
    CONVERSATIONATTRIBUTES("ConversationAttributes"),
    CONVERSATIONACCOUNT("ConversationAccount"),
    CONVERSATIONDEFAULTSUPPORTEDCONTENT("ConversationDefaultSupportedContent"),
    CONVERSATIONPHONENUMBER("ConversationPhoneNumber"),
    CONVERSATIONRECIPIENT("ConversationRecipient"),
    CONVERSATIONTHREADINGWINDOW("ConversationThreadingWindow"),
    CREDENTIAL("Credential"),
    DASHBOARDSETTINGS("DashboardSettings"),
    DEFAULTPANELSETTINGS("DefaultPanelSettings"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    DEPLOYMENT("Deployment"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    DIGITALRULESET("DigitalRuleSet"),
    DIRECTORYGROUP("DirectoryGroup"),
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
    EMAILCAMPAIGNSCHEDULE("EmailCampaignSchedule"),
    EMERGENCYGROUP("EmergencyGroup"),
    ENTERPRISEAGREEMENT("EnterpriseAgreement"),
    EVALUATION("Evaluation"),
    EVALUATIONFORM("EvaluationForm"),
    EVENTTYPE("EventType"),
    EXPORTS("Exports"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    EXTERNALMETRICSDATA("ExternalMetricsData"),
    EXTERNALMETRICSDEFINITION("ExternalMetricsDefinition"),
    EXTERNALORGANIZATIONSCHEMA("ExternalOrganizationSchema"),
    FEEDBACK("Feedback"),
    FLOW("Flow"),
    FLOWMILESTONE("FlowMilestone"),
    FLOWOUTCOME("FlowOutcome"),
    FORECAST("Forecast"),
    GDPRREQUEST("GdprRequest"),
    GRAMMAR("Grammar"),
    GRAMMARLANGUAGE("GrammarLanguage"),
    GROUP("Group"),
    HISTORICALDATA("HistoricalData"),
    INBOUNDDOMAIN("InboundDomain"),
    INBOUNDROUTE("InboundRoute"),
    INSIGHTSETTINGS("InsightSettings"),
    INTEGRATION("Integration"),
    INTENTMINER("IntentMiner"),
    IVR("IVR"),
    KNOWLEDGEBASE("KnowledgeBase"),
    KNOWLEDGECATEGORY("KnowledgeCategory"),
    KNOWLEDGEDOCUMENT("KnowledgeDocument"),
    KNOWLEDGEDOCUMENTVARIATION("KnowledgeDocumentVariation"),
    KNOWLEDGELABEL("KnowledgeLabel"),
    KNOWLEDGESEARCHFEEDBACK("KnowledgeSearchFeedback"),
    KNOWLEDGETRAINING("KnowledgeTraining"),
    LINE("Line"),
    LINEBASE("LineBase"),
    LOCATION("Location"),
    MANAGEMENTUNIT("ManagementUnit"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    MEDIADIAGNOSTICSTRACEFILE("MediaDiagnosticsTraceFile"),
    MESSAGINGCAMPAIGN("MessagingCampaign"),
    MESSAGINGCAMPAIGNSCHEDULE("MessagingCampaignSchedule"),
    METRIC("Metric"),
    MODULE("Module"),
    NUMBERORDER("NumberOrder"),
    NUMBERPLAN("NumberPlan"),
    OAUTHCLIENT("OAuthClient"),
    OAUTHCLIENTAUTHORIZATION("OAuthClientAuthorization"),
    ORGANIZATION("Organization"),
    ORGANIZATIONAUTHORIZATIONTRUST("OrganizationAuthorizationTrust"),
    ORGANIZATIONAUTHORIZATIONUSERTRUST("OrganizationAuthorizationUserTrust"),
    ORGANIZATIONFEATURE("OrganizationFeature"),
    ORGANIZATIONINTEGRATIONSACCESS("OrganizationIntegrationsAccess"),
    ORGANIZATIONLIMITS("OrganizationLimits"),
    ORGANIZATIONSETTINGS("OrganizationSettings"),
    ORPHANEDRECORDING("OrphanedRecording"),
    OUTBOUNDDOMAIN("OutboundDomain"),
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
    PUBLIC("Public"),
    QUEUE("Queue"),
    RECORDING("Recording"),
    RECORDINGANNOTATION("RecordingAnnotation"),
    RECORDINGKEY("RecordingKey"),
    RECORDINGKEYCONFIG("RecordingKeyConfig"),
    RECORDINGSETTINGS("RecordingSettings"),
    RESPONSE("Response"),
    RESPONSEASSET("ResponseAsset"),
    ROLE("Role"),
    ROLESETTINGS("RoleSettings"),
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
    SKILLSGROUP("SkillsGroup"),
    SKILLGROUPDEFINITION("SkillGroupDefinition"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings"),
    STAFFINGGROUP("StaffingGroup"),
    STATUS("Status"),
    SUPPORTEDCONTENT("SupportedContent"),
    SUPPORTFILE("SupportFile"),
    SURVEY("Survey"),
    SURVEYFORM("SurveyForm"),
    TAG("Tag"),
    TEAM("Team"),
    TIMEOFFLIMIT("TimeOffLimit"),
    TIMEOFFPLAN("TimeOffPlan"),
    TIMEOFFREQUEST("TimeOffRequest"),
    TOPIC("Topic"),
    TOPICMINER("TopicMiner"),
    TRANSCRIPTIONSETTINGS("TranscriptionSettings"),
    TRIGGER("Trigger"),
    TRUNK("Trunk"),
    TRUNKBASE("TrunkBase"),
    USER("User"),
    USERLANGUAGE("UserLanguage"),
    USERPRESENCE("UserPresence"),
    USERSKILL("UserSkill"),
    VOICEMAILPOLICY("VoicemailPolicy"),
    VOICEMAILUSERPOLICY("VoicemailUserPolicy"),
    WEBHOOK("Webhook"),
    WORKBIN("Workbin"),
    WORKITEM("Workitem"),
    WORKPLAN("WorkPlan"),
    WORKPLANROTATION("WorkPlanRotation"),
    WORKSPACE("Workspace"),
    WORKTYPE("Worktype"),
    WRAPUPCODE("WrapupCode"),
    WRAPUPCODEMAPPING("WrapUpCodeMapping"),
    PARTICIPANT("Participant");

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
  private List<String> oldValues = new ArrayList<String>();
  private List<String> newValues = new ArrayList<String>();

  
  /**
   * Id of the entity that was changed
   **/
  public EntityChange entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the entity that was changed")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   * Name of the entity that was changed
   **/
  public EntityChange entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the entity that was changed")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   * Type of the entity that was changed
   **/
  public EntityChange entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the entity that was changed")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  /**
   * Previous values for the entity.
   **/
  public EntityChange oldValues(List<String> oldValues) {
    this.oldValues = oldValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Previous values for the entity.")
  @JsonProperty("oldValues")
  public List<String> getOldValues() {
    return oldValues;
  }
  public void setOldValues(List<String> oldValues) {
    this.oldValues = oldValues;
  }


  /**
   * New values for the entity.
   **/
  public EntityChange newValues(List<String> newValues) {
    this.newValues = newValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New values for the entity.")
  @JsonProperty("newValues")
  public List<String> getNewValues() {
    return newValues;
  }
  public void setNewValues(List<String> newValues) {
    this.newValues = newValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityChange entityChange = (EntityChange) o;

    return Objects.equals(this.entityId, entityChange.entityId) &&
            Objects.equals(this.entityName, entityChange.entityName) &&
            Objects.equals(this.entityType, entityChange.entityType) &&
            Objects.equals(this.oldValues, entityChange.oldValues) &&
            Objects.equals(this.newValues, entityChange.newValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityName, entityType, oldValues, newValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityChange {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    oldValues: ").append(toIndentedString(oldValues)).append("\n");
    sb.append("    newValues: ").append(toIndentedString(newValues)).append("\n");
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

