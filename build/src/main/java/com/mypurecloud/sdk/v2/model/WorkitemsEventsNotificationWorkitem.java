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
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationCustomAttribute;
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationDelta;
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationPropertyChange;
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationScoredAgent;
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationSession;
import com.mypurecloud.sdk.v2.model.WorkitemsEventsNotificationWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WorkitemsEventsNotificationWorkitem
 */

public class WorkitemsEventsNotificationWorkitem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String typeId = null;
  private String description = null;
  private String languageId = null;
  private Long priority = null;
  private String dateCreated = null;
  private String dateModified = null;
  private String dateDue = null;
  private String dateExpires = null;
  private String dateAssignmentStateChanged = null;
  private Long durationSeconds = null;
  private Long ttl = null;
  private String statusId = null;

  private static class StatusCategoryEnumDeserializer extends StdDeserializer<StatusCategoryEnum> {
    public StatusCategoryEnumDeserializer() {
      super(StatusCategoryEnumDeserializer.class);
    }

    @Override
    public StatusCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets statusCategory
   */
 @JsonDeserialize(using = StatusCategoryEnumDeserializer.class)
  public enum StatusCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (StatusCategoryEnum value : StatusCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusCategoryEnum statusCategory = null;
  private String dateClosed = null;
  private String workbinId = null;
  private String reporterId = null;
  private String assigneeId = null;
  private String externalContactId = null;
  private String externalTag = null;
  private String wrapupId = null;
  private String modifiedBy = null;

  private static class OperationEnumDeserializer extends StdDeserializer<OperationEnum> {
    public OperationEnumDeserializer() {
      super(OperationEnumDeserializer.class);
    }

    @Override
    public OperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets operation
   */
 @JsonDeserialize(using = OperationEnumDeserializer.class)
  public enum OperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    ADD("add"),
    EDIT("edit"),
    DELETE("delete"),
    VIEW("view"),
    UPLOAD("upload"),
    DOWNLOAD("download"),
    ACTIVATE("activate"),
    DEACTIVATE("deactivate"),
    PURGE("purge"),
    PROCESSED("processed"),
    PUBLISHED("published"),
    ASSIGNED("assigned"),
    UNASSIGNED("unassigned"),
    RESET("reset"),
    REASSIGNED("reassigned"),
    REASSIGN("reassign"),
    ARCHIVE("archive"),
    UNARCHIVE("unarchive"),
    RESCHEDULE("reschedule");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationEnum fromString(String key) {
      if (key == null) return null;

      for (OperationEnum value : OperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationEnum operation = null;
  private List<WorkitemsEventsNotificationDelta> changes = null;
  private List<WorkitemsEventsNotificationPropertyChange> propertyChanges = null;

  private static class AssignmentStateEnumDeserializer extends StdDeserializer<AssignmentStateEnum> {
    public AssignmentStateEnumDeserializer() {
      super(AssignmentStateEnumDeserializer.class);
    }

    @Override
    public AssignmentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssignmentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets assignmentState
   */
 @JsonDeserialize(using = AssignmentStateEnumDeserializer.class)
  public enum AssignmentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    IDLE("Idle"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    ACDEXPIRED("AcdExpired");

    private String value;

    AssignmentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssignmentStateEnum fromString(String key) {
      if (key == null) return null;

      for (AssignmentStateEnum value : AssignmentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssignmentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssignmentStateEnum assignmentState = null;
  private String assignmentId = null;
  private Long alertTimeoutSeconds = null;
  private String queueId = null;
  private Map<String, WorkitemsEventsNotificationCustomAttribute> customFields = null;
  private WorkitemsEventsNotificationWrapup wrapup = null;
  private List<WorkitemsEventsNotificationSession> sessions = null;
  private List<String> skillIds = null;
  private String scriptId = null;
  private String workbinName = null;
  private String typeName = null;
  private List<String> preferredAgentIds = null;
  private String divisionId = null;
  private List<WorkitemsEventsNotificationScoredAgent> scoredAgents = null;
  private String utilizationLabelId = null;

  public WorkitemsEventsNotificationWorkitem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      changes = new ArrayList<WorkitemsEventsNotificationDelta>();
      propertyChanges = new ArrayList<WorkitemsEventsNotificationPropertyChange>();
      sessions = new ArrayList<WorkitemsEventsNotificationSession>();
      skillIds = new ArrayList<String>();
      preferredAgentIds = new ArrayList<String>();
      scoredAgents = new ArrayList<WorkitemsEventsNotificationScoredAgent>();
    }
  }

  
  /**
   **/
  public WorkitemsEventsNotificationWorkitem id(String id) {
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
  public WorkitemsEventsNotificationWorkitem name(String name) {
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
  public WorkitemsEventsNotificationWorkitem typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("typeId")
  public String getTypeId() {
    return typeId;
  }
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem priority(Long priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }
  public void setPriority(Long priority) {
    this.priority = priority;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public String getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateModified(String dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public String getDateModified() {
    return dateModified;
  }
  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateDue(String dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateDue")
  public String getDateDue() {
    return dateDue;
  }
  public void setDateDue(String dateDue) {
    this.dateDue = dateDue;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateExpires(String dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateExpires")
  public String getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(String dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateAssignmentStateChanged(String dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateAssignmentStateChanged")
  public String getDateAssignmentStateChanged() {
    return dateAssignmentStateChanged;
  }
  public void setDateAssignmentStateChanged(String dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem durationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public Long getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ttl")
  public Long getTtl() {
    return ttl;
  }
  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusId")
  public String getStatusId() {
    return statusId;
  }
  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }
  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem dateClosed(String dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateClosed")
  public String getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(String dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem workbinId(String workbinId) {
    this.workbinId = workbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workbinId")
  public String getWorkbinId() {
    return workbinId;
  }
  public void setWorkbinId(String workbinId) {
    this.workbinId = workbinId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem reporterId(String reporterId) {
    this.reporterId = reporterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reporterId")
  public String getReporterId() {
    return reporterId;
  }
  public void setReporterId(String reporterId) {
    this.reporterId = reporterId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assigneeId")
  public String getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem wrapupId(String wrapupId) {
    this.wrapupId = wrapupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupId")
  public String getWrapupId() {
    return wrapupId;
  }
  public void setWrapupId(String wrapupId) {
    this.wrapupId = wrapupId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem changes(List<WorkitemsEventsNotificationDelta> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changes")
  public List<WorkitemsEventsNotificationDelta> getChanges() {
    return changes;
  }
  public void setChanges(List<WorkitemsEventsNotificationDelta> changes) {
    this.changes = changes;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem propertyChanges(List<WorkitemsEventsNotificationPropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("propertyChanges")
  public List<WorkitemsEventsNotificationPropertyChange> getPropertyChanges() {
    return propertyChanges;
  }
  public void setPropertyChanges(List<WorkitemsEventsNotificationPropertyChange> propertyChanges) {
    this.propertyChanges = propertyChanges;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem assignmentId(String assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentId")
  public String getAssignmentId() {
    return assignmentId;
  }
  public void setAssignmentId(String assignmentId) {
    this.assignmentId = assignmentId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem alertTimeoutSeconds(Long alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertTimeoutSeconds")
  public Long getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Long alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem customFields(Map<String, WorkitemsEventsNotificationCustomAttribute> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public Map<String, WorkitemsEventsNotificationCustomAttribute> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, WorkitemsEventsNotificationCustomAttribute> customFields) {
    this.customFields = customFields;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem wrapup(WorkitemsEventsNotificationWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public WorkitemsEventsNotificationWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(WorkitemsEventsNotificationWrapup wrapup) {
    this.wrapup = wrapup;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem sessions(List<WorkitemsEventsNotificationSession> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessions")
  public List<WorkitemsEventsNotificationSession> getSessions() {
    return sessions;
  }
  public void setSessions(List<WorkitemsEventsNotificationSession> sessions) {
    this.sessions = sessions;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem workbinName(String workbinName) {
    this.workbinName = workbinName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workbinName")
  public String getWorkbinName() {
    return workbinName;
  }
  public void setWorkbinName(String workbinName) {
    this.workbinName = workbinName;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem preferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("preferredAgentIds")
  public List<String> getPreferredAgentIds() {
    return preferredAgentIds;
  }
  public void setPreferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem scoredAgents(List<WorkitemsEventsNotificationScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<WorkitemsEventsNotificationScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<WorkitemsEventsNotificationScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  /**
   **/
  public WorkitemsEventsNotificationWorkitem utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsEventsNotificationWorkitem workitemsEventsNotificationWorkitem = (WorkitemsEventsNotificationWorkitem) o;

    return Objects.equals(this.id, workitemsEventsNotificationWorkitem.id) &&
            Objects.equals(this.name, workitemsEventsNotificationWorkitem.name) &&
            Objects.equals(this.typeId, workitemsEventsNotificationWorkitem.typeId) &&
            Objects.equals(this.description, workitemsEventsNotificationWorkitem.description) &&
            Objects.equals(this.languageId, workitemsEventsNotificationWorkitem.languageId) &&
            Objects.equals(this.priority, workitemsEventsNotificationWorkitem.priority) &&
            Objects.equals(this.dateCreated, workitemsEventsNotificationWorkitem.dateCreated) &&
            Objects.equals(this.dateModified, workitemsEventsNotificationWorkitem.dateModified) &&
            Objects.equals(this.dateDue, workitemsEventsNotificationWorkitem.dateDue) &&
            Objects.equals(this.dateExpires, workitemsEventsNotificationWorkitem.dateExpires) &&
            Objects.equals(this.dateAssignmentStateChanged, workitemsEventsNotificationWorkitem.dateAssignmentStateChanged) &&
            Objects.equals(this.durationSeconds, workitemsEventsNotificationWorkitem.durationSeconds) &&
            Objects.equals(this.ttl, workitemsEventsNotificationWorkitem.ttl) &&
            Objects.equals(this.statusId, workitemsEventsNotificationWorkitem.statusId) &&
            Objects.equals(this.statusCategory, workitemsEventsNotificationWorkitem.statusCategory) &&
            Objects.equals(this.dateClosed, workitemsEventsNotificationWorkitem.dateClosed) &&
            Objects.equals(this.workbinId, workitemsEventsNotificationWorkitem.workbinId) &&
            Objects.equals(this.reporterId, workitemsEventsNotificationWorkitem.reporterId) &&
            Objects.equals(this.assigneeId, workitemsEventsNotificationWorkitem.assigneeId) &&
            Objects.equals(this.externalContactId, workitemsEventsNotificationWorkitem.externalContactId) &&
            Objects.equals(this.externalTag, workitemsEventsNotificationWorkitem.externalTag) &&
            Objects.equals(this.wrapupId, workitemsEventsNotificationWorkitem.wrapupId) &&
            Objects.equals(this.modifiedBy, workitemsEventsNotificationWorkitem.modifiedBy) &&
            Objects.equals(this.operation, workitemsEventsNotificationWorkitem.operation) &&
            Objects.equals(this.changes, workitemsEventsNotificationWorkitem.changes) &&
            Objects.equals(this.propertyChanges, workitemsEventsNotificationWorkitem.propertyChanges) &&
            Objects.equals(this.assignmentState, workitemsEventsNotificationWorkitem.assignmentState) &&
            Objects.equals(this.assignmentId, workitemsEventsNotificationWorkitem.assignmentId) &&
            Objects.equals(this.alertTimeoutSeconds, workitemsEventsNotificationWorkitem.alertTimeoutSeconds) &&
            Objects.equals(this.queueId, workitemsEventsNotificationWorkitem.queueId) &&
            Objects.equals(this.customFields, workitemsEventsNotificationWorkitem.customFields) &&
            Objects.equals(this.wrapup, workitemsEventsNotificationWorkitem.wrapup) &&
            Objects.equals(this.sessions, workitemsEventsNotificationWorkitem.sessions) &&
            Objects.equals(this.skillIds, workitemsEventsNotificationWorkitem.skillIds) &&
            Objects.equals(this.scriptId, workitemsEventsNotificationWorkitem.scriptId) &&
            Objects.equals(this.workbinName, workitemsEventsNotificationWorkitem.workbinName) &&
            Objects.equals(this.typeName, workitemsEventsNotificationWorkitem.typeName) &&
            Objects.equals(this.preferredAgentIds, workitemsEventsNotificationWorkitem.preferredAgentIds) &&
            Objects.equals(this.divisionId, workitemsEventsNotificationWorkitem.divisionId) &&
            Objects.equals(this.scoredAgents, workitemsEventsNotificationWorkitem.scoredAgents) &&
            Objects.equals(this.utilizationLabelId, workitemsEventsNotificationWorkitem.utilizationLabelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeId, description, languageId, priority, dateCreated, dateModified, dateDue, dateExpires, dateAssignmentStateChanged, durationSeconds, ttl, statusId, statusCategory, dateClosed, workbinId, reporterId, assigneeId, externalContactId, externalTag, wrapupId, modifiedBy, operation, changes, propertyChanges, assignmentState, assignmentId, alertTimeoutSeconds, queueId, customFields, wrapup, sessions, skillIds, scriptId, workbinName, typeName, preferredAgentIds, divisionId, scoredAgents, utilizationLabelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsEventsNotificationWorkitem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    dateAssignmentStateChanged: ").append(toIndentedString(dateAssignmentStateChanged)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    workbinId: ").append(toIndentedString(workbinId)).append("\n");
    sb.append("    reporterId: ").append(toIndentedString(reporterId)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    wrapupId: ").append(toIndentedString(wrapupId)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    propertyChanges: ").append(toIndentedString(propertyChanges)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    workbinName: ").append(toIndentedString(workbinName)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    preferredAgentIds: ").append(toIndentedString(preferredAgentIds)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
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

