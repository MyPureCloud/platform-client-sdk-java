package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsSurvey
 */

public class AnalyticsSurvey  implements Serializable {
  
  private String surveyId = null;
  private String surveyFormId = null;
  private String surveyFormName = null;
  private String surveyFormContextId = null;
  private Date eventTime = null;
  private String userId = null;
  private String queueId = null;
  private String surveyStatus = null;
  private Integer surveyPromoterScore = null;
  private Date surveyCompletedDate = null;
  private Long oSurveyTotalScore = null;

  
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
   * Name of the survey form
   **/
  public AnalyticsSurvey surveyFormName(String surveyFormName) {
    this.surveyFormName = surveyFormName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the survey form")
  @JsonProperty("surveyFormName")
  public String getSurveyFormName() {
    return surveyFormName;
  }
  public void setSurveyFormName(String surveyFormName) {
    this.surveyFormName = surveyFormName;
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
   * Specifies when a survey occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSurvey eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies when a survey occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
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
  public AnalyticsSurvey surveyStatus(String surveyStatus) {
    this.surveyStatus = surveyStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Survey status")
  @JsonProperty("surveyStatus")
  public String getSurveyStatus() {
    return surveyStatus;
  }
  public void setSurveyStatus(String surveyStatus) {
    this.surveyStatus = surveyStatus;
  }

  
  /**
   * Promoter score of the survey
   **/
  public AnalyticsSurvey surveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Promoter score of the survey")
  @JsonProperty("surveyPromoterScore")
  public Integer getSurveyPromoterScore() {
    return surveyPromoterScore;
  }
  public void setSurveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
  }

  
  /**
   * Completion date/time of the survey. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSurvey surveyCompletedDate(Date surveyCompletedDate) {
    this.surveyCompletedDate = surveyCompletedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Completion date/time of the survey. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("surveyCompletedDate")
  public Date getSurveyCompletedDate() {
    return surveyCompletedDate;
  }
  public void setSurveyCompletedDate(Date surveyCompletedDate) {
    this.surveyCompletedDate = surveyCompletedDate;
  }

  
  /**
   **/
  public AnalyticsSurvey oSurveyTotalScore(Long oSurveyTotalScore) {
    this.oSurveyTotalScore = oSurveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oSurveyTotalScore")
  public Long getOSurveyTotalScore() {
    return oSurveyTotalScore;
  }
  public void setOSurveyTotalScore(Long oSurveyTotalScore) {
    this.oSurveyTotalScore = oSurveyTotalScore;
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
        Objects.equals(this.surveyFormName, analyticsSurvey.surveyFormName) &&
        Objects.equals(this.surveyFormContextId, analyticsSurvey.surveyFormContextId) &&
        Objects.equals(this.eventTime, analyticsSurvey.eventTime) &&
        Objects.equals(this.userId, analyticsSurvey.userId) &&
        Objects.equals(this.queueId, analyticsSurvey.queueId) &&
        Objects.equals(this.surveyStatus, analyticsSurvey.surveyStatus) &&
        Objects.equals(this.surveyPromoterScore, analyticsSurvey.surveyPromoterScore) &&
        Objects.equals(this.surveyCompletedDate, analyticsSurvey.surveyCompletedDate) &&
        Objects.equals(this.oSurveyTotalScore, analyticsSurvey.oSurveyTotalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, surveyFormId, surveyFormName, surveyFormContextId, eventTime, userId, queueId, surveyStatus, surveyPromoterScore, surveyCompletedDate, oSurveyTotalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSurvey {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyFormId: ").append(toIndentedString(surveyFormId)).append("\n");
    sb.append("    surveyFormName: ").append(toIndentedString(surveyFormName)).append("\n");
    sb.append("    surveyFormContextId: ").append(toIndentedString(surveyFormContextId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    surveyStatus: ").append(toIndentedString(surveyStatus)).append("\n");
    sb.append("    surveyPromoterScore: ").append(toIndentedString(surveyPromoterScore)).append("\n");
    sb.append("    surveyCompletedDate: ").append(toIndentedString(surveyCompletedDate)).append("\n");
    sb.append("    oSurveyTotalScore: ").append(toIndentedString(oSurveyTotalScore)).append("\n");
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

