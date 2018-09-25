package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsSurvey
 */

public class AnalyticsSurvey  implements Serializable {
  
  private String surveyId = null;
  private String surveyFormId = null;
  private String surveyFormContextId = null;
  private String userId = null;
  private String queueId = null;
  private String status = null;
  private Long getoSurveyTotalScore = null;
  private Integer surveyPromoterScore = null;
  private Long surveyCompletedTime = null;
  private List<String> mediaTypes = new ArrayList<String>();
  private List<String> languageIds = new ArrayList<String>();
  private List<String> skillIds = new ArrayList<String>();

  
  /**
   * Unique identifier for the survey
   **/
  public AnalyticsSurvey surveyId(String surveyId) {
    this.surveyId = surveyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the survey")
  @JsonProperty("surveyId")
  public String getSurveyId() {
    return surveyId;
  }
  public void setSurveyId(String surveyId) {
    this.surveyId = surveyId;
  }

  
  /**
   * Unique identifier for the survey form
   **/
  public AnalyticsSurvey surveyFormId(String surveyFormId) {
    this.surveyFormId = surveyFormId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the survey form")
  @JsonProperty("surveyFormId")
  public String getSurveyFormId() {
    return surveyFormId;
  }
  public void setSurveyFormId(String surveyFormId) {
    this.surveyFormId = surveyFormId;
  }

  
  /**
   * Unique identifier for the survey form, regardless of version
   **/
  public AnalyticsSurvey surveyFormContextId(String surveyFormContextId) {
    this.surveyFormContextId = surveyFormContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the survey form, regardless of version")
  @JsonProperty("surveyFormContextId")
  public String getSurveyFormContextId() {
    return surveyFormContextId;
  }
  public void setSurveyFormContextId(String surveyFormContextId) {
    this.surveyFormContextId = surveyFormContextId;
  }

  
  /**
   * A unique identifier of the PureCloud user
   **/
  public AnalyticsSurvey userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier of the PureCloud user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Unique identifier for the queue the conversation was on
   **/
  public AnalyticsSurvey queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the queue the conversation was on")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * Survey status
   **/
  public AnalyticsSurvey status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Survey status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Creation date of survey
   **/
  public AnalyticsSurvey getoSurveyTotalScore(Long getoSurveyTotalScore) {
    this.getoSurveyTotalScore = getoSurveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation date of survey")
  @JsonProperty("getoSurveyTotalScore")
  public Long getGetoSurveyTotalScore() {
    return getoSurveyTotalScore;
  }
  public void setGetoSurveyTotalScore(Long getoSurveyTotalScore) {
    this.getoSurveyTotalScore = getoSurveyTotalScore;
  }

  
  /**
   * NPS score of the survey
   **/
  public AnalyticsSurvey surveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NPS score of the survey")
  @JsonProperty("surveyPromoterScore")
  public Integer getSurveyPromoterScore() {
    return surveyPromoterScore;
  }
  public void setSurveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
  }

  
  /**
   * Completion time of the survey, in ms since the epoch, 1970-01-01T00:00:00.000Z
   **/
  public AnalyticsSurvey surveyCompletedTime(Long surveyCompletedTime) {
    this.surveyCompletedTime = surveyCompletedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Completion time of the survey, in ms since the epoch, 1970-01-01T00:00:00.000Z")
  @JsonProperty("surveyCompletedTime")
  public Long getSurveyCompletedTime() {
    return surveyCompletedTime;
  }
  public void setSurveyCompletedTime(Long surveyCompletedTime) {
    this.surveyCompletedTime = surveyCompletedTime;
  }

  
  /**
   * Media types associated with the conversation
   **/
  public AnalyticsSurvey mediaTypes(List<String> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media types associated with the conversation")
  @JsonProperty("mediaTypes")
  public List<String> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<String> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * Language IDs associated with the conversation
   **/
  public AnalyticsSurvey languageIds(List<String> languageIds) {
    this.languageIds = languageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language IDs associated with the conversation")
  @JsonProperty("languageIds")
  public List<String> getLanguageIds() {
    return languageIds;
  }
  public void setLanguageIds(List<String> languageIds) {
    this.languageIds = languageIds;
  }

  
  /**
   * Skill IDs associated with the conversation
   **/
  public AnalyticsSurvey skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Skill IDs associated with the conversation")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSurvey analyticsSurvey = (AnalyticsSurvey) o;
    return Objects.equals(this.surveyId, analyticsSurvey.surveyId) &&
        Objects.equals(this.surveyFormId, analyticsSurvey.surveyFormId) &&
        Objects.equals(this.surveyFormContextId, analyticsSurvey.surveyFormContextId) &&
        Objects.equals(this.userId, analyticsSurvey.userId) &&
        Objects.equals(this.queueId, analyticsSurvey.queueId) &&
        Objects.equals(this.status, analyticsSurvey.status) &&
        Objects.equals(this.getoSurveyTotalScore, analyticsSurvey.getoSurveyTotalScore) &&
        Objects.equals(this.surveyPromoterScore, analyticsSurvey.surveyPromoterScore) &&
        Objects.equals(this.surveyCompletedTime, analyticsSurvey.surveyCompletedTime) &&
        Objects.equals(this.mediaTypes, analyticsSurvey.mediaTypes) &&
        Objects.equals(this.languageIds, analyticsSurvey.languageIds) &&
        Objects.equals(this.skillIds, analyticsSurvey.skillIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, surveyFormId, surveyFormContextId, userId, queueId, status, getoSurveyTotalScore, surveyPromoterScore, surveyCompletedTime, mediaTypes, languageIds, skillIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSurvey {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyFormId: ").append(toIndentedString(surveyFormId)).append("\n");
    sb.append("    surveyFormContextId: ").append(toIndentedString(surveyFormContextId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    getoSurveyTotalScore: ").append(toIndentedString(getoSurveyTotalScore)).append("\n");
    sb.append("    surveyPromoterScore: ").append(toIndentedString(surveyPromoterScore)).append("\n");
    sb.append("    surveyCompletedTime: ").append(toIndentedString(surveyCompletedTime)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
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

