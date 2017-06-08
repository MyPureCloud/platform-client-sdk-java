package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Evaluation
 */

public class Evaluation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Conversation conversation = null;
  private EvaluationForm evaluationForm = null;
  private User evaluator = null;
  private User agent = null;
  private Calibration calibration = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FINISHED("FINISHED");

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
  private EvaluationScoringSet answers = null;
  private Boolean agentHasRead = null;
  private Date releaseDate = null;
  private Date assignedDate = null;
  private Date changedDate = null;
  private Queue queue = null;
  private Boolean neverRelease = null;
  private String resourceId = null;

  /**
   * The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.
   */
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
  private Boolean redacted = null;
  private Boolean isScoringIndex = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Evaluation name(String name) {
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
  public Evaluation conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  
  /**
   * Evaluation form used for evaluation.
   **/
  public Evaluation evaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Evaluation form used for evaluation.")
  @JsonProperty("evaluationForm")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  
  /**
   **/
  public Evaluation evaluator(User evaluator) {
    this.evaluator = evaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluator")
  public User getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(User evaluator) {
    this.evaluator = evaluator;
  }

  
  /**
   **/
  public Evaluation agent(User agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public User getAgent() {
    return agent;
  }
  public void setAgent(User agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public Evaluation calibration(Calibration calibration) {
    this.calibration = calibration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calibration")
  public Calibration getCalibration() {
    return calibration;
  }
  public void setCalibration(Calibration calibration) {
    this.calibration = calibration;
  }

  
  /**
   **/
  public Evaluation status(StatusEnum status) {
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
  public Evaluation answers(EvaluationScoringSet answers) {
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
  public Evaluation agentHasRead(Boolean agentHasRead) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Evaluation releaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("releaseDate")
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Evaluation assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("assignedDate")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Evaluation changedDate(Date changedDate) {
    this.changedDate = changedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("changedDate")
  public Date getChangedDate() {
    return changedDate;
  }
  public void setChangedDate(Date changedDate) {
    this.changedDate = changedDate;
  }

  
  /**
   **/
  public Evaluation queue(Queue queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  
  /**
   * Signifies if the evaluation is never to be released. This cannot be set true if release date is also set.
   **/
  public Evaluation neverRelease(Boolean neverRelease) {
    this.neverRelease = neverRelease;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Signifies if the evaluation is never to be released. This cannot be set true if release date is also set.")
  @JsonProperty("neverRelease")
  public Boolean getNeverRelease() {
    return neverRelease;
  }
  public void setNeverRelease(Boolean neverRelease) {
    this.neverRelease = neverRelease;
  }

  
  /**
   * Only used for email evaluations. Will be null for all other evaluations.
   **/
  public Evaluation resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only used for email evaluations. Will be null for all other evaluations.")
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  
  /**
   * The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.
   **/
  public Evaluation resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.")
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }
  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  
  /**
   * Is only true when the user making the request does not have sufficient permissions to see evaluation
   **/
  public Evaluation redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is only true when the user making the request does not have sufficient permissions to see evaluation")
  @JsonProperty("redacted")
  public Boolean getRedacted() {
    return redacted;
  }
  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }

  
  /**
   **/
  public Evaluation isScoringIndex(Boolean isScoringIndex) {
    this.isScoringIndex = isScoringIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isScoringIndex")
  public Boolean getIsScoringIndex() {
    return isScoringIndex;
  }
  public void setIsScoringIndex(Boolean isScoringIndex) {
    this.isScoringIndex = isScoringIndex;
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
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(this.id, evaluation.id) &&
        Objects.equals(this.name, evaluation.name) &&
        Objects.equals(this.conversation, evaluation.conversation) &&
        Objects.equals(this.evaluationForm, evaluation.evaluationForm) &&
        Objects.equals(this.evaluator, evaluation.evaluator) &&
        Objects.equals(this.agent, evaluation.agent) &&
        Objects.equals(this.calibration, evaluation.calibration) &&
        Objects.equals(this.status, evaluation.status) &&
        Objects.equals(this.answers, evaluation.answers) &&
        Objects.equals(this.agentHasRead, evaluation.agentHasRead) &&
        Objects.equals(this.releaseDate, evaluation.releaseDate) &&
        Objects.equals(this.assignedDate, evaluation.assignedDate) &&
        Objects.equals(this.changedDate, evaluation.changedDate) &&
        Objects.equals(this.queue, evaluation.queue) &&
        Objects.equals(this.neverRelease, evaluation.neverRelease) &&
        Objects.equals(this.resourceId, evaluation.resourceId) &&
        Objects.equals(this.resourceType, evaluation.resourceType) &&
        Objects.equals(this.redacted, evaluation.redacted) &&
        Objects.equals(this.isScoringIndex, evaluation.isScoringIndex) &&
        Objects.equals(this.selfUri, evaluation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, evaluationForm, evaluator, agent, calibration, status, answers, agentHasRead, releaseDate, assignedDate, changedDate, queue, neverRelease, resourceId, resourceType, redacted, isScoringIndex, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    calibration: ").append(toIndentedString(calibration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    agentHasRead: ").append(toIndentedString(agentHasRead)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    neverRelease: ").append(toIndentedString(neverRelease)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
    sb.append("    isScoringIndex: ").append(toIndentedString(isScoringIndex)).append("\n");
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

