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
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeBoolean;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeInstant;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeInteger;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeList;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorktypeDelta
 */

public class WorktypeDelta  implements Serializable {
  
  private WorkitemsAttributeChangeString name = null;
  private WorkitemsAttributeChangeString description = null;
  private WorkitemsAttributeChangeList statuses = null;
  private WorkitemsAttributeChangeString defaultWorkbinId = null;
  private WorkitemsAttributeChangeInteger defaultDurationSeconds = null;
  private WorkitemsAttributeChangeInteger defaultExpirationSeconds = null;
  private WorkitemsAttributeChangeInteger defaultDueDurationSeconds = null;
  private WorkitemsAttributeChangeInteger defaultPriority = null;
  private WorkitemsAttributeChangeList defaultSkillIds = null;
  private WorkitemsAttributeChangeString defaultStatusId = null;
  private WorkitemsAttributeChangeString defaultLanguageId = null;
  private WorkitemsAttributeChangeInteger defaultTtlSeconds = null;
  private WorkitemsAttributeChangeBoolean assignmentEnabled = null;
  private WorkitemsAttributeChangeString defaultQueueId = null;
  private WorkitemsAttributeChangeString schemaId = null;
  private WorkitemsAttributeChangeString schemaVersion = null;
  private WorkitemsAttributeChangeInteger serviceLevelTarget = null;
  private WorkitemsAttributeChangeInstant dateModified = null;
  private WorkitemsAttributeChangeString modifiedBy = null;
  private WorkitemsAttributeChangeString defaultScriptId = null;

