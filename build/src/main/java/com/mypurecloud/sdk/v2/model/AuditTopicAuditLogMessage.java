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
  private List<String> remoteIp = new ArrayList<String>();

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
    ARCHITECT("Architect"),
    ANALYTICSREPORTING("AnalyticsReporting"),
    CONTACTCENTER("ContactCenter"),
    CONTENTMANAGEMENT("ContentManagement"),
    EMPLOYEEPERFORMANCE("EmployeePerformance"),
    GAMIFICATION("Gamification"),
    GROUPS("Groups"),
    LANGUAGEUNDERSTANDING("LanguageUnderstanding"),
    LEARNING("Learning"),
    OUTBOUND("Outbound"),
    PEOPLEPERMISSIONS("PeoplePermissions"),
    PREDICTIVEENGAGEMENT("PredictiveEngagement"),
    PRESENCE("Presence"),
    QUALITY("Quality"),
    RESPONSEMANAGEMENT("ResponseManagement"),
    ROUTING("Routing"),
    SPEECHANDTEXTANALYTICS("SpeechAndTextAnalytics"),
    TELEPHONY("Telephony"),
    TOPICSDEFINITIONS("TopicsDefinitions"),
    TRIGGERS("Triggers"),
    WEBDEPLOYMENTS("WebDeployments"),
    WORKFORCEMANAGEMENT("WorkforceManagement");

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
    CREATE("Create"),
    VIEW("View"),
    UPDATE("Update"),
    MOVE("Move"),
    DELETE("Delete"),
    DOWNLOAD("Download"),
    UPLOAD("Upload"),
    MEMBERADD("MemberAdd"),
    MEMBERUPDATE("MemberUpdate"),
    MEMBERREMOVE("MemberRemove"),
    READ("Read"),
    WRITE("Write"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    UPDATERETENTION("UpdateRetention"),
    READALL("ReadAll"),
    EXECUTE("Execute"),
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
    PURGE("Purge"),
    PROCESSED("Processed"),
    ASSIGN("Assign"),
    UNASSIGN("Unassign");

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
    ACCESSTOKEN("AccessToken"),
    ACTIONMAP("ActionMap"),
    ACTIONTEMPLATE("ActionTemplate"),
    AGENTROUTINGINFO("AgentRoutingInfo"),
    ASSIGNMENT("Assignment"),
    ATTEMPTLIMITS("AttemptLimits"),
    AUTHORGANIZATION("AuthOrganization"),
    AUTHUSER("AuthUser"),
    BULKACTIONS("BulkActions"),
    CALLANALYSISRESPONSESET("CallAnalysisResponseSet"),
    CALLABLETIMESET("CallableTimeSet"),
    CAMPAIGN("Campaign"),
    CAMPAIGNRULE("CampaignRule"),
    CAMPAIGNSCHEDULE("CampaignSchedule"),
    CLICKSTREAMSETTINGS("ClickstreamSettings"),
    CONFIGURATION("Configuration"),
    CONFIGURATIONVERSION("ConfigurationVersion"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    DASHBOARDSETTINGS("DashboardSettings"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    DNCLIST("DNCList"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    DEPLOYMENT("Deployment"),
    DOCUMENT("Document"),
    DYNAMICGROUP("DynamicGroup"),
    EDGE("Edge"),
    EDGEGROUP("EdgeGroup"),
    EMERGENCYGROUP("EmergencyGroup"),
    EVENTTYPE("EventType"),
    EXPORTS("Exports"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    EXTERNALMETRICSDEFINITION("ExternalMetricsDefinition"),
    EXTERNALMETRICSDATA("ExternalMetricsData"),
    FEEDBACK("Feedback"),
    FLOW("Flow"),
    FLOWMILESTONE("FlowMilestone"),
    FLOWOUTCOME("FlowOutcome"),
    FORECAST("Forecast"),
    HISTORICALDATA("HistoricalData"),
    INSIGHTSETTINGS("InsightSettings"),
    IVR("IVR"),
    LINE("Line"),
    LINEBASE("LineBase"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    MESSAGINGCAMPAIGN("MessagingCampaign"),
    METRIC("Metric"),
    MODULE("Module"),
    NUMBERPLAN("NumberPlan"),
    OAUTHCLIENT("OAuthClient"),
    OAUTHCLIENTAUTHORIZATION("OAuthClientAuthorization"),
    ORGANIZATIONAUTHORIZATIONTRUST("OrganizationAuthorizationTrust"),
    ORGANIZATIONAUTHORIZATIONUSERTRUST("OrganizationAuthorizationUserTrust"),
    ORGANIZATIONSETTINGS("OrganizationSettings"),
    OUTBOUNDROUTE("OutboundRoute"),
    OUTCOME("Outcome"),
    PHONE("Phone"),
    PHONEBASE("PhoneBase"),
    PREDICTOR("Predictor"),
    PROFILE("Profile"),
    PROFILEMEMBERS("ProfileMembers"),
    PROGRAM("Program"),
    PROMPT("Prompt"),
    PROMPTRESOURCE("PromptResource"),
    QUEUE("Queue"),
    RECORDING("Recording"),
    RESPONSE("Response"),
    ROLE("Role"),
    ROUTINGTRANSCRIPTIONSETTINGS("RoutingTranscriptionSettings"),
    ROUTINGUTILIZATIONTAG("RoutingUtilizationTag"),
    RULE("Rule"),
    RULESET("RuleSet"),
    SCHEDULE("Schedule"),
    SCHEDULEDEXPORTS("ScheduledExports"),
    SCHEDULEGROUP("ScheduleGroup"),
    SEGMENT("Segment"),
    SEQUENCE("Sequence"),
    SEQUENCESCHEDULE("SequenceSchedule"),
    SESSIONTYPE("SessionType"),
    SHIFTTRADE("ShiftTrade"),
    SITE("Site"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings"),
    STATUS("Status"),
    TEAM("Team"),
    TIMEOFFREQUEST("TimeOffRequest"),
    TOPIC("Topic"),
    TRANSCRIPTIONSETTINGS("TranscriptionSettings"),
    TRIGGER("Trigger"),
    TRUNK("Trunk"),
    TRUNKBASE("TrunkBase"),
    USERPRESENCE("UserPresence"),
    VOICEMAILPOLICY("VoicemailPolicy"),
    VOICEMAILUSERPOLICY("VoicemailUserPolicy"),
    WORKPLAN("WorkPlan"),
    WORKSPACE("Workspace"),
    WRAPUPCODEMAPPING("WrapUpCodeMapping"),
    WRAPUPCODE("WrapupCode");

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
  private List<AuditTopicPropertyChange> propertyChanges = new ArrayList<AuditTopicPropertyChange>();
  private Map<String, String> context = null;

  
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
    return Objects.hash(id, userId, userHomeOrgId, username, userDisplay, clientId, remoteIp, serviceName, eventTime, message, action, entityType, entity, propertyChanges, context);
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

