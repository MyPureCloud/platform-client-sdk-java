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
  private String surveyFormContextId = null;
  private String participantId = null;
  private String externalContactId = null;
  private String customerAddress = null;
  private String userId = null;
  private String queueId = null;
  private String status = null;
  private Date createdDate = null;
  private Long getoSurveyTotalScore = null;

  
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
   * Unique identifier of participant
   **/
  public AnalyticsSurvey participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of participant")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  
  /**
   * External contact id
   **/
  public AnalyticsSurvey externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External contact id")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   * Customer address
   **/
  public AnalyticsSurvey customerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer address")
  @JsonProperty("customerAddress")
  public String getCustomerAddress() {
    return customerAddress;
  }
  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
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
   * Creation date of survey. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsSurvey createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation date of survey. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * The total score for the survey
   **/
  public AnalyticsSurvey getoSurveyTotalScore(Long getoSurveyTotalScore) {
    this.getoSurveyTotalScore = getoSurveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total score for the survey")
  @JsonProperty("getoSurveyTotalScore")
  public Long getGetoSurveyTotalScore() {
    return getoSurveyTotalScore;
  }
  public void setGetoSurveyTotalScore(Long getoSurveyTotalScore) {
    this.getoSurveyTotalScore = getoSurveyTotalScore;
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
        Objects.equals(this.participantId, analyticsSurvey.participantId) &&
        Objects.equals(this.externalContactId, analyticsSurvey.externalContactId) &&
        Objects.equals(this.customerAddress, analyticsSurvey.customerAddress) &&
        Objects.equals(this.userId, analyticsSurvey.userId) &&
        Objects.equals(this.queueId, analyticsSurvey.queueId) &&
        Objects.equals(this.status, analyticsSurvey.status) &&
        Objects.equals(this.createdDate, analyticsSurvey.createdDate) &&
        Objects.equals(this.getoSurveyTotalScore, analyticsSurvey.getoSurveyTotalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, surveyFormId, surveyFormContextId, participantId, externalContactId, customerAddress, userId, queueId, status, createdDate, getoSurveyTotalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSurvey {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyFormId: ").append(toIndentedString(surveyFormId)).append("\n");
    sb.append("    surveyFormContextId: ").append(toIndentedString(surveyFormContextId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    getoSurveyTotalScore: ").append(toIndentedString(getoSurveyTotalScore)).append("\n");
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

