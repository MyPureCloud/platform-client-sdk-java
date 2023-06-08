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
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeBoolean;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeInstant;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeInteger;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeList;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeMap;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeString;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeWorkitemStatusCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemDelta
 */

public class WorkitemDelta  implements Serializable {
  
  private WorkitemsAttributeChangeString name = null;
  private WorkitemsAttributeChangeString description = null;
  private WorkitemsAttributeChangeString languageId = null;
  private WorkitemsAttributeChangeInteger priority = null;
  private WorkitemsAttributeChangeList skillIds = null;
  private WorkitemsAttributeChangeList preferredAgentIds = null;
  private WorkitemsAttributeChangeInstant dateDue = null;
  private WorkitemsAttributeChangeInstant dateExpires = null;
  private WorkitemsAttributeChangeInteger durationSeconds = null;
  private WorkitemsAttributeChangeString statusId = null;
  private WorkitemsAttributeChangeString reporterId = null;
  private WorkitemsAttributeChangeString externalContactId = null;
  private WorkitemsAttributeChangeString assigneeId = null;
  private WorkitemsAttributeChangeString workbinId = null;
  private WorkitemsAttributeChangeString queueId = null;
  private WorkitemsAttributeChangeString externalTag = null;
  private WorkitemsAttributeChangeString wrapupId = null;
  private WorkitemsAttributeChangeInteger ttl = null;
  private WorkitemsAttributeChangeInstant dateClosed = null;
  private WorkitemsAttributeChangeString assignmentState = null;
  private WorkitemsAttributeChangeBoolean autoStatusTransition = null;
  private WorkitemsAttributeChangeMap customFields = null;
  private WorkitemsAttributeChangeInstant dateModified = null;
  private WorkitemsAttributeChangeString modifiedBy = null;
  private WorkitemsAttributeChangeWorkitemStatusCategory statusCategory = null;

  
  /**
   **/
  public WorkitemDelta name(WorkitemsAttributeChangeString name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public WorkitemsAttributeChangeString getName() {
    return name;
  }
  public void setName(WorkitemsAttributeChangeString name) {
    this.name = name;
  }


  /**
   **/
  public WorkitemDelta description(WorkitemsAttributeChangeString description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public WorkitemsAttributeChangeString getDescription() {
    return description;
  }
  public void setDescription(WorkitemsAttributeChangeString description) {
    this.description = description;
  }


  /**
   **/
  public WorkitemDelta languageId(WorkitemsAttributeChangeString languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languageId")
  public WorkitemsAttributeChangeString getLanguageId() {
    return languageId;
  }
  public void setLanguageId(WorkitemsAttributeChangeString languageId) {
    this.languageId = languageId;
  }


  /**
   **/
  public WorkitemDelta priority(WorkitemsAttributeChangeInteger priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public WorkitemsAttributeChangeInteger getPriority() {
    return priority;
  }
  public void setPriority(WorkitemsAttributeChangeInteger priority) {
    this.priority = priority;
  }


  /**
   **/
  public WorkitemDelta skillIds(WorkitemsAttributeChangeList skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skillIds")
  public WorkitemsAttributeChangeList getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(WorkitemsAttributeChangeList skillIds) {
    this.skillIds = skillIds;
  }


  /**
   **/
  public WorkitemDelta preferredAgentIds(WorkitemsAttributeChangeList preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("preferredAgentIds")
  public WorkitemsAttributeChangeList getPreferredAgentIds() {
    return preferredAgentIds;
  }
  public void setPreferredAgentIds(WorkitemsAttributeChangeList preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
  }


  /**
   **/
  public WorkitemDelta dateDue(WorkitemsAttributeChangeInstant dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateDue")
  public WorkitemsAttributeChangeInstant getDateDue() {
    return dateDue;
  }
  public void setDateDue(WorkitemsAttributeChangeInstant dateDue) {
    this.dateDue = dateDue;
  }


  /**
   **/
  public WorkitemDelta dateExpires(WorkitemsAttributeChangeInstant dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateExpires")
  public WorkitemsAttributeChangeInstant getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(WorkitemsAttributeChangeInstant dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   **/
  public WorkitemDelta durationSeconds(WorkitemsAttributeChangeInteger durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public WorkitemsAttributeChangeInteger getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(WorkitemsAttributeChangeInteger durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   **/
  public WorkitemDelta statusId(WorkitemsAttributeChangeString statusId) {
    this.statusId = statusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusId")
  public WorkitemsAttributeChangeString getStatusId() {
    return statusId;
  }
  public void setStatusId(WorkitemsAttributeChangeString statusId) {
    this.statusId = statusId;
  }


  /**
   **/
  public WorkitemDelta reporterId(WorkitemsAttributeChangeString reporterId) {
    this.reporterId = reporterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reporterId")
  public WorkitemsAttributeChangeString getReporterId() {
    return reporterId;
  }
  public void setReporterId(WorkitemsAttributeChangeString reporterId) {
    this.reporterId = reporterId;
  }


  /**
   **/
  public WorkitemDelta externalContactId(WorkitemsAttributeChangeString externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public WorkitemsAttributeChangeString getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(WorkitemsAttributeChangeString externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   **/
  public WorkitemDelta assigneeId(WorkitemsAttributeChangeString assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assigneeId")
  public WorkitemsAttributeChangeString getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(WorkitemsAttributeChangeString assigneeId) {
    this.assigneeId = assigneeId;
  }


  /**
   **/
  public WorkitemDelta workbinId(WorkitemsAttributeChangeString workbinId) {
    this.workbinId = workbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workbinId")
  public WorkitemsAttributeChangeString getWorkbinId() {
    return workbinId;
  }
  public void setWorkbinId(WorkitemsAttributeChangeString workbinId) {
    this.workbinId = workbinId;
  }


  /**
   **/
  public WorkitemDelta queueId(WorkitemsAttributeChangeString queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public WorkitemsAttributeChangeString getQueueId() {
    return queueId;
  }
  public void setQueueId(WorkitemsAttributeChangeString queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public WorkitemDelta externalTag(WorkitemsAttributeChangeString externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalTag")
  public WorkitemsAttributeChangeString getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(WorkitemsAttributeChangeString externalTag) {
    this.externalTag = externalTag;
  }


  /**
   **/
  public WorkitemDelta wrapupId(WorkitemsAttributeChangeString wrapupId) {
    this.wrapupId = wrapupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupId")
  public WorkitemsAttributeChangeString getWrapupId() {
    return wrapupId;
  }
  public void setWrapupId(WorkitemsAttributeChangeString wrapupId) {
    this.wrapupId = wrapupId;
  }


  /**
   **/
  public WorkitemDelta ttl(WorkitemsAttributeChangeInteger ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ttl")
  public WorkitemsAttributeChangeInteger getTtl() {
    return ttl;
  }
  public void setTtl(WorkitemsAttributeChangeInteger ttl) {
    this.ttl = ttl;
  }


  /**
   **/
  public WorkitemDelta dateClosed(WorkitemsAttributeChangeInstant dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateClosed")
  public WorkitemsAttributeChangeInstant getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(WorkitemsAttributeChangeInstant dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   **/
  public WorkitemDelta assignmentState(WorkitemsAttributeChangeString assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentState")
  public WorkitemsAttributeChangeString getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(WorkitemsAttributeChangeString assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   **/
  public WorkitemDelta autoStatusTransition(WorkitemsAttributeChangeBoolean autoStatusTransition) {
    this.autoStatusTransition = autoStatusTransition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoStatusTransition")
  public WorkitemsAttributeChangeBoolean getAutoStatusTransition() {
    return autoStatusTransition;
  }
  public void setAutoStatusTransition(WorkitemsAttributeChangeBoolean autoStatusTransition) {
    this.autoStatusTransition = autoStatusTransition;
  }


  /**
   **/
  public WorkitemDelta customFields(WorkitemsAttributeChangeMap customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public WorkitemsAttributeChangeMap getCustomFields() {
    return customFields;
  }
  public void setCustomFields(WorkitemsAttributeChangeMap customFields) {
    this.customFields = customFields;
  }


  /**
   **/
  public WorkitemDelta dateModified(WorkitemsAttributeChangeInstant dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public WorkitemsAttributeChangeInstant getDateModified() {
    return dateModified;
  }
  public void setDateModified(WorkitemsAttributeChangeInstant dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public WorkitemDelta modifiedBy(WorkitemsAttributeChangeString modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WorkitemsAttributeChangeString getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WorkitemsAttributeChangeString modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public WorkitemDelta statusCategory(WorkitemsAttributeChangeWorkitemStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCategory")
  public WorkitemsAttributeChangeWorkitemStatusCategory getStatusCategory() {
    return statusCategory;
  }
  public void setStatusCategory(WorkitemsAttributeChangeWorkitemStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemDelta workitemDelta = (WorkitemDelta) o;

    return Objects.equals(this.name, workitemDelta.name) &&
            Objects.equals(this.description, workitemDelta.description) &&
            Objects.equals(this.languageId, workitemDelta.languageId) &&
            Objects.equals(this.priority, workitemDelta.priority) &&
            Objects.equals(this.skillIds, workitemDelta.skillIds) &&
            Objects.equals(this.preferredAgentIds, workitemDelta.preferredAgentIds) &&
            Objects.equals(this.dateDue, workitemDelta.dateDue) &&
            Objects.equals(this.dateExpires, workitemDelta.dateExpires) &&
            Objects.equals(this.durationSeconds, workitemDelta.durationSeconds) &&
            Objects.equals(this.statusId, workitemDelta.statusId) &&
            Objects.equals(this.reporterId, workitemDelta.reporterId) &&
            Objects.equals(this.externalContactId, workitemDelta.externalContactId) &&
            Objects.equals(this.assigneeId, workitemDelta.assigneeId) &&
            Objects.equals(this.workbinId, workitemDelta.workbinId) &&
            Objects.equals(this.queueId, workitemDelta.queueId) &&
            Objects.equals(this.externalTag, workitemDelta.externalTag) &&
            Objects.equals(this.wrapupId, workitemDelta.wrapupId) &&
            Objects.equals(this.ttl, workitemDelta.ttl) &&
            Objects.equals(this.dateClosed, workitemDelta.dateClosed) &&
            Objects.equals(this.assignmentState, workitemDelta.assignmentState) &&
            Objects.equals(this.autoStatusTransition, workitemDelta.autoStatusTransition) &&
            Objects.equals(this.customFields, workitemDelta.customFields) &&
            Objects.equals(this.dateModified, workitemDelta.dateModified) &&
            Objects.equals(this.modifiedBy, workitemDelta.modifiedBy) &&
            Objects.equals(this.statusCategory, workitemDelta.statusCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, languageId, priority, skillIds, preferredAgentIds, dateDue, dateExpires, durationSeconds, statusId, reporterId, externalContactId, assigneeId, workbinId, queueId, externalTag, wrapupId, ttl, dateClosed, assignmentState, autoStatusTransition, customFields, dateModified, modifiedBy, statusCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemDelta {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    preferredAgentIds: ").append(toIndentedString(preferredAgentIds)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    reporterId: ").append(toIndentedString(reporterId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    workbinId: ").append(toIndentedString(workbinId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    wrapupId: ").append(toIndentedString(wrapupId)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    autoStatusTransition: ").append(toIndentedString(autoStatusTransition)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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

