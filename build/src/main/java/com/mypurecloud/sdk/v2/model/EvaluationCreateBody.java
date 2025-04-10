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
import com.mypurecloud.sdk.v2.model.EvaluationCreateCalibration;
import com.mypurecloud.sdk.v2.model.EvaluationCreateConversation;
import com.mypurecloud.sdk.v2.model.EvaluationCreateEvalForm;
import com.mypurecloud.sdk.v2.model.EvaluationCreateQueue;
import com.mypurecloud.sdk.v2.model.EvaluationCreateUser;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EvaluationCreateBody
 */

public class EvaluationCreateBody  implements Serializable {
  
  private String id = null;
  private EvaluationCreateEvalForm evaluationForm = null;
  private EvaluationCreateUser evaluator = null;
  private EvaluationCreateUser agent = null;
  private Boolean agentHasRead = null;
  private EvaluationScoringSet answers = null;
  private EvaluationCreateCalibration calibration = null;
  private String evaluationContextId = null;
  private EvaluationCreateConversation conversation = null;

  private static class ResourceTypeEnumDeserializer extends StdDeserializer<ResourceTypeEnum> {
    public ResourceTypeEnumDeserializer() {
      super(ResourceTypeEnumDeserializer.class);
    }

    @Override
    public ResourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets resourceType
   */
 @JsonDeserialize(using = ResourceTypeEnumDeserializer.class)
  public enum ResourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("EMAIL");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ResourceTypeEnum value : ResourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResourceTypeEnum resourceType = null;
  private EvaluationSource evaluationSource = null;
  private Boolean rescore = null;
  private EvaluationCreateQueue queue = null;
  private Date releaseDate = null;

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
    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FINISHED("FINISHED"),
    INREVIEW("INREVIEW"),
    RETRACTED("RETRACTED");

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
  private Boolean neverRelease = null;
  private Date dateAssigneeChanged = null;
  private EvaluationCreateUser assignee = null;
  private String selfUri = null;

  public EvaluationCreateBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Evaluation form used for evaluation (must be included for a successful request)
   **/
  public EvaluationCreateBody evaluationForm(EvaluationCreateEvalForm evaluationForm) {
    this.evaluationForm = evaluationForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Evaluation form used for evaluation (must be included for a successful request)")
  @JsonProperty("evaluationForm")
  public EvaluationCreateEvalForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationCreateEvalForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }


