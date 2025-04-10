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
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleInformStepRequest;
import com.mypurecloud.sdk.v2.model.ReviewAssessmentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module request
 */
@ApiModel(description = "Learning module request")

public class LearningModuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Integer completionTimeInDays = null;
  private List<LearningModuleInformStepRequest> informSteps = null;

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
   * The type for the learning module. Informational, AssessedContent and Assessment are deprecated
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
  private AssessmentForm assessmentForm = null;
  private LearningModuleCoverArtRequest coverArt = null;
  private Integer lengthInMinutes = null;
  private Boolean excludedFromCatalog = null;
  private String externalId = null;
  private Boolean enforceContentOrder = null;
  private ReviewAssessmentResults reviewAssessmentResults = null;

  public LearningModuleRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      informSteps = new ArrayList<LearningModuleInformStepRequest>();
    }
  }

  
  /**
   * The name of learning module
   **/
  public LearningModuleRequest name(String name) {
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
   * The description of learning module
   **/
  public LearningModuleRequest description(String description) {
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
  public LearningModuleRequest completionTimeInDays(Integer completionTimeInDays) {
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
   * The list of inform steps in a learning module
   **/
  public LearningModuleRequest informSteps(List<LearningModuleInformStepRequest> informSteps) {
    this.informSteps = informSteps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of inform steps in a learning module")
  @JsonProperty("informSteps")
  public List<LearningModuleInformStepRequest> getInformSteps() {
    return informSteps;
  }
  public void setInformSteps(List<LearningModuleInformStepRequest> informSteps) {
    this.informSteps = informSteps;
  }


  /**
   * The type for the learning module. Informational, AssessedContent and Assessment are deprecated
   **/
  public LearningModuleRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type for the learning module. Informational, AssessedContent and Assessment are deprecated")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The assessment form for learning module
   **/
  public LearningModuleRequest assessmentForm(AssessmentForm assessmentForm) {
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
   * The cover art for the learning module
   **/
  public LearningModuleRequest coverArt(LearningModuleCoverArtRequest coverArt) {
    this.coverArt = coverArt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cover art for the learning module")
  @JsonProperty("coverArt")
  public LearningModuleCoverArtRequest getCoverArt() {
    return coverArt;
  }
  public void setCoverArt(LearningModuleCoverArtRequest coverArt) {
    this.coverArt = coverArt;
  }


  /**
   * The recommended time in minutes to complete the module
   **/
  public LearningModuleRequest lengthInMinutes(Integer lengthInMinutes) {
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
   * If true, learning module is excluded when retrieving modules for manual assignment
   **/
  public LearningModuleRequest excludedFromCatalog(Boolean excludedFromCatalog) {
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


  /**
   * The external ID of the learning module. Maximum length: 50 characters.
   **/
  public LearningModuleRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external ID of the learning module. Maximum length: 50 characters.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * If true, learning module content should be viewed one by one in order
   **/
  public LearningModuleRequest enforceContentOrder(Boolean enforceContentOrder) {
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
  public LearningModuleRequest reviewAssessmentResults(ReviewAssessmentResults reviewAssessmentResults) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleRequest learningModuleRequest = (LearningModuleRequest) o;

    return Objects.equals(this.name, learningModuleRequest.name) &&
            Objects.equals(this.description, learningModuleRequest.description) &&
            Objects.equals(this.completionTimeInDays, learningModuleRequest.completionTimeInDays) &&
            Objects.equals(this.informSteps, learningModuleRequest.informSteps) &&
            Objects.equals(this.type, learningModuleRequest.type) &&
            Objects.equals(this.assessmentForm, learningModuleRequest.assessmentForm) &&
            Objects.equals(this.coverArt, learningModuleRequest.coverArt) &&
            Objects.equals(this.lengthInMinutes, learningModuleRequest.lengthInMinutes) &&
            Objects.equals(this.excludedFromCatalog, learningModuleRequest.excludedFromCatalog) &&
            Objects.equals(this.externalId, learningModuleRequest.externalId) &&
            Objects.equals(this.enforceContentOrder, learningModuleRequest.enforceContentOrder) &&
            Objects.equals(this.reviewAssessmentResults, learningModuleRequest.reviewAssessmentResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, completionTimeInDays, informSteps, type, assessmentForm, coverArt, lengthInMinutes, excludedFromCatalog, externalId, enforceContentOrder, reviewAssessmentResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    completionTimeInDays: ").append(toIndentedString(completionTimeInDays)).append("\n");
    sb.append("    informSteps: ").append(toIndentedString(informSteps)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
    sb.append("    coverArt: ").append(toIndentedString(coverArt)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    excludedFromCatalog: ").append(toIndentedString(excludedFromCatalog)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    enforceContentOrder: ").append(toIndentedString(enforceContentOrder)).append("\n");
    sb.append("    reviewAssessmentResults: ").append(toIndentedString(reviewAssessmentResults)).append("\n");
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

