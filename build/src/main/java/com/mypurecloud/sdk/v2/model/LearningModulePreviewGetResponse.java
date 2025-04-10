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
import com.mypurecloud.sdk.v2.model.AssessmentForm;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewGetResponseAssignment;
import com.mypurecloud.sdk.v2.model.ReviewAssessmentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module preview get response
 */
@ApiModel(description = "Learning module preview get response")

public class LearningModulePreviewGetResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private LearningModuleCoverArtResponse coverArt = null;
  private Boolean enforceContentOrder = null;
  private ReviewAssessmentResults reviewAssessmentResults = null;
  private AssessmentForm assessmentForm = null;
  private LearningModulePreviewGetResponseAssignment assignment = null;
  private String selfUri = null;

  public LearningModulePreviewGetResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
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
  public LearningModulePreviewGetResponse name(String name) {
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
  public LearningModulePreviewGetResponse description(String description) {
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
   * The cover art for the learning module
   **/
  public LearningModulePreviewGetResponse coverArt(LearningModuleCoverArtResponse coverArt) {
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
   * If true, learning module content should be viewed one by one in order
   **/
  public LearningModulePreviewGetResponse enforceContentOrder(Boolean enforceContentOrder) {
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
  public LearningModulePreviewGetResponse reviewAssessmentResults(ReviewAssessmentResults reviewAssessmentResults) {
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
   * The assessment form for learning module
   **/
  public LearningModulePreviewGetResponse assessmentForm(AssessmentForm assessmentForm) {
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
   * the assignment preview
   **/
  public LearningModulePreviewGetResponse assignment(LearningModulePreviewGetResponseAssignment assignment) {
    this.assignment = assignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the assignment preview")
  @JsonProperty("assignment")
  public LearningModulePreviewGetResponseAssignment getAssignment() {
    return assignment;
  }
  public void setAssignment(LearningModulePreviewGetResponseAssignment assignment) {
    this.assignment = assignment;
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
    LearningModulePreviewGetResponse learningModulePreviewGetResponse = (LearningModulePreviewGetResponse) o;

    return Objects.equals(this.id, learningModulePreviewGetResponse.id) &&
            Objects.equals(this.name, learningModulePreviewGetResponse.name) &&
            Objects.equals(this.description, learningModulePreviewGetResponse.description) &&
            Objects.equals(this.coverArt, learningModulePreviewGetResponse.coverArt) &&
            Objects.equals(this.enforceContentOrder, learningModulePreviewGetResponse.enforceContentOrder) &&
            Objects.equals(this.reviewAssessmentResults, learningModulePreviewGetResponse.reviewAssessmentResults) &&
            Objects.equals(this.assessmentForm, learningModulePreviewGetResponse.assessmentForm) &&
            Objects.equals(this.assignment, learningModulePreviewGetResponse.assignment) &&
            Objects.equals(this.selfUri, learningModulePreviewGetResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, coverArt, enforceContentOrder, reviewAssessmentResults, assessmentForm, assignment, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewGetResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coverArt: ").append(toIndentedString(coverArt)).append("\n");
    sb.append("    enforceContentOrder: ").append(toIndentedString(enforceContentOrder)).append("\n");
    sb.append("    reviewAssessmentResults: ").append(toIndentedString(reviewAssessmentResults)).append("\n");
    sb.append("    assessmentForm: ").append(toIndentedString(assessmentForm)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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

