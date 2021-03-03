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
import com.mypurecloud.sdk.v2.model.DomainEntityListingEvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationQuestionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationForm
 */

public class EvaluationForm  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date modifiedDate = null;
  private Boolean published = null;
  private String contextId = null;
  private List<EvaluationQuestionGroup> questionGroups = new ArrayList<EvaluationQuestionGroup>();
  private DomainEntityListingEvaluationForm publishedVersions = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The evaluation form name
   **/
  public EvaluationForm name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The evaluation form name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationForm modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   **/
  public EvaluationForm published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   **/
  public EvaluationForm contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  
  /**
   * A list of question groups
   **/
  public EvaluationForm questionGroups(List<EvaluationQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of question groups")
  @JsonProperty("questionGroups")
  public List<EvaluationQuestionGroup> getQuestionGroups() {
    return questionGroups;
  }
  public void setQuestionGroups(List<EvaluationQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
  }

  
  /**
   **/
  public EvaluationForm publishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
    this.publishedVersions = publishedVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedVersions")
  public DomainEntityListingEvaluationForm getPublishedVersions() {
    return publishedVersions;
  }
  public void setPublishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
    this.publishedVersions = publishedVersions;
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
    EvaluationForm evaluationForm = (EvaluationForm) o;
    return Objects.equals(this.id, evaluationForm.id) &&
        Objects.equals(this.name, evaluationForm.name) &&
        Objects.equals(this.modifiedDate, evaluationForm.modifiedDate) &&
        Objects.equals(this.published, evaluationForm.published) &&
        Objects.equals(this.contextId, evaluationForm.contextId) &&
        Objects.equals(this.questionGroups, evaluationForm.questionGroups) &&
        Objects.equals(this.publishedVersions, evaluationForm.publishedVersions) &&
        Objects.equals(this.selfUri, evaluationForm.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, published, contextId, questionGroups, publishedVersions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    questionGroups: ").append(toIndentedString(questionGroups)).append("\n");
    sb.append("    publishedVersions: ").append(toIndentedString(publishedVersions)).append("\n");
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

