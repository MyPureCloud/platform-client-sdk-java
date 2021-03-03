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
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Calibration
 */

public class Calibration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User calibrator = null;
  private User agent = null;
  private Conversation conversation = null;
  private EvaluationForm evaluationForm = null;
  private String contextId = null;
  private Integer averageScore = null;
  private Integer highScore = null;
  private Integer lowScore = null;
  private Date createdDate = null;
  private List<Evaluation> evaluations = new ArrayList<Evaluation>();
  private List<User> evaluators = new ArrayList<User>();
  private Evaluation scoringIndex = null;
  private User expertEvaluator = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Calibration name(String name) {
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
  public Calibration calibrator(User calibrator) {
    this.calibrator = calibrator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calibrator")
  public User getCalibrator() {
    return calibrator;
  }
  public void setCalibrator(User calibrator) {
    this.calibrator = calibrator;
  }

  
  /**
   **/
  public Calibration agent(User agent) {
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
  public Calibration conversation(Conversation conversation) {
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
   **/
  public Calibration evaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationForm")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  
  /**
   **/
  public Calibration contextId(String contextId) {
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
  public Calibration averageScore(Integer averageScore) {
    this.averageScore = averageScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("averageScore")
  public Integer getAverageScore() {
    return averageScore;
  }
  public void setAverageScore(Integer averageScore) {
    this.averageScore = averageScore;
  }

  
  /**
   **/
  public Calibration highScore(Integer highScore) {
    this.highScore = highScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("highScore")
  public Integer getHighScore() {
    return highScore;
  }
  public void setHighScore(Integer highScore) {
    this.highScore = highScore;
  }

  
  /**
   **/
  public Calibration lowScore(Integer lowScore) {
    this.lowScore = lowScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowScore")
  public Integer getLowScore() {
    return lowScore;
  }
  public void setLowScore(Integer lowScore) {
    this.lowScore = lowScore;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Calibration createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public Calibration evaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluations")
  public List<Evaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
  }

  
  /**
   **/
  public Calibration evaluators(List<User> evaluators) {
    this.evaluators = evaluators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluators")
  public List<User> getEvaluators() {
    return evaluators;
  }
  public void setEvaluators(List<User> evaluators) {
    this.evaluators = evaluators;
  }

  
  /**
   **/
  public Calibration scoringIndex(Evaluation scoringIndex) {
    this.scoringIndex = scoringIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoringIndex")
  public Evaluation getScoringIndex() {
    return scoringIndex;
  }
  public void setScoringIndex(Evaluation scoringIndex) {
    this.scoringIndex = scoringIndex;
  }

  
  /**
   **/
  public Calibration expertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expertEvaluator")
  public User getExpertEvaluator() {
    return expertEvaluator;
  }
  public void setExpertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
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
    Calibration calibration = (Calibration) o;
    return Objects.equals(this.id, calibration.id) &&
        Objects.equals(this.name, calibration.name) &&
        Objects.equals(this.calibrator, calibration.calibrator) &&
        Objects.equals(this.agent, calibration.agent) &&
        Objects.equals(this.conversation, calibration.conversation) &&
        Objects.equals(this.evaluationForm, calibration.evaluationForm) &&
        Objects.equals(this.contextId, calibration.contextId) &&
        Objects.equals(this.averageScore, calibration.averageScore) &&
        Objects.equals(this.highScore, calibration.highScore) &&
        Objects.equals(this.lowScore, calibration.lowScore) &&
        Objects.equals(this.createdDate, calibration.createdDate) &&
        Objects.equals(this.evaluations, calibration.evaluations) &&
        Objects.equals(this.evaluators, calibration.evaluators) &&
        Objects.equals(this.scoringIndex, calibration.scoringIndex) &&
        Objects.equals(this.expertEvaluator, calibration.expertEvaluator) &&
        Objects.equals(this.selfUri, calibration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, calibrator, agent, conversation, evaluationForm, contextId, averageScore, highScore, lowScore, createdDate, evaluations, evaluators, scoringIndex, expertEvaluator, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calibration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calibrator: ").append(toIndentedString(calibrator)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    highScore: ").append(toIndentedString(highScore)).append("\n");
    sb.append("    lowScore: ").append(toIndentedString(lowScore)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    scoringIndex: ").append(toIndentedString(scoringIndex)).append("\n");
    sb.append("    expertEvaluator: ").append(toIndentedString(expertEvaluator)).append("\n");
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

