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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.RoutingSkillReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkbinReference;
import com.mypurecloud.sdk.v2.model.WorkitemFlowReference;
import com.mypurecloud.sdk.v2.model.WorkitemQueueReference;
import com.mypurecloud.sdk.v2.model.WorkitemRuleSettings;
import com.mypurecloud.sdk.v2.model.WorkitemSchema;
import com.mypurecloud.sdk.v2.model.WorkitemScriptReference;
import com.mypurecloud.sdk.v2.model.WorkitemStatus;
import com.mypurecloud.sdk.v2.model.WorkitemStatusReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WorktypeVersion
 */

public class WorktypeVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private String description = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private WorkbinReference defaultWorkbin = null;
  private WorkitemStatusReference defaultStatus = null;
  private List<WorkitemStatus> statuses = null;
  private Integer defaultDurationSeconds = null;
  private Integer defaultExpirationSeconds = null;
  private Integer defaultDueDurationSeconds = null;
  private Integer defaultPriority = null;
  private LanguageReference defaultLanguage = null;
  private Integer defaultTtlSeconds = null;
  private UserReference modifiedBy = null;
  private WorkitemQueueReference defaultQueue = null;
  private List<RoutingSkillReference> defaultSkills = null;
  private Boolean assignmentEnabled = null;
  private WorkitemSchema schema = null;
  private Integer serviceLevelTarget = null;
  private WorkitemRuleSettings ruleSettings = null;
  private WorkitemFlowReference flow = null;
  private WorkitemScriptReference defaultScript = null;
  private Boolean unassignedDivisionContactsEnabled = null;
  private Integer version = null;
  private String selfUri = null;

  public WorktypeVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      statuses = new ArrayList<WorkitemStatus>();
      defaultSkills = new ArrayList<RoutingSkillReference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Worktype.
   **/
  public WorktypeVersion name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Worktype.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The division to which this entity belongs.
   **/
  public WorktypeVersion division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  /**
   * The description of the Worktype.
   **/
  public WorktypeVersion description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Worktype.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The creation date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorktypeVersion dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The modified date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorktypeVersion dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modified date of the Worktype. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The default Workbin for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultWorkbin(WorkbinReference defaultWorkbin) {
    this.defaultWorkbin = defaultWorkbin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default Workbin for Workitems created from the Worktype.")
  @JsonProperty("defaultWorkbin")
  public WorkbinReference getDefaultWorkbin() {
    return defaultWorkbin;
  }
  public void setDefaultWorkbin(WorkbinReference defaultWorkbin) {
    this.defaultWorkbin = defaultWorkbin;
  }


  /**
   * The default status for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultStatus(WorkitemStatusReference defaultStatus) {
    this.defaultStatus = defaultStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default status for Workitems created from the Worktype.")
  @JsonProperty("defaultStatus")
  public WorkitemStatusReference getDefaultStatus() {
    return defaultStatus;
  }
  public void setDefaultStatus(WorkitemStatusReference defaultStatus) {
    this.defaultStatus = defaultStatus;
  }


  /**
   * The list of possible statuses for Workitems created from the Worktype.
   **/
  public WorktypeVersion statuses(List<WorkitemStatus> statuses) {
    this.statuses = statuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of possible statuses for Workitems created from the Worktype.")
  @JsonProperty("statuses")
  public List<WorkitemStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<WorkitemStatus> statuses) {
    this.statuses = statuses;
  }


  /**
   * The default duration in seconds for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultDurationSeconds(Integer defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default duration in seconds for Workitems created from the Worktype.")
  @JsonProperty("defaultDurationSeconds")
  public Integer getDefaultDurationSeconds() {
    return defaultDurationSeconds;
  }
  public void setDefaultDurationSeconds(Integer defaultDurationSeconds) {
    this.defaultDurationSeconds = defaultDurationSeconds;
  }


  /**
   * The default expiration time in seconds for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultExpirationSeconds(Integer defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default expiration time in seconds for Workitems created from the Worktype.")
  @JsonProperty("defaultExpirationSeconds")
  public Integer getDefaultExpirationSeconds() {
    return defaultExpirationSeconds;
  }
  public void setDefaultExpirationSeconds(Integer defaultExpirationSeconds) {
    this.defaultExpirationSeconds = defaultExpirationSeconds;
  }


  /**
   * The default due duration in seconds for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultDueDurationSeconds(Integer defaultDueDurationSeconds) {
    this.defaultDueDurationSeconds = defaultDueDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default due duration in seconds for Workitems created from the Worktype.")
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
  public WorktypeVersion defaultPriority(Integer defaultPriority) {
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
   * The default language for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultLanguage(LanguageReference defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default language for Workitems created from the Worktype.")
  @JsonProperty("defaultLanguage")
  public LanguageReference getDefaultLanguage() {
    return defaultLanguage;
  }
  public void setDefaultLanguage(LanguageReference defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }


  /**
   * The default time to time to live in seconds for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default time to time to live in seconds for Workitems created from the Worktype.")
  @JsonProperty("defaultTtlSeconds")
  public Integer getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   * The id of the User who modified the Worktype.
   **/
  public WorktypeVersion modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the User who modified the Worktype.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The default queue for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultQueue(WorkitemQueueReference defaultQueue) {
    this.defaultQueue = defaultQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default queue for Workitems created from the Worktype.")
  @JsonProperty("defaultQueue")
  public WorkitemQueueReference getDefaultQueue() {
    return defaultQueue;
  }
  public void setDefaultQueue(WorkitemQueueReference defaultQueue) {
    this.defaultQueue = defaultQueue;
  }


  /**
   * The default skills for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultSkills(List<RoutingSkillReference> defaultSkills) {
    this.defaultSkills = defaultSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default skills for Workitems created from the Worktype.")
  @JsonProperty("defaultSkills")
  public List<RoutingSkillReference> getDefaultSkills() {
    return defaultSkills;
  }
  public void setDefaultSkills(List<RoutingSkillReference> defaultSkills) {
    this.defaultSkills = defaultSkills;
  }


  /**
   * When set to true, Workitems will be sent to the queue of the Worktype as they are created. Default value is false.
   **/
  public WorktypeVersion assignmentEnabled(Boolean assignmentEnabled) {
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
   * The schema defining the custom attributes for Workitems created from the Worktype.
   **/
  public WorktypeVersion schema(WorkitemSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema defining the custom attributes for Workitems created from the Worktype.")
  @JsonProperty("schema")
  public WorkitemSchema getSchema() {
    return schema;
  }
  public void setSchema(WorkitemSchema schema) {
    this.schema = schema;
  }


  /**
   * The target service level for Workitems created from the Worktype. The default value is 100.
   **/
  public WorktypeVersion serviceLevelTarget(Integer serviceLevelTarget) {
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
   * Settings for the worktypes rules.
   **/
  public WorktypeVersion ruleSettings(WorkitemRuleSettings ruleSettings) {
    this.ruleSettings = ruleSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for the worktypes rules.")
  @JsonProperty("ruleSettings")
  public WorkitemRuleSettings getRuleSettings() {
    return ruleSettings;
  }
  public void setRuleSettings(WorkitemRuleSettings ruleSettings) {
    this.ruleSettings = ruleSettings;
  }


  /**
   * The flow associated with the Worktype.
   **/
  public WorktypeVersion flow(WorkitemFlowReference flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow associated with the Worktype.")
  @JsonProperty("flow")
  public WorkitemFlowReference getFlow() {
    return flow;
  }
  public void setFlow(WorkitemFlowReference flow) {
    this.flow = flow;
  }


  /**
   * The default script for Workitems created from the Worktype.
   **/
  public WorktypeVersion defaultScript(WorkitemScriptReference defaultScript) {
    this.defaultScript = defaultScript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default script for Workitems created from the Worktype.")
  @JsonProperty("defaultScript")
  public WorkitemScriptReference getDefaultScript() {
    return defaultScript;
  }
  public void setDefaultScript(WorkitemScriptReference defaultScript) {
    this.defaultScript = defaultScript;
  }


  /**
   * When set to true, will allow Workitems to be associated with External Contacts that are not assigned to any division. Default value is true.
   **/
  public WorktypeVersion unassignedDivisionContactsEnabled(Boolean unassignedDivisionContactsEnabled) {
    this.unassignedDivisionContactsEnabled = unassignedDivisionContactsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to true, will allow Workitems to be associated with External Contacts that are not assigned to any division. Default value is true.")
  @JsonProperty("unassignedDivisionContactsEnabled")
  public Boolean getUnassignedDivisionContactsEnabled() {
    return unassignedDivisionContactsEnabled;
  }
  public void setUnassignedDivisionContactsEnabled(Boolean unassignedDivisionContactsEnabled) {
    this.unassignedDivisionContactsEnabled = unassignedDivisionContactsEnabled;
  }


  /**
   * Version
   **/
  public WorktypeVersion version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    WorktypeVersion worktypeVersion = (WorktypeVersion) o;

    return Objects.equals(this.id, worktypeVersion.id) &&
            Objects.equals(this.name, worktypeVersion.name) &&
            Objects.equals(this.division, worktypeVersion.division) &&
            Objects.equals(this.description, worktypeVersion.description) &&
            Objects.equals(this.dateCreated, worktypeVersion.dateCreated) &&
            Objects.equals(this.dateModified, worktypeVersion.dateModified) &&
            Objects.equals(this.defaultWorkbin, worktypeVersion.defaultWorkbin) &&
            Objects.equals(this.defaultStatus, worktypeVersion.defaultStatus) &&
            Objects.equals(this.statuses, worktypeVersion.statuses) &&
            Objects.equals(this.defaultDurationSeconds, worktypeVersion.defaultDurationSeconds) &&
            Objects.equals(this.defaultExpirationSeconds, worktypeVersion.defaultExpirationSeconds) &&
            Objects.equals(this.defaultDueDurationSeconds, worktypeVersion.defaultDueDurationSeconds) &&
            Objects.equals(this.defaultPriority, worktypeVersion.defaultPriority) &&
            Objects.equals(this.defaultLanguage, worktypeVersion.defaultLanguage) &&
            Objects.equals(this.defaultTtlSeconds, worktypeVersion.defaultTtlSeconds) &&
            Objects.equals(this.modifiedBy, worktypeVersion.modifiedBy) &&
            Objects.equals(this.defaultQueue, worktypeVersion.defaultQueue) &&
            Objects.equals(this.defaultSkills, worktypeVersion.defaultSkills) &&
            Objects.equals(this.assignmentEnabled, worktypeVersion.assignmentEnabled) &&
            Objects.equals(this.schema, worktypeVersion.schema) &&
            Objects.equals(this.serviceLevelTarget, worktypeVersion.serviceLevelTarget) &&
            Objects.equals(this.ruleSettings, worktypeVersion.ruleSettings) &&
            Objects.equals(this.flow, worktypeVersion.flow) &&
            Objects.equals(this.defaultScript, worktypeVersion.defaultScript) &&
            Objects.equals(this.unassignedDivisionContactsEnabled, worktypeVersion.unassignedDivisionContactsEnabled) &&
            Objects.equals(this.version, worktypeVersion.version) &&
            Objects.equals(this.selfUri, worktypeVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, dateCreated, dateModified, defaultWorkbin, defaultStatus, statuses, defaultDurationSeconds, defaultExpirationSeconds, defaultDueDurationSeconds, defaultPriority, defaultLanguage, defaultTtlSeconds, modifiedBy, defaultQueue, defaultSkills, assignmentEnabled, schema, serviceLevelTarget, ruleSettings, flow, defaultScript, unassignedDivisionContactsEnabled, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorktypeVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    defaultWorkbin: ").append(toIndentedString(defaultWorkbin)).append("\n");
    sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    defaultDurationSeconds: ").append(toIndentedString(defaultDurationSeconds)).append("\n");
    sb.append("    defaultExpirationSeconds: ").append(toIndentedString(defaultExpirationSeconds)).append("\n");
    sb.append("    defaultDueDurationSeconds: ").append(toIndentedString(defaultDueDurationSeconds)).append("\n");
    sb.append("    defaultPriority: ").append(toIndentedString(defaultPriority)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    defaultQueue: ").append(toIndentedString(defaultQueue)).append("\n");
    sb.append("    defaultSkills: ").append(toIndentedString(defaultSkills)).append("\n");
    sb.append("    assignmentEnabled: ").append(toIndentedString(assignmentEnabled)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    serviceLevelTarget: ").append(toIndentedString(serviceLevelTarget)).append("\n");
    sb.append("    ruleSettings: ").append(toIndentedString(ruleSettings)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    defaultScript: ").append(toIndentedString(defaultScript)).append("\n");
    sb.append("    unassignedDivisionContactsEnabled: ").append(toIndentedString(unassignedDivisionContactsEnabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

