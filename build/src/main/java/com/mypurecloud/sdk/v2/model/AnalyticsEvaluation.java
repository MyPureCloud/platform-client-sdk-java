package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsEvaluation
 */

public class AnalyticsEvaluation  implements Serializable {
  
  private Boolean assigneeApplicable = null;
  private String assigneeId = null;
  private String calibrationId = null;
  private String contextId = null;
  private Boolean deleted = null;
  private String evaluationId = null;

  private static class EvaluationStatusEnumDeserializer extends StdDeserializer<EvaluationStatusEnum> {
    public EvaluationStatusEnumDeserializer() {
      super(EvaluationStatusEnumDeserializer.class);
    }

    @Override
    public EvaluationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EvaluationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of evaluation
   */
 @JsonDeserialize(using = EvaluationStatusEnumDeserializer.class)
  public enum EvaluationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FINISHED("Finished"),
    INPROGRESS("InProgress"),
    INREVIEW("InReview"),
    PENDING("Pending"),
    RETRACTED("Retracted");

    private String value;

    EvaluationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EvaluationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (EvaluationStatusEnum value : EvaluationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EvaluationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EvaluationStatusEnum evaluationStatus = null;
  private String evaluatorId = null;
  private Date eventTime = null;
  private String formId = null;
  private String formName = null;
  private String queueId = null;
  private Boolean released = null;
  private Boolean rescored = null;
  private Boolean systemSubmitted = null;
  private String userId = null;
  private Long oTotalCriticalScore = null;
  private Long oTotalScore = null;

  public AnalyticsEvaluation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable
   **/
  public AnalyticsEvaluation assigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable")
  @JsonProperty("assigneeApplicable")
  public Boolean getAssigneeApplicable() {
    return assigneeApplicable;
  }
  public void setAssigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
  }


  /**
   * UserId of the assignee
   **/
  public AnalyticsEvaluation assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UserId of the assignee")
  @JsonProperty("assigneeId")
  public String getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }


