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
import com.mypurecloud.sdk.v2.model.WorkitemsUserEventsNotificationCustomAttribute;
import com.mypurecloud.sdk.v2.model.WorkitemsUserEventsNotificationDelta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WorkitemsUserEventsNotificationWorkitem
 */

public class WorkitemsUserEventsNotificationWorkitem  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String typeId = null;
  private String description = null;
  private String languageId = null;
  private Integer priority = null;
  private String dateCreated = null;
  private String dateModified = null;
  private String dateDue = null;
  private String dateExpires = null;
  private Integer durationSeconds = null;
  private Integer ttl = null;
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
    UNARCHIVE("unarchive");

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
  private List<WorkitemsUserEventsNotificationDelta> changes = null;

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
    ACDCANCELLED("AcdCancelled");

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
  private Integer alertTimeoutSeconds = null;
  private String queueId = null;
  private Map<String, WorkitemsUserEventsNotificationCustomAttribute> customFields = null;

  
  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem id(String id) {
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
  public WorkitemsUserEventsNotificationWorkitem name(String name) {
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
  public WorkitemsUserEventsNotificationWorkitem typeId(String typeId) {
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
  public WorkitemsUserEventsNotificationWorkitem description(String description) {
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
  public WorkitemsUserEventsNotificationWorkitem languageId(String languageId) {
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
  public WorkitemsUserEventsNotificationWorkitem priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem dateCreated(String dateCreated) {
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
  public WorkitemsUserEventsNotificationWorkitem dateModified(String dateModified) {
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
  public WorkitemsUserEventsNotificationWorkitem dateDue(String dateDue) {
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
  public WorkitemsUserEventsNotificationWorkitem dateExpires(String dateExpires) {
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
  public WorkitemsUserEventsNotificationWorkitem durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ttl")
  public Integer getTtl() {
    return ttl;
  }
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem statusId(String statusId) {
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
  public WorkitemsUserEventsNotificationWorkitem statusCategory(StatusCategoryEnum statusCategory) {
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
  public WorkitemsUserEventsNotificationWorkitem dateClosed(String dateClosed) {
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
  public WorkitemsUserEventsNotificationWorkitem workbinId(String workbinId) {
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
  public WorkitemsUserEventsNotificationWorkitem reporterId(String reporterId) {
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
  public WorkitemsUserEventsNotificationWorkitem assigneeId(String assigneeId) {
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
  public WorkitemsUserEventsNotificationWorkitem externalContactId(String externalContactId) {
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
  public WorkitemsUserEventsNotificationWorkitem externalTag(String externalTag) {
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
  public WorkitemsUserEventsNotificationWorkitem wrapupId(String wrapupId) {
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
  public WorkitemsUserEventsNotificationWorkitem modifiedBy(String modifiedBy) {
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
  public WorkitemsUserEventsNotificationWorkitem operation(OperationEnum operation) {
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
  public WorkitemsUserEventsNotificationWorkitem changes(List<WorkitemsUserEventsNotificationDelta> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changes")
  public List<WorkitemsUserEventsNotificationDelta> getChanges() {
    return changes;
  }
  public void setChanges(List<WorkitemsUserEventsNotificationDelta> changes) {
    this.changes = changes;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem assignmentState(AssignmentStateEnum assignmentState) {
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
  public WorkitemsUserEventsNotificationWorkitem assignmentId(String assignmentId) {
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
  public WorkitemsUserEventsNotificationWorkitem alertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertTimeoutSeconds")
  public Integer getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }


  /**
   **/
  public WorkitemsUserEventsNotificationWorkitem queueId(String queueId) {
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
  public WorkitemsUserEventsNotificationWorkitem customFields(Map<String, WorkitemsUserEventsNotificationCustomAttribute> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public Map<String, WorkitemsUserEventsNotificationCustomAttribute> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, WorkitemsUserEventsNotificationCustomAttribute> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsUserEventsNotificationWorkitem workitemsUserEventsNotificationWorkitem = (WorkitemsUserEventsNotificationWorkitem) o;

    return Objects.equals(this.id, workitemsUserEventsNotificationWorkitem.id) &&
            Objects.equals(this.name, workitemsUserEventsNotificationWorkitem.name) &&
            Objects.equals(this.typeId, workitemsUserEventsNotificationWorkitem.typeId) &&
            Objects.equals(this.description, workitemsUserEventsNotificationWorkitem.description) &&
            Objects.equals(this.languageId, workitemsUserEventsNotificationWorkitem.languageId) &&
            Objects.equals(this.priority, workitemsUserEventsNotificationWorkitem.priority) &&
            Objects.equals(this.dateCreated, workitemsUserEventsNotificationWorkitem.dateCreated) &&
            Objects.equals(this.dateModified, workitemsUserEventsNotificationWorkitem.dateModified) &&
            Objects.equals(this.dateDue, workitemsUserEventsNotificationWorkitem.dateDue) &&
            Objects.equals(this.dateExpires, workitemsUserEventsNotificationWorkitem.dateExpires) &&
            Objects.equals(this.durationSeconds, workitemsUserEventsNotificationWorkitem.durationSeconds) &&
            Objects.equals(this.ttl, workitemsUserEventsNotificationWorkitem.ttl) &&
            Objects.equals(this.statusId, workitemsUserEventsNotificationWorkitem.statusId) &&
            Objects.equals(this.statusCategory, workitemsUserEventsNotificationWorkitem.statusCategory) &&
            Objects.equals(this.dateClosed, workitemsUserEventsNotificationWorkitem.dateClosed) &&
            Objects.equals(this.workbinId, workitemsUserEventsNotificationWorkitem.workbinId) &&
            Objects.equals(this.reporterId, workitemsUserEventsNotificationWorkitem.reporterId) &&
            Objects.equals(this.assigneeId, workitemsUserEventsNotificationWorkitem.assigneeId) &&
            Objects.equals(this.externalContactId, workitemsUserEventsNotificationWorkitem.externalContactId) &&
            Objects.equals(this.externalTag, workitemsUserEventsNotificationWorkitem.externalTag) &&
            Objects.equals(this.wrapupId, workitemsUserEventsNotificationWorkitem.wrapupId) &&
            Objects.equals(this.modifiedBy, workitemsUserEventsNotificationWorkitem.modifiedBy) &&
            Objects.equals(this.operation, workitemsUserEventsNotificationWorkitem.operation) &&
            Objects.equals(this.changes, workitemsUserEventsNotificationWorkitem.changes) &&
            Objects.equals(this.assignmentState, workitemsUserEventsNotificationWorkitem.assignmentState) &&
            Objects.equals(this.assignmentId, workitemsUserEventsNotificationWorkitem.assignmentId) &&
            Objects.equals(this.alertTimeoutSeconds, workitemsUserEventsNotificationWorkitem.alertTimeoutSeconds) &&
            Objects.equals(this.queueId, workitemsUserEventsNotificationWorkitem.queueId) &&
            Objects.equals(this.customFields, workitemsUserEventsNotificationWorkitem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeId, description, languageId, priority, dateCreated, dateModified, dateDue, dateExpires, durationSeconds, ttl, statusId, statusCategory, dateClosed, workbinId, reporterId, assigneeId, externalContactId, externalTag, wrapupId, modifiedBy, operation, changes, assignmentState, assignmentId, alertTimeoutSeconds, queueId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsUserEventsNotificationWorkitem {\n");
    
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
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

