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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorktypeCreate
 */

public class WorktypeCreate  implements Serializable {
  
  private String name = null;
  private String defaultWorkbinId = null;
  private Integer defaultDurationSeconds = null;
  private Integer defaultExpirationSeconds = null;
  private Integer defaultDueDurationSeconds = null;
  private Integer defaultPriority = null;
  private Integer defaultTtlSeconds = null;
  private Boolean assignmentEnabled = null;
  private String schemaId = null;
  private Integer serviceLevelTarget = null;
  private String description = null;
  private String divisionId = null;
  private Boolean disableDefaultStatusCreation = null;
  private Integer schemaVersion = null;
  private String defaultQueueId = null;
  private String defaultLanguageId = null;
  private List<String> defaultSkillIds = new ArrayList<String>();

  
  /**
   * The name of the Worktype. Valid length between 3 and 256 characters.
   **/
  public WorktypeCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Worktype. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The ID of the default Workbin for Workitems created from the Worktype.
   **/
  public WorktypeCreate defaultWorkbinId(String defaultWorkbinId) {
    this.defaultWorkbinId = defaultWorkbinId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the default Workbin for Workitems created from the Worktype.")
  @JsonProperty("defaultWorkbinId")
  public String getDefaultWorkbinId() {
    return defaultWorkbinId;
  }
  public void setDefaultWorkbinId(String defaultWorkbinId) {
    this.defaultWorkbinId = defaultWorkbinId;
  }


  /**
   * The default duration in seconds for Workitems created from the Worktype. Maximum of 365 days.
   **/
  public WorktypeCreate defaultDurationSeconds(Integer defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default duration in seconds for Workitems created from the Worktype. Maximum of 365 days.")
  @JsonProperty("defaultDurationSeconds")
  public Integer getDefaultDurationSeconds() {
    return defaultDurationSeconds;
  }
  public void setDefaultDurationSeconds(Integer defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
  }


  /**
   * The default expiration time in seconds for Workitems created from the Worktype. Maximum of 365 days.
   **/
  public WorktypeCreate defaultExpirationSeconds(Integer defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default expiration time in seconds for Workitems created from the Worktype. Maximum of 365 days.")
  @JsonProperty("defaultExpirationSeconds")
  public Integer getDefaultExpirationSeconds() {
    return defaultExpirationSeconds;
  }
  public void setDefaultExpirationSeconds(Integer defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
  }


  /**
   * The default due duration in seconds for Workitems created from the Worktype. Maximum of 365 days.
   **/
  public WorktypeCreate defaultDueDurationSeconds(Integer defaultDueDurationSeconds) {
    this.defaultDueDurationSeconds = defaultDueDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default due duration in seconds for Workitems created from the Worktype. Maximum of 365 days.")
  @JsonProperty("defaultDueDurationSeconds")
  public Integer getDefaultDueDurationSeconds() {
    return defaultDueDurationSeconds;
  }
  public void setDefaultDueDurationSeconds(Integer defaultDueDurationSeconds) {
    this.defaultDueDurationSeconds = defaultDueDurationSeconds;
  }


  /**
   * The default priority for Workitems created from the Worktype. The valid range is between -25,000,000 and 25,000,000.
   **/
  public WorktypeCreate defaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default priority for Workitems created from the Worktype. The valid range is between -25,000,000 and 25,000,000.")
  @JsonProperty("defaultPriority")
  public Integer getDefaultPriority() {
    return defaultPriority;
  }
  public void setDefaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
  }


  /**
   * The default time to time to live in seconds for Workitems created from the Worktype. The valid range is between 1 and 365 days.
   **/
  public WorktypeCreate defaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default time to time to live in seconds for Workitems created from the Worktype. The valid range is between 1 and 365 days.")
  @JsonProperty("defaultTtlSeconds")
  public Integer getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   * When set to true, Workitems will be sent to the queue of the Worktype as they are created. Default value is false.
   **/
  public WorktypeCreate assignmentEnabled(Boolean assignmentEnabled) {
    this.assignmentEnabled = assignmentEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to true, Workitems will be sent to the queue of the Worktype as they are created. Default value is false.")
  @JsonProperty("assignmentEnabled")
  public Boolean getAssignmentEnabled() {
    return assignmentEnabled;
  }
  public void setAssignmentEnabled(Boolean assignmentEnabled) {
    this.assignmentEnabled = assignmentEnabled;
  }


  /**
   * The ID of the custom attribute schema for Workitems created from the Worktype. Must be a valid UUID.
   **/
  public WorktypeCreate schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the custom attribute schema for Workitems created from the Worktype. Must be a valid UUID.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The target service level for Workitems created from the Worktype. The default value is 100.
   * minimum: 1
   * maximum: 100
   **/
  public WorktypeCreate serviceLevelTarget(Integer serviceLevelTarget) {
    this.serviceLevelTarget = serviceLevelTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target service level for Workitems created from the Worktype. The default value is 100.")
  @JsonProperty("serviceLevelTarget")
  public Integer getServiceLevelTarget() {
    return serviceLevelTarget;
  }
  public void setServiceLevelTarget(Integer serviceLevelTarget) {
    this.serviceLevelTarget = serviceLevelTarget;
  }


  /**
   * The description of the Worktype. Maximum length of 512 characters.
   **/
  public WorktypeCreate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Worktype. Maximum length of 512 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the division the Worktype belongs to. Defaults to the default Workbin division ID. The Worktype must be in the same division as its default Workbin.
   **/
  public WorktypeCreate divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the division the Worktype belongs to. Defaults to the default Workbin division ID. The Worktype must be in the same division as its default Workbin.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * Set to true to disable default status creation. Default statuses are created with the Worktype by default
   **/
  public WorktypeCreate disableDefaultStatusCreation(Boolean disableDefaultStatusCreation) {
    this.disableDefaultStatusCreation = disableDefaultStatusCreation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to true to disable default status creation. Default statuses are created with the Worktype by default")
  @JsonProperty("disableDefaultStatusCreation")
  public Boolean getDisableDefaultStatusCreation() {
    return disableDefaultStatusCreation;
  }
  public void setDisableDefaultStatusCreation(Boolean disableDefaultStatusCreation) {
    this.disableDefaultStatusCreation = disableDefaultStatusCreation;
  }


  /**
   * The version of the Worktypes custom attribute schema. The latest schema version will be used if this property is not set.
   **/
  public WorktypeCreate schemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the Worktypes custom attribute schema. The latest schema version will be used if this property is not set.")
  @JsonProperty("schemaVersion")
  public Integer getSchemaVersion() {
    return schemaVersion;
  }
  public void setSchemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  /**
   * The ID of the default queue for Workitems created from the Worktype. Must be a valid UUID.
   **/
  public WorktypeCreate defaultQueueId(String defaultQueueId) {
    this.defaultQueueId = defaultQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the default queue for Workitems created from the Worktype. Must be a valid UUID.")
  @JsonProperty("defaultQueueId")
  public String getDefaultQueueId() {
    return defaultQueueId;
  }
  public void setDefaultQueueId(String defaultQueueId) {
    this.defaultQueueId = defaultQueueId;
  }


  /**
   * The ID of the default language for Workitems created from the Worktype. Must be a valid UUID.
   **/
  public WorktypeCreate defaultLanguageId(String defaultLanguageId) {
    this.defaultLanguageId = defaultLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the default language for Workitems created from the Worktype. Must be a valid UUID.")
  @JsonProperty("defaultLanguageId")
  public String getDefaultLanguageId() {
    return defaultLanguageId;
  }
  public void setDefaultLanguageId(String defaultLanguageId) {
    this.defaultLanguageId = defaultLanguageId;
  }


  /**
   * The IDs of the default skills for Workitems created from the Worktype. Must be valid UUIDs. Maximum of 20 IDs
   **/
  public WorktypeCreate defaultSkillIds(List<String> defaultSkillIds) {
    this.defaultSkillIds = defaultSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the default skills for Workitems created from the Worktype. Must be valid UUIDs. Maximum of 20 IDs")
  @JsonProperty("defaultSkillIds")
  public List<String> getDefaultSkillIds() {
    return defaultSkillIds;
  }
  public void setDefaultSkillIds(List<String> defaultSkillIds) {
    this.defaultSkillIds = defaultSkillIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorktypeCreate worktypeCreate = (WorktypeCreate) o;

    return Objects.equals(this.name, worktypeCreate.name) &&
            Objects.equals(this.defaultWorkbinId, worktypeCreate.defaultWorkbinId) &&
            Objects.equals(this.defaultDurationSeconds, worktypeCreate.defaultDurationSeconds) &&
            Objects.equals(this.defaultExpirationSeconds, worktypeCreate.defaultExpirationSeconds) &&
            Objects.equals(this.defaultDueDurationSeconds, worktypeCreate.defaultDueDurationSeconds) &&
            Objects.equals(this.defaultPriority, worktypeCreate.defaultPriority) &&
            Objects.equals(this.defaultTtlSeconds, worktypeCreate.defaultTtlSeconds) &&
            Objects.equals(this.assignmentEnabled, worktypeCreate.assignmentEnabled) &&
            Objects.equals(this.schemaId, worktypeCreate.schemaId) &&
            Objects.equals(this.serviceLevelTarget, worktypeCreate.serviceLevelTarget) &&
            Objects.equals(this.description, worktypeCreate.description) &&
            Objects.equals(this.divisionId, worktypeCreate.divisionId) &&
            Objects.equals(this.disableDefaultStatusCreation, worktypeCreate.disableDefaultStatusCreation) &&
            Objects.equals(this.schemaVersion, worktypeCreate.schemaVersion) &&
            Objects.equals(this.defaultQueueId, worktypeCreate.defaultQueueId) &&
            Objects.equals(this.defaultLanguageId, worktypeCreate.defaultLanguageId) &&
            Objects.equals(this.defaultSkillIds, worktypeCreate.defaultSkillIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultWorkbinId, defaultDurationSeconds, defaultExpirationSeconds, defaultDueDurationSeconds, defaultPriority, defaultTtlSeconds, assignmentEnabled, schemaId, serviceLevelTarget, description, divisionId, disableDefaultStatusCreation, schemaVersion, defaultQueueId, defaultLanguageId, defaultSkillIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorktypeCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultWorkbinId: ").append(toIndentedString(defaultWorkbinId)).append("\n");
    sb.append("    defaultDurationSeconds: ").append(toIndentedString(defaultDurationSeconds)).append("\n");
    sb.append("    defaultExpirationSeconds: ").append(toIndentedString(defaultExpirationSeconds)).append("\n");
    sb.append("    defaultDueDurationSeconds: ").append(toIndentedString(defaultDueDurationSeconds)).append("\n");
    sb.append("    defaultPriority: ").append(toIndentedString(defaultPriority)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    assignmentEnabled: ").append(toIndentedString(assignmentEnabled)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    serviceLevelTarget: ").append(toIndentedString(serviceLevelTarget)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    disableDefaultStatusCreation: ").append(toIndentedString(disableDefaultStatusCreation)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    defaultQueueId: ").append(toIndentedString(defaultQueueId)).append("\n");
    sb.append("    defaultLanguageId: ").append(toIndentedString(defaultLanguageId)).append("\n");
    sb.append("    defaultSkillIds: ").append(toIndentedString(defaultSkillIds)).append("\n");
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

