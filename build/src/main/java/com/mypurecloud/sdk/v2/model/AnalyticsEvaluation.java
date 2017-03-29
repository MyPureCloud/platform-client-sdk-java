package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsEvaluation
 */

public class AnalyticsEvaluation  implements Serializable {
  
  private String evaluationId = null;
  private String evaluatorId = null;
  private String userId = null;
  private String eventTime = null;
  private String queueId = null;
  private String formId = null;
  private String contextId = null;
  private String formName = null;
  private Long getoTotalScore = null;
  private Long getoTotalCriticalScore = null;

  
  /**
   **/
  public AnalyticsEvaluation evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationId")
  public String getEvaluationId() {
    return evaluationId;
  }
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  /**
   **/
  public AnalyticsEvaluation evaluatorId(String evaluatorId) {
    this.evaluatorId = evaluatorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluatorId")
  public String getEvaluatorId() {
    return evaluatorId;
  }
  public void setEvaluatorId(String evaluatorId) {
    this.evaluatorId = evaluatorId;
  }


  /**
   **/
  public AnalyticsEvaluation userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public AnalyticsEvaluation eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public String getEventTime() {
    return eventTime;
  }
  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public AnalyticsEvaluation queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public AnalyticsEvaluation formId(String formId) {
    this.formId = formId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("formId")
  public String getFormId() {
    return formId;
  }
  public void setFormId(String formId) {
    this.formId = formId;
  }


  /**
   **/
  public AnalyticsEvaluation contextId(String contextId) {
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
   **/
  public AnalyticsEvaluation formName(String formName) {
    this.formName = formName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("formName")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }


  /**
   **/
  public AnalyticsEvaluation getoTotalScore(Long getoTotalScore) {
    this.getoTotalScore = getoTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getoTotalScore")
  public Long getGetoTotalScore() {
    return getoTotalScore;
  }
  public void setGetoTotalScore(Long getoTotalScore) {
    this.getoTotalScore = getoTotalScore;
  }


  /**
   **/
  public AnalyticsEvaluation getoTotalCriticalScore(Long getoTotalCriticalScore) {
    this.getoTotalCriticalScore = getoTotalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getoTotalCriticalScore")
  public Long getGetoTotalCriticalScore() {
    return getoTotalCriticalScore;
  }
  public void setGetoTotalCriticalScore(Long getoTotalCriticalScore) {
    this.getoTotalCriticalScore = getoTotalCriticalScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsEvaluation analyticsEvaluation = (AnalyticsEvaluation) o;
    return Objects.equals(this.evaluationId, analyticsEvaluation.evaluationId) &&
        Objects.equals(this.evaluatorId, analyticsEvaluation.evaluatorId) &&
        Objects.equals(this.userId, analyticsEvaluation.userId) &&
        Objects.equals(this.eventTime, analyticsEvaluation.eventTime) &&
        Objects.equals(this.queueId, analyticsEvaluation.queueId) &&
        Objects.equals(this.formId, analyticsEvaluation.formId) &&
        Objects.equals(this.contextId, analyticsEvaluation.contextId) &&
        Objects.equals(this.formName, analyticsEvaluation.formName) &&
        Objects.equals(this.getoTotalScore, analyticsEvaluation.getoTotalScore) &&
        Objects.equals(this.getoTotalCriticalScore, analyticsEvaluation.getoTotalCriticalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, evaluatorId, userId, eventTime, queueId, formId, contextId, formName, getoTotalScore, getoTotalCriticalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsEvaluation {\n");
    
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    getoTotalScore: ").append(toIndentedString(getoTotalScore)).append("\n");
    sb.append("    getoTotalCriticalScore: ").append(toIndentedString(getoTotalCriticalScore)).append("\n");
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

