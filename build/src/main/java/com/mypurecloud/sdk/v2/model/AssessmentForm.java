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
import com.mypurecloud.sdk.v2.model.AssessmentFormQuestionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AssessmentForm
 */

public class AssessmentForm  implements Serializable {
  
  private String id = null;
  private Date dateModified = null;
  private String contextId = null;
  private String selfUri = null;
  private Boolean published = null;
  private Integer passPercent = null;
  private List<AssessmentFormQuestionGroup> questionGroups = new ArrayList<AssessmentFormQuestionGroup>();

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified date of the assessment form. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "The unique Id for all versions of this assessment form")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "If true, assessment form is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  
  /**
   * The pass percent for the assessment form
   **/
  public AssessmentForm passPercent(Integer passPercent) {
    this.passPercent = passPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pass percent for the assessment form")
  @JsonProperty("passPercent")
  public Integer getPassPercent() {
    return passPercent;
  }
  public void setPassPercent(Integer passPercent) {
    this.passPercent = passPercent;
  }

  
  /**
   * A list of question groups
   **/
  public AssessmentForm questionGroups(List<AssessmentFormQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of question groups")
  @JsonProperty("questionGroups")
  public List<AssessmentFormQuestionGroup> getQuestionGroups() {
    return questionGroups;
  }
  public void setQuestionGroups(List<AssessmentFormQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentForm assessmentForm = (AssessmentForm) o;
    return Objects.equals(this.id, assessmentForm.id) &&
        Objects.equals(this.dateModified, assessmentForm.dateModified) &&
        Objects.equals(this.contextId, assessmentForm.contextId) &&
        Objects.equals(this.selfUri, assessmentForm.selfUri) &&
        Objects.equals(this.published, assessmentForm.published) &&
        Objects.equals(this.passPercent, assessmentForm.passPercent) &&
        Objects.equals(this.questionGroups, assessmentForm.questionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateModified, contextId, selfUri, published, passPercent, questionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    passPercent: ").append(toIndentedString(passPercent)).append("\n");
    sb.append("    questionGroups: ").append(toIndentedString(questionGroups)).append("\n");
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

