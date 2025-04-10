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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EntityChange;
import com.mypurecloud.sdk.v2.model.InitiatingAction;
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
  private List<String> remoteIp = null;
  private String serviceName = null;

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
   * Level of this audit message, USER or SYSTEM.
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    SYSTEM("SYSTEM"),
    GENESYS_INTERNAL("GENESYS_INTERNAL");

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
  private Date eventDate = null;
  private MessageInfo message = null;
  private String action = null;
  private DomainEntityRef entity = null;
  private String entityType = null;

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
   * Status of the event being audited
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    WARNING("WARNING");

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
  private String application = null;
  private InitiatingAction initiatingAction = null;
  private Boolean transactionInitiator = null;
  private List<PropertyChange> propertyChanges = null;
  private Map<String, String> context = null;
  private List<EntityChange> entityChanges = null;

  public AuditLogMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      remoteIp = new ArrayList<String>();
      propertyChanges = new ArrayList<PropertyChange>();
      entityChanges = new ArrayList<EntityChange>();
    }
  }

  
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
  public AuditLogMessage serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the service that logged this audit message.")
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  /**
   * Level of this audit message, USER or SYSTEM.
   **/
  public AuditLogMessage level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Level of this audit message, USER or SYSTEM.")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
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
  public AuditLogMessage action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action that took place.")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
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
  public AuditLogMessage entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the entity that was impacted.")
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  /**
   * Status of the event being audited
   **/
  public AuditLogMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the event being audited")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Name of the application used to perform the audit's action
   **/
  public AuditLogMessage application(String application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the application used to perform the audit's action")
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }


  /**
   * Id and action of the audit initiating the transaction
   **/
  public AuditLogMessage initiatingAction(InitiatingAction initiatingAction) {
    this.initiatingAction = initiatingAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id and action of the audit initiating the transaction")
  @JsonProperty("initiatingAction")
  public InitiatingAction getInitiatingAction() {
    return initiatingAction;
  }
  public void setInitiatingAction(InitiatingAction initiatingAction) {
    this.initiatingAction = initiatingAction;
  }


  /**
   * Whether the current audit is the initiator of the transaction
   **/
  public AuditLogMessage transactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the current audit is the initiator of the transaction")
  @JsonProperty("transactionInitiator")
  public Boolean getTransactionInitiator() {
    return transactionInitiator;
  }
  public void setTransactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
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


  /**
   * List of entities that were changed and changes made to those entities.
   **/
  public AuditLogMessage entityChanges(List<EntityChange> entityChanges) {
    this.entityChanges = entityChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entities that were changed and changes made to those entities.")
  @JsonProperty("entityChanges")
  public List<EntityChange> getEntityChanges() {
    return entityChanges;
  }
  public void setEntityChanges(List<EntityChange> entityChanges) {
    this.entityChanges = entityChanges;
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
            Objects.equals(this.level, auditLogMessage.level) &&
            Objects.equals(this.eventDate, auditLogMessage.eventDate) &&
            Objects.equals(this.message, auditLogMessage.message) &&
            Objects.equals(this.action, auditLogMessage.action) &&
            Objects.equals(this.entity, auditLogMessage.entity) &&
            Objects.equals(this.entityType, auditLogMessage.entityType) &&
            Objects.equals(this.status, auditLogMessage.status) &&
            Objects.equals(this.application, auditLogMessage.application) &&
            Objects.equals(this.initiatingAction, auditLogMessage.initiatingAction) &&
            Objects.equals(this.transactionInitiator, auditLogMessage.transactionInitiator) &&
            Objects.equals(this.propertyChanges, auditLogMessage.propertyChanges) &&
            Objects.equals(this.context, auditLogMessage.context) &&
            Objects.equals(this.entityChanges, auditLogMessage.entityChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userHomeOrgId, user, client, remoteIp, serviceName, level, eventDate, message, action, entity, entityType, status, application, initiatingAction, transactionInitiator, propertyChanges, context, entityChanges);
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
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    initiatingAction: ").append(toIndentedString(initiatingAction)).append("\n");
    sb.append("    transactionInitiator: ").append(toIndentedString(transactionInitiator)).append("\n");
    sb.append("    propertyChanges: ").append(toIndentedString(propertyChanges)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    entityChanges: ").append(toIndentedString(entityChanges)).append("\n");
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

