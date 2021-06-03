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
 * QualityAuditLogMessage
 */

public class QualityAuditLogMessage  implements Serializable {
  
  private String id = null;
  private String userHomeOrgId = null;
  private String userTrusteeOrgId = null;
  private DomainEntityRef user = null;
  private AddressableEntityRef client = null;
  private List<String> remoteIps = new ArrayList<String>();

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
    RECORDINGSERVICE("RecordingService"),
    RECORDINGPLAYBACKSERVICE("RecordingPlaybackService"),
    QUALITYSERVICE("QualityService");

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

  private static class LevelEnumDeserializer extends StdDeserializer<LevelEnum> {
    public LevelEnumDeserializer() {
      super(LevelEnumDeserializer.class);
    }

    @Override
    public LevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The level of this audit message.
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    SYSTEM("System");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LevelEnum fromString(String key) {
      if (key == null) return null;

      for (LevelEnum value : LevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LevelEnum level = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the action of this audit message.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("Success"),
    FAILURE("Failure"),
    WARNING("Warning");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private Date eventDate = null;
  private MessageInfo messageInfo = null;

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
    READ("Read"),
    CREATE("Create"),
    UPDATE("Update"),
    DELETE("Delete"),
    ABANDON("Abandon"),
    ARCHIVE("Archive"),
    EXPORT("Export"),
    RESTOREREQUEST("RestoreRequest"),
    RESTORECOMPLETE("RestoreComplete"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    UPDATERETENTION("UpdateRetention");

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
    RECORDING("Recording"),
    EVALUATION("Evaluation"),
    CALIBRATION("Calibration"),
    ANNOTATION("Annotation"),
    SCREENRECORDING("ScreenRecording"),
    SURVEY("Survey");

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
  public QualityAuditLogMessage id(String id) {
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
  public QualityAuditLogMessage userHomeOrgId(String userHomeOrgId) {
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
   * Trustee Organization Id if this audit message is from trustee access.
   **/
  public QualityAuditLogMessage userTrusteeOrgId(String userTrusteeOrgId) {
    this.userTrusteeOrgId = userTrusteeOrgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trustee Organization Id if this audit message is from trustee access.")
  @JsonProperty("userTrusteeOrgId")
  public String getUserTrusteeOrgId() {
    return userTrusteeOrgId;
  }
  public void setUserTrusteeOrgId(String userTrusteeOrgId) {
    this.userTrusteeOrgId = userTrusteeOrgId;
  }

  
  /**
   * User associated with this audit message.
   **/
  public QualityAuditLogMessage user(DomainEntityRef user) {
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
  public QualityAuditLogMessage client(AddressableEntityRef client) {
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
  public QualityAuditLogMessage remoteIps(List<String> remoteIps) {
    this.remoteIps = remoteIps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of IP addresses of systems that originated or handled the request.")
  @JsonProperty("remoteIps")
  public List<String> getRemoteIps() {
    return remoteIps;
  }
  public void setRemoteIps(List<String> remoteIps) {
    this.remoteIps = remoteIps;
  }

  
  /**
   * Name of the service that logged this audit message.
   **/
  public QualityAuditLogMessage serviceName(ServiceNameEnum serviceName) {
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
   * The level of this audit message.
   **/
  public QualityAuditLogMessage level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The level of this audit message.")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  
  /**
   * The status of the action of this audit message.
   **/
  public QualityAuditLogMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the action of this audit message.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public QualityAuditLogMessage eventDate(Date eventDate) {
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
  public QualityAuditLogMessage messageInfo(MessageInfo messageInfo) {
    this.messageInfo = messageInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message describing the event being audited.")
  @JsonProperty("messageInfo")
  public MessageInfo getMessageInfo() {
    return messageInfo;
  }
  public void setMessageInfo(MessageInfo messageInfo) {
    this.messageInfo = messageInfo;
  }

  
  /**
   * Action that took place.
   **/
  public QualityAuditLogMessage action(ActionEnum action) {
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
  public QualityAuditLogMessage entity(DomainEntityRef entity) {
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
  public QualityAuditLogMessage entityType(EntityTypeEnum entityType) {
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
  public QualityAuditLogMessage propertyChanges(List<PropertyChange> propertyChanges) {
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
  public QualityAuditLogMessage context(Map<String, String> context) {
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
    QualityAuditLogMessage qualityAuditLogMessage = (QualityAuditLogMessage) o;
    return Objects.equals(this.id, qualityAuditLogMessage.id) &&
        Objects.equals(this.userHomeOrgId, qualityAuditLogMessage.userHomeOrgId) &&
        Objects.equals(this.userTrusteeOrgId, qualityAuditLogMessage.userTrusteeOrgId) &&
        Objects.equals(this.user, qualityAuditLogMessage.user) &&
        Objects.equals(this.client, qualityAuditLogMessage.client) &&
        Objects.equals(this.remoteIps, qualityAuditLogMessage.remoteIps) &&
        Objects.equals(this.serviceName, qualityAuditLogMessage.serviceName) &&
        Objects.equals(this.level, qualityAuditLogMessage.level) &&
        Objects.equals(this.status, qualityAuditLogMessage.status) &&
        Objects.equals(this.eventDate, qualityAuditLogMessage.eventDate) &&
        Objects.equals(this.messageInfo, qualityAuditLogMessage.messageInfo) &&
        Objects.equals(this.action, qualityAuditLogMessage.action) &&
        Objects.equals(this.entity, qualityAuditLogMessage.entity) &&
        Objects.equals(this.entityType, qualityAuditLogMessage.entityType) &&
        Objects.equals(this.propertyChanges, qualityAuditLogMessage.propertyChanges) &&
        Objects.equals(this.context, qualityAuditLogMessage.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userHomeOrgId, userTrusteeOrgId, user, client, remoteIps, serviceName, level, status, eventDate, messageInfo, action, entity, entityType, propertyChanges, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityAuditLogMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userHomeOrgId: ").append(toIndentedString(userHomeOrgId)).append("\n");
    sb.append("    userTrusteeOrgId: ").append(toIndentedString(userTrusteeOrgId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    remoteIps: ").append(toIndentedString(remoteIps)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    messageInfo: ").append(toIndentedString(messageInfo)).append("\n");
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

