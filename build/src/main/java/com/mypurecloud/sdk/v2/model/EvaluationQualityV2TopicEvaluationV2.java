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
import com.mypurecloud.sdk.v2.model.EvaluationQualityV2TopicCalibration;
import com.mypurecloud.sdk.v2.model.EvaluationQualityV2TopicEvaluationReference;
import com.mypurecloud.sdk.v2.model.EvaluationQualityV2TopicEvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationQualityV2TopicEvaluationSource;
import com.mypurecloud.sdk.v2.model.EvaluationQualityV2TopicUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationQualityV2TopicEvaluationV2
 */

public class EvaluationQualityV2TopicEvaluationV2  implements Serializable {
  
  private String id = null;
  private String conversationId = null;
  private EvaluationQualityV2TopicUser agent = null;
  private EvaluationQualityV2TopicUser evaluator = null;
  private Date eventTime = null;
  private String evaluationFormId = null;
  private String formName = null;
  private EvaluationQualityV2TopicEvaluationScoringSet scoringSet = null;
  private String contextId = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    INPROGRESS("InProgress"),
    FINISHED("Finished"),
    INREVIEW("InReview"),
    RETRACTED("Retracted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private Boolean agentHasRead = null;
  private Date releaseDate = null;
  private Date assignedDate = null;
  private Date changedDate = null;
  private String eventType = null;
  private String resourceId = null;
  private String resourceType = null;
  private List<String> divisionIds = null;
  private Boolean rescore = null;
  private Date conversationDate = null;
  private List<String> mediaType = null;
  private EvaluationQualityV2TopicCalibration calibration = null;
  private EvaluationQualityV2TopicEvaluationSource evaluationSource = null;
  private String assigneeUserId = null;
  private String previousAssigneeUserId = null;
  private Boolean assigneeApplicable = null;
  private String evaluationContextId = null;
  private Long disputeCount = null;
  private Long version = null;

  private static class PreviousStatusEnumDeserializer extends StdDeserializer<PreviousStatusEnum> {
    public PreviousStatusEnumDeserializer() {
      super(PreviousStatusEnumDeserializer.class);
    }

    @Override
    public PreviousStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PreviousStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets previousStatus
   */
 @JsonDeserialize(using = PreviousStatusEnumDeserializer.class)
  public enum PreviousStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    INPROGRESS("InProgress"),
    FINISHED("Finished"),
    INREVIEW("InReview"),
    RETRACTED("Retracted");

    private String value;

    PreviousStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PreviousStatusEnum fromString(String key) {
      if (key == null) return null;

      for (PreviousStatusEnum value : PreviousStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PreviousStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PreviousStatusEnum previousStatus = null;
  private Boolean declinedReview = null;
  private EvaluationQualityV2TopicEvaluationReference retractedEvaluation = null;
  private Long rescoreCount = null;
  private Boolean evaluatorCommentHasUpdated = null;
  private Boolean agentCommentHasUpdated = null;
  private Long previousRescoreCount = null;
  private String previousEvaluatorUserId = null;

  public EvaluationQualityV2TopicEvaluationV2() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisionIds = new ArrayList<String>();
      mediaType = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 id(String id) {
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
  public EvaluationQualityV2TopicEvaluationV2 conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 agent(EvaluationQualityV2TopicUser agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public EvaluationQualityV2TopicUser getAgent() {
    return agent;
  }
  public void setAgent(EvaluationQualityV2TopicUser agent) {
    this.agent = agent;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 evaluator(EvaluationQualityV2TopicUser evaluator) {
    this.evaluator = evaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluator")
  public EvaluationQualityV2TopicUser getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(EvaluationQualityV2TopicUser evaluator) {
    this.evaluator = evaluator;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 evaluationFormId(String evaluationFormId) {
    this.evaluationFormId = evaluationFormId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationFormId")
  public String getEvaluationFormId() {
    return evaluationFormId;
  }
  public void setEvaluationFormId(String evaluationFormId) {
    this.evaluationFormId = evaluationFormId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 formName(String formName) {
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
  public EvaluationQualityV2TopicEvaluationV2 scoringSet(EvaluationQualityV2TopicEvaluationScoringSet scoringSet) {
    this.scoringSet = scoringSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoringSet")
  public EvaluationQualityV2TopicEvaluationScoringSet getScoringSet() {
    return scoringSet;
  }
  public void setScoringSet(EvaluationQualityV2TopicEvaluationScoringSet scoringSet) {
    this.scoringSet = scoringSet;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 contextId(String contextId) {
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
  public EvaluationQualityV2TopicEvaluationV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 agentHasRead(Boolean agentHasRead) {
    this.agentHasRead = agentHasRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentHasRead")
  public Boolean getAgentHasRead() {
    return agentHasRead;
  }
  public void setAgentHasRead(Boolean agentHasRead) {
    this.agentHasRead = agentHasRead;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 releaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("releaseDate")
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignedDate")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 changedDate(Date changedDate) {
    this.changedDate = changedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changedDate")
  public Date getChangedDate() {
    return changedDate;
  }
  public void setChangedDate(Date changedDate) {
    this.changedDate = changedDate;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 rescore(Boolean rescore) {
    this.rescore = rescore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rescore")
  public Boolean getRescore() {
    return rescore;
  }
  public void setRescore(Boolean rescore) {
    this.rescore = rescore;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 conversationDate(Date conversationDate) {
    this.conversationDate = conversationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationDate")
  public Date getConversationDate() {
    return conversationDate;
  }
  public void setConversationDate(Date conversationDate) {
    this.conversationDate = conversationDate;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 mediaType(List<String> mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public List<String> getMediaType() {
    return mediaType;
  }
  public void setMediaType(List<String> mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 calibration(EvaluationQualityV2TopicCalibration calibration) {
    this.calibration = calibration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calibration")
  public EvaluationQualityV2TopicCalibration getCalibration() {
    return calibration;
  }
  public void setCalibration(EvaluationQualityV2TopicCalibration calibration) {
    this.calibration = calibration;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 evaluationSource(EvaluationQualityV2TopicEvaluationSource evaluationSource) {
    this.evaluationSource = evaluationSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationSource")
  public EvaluationQualityV2TopicEvaluationSource getEvaluationSource() {
    return evaluationSource;
  }
  public void setEvaluationSource(EvaluationQualityV2TopicEvaluationSource evaluationSource) {
    this.evaluationSource = evaluationSource;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 assigneeUserId(String assigneeUserId) {
    this.assigneeUserId = assigneeUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assigneeUserId")
  public String getAssigneeUserId() {
    return assigneeUserId;
  }
  public void setAssigneeUserId(String assigneeUserId) {
    this.assigneeUserId = assigneeUserId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 previousAssigneeUserId(String previousAssigneeUserId) {
    this.previousAssigneeUserId = previousAssigneeUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousAssigneeUserId")
  public String getPreviousAssigneeUserId() {
    return previousAssigneeUserId;
  }
  public void setPreviousAssigneeUserId(String previousAssigneeUserId) {
    this.previousAssigneeUserId = previousAssigneeUserId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 assigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assigneeApplicable")
  public Boolean getAssigneeApplicable() {
    return assigneeApplicable;
  }
  public void setAssigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 evaluationContextId(String evaluationContextId) {
    this.evaluationContextId = evaluationContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationContextId")
  public String getEvaluationContextId() {
    return evaluationContextId;
  }
  public void setEvaluationContextId(String evaluationContextId) {
    this.evaluationContextId = evaluationContextId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 disputeCount(Long disputeCount) {
    this.disputeCount = disputeCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disputeCount")
  public Long getDisputeCount() {
    return disputeCount;
  }
  public void setDisputeCount(Long disputeCount) {
    this.disputeCount = disputeCount;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 previousStatus(PreviousStatusEnum previousStatus) {
    this.previousStatus = previousStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousStatus")
  public PreviousStatusEnum getPreviousStatus() {
    return previousStatus;
  }
  public void setPreviousStatus(PreviousStatusEnum previousStatus) {
    this.previousStatus = previousStatus;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 declinedReview(Boolean declinedReview) {
    this.declinedReview = declinedReview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("declinedReview")
  public Boolean getDeclinedReview() {
    return declinedReview;
  }
  public void setDeclinedReview(Boolean declinedReview) {
    this.declinedReview = declinedReview;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 retractedEvaluation(EvaluationQualityV2TopicEvaluationReference retractedEvaluation) {
    this.retractedEvaluation = retractedEvaluation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retractedEvaluation")
  public EvaluationQualityV2TopicEvaluationReference getRetractedEvaluation() {
    return retractedEvaluation;
  }
  public void setRetractedEvaluation(EvaluationQualityV2TopicEvaluationReference retractedEvaluation) {
    this.retractedEvaluation = retractedEvaluation;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 rescoreCount(Long rescoreCount) {
    this.rescoreCount = rescoreCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rescoreCount")
  public Long getRescoreCount() {
    return rescoreCount;
  }
  public void setRescoreCount(Long rescoreCount) {
    this.rescoreCount = rescoreCount;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 evaluatorCommentHasUpdated(Boolean evaluatorCommentHasUpdated) {
    this.evaluatorCommentHasUpdated = evaluatorCommentHasUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluatorCommentHasUpdated")
  public Boolean getEvaluatorCommentHasUpdated() {
    return evaluatorCommentHasUpdated;
  }
  public void setEvaluatorCommentHasUpdated(Boolean evaluatorCommentHasUpdated) {
    this.evaluatorCommentHasUpdated = evaluatorCommentHasUpdated;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 agentCommentHasUpdated(Boolean agentCommentHasUpdated) {
    this.agentCommentHasUpdated = agentCommentHasUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentCommentHasUpdated")
  public Boolean getAgentCommentHasUpdated() {
    return agentCommentHasUpdated;
  }
  public void setAgentCommentHasUpdated(Boolean agentCommentHasUpdated) {
    this.agentCommentHasUpdated = agentCommentHasUpdated;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 previousRescoreCount(Long previousRescoreCount) {
    this.previousRescoreCount = previousRescoreCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousRescoreCount")
  public Long getPreviousRescoreCount() {
    return previousRescoreCount;
  }
  public void setPreviousRescoreCount(Long previousRescoreCount) {
    this.previousRescoreCount = previousRescoreCount;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationV2 previousEvaluatorUserId(String previousEvaluatorUserId) {
    this.previousEvaluatorUserId = previousEvaluatorUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousEvaluatorUserId")
  public String getPreviousEvaluatorUserId() {
    return previousEvaluatorUserId;
  }
  public void setPreviousEvaluatorUserId(String previousEvaluatorUserId) {
    this.previousEvaluatorUserId = previousEvaluatorUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationQualityV2TopicEvaluationV2 evaluationQualityV2TopicEvaluationV2 = (EvaluationQualityV2TopicEvaluationV2) o;

    return Objects.equals(this.id, evaluationQualityV2TopicEvaluationV2.id) &&
            Objects.equals(this.conversationId, evaluationQualityV2TopicEvaluationV2.conversationId) &&
            Objects.equals(this.agent, evaluationQualityV2TopicEvaluationV2.agent) &&
            Objects.equals(this.evaluator, evaluationQualityV2TopicEvaluationV2.evaluator) &&
            Objects.equals(this.eventTime, evaluationQualityV2TopicEvaluationV2.eventTime) &&
            Objects.equals(this.evaluationFormId, evaluationQualityV2TopicEvaluationV2.evaluationFormId) &&
            Objects.equals(this.formName, evaluationQualityV2TopicEvaluationV2.formName) &&
            Objects.equals(this.scoringSet, evaluationQualityV2TopicEvaluationV2.scoringSet) &&
            Objects.equals(this.contextId, evaluationQualityV2TopicEvaluationV2.contextId) &&
            Objects.equals(this.status, evaluationQualityV2TopicEvaluationV2.status) &&
            Objects.equals(this.agentHasRead, evaluationQualityV2TopicEvaluationV2.agentHasRead) &&
            Objects.equals(this.releaseDate, evaluationQualityV2TopicEvaluationV2.releaseDate) &&
            Objects.equals(this.assignedDate, evaluationQualityV2TopicEvaluationV2.assignedDate) &&
            Objects.equals(this.changedDate, evaluationQualityV2TopicEvaluationV2.changedDate) &&
            Objects.equals(this.eventType, evaluationQualityV2TopicEvaluationV2.eventType) &&
            Objects.equals(this.resourceId, evaluationQualityV2TopicEvaluationV2.resourceId) &&
            Objects.equals(this.resourceType, evaluationQualityV2TopicEvaluationV2.resourceType) &&
            Objects.equals(this.divisionIds, evaluationQualityV2TopicEvaluationV2.divisionIds) &&
            Objects.equals(this.rescore, evaluationQualityV2TopicEvaluationV2.rescore) &&
            Objects.equals(this.conversationDate, evaluationQualityV2TopicEvaluationV2.conversationDate) &&
            Objects.equals(this.mediaType, evaluationQualityV2TopicEvaluationV2.mediaType) &&
            Objects.equals(this.calibration, evaluationQualityV2TopicEvaluationV2.calibration) &&
            Objects.equals(this.evaluationSource, evaluationQualityV2TopicEvaluationV2.evaluationSource) &&
            Objects.equals(this.assigneeUserId, evaluationQualityV2TopicEvaluationV2.assigneeUserId) &&
            Objects.equals(this.previousAssigneeUserId, evaluationQualityV2TopicEvaluationV2.previousAssigneeUserId) &&
            Objects.equals(this.assigneeApplicable, evaluationQualityV2TopicEvaluationV2.assigneeApplicable) &&
            Objects.equals(this.evaluationContextId, evaluationQualityV2TopicEvaluationV2.evaluationContextId) &&
            Objects.equals(this.disputeCount, evaluationQualityV2TopicEvaluationV2.disputeCount) &&
            Objects.equals(this.version, evaluationQualityV2TopicEvaluationV2.version) &&
            Objects.equals(this.previousStatus, evaluationQualityV2TopicEvaluationV2.previousStatus) &&
            Objects.equals(this.declinedReview, evaluationQualityV2TopicEvaluationV2.declinedReview) &&
            Objects.equals(this.retractedEvaluation, evaluationQualityV2TopicEvaluationV2.retractedEvaluation) &&
            Objects.equals(this.rescoreCount, evaluationQualityV2TopicEvaluationV2.rescoreCount) &&
            Objects.equals(this.evaluatorCommentHasUpdated, evaluationQualityV2TopicEvaluationV2.evaluatorCommentHasUpdated) &&
            Objects.equals(this.agentCommentHasUpdated, evaluationQualityV2TopicEvaluationV2.agentCommentHasUpdated) &&
            Objects.equals(this.previousRescoreCount, evaluationQualityV2TopicEvaluationV2.previousRescoreCount) &&
            Objects.equals(this.previousEvaluatorUserId, evaluationQualityV2TopicEvaluationV2.previousEvaluatorUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, agent, evaluator, eventTime, evaluationFormId, formName, scoringSet, contextId, status, agentHasRead, releaseDate, assignedDate, changedDate, eventType, resourceId, resourceType, divisionIds, rescore, conversationDate, mediaType, calibration, evaluationSource, assigneeUserId, previousAssigneeUserId, assigneeApplicable, evaluationContextId, disputeCount, version, previousStatus, declinedReview, retractedEvaluation, rescoreCount, evaluatorCommentHasUpdated, agentCommentHasUpdated, previousRescoreCount, previousEvaluatorUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQualityV2TopicEvaluationV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    evaluationFormId: ").append(toIndentedString(evaluationFormId)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    scoringSet: ").append(toIndentedString(scoringSet)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agentHasRead: ").append(toIndentedString(agentHasRead)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    rescore: ").append(toIndentedString(rescore)).append("\n");
    sb.append("    conversationDate: ").append(toIndentedString(conversationDate)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    calibration: ").append(toIndentedString(calibration)).append("\n");
    sb.append("    evaluationSource: ").append(toIndentedString(evaluationSource)).append("\n");
    sb.append("    assigneeUserId: ").append(toIndentedString(assigneeUserId)).append("\n");
    sb.append("    previousAssigneeUserId: ").append(toIndentedString(previousAssigneeUserId)).append("\n");
    sb.append("    assigneeApplicable: ").append(toIndentedString(assigneeApplicable)).append("\n");
    sb.append("    evaluationContextId: ").append(toIndentedString(evaluationContextId)).append("\n");
    sb.append("    disputeCount: ").append(toIndentedString(disputeCount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    declinedReview: ").append(toIndentedString(declinedReview)).append("\n");
    sb.append("    retractedEvaluation: ").append(toIndentedString(retractedEvaluation)).append("\n");
    sb.append("    rescoreCount: ").append(toIndentedString(rescoreCount)).append("\n");
    sb.append("    evaluatorCommentHasUpdated: ").append(toIndentedString(evaluatorCommentHasUpdated)).append("\n");
    sb.append("    agentCommentHasUpdated: ").append(toIndentedString(agentCommentHasUpdated)).append("\n");
    sb.append("    previousRescoreCount: ").append(toIndentedString(previousRescoreCount)).append("\n");
    sb.append("    previousEvaluatorUserId: ").append(toIndentedString(previousEvaluatorUserId)).append("\n");
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

