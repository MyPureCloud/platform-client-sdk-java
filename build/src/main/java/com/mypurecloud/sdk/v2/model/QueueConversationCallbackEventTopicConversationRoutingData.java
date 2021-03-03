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
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationCallbackEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCallbackEventTopicConversationRoutingData
 */

public class QueueConversationCallbackEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationCallbackEventTopicUriReference queue = null;
  private QueueConversationCallbackEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationCallbackEventTopicUriReference> skills = new ArrayList<QueueConversationCallbackEventTopicUriReference>();
  private List<QueueConversationCallbackEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationCallbackEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationCallbackEventTopicConversationRoutingData queue(QueueConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCallbackEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCallbackEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicConversationRoutingData language(QueueConversationCallbackEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationCallbackEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationCallbackEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicConversationRoutingData priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicConversationRoutingData skills(List<QueueConversationCallbackEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationCallbackEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationCallbackEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationCallbackEventTopicConversationRoutingData scoredAgents(List<QueueConversationCallbackEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationCallbackEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationCallbackEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallbackEventTopicConversationRoutingData queueConversationCallbackEventTopicConversationRoutingData = (QueueConversationCallbackEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationCallbackEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationCallbackEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationCallbackEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationCallbackEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationCallbackEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicConversationRoutingData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
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

