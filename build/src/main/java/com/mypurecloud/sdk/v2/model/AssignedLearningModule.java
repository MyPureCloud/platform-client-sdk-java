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
import com.mypurecloud.sdk.v2.model.AssessmentForm;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleInformStep;
import com.mypurecloud.sdk.v2.model.LearningModuleReassignSummary;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModuleSummary;
import com.mypurecloud.sdk.v2.model.ReviewAssessmentResults;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module response
 */
@ApiModel(description = "Learning module response")

public class AssignedLearningModule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean excludedFromCatalog = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private Integer version = null;
  private String externalId = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The source of the learning module
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERCREATED("UserCreated"),
    GENESYSBEYOND("GenesysBeyond");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private LearningModuleRule rule = null;
  private Boolean enforceContentOrder = null;
  private ReviewAssessmentResults reviewAssessmentResults = null;
  private List<LearningAssignment> currentAssignments = null;
  private String selfUri = null;
  private Boolean isArchived = null;
  private Boolean isPublished = null;
  private String description = null;
  private Integer completionTimeInDays = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type for the learning module
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INFORMATIONAL("Informational"),
    ASSESSEDCONTENT("AssessedContent"),
    ASSESSMENT("Assessment"),
    EXTERNAL("External"),
    NATIVE("Native");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<LearningModuleInformStep> informSteps = null;
  private AssessmentForm assessmentForm = null;
  private LearningModuleSummary summaryData = null;
  private LearningModuleReassignSummary reassignSummaryData = null;
  private LearningModuleCoverArtResponse coverArt = null;
  private Integer lengthInMinutes = null;

  private static class ArchivalModeEnumDeserializer extends StdDeserializer<ArchivalModeEnum> {
    public ArchivalModeEnumDeserializer() {
      super(ArchivalModeEnumDeserializer.class);
    }

    @Override
    public ArchivalModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ArchivalModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The mode of archival for learning module
   */
 @JsonDeserialize(using = ArchivalModeEnumDeserializer.class)
  public enum ArchivalModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GRACEFUL("Graceful"),
    IMMEDIATE("Immediate");

    private String value;

    ArchivalModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ArchivalModeEnum fromString(String key) {
      if (key == null) return null;

      for (ArchivalModeEnum value : ArchivalModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ArchivalModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ArchivalModeEnum archivalMode = null;

  public AssignedLearningModule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      currentAssignments = new ArrayList<LearningAssignment>();
      informSteps = new ArrayList<LearningModuleInformStep>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of learning module
   **/
  public AssignedLearningModule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of learning module")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * If true, learning module is excluded when retrieving modules for manual assignment
   **/
  public AssignedLearningModule excludedFromCatalog(Boolean excludedFromCatalog) {
    this.excludedFromCatalog = excludedFromCatalog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, learning module is excluded when retrieving modules for manual assignment")
  @JsonProperty("excludedFromCatalog")
  public Boolean getExcludedFromCatalog() {
    return excludedFromCatalog;
  }
  public void setExcludedFromCatalog(Boolean excludedFromCatalog) {
    this.excludedFromCatalog = excludedFromCatalog;
  }


  @ApiModelProperty(example = "null", value = "The user who created learning module")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The date/time learning module was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The user who modified learning module")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "The date/time learning module was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The version of published learning module")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "The external ID of the learning module")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }


  @ApiModelProperty(example = "null", value = "The source of the learning module")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "The rule for learning module; read-only, and only populated when requested via expand param.")
  @JsonProperty("rule")
  public LearningModuleRule getRule() {
    return rule;
  }


  /**
   * If true, learning module content should be viewed one by one in order
   **/
  public AssignedLearningModule enforceContentOrder(Boolean enforceContentOrder) {
    this.enforceContentOrder = enforceContentOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, learning module content should be viewed one by one in order")
  @JsonProperty("enforceContentOrder")
  public Boolean getEnforceContentOrder() {
    return enforceContentOrder;
  }
  public void setEnforceContentOrder(Boolean enforceContentOrder) {
    this.enforceContentOrder = enforceContentOrder;
  }


  /**
   * Allows to view Assessment results in detail
   **/
  public AssignedLearningModule reviewAssessmentResults(ReviewAssessmentResults reviewAssessmentResults) {
    this.reviewAssessmentResults = reviewAssessmentResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allows to view Assessment results in detail")
  @JsonProperty("reviewAssessmentResults")
  public ReviewAssessmentResults getReviewAssessmentResults() {
    return reviewAssessmentResults;
  }
  public void setReviewAssessmentResults(ReviewAssessmentResults reviewAssessmentResults) {
    this.reviewAssessmentResults = reviewAssessmentResults;
  }


  /**
   * The current assignments for the requested users
   **/
  public AssignedLearningModule currentAssignments(List<LearningAssignment> currentAssignments) {
    this.currentAssignments = currentAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current assignments for the requested users")
  @JsonProperty("currentAssignments")
  public List<LearningAssignment> getCurrentAssignments() {
    return currentAssignments;
  }
  public void setCurrentAssignments(List<LearningAssignment> currentAssignments) {
    this.currentAssignments = currentAssignments;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @ApiModelProperty(example = "null", value = "If true, learning module is archived")
  @JsonProperty("isArchived")
  public Boolean getIsArchived() {
    return isArchived;
  }


  @ApiModelProperty(example = "null", value = "If true, learning module is published")
  @JsonProperty("isPublished")
  public Boolean getIsPublished() {
    return isPublished;
  }


  /**
   * The description of learning module
   **/
  public AssignedLearningModule description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of learning module")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The completion time of learning module in days
   **/
  public AssignedLearningModule completionTimeInDays(Integer completionTimeInDays) {
    this.completionTimeInDays = completionTimeInDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The completion time of learning module in days")
  @JsonProperty("completionTimeInDays")
  public Integer getCompletionTimeInDays() {
    return completionTimeInDays;
  }
  public void setCompletionTimeInDays(Integer completionTimeInDays) {
    this.completionTimeInDays = completionTimeInDays;
  }


  /**
   * The type for the learning module
   **/
  public AssignedLearningModule type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type for the learning module")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The list of inform steps in a learning module
   **/
  public AssignedLearningModule informSteps(List<LearningModuleInformStep> informSteps) {
    this.informSteps = informSteps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of inform steps in a learning module")
  @JsonProperty("informSteps")
  public List<LearningModuleInformStep> getInformSteps() {
    return informSteps;
  }
  public void setInformSteps(List<LearningModuleInformStep> informSteps) {
    this.informSteps = informSteps;
  }


  /**
   * The assessment form for learning module
   **/
  public AssignedLearningModule assessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment form for learning module")
  @JsonProperty("assessmentForm")
  public AssessmentForm getAssessmentForm() {
    return assessmentForm;
  }
  public void setAssessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
  }


  /**
   * The learning module summary data
   **/
  public AssignedLearningModule summaryData(LearningModuleSummary summaryData) {
    this.summaryData = summaryData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learning module summary data")
  @JsonProperty("summaryData")
  public LearningModuleSummary getSummaryData() {
    return summaryData;
  }
  public void setSummaryData(LearningModuleSummary summaryData) {
    this.summaryData = summaryData;
  }


  /**
   * The learning module reassign summary data
   **/
  public AssignedLearningModule reassignSummaryData(LearningModuleReassignSummary reassignSummaryData) {
    this.reassignSummaryData = reassignSummaryData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learning module reassign summary data")
  @JsonProperty("reassignSummaryData")
  public LearningModuleReassignSummary getReassignSummaryData() {
    return reassignSummaryData;
  }
  public void setReassignSummaryData(LearningModuleReassignSummary reassignSummaryData) {
    this.reassignSummaryData = reassignSummaryData;
  }


  /**
   * The cover art for the learning module
   **/
  public AssignedLearningModule coverArt(LearningModuleCoverArtResponse coverArt) {
    this.coverArt = coverArt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cover art for the learning module")
  @JsonProperty("coverArt")
  public LearningModuleCoverArtResponse getCoverArt() {
    return coverArt;
  }
  public void setCoverArt(LearningModuleCoverArtResponse coverArt) {
    this.coverArt = coverArt;
  }


  /**
   * The recommended time in minutes to complete the module
   **/
  public AssignedLearningModule lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recommended time in minutes to complete the module")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * The mode of archival for learning module
   **/
  public AssignedLearningModule archivalMode(ArchivalModeEnum archivalMode) {
    this.archivalMode = archivalMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mode of archival for learning module")
  @JsonProperty("archivalMode")
  public ArchivalModeEnum getArchivalMode() {
    return archivalMode;
  }
  public void setArchivalMode(ArchivalModeEnum archivalMode) {
    this.archivalMode = archivalMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedLearningModule assignedLearningModule = (AssignedLearningModule) o;

    return Objects.equals(this.id, assignedLearningModule.id) &&
            Objects.equals(this.name, assignedLearningModule.name) &&
            Objects.equals(this.excludedFromCatalog, assignedLearningModule.excludedFromCatalog) &&
            Objects.equals(this.createdBy, assignedLearningModule.createdBy) &&
            Objects.equals(this.dateCreated, assignedLearningModule.dateCreated) &&
            Objects.equals(this.modifiedBy, assignedLearningModule.modifiedBy) &&
            Objects.equals(this.dateModified, assignedLearningModule.dateModified) &&
            Objects.equals(this.version, assignedLearningModule.version) &&
            Objects.equals(this.externalId, assignedLearningModule.externalId) &&
            Objects.equals(this.source, assignedLearningModule.source) &&
            Objects.equals(this.rule, assignedLearningModule.rule) &&
            Objects.equals(this.enforceContentOrder, assignedLearningModule.enforceContentOrder) &&
            Objects.equals(this.reviewAssessmentResults, assignedLearningModule.reviewAssessmentResults) &&
            Objects.equals(this.currentAssignments, assignedLearningModule.currentAssignments) &&
            Objects.equals(this.selfUri, assignedLearningModule.selfUri) &&
            Objects.equals(this.isArchived, assignedLearningModule.isArchived) &&
            Objects.equals(this.isPublished, assignedLearningModule.isPublished) &&
            Objects.equals(this.description, assignedLearningModule.description) &&
            Objects.equals(this.completionTimeInDays, assignedLearningModule.completionTimeInDays) &&
            Objects.equals(this.type, assignedLearningModule.type) &&
            Objects.equals(this.informSteps, assignedLearningModule.informSteps) &&
            Objects.equals(this.assessmentForm, assignedLearningModule.assessmentForm) &&
            Objects.equals(this.summaryData, assignedLearningModule.summaryData) &&
            Objects.equals(this.reassignSummaryData, assignedLearningModule.reassignSummaryData) &&
            Objects.equals(this.coverArt, assignedLearningModule.coverArt) &&
            Objects.equals(this.lengthInMinutes, assignedLearningModule.lengthInMinutes) &&
            Objects.equals(this.archivalMode, assignedLearningModule.archivalMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, excludedFromCatalog, createdBy, dateCreated, modifiedBy, dateModified, version, externalId, source, rule, enforceContentOrder, reviewAssessmentResults, currentAssignments, selfUri, isArchived, isPublished, description, completionTimeInDays, type, informSteps, assessmentForm, summaryData, reassignSummaryData, coverArt, lengthInMinutes, archivalMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedLearningModule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    excludedFromCatalog: ").append(toIndentedString(excludedFromCatalog)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    enforceContentOrder: ").append(toIndentedString(enforceContentOrder)).append("\n");
    sb.append("    reviewAssessmentResults: ").append(toIndentedString(reviewAssessmentResults)).append("\n");
    sb.append("    currentAssignments: ").append(toIndentedString(currentAssignments)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    completionTimeInDays: ").append(toIndentedString(completionTimeInDays)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    informSteps: ").append(toIndentedString(informSteps)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
    sb.append("    summaryData: ").append(toIndentedString(summaryData)).append("\n");
    sb.append("    reassignSummaryData: ").append(toIndentedString(reassignSummaryData)).append("\n");
    sb.append("    coverArt: ").append(toIndentedString(coverArt)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    archivalMode: ").append(toIndentedString(archivalMode)).append("\n");
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