  public WorktypeDelta() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WorktypeDelta name(WorkitemsAttributeChangeString name) {
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
  public WorktypeDelta description(WorkitemsAttributeChangeString description) {
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
  public WorktypeDelta statuses(WorkitemsAttributeChangeList statuses) {
    this.statuses = statuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statuses")
  public WorkitemsAttributeChangeList getStatuses() {
    return statuses;
  }
  public void setStatuses(WorkitemsAttributeChangeList statuses) {
    this.statuses = statuses;
  }


  /**
   **/
  public WorktypeDelta defaultWorkbinId(WorkitemsAttributeChangeString defaultWorkbinId) {
    this.defaultWorkbinId = defaultWorkbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultWorkbinId")
  public WorkitemsAttributeChangeString getDefaultWorkbinId() {
    return defaultWorkbinId;
  }
  public void setDefaultWorkbinId(WorkitemsAttributeChangeString defaultWorkbinId) {
    this.defaultWorkbinId = defaultWorkbinId;
  }


  /**
   **/
  public WorktypeDelta defaultDurationSeconds(WorkitemsAttributeChangeInteger defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultDurationSeconds")
  public WorkitemsAttributeChangeInteger getDefaultDurationSeconds() {
    return defaultDurationSeconds;
  }
  public void setDefaultDurationSeconds(WorkitemsAttributeChangeInteger defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
  }


  /**
   **/
  public WorktypeDelta defaultExpirationSeconds(WorkitemsAttributeChangeInteger defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultExpirationSeconds")
  public WorkitemsAttributeChangeInteger getDefaultExpirationSeconds() {
    return defaultExpirationSeconds;
  }
  public void setDefaultExpirationSeconds(WorkitemsAttributeChangeInteger defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
  }


  /**
   **/
  public WorktypeDelta defaultDueDurationSeconds(WorkitemsAttributeChangeInteger defaultDueDurationSeconds) {
    this.defaultDueDurationSeconds = defaultDueDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultDueDurationSeconds")
  public WorkitemsAttributeChangeInteger getDefaultDueDurationSeconds() {
    return defaultDueDurationSeconds;
  }
  public void setDefaultDueDurationSeconds(WorkitemsAttributeChangeInteger defaultDueDurationSeconds) {
    this.defaultDueDurationSeconds = defaultDueDurationSeconds;
  }


  /**
   **/
  public WorktypeDelta defaultPriority(WorkitemsAttributeChangeInteger defaultPriority) {
    this.defaultPriority = defaultPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultPriority")
  public WorkitemsAttributeChangeInteger getDefaultPriority() {
    return defaultPriority;
  }
  public void setDefaultPriority(WorkitemsAttributeChangeInteger defaultPriority) {
    this.defaultPriority = defaultPriority;
  }


  /**
   **/
  public WorktypeDelta defaultSkillIds(WorkitemsAttributeChangeList defaultSkillIds) {
    this.defaultSkillIds = defaultSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultSkillIds")
  public WorkitemsAttributeChangeList getDefaultSkillIds() {
    return defaultSkillIds;
  }
  public void setDefaultSkillIds(WorkitemsAttributeChangeList defaultSkillIds) {
    this.defaultSkillIds = defaultSkillIds;
  }


  /**
   **/
  public WorktypeDelta defaultStatusId(WorkitemsAttributeChangeString defaultStatusId) {
    this.defaultStatusId = defaultStatusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultStatusId")
  public WorkitemsAttributeChangeString getDefaultStatusId() {
    return defaultStatusId;
  }
  public void setDefaultStatusId(WorkitemsAttributeChangeString defaultStatusId) {
    this.defaultStatusId = defaultStatusId;
  }


  /**
   **/
  public WorktypeDelta defaultLanguageId(WorkitemsAttributeChangeString defaultLanguageId) {
    this.defaultLanguageId = defaultLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultLanguageId")
  public WorkitemsAttributeChangeString getDefaultLanguageId() {
    return defaultLanguageId;
  }
  public void setDefaultLanguageId(WorkitemsAttributeChangeString defaultLanguageId) {
    this.defaultLanguageId = defaultLanguageId;
  }


  /**
   **/
  public WorktypeDelta defaultTtlSeconds(WorkitemsAttributeChangeInteger defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultTtlSeconds")
  public WorkitemsAttributeChangeInteger getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(WorkitemsAttributeChangeInteger defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   **/
  public WorktypeDelta assignmentEnabled(WorkitemsAttributeChangeBoolean assignmentEnabled) {
    this.assignmentEnabled = assignmentEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentEnabled")
  public WorkitemsAttributeChangeBoolean getAssignmentEnabled() {
    return assignmentEnabled;
  }
  public void setAssignmentEnabled(WorkitemsAttributeChangeBoolean assignmentEnabled) {
    this.assignmentEnabled = assignmentEnabled;
  }


  /**
   **/
  public WorktypeDelta defaultQueueId(WorkitemsAttributeChangeString defaultQueueId) {
    this.defaultQueueId = defaultQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultQueueId")
  public WorkitemsAttributeChangeString getDefaultQueueId() {
    return defaultQueueId;
  }
  public void setDefaultQueueId(WorkitemsAttributeChangeString defaultQueueId) {
    this.defaultQueueId = defaultQueueId;
  }


  /**
   **/
  public WorktypeDelta schemaId(WorkitemsAttributeChangeString schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaId")
  public WorkitemsAttributeChangeString getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(WorkitemsAttributeChangeString schemaId) {
    this.schemaId = schemaId;
  }


  /**
   **/
  public WorktypeDelta schemaVersion(WorkitemsAttributeChangeString schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaVersion")
  public WorkitemsAttributeChangeString getSchemaVersion() {
    return schemaVersion;
  }
  public void setSchemaVersion(WorkitemsAttributeChangeString schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  /**
   **/
  public WorktypeDelta serviceLevelTarget(WorkitemsAttributeChangeInteger serviceLevelTarget) {
    this.serviceLevelTarget = serviceLevelTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceLevelTarget")
  public WorkitemsAttributeChangeInteger getServiceLevelTarget() {
    return serviceLevelTarget;
  }
  public void setServiceLevelTarget(WorkitemsAttributeChangeInteger serviceLevelTarget) {
    this.serviceLevelTarget = serviceLevelTarget;
  }


  /**
   **/
  public WorktypeDelta dateModified(WorkitemsAttributeChangeInstant dateModified) {
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
  public WorktypeDelta modifiedBy(WorkitemsAttributeChangeString modifiedBy) {
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
  public WorktypeDelta defaultScriptId(WorkitemsAttributeChangeString defaultScriptId) {
    this.defaultScriptId = defaultScriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultScriptId")
  public WorkitemsAttributeChangeString getDefaultScriptId() {
    return defaultScriptId;
  }
  public void setDefaultScriptId(WorkitemsAttributeChangeString defaultScriptId) {
    this.defaultScriptId = defaultScriptId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorktypeDelta worktypeDelta = (WorktypeDelta) o;

    return Objects.equals(this.name, worktypeDelta.name) &&
            Objects.equals(this.description, worktypeDelta.description) &&
            Objects.equals(this.statuses, worktypeDelta.statuses) &&
            Objects.equals(this.defaultWorkbinId, worktypeDelta.defaultWorkbinId) &&
            Objects.equals(this.defaultDurationSeconds, worktypeDelta.defaultDurationSeconds) &&
            Objects.equals(this.defaultExpirationSeconds, worktypeDelta.defaultExpirationSeconds) &&
            Objects.equals(this.defaultDueDurationSeconds, worktypeDelta.defaultDueDurationSeconds) &&
            Objects.equals(this.defaultPriority, worktypeDelta.defaultPriority) &&
            Objects.equals(this.defaultSkillIds, worktypeDelta.defaultSkillIds) &&
            Objects.equals(this.defaultStatusId, worktypeDelta.defaultStatusId) &&
            Objects.equals(this.defaultLanguageId, worktypeDelta.defaultLanguageId) &&
            Objects.equals(this.defaultTtlSeconds, worktypeDelta.defaultTtlSeconds) &&
            Objects.equals(this.assignmentEnabled, worktypeDelta.assignmentEnabled) &&
            Objects.equals(this.defaultQueueId, worktypeDelta.defaultQueueId) &&
            Objects.equals(this.schemaId, worktypeDelta.schemaId) &&
            Objects.equals(this.schemaVersion, worktypeDelta.schemaVersion) &&
            Objects.equals(this.serviceLevelTarget, worktypeDelta.serviceLevelTarget) &&
            Objects.equals(this.dateModified, worktypeDelta.dateModified) &&
            Objects.equals(this.modifiedBy, worktypeDelta.modifiedBy) &&
            Objects.equals(this.defaultScriptId, worktypeDelta.defaultScriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, statuses, defaultWorkbinId, defaultDurationSeconds, defaultExpirationSeconds, defaultDueDurationSeconds, defaultPriority, defaultSkillIds, defaultStatusId, defaultLanguageId, defaultTtlSeconds, assignmentEnabled, defaultQueueId, schemaId, schemaVersion, serviceLevelTarget, dateModified, modifiedBy, defaultScriptId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorktypeDelta {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    defaultWorkbinId: ").append(toIndentedString(defaultWorkbinId)).append("\n");
    sb.append("    defaultDurationSeconds: ").append(toIndentedString(defaultDurationSeconds)).append("\n");
    sb.append("    defaultExpirationSeconds: ").append(toIndentedString(defaultExpirationSeconds)).append("\n");
    sb.append("    defaultDueDurationSeconds: ").append(toIndentedString(defaultDueDurationSeconds)).append("\n");
    sb.append("    defaultPriority: ").append(toIndentedString(defaultPriority)).append("\n");
    sb.append("    defaultSkillIds: ").append(toIndentedString(defaultSkillIds)).append("\n");
    sb.append("    defaultStatusId: ").append(toIndentedString(defaultStatusId)).append("\n");
    sb.append("    defaultLanguageId: ").append(toIndentedString(defaultLanguageId)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    assignmentEnabled: ").append(toIndentedString(assignmentEnabled)).append("\n");
    sb.append("    defaultQueueId: ").append(toIndentedString(defaultQueueId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    serviceLevelTarget: ").append(toIndentedString(serviceLevelTarget)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    defaultScriptId: ").append(toIndentedString(defaultScriptId)).append("\n");
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

