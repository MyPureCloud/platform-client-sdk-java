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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    CALL("CALL"),
    CALLBACK("CALLBACK"),
    CHAT("CHAT"),
    COBROWSE("COBROWSE"),
    EMAIL("EMAIL"),
    MESSAGE("MESSAGE"),
    SOCIAL_EXPRESSION("SOCIAL_EXPRESSION"),
    VIDEO("VIDEO"),
    SCREENSHARE("SCREENSHARE");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypeEnum> mediaType = new ArrayList<MediaTypeEnum>();
  private Boolean rescore = null;
  private Date conversationDate = null;
  private Date conversationEndDate = null;
  private Boolean neverRelease = null;
  private String resourceId = null;

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
   * The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources.
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
  private Boolean redacted = null;
  private Boolean isScoringIndex = null;
  private List<String> authorizedActions = new ArrayList<String>();
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Evaluation releaseDate(Date releaseDate) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Evaluation assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("assignedDate")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Evaluation changedDate(Date changedDate) {
    this.changedDate = changedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
   * List of different communication types used in conversation.
   **/
  public Evaluation mediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of different communication types used in conversation.")
  @JsonProperty("mediaType")
  public List<MediaTypeEnum> getMediaType() {
    return mediaType;
  }
  public void setMediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * Is only true when evaluation is re-scored.
   **/
  public Evaluation rescore(Boolean rescore) {
    this.rescore = rescore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is only true when evaluation is re-scored.")
  @JsonProperty("rescore")
  public Boolean getRescore() {
    return rescore;
  }
  public void setRescore(Boolean rescore) {
    this.rescore = rescore;
  }

  
  /**
   * Date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Evaluation conversationDate(Date conversationDate) {
    this.conversationDate = conversationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationDate")
  public Date getConversationDate() {
    return conversationDate;
  }
  public void setConversationDate(Date conversationDate) {
    this.conversationDate = conversationDate;
  }

  
  /**
   * End date of conversation if it had completed before evaluation creation. Null if created before the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Evaluation conversationEndDate(Date conversationEndDate) {
    this.conversationEndDate = conversationEndDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End date of conversation if it had completed before evaluation creation. Null if created before the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationEndDate")
  public Date getConversationEndDate() {
    return conversationEndDate;
  }
  public void setConversationEndDate(Date conversationEndDate) {
    this.conversationEndDate = conversationEndDate;
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

  
  /**
   * List of user authorized actions on evaluation. Possible values: edit, editScore, editAgentSignoff, delete, viewAudit
   **/
  public Evaluation authorizedActions(List<String> authorizedActions) {
    this.authorizedActions = authorizedActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of user authorized actions on evaluation. Possible values: edit, editScore, editAgentSignoff, delete, viewAudit")
  @JsonProperty("authorizedActions")
  public List<String> getAuthorizedActions() {
    return authorizedActions;
  }
  public void setAuthorizedActions(List<String> authorizedActions) {
    this.authorizedActions = authorizedActions;
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
        Objects.equals(this.mediaType, evaluation.mediaType) &&
        Objects.equals(this.rescore, evaluation.rescore) &&
        Objects.equals(this.conversationDate, evaluation.conversationDate) &&
        Objects.equals(this.conversationEndDate, evaluation.conversationEndDate) &&
        Objects.equals(this.neverRelease, evaluation.neverRelease) &&
        Objects.equals(this.resourceId, evaluation.resourceId) &&
        Objects.equals(this.resourceType, evaluation.resourceType) &&
        Objects.equals(this.redacted, evaluation.redacted) &&
        Objects.equals(this.isScoringIndex, evaluation.isScoringIndex) &&
        Objects.equals(this.authorizedActions, evaluation.authorizedActions) &&
        Objects.equals(this.selfUri, evaluation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, evaluationForm, evaluator, agent, calibration, status, answers, agentHasRead, releaseDate, assignedDate, changedDate, queue, mediaType, rescore, conversationDate, conversationEndDate, neverRelease, resourceId, resourceType, redacted, isScoringIndex, authorizedActions, selfUri);
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
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    rescore: ").append(toIndentedString(rescore)).append("\n");
    sb.append("    conversationDate: ").append(toIndentedString(conversationDate)).append("\n");
    sb.append("    conversationEndDate: ").append(toIndentedString(conversationEndDate)).append("\n");
    sb.append("    neverRelease: ").append(toIndentedString(neverRelease)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
    sb.append("    isScoringIndex: ").append(toIndentedString(isScoringIndex)).append("\n");
    sb.append("    authorizedActions: ").append(toIndentedString(authorizedActions)).append("\n");
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