  /**
   * User ID of the evaluator (must be included for a successful request)
   **/
  public EvaluationCreateBody evaluator(EvaluationCreateUser evaluator) {
    this.evaluator = evaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the evaluator (must be included for a successful request)")
  @JsonProperty("evaluator")
  public EvaluationCreateUser getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(EvaluationCreateUser evaluator) {
    this.evaluator = evaluator;
  }


  /**
   * User ID of the agent (must be included for a successful request)
   **/
  public EvaluationCreateBody agent(EvaluationCreateUser agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the agent (must be included for a successful request)")
  @JsonProperty("agent")
  public EvaluationCreateUser getAgent() {
    return agent;
  }
  public void setAgent(EvaluationCreateUser agent) {
    this.agent = agent;
  }


  /**
   **/
  public EvaluationCreateBody agentHasRead(Boolean agentHasRead) {
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
  public EvaluationCreateBody answers(EvaluationScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answers")
  public EvaluationScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(EvaluationScoringSet answers) {
    this.answers = answers;
  }


  /**
   **/
  public EvaluationCreateBody calibration(EvaluationCreateCalibration calibration) {
    this.calibration = calibration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calibration")
  public EvaluationCreateCalibration getCalibration() {
    return calibration;
  }
  public void setCalibration(EvaluationCreateCalibration calibration) {
    this.calibration = calibration;
  }


  /**
   **/
  public EvaluationCreateBody evaluationContextId(String evaluationContextId) {
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
  public EvaluationCreateBody conversation(EvaluationCreateConversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public EvaluationCreateConversation getConversation() {
    return conversation;
  }
  public void setConversation(EvaluationCreateConversation conversation) {
    this.conversation = conversation;
  }


  /**
   **/
  public EvaluationCreateBody resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }
  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  /**
   **/
  public EvaluationCreateBody evaluationSource(EvaluationSource evaluationSource) {
    this.evaluationSource = evaluationSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationSource")
  public EvaluationSource getEvaluationSource() {
    return evaluationSource;
  }
  public void setEvaluationSource(EvaluationSource evaluationSource) {
    this.evaluationSource = evaluationSource;
  }


  /**
   **/
  public EvaluationCreateBody rescore(Boolean rescore) {
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
  public EvaluationCreateBody queue(EvaluationCreateQueue queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public EvaluationCreateQueue getQueue() {
    return queue;
  }
  public void setQueue(EvaluationCreateQueue queue) {
    this.queue = queue;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationCreateBody releaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("releaseDate")
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }


  /**
   **/
  public EvaluationCreateBody status(StatusEnum status) {
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
  public EvaluationCreateBody neverRelease(Boolean neverRelease) {
    this.neverRelease = neverRelease;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("neverRelease")
  public Boolean getNeverRelease() {
    return neverRelease;
  }
  public void setNeverRelease(Boolean neverRelease) {
    this.neverRelease = neverRelease;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationCreateBody dateAssigneeChanged(Date dateAssigneeChanged) {
    this.dateAssigneeChanged = dateAssigneeChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssigneeChanged")
  public Date getDateAssigneeChanged() {
    return dateAssigneeChanged;
  }
  public void setDateAssigneeChanged(Date dateAssigneeChanged) {
    this.dateAssigneeChanged = dateAssigneeChanged;
  }


  /**
   **/
  public EvaluationCreateBody assignee(EvaluationCreateUser assignee) {
    this.assignee = assignee;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignee")
  public EvaluationCreateUser getAssignee() {
    return assignee;
  }
  public void setAssignee(EvaluationCreateUser assignee) {
    this.assignee = assignee;
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
    EvaluationCreateBody evaluationCreateBody = (EvaluationCreateBody) o;

    return Objects.equals(this.id, evaluationCreateBody.id) &&
            Objects.equals(this.evaluationForm, evaluationCreateBody.evaluationForm) &&
            Objects.equals(this.evaluator, evaluationCreateBody.evaluator) &&
            Objects.equals(this.agent, evaluationCreateBody.agent) &&
            Objects.equals(this.agentHasRead, evaluationCreateBody.agentHasRead) &&
            Objects.equals(this.answers, evaluationCreateBody.answers) &&
            Objects.equals(this.calibration, evaluationCreateBody.calibration) &&
            Objects.equals(this.evaluationContextId, evaluationCreateBody.evaluationContextId) &&
            Objects.equals(this.conversation, evaluationCreateBody.conversation) &&
            Objects.equals(this.resourceType, evaluationCreateBody.resourceType) &&
            Objects.equals(this.evaluationSource, evaluationCreateBody.evaluationSource) &&
            Objects.equals(this.rescore, evaluationCreateBody.rescore) &&
            Objects.equals(this.queue, evaluationCreateBody.queue) &&
            Objects.equals(this.releaseDate, evaluationCreateBody.releaseDate) &&
            Objects.equals(this.status, evaluationCreateBody.status) &&
            Objects.equals(this.neverRelease, evaluationCreateBody.neverRelease) &&
            Objects.equals(this.dateAssigneeChanged, evaluationCreateBody.dateAssigneeChanged) &&
            Objects.equals(this.assignee, evaluationCreateBody.assignee) &&
            Objects.equals(this.selfUri, evaluationCreateBody.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, evaluationForm, evaluator, agent, agentHasRead, answers, calibration, evaluationContextId, conversation, resourceType, evaluationSource, rescore, queue, releaseDate, status, neverRelease, dateAssigneeChanged, assignee, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationCreateBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    agentHasRead: ").append(toIndentedString(agentHasRead)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    calibration: ").append(toIndentedString(calibration)).append("\n");
    sb.append("    evaluationContextId: ").append(toIndentedString(evaluationContextId)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    evaluationSource: ").append(toIndentedString(evaluationSource)).append("\n");
    sb.append("    rescore: ").append(toIndentedString(rescore)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    neverRelease: ").append(toIndentedString(neverRelease)).append("\n");
    sb.append("    dateAssigneeChanged: ").append(toIndentedString(dateAssigneeChanged)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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

