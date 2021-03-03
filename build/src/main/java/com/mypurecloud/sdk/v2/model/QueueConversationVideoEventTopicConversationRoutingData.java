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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicConversationRoutingData
 */

public class QueueConversationVideoEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationVideoEventTopicUriReference queue = null;
  private QueueConversationVideoEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationVideoEventTopicUriReference> skills = new ArrayList<QueueConversationVideoEventTopicUriReference>();
  private List<QueueConversationVideoEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationVideoEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationVideoEventTopicConversationRoutingData queue(QueueConversationVideoEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationVideoEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationVideoEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicConversationRoutingData language(QueueConversationVideoEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationVideoEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationVideoEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicConversationRoutingData priority(Integer priority) {
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
  public QueueConversationVideoEventTopicConversationRoutingData skills(List<QueueConversationVideoEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationVideoEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationVideoEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicConversationRoutingData scoredAgents(List<QueueConversationVideoEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationVideoEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationVideoEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationVideoEventTopicConversationRoutingData queueConversationVideoEventTopicConversationRoutingData = (QueueConversationVideoEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationVideoEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationVideoEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationVideoEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationVideoEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationVideoEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicConversationRoutingData {\n");
    
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

