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
import com.mypurecloud.sdk.v2.model.QueueConversationChatEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationChatEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationChatEventTopicConversationRoutingData
 */

public class QueueConversationChatEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationChatEventTopicUriReference queue = null;
  private QueueConversationChatEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationChatEventTopicUriReference> skills = new ArrayList<QueueConversationChatEventTopicUriReference>();
  private List<QueueConversationChatEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationChatEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationChatEventTopicConversationRoutingData queue(QueueConversationChatEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationChatEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationChatEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationChatEventTopicConversationRoutingData language(QueueConversationChatEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationChatEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationChatEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationChatEventTopicConversationRoutingData priority(Integer priority) {
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
  public QueueConversationChatEventTopicConversationRoutingData skills(List<QueueConversationChatEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationChatEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationChatEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationChatEventTopicConversationRoutingData scoredAgents(List<QueueConversationChatEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationChatEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationChatEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationChatEventTopicConversationRoutingData queueConversationChatEventTopicConversationRoutingData = (QueueConversationChatEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationChatEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationChatEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationChatEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationChatEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationChatEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationChatEventTopicConversationRoutingData {\n");
    
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

