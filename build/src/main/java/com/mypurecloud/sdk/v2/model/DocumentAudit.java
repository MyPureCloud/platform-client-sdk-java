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
import com.mypurecloud.sdk.v2.model.AuditChange;
import com.mypurecloud.sdk.v2.model.AuditEntityReference;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentAudit
 */

public class DocumentAudit  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DomainEntityRef user = null;
  private DomainEntityRef workspace = null;
  private String transactionId = null;
  private Boolean transactionInitiator = null;
  private String application = null;
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
   * Gets or Sets level
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    SYSTEM("SYSTEM");

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
  private Date timestamp = null;

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
   * Gets or Sets status
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

  private static class ActionContextEnumDeserializer extends StdDeserializer<ActionContextEnum> {
    public ActionContextEnumDeserializer() {
      super(ActionContextEnumDeserializer.class);
    }

    @Override
    public ActionContextEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionContextEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actionContext
   */
 @JsonDeserialize(using = ActionContextEnumDeserializer.class)
  public enum ActionContextEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("CREATE"),
    READ("READ"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    DOWNLOAD("DOWNLOAD"),
    VIEW("VIEW"),
    UPLOAD("UPLOAD"),
    SAVE("SAVE"),
    MOVE("MOVE"),
    COPY("COPY"),
    ADD("ADD"),
    REMOVE("REMOVE"),
    RECEIVE("RECEIVE"),
    CONVERT("CONVERT"),
    FAX("FAX"),
    CREATE_COVERPAGE("CREATE_COVERPAGE"),
    USER_ADD("USER_ADD"),
    USER_REMOVE("USER_REMOVE"),
    MEMBER_ADD("MEMBER_ADD"),
    MEMBER_REMOVE("MEMBER_REMOVE"),
    MEMBER_UPDATE("MEMBER_UPDATE"),
    TAG_ADD("TAG_ADD"),
    TAG_REMOVE("TAG_REMOVE"),
    TAG_UPDATE("TAG_UPDATE"),
    ATTRIBUTE_ADD("ATTRIBUTE_ADD"),
    ATTRIBUTE_REMOVE("ATTRIBUTE_REMOVE"),
    ATTRIBUTE_UPDATE("ATTRIBUTE_UPDATE"),
    ATTRIBUTE_GROUP_INSTANCE_ADD("ATTRIBUTE_GROUP_INSTANCE_ADD"),
    ATTRIBUTE_GROUP_INSTANCE_REMOVE("ATTRIBUTE_GROUP_INSTANCE_REMOVE"),
    ATTRIBUTE_GROUP_INSTANCE_UPDATE("ATTRIBUTE_GROUP_INSTANCE_UPDATE"),
    INDEX_SAVE("INDEX_SAVE"),
    INDEX_DELETE("INDEX_DELETE"),
    INDEX_CREATE("INDEX_CREATE"),
    FILE_SAVE("FILE_SAVE"),
    FILE_DELETE("FILE_DELETE"),
    FILE_READ("FILE_READ"),
    THUMBNAIL_CREATE("THUMBNAIL_CREATE"),
    TEXT_EXTRACT("TEXT_EXTRACT"),
    SHARE_ADD("SHARE_ADD"),
    SHARE_REMOVE("SHARE_REMOVE"),
    VERSION_CREATE("VERSION_CREATE");

    private String value;

    ActionContextEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionContextEnum fromString(String key) {
      if (key == null) return null;

      for (ActionContextEnum value : ActionContextEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionContextEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionContextEnum actionContext = null;

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
    CREATE("CREATE"),
    READ("READ"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    DOWNLOAD("DOWNLOAD"),
    VIEW("VIEW"),
    UPLOAD("UPLOAD"),
    SAVE("SAVE"),
    MOVE("MOVE"),
    COPY("COPY"),
    ADD("ADD"),
    REMOVE("REMOVE"),
    RECEIVE("RECEIVE"),
    CONVERT("CONVERT"),
    FAX("FAX"),
    CREATE_COVERPAGE("CREATE_COVERPAGE"),
    USER_ADD("USER_ADD"),
    USER_REMOVE("USER_REMOVE"),
    MEMBER_ADD("MEMBER_ADD"),
    MEMBER_REMOVE("MEMBER_REMOVE"),
    MEMBER_UPDATE("MEMBER_UPDATE"),
    TAG_ADD("TAG_ADD"),
    TAG_REMOVE("TAG_REMOVE"),
    TAG_UPDATE("TAG_UPDATE"),
    ATTRIBUTE_ADD("ATTRIBUTE_ADD"),
    ATTRIBUTE_REMOVE("ATTRIBUTE_REMOVE"),
    ATTRIBUTE_UPDATE("ATTRIBUTE_UPDATE"),
    ATTRIBUTE_GROUP_INSTANCE_ADD("ATTRIBUTE_GROUP_INSTANCE_ADD"),
    ATTRIBUTE_GROUP_INSTANCE_REMOVE("ATTRIBUTE_GROUP_INSTANCE_REMOVE"),
    ATTRIBUTE_GROUP_INSTANCE_UPDATE("ATTRIBUTE_GROUP_INSTANCE_UPDATE"),
    INDEX_SAVE("INDEX_SAVE"),
    INDEX_DELETE("INDEX_DELETE"),
    INDEX_CREATE("INDEX_CREATE"),
    FILE_SAVE("FILE_SAVE"),
    FILE_DELETE("FILE_DELETE"),
    FILE_READ("FILE_READ"),
    THUMBNAIL_CREATE("THUMBNAIL_CREATE"),
    TEXT_EXTRACT("TEXT_EXTRACT"),
    SHARE_ADD("SHARE_ADD"),
    SHARE_REMOVE("SHARE_REMOVE"),
    VERSION_CREATE("VERSION_CREATE");

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
  private AuditEntityReference entity = null;
  private List<AuditChange> changes = new ArrayList<AuditChange>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DocumentAudit name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public DocumentAudit user(DomainEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DomainEntityRef getUser() {
    return user;
  }
  public void setUser(DomainEntityRef user) {
    this.user = user;
  }

  
  /**
   **/
  public DocumentAudit workspace(DomainEntityRef workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public DomainEntityRef getWorkspace() {
    return workspace;
  }
  public void setWorkspace(DomainEntityRef workspace) {
    this.workspace = workspace;
  }

  
  /**
   **/
  public DocumentAudit transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   **/
  public DocumentAudit transactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transactionInitiator")
  public Boolean getTransactionInitiator() {
    return transactionInitiator;
  }
  public void setTransactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
  }

  
  /**
   **/
  public DocumentAudit application(String application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }

  
  /**
   **/
  public DocumentAudit serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  
  /**
   **/
  public DocumentAudit level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DocumentAudit timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public DocumentAudit status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public DocumentAudit actionContext(ActionContextEnum actionContext) {
    this.actionContext = actionContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionContext")
  public ActionContextEnum getActionContext() {
    return actionContext;
  }
  public void setActionContext(ActionContextEnum actionContext) {
    this.actionContext = actionContext;
  }

  
  /**
   **/
  public DocumentAudit action(ActionEnum action) {
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
  public DocumentAudit entity(AuditEntityReference entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public AuditEntityReference getEntity() {
    return entity;
  }
  public void setEntity(AuditEntityReference entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public DocumentAudit changes(List<AuditChange> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changes")
  public List<AuditChange> getChanges() {
    return changes;
  }
  public void setChanges(List<AuditChange> changes) {
    this.changes = changes;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAudit documentAudit = (DocumentAudit) o;
    return Objects.equals(this.id, documentAudit.id) &&
        Objects.equals(this.name, documentAudit.name) &&
        Objects.equals(this.user, documentAudit.user) &&
        Objects.equals(this.workspace, documentAudit.workspace) &&
        Objects.equals(this.transactionId, documentAudit.transactionId) &&
        Objects.equals(this.transactionInitiator, documentAudit.transactionInitiator) &&
        Objects.equals(this.application, documentAudit.application) &&
        Objects.equals(this.serviceName, documentAudit.serviceName) &&
        Objects.equals(this.level, documentAudit.level) &&
        Objects.equals(this.timestamp, documentAudit.timestamp) &&
        Objects.equals(this.status, documentAudit.status) &&
        Objects.equals(this.actionContext, documentAudit.actionContext) &&
        Objects.equals(this.action, documentAudit.action) &&
        Objects.equals(this.entity, documentAudit.entity) &&
        Objects.equals(this.changes, documentAudit.changes) &&
        Objects.equals(this.selfUri, documentAudit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, workspace, transactionId, transactionInitiator, application, serviceName, level, timestamp, status, actionContext, action, entity, changes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAudit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInitiator: ").append(toIndentedString(transactionInitiator)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