  /**
   * The calibration ID used for the purpose of training evaluators
   **/
  public AnalyticsEvaluation calibrationId(String calibrationId) {
    this.calibrationId = calibrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The calibration ID used for the purpose of training evaluators")
  @JsonProperty("calibrationId")
  public String getCalibrationId() {
    return calibrationId;
  }
  public void setCalibrationId(String calibrationId) {
    this.calibrationId = calibrationId;
  }


  /**
   * A unique identifier for an evaluation form, regardless of version
   **/
  public AnalyticsEvaluation contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier for an evaluation form, regardless of version")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   * Whether the evaluation has been deleted
   **/
  public AnalyticsEvaluation deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the evaluation has been deleted")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  /**
   * Unique identifier for the evaluation
   **/
  public AnalyticsEvaluation evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the evaluation")
  @JsonProperty("evaluationId")
  public String getEvaluationId() {
    return evaluationId;
  }
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  /**
   * Status of evaluation
   **/
  public AnalyticsEvaluation evaluationStatus(EvaluationStatusEnum evaluationStatus) {
    this.evaluationStatus = evaluationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of evaluation")
  @JsonProperty("evaluationStatus")
  public EvaluationStatusEnum getEvaluationStatus() {
    return evaluationStatus;
  }
  public void setEvaluationStatus(EvaluationStatusEnum evaluationStatus) {
    this.evaluationStatus = evaluationStatus;
  }


  /**
   * A unique identifier of the user who evaluated the interaction
   **/
  public AnalyticsEvaluation evaluatorId(String evaluatorId) {
    this.evaluatorId = evaluatorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier of the user who evaluated the interaction")
  @JsonProperty("evaluatorId")
  public String getEvaluatorId() {
    return evaluatorId;
  }
  public void setEvaluatorId(String evaluatorId) {
    this.evaluatorId = evaluatorId;
  }


  /**
   * Specifies when an evaluation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsEvaluation eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies when an evaluation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   * ID of the evaluation form used
   **/
  public AnalyticsEvaluation formId(String formId) {
    this.formId = formId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the evaluation form used")
  @JsonProperty("formId")
  public String getFormId() {
    return formId;
  }
  public void setFormId(String formId) {
    this.formId = formId;
  }


  /**
   * Name of the evaluation form used
   **/
  public AnalyticsEvaluation formName(String formName) {
    this.formName = formName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the evaluation form used")
  @JsonProperty("formName")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }


  /**
   * The ID of the associated queue
   **/
  public AnalyticsEvaluation queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the associated queue")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Whether the evaluation has been released
   **/
  public AnalyticsEvaluation released(Boolean released) {
    this.released = released;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the evaluation has been released")
  @JsonProperty("released")
  public Boolean getReleased() {
    return released;
  }
  public void setReleased(Boolean released) {
    this.released = released;
  }


  /**
   * Whether the evaluation has been rescored at least once
   **/
  public AnalyticsEvaluation rescored(Boolean rescored) {
    this.rescored = rescored;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the evaluation has been rescored at least once")
  @JsonProperty("rescored")
  public Boolean getRescored() {
    return rescored;
  }
  public void setRescored(Boolean rescored) {
    this.rescored = rescored;
  }


  /**
   * Whether the evaluation was auto submitted by the system
   **/
  public AnalyticsEvaluation systemSubmitted(Boolean systemSubmitted) {
    this.systemSubmitted = systemSubmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the evaluation was auto submitted by the system")
  @JsonProperty("systemSubmitted")
  public Boolean getSystemSubmitted() {
    return systemSubmitted;
  }
  public void setSystemSubmitted(Boolean systemSubmitted) {
    this.systemSubmitted = systemSubmitted;
  }


  /**
   * ID of the agent the evaluation was performed against
   **/
  public AnalyticsEvaluation userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the agent the evaluation was performed against")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public AnalyticsEvaluation oTotalCriticalScore(Long oTotalCriticalScore) {
    this.oTotalCriticalScore = oTotalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oTotalCriticalScore")
  public Long getOTotalCriticalScore() {
    return oTotalCriticalScore;
  }
  public void setOTotalCriticalScore(Long oTotalCriticalScore) {
    this.oTotalCriticalScore = oTotalCriticalScore;
  }


  /**
   **/
  public AnalyticsEvaluation oTotalScore(Long oTotalScore) {
    this.oTotalScore = oTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oTotalScore")
  public Long getOTotalScore() {
    return oTotalScore;
  }
  public void setOTotalScore(Long oTotalScore) {
    this.oTotalScore = oTotalScore;
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

    return Objects.equals(this.assigneeApplicable, analyticsEvaluation.assigneeApplicable) &&
            Objects.equals(this.assigneeId, analyticsEvaluation.assigneeId) &&
            Objects.equals(this.calibrationId, analyticsEvaluation.calibrationId) &&
            Objects.equals(this.contextId, analyticsEvaluation.contextId) &&
            Objects.equals(this.deleted, analyticsEvaluation.deleted) &&
            Objects.equals(this.evaluationId, analyticsEvaluation.evaluationId) &&
            Objects.equals(this.evaluationStatus, analyticsEvaluation.evaluationStatus) &&
            Objects.equals(this.evaluatorId, analyticsEvaluation.evaluatorId) &&
            Objects.equals(this.eventTime, analyticsEvaluation.eventTime) &&
            Objects.equals(this.formId, analyticsEvaluation.formId) &&
            Objects.equals(this.formName, analyticsEvaluation.formName) &&
            Objects.equals(this.queueId, analyticsEvaluation.queueId) &&
            Objects.equals(this.released, analyticsEvaluation.released) &&
            Objects.equals(this.rescored, analyticsEvaluation.rescored) &&
            Objects.equals(this.systemSubmitted, analyticsEvaluation.systemSubmitted) &&
            Objects.equals(this.userId, analyticsEvaluation.userId) &&
            Objects.equals(this.oTotalCriticalScore, analyticsEvaluation.oTotalCriticalScore) &&
            Objects.equals(this.oTotalScore, analyticsEvaluation.oTotalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeApplicable, assigneeId, calibrationId, contextId, deleted, evaluationId, evaluationStatus, evaluatorId, eventTime, formId, formName, queueId, released, rescored, systemSubmitted, userId, oTotalCriticalScore, oTotalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsEvaluation {\n");
    
    sb.append("    assigneeApplicable: ").append(toIndentedString(assigneeApplicable)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    calibrationId: ").append(toIndentedString(calibrationId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationStatus: ").append(toIndentedString(evaluationStatus)).append("\n");
    sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    rescored: ").append(toIndentedString(rescored)).append("\n");
    sb.append("    systemSubmitted: ").append(toIndentedString(systemSubmitted)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    oTotalCriticalScore: ").append(toIndentedString(oTotalCriticalScore)).append("\n");
    sb.append("    oTotalScore: ").append(toIndentedString(oTotalScore)).append("\n");
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

