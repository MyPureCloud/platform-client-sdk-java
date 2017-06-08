package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnswerOption;
import com.mypurecloud.sdk.v2.model.VisibilityCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Question
 */

public class Question  implements Serializable {
  
  private String id = null;
  private String text = null;
  private String helpText = null;
  private String type = null;
  private Double weight = null;
  private Boolean naRequired = null;
  private Boolean commentsRequired = null;
  private Boolean isKill = null;
  private Boolean isCritical = null;
  private Boolean naEnabled = null;
  private VisibilityCondition visibilityCondition = null;
  private List<AnswerOption> answerOptions = new ArrayList<AnswerOption>();

  
  /**
   **/
  public Question id(String id) {
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
  public Question text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public Question helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  public Question type(String type) {
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
  public Question weight(Double weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  
  /**
   **/
  public Question naRequired(Boolean naRequired) {
    this.naRequired = naRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("naRequired")
  public Boolean getNaRequired() {
    return naRequired;
  }
  public void setNaRequired(Boolean naRequired) {
    this.naRequired = naRequired;
  }

  
  /**
   **/
  public Question commentsRequired(Boolean commentsRequired) {
    this.commentsRequired = commentsRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commentsRequired")
  public Boolean getCommentsRequired() {
    return commentsRequired;
  }
  public void setCommentsRequired(Boolean commentsRequired) {
    this.commentsRequired = commentsRequired;
  }

  
  /**
   **/
  public Question isKill(Boolean isKill) {
    this.isKill = isKill;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isKill")
  public Boolean getIsKill() {
    return isKill;
  }
  public void setIsKill(Boolean isKill) {
    this.isKill = isKill;
  }

  
  /**
   **/
  public Question isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCritical")
  public Boolean getIsCritical() {
    return isCritical;
  }
  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }

  
  /**
   **/
  public Question naEnabled(Boolean naEnabled) {
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
  public Question visibilityCondition(VisibilityCondition visibilityCondition) {
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

  
  /**
   **/
  public Question answerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answerOptions")
  public List<AnswerOption> getAnswerOptions() {
    return answerOptions;
  }
  public void setAnswerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.id, question.id) &&
        Objects.equals(this.text, question.text) &&
        Objects.equals(this.helpText, question.helpText) &&
        Objects.equals(this.type, question.type) &&
        Objects.equals(this.weight, question.weight) &&
        Objects.equals(this.naRequired, question.naRequired) &&
        Objects.equals(this.commentsRequired, question.commentsRequired) &&
        Objects.equals(this.isKill, question.isKill) &&
        Objects.equals(this.isCritical, question.isCritical) &&
        Objects.equals(this.naEnabled, question.naEnabled) &&
        Objects.equals(this.visibilityCondition, question.visibilityCondition) &&
        Objects.equals(this.answerOptions, question.answerOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, helpText, type, weight, naRequired, commentsRequired, isKill, isCritical, naEnabled, visibilityCondition, answerOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    naRequired: ").append(toIndentedString(naRequired)).append("\n");
    sb.append("    commentsRequired: ").append(toIndentedString(commentsRequired)).append("\n");
    sb.append("    isKill: ").append(toIndentedString(isKill)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    naEnabled: ").append(toIndentedString(naEnabled)).append("\n");
    sb.append("    visibilityCondition: ").append(toIndentedString(visibilityCondition)).append("\n");
    sb.append("    answerOptions: ").append(toIndentedString(answerOptions)).append("\n");
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

