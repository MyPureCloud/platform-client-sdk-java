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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.MessageInfo;
import com.mypurecloud.sdk.v2.model.PropertyChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AuditLogMessage
 */

public class AuditLogMessage  implements Serializable {
  
  private String id = null;
  private String userHomeOrgId = null;
  private DomainEntityRef user = null;
  private AddressableEntityRef client = null;
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
   * Name of the service that logged this audit message.
   */
 @JsonDeserialize(using = ServiceNameEnumDeserializer.class)
  public enum ServiceNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANALYTICSREPORTING("AnalyticsReporting"),
    ARCHITECT("Architect"),
    CONTACTCENTER("ContactCenter"),
    CONTENTMANAGEMENT("ContentManagement"),
    GROUPS("Groups"),
    INTEGRATIONS("Integrations"),
    LANGUAGEUNDERSTANDING("LanguageUnderstanding"),
    LIMITS("Limits"),
    OUTBOUND("Outbound"),
    PEOPLEPERMISSIONS("PeoplePermissions"),
    PERFORMANCE("Performance"),
    PREDICTIVEENGAGEMENT("PredictiveEngagement"),
    PRESENCE("Presence"),
    QUALITY("Quality"),
    RESPONSEMANAGEMENT("ResponseManagement"),
    ROUTING("Routing"),
    SPEECHANDTEXTANALYTICS("SpeechAndTextAnalytics"),
    TELEPHONY("Telephony"),
    TOPICSDEFINITIONS("TopicsDefinitions"),
    TRIGGERS("Triggers"),
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
  private Date eventDate = null;
  private MessageInfo message = null;

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
   * Action that took place.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
    OPEN("Open"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented");

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
  private DomainEntityRef entity = null;

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
   * Type of the entity that was impacted.
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCESSTOKEN("AccessToken"),
    ATTEMPTLIMITS("AttemptLimits"),
    AUTHORGANIZATION("AuthOrganization"),
    AUTHUSER("AuthUser"),
    BULKACTIONS("BulkActions"),
    CALLABLETIMESET("CallableTimeSet"),
    CALLANALYSISRESPONSESET("CallAnalysisResponseSet"),
    CAMPAIGN("Campaign"),
    CAMPAIGNRULE("CampaignRule"),
    CAMPAIGNSCHEDULE("CampaignSchedule"),
    CHANGEREQUEST("ChangeRequest"),
    CLICKSTREAMSETTINGS("ClickstreamSettings"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    DASHBOARDSETTINGS("DashboardSettings"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    DNCLIST("DNCList"),
    DOCUMENT("Document"),
    EDGE("Edge"),
    EDGEGROUP("EdgeGroup"),
    EMERGENCYGROUP("EmergencyGroup"),
    EVENTTYPE("EventType"),
    EXPORTS("Exports"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    EXTERNALMETRICDEFINITION("ExternalMetricDefinition"),
    FEEDBACK("Feedback"),
    FLOW("Flow"),
    FLOWMILESTONE("FlowMilestone"),
    FLOWOUTCOME("FlowOutcome"),
    FORECAST("Forecast"),
    INSIGHTSETTINGS("InsightSettings"),
    INTEGRATION("Integration"),
    IVR("IVR"),
    LINE("Line"),
    LINEBASE("LineBase"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    MESSAGINGCAMPAIGN("MessagingCampaign"),
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
    PROGRAM("Program"),
    PROMPT("Prompt"),
    PROMPTRESOURCE("PromptResource"),
    QUEUE("Queue"),
    RECORDING("Recording"),
    RESPONSE("Response"),
    ROLE("Role"),
    ROUTINGTRANSCRIPTIONSETTINGS("RoutingTranscriptionSettings"),
    RULESET("RuleSet"),
    SCHEDULE("Schedule"),
    SCHEDULEDEXPORTS("ScheduledExports"),
    SCHEDULEGROUP("ScheduleGroup"),
    SEGMENT("Segment"),
    SENTIMENTFEEDBACK("SentimentFeedback"),
    SEQUENCE("Sequence"),
    SEQUENCESCHEDULE("SequenceSchedule"),
    SESSIONTYPE("SessionType"),
    SITE("Site"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings"),
    TEAM("Team"),
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
    WRAPUPCODE("WrapupCode"),
    WRAPUPCODEMAPPING("WrapUpCodeMapping");

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
  private List<PropertyChange> propertyChanges = new ArrayList<PropertyChange>();
  private Map<String, String> context = null;

  
  /**
   * Id of the audit message.
   **/
  public AuditLogMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the audit message.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Home Organization Id associated with this audit message.
   **/
  public AuditLogMessage userHomeOrgId(String userHomeOrgId) {
    this.userHomeOrgId = userHomeOrgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Home Organization Id associated with this audit message.")
  @JsonProperty("userHomeOrgId")
  public String getUserHomeOrgId() {
    return userHomeOrgId;
  }
  public void setUserHomeOrgId(String userHomeOrgId) {
    this.userHomeOrgId = userHomeOrgId;
  }

  
  /**
   * User associated with this audit message.
   **/
  public AuditLogMessage user(DomainEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User associated with this audit message.")
  @JsonProperty("user")
  public DomainEntityRef getUser() {
    return user;
  }
  public void setUser(DomainEntityRef user) {
    this.user = user;
  }

  
  /**
   * Client associated with this audit message.
   **/
  public AuditLogMessage client(AddressableEntityRef client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client associated with this audit message.")
  @JsonProperty("client")
  public AddressableEntityRef getClient() {
    return client;
  }
  public void setClient(AddressableEntityRef client) {
    this.client = client;
  }

  
  /**
   * List of IP addresses of systems that originated or handled the request.
   **/
  public AuditLogMessage remoteIp(List<String> remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of IP addresses of systems that originated or handled the request.")
  @JsonProperty("remoteIp")
  public List<String> getRemoteIp() {
    return remoteIp;
  }
  public void setRemoteIp(List<String> remoteIp) {
    this.remoteIp = remoteIp;
  }

  
  /**
   * Name of the service that logged this audit message.
   **/
  public AuditLogMessage serviceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the service that logged this audit message.")
  @JsonProperty("serviceName")
  public ServiceNameEnum getServiceName() {
    return serviceName;
  }
  public void setServiceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
  }

  
  /**
   * Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AuditLogMessage eventDate(Date eventDate) {
    this.eventDate = eventDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventDate")
  public Date getEventDate() {
    return eventDate;
  }
  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }

  
  /**
   * Message describing the event being audited.
   **/
  public AuditLogMessage message(MessageInfo message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message describing the event being audited.")
  @JsonProperty("message")
  public MessageInfo getMessage() {
    return message;
  }
  public void setMessage(MessageInfo message) {
    this.message = message;
  }

  
  /**
   * Action that took place.
   **/
  public AuditLogMessage action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action that took place.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * Entity that was impacted.
   **/
  public AuditLogMessage entity(DomainEntityRef entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Entity that was impacted.")
  @JsonProperty("entity")
  public DomainEntityRef getEntity() {
    return entity;
  }
  public void setEntity(DomainEntityRef entity) {
    this.entity = entity;
  }

  
  /**
   * Type of the entity that was impacted.
   **/
  public AuditLogMessage entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the entity that was impacted.")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  
  /**
   * List of properties that were changed and changes made to those properties.
   **/
  public AuditLogMessage propertyChanges(List<PropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of properties that were changed and changes made to those properties.")
  @JsonProperty("propertyChanges")
  public List<PropertyChange> getPropertyChanges() {
    return propertyChanges;
  }
  public void setPropertyChanges(List<PropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
  }

  
  /**
   * Additional context for this message.
   **/
  public AuditLogMessage context(Map<String, String> context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional context for this message.")
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
    AuditLogMessage auditLogMessage = (AuditLogMessage) o;
    return Objects.equals(this.id, auditLogMessage.id) &&
        Objects.equals(this.userHomeOrgId, auditLogMessage.userHomeOrgId) &&
        Objects.equals(this.user, auditLogMessage.user) &&
        Objects.equals(this.client, auditLogMessage.client) &&
        Objects.equals(this.remoteIp, auditLogMessage.remoteIp) &&
        Objects.equals(this.serviceName, auditLogMessage.serviceName) &&
        Objects.equals(this.eventDate, auditLogMessage.eventDate) &&
        Objects.equals(this.message, auditLogMessage.message) &&
        Objects.equals(this.action, auditLogMessage.action) &&
        Objects.equals(this.entity, auditLogMessage.entity) &&
        Objects.equals(this.entityType, auditLogMessage.entityType) &&
        Objects.equals(this.propertyChanges, auditLogMessage.propertyChanges) &&
        Objects.equals(this.context, auditLogMessage.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userHomeOrgId, user, client, remoteIp, serviceName, eventDate, message, action, entity, entityType, propertyChanges, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userHomeOrgId: ").append(toIndentedString(userHomeOrgId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

