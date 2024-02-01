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
import com.mypurecloud.sdk.v2.model.WorkitemScoredAgentRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WorkitemUpdate
 */

public class WorkitemUpdate  implements Serializable {
  
  private String name = null;
  private Integer priority = null;
  private Date dateDue = null;
  private Date dateExpires = null;
  private Integer durationSeconds = null;
  private Integer ttl = null;
  private String statusId = null;
  private String workbinId = null;
  private Boolean autoStatusTransition = null;
  private String description = null;
  private Date dateClosed = null;

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
   * The assignment state of the Workitem.
   */
 @JsonDeserialize(using = AssignmentStateEnumDeserializer.class)
  public enum AssignmentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACDSTARTED("AcdStarted"),
    ALERTING("Alerting"),
    ALERTTIMEOUT("AlertTimeout"),
    ACDCANCELLED("AcdCancelled"),
    TERMINATED("Terminated"),
    IDLE("Idle"),
    DECLINED("Declined"),
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    PARKED("Parked"),
    HELD("Held"),
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

  private static class AssignmentOperationEnumDeserializer extends StdDeserializer<AssignmentOperationEnum> {
    public AssignmentOperationEnumDeserializer() {
      super(AssignmentOperationEnumDeserializer.class);
    }

    @Override
    public AssignmentOperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssignmentOperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Set this value to AgentAssignmentAlerting and supply an 'assigneeId' to assign the workitem to an agent and alert the agent of the assignment. Set this value to QueueAssignmentAlerting and supply a 'queueId' to route the workitem to an agent who is a member of the queue and alert the agent.
   */
 @JsonDeserialize(using = AssignmentOperationEnumDeserializer.class)
  public enum AssignmentOperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTASSIGNMENTALERTING("AgentAssignmentAlerting"),
    QUEUEASSIGNMENTALERTING("QueueAssignmentAlerting");

    private String value;

    AssignmentOperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssignmentOperationEnum fromString(String key) {
      if (key == null) return null;

      for (AssignmentOperationEnum value : AssignmentOperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssignmentOperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssignmentOperationEnum assignmentOperation = null;
  private Map<String, Object> customFields = null;
  private String queueId = null;
  private String assigneeId = null;
  private List<WorkitemScoredAgentRequest> scoredAgents = new ArrayList<WorkitemScoredAgentRequest>();
  private String externalContactId = null;
  private String externalTag = null;
  private List<String> skillIds = new ArrayList<String>();
  private String languageId = null;
  private String utilizationLabelId = null;
  private List<String> preferredAgentIds = new ArrayList<String>();

  
  /**
   * The name of the Workitem. Valid length between 3 and 256 characters.
   **/
  public WorkitemUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Workitem. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The priority of the Workitem. The valid range is between -25,000,000 and 25,000,000.
   **/
  public WorkitemUpdate priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the Workitem. The valid range is between -25,000,000 and 25,000,000.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The due date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemUpdate dateDue(Date dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The due date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDue")
  public Date getDateDue() {
    return dateDue;
  }
  public void setDateDue(Date dateDue) {
    this.dateDue = dateDue;
  }


  /**
   * The expiry date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemUpdate dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The expiry date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   * The estimated duration in seconds to complete the Workitem. Maximum of 365 days.
   **/
  public WorkitemUpdate durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The estimated duration in seconds to complete the Workitem. Maximum of 365 days.")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   * The epoch timestamp in seconds specifying the time to live for the Workitem. Can not be greater than 365 days from the current time.
   **/
  public WorkitemUpdate ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The epoch timestamp in seconds specifying the time to live for the Workitem. Can not be greater than 365 days from the current time.")
  @JsonProperty("ttl")
  public Integer getTtl() {
    return ttl;
  }
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  /**
   * The ID of the Status of the Workitem.
   **/
  public WorkitemUpdate statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Status of the Workitem.")
  @JsonProperty("statusId")
  public String getStatusId() {
    return statusId;
  }
  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }


  /**
   * The ID of Workbin that contains the Workitem.
   **/
  public WorkitemUpdate workbinId(String workbinId) {
    this.workbinId = workbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of Workbin that contains the Workitem.")
  @JsonProperty("workbinId")
  public String getWorkbinId() {
    return workbinId;
  }
  public void setWorkbinId(String workbinId) {
    this.workbinId = workbinId;
  }


  /**
   * Set it to false to disable auto status transition. By default, it is enabled.
   **/
  public WorkitemUpdate autoStatusTransition(Boolean autoStatusTransition) {
    this.autoStatusTransition = autoStatusTransition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set it to false to disable auto status transition. By default, it is enabled.")
  @JsonProperty("autoStatusTransition")
  public Boolean getAutoStatusTransition() {
    return autoStatusTransition;
  }
  public void setAutoStatusTransition(Boolean autoStatusTransition) {
    this.autoStatusTransition = autoStatusTransition;
  }


  /**
   * The description of the Workitem. Maximum length of 4096 characters.
   **/
  public WorkitemUpdate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Workitem. Maximum length of 4096 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The closed date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemUpdate dateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The closed date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateClosed")
  public Date getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   * The assignment state of the Workitem.
   **/
  public WorkitemUpdate assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment state of the Workitem.")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   * Set this value to AgentAssignmentAlerting and supply an 'assigneeId' to assign the workitem to an agent and alert the agent of the assignment. Set this value to QueueAssignmentAlerting and supply a 'queueId' to route the workitem to an agent who is a member of the queue and alert the agent.
   **/
  public WorkitemUpdate assignmentOperation(AssignmentOperationEnum assignmentOperation) {
    this.assignmentOperation = assignmentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set this value to AgentAssignmentAlerting and supply an 'assigneeId' to assign the workitem to an agent and alert the agent of the assignment. Set this value to QueueAssignmentAlerting and supply a 'queueId' to route the workitem to an agent who is a member of the queue and alert the agent.")
  @JsonProperty("assignmentOperation")
  public AssignmentOperationEnum getAssignmentOperation() {
    return assignmentOperation;
  }
  public void setAssignmentOperation(AssignmentOperationEnum assignmentOperation) {
    this.assignmentOperation = assignmentOperation;
  }


  /**
   * Custom fields defined in the schema referenced by the worktype of the workitem. If set to {}, the existing keys and values will be removed.
   **/
  public WorkitemUpdate customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom fields defined in the schema referenced by the worktype of the workitem. If set to {}, the existing keys and values will be removed.")
  @JsonProperty("customFields")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  /**
   * The ID of the Workitems queue. Must be a valid UUID.
   **/
  public WorkitemUpdate queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Workitems queue. Must be a valid UUID.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The ID of the assignee of the Workitem. If supplied it must be a valid UUID.
   **/
  public WorkitemUpdate assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the assignee of the Workitem. If supplied it must be a valid UUID.")
  @JsonProperty("assigneeId")
  public String getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }


  /**
   * A list of scored agents for the Workitem. A workitem can have a maximum of 20 scored agents.
   **/
  public WorkitemUpdate scoredAgents(List<WorkitemScoredAgentRequest> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of scored agents for the Workitem. A workitem can have a maximum of 20 scored agents.")
  @JsonProperty("scoredAgents")
  public List<WorkitemScoredAgentRequest> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<WorkitemScoredAgentRequest> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  /**
   * The ID of the external contact of the Workitem. Must be a valid UUID.
   **/
  public WorkitemUpdate externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the external contact of the Workitem. Must be a valid UUID.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * The external tag of the Workitem.
   **/
  public WorkitemUpdate externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external tag of the Workitem.")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }


  /**
   * The skill IDs of the Workitem. Must be valid UUIDs.
   **/
  public WorkitemUpdate skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill IDs of the Workitem. Must be valid UUIDs.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  /**
   * The ID of language of the Workitem. Must be a valid UUID.
   **/
  public WorkitemUpdate languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of language of the Workitem. Must be a valid UUID.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * The ID of the utilization label of the Workitem. Must be a valid UUID.
   **/
  public WorkitemUpdate utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the utilization label of the Workitem. Must be a valid UUID.")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   * The preferred agent IDs of the Workitem. Must be valid UUIDs.
   **/
  public WorkitemUpdate preferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The preferred agent IDs of the Workitem. Must be valid UUIDs.")
  @JsonProperty("preferredAgentIds")
  public List<String> getPreferredAgentIds() {
    return preferredAgentIds;
  }
  public void setPreferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemUpdate workitemUpdate = (WorkitemUpdate) o;

    return Objects.equals(this.name, workitemUpdate.name) &&
            Objects.equals(this.priority, workitemUpdate.priority) &&
            Objects.equals(this.dateDue, workitemUpdate.dateDue) &&
            Objects.equals(this.dateExpires, workitemUpdate.dateExpires) &&
            Objects.equals(this.durationSeconds, workitemUpdate.durationSeconds) &&
            Objects.equals(this.ttl, workitemUpdate.ttl) &&
            Objects.equals(this.statusId, workitemUpdate.statusId) &&
            Objects.equals(this.workbinId, workitemUpdate.workbinId) &&
            Objects.equals(this.autoStatusTransition, workitemUpdate.autoStatusTransition) &&
            Objects.equals(this.description, workitemUpdate.description) &&
            Objects.equals(this.dateClosed, workitemUpdate.dateClosed) &&
            Objects.equals(this.assignmentState, workitemUpdate.assignmentState) &&
            Objects.equals(this.assignmentOperation, workitemUpdate.assignmentOperation) &&
            Objects.equals(this.customFields, workitemUpdate.customFields) &&
            Objects.equals(this.queueId, workitemUpdate.queueId) &&
            Objects.equals(this.assigneeId, workitemUpdate.assigneeId) &&
            Objects.equals(this.scoredAgents, workitemUpdate.scoredAgents) &&
            Objects.equals(this.externalContactId, workitemUpdate.externalContactId) &&
            Objects.equals(this.externalTag, workitemUpdate.externalTag) &&
            Objects.equals(this.skillIds, workitemUpdate.skillIds) &&
            Objects.equals(this.languageId, workitemUpdate.languageId) &&
            Objects.equals(this.utilizationLabelId, workitemUpdate.utilizationLabelId) &&
            Objects.equals(this.preferredAgentIds, workitemUpdate.preferredAgentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priority, dateDue, dateExpires, durationSeconds, ttl, statusId, workbinId, autoStatusTransition, description, dateClosed, assignmentState, assignmentOperation, customFields, queueId, assigneeId, scoredAgents, externalContactId, externalTag, skillIds, languageId, utilizationLabelId, preferredAgentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    workbinId: ").append(toIndentedString(workbinId)).append("\n");
    sb.append("    autoStatusTransition: ").append(toIndentedString(autoStatusTransition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    assignmentOperation: ").append(toIndentedString(assignmentOperation)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    preferredAgentIds: ").append(toIndentedString(preferredAgentIds)).append("\n");
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

