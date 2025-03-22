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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AiScoring;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.ConversationReference;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponse;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationSource;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationResponse
 */

public class EvaluationResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ConversationReference conversation = null;
  private EvaluationFormResponse evaluationForm = null;
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
  private EvaluationScoringSet answers = null;
  private Boolean agentHasRead = null;
  private User assignee = null;
  private Boolean assigneeApplicable = null;
  private Date releaseDate = null;
  private Date assignedDate = null;
  private Date changedDate = null;
  private Date revisionCreatedDate = null;
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
    INTERNAL_MESSAGE("INTERNAL_MESSAGE"),
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
  private Boolean assigned = null;
  private Date dateAssigneeChanged = null;
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
  private Boolean hasAssistanceFailed = null;
  private EvaluationSource evaluationSource = null;
  private AiScoring aiScoring = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public EvaluationResponse name(String name) {
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
  public EvaluationResponse conversation(ConversationReference conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversation")
  public ConversationReference getConversation() {
    return conversation;
  }
  public void setConversation(ConversationReference conversation) {
    this.conversation = conversation;
  }


  /**
   * Evaluation form used for evaluation.
   **/
  public EvaluationResponse evaluationForm(EvaluationFormResponse evaluationForm) {
    this.evaluationForm = evaluationForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Evaluation form used for evaluation.")
  @JsonProperty("evaluationForm")
  public EvaluationFormResponse getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationFormResponse evaluationForm) {
    this.evaluationForm = evaluationForm;
  }


  /**
   **/
  public EvaluationResponse evaluator(User evaluator) {
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
  public EvaluationResponse agent(User agent) {
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
  public EvaluationResponse calibration(Calibration calibration) {
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
  public EvaluationResponse status(StatusEnum status) {
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
  public EvaluationResponse answers(EvaluationScoringSet answers) {
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
  public EvaluationResponse agentHasRead(Boolean agentHasRead) {
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
  public EvaluationResponse assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignee")
  public User getAssignee() {
    return assignee;
  }
  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }


  /**
   * Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable.
   **/
  public EvaluationResponse assigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable.")
  @JsonProperty("assigneeApplicable")
  public Boolean getAssigneeApplicable() {
    return assigneeApplicable;
  }
  public void setAssigneeApplicable(Boolean assigneeApplicable) {
    this.assigneeApplicable = assigneeApplicable;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationResponse releaseDate(Date releaseDate) {
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
  public EvaluationResponse assignedDate(Date assignedDate) {
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
  public EvaluationResponse changedDate(Date changedDate) {
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
   * Date of when evaluation revision is created. Null if there is no revision. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationResponse revisionCreatedDate(Date revisionCreatedDate) {
    this.revisionCreatedDate = revisionCreatedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of when evaluation revision is created. Null if there is no revision. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("revisionCreatedDate")
  public Date getRevisionCreatedDate() {
    return revisionCreatedDate;
  }
  public void setRevisionCreatedDate(Date revisionCreatedDate) {
    this.revisionCreatedDate = revisionCreatedDate;
  }


  /**
   **/
  public EvaluationResponse queue(Queue queue) {
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
  public EvaluationResponse mediaType(List<MediaTypeEnum> mediaType) {
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
  public EvaluationResponse rescore(Boolean rescore) {
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
  public EvaluationResponse conversationDate(Date conversationDate) {
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
  public EvaluationResponse conversationEndDate(Date conversationEndDate) {
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
  public EvaluationResponse neverRelease(Boolean neverRelease) {
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
   * Set to false to unassign the evaluation. This cannot be set to false when assignee is also set.
   **/
  public EvaluationResponse assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to false to unassign the evaluation. This cannot be set to false when assignee is also set.")
  @JsonProperty("assigned")
  public Boolean getAssigned() {
    return assigned;
  }
  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }


  /**
   * Date when the assignee was last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationResponse dateAssigneeChanged(Date dateAssigneeChanged) {
    this.dateAssigneeChanged = dateAssigneeChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the assignee was last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssigneeChanged")
  public Date getDateAssigneeChanged() {
    return dateAssigneeChanged;
  }
  public void setDateAssigneeChanged(Date dateAssigneeChanged) {
    this.dateAssigneeChanged = dateAssigneeChanged;
  }


  /**
   * Only used for email evaluations. Will be null for all other evaluations.
   **/
  public EvaluationResponse resourceId(String resourceId) {
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
  public EvaluationResponse resourceType(ResourceTypeEnum resourceType) {
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
  public EvaluationResponse redacted(Boolean redacted) {
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
  public EvaluationResponse isScoringIndex(Boolean isScoringIndex) {
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
   * List of user authorized actions on evaluation. Possible values: assign, edit, editScore, editAgentSignoff, delete, release, viewAudit
   **/
  public EvaluationResponse authorizedActions(List<String> authorizedActions) {
    this.authorizedActions = authorizedActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of user authorized actions on evaluation. Possible values: assign, edit, editScore, editAgentSignoff, delete, release, viewAudit")
  @JsonProperty("authorizedActions")
  public List<String> getAuthorizedActions() {
    return authorizedActions;
  }
  public void setAuthorizedActions(List<String> authorizedActions) {
    this.authorizedActions = authorizedActions;
  }


  /**
   * Is true when evaluation assistance didn't execute successfully
   **/
  public EvaluationResponse hasAssistanceFailed(Boolean hasAssistanceFailed) {
    this.hasAssistanceFailed = hasAssistanceFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is true when evaluation assistance didn't execute successfully")
  @JsonProperty("hasAssistanceFailed")
  public Boolean getHasAssistanceFailed() {
    return hasAssistanceFailed;
  }
  public void setHasAssistanceFailed(Boolean hasAssistanceFailed) {
    this.hasAssistanceFailed = hasAssistanceFailed;
  }


  @ApiModelProperty(example = "null", value = "The source that created the evaluation.")
  @JsonProperty("evaluationSource")
  public EvaluationSource getEvaluationSource() {
    return evaluationSource;
  }


  @ApiModelProperty(example = "null", value = "AI scoring details for the evaluation.")
  @JsonProperty("aiScoring")
  public AiScoring getAiScoring() {
    return aiScoring;
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
    EvaluationResponse evaluationResponse = (EvaluationResponse) o;

    return Objects.equals(this.id, evaluationResponse.id) &&
            Objects.equals(this.name, evaluationResponse.name) &&
            Objects.equals(this.conversation, evaluationResponse.conversation) &&
            Objects.equals(this.evaluationForm, evaluationResponse.evaluationForm) &&
            Objects.equals(this.evaluator, evaluationResponse.evaluator) &&
            Objects.equals(this.agent, evaluationResponse.agent) &&
            Objects.equals(this.calibration, evaluationResponse.calibration) &&
            Objects.equals(this.status, evaluationResponse.status) &&
            Objects.equals(this.answers, evaluationResponse.answers) &&
            Objects.equals(this.agentHasRead, evaluationResponse.agentHasRead) &&
            Objects.equals(this.assignee, evaluationResponse.assignee) &&
            Objects.equals(this.assigneeApplicable, evaluationResponse.assigneeApplicable) &&
            Objects.equals(this.releaseDate, evaluationResponse.releaseDate) &&
            Objects.equals(this.assignedDate, evaluationResponse.assignedDate) &&
            Objects.equals(this.changedDate, evaluationResponse.changedDate) &&
            Objects.equals(this.revisionCreatedDate, evaluationResponse.revisionCreatedDate) &&
            Objects.equals(this.queue, evaluationResponse.queue) &&
            Objects.equals(this.mediaType, evaluationResponse.mediaType) &&
            Objects.equals(this.rescore, evaluationResponse.rescore) &&
            Objects.equals(this.conversationDate, evaluationResponse.conversationDate) &&
            Objects.equals(this.conversationEndDate, evaluationResponse.conversationEndDate) &&
            Objects.equals(this.neverRelease, evaluationResponse.neverRelease) &&
            Objects.equals(this.assigned, evaluationResponse.assigned) &&
            Objects.equals(this.dateAssigneeChanged, evaluationResponse.dateAssigneeChanged) &&
            Objects.equals(this.resourceId, evaluationResponse.resourceId) &&
            Objects.equals(this.resourceType, evaluationResponse.resourceType) &&
            Objects.equals(this.redacted, evaluationResponse.redacted) &&
            Objects.equals(this.isScoringIndex, evaluationResponse.isScoringIndex) &&
            Objects.equals(this.authorizedActions, evaluationResponse.authorizedActions) &&
            Objects.equals(this.hasAssistanceFailed, evaluationResponse.hasAssistanceFailed) &&
            Objects.equals(this.evaluationSource, evaluationResponse.evaluationSource) &&
            Objects.equals(this.aiScoring, evaluationResponse.aiScoring) &&
            Objects.equals(this.selfUri, evaluationResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, evaluationForm, evaluator, agent, calibration, status, answers, agentHasRead, assignee, assigneeApplicable, releaseDate, assignedDate, changedDate, revisionCreatedDate, queue, mediaType, rescore, conversationDate, conversationEndDate, neverRelease, assigned, dateAssigneeChanged, resourceId, resourceType, redacted, isScoringIndex, authorizedActions, hasAssistanceFailed, evaluationSource, aiScoring, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationResponse {\n");
    
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
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeApplicable: ").append(toIndentedString(assigneeApplicable)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    revisionCreatedDate: ").append(toIndentedString(revisionCreatedDate)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    rescore: ").append(toIndentedString(rescore)).append("\n");
    sb.append("    conversationDate: ").append(toIndentedString(conversationDate)).append("\n");
    sb.append("    conversationEndDate: ").append(toIndentedString(conversationEndDate)).append("\n");
    sb.append("    neverRelease: ").append(toIndentedString(neverRelease)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    dateAssigneeChanged: ").append(toIndentedString(dateAssigneeChanged)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
    sb.append("    isScoringIndex: ").append(toIndentedString(isScoringIndex)).append("\n");
    sb.append("    authorizedActions: ").append(toIndentedString(authorizedActions)).append("\n");
    sb.append("    hasAssistanceFailed: ").append(toIndentedString(hasAssistanceFailed)).append("\n");
    sb.append("    evaluationSource: ").append(toIndentedString(evaluationSource)).append("\n");
    sb.append("    aiScoring: ").append(toIndentedString(aiScoring)).append("\n");
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

