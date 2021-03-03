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
import com.mypurecloud.sdk.v2.model.EvaluationQuestion;
import com.mypurecloud.sdk.v2.model.VisibilityCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationQuestionGroup
 */

public class EvaluationQuestionGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private Boolean defaultAnswersToHighest = null;
  private Boolean defaultAnswersToNA = null;
  private Boolean naEnabled = null;
  private Float weight = null;
  private Boolean manualWeight = null;
  private List<EvaluationQuestion> questions = new ArrayList<EvaluationQuestion>();
  private VisibilityCondition visibilityCondition = null;

  
  /**
   **/
  public EvaluationQuestionGroup id(String id) {
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
  public EvaluationQuestionGroup name(String name) {
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
  public EvaluationQuestionGroup type(String type) {
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
  public EvaluationQuestionGroup defaultAnswersToHighest(Boolean defaultAnswersToHighest) {
    this.defaultAnswersToHighest = defaultAnswersToHighest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultAnswersToHighest")
  public Boolean getDefaultAnswersToHighest() {
    return defaultAnswersToHighest;
  }
  public void setDefaultAnswersToHighest(Boolean defaultAnswersToHighest) {
    this.defaultAnswersToHighest = defaultAnswersToHighest;
  }

  
  /**
   **/
  public EvaluationQuestionGroup defaultAnswersToNA(Boolean defaultAnswersToNA) {
    this.defaultAnswersToNA = defaultAnswersToNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultAnswersToNA")
  public Boolean getDefaultAnswersToNA() {
    return defaultAnswersToNA;
  }
  public void setDefaultAnswersToNA(Boolean defaultAnswersToNA) {
    this.defaultAnswersToNA = defaultAnswersToNA;
  }

  
  /**
   **/
  public EvaluationQuestionGroup naEnabled(Boolean naEnabled) {
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
  public EvaluationQuestionGroup weight(Float weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weight")
  public Float getWeight() {
    return weight;
  }
  public void setWeight(Float weight) {
    this.weight = weight;
  }

  
  /**
   **/
  public EvaluationQuestionGroup manualWeight(Boolean manualWeight) {
    this.manualWeight = manualWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manualWeight")
  public Boolean getManualWeight() {
    return manualWeight;
  }
  public void setManualWeight(Boolean manualWeight) {
    this.manualWeight = manualWeight;
  }

  
  /**
   **/
  public EvaluationQuestionGroup questions(List<EvaluationQuestion> questions) {
    this.questions = questions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questions")
  public List<EvaluationQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<EvaluationQuestion> questions) {
    this.questions = questions;
  }

  
  /**
   **/
  public EvaluationQuestionGroup visibilityCondition(VisibilityCondition visibilityCondition) {
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
    EvaluationQuestionGroup evaluationQuestionGroup = (EvaluationQuestionGroup) o;
    return Objects.equals(this.id, evaluationQuestionGroup.id) &&
        Objects.equals(this.name, evaluationQuestionGroup.name) &&
        Objects.equals(this.type, evaluationQuestionGroup.type) &&
        Objects.equals(this.defaultAnswersToHighest, evaluationQuestionGroup.defaultAnswersToHighest) &&
        Objects.equals(this.defaultAnswersToNA, evaluationQuestionGroup.defaultAnswersToNA) &&
        Objects.equals(this.naEnabled, evaluationQuestionGroup.naEnabled) &&
        Objects.equals(this.weight, evaluationQuestionGroup.weight) &&
        Objects.equals(this.manualWeight, evaluationQuestionGroup.manualWeight) &&
        Objects.equals(this.questions, evaluationQuestionGroup.questions) &&
        Objects.equals(this.visibilityCondition, evaluationQuestionGroup.visibilityCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, defaultAnswersToHighest, defaultAnswersToNA, naEnabled, weight, manualWeight, questions, visibilityCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQuestionGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultAnswersToHighest: ").append(toIndentedString(defaultAnswersToHighest)).append("\n");
    sb.append("    defaultAnswersToNA: ").append(toIndentedString(defaultAnswersToNA)).append("\n");
    sb.append("    naEnabled: ").append(toIndentedString(naEnabled)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    manualWeight: ").append(toIndentedString(manualWeight)).append("\n");
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

