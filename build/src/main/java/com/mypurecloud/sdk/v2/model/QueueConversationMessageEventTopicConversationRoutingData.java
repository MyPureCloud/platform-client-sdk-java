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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicScoredAgent;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicConversationRoutingData
 */

public class QueueConversationMessageEventTopicConversationRoutingData  implements Serializable {
  
  private QueueConversationMessageEventTopicUriReference queue = null;
  private QueueConversationMessageEventTopicUriReference language = null;
  private Integer priority = null;
  private List<QueueConversationMessageEventTopicUriReference> skills = new ArrayList<QueueConversationMessageEventTopicUriReference>();
  private List<QueueConversationMessageEventTopicScoredAgent> scoredAgents = new ArrayList<QueueConversationMessageEventTopicScoredAgent>();

  
  /**
   **/
  public QueueConversationMessageEventTopicConversationRoutingData queue(QueueConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public QueueConversationMessageEventTopicUriReference getQueue() {
    return queue;
  }
  public void setQueue(QueueConversationMessageEventTopicUriReference queue) {
    this.queue = queue;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicConversationRoutingData language(QueueConversationMessageEventTopicUriReference language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public QueueConversationMessageEventTopicUriReference getLanguage() {
    return language;
  }
  public void setLanguage(QueueConversationMessageEventTopicUriReference language) {
    this.language = language;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicConversationRoutingData priority(Integer priority) {
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
  public QueueConversationMessageEventTopicConversationRoutingData skills(List<QueueConversationMessageEventTopicUriReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skills")
  public List<QueueConversationMessageEventTopicUriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<QueueConversationMessageEventTopicUriReference> skills) {
    this.skills = skills;
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicConversationRoutingData scoredAgents(List<QueueConversationMessageEventTopicScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scoredAgents")
  public List<QueueConversationMessageEventTopicScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<QueueConversationMessageEventTopicScoredAgent> scoredAgents) {
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
    QueueConversationMessageEventTopicConversationRoutingData queueConversationMessageEventTopicConversationRoutingData = (QueueConversationMessageEventTopicConversationRoutingData) o;
    return Objects.equals(this.queue, queueConversationMessageEventTopicConversationRoutingData.queue) &&
        Objects.equals(this.language, queueConversationMessageEventTopicConversationRoutingData.language) &&
        Objects.equals(this.priority, queueConversationMessageEventTopicConversationRoutingData.priority) &&
        Objects.equals(this.skills, queueConversationMessageEventTopicConversationRoutingData.skills) &&
        Objects.equals(this.scoredAgents, queueConversationMessageEventTopicConversationRoutingData.scoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, language, priority, skills, scoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicConversationRoutingData {\n");
    
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

