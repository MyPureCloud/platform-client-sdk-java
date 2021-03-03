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
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.QueueReference;
import com.mypurecloud.sdk.v2.model.SurveyErrorDetails;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Survey
 */

public class Survey  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Conversation conversation = null;
  private SurveyForm surveyForm = null;
  private DomainEntityRef agent = null;

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
    SENT("Sent"),
    INPROGRESS("InProgress"),
    FINISHED("Finished"),
    OPTOUT("OptOut"),
    ERROR("Error"),
    EXPIRED("Expired");

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
  private QueueReference queue = null;
  private SurveyScoringSet answers = null;
  private Date completedDate = null;
  private SurveyErrorDetails surveyErrorDetails = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Survey name(String name) {
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
  public Survey conversation(Conversation conversation) {
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
   * Survey form used for this survey.
   **/
  public Survey surveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Survey form used for this survey.")
  @JsonProperty("surveyForm")
  public SurveyForm getSurveyForm() {
    return surveyForm;
  }
  public void setSurveyForm(SurveyForm surveyForm) {
    this.surveyForm = surveyForm;
  }

  
  /**
   **/
  public Survey agent(DomainEntityRef agent) {
    this.agent = agent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agent")
  public DomainEntityRef getAgent() {
    return agent;
  }
  public void setAgent(DomainEntityRef agent) {
    this.agent = agent;
  }

  
  /**
   **/
  public Survey status(StatusEnum status) {
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
  public Survey queue(QueueReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueReference getQueue() {
    return queue;
  }
  public void setQueue(QueueReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public Survey answers(SurveyScoringSet answers) {
    this.answers = answers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answers")
  public SurveyScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(SurveyScoringSet answers) {
    this.answers = answers;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Survey completedDate(Date completedDate) {
    this.completedDate = completedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("completedDate")
  public Date getCompletedDate() {
    return completedDate;
  }
  public void setCompletedDate(Date completedDate) {
    this.completedDate = completedDate;
  }

  
  /**
   * Additional information about what happened when the survey is in Error status.
   **/
  public Survey surveyErrorDetails(SurveyErrorDetails surveyErrorDetails) {
    this.surveyErrorDetails = surveyErrorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about what happened when the survey is in Error status.")
  @JsonProperty("surveyErrorDetails")
  public SurveyErrorDetails getSurveyErrorDetails() {
    return surveyErrorDetails;
  }
  public void setSurveyErrorDetails(SurveyErrorDetails surveyErrorDetails) {
    this.surveyErrorDetails = surveyErrorDetails;
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
    Survey survey = (Survey) o;
    return Objects.equals(this.id, survey.id) &&
        Objects.equals(this.name, survey.name) &&
        Objects.equals(this.conversation, survey.conversation) &&
        Objects.equals(this.surveyForm, survey.surveyForm) &&
        Objects.equals(this.agent, survey.agent) &&
        Objects.equals(this.status, survey.status) &&
        Objects.equals(this.queue, survey.queue) &&
        Objects.equals(this.answers, survey.answers) &&
        Objects.equals(this.completedDate, survey.completedDate) &&
        Objects.equals(this.surveyErrorDetails, survey.surveyErrorDetails) &&
        Objects.equals(this.selfUri, survey.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversation, surveyForm, agent, status, queue, answers, completedDate, surveyErrorDetails, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    surveyForm: ").append(toIndentedString(surveyForm)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    surveyErrorDetails: ").append(toIndentedString(surveyErrorDetails)).append("\n");
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

