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
import com.mypurecloud.sdk.v2.model.LearningAssessment;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Learning module assignment with user information
 */
@ApiModel(description = "Learning module assignment with user information")

public class LearningAssignment  implements Serializable {
  
  private String id = null;
  private LearningAssessment assessment = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private Boolean isOverdue = null;
  private Float percentageScore = null;
  private Boolean isRule = null;
  private Boolean isManual = null;
  private Boolean isPassed = null;
  private String selfUri = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Learning Assignment state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    DELETED("Deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateRecommendedForCompletion = null;
  private Integer version = null;
  private LearningModule module = null;
  private UserReference user = null;
  private AssessmentForm assessmentForm = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The assessment associated with this assignment
   **/
  public LearningAssignment assessment(LearningAssessment assessment) {
    this.assessment = assessment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment associated with this assignment")
  @JsonProperty("assessment")
  public LearningAssessment getAssessment() {
    return assessment;
  }
  public void setAssessment(LearningAssessment assessment) {
    this.assessment = assessment;
  }

  
  @ApiModelProperty(example = "null", value = "The user who created the assignment")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the assignment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The user who modified the assignment")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the assignment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "True if the assignment is overdue")
  @JsonProperty("isOverdue")
  public Boolean getIsOverdue() {
    return isOverdue;
  }

  
  @ApiModelProperty(example = "null", value = "The user's percentage score for this assignment")
  @JsonProperty("percentageScore")
  public Float getPercentageScore() {
    return percentageScore;
  }

  
  @ApiModelProperty(example = "null", value = "True if this assignment was created by a Rule")
  @JsonProperty("isRule")
  public Boolean getIsRule() {
    return isRule;
  }

  
  @ApiModelProperty(example = "null", value = "True if this assignment was created manually")
  @JsonProperty("isManual")
  public Boolean getIsManual() {
    return isManual;
  }

  
  @ApiModelProperty(example = "null", value = "True if the assessment was passed")
  @JsonProperty("isPassed")
  public Boolean getIsPassed() {
    return isPassed;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * The Learning Assignment state
   **/
  public LearningAssignment state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Learning Assignment state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The recommended completion date of the assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public LearningAssignment dateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recommended completion date of the assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateRecommendedForCompletion")
  public Date getDateRecommendedForCompletion() {
    return dateRecommendedForCompletion;
  }
  public void setDateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
  }

  
  /**
   * The version of Learning module assigned
   **/
  public LearningAssignment version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of Learning module assigned")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The Learning module object associated with this assignment
   **/
  public LearningAssignment module(LearningModule module) {
    this.module = module;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Learning module object associated with this assignment")
  @JsonProperty("module")
  public LearningModule getModule() {
    return module;
  }
  public void setModule(LearningModule module) {
    this.module = module;
  }

  
  /**
   * The user to whom the assignment is assigned
   **/
  public LearningAssignment user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user to whom the assignment is assigned")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * The assessment form associated with this assignment
   **/
  public LearningAssignment assessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment form associated with this assignment")
  @JsonProperty("assessmentForm")
  public AssessmentForm getAssessmentForm() {
    return assessmentForm;
  }
  public void setAssessmentForm(AssessmentForm assessmentForm) {
    this.assessmentForm = assessmentForm;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignment learningAssignment = (LearningAssignment) o;
    return Objects.equals(this.id, learningAssignment.id) &&
        Objects.equals(this.assessment, learningAssignment.assessment) &&
        Objects.equals(this.createdBy, learningAssignment.createdBy) &&
        Objects.equals(this.dateCreated, learningAssignment.dateCreated) &&
        Objects.equals(this.modifiedBy, learningAssignment.modifiedBy) &&
        Objects.equals(this.dateModified, learningAssignment.dateModified) &&
        Objects.equals(this.isOverdue, learningAssignment.isOverdue) &&
        Objects.equals(this.percentageScore, learningAssignment.percentageScore) &&
        Objects.equals(this.isRule, learningAssignment.isRule) &&
        Objects.equals(this.isManual, learningAssignment.isManual) &&
        Objects.equals(this.isPassed, learningAssignment.isPassed) &&
        Objects.equals(this.selfUri, learningAssignment.selfUri) &&
        Objects.equals(this.state, learningAssignment.state) &&
        Objects.equals(this.dateRecommendedForCompletion, learningAssignment.dateRecommendedForCompletion) &&
        Objects.equals(this.version, learningAssignment.version) &&
        Objects.equals(this.module, learningAssignment.module) &&
        Objects.equals(this.user, learningAssignment.user) &&
        Objects.equals(this.assessmentForm, learningAssignment.assessmentForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assessment, createdBy, dateCreated, modifiedBy, dateModified, isOverdue, percentageScore, isRule, isManual, isPassed, selfUri, state, dateRecommendedForCompletion, version, module, user, assessmentForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    isRule: ").append(toIndentedString(isRule)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateRecommendedForCompletion: ").append(toIndentedString(dateRecommendedForCompletion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
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

