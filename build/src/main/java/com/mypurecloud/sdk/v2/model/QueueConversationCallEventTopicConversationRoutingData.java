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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicConversationRoutingData
 */

public class QueueConversationCallEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationCallEventTopicUriReference queue = null;
  private QueueConversationCallEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationCallEventTopicUriReference> skills = new ArrayList<QueueConversationCallEventTopicUriReference>();
  private List<QueueConversationCallEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationCallEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationCallEventTopicConversationRoutingData queue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationCallEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationCallEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicConversationRoutingData language(QueueConversationCallEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationCallEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationCallEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicConversationRoutingData priority(Integer priority) {
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
  public QueueConversationCallEventTopicConversationRoutingData skills(List<QueueConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationCallEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationCallEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicConversationRoutingData scoredAgents(List<QueueConversationCallEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationCallEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationCallEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationCallEventTopicConversationRoutingData queueConversationCallEventTopicConversationRoutingData = (QueueConversationCallEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationCallEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationCallEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationCallEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationCallEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationCallEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicConversationRoutingData {\n");
    
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

