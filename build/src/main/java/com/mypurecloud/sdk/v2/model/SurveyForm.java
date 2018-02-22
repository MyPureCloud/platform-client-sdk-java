package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DomainEntityListingSurveyForm;
import com.mypurecloud.sdk.v2.model.QuestionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyForm
 */

public class SurveyForm  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date modifiedDate = null;
  private Boolean published = null;
  private Boolean disabled = null;
  private String contextId = null;
  private String header = null;
  private String footer = null;
  private List<QuestionGroup> questionGroups = new ArrayList<QuestionGroup>();
  private DomainEntityListingSurveyForm publishedVersions = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The survey form name
   **/
  public SurveyForm name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The survey form name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  
  @ApiModelProperty(example = "null", value = "Is this form published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  
  /**
   * Is this form disabled
   **/
  public SurveyForm disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this form disabled")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id for all versions of this form")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  
  /**
   * Id of the header image appearing at the top of the form.
   **/
  public SurveyForm header(String header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the header image appearing at the top of the form.")
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }

  
  /**
   * Markdown text for the bottom of the form.
   **/
  public SurveyForm footer(String footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Markdown text for the bottom of the form.")
  @JsonProperty("footer")
  public String getFooter() {
    return footer;
  }
  public void setFooter(String footer) {
    this.footer = footer;
  }

  
  /**
   * A list of question groups
   **/
  public SurveyForm questionGroups(List<QuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of question groups")
  @JsonProperty("questionGroups")
  public List<QuestionGroup> getQuestionGroups() {
    return questionGroups;
  }
  public void setQuestionGroups(List<QuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
  }

  
  /**
   * List of published version of this form
   **/
  public SurveyForm publishedVersions(DomainEntityListingSurveyForm publishedVersions) {
    this.publishedVersions = publishedVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of published version of this form")
  @JsonProperty("publishedVersions")
  public DomainEntityListingSurveyForm getPublishedVersions() {
    return publishedVersions;
  }
  public void setPublishedVersions(DomainEntityListingSurveyForm publishedVersions) {
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
    SurveyForm surveyForm = (SurveyForm) o;
    return Objects.equals(this.id, surveyForm.id) &&
        Objects.equals(this.name, surveyForm.name) &&
        Objects.equals(this.modifiedDate, surveyForm.modifiedDate) &&
        Objects.equals(this.published, surveyForm.published) &&
        Objects.equals(this.disabled, surveyForm.disabled) &&
        Objects.equals(this.contextId, surveyForm.contextId) &&
        Objects.equals(this.header, surveyForm.header) &&
        Objects.equals(this.footer, surveyForm.footer) &&
        Objects.equals(this.questionGroups, surveyForm.questionGroups) &&
        Objects.equals(this.publishedVersions, surveyForm.publishedVersions) &&
        Objects.equals(this.selfUri, surveyForm.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, published, disabled, contextId, header, footer, questionGroups, publishedVersions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

