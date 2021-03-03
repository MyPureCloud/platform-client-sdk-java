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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEventTopicConversationRoutingData
 */

public class QueueConversationEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationEventTopicUriReference queue = null;
  private QueueConversationEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationEventTopicUriReference> skills = new ArrayList<QueueConversationEventTopicUriReference>();
  private List<QueueConversationEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationEventTopicConversationRoutingData queue(QueueConversationEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationEventTopicConversationRoutingData language(QueueConversationEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationEventTopicConversationRoutingData priority(Integer priority) {
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
  public QueueConversationEventTopicConversationRoutingData skills(List<QueueConversationEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationEventTopicConversationRoutingData scoredAgents(List<QueueConversationEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationEventTopicConversationRoutingData queueConversationEventTopicConversationRoutingData = (QueueConversationEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicConversationRoutingData {\n");
    
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

