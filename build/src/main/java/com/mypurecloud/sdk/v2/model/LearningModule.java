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
import com.mypurecloud.sdk.v2.model.AssessmentForm;
import com.mypurecloud.sdk.v2.model.LearningModuleInformStep;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModuleSummary;
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

public class LearningModule  implements Serializable {
  
  private String id = null;
  private String name = null;
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
    ASSESSMENT("Assessment");

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
  private List<LearningModuleInformStep> informSteps = new ArrayList<LearningModuleInformStep>();
  private AssessmentForm assessmentForm = null;
  private LearningModuleSummary summaryData = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of learning module
   **/
  public LearningModule name(String name) {
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
  public LearningModule description(String description) {
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
  public LearningModule completionTimeInDays(Integer completionTimeInDays) {
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
  public LearningModule type(TypeEnum type) {
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
  public LearningModule informSteps(List<LearningModuleInformStep> informSteps) {
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
  public LearningModule assessmentForm(AssessmentForm assessmentForm) {
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
  public LearningModule summaryData(LearningModuleSummary summaryData) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModule learningModule = (LearningModule) o;
    return Objects.equals(this.id, learningModule.id) &&
        Objects.equals(this.name, learningModule.name) &&
        Objects.equals(this.createdBy, learningModule.createdBy) &&
        Objects.equals(this.dateCreated, learningModule.dateCreated) &&
        Objects.equals(this.modifiedBy, learningModule.modifiedBy) &&
        Objects.equals(this.dateModified, learningModule.dateModified) &&
        Objects.equals(this.version, learningModule.version) &&
        Objects.equals(this.externalId, learningModule.externalId) &&
        Objects.equals(this.source, learningModule.source) &&
        Objects.equals(this.rule, learningModule.rule) &&
        Objects.equals(this.selfUri, learningModule.selfUri) &&
        Objects.equals(this.isArchived, learningModule.isArchived) &&
        Objects.equals(this.isPublished, learningModule.isPublished) &&
        Objects.equals(this.description, learningModule.description) &&
        Objects.equals(this.completionTimeInDays, learningModule.completionTimeInDays) &&
        Objects.equals(this.type, learningModule.type) &&
        Objects.equals(this.informSteps, learningModule.informSteps) &&
        Objects.equals(this.assessmentForm, learningModule.assessmentForm) &&
        Objects.equals(this.summaryData, learningModule.summaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdBy, dateCreated, modifiedBy, dateModified, version, externalId, source, rule, selfUri, isArchived, isPublished, description, completionTimeInDays, type, informSteps, assessmentForm, summaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    completionTimeInDays: ").append(toIndentedString(completionTimeInDays)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    informSteps: ").append(toIndentedString(informSteps)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
    sb.append("    summaryData: ").append(toIndentedString(summaryData)).append("\n");
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

