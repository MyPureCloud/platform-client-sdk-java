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
import com.mypurecloud.sdk.v2.model.SurveyQuestion;
import com.mypurecloud.sdk.v2.model.VisibilityCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyQuestionGroup
 */

public class SurveyQuestionGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private Boolean naEnabled = null;
  private List<SurveyQuestion> questions = new ArrayList<SurveyQuestion>();
  private VisibilityCondition visibilityCondition = null;

  
  /**
   **/
  public SurveyQuestionGroup id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public SurveyQuestionGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public SurveyQuestionGroup type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public SurveyQuestionGroup naEnabled(Boolean naEnabled) {
    this.naEnabled = naEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("naEnabled")
  public Boolean getNaEnabled() {
    return naEnabled;
  }
  public void setNaEnabled(Boolean naEnabled) {
    this.naEnabled = naEnabled;
  }

  
  /**
   **/
  public SurveyQuestionGroup questions(List<SurveyQuestion> questions) {
    this.questions = questions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questions")
  public List<SurveyQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<SurveyQuestion> questions) {
    this.questions = questions;
  }

  
  /**
   **/
  public SurveyQuestionGroup visibilityCondition(VisibilityCondition visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visibilityCondition")
  public VisibilityCondition getVisibilityCondition() {
    return visibilityCondition;
  }
  public void setVisibilityCondition(VisibilityCondition visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionGroup surveyQuestionGroup = (SurveyQuestionGroup) o;
    return Objects.equals(this.id, surveyQuestionGroup.id) &&
        Objects.equals(this.name, surveyQuestionGroup.name) &&
        Objects.equals(this.type, surveyQuestionGroup.type) &&
        Objects.equals(this.naEnabled, surveyQuestionGroup.naEnabled) &&
        Objects.equals(this.questions, surveyQuestionGroup.questions) &&
        Objects.equals(this.visibilityCondition, surveyQuestionGroup.visibilityCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, naEnabled, questions, visibilityCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    naEnabled: ").append(toIndentedString(naEnabled)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    visibilityCondition: ").append(toIndentedString(visibilityCondition)).append("\n");
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

