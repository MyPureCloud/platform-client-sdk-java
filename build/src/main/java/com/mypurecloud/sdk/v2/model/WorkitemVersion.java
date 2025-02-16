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
import com.mypurecloud.sdk.v2.model.AutoStatusTransitionDetail;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.ExternalContactReference;
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.RoutingSkillReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.UserReferenceWithName;
import com.mypurecloud.sdk.v2.model.WorkbinReference;
import com.mypurecloud.sdk.v2.model.WorkitemQueueReference;
import com.mypurecloud.sdk.v2.model.WorkitemSchema;
import com.mypurecloud.sdk.v2.model.WorkitemScoredAgent;
import com.mypurecloud.sdk.v2.model.WorkitemScriptReference;
import com.mypurecloud.sdk.v2.model.WorkitemStatusReference;
import com.mypurecloud.sdk.v2.model.WorkitemUtilizationLabelReference;
import com.mypurecloud.sdk.v2.model.WorktypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WorkitemVersion
 */

public class WorkitemVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private WorktypeReference type = null;
  private String description = null;
  private LanguageReference language = null;
  private WorkitemUtilizationLabelReference utilizationLabel = null;
  private Integer priority = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateDue = null;
  private Date dateExpires = null;
  private Integer durationSeconds = null;
  private Integer ttl = null;
  private WorkitemStatusReference status = null;

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
   * The Category of the current Status of the Workitem.
   */
 @JsonDeserialize(using = StatusCategoryEnumDeserializer.class)
  public enum StatusCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

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
  private Date dateStatusChanged = null;
  private Date dateClosed = null;
  private WorkbinReference workbin = null;
  private UserReferenceWithName reporter = null;
  private UserReferenceWithName assignee = null;
  private ExternalContactReference externalContact = null;
  private String externalTag = null;
  private UserReference modifiedBy = null;
  private WorkitemQueueReference queue = null;

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
   * The assignment state of the workitem.
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
  private Date dateAssignmentStateChanged = null;
  private Integer alertTimeoutSeconds = null;
  private List<RoutingSkillReference> skills = new ArrayList<RoutingSkillReference>();
  private List<UserReference> preferredAgents = new ArrayList<UserReference>();
  private Boolean autoStatusTransition = null;
  private WorkitemSchema schema = null;
  private Map<String, Object> customFields = null;
  private AutoStatusTransitionDetail autoStatusTransitionDetail = null;
  private List<WorkitemScoredAgent> scoredAgents = new ArrayList<WorkitemScoredAgent>();
  private WorkitemScriptReference script = null;
  private Integer version = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Workitem.
   **/
  public WorkitemVersion name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Workitem.")
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
  public WorkitemVersion division(Division division) {
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
   * The Worktype of the Workitem.
   **/
  public WorkitemVersion type(WorktypeReference type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Worktype of the Workitem.")
  @JsonProperty("type")
  public WorktypeReference getType() {
    return type;
  }
  public void setType(WorktypeReference type) {
    this.type = type;
  }


  /**
   * The description of the Workitem.
   **/
  public WorkitemVersion description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Workitem.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The language of the Workitem.
   **/
  public WorkitemVersion language(LanguageReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language of the Workitem.")
  @JsonProperty("language")
  public LanguageReference getLanguage() {
    return language;
  }
  public void setLanguage(LanguageReference language) {
    this.language = language;
  }


  /**
   * The utilization label of the Workitem.
   **/
  public WorkitemVersion utilizationLabel(WorkitemUtilizationLabelReference utilizationLabel) {
    this.utilizationLabel = utilizationLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The utilization label of the Workitem.")
  @JsonProperty("utilizationLabel")
  public WorkitemUtilizationLabelReference getUtilizationLabel() {
    return utilizationLabel;
  }
  public void setUtilizationLabel(WorkitemUtilizationLabelReference utilizationLabel) {
    this.utilizationLabel = utilizationLabel;
  }


  /**
   * The priority of the Workitem. The valid range is between -25,000,000 and 25,000,000.
   **/
  public WorkitemVersion priority(Integer priority) {
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
   * The creation date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The modified date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modified date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The due date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateDue(Date dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The due date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDue")
  public Date getDateDue() {
    return dateDue;
  }
  public void setDateDue(Date dateDue) {
    this.dateDue = dateDue;
  }


  /**
   * The expiry date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The expiry date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  /**
   * The estimated duration in seconds to complete the workitem.
   **/
  public WorkitemVersion durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The estimated duration in seconds to complete the workitem.")
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   * The time to live of the Workitem in seconds.
   **/
  public WorkitemVersion ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time to live of the Workitem in seconds.")
  @JsonProperty("ttl")
  public Integer getTtl() {
    return ttl;
  }
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  /**
   * The current Status of the Workitem.
   **/
  public WorkitemVersion status(WorkitemStatusReference status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current Status of the Workitem.")
  @JsonProperty("status")
  public WorkitemStatusReference getStatus() {
    return status;
  }
  public void setStatus(WorkitemStatusReference status) {
    this.status = status;
  }


  /**
   * The Category of the current Status of the Workitem.
   **/
  public WorkitemVersion statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Category of the current Status of the Workitem.")
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }
  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  /**
   * The State change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateStatusChanged(Date dateStatusChanged) {
    this.dateStatusChanged = dateStatusChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The State change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStatusChanged")
  public Date getDateStatusChanged() {
    return dateStatusChanged;
  }
  public void setDateStatusChanged(Date dateStatusChanged) {
    this.dateStatusChanged = dateStatusChanged;
  }


  /**
   * The date the Workitem was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the Workitem was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateClosed")
  public Date getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   * The Workbin that contains the Workitem.
   **/
  public WorkitemVersion workbin(WorkbinReference workbin) {
    this.workbin = workbin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Workbin that contains the Workitem.")
  @JsonProperty("workbin")
  public WorkbinReference getWorkbin() {
    return workbin;
  }
  public void setWorkbin(WorkbinReference workbin) {
    this.workbin = workbin;
  }


  /**
   * The reporter of the Workitem.
   **/
  public WorkitemVersion reporter(UserReferenceWithName reporter) {
    this.reporter = reporter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reporter of the Workitem.")
  @JsonProperty("reporter")
  public UserReferenceWithName getReporter() {
    return reporter;
  }
  public void setReporter(UserReferenceWithName reporter) {
    this.reporter = reporter;
  }


  /**
   * The assignee of the Workitem.
   **/
  public WorkitemVersion assignee(UserReferenceWithName assignee) {
    this.assignee = assignee;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignee of the Workitem.")
  @JsonProperty("assignee")
  public UserReferenceWithName getAssignee() {
    return assignee;
  }
  public void setAssignee(UserReferenceWithName assignee) {
    this.assignee = assignee;
  }


  /**
   * The external contact of the Workitem.
   **/
  public WorkitemVersion externalContact(ExternalContactReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external contact of the Workitem.")
  @JsonProperty("externalContact")
  public ExternalContactReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(ExternalContactReference externalContact) {
    this.externalContact = externalContact;
  }


  /**
   * The external tag of the Workitem.
   **/
  public WorkitemVersion externalTag(String externalTag) {
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
   * The User who modified the Workitem.
   **/
  public WorkitemVersion modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The User who modified the Workitem.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The Workitems queue.
   **/
  public WorkitemVersion queue(WorkitemQueueReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Workitems queue.")
  @JsonProperty("queue")
  public WorkitemQueueReference getQueue() {
    return queue;
  }
  public void setQueue(WorkitemQueueReference queue) {
    this.queue = queue;
  }


  /**
   * The assignment state of the workitem.
   **/
  public WorkitemVersion assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment state of the workitem.")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   * The assignment state change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemVersion dateAssignmentStateChanged(Date dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assignment state change date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssignmentStateChanged")
  public Date getDateAssignmentStateChanged() {
    return dateAssignmentStateChanged;
  }
  public void setDateAssignmentStateChanged(Date dateAssignmentStateChanged) {
    this.dateAssignmentStateChanged = dateAssignmentStateChanged;
  }


  /**
   * The duration in seconds before an alert will timeout.
   **/
  public WorkitemVersion alertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration in seconds before an alert will timeout.")
  @JsonProperty("alertTimeoutSeconds")
  public Integer getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }


  /**
   * The skills of the Workitem.
   **/
  public WorkitemVersion skills(List<RoutingSkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills of the Workitem.")
  @JsonProperty("skills")
  public List<RoutingSkillReference> getSkills() {
    return skills;
  }
  public void setSkills(List<RoutingSkillReference> skills) {
    this.skills = skills;
  }


  /**
   * The preferred agents of the Workitem.
   **/
  public WorkitemVersion preferredAgents(List<UserReference> preferredAgents) {
    this.preferredAgents = preferredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The preferred agents of the Workitem.")
  @JsonProperty("preferredAgents")
  public List<UserReference> getPreferredAgents() {
    return preferredAgents;
  }
  public void setPreferredAgents(List<UserReference> preferredAgents) {
    this.preferredAgents = preferredAgents;
  }


  /**
   * Set it to false to disable auto status transition. By default, it is enabled.
   **/
  public WorkitemVersion autoStatusTransition(Boolean autoStatusTransition) {
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
   * The schema defining the custom fields of the Workitem. The schema is inherited from the Workitems Worktype at creation time.
   **/
  public WorkitemVersion schema(WorkitemSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema defining the custom fields of the Workitem. The schema is inherited from the Workitems Worktype at creation time.")
  @JsonProperty("schema")
  public WorkitemSchema getSchema() {
    return schema;
  }
  public void setSchema(WorkitemSchema schema) {
    this.schema = schema;
  }


  /**
   * Custom fields defined in the schema referenced by the Workitem.
   **/
  public WorkitemVersion customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom fields defined in the schema referenced by the Workitem.")
  @JsonProperty("customFields")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  /**
   * Auto status transition details of Workitem.
   **/
  public WorkitemVersion autoStatusTransitionDetail(AutoStatusTransitionDetail autoStatusTransitionDetail) {
    this.autoStatusTransitionDetail = autoStatusTransitionDetail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto status transition details of Workitem.")
  @JsonProperty("autoStatusTransitionDetail")
  public AutoStatusTransitionDetail getAutoStatusTransitionDetail() {
    return autoStatusTransitionDetail;
  }
  public void setAutoStatusTransitionDetail(AutoStatusTransitionDetail autoStatusTransitionDetail) {
    this.autoStatusTransitionDetail = autoStatusTransitionDetail;
  }


  /**
   * A list of scored agents for the Workitem.
   **/
  public WorkitemVersion scoredAgents(List<WorkitemScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of scored agents for the Workitem.")
  @JsonProperty("scoredAgents")
  public List<WorkitemScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<WorkitemScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }


  /**
   * The script that will be executed for the Workitem.
   **/
  public WorkitemVersion script(WorkitemScriptReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The script that will be executed for the Workitem.")
  @JsonProperty("script")
  public WorkitemScriptReference getScript() {
    return script;
  }
  public void setScript(WorkitemScriptReference script) {
    this.script = script;
  }


  /**
   * Version
   **/
  public WorkitemVersion version(Integer version) {
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
    WorkitemVersion workitemVersion = (WorkitemVersion) o;

    return Objects.equals(this.id, workitemVersion.id) &&
            Objects.equals(this.name, workitemVersion.name) &&
            Objects.equals(this.division, workitemVersion.division) &&
            Objects.equals(this.type, workitemVersion.type) &&
            Objects.equals(this.description, workitemVersion.description) &&
            Objects.equals(this.language, workitemVersion.language) &&
            Objects.equals(this.utilizationLabel, workitemVersion.utilizationLabel) &&
            Objects.equals(this.priority, workitemVersion.priority) &&
            Objects.equals(this.dateCreated, workitemVersion.dateCreated) &&
            Objects.equals(this.dateModified, workitemVersion.dateModified) &&
            Objects.equals(this.dateDue, workitemVersion.dateDue) &&
            Objects.equals(this.dateExpires, workitemVersion.dateExpires) &&
            Objects.equals(this.durationSeconds, workitemVersion.durationSeconds) &&
            Objects.equals(this.ttl, workitemVersion.ttl) &&
            Objects.equals(this.status, workitemVersion.status) &&
            Objects.equals(this.statusCategory, workitemVersion.statusCategory) &&
            Objects.equals(this.dateStatusChanged, workitemVersion.dateStatusChanged) &&
            Objects.equals(this.dateClosed, workitemVersion.dateClosed) &&
            Objects.equals(this.workbin, workitemVersion.workbin) &&
            Objects.equals(this.reporter, workitemVersion.reporter) &&
            Objects.equals(this.assignee, workitemVersion.assignee) &&
            Objects.equals(this.externalContact, workitemVersion.externalContact) &&
            Objects.equals(this.externalTag, workitemVersion.externalTag) &&
            Objects.equals(this.modifiedBy, workitemVersion.modifiedBy) &&
            Objects.equals(this.queue, workitemVersion.queue) &&
            Objects.equals(this.assignmentState, workitemVersion.assignmentState) &&
            Objects.equals(this.dateAssignmentStateChanged, workitemVersion.dateAssignmentStateChanged) &&
            Objects.equals(this.alertTimeoutSeconds, workitemVersion.alertTimeoutSeconds) &&
            Objects.equals(this.skills, workitemVersion.skills) &&
            Objects.equals(this.preferredAgents, workitemVersion.preferredAgents) &&
            Objects.equals(this.autoStatusTransition, workitemVersion.autoStatusTransition) &&
            Objects.equals(this.schema, workitemVersion.schema) &&
            Objects.equals(this.customFields, workitemVersion.customFields) &&
            Objects.equals(this.autoStatusTransitionDetail, workitemVersion.autoStatusTransitionDetail) &&
            Objects.equals(this.scoredAgents, workitemVersion.scoredAgents) &&
            Objects.equals(this.script, workitemVersion.script) &&
            Objects.equals(this.version, workitemVersion.version) &&
            Objects.equals(this.selfUri, workitemVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, type, description, language, utilizationLabel, priority, dateCreated, dateModified, dateDue, dateExpires, durationSeconds, ttl, status, statusCategory, dateStatusChanged, dateClosed, workbin, reporter, assignee, externalContact, externalTag, modifiedBy, queue, assignmentState, dateAssignmentStateChanged, alertTimeoutSeconds, skills, preferredAgents, autoStatusTransition, schema, customFields, autoStatusTransitionDetail, scoredAgents, script, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    utilizationLabel: ").append(toIndentedString(utilizationLabel)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    dateStatusChanged: ").append(toIndentedString(dateStatusChanged)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    workbin: ").append(toIndentedString(workbin)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    dateAssignmentStateChanged: ").append(toIndentedString(dateAssignmentStateChanged)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    preferredAgents: ").append(toIndentedString(preferredAgents)).append("\n");
    sb.append("    autoStatusTransition: ").append(toIndentedString(autoStatusTransition)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    autoStatusTransitionDetail: ").append(toIndentedString(autoStatusTransitionDetail)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

